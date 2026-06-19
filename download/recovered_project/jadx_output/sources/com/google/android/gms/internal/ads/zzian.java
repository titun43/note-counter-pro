package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzian implements Iterable<Byte>, Serializable {
    public static final zzian zza = new zzial(zzice.zzb);
    private int zzb = 0;

    static {
        int i5 = zziaa.zza;
    }

    public static zziam zzA() {
        return new zziam(128);
    }

    public static void zzB(int i5, int i6) {
        if (((i6 - (i5 + 1)) | i5) < 0) {
            if (i5 < 0) {
                throw new ArrayIndexOutOfBoundsException(u.l(new StringBuilder(String.valueOf(i5).length() + 11), "Index < 0: ", i5));
            }
            throw new ArrayIndexOutOfBoundsException(s.c.c(new StringBuilder(String.valueOf(i5).length() + 18 + String.valueOf(i6).length()), "Index > length: ", i5, ", ", i6));
        }
    }

    public static int zzC(int i5, int i6, int i7) {
        int i8 = i6 - i5;
        if ((i5 | i6 | i8 | (i7 - i6)) >= 0) {
            return i8;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(u.m(new StringBuilder(String.valueOf(i5).length() + 21), "Beginning index: ", i5, " < 0"));
        }
        if (i6 < i5) {
            throw new IndexOutOfBoundsException(s.c.c(new StringBuilder(String.valueOf(i5).length() + 44 + String.valueOf(i6).length()), "Beginning index larger than ending index: ", i5, ", ", i6));
        }
        throw new IndexOutOfBoundsException(s.c.c(new StringBuilder(String.valueOf(i6).length() + 15 + String.valueOf(i7).length()), "End index: ", i6, " >= ", i7));
    }

    public static /* synthetic */ boolean zzD(byte[] bArr, int i5, byte[] bArr2, int i6, int i7) {
        int i8 = i5 + i7;
        zzC(i5, i8, bArr.length);
        zzC(i6, i7 + i6, bArr2.length);
        while (i5 < i8) {
            if (bArr[i5] != bArr2[i6]) {
                return false;
            }
            i5++;
            i6++;
        }
        return true;
    }

    private static zzian zzk(Iterator it, int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException(u.i(i5, "length (", ") must be >= 1"));
        }
        if (i5 == 1) {
            return (zzian) it.next();
        }
        int i6 = i5 >>> 1;
        zzian zzk = zzk(it, i6);
        zzian zzk2 = zzk(it, i5 - i6);
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - zzk.zzc() >= zzk2.zzc()) {
            return zzidt.zzk(zzk, zzk2);
        }
        int zzc = zzk.zzc();
        int zzc2 = zzk2.zzc();
        throw new IllegalArgumentException(s.c.c(new StringBuilder(String.valueOf(zzc).length() + 31 + String.valueOf(zzc2).length()), "ByteString would be too long: ", zzc, "+", zzc2));
    }

    public static zzian zzs(byte[] bArr, int i5, int i6) {
        try {
            return zzt(bArr, i5, i6, false);
        } catch (zzicg e4) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e4);
        }
    }

    public static zzian zzt(byte[] bArr, int i5, int i6, boolean z4) {
        zzC(i5, i5 + i6, bArr.length);
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i5, bArr2, 0, i6);
        return new zzial(bArr2);
    }

    public static zzian zzu(byte[] bArr) {
        try {
            return new zzial(bArr);
        } catch (zzicg e4) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e4);
        }
    }

    public static zzian zzv(String str) {
        return new zzial(str.getBytes(zzice.zza));
    }

    public static zzian zzw(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzian)) {
            return false;
        }
        zzian zzianVar = (zzian) obj;
        int zzc = zzc();
        if (zzc != zzianVar.zzc()) {
            return false;
        }
        if (zzc == 0) {
            return true;
        }
        int i5 = this.zzb;
        int i6 = zzianVar.zzb;
        if (i5 == 0 || i6 == 0 || i5 == i6) {
            return zzj(zzianVar);
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzb;
        if (i5 == 0) {
            int zzc = zzc();
            i5 = zzl(zzc, 0, zzc);
            if (i5 == 0) {
                i5 = 1;
            }
            this.zzb = i5;
        }
        return i5;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzc = zzc();
        String zza2 = zzc() <= 50 ? zzied.zza(this) : zzied.zza(zzd(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzc);
        sb.append(" contents=\"");
        return s.c.d(sb, zza2, "\">");
    }

    public abstract byte zza(int i5);

    public abstract byte zzb(int i5);

    public abstract int zzc();

    public abstract zzian zzd(int i5, int i6);

    public abstract void zze(byte[] bArr, int i5, int i6, int i7);

    public abstract ByteBuffer zzf();

    public abstract void zzg(zziae zziaeVar);

    public abstract String zzh(Charset charset);

    public abstract boolean zzi();

    public abstract boolean zzj(zzian zzianVar);

    public abstract int zzl(int i5, int i6, int i7);

    public abstract zziaq zzm();

    public abstract int zzp();

    public abstract boolean zzq();

    @Override // java.lang.Iterable
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zziai iterator() {
        return new zziaf(this);
    }

    @Deprecated
    public final void zzx(byte[] bArr, int i5, int i6, int i7) {
        zzC(0, i7, zzc());
        zzC(i6, i6 + i7, bArr.length);
        if (i7 > 0) {
            zze(bArr, 0, i6, i7);
        }
    }

    public final byte[] zzy() {
        int zzc = zzc();
        if (zzc == 0) {
            return zzice.zzb;
        }
        byte[] bArr = new byte[zzc];
        zze(bArr, 0, 0, zzc);
        return bArr;
    }

    public final String zzz() {
        return zzc() == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzh(zzice.zza);
    }
}
