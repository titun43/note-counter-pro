package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.consent_sdk.zzqj;
import com.google.android.gms.internal.consent_sdk.zzqm;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzqm<MessageType extends zzqm<MessageType, BuilderType>, BuilderType extends zzqj<MessageType, BuilderType>> extends zzpa<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzsq zzc = zzsq.zzc();

    private final int zza(zzsa zzsaVar) {
        return zzrx.zza().zzb(getClass()).zza(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzc(zzqm zzqmVar, boolean z4) {
        byte byteValue = ((Byte) zzqmVar.zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzh = zzrx.zza().zzb(zzqmVar.getClass()).zzh(zzqmVar);
        if (z4) {
            zzqmVar.zzb(2, true != zzh ? null : zzqmVar, null);
        }
        return zzh;
    }

    public static zzqm zzq(Class cls) {
        Map map = zzb;
        zzqm zzqmVar = (zzqm) map.get(cls);
        if (zzqmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzqmVar = (zzqm) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (zzqmVar != null) {
            return zzqmVar;
        }
        zzqm zzqmVar2 = (zzqm) ((zzqm) zzsw.zze(cls)).zzb(6, null, null);
        if (zzqmVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzqmVar2);
        return zzqmVar2;
    }

    public static zzqq zzs() {
        return zzqn.zzf();
    }

    public static zzqr zzt() {
        return zzry.zze();
    }

    public static Object zzv(Method method, Object obj, Object... objArr) {
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

    public static Object zzw(zzrq zzrqVar, String str, Object[] objArr) {
        return new zzrz(zzrqVar, str, objArr);
    }

    public static void zzz(Class cls, zzqm zzqmVar) {
        zzqmVar.zzy();
        zzb.put(cls, zzqmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzrx.zza().zzb(getClass()).zzg(this, (zzqm) obj);
    }

    public final int hashCode() {
        if (zzD()) {
            return zzm();
        }
        int i5 = this.zza;
        if (i5 != 0) {
            return i5;
        }
        int zzm = zzm();
        this.zza = zzm;
        return zzm;
    }

    public final String toString() {
        return zzrs.zza(this, super.toString());
    }

    public final void zzA(int i5) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final void zzB(zzpv zzpvVar) {
        zzrx.zza().zzb(getClass()).zzf(this, zzpw.zza(zzpvVar));
    }

    public final boolean zzD() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object zzb(int i5, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.consent_sdk.zzpa
    public final int zzj(zzsa zzsaVar) {
        if (zzD()) {
            int zza = zzsaVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(u.h(zza, "serialized size must be non-negative, was "));
        }
        int i5 = this.zzd & f.API_PRIORITY_OTHER;
        if (i5 != Integer.MAX_VALUE) {
            return i5;
        }
        int zza2 = zzsaVar.zza(this);
        if (zza2 < 0) {
            throw new IllegalStateException(u.h(zza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
        return zza2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final /* synthetic */ zzrq zzl() {
        return (zzqm) zzb(6, null, null);
    }

    public final int zzm() {
        return zzrx.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final int zzn() {
        if (zzD()) {
            int zza = zza(null);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(u.h(zza, "serialized size must be non-negative, was "));
        }
        int i5 = this.zzd & f.API_PRIORITY_OTHER;
        if (i5 != Integer.MAX_VALUE) {
            return i5;
        }
        int zza2 = zza(null);
        if (zza2 < 0) {
            throw new IllegalStateException(u.h(zza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
        return zza2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final boolean zzo() {
        return zzc(this, true);
    }

    public final zzqj zzp() {
        return (zzqj) zzb(5, null, null);
    }

    public final zzqm zzr() {
        return (zzqm) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final /* synthetic */ zzrp zzu() {
        return (zzqj) zzb(5, null, null);
    }

    public final void zzx() {
        zzrx.zza().zzb(getClass()).zzd(this);
        zzy();
    }

    public final void zzy() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }
}
