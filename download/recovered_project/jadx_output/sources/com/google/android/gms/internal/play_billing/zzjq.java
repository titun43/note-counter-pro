package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzjq {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzjp zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z4;
        zzjp zzjpVar;
        boolean z5;
        Field zzB;
        zzjp zzjpVar2;
        Unsafe zzg2 = zzg();
        zzc = zzg2;
        int i5 = zzfy.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zzv = zzv(cls);
        zze = zzv;
        Class cls2 = Integer.TYPE;
        boolean zzv2 = zzv(cls2);
        zzjp zzjpVar3 = null;
        if (zzg2 != null) {
            if (zzv) {
                zzjpVar3 = new zzjo(zzg2);
            } else if (zzv2) {
                zzjpVar3 = new zzjn(zzg2);
            }
        }
        zzf = zzjpVar3;
        if (zzjpVar3 != null) {
            try {
                Class<?> cls3 = zzjpVar3.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                zzh(th);
            }
            if (zzB() != null) {
                z4 = true;
                zzg = z4;
                zzjpVar = zzf;
                if (zzjpVar != null) {
                    try {
                        Class<?> cls4 = zzjpVar.zza.getClass();
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
                        zzh(th2);
                    }
                    zzh = z5;
                    zza = zzz(byte[].class);
                    zzz(boolean[].class);
                    zzA(boolean[].class);
                    zzz(int[].class);
                    zzA(int[].class);
                    zzz(long[].class);
                    zzA(long[].class);
                    zzz(float[].class);
                    zzA(float[].class);
                    zzz(double[].class);
                    zzA(double[].class);
                    zzz(Object[].class);
                    zzA(Object[].class);
                    zzB = zzB();
                    if (zzB != null && (zzjpVar2 = zzf) != null) {
                        zzjpVar2.zza.objectFieldOffset(zzB);
                    }
                    zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z5 = false;
                zzh = z5;
                zza = zzz(byte[].class);
                zzz(boolean[].class);
                zzA(boolean[].class);
                zzz(int[].class);
                zzA(int[].class);
                zzz(long[].class);
                zzA(long[].class);
                zzz(float[].class);
                zzA(float[].class);
                zzz(double[].class);
                zzA(double[].class);
                zzz(Object[].class);
                zzA(Object[].class);
                zzB = zzB();
                if (zzB != null) {
                    zzjpVar2.zza.objectFieldOffset(zzB);
                }
                zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z4 = false;
        zzg = z4;
        zzjpVar = zzf;
        if (zzjpVar != null) {
        }
        z5 = false;
        zzh = z5;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        zzB = zzB();
        if (zzB != null) {
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzjq() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i5 = zzfy.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j2, byte b2) {
        zzjp zzjpVar = zzf;
        long j5 = (-4) & j2;
        int i5 = zzjpVar.zza.getInt(obj, j5);
        int i6 = ((~((int) j2)) & 3) << 3;
        zzjpVar.zza.putInt(obj, j5, ((255 & b2) << i6) | (i5 & (~(255 << i6))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j2, byte b2) {
        zzjp zzjpVar = zzf;
        long j5 = (-4) & j2;
        int i5 = (((int) j2) & 3) << 3;
        zzjpVar.zza.putInt(obj, j5, ((255 & b2) << i5) | (zzjpVar.zza.getInt(obj, j5) & (~(255 << i5))));
    }

    public static double zza(Object obj, long j2) {
        return zzf.zza(obj, j2);
    }

    public static float zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    public static int zzc(Object obj, long j2) {
        return zzf.zza.getInt(obj, j2);
    }

    public static long zzd(Object obj, long j2) {
        return zzf.zza.getLong(obj, j2);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static Object zzf(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzjm());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzjq.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzm(Object obj, long j2, boolean z4) {
        zzf.zzc(obj, j2, z4);
    }

    public static void zzn(byte[] bArr, long j2, byte b2) {
        zzf.zzd(bArr, zza + j2, b2);
    }

    public static void zzo(Object obj, long j2, double d5) {
        zzf.zze(obj, j2, d5);
    }

    public static void zzp(Object obj, long j2, float f5) {
        zzf.zzf(obj, j2, f5);
    }

    public static void zzq(Object obj, long j2, int i5) {
        zzf.zza.putInt(obj, j2, i5);
    }

    public static void zzr(Object obj, long j2, long j5) {
        zzf.zza.putLong(obj, j2, j5);
    }

    public static void zzs(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzv(Class cls) {
        int i5 = zzfy.zza;
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

    public static boolean zzw(Object obj, long j2) {
        return zzf.zzg(obj, j2);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
