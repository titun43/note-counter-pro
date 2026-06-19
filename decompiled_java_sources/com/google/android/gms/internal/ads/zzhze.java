package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzhze implements CharSequence {
    private char[] zza;
    private String zzb;

    private zzhze() {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        return this.zza[i5];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.zza.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i6) {
        return new String(this.zza, i5, i6 - i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.zzb == null) {
            this.zzb = new String(this.zza);
        }
        return this.zzb;
    }

    public final void zza(char[] cArr) {
        this.zza = cArr;
        this.zzb = null;
    }

    public /* synthetic */ zzhze(byte[] bArr) {
    }
}
