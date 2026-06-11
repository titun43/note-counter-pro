package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zziem {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zziel zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z4;
        zziel zzielVar;
        boolean z5;
        Field zzD;
        long j2;
        zziel zzielVar2;
        Unsafe zzs = zzs();
        zzc = zzs;
        int i5 = zziaa.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zzt = zzt(cls);
        zze = zzt;
        Class cls2 = Integer.TYPE;
        boolean zzt2 = zzt(cls2);
        zziel zzielVar3 = null;
        if (zzs != null) {
            if (zzt) {
                zzielVar3 = new zziek(zzs);
            } else if (zzt2) {
                zzielVar3 = new zziej(zzs);
            }
        }
        zzf = zzielVar3;
        if (zzielVar3 != null) {
            try {
                Class<?> cls3 = zzielVar3.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                zzA(th);
            }
            if (zzD() != null) {
                z4 = true;
                zzg = z4;
                zzielVar = zzf;
                if (zzielVar != null) {
                    try {
                        Class<?> cls4 = zzielVar.zza.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z5 = true;
                    } catch (Throwable th2) {
                        zzA(th2);
                    }
                    zzh = z5;
                    zza = zzB(byte[].class);
                    zzB(boolean[].class);
                    zzC(boolean[].class);
                    zzB(int[].class);
                    zzC(int[].class);
                    zzB(long[].class);
                    zzC(long[].class);
                    zzB(float[].class);
                    zzC(float[].class);
                    zzB(double[].class);
                    zzC(double[].class);
                    zzB(Object[].class);
                    zzC(Object[].class);
                    zzD = zzD();
                    j2 = -1;
                    if (zzD != null && (zzielVar2 = zzf) != null) {
                        j2 = zzielVar2.zza.objectFieldOffset(zzD);
                    }
                    zzi = j2;
                    zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z5 = false;
                zzh = z5;
                zza = zzB(byte[].class);
                zzB(boolean[].class);
                zzC(boolean[].class);
                zzB(int[].class);
                zzC(int[].class);
                zzB(long[].class);
                zzC(long[].class);
                zzB(float[].class);
                zzC(float[].class);
                zzB(double[].class);
                zzC(double[].class);
                zzB(Object[].class);
                zzC(Object[].class);
                zzD = zzD();
                j2 = -1;
                if (zzD != null) {
                    j2 = zzielVar2.zza.objectFieldOffset(zzD);
                }
                zzi = j2;
                zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z4 = false;
        zzg = z4;
        zzielVar = zzf;
        if (zzielVar != null) {
        }
        z5 = false;
        zzh = z5;
        zza = zzB(byte[].class);
        zzB(boolean[].class);
        zzC(boolean[].class);
        zzB(int[].class);
        zzC(int[].class);
        zzB(long[].class);
        zzC(long[].class);
        zzB(float[].class);
        zzC(float[].class);
        zzB(double[].class);
        zzC(double[].class);
        zzB(Object[].class);
        zzC(Object[].class);
        zzD = zzD();
        j2 = -1;
        if (zzD != null) {
        }
        zzi = j2;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zziem() {
    }

    public static /* synthetic */ void zzA(Throwable th) {
        Logger.getLogger(zziem.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzB(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzD() {
        int i5 = zziaa.zza;
        Field zzE = zzE(Buffer.class, "effectiveDirectAddress");
        if (zzE != null) {
            return zzE;
        }
        Field zzE2 = zzE(Buffer.class, "address");
        if (zzE2 == null || zzE2.getType() != Long.TYPE) {
            return null;
        }
        return zzE2;
    }

    private static Field zzE(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzF(Object obj, long j2, byte b2) {
        Unsafe unsafe = zzf.zza;
        long j5 = (-4) & j2;
        int i5 = unsafe.getInt(obj, j5);
        int i6 = ((~((int) j2)) & 3) << 3;
        unsafe.putInt(obj, j5, ((255 & b2) << i6) | (i5 & (~(255 << i6))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j2, byte b2) {
        Unsafe unsafe = zzf.zza;
        long j5 = (-4) & j2;
        int i5 = (((int) j2) & 3) << 3;
        unsafe.putInt(obj, j5, ((255 & b2) << i5) | (unsafe.getInt(obj, j5) & (~(255 << i5))));
    }

    public static boolean zza() {
        return zzh;
    }

    public static boolean zzb() {
        return zzg;
    }

    public static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int zzd(Object obj, long j2) {
        return zzf.zza.getInt(obj, j2);
    }

    public static void zze(Object obj, long j2, int i5) {
        zzf.zza.putInt(obj, j2, i5);
    }

    public static long zzf(Object obj, long j2) {
        return zzf.zza.getLong(obj, j2);
    }

    public static void zzg(Object obj, long j2, long j5) {
        zzf.zza.putLong(obj, j2, j5);
    }

    public static boolean zzh(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    public static void zzi(Object obj, long j2, boolean z4) {
        zzf.zzc(obj, j2, z4);
    }

    public static float zzj(Object obj, long j2) {
        return zzf.zzd(obj, j2);
    }

    public static void zzk(Object obj, long j2, float f5) {
        zzf.zze(obj, j2, f5);
    }

    public static double zzl(Object obj, long j2) {
        return zzf.zzf(obj, j2);
    }

    public static void zzm(Object obj, long j2, double d5) {
        zzf.zzg(obj, j2, d5);
    }

    public static Object zzn(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    public static void zzo(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }

    public static void zzp(byte[] bArr, long j2, byte b2) {
        zzf.zza(bArr, zza + j2, b2);
    }

    public static byte zzq(long j2) {
        return zzf.zzh(j2);
    }

    public static long zzr(ByteBuffer byteBuffer) {
        zziel zzielVar = zzf;
        return zzielVar.zza.getLong(byteBuffer, zzi);
    }

    public static Unsafe zzs() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zziei());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzt(Class cls) {
        int i5 = zziaa.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean zzw(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzx(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }
}
