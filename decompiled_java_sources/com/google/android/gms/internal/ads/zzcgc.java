package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes.dex */
public final class zzcgc extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzcga {
    private static final float[] zza = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final zzcgb zzb;
    private final float[] zzc;
    private final float[] zzd;
    private final float[] zze;
    private final float[] zzf;
    private final float[] zzg;
    private final float[] zzh;
    private final float[] zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private SurfaceTexture zzo;
    private SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final FloatBuffer zzt;
    private final CountDownLatch zzu;
    private final Object zzv;
    private EGL10 zzw;
    private EGLDisplay zzx;
    private EGLContext zzy;
    private EGLSurface zzz;

    public zzcgc(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = zza;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzt = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.zzc = new float[9];
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzf = new float[9];
        this.zzg = new float[9];
        this.zzh = new float[9];
        this.zzi = new float[9];
        this.zzj = Float.NaN;
        zzcgb zzcgbVar = new zzcgb(context);
        this.zzb = zzcgbVar;
        zzcgbVar.zzc(this);
        this.zzu = new CountDownLatch(1);
        this.zzv = new Object();
    }

    private static final void zzh(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 10 + String.valueOf(glGetError).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    private static final void zzi(float[] fArr, float[] fArr2, float[] fArr3) {
        float f5 = fArr2[0] * fArr3[0];
        float f6 = fArr2[1];
        float f7 = fArr3[3];
        float f8 = fArr2[2];
        float f9 = fArr3[6];
        fArr[0] = f5 + (f6 * f7) + (f8 * f9);
        float f10 = fArr2[0];
        float f11 = fArr3[1] * f10;
        float f12 = fArr3[4];
        float f13 = fArr3[7];
        fArr[1] = f11 + (f6 * f12) + (f8 * f13);
        float f14 = f10 * fArr3[2];
        float f15 = fArr2[1];
        float f16 = fArr3[5];
        float f17 = fArr3[8];
        fArr[2] = f14 + (f15 * f16) + (f8 * f17);
        float f18 = fArr2[3];
        float f19 = fArr3[0];
        float f20 = fArr2[4];
        float f21 = fArr2[5];
        fArr[3] = (f18 * f19) + (f7 * f20) + (f21 * f9);
        float f22 = fArr2[3];
        float f23 = fArr3[1];
        fArr[4] = (f22 * f23) + (f20 * f12) + (f21 * f13);
        float f24 = fArr3[2];
        fArr[5] = (f22 * f24) + (fArr2[4] * f16) + (f21 * f17);
        float f25 = fArr2[6] * f19;
        float f26 = fArr2[7];
        float f27 = fArr3[3] * f26;
        float f28 = fArr2[8];
        fArr[6] = f25 + f27 + (f9 * f28);
        float f29 = fArr2[6];
        float f30 = f13 * f28;
        fArr[7] = f30 + (f26 * fArr3[4]) + (f23 * f29);
        fArr[8] = (f29 * f24) + (fArr2[7] * fArr3[5]) + (f28 * f17);
    }

    private static final void zzj(float[] fArr, float f5) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d5 = f5;
        fArr[4] = (float) Math.cos(d5);
        fArr[5] = (float) (-Math.sin(d5));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d5);
        fArr[8] = (float) Math.cos(d5);
    }

    private static final void zzk(float[] fArr, float f5) {
        double d5 = f5;
        fArr[0] = (float) Math.cos(d5);
        fArr[1] = (float) (-Math.sin(d5));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d5);
        fArr[4] = (float) Math.cos(d5);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int zzl(int i5, String str) {
        int glCreateShader = GLES20.glCreateShader(i5);
        zzh("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            zzh("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            zzh("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzh("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 26);
                sb.append("Could not compile shader ");
                sb.append(i5);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                zzh("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzs++;
        Object obj = this.zzv;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a8  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z4;
        int zzl;
        int glCreateProgram;
        if (this.zzp == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("SphericalVideoProcessor started with no output texture.");
            this.zzu.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.zzw = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.zzx = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY && this.zzw.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.zzw.eglChooseConfig(this.zzx, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig != null) {
                EGL10 egl102 = this.zzw;
                EGLDisplay eGLDisplay = this.zzx;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.zzy = eglCreateContext;
                if (eglCreateContext != null && eglCreateContext != eGLContext) {
                    EGLSurface eglCreateWindowSurface = this.zzw.eglCreateWindowSurface(this.zzx, eGLConfig, this.zzp, null);
                    this.zzz = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.zzw.eglMakeCurrent(this.zzx, eglCreateWindowSurface, eglCreateWindowSurface, this.zzy)) {
                        z4 = true;
                        zzbgv zzbgvVar = zzbhe.zzbQ;
                        zzl = zzl(35633, ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).equals(zzbgvVar.zzf()) ? (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                        if (zzl != 0) {
                            zzbgv zzbgvVar2 = zzbhe.zzbR;
                            int zzl2 = zzl(35632, !((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar2)).equals(zzbgvVar2.zzf()) ? (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                            if (zzl2 != 0) {
                                glCreateProgram = GLES20.glCreateProgram();
                                zzh("createProgram");
                                if (glCreateProgram != 0) {
                                    GLES20.glAttachShader(glCreateProgram, zzl);
                                    zzh("attachShader");
                                    GLES20.glAttachShader(glCreateProgram, zzl2);
                                    zzh("attachShader");
                                    GLES20.glLinkProgram(glCreateProgram);
                                    zzh("linkProgram");
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                    zzh("getProgramiv");
                                    if (iArr2[0] != 1) {
                                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                                        GLES20.glDeleteProgram(glCreateProgram);
                                        zzh("deleteProgram");
                                    } else {
                                        GLES20.glValidateProgram(glCreateProgram);
                                        zzh("validateProgram");
                                    }
                                }
                                this.zzq = glCreateProgram;
                                GLES20.glUseProgram(glCreateProgram);
                                zzh("useProgram");
                                int glGetAttribLocation = GLES20.glGetAttribLocation(this.zzq, "aPosition");
                                GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.zzt);
                                zzh("vertexAttribPointer");
                                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                zzh("enableVertexAttribArray");
                                int[] iArr3 = new int[1];
                                GLES20.glGenTextures(1, iArr3, 0);
                                zzh("genTextures");
                                int i6 = iArr3[0];
                                GLES20.glBindTexture(36197, i6);
                                zzh("bindTextures");
                                GLES20.glTexParameteri(36197, 10240, 9729);
                                zzh("texParameteri");
                                GLES20.glTexParameteri(36197, 10241, 9729);
                                zzh("texParameteri");
                                GLES20.glTexParameteri(36197, 10242, 33071);
                                zzh("texParameteri");
                                GLES20.glTexParameteri(36197, 10243, 33071);
                                zzh("texParameteri");
                                int glGetUniformLocation = GLES20.glGetUniformLocation(this.zzq, "uVMat");
                                this.zzr = glGetUniformLocation;
                                GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                int i7 = this.zzq;
                                if (z4 || i7 == 0) {
                                    String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.zzw.eglGetError()));
                                    int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                                    String concat = "EGL initialization failed: ".concat(valueOf);
                                    com.google.android.gms.ads.internal.util.client.zzo.zzf(concat);
                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new Throwable(concat), "SphericalVideoProcessor.run.1");
                                    zzg();
                                    this.zzu.countDown();
                                }
                                SurfaceTexture surfaceTexture = new SurfaceTexture(i6);
                                this.zzo = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                this.zzu.countDown();
                                zzcgb zzcgbVar = this.zzb;
                                zzcgbVar.zza();
                                try {
                                    try {
                                        try {
                                            this.zzA = true;
                                            while (!this.zzB) {
                                                while (this.zzs > 0) {
                                                    this.zzo.updateTexImage();
                                                    this.zzs--;
                                                }
                                                float[] fArr = this.zzc;
                                                if (zzcgbVar.zze(fArr)) {
                                                    if (Float.isNaN(this.zzj)) {
                                                        float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                                        float f5 = fArr[0];
                                                        float f6 = fArr2[0];
                                                        float f7 = fArr[1];
                                                        float f8 = fArr2[1];
                                                        float[] fArr3 = {(fArr[2] * 0.0f) + (f7 * f8) + (f5 * f6), (fArr[5] * 0.0f) + (fArr[4] * f8) + (fArr[3] * f6), (fArr[8] * 0.0f) + (fArr[7] * f8) + (fArr[6] * f6)};
                                                        this.zzj = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                    }
                                                    zzk(this.zzh, this.zzj + this.zzk);
                                                } else {
                                                    zzj(fArr, -1.5707964f);
                                                    zzk(this.zzh, this.zzk);
                                                }
                                                float[] fArr4 = this.zzd;
                                                zzj(fArr4, 1.5707964f);
                                                float[] fArr5 = this.zze;
                                                zzi(fArr5, this.zzh, fArr4);
                                                float[] fArr6 = this.zzf;
                                                zzi(fArr6, fArr, fArr5);
                                                float[] fArr7 = this.zzg;
                                                zzj(fArr7, this.zzl);
                                                float[] fArr8 = this.zzi;
                                                zzi(fArr8, fArr7, fArr6);
                                                GLES20.glUniformMatrix3fv(this.zzr, 1, false, fArr8, 0);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                zzh("drawArrays");
                                                GLES20.glFinish();
                                                this.zzw.eglSwapBuffers(this.zzx, this.zzz);
                                                if (this.zzA) {
                                                    GLES20.glViewport(0, 0, this.zzn, this.zzm);
                                                    zzh("viewport");
                                                    int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.zzq, "uFOVx");
                                                    int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.zzq, "uFOVy");
                                                    int i9 = this.zzn;
                                                    int i10 = this.zzm;
                                                    if (i9 > i10) {
                                                        GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                        GLES20.glUniform1f(glGetUniformLocation3, (this.zzm * 0.87266463f) / this.zzn);
                                                    } else {
                                                        GLES20.glUniform1f(glGetUniformLocation2, (i9 * 0.87266463f) / i10);
                                                        GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                    }
                                                    this.zzA = false;
                                                }
                                                try {
                                                    Object obj = this.zzv;
                                                    synchronized (obj) {
                                                        try {
                                                            if (!this.zzB && !this.zzA && this.zzs == 0) {
                                                                obj.wait();
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                } catch (InterruptedException unused) {
                                                }
                                            }
                                        } catch (IllegalStateException unused2) {
                                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("SphericalVideoProcessor halted unexpectedly.");
                                        }
                                    } catch (Throwable th2) {
                                        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzg("SphericalVideoProcessor died.", th2);
                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "SphericalVideoProcessor.run.2");
                                    }
                                    this.zzb.zzb();
                                    this.zzo.setOnFrameAvailableListener(null);
                                    this.zzo = null;
                                    zzg();
                                    return;
                                } catch (Throwable th3) {
                                    this.zzb.zzb();
                                    this.zzo.setOnFrameAvailableListener(null);
                                    this.zzo = null;
                                    zzg();
                                    throw th3;
                                }
                            }
                        }
                        glCreateProgram = 0;
                        this.zzq = glCreateProgram;
                        GLES20.glUseProgram(glCreateProgram);
                        zzh("useProgram");
                        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.zzq, "aPosition");
                        GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.zzt);
                        zzh("vertexAttribPointer");
                        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                        zzh("enableVertexAttribArray");
                        int[] iArr32 = new int[1];
                        GLES20.glGenTextures(1, iArr32, 0);
                        zzh("genTextures");
                        int i62 = iArr32[0];
                        GLES20.glBindTexture(36197, i62);
                        zzh("bindTextures");
                        GLES20.glTexParameteri(36197, 10240, 9729);
                        zzh("texParameteri");
                        GLES20.glTexParameteri(36197, 10241, 9729);
                        zzh("texParameteri");
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        zzh("texParameteri");
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        zzh("texParameteri");
                        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.zzq, "uVMat");
                        this.zzr = glGetUniformLocation4;
                        GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                        int i72 = this.zzq;
                        if (z4) {
                        }
                        String valueOf2 = String.valueOf(GLUtils.getEGLErrorString(this.zzw.eglGetError()));
                        int i82 = com.google.android.gms.ads.internal.util.zze.zza;
                        String concat2 = "EGL initialization failed: ".concat(valueOf2);
                        com.google.android.gms.ads.internal.util.client.zzo.zzf(concat2);
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(new Throwable(concat2), "SphericalVideoProcessor.run.1");
                        zzg();
                        this.zzu.countDown();
                    }
                }
            }
        }
        z4 = false;
        zzbgv zzbgvVar3 = zzbhe.zzbQ;
        zzl = zzl(35633, ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar3)).equals(zzbgvVar3.zzf()) ? (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (zzl != 0) {
        }
        glCreateProgram = 0;
        this.zzq = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        zzh("useProgram");
        int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.zzq, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.zzt);
        zzh("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        zzh("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        GLES20.glGenTextures(1, iArr322, 0);
        zzh("genTextures");
        int i622 = iArr322[0];
        GLES20.glBindTexture(36197, i622);
        zzh("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        zzh("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        zzh("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        zzh("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        zzh("texParameteri");
        int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.zzq, "uVMat");
        this.zzr = glGetUniformLocation42;
        GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i722 = this.zzq;
        if (z4) {
        }
        String valueOf22 = String.valueOf(GLUtils.getEGLErrorString(this.zzw.eglGetError()));
        int i822 = com.google.android.gms.ads.internal.util.zze.zza;
        String concat22 = "EGL initialization failed: ".concat(valueOf22);
        com.google.android.gms.ads.internal.util.client.zzo.zzf(concat22);
        com.google.android.gms.ads.internal.zzt.zzh().zzg(new Throwable(concat22), "SphericalVideoProcessor.run.1");
        zzg();
        this.zzu.countDown();
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zza() {
        Object obj = this.zzv;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void zzb(SurfaceTexture surfaceTexture, int i5, int i6) {
        this.zzn = i5;
        this.zzm = i6;
        this.zzp = surfaceTexture;
    }

    public final void zzc(int i5, int i6) {
        Object obj = this.zzv;
        synchronized (obj) {
            this.zzn = i5;
            this.zzm = i6;
            this.zzA = true;
            obj.notifyAll();
        }
    }

    public final void zzd() {
        Object obj = this.zzv;
        synchronized (obj) {
            this.zzB = true;
            this.zzp = null;
            obj.notifyAll();
        }
    }

    public final SurfaceTexture zze() {
        if (this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        } catch (InterruptedException unused) {
        }
        return this.zzo;
    }

    public final void zzf(float f5, float f6) {
        int i5 = this.zzn;
        int i6 = this.zzm;
        if (i5 <= i6) {
            i5 = i6;
        }
        float f7 = i5;
        this.zzk -= (f5 * 1.7453293f) / f7;
        float f8 = this.zzl - ((f6 * 1.7453293f) / f7);
        this.zzl = f8;
        if (f8 < -1.5707964f) {
            this.zzl = -1.5707964f;
            f8 = -1.5707964f;
        }
        if (f8 > 1.5707964f) {
            this.zzl = 1.5707964f;
        }
    }

    public final boolean zzg() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.zzz;
        boolean z4 = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z4 = this.zzw.eglDestroySurface(this.zzx, this.zzz) | this.zzw.eglMakeCurrent(this.zzx, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.zzz = null;
        }
        EGLContext eGLContext = this.zzy;
        if (eGLContext != null) {
            z4 |= this.zzw.eglDestroyContext(this.zzx, eGLContext);
            this.zzy = null;
        }
        EGLDisplay eGLDisplay = this.zzx;
        if (eGLDisplay == null) {
            return z4;
        }
        boolean eglTerminate = this.zzw.eglTerminate(eGLDisplay) | z4;
        this.zzx = null;
        return eglTerminate;
    }
}
