package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzakp implements zzagc {
    public static final zzakp zza = new zzakp(true);
    public static final zzakp zzb = new zzakp(false);
    public final boolean zzc;

    private zzakp(boolean z4) {
        this.zzc = z4;
    }

    public final String toString() {
        boolean z4 = !this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(z4).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
