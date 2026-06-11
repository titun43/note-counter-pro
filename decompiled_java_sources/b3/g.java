package b3;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.WebView;
import androidx.emoji2.text.u;
import com.google.android.gms.common.internal.b0;
import f0.x0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import k.n2;
import r3.m;
import r3.n;
import r3.o;
import r3.s;
import r3.v;
import r3.w;
import r3.y;

/* loaded from: classes.dex */
public abstract class g implements x0, i0.g {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f729a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f730b;

    public g() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader A() {
        ClassLoader classLoader;
        SecurityException e4;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (g.class) {
            if (f729a == null) {
                Thread thread2 = f730b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i5 = 0;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i6];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i6++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i5 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i5];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i5++;
                                    }
                                    if (thread == null) {
                                        try {
                                            f fVar = new f(threadGroup, "GmsDynamite");
                                            try {
                                                fVar.setContextClassLoader(null);
                                                fVar.start();
                                                thread = fVar;
                                            } catch (SecurityException e5) {
                                                e4 = e5;
                                                thread = fVar;
                                                String message = e4.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39);
                                                sb.append("Failed to enumerate thread/threadgroup ");
                                                sb.append(message);
                                                Log.w("DynamiteLoaderV2CL", sb.toString());
                                                thread2 = thread;
                                                f730b = thread2;
                                            }
                                        } catch (SecurityException e6) {
                                            e4 = e6;
                                        }
                                    }
                                } finally {
                                }
                            } catch (SecurityException e7) {
                                e4 = e7;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    f730b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = f730b.getContextClassLoader();
                    } catch (SecurityException e8) {
                        String message2 = e8.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message2);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                f729a = classLoader2;
            }
            classLoader = f729a;
        }
        return classLoader;
    }

    public static void d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static int e(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, u.f.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r0.createNewFile() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        throw new r3.s(null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(String str, r3.a aVar, boolean z4) {
        g4.i.e(str, "fullPath");
        g4.i.e(aVar, "options");
        try {
            File file = new File(str);
            if (file.exists()) {
                throw new r3.l(str);
            }
            boolean z5 = aVar.f3164a;
            File parentFile = file.getParentFile();
            if (parentFile == null || !(parentFile.exists() || (z5 && parentFile.mkdirs()))) {
                throw new m("Missing parent directories - either recursive=false was received or parent directory creation failed", null);
            }
            if (z4 && !file.mkdir()) {
                throw new s(null);
            }
            return t3.h.f3400a;
        } catch (Throwable th) {
            return g(th);
        }
    }

    public static final t3.d g(Throwable th) {
        g4.i.e(th, "exception");
        return new t3.d(th);
    }

    public static com.google.android.gms.common.api.internal.l m(Looper looper, Object obj, String str) {
        b0.h(obj, "Listener must not be null");
        b0.h(looper, "Looper must not be null");
        b0.h(str, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.l(looper, obj, str);
    }

    public static void n(String str, String str2, Object obj) {
        String v5 = v(str);
        if (Log.isLoggable(v5, 3)) {
            Log.d(v5, String.format(str2, obj));
        }
    }

    public static final Object o(String str, r3.b bVar) {
        boolean delete;
        g4.i.e(str, "fullPath");
        g4.i.e(bVar, "options");
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new o(str, null);
            }
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0 && !bVar.f3168a) {
                    throw new n("Received recursive=false but directory is not-empty", null);
                }
                d4.h hVar = new d4.h(new d4.j(file, d4.k.h, null));
                loop0: while (true) {
                    delete = true;
                    while (hVar.hasNext()) {
                        File file2 = (File) hVar.next();
                        if ((file2.delete() || !file2.exists()) && delete) {
                            break;
                        }
                        delete = false;
                    }
                }
            } else {
                delete = file.delete();
            }
            if (delete) {
                return t3.h.f3400a;
            }
            throw new s(null);
        } catch (Throwable th) {
            return g(th);
        }
    }

    public static void p(String str, String str2, Exception exc) {
        String v5 = v(str);
        if (Log.isLoggable(v5, 6)) {
            Log.e(v5, str2, exc);
        }
    }

    public static final boolean q(char c5, char c6, boolean z4) {
        if (c5 == c6) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static InvocationHandler r() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static Drawable t(Context context, int i5) {
        return n2.b().c(context, i5);
    }

    public static final y u(File file) {
        a.a wVar;
        Long l5;
        Path path;
        BasicFileAttributes readAttributes;
        FileTime creationTime;
        long millis;
        FileTime lastAccessTime;
        long millis2;
        g4.i.e(file, "fileObject");
        String absolutePath = file.getAbsolutePath();
        String name = file.getName();
        long length = file.length();
        Uri fromFile = Uri.fromFile(file);
        if (file.isDirectory()) {
            wVar = v.f3194m;
        } else {
            String D = d4.l.D(file);
            if (n4.i.X(D)) {
                D = file.getPath();
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D);
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = g4.i.a(D, "3ga") ? "audio/3gpp" : g4.i.a(D, "js") ? "text/javascript" : "application/octet-binary";
            }
            wVar = new w(mimeTypeFromExtension);
        }
        a.a aVar = wVar;
        if (Build.VERSION.SDK_INT > 26) {
            path = file.toPath();
            readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) g0.b.j(), new LinkOption[0]);
            creationTime = readAttributes.creationTime();
            millis = creationTime.toMillis();
            lastAccessTime = readAttributes.lastAccessTime();
            millis2 = lastAccessTime.toMillis();
            l5 = Long.valueOf(Math.min(millis, millis2));
        } else {
            l5 = null;
        }
        Long l6 = l5;
        long lastModified = file.lastModified();
        g4.i.b(absolutePath);
        g4.i.b(name);
        g4.i.b(fromFile);
        return new y(absolutePath, name, fromFile, length, aVar, l6, lastModified);
    }

    public static String v(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static m0.b w(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i5 = duplicate.getShort() & 65535;
        if (i5 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                j2 = -1;
                break;
            }
            int i7 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i7) {
                break;
            }
            i6++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j5 = duplicate.getInt() & 4294967295L;
            for (int i8 = 0; i8 < j5; i8++) {
                int i9 = duplicate.getInt();
                long j6 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i9 || 1701669481 == i9) {
                    duplicate.position((int) (j6 + j2));
                    m0.b bVar = new m0.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f1377d = duplicate;
                    bVar.f1374a = position;
                    int i10 = position - duplicate.getInt(position);
                    bVar.f1375b = i10;
                    bVar.f1376c = ((ByteBuffer) bVar.f1377d).getShort(i10);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void x(Object obj) {
        if (obj instanceof t3.d) {
            throw ((t3.d) obj).f3395g;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [u3.o] */
    public static final d4.b y(File file) {
        int length;
        List list;
        ?? arrayList;
        int W;
        String path = file.getPath();
        g4.i.b(path);
        char c5 = File.separatorChar;
        int W2 = n4.i.W(path, c5, 0, 4);
        if (W2 != 0) {
            length = (W2 <= 0 || path.charAt(W2 + (-1)) != ':') ? (W2 == -1 && path.length() > 0 && q(path.charAt(n4.i.T(path)), ':', false)) ? path.length() : 0 : W2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c5 || (W = n4.i.W(path, c5, 2, 4)) < 0) {
            length = 1;
        } else {
            int W3 = n4.i.W(path, c5, W + 1, 4);
            length = W3 >= 0 ? W3 + 1 : path.length();
        }
        String substring = path.substring(0, length);
        g4.i.d(substring, "substring(...)");
        String substring2 = path.substring(length);
        g4.i.d(substring2, "substring(...)");
        if (substring2.length() == 0) {
            arrayList = u3.o.f3547g;
        } else {
            String valueOf = String.valueOf(new char[]{c5}[0]);
            int U = n4.i.U(substring2, valueOf, 0, false);
            if (U != -1) {
                ArrayList arrayList2 = new ArrayList(10);
                int i5 = 0;
                do {
                    arrayList2.add(substring2.subSequence(i5, U).toString());
                    i5 = valueOf.length() + U;
                    U = n4.i.U(substring2, valueOf, i5, false);
                } while (U != -1);
                arrayList2.add(substring2.subSequence(i5, substring2.length()).toString());
                list = arrayList2;
            } else {
                list = y4.b.y(substring2.toString());
            }
            arrayList = new ArrayList(u3.i.T(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
        }
        return new d4.b(new File(substring), arrayList);
    }

    public static final void z(int i5, int i6) {
        if (i5 < 0) {
            throw new IllegalArgumentException(u.h(i5, "offset must be >= 0, but was ").toString());
        }
        if (i6 <= 0) {
            throw new IllegalArgumentException(u.h(i6, "length must be > 0, but was ").toString());
        }
    }

    public abstract Typeface h(Context context, x.e eVar, Resources resources, int i5);

    public abstract Typeface i(Context context, c0.k[] kVarArr, int i5);

    public Typeface j(Context context, List list, int i5) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface k(Context context, InputStream inputStream) {
        File w = y4.b.w(context);
        if (w == null) {
            return null;
        }
        try {
            if (y4.b.j(w, inputStream)) {
                return Typeface.createFromFile(w.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            w.delete();
        }
    }

    public Typeface l(Context context, Resources resources, int i5, String str, int i6) {
        File w = y4.b.w(context);
        if (w == null) {
            return null;
        }
        try {
            if (y4.b.i(w, resources, i5)) {
                return Typeface.createFromFile(w.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            w.delete();
        }
    }

    public c0.k s(c0.k[] kVarArr, int i5) {
        new t2.i(28);
        int i6 = (i5 & 1) == 0 ? 400 : 700;
        boolean z4 = (i5 & 2) != 0;
        c0.k kVar = null;
        int i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (c0.k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f767c - i6) * 2) + (kVar2.f768d == z4 ? 0 : 1);
            if (kVar == null || i7 > abs) {
                kVar = kVar2;
                i7 = abs;
            }
        }
        return kVar;
    }

    @Override // f0.x0
    public void a() {
    }

    @Override // f0.x0
    public void b() {
    }
}
