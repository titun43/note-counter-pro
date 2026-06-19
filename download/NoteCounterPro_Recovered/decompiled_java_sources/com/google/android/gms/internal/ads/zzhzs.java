package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzhzs implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private final zzhyj zzg;
    private final String zzh;
    private String zzi;
    private final boolean zzj;
    private zzhyq zzk;
    private String zzl;

    static {
        for (int i5 = 0; i5 <= 31; i5++) {
            zzb[i5] = String.format("\\u%04x", Integer.valueOf(i5));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzhzs(Writer writer) {
        boolean z4 = false;
        zzm(6);
        this.zzk = zzhyq.LEGACY_STRICT;
        Objects.requireNonNull(writer, "out == null");
        this.zzd = writer;
        zzhyj zzhyjVar = zzhyj.zza;
        Objects.requireNonNull(zzhyjVar);
        this.zzg = zzhyjVar;
        this.zzi = ",";
        if (zzhyjVar.zzc()) {
            this.zzh = ": ";
            if (zzhyjVar.zza().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = ":";
        }
        if (zzhyjVar.zza().isEmpty() && zzhyjVar.zzb().isEmpty()) {
            z4 = true;
        }
        this.zzj = z4;
    }

    private final zzhzs zzk(int i5, char c5) {
        zzs();
        zzm(i5);
        this.zzd.write(c5);
        return this;
    }

    private final zzhzs zzl(int i5, int i6, char c5) {
        int zzn = zzn();
        if (zzn != i6 && zzn != i5) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzl;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.zzf--;
        if (zzn == i6) {
            zzr();
        }
        this.zzd.write(c5);
        return this;
    }

    private final void zzm(int i5) {
        int i6 = this.zzf;
        int[] iArr = this.zze;
        if (i6 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i6 + i6);
        }
        int[] iArr2 = this.zze;
        int i7 = this.zzf;
        this.zzf = i7 + 1;
        iArr2[i7] = i5;
    }

    private final int zzn() {
        int i5 = this.zzf;
        if (i5 != 0) {
            return this.zze[i5 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void zzo(int i5) {
        this.zze[this.zzf - 1] = i5;
    }

    private final void zzp() {
        if (this.zzl != null) {
            int zzn = zzn();
            if (zzn == 5) {
                this.zzd.write(this.zzi);
            } else if (zzn != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzr();
            zzo(4);
            zzq(this.zzl);
            this.zzl = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzq(String str) {
        int i5;
        String str2;
        Writer writer = this.zzd;
        String[] strArr = zzb;
        writer.write(34);
        int length = str.length();
        int i6 = 0;
        while (i5 < length) {
            int i7 = i5 + 1;
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i5 = str2 == null ? i7 : 0;
                if (i6 < i5) {
                    writer.write(str, i6, i5 - i6);
                }
                writer.write(str2);
                i6 = i7;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i6 < i5) {
                }
                writer.write(str2);
                i6 = i7;
            }
        }
        if (i6 < length) {
            writer.write(str, i6, length - i6);
        }
        writer.write(34);
    }

    private final void zzr() {
        if (this.zzj) {
            return;
        }
        Writer writer = this.zzd;
        zzhyj zzhyjVar = this.zzg;
        writer.write(zzhyjVar.zza());
        int i5 = this.zzf;
        for (int i6 = 1; i6 < i5; i6++) {
            writer.write(zzhyjVar.zzb());
        }
    }

    private final void zzs() {
        int zzn = zzn();
        if (zzn == 1) {
            zzo(2);
            zzr();
            return;
        }
        if (zzn == 2) {
            this.zzd.append((CharSequence) this.zzi);
            zzr();
        } else {
            if (zzn == 4) {
                this.zzd.append((CharSequence) this.zzh);
                zzo(5);
                return;
            }
            if (zzn != 6) {
                if (zzn != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.zzk != zzhyq.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzo(7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zzd.close();
        int i5 = this.zzf;
        if (i5 > 1 || (i5 == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final void zza(zzhyq zzhyqVar) {
        Objects.requireNonNull(zzhyqVar);
        this.zzk = zzhyqVar;
    }

    public final zzhzs zzb() {
        zzp();
        zzk(1, '[');
        return this;
    }

    public final zzhzs zzc() {
        zzl(1, 2, ']');
        return this;
    }

    public final zzhzs zzd() {
        zzp();
        zzk(3, '{');
        return this;
    }

    public final zzhzs zze() {
        zzl(3, 5, '}');
        return this;
    }

    public final zzhzs zzf(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.zzl != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int zzn = zzn();
        if (zzn != 3 && zzn != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzl = str;
        return this;
    }

    public final zzhzs zzg(String str) {
        if (str == null) {
            zzj();
            return this;
        }
        zzp();
        zzs();
        zzq(str);
        return this;
    }

    public final zzhzs zzh(boolean z4) {
        zzp();
        zzs();
        this.zzd.write(true != z4 ? "false" : "true");
        return this;
    }

    public final zzhzs zzi(Number number) {
        if (number == null) {
            zzj();
            return this;
        }
        zzp();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.zzk != zzhyq.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
                }
            } else if (cls != Float.class && cls != Double.class && !zza.matcher(obj).matches()) {
                String valueOf = String.valueOf(cls);
                throw new IllegalArgumentException(u.n(new StringBuilder(valueOf.length() + 47 + obj.length()), "String created by ", valueOf, " is not a valid JSON number: ", obj));
            }
        }
        zzs();
        this.zzd.append((CharSequence) obj);
        return this;
    }

    public final zzhzs zzj() {
        if (this.zzl != null) {
            zzp();
        }
        zzs();
        this.zzd.write("null");
        return this;
    }
}
