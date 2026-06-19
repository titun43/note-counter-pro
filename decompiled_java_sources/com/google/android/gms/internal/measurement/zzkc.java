package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjy;
import com.google.android.gms.internal.measurement.zzkc;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzkc<MessageType extends zzkc<MessageType, BuilderType>, BuilderType extends zzjy<MessageType, BuilderType>> extends zzil<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected zzmm zzc = zzmm.zzc();
    protected int zzd = -1;

    public static zzkc zzbC(Class cls) {
        Map map = zza;
        zzkc zzkcVar = (zzkc) map.get(cls);
        if (zzkcVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzkcVar = (zzkc) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (zzkcVar != null) {
            return zzkcVar;
        }
        zzkc zzkcVar2 = (zzkc) ((zzkc) zzmv.zze(cls)).zzl(6, null, null);
        if (zzkcVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzkcVar2);
        return zzkcVar2;
    }

    public static zzkh zzbD() {
        return zzkd.zzf();
    }

    public static zzki zzbE() {
        return zzky.zzf();
    }

    public static zzki zzbF(zzki zzkiVar) {
        int size = zzkiVar.size();
        return zzkiVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzkj zzbG() {
        return zzls.zze();
    }

    public static zzkj zzbH(zzkj zzkjVar) {
        int size = zzkjVar.size();
        return zzkjVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzbK(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzbL(zzlj zzljVar, String str, Object[] objArr) {
        return new zzlt(zzljVar, str, objArr);
    }

    public static void zzbM(Class cls, zzkc zzkcVar) {
        zza.put(cls, zzkcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlr.zza().zzb(getClass()).zzj(this, (zzkc) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzb;
        if (i5 != 0) {
            return i5;
        }
        int zzb = zzlr.zza().zzb(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    public final String toString() {
        return zzll.zza(this, super.toString());
    }

    public final zzjy zzbA() {
        return (zzjy) zzl(5, null, null);
    }

    public final zzjy zzbB() {
        zzjy zzjyVar = (zzjy) zzl(5, null, null);
        zzjyVar.zzaC(this);
        return zzjyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final /* synthetic */ zzli zzbI() {
        return (zzjy) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final /* synthetic */ zzli zzbJ() {
        zzjy zzjyVar = (zzjy) zzl(5, null, null);
        zzjyVar.zzaC(this);
        return zzjyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zzbN(zzjj zzjjVar) {
        zzlr.zza().zzb(getClass()).zzi(this, zzjk.zza(zzjjVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final /* synthetic */ zzlj zzbR() {
        return (zzkc) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final int zzbu() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzbx(int i5) {
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final int zzbz() {
        int i5 = this.zzd;
        if (i5 != -1) {
            return i5;
        }
        int zza2 = zzlr.zza().zzb(getClass()).zza(this);
        this.zzd = zza2;
        return zza2;
    }

    public abstract Object zzl(int i5, Object obj, Object obj2);
}
