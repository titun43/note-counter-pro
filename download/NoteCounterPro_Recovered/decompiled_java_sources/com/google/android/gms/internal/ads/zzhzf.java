package com.google.android.gms.internal.ads;

import java.io.Writer;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzhzf extends Writer {
    private final Appendable zza;
    private final zzhze zzb = new zzhze(null);

    public zzhzf(Appendable appendable) {
        this.zza = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.zza.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(int i5) {
        this.zza.append((char) i5);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i5, int i6) {
        Objects.requireNonNull(str);
        this.zza.append(str, i5, i6 + i5);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i5, int i6) {
        this.zza.append(charSequence, i5, i6);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i5, int i6) {
        append(charSequence, i5, i6);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i5, int i6) {
        zzhze zzhzeVar = this.zzb;
        zzhzeVar.zza(cArr);
        this.zza.append(zzhzeVar, i5, i6 + i5);
    }
}
