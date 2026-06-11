package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhzq implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private String[] zzm;
    private int[] zzn;
    private zzhyq zzc = zzhyq.LEGACY_STRICT;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzl = 1;

    static {
        zzhyt.zza = new zzhzp();
    }

    public zzhzq(Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new String[32];
        this.zzn = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.zzb = reader;
    }

    private final boolean zzn(char c5) {
        if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
            return false;
        }
        if (c5 != '#') {
            if (c5 == ',') {
                return false;
            }
            if (c5 != '/' && c5 != '=') {
                if (c5 == '{' || c5 == '}' || c5 == ':') {
                    return false;
                }
                if (c5 != ';') {
                    switch (c5) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zzt();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x013d, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x013f, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0141, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x014d, code lost:
    
        r0.append(r4, r2, r3);
        r11.zze = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ee, code lost:
    
        throw zzv("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r11.zze, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzo(char c5) {
        int i5;
        StringBuilder sb = null;
        loop0: do {
            int i6 = this.zze;
            int i7 = this.zzf;
            int i8 = i6;
            while (true) {
                char[] cArr = this.zzd;
                if (i6 >= i7) {
                    break;
                }
                int i9 = i6 + 1;
                char c6 = cArr[i6];
                zzhyq zzhyqVar = this.zzc;
                zzhyq zzhyqVar2 = zzhyq.STRICT;
                if (zzhyqVar == zzhyqVar2 && c6 < ' ') {
                    throw zzv("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                }
                if (c6 == c5) {
                    int i10 = (i9 - i8) - 1;
                    this.zze = i9;
                    if (sb == null) {
                        return new String(cArr, i8, i10);
                    }
                    sb.append(cArr, i8, i10);
                    return sb.toString();
                }
                char c7 = '\n';
                if (c6 == '\\') {
                    int i11 = i9 - i8;
                    int i12 = i11 - 1;
                    this.zze = i9;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i11 + i11, 16));
                    }
                    sb.append(cArr, i8, i12);
                    if (this.zze == this.zzf && !zzr(1)) {
                        throw zzv("Unterminated escape sequence");
                    }
                    int i13 = this.zze;
                    int i14 = i13 + 1;
                    this.zze = i14;
                    char c8 = cArr[i13];
                    if (c8 != '\n') {
                        if (c8 != '\"') {
                            if (c8 != '\'') {
                                if (c8 != '/' && c8 != '\\') {
                                    if (c8 == 'b') {
                                        c7 = '\b';
                                    } else if (c8 == 'f') {
                                        c7 = '\f';
                                    } else if (c8 != 'n') {
                                        if (c8 == 'r') {
                                            c7 = '\r';
                                        } else if (c8 == 't') {
                                            c7 = '\t';
                                        } else {
                                            if (c8 != 'u') {
                                                throw zzv("Invalid escape sequence");
                                            }
                                            if (i13 + 5 > this.zzf && !zzr(4)) {
                                                throw zzv("Unterminated escape sequence");
                                            }
                                            int i15 = this.zze;
                                            int i16 = i15 + 4;
                                            int i17 = 0;
                                            while (i15 < i16) {
                                                int i18 = i17 << 4;
                                                char c9 = cArr[i15];
                                                if (c9 >= '0' && c9 <= '9') {
                                                    i5 = c9 - '0';
                                                } else if (c9 >= 'a' && c9 <= 'f') {
                                                    i5 = c9 - 'W';
                                                } else {
                                                    if (c9 < 'A' || c9 > 'F') {
                                                        break loop0;
                                                    }
                                                    i5 = c9 - '7';
                                                }
                                                i17 = i5 + i18;
                                                i15++;
                                            }
                                            this.zze += 4;
                                            c7 = (char) i17;
                                        }
                                    }
                                    sb.append(c7);
                                    i8 = this.zze;
                                    i7 = this.zzf;
                                    i6 = i8;
                                }
                            }
                        }
                        c7 = c8;
                        sb.append(c7);
                        i8 = this.zze;
                        i7 = this.zzf;
                        i6 = i8;
                    } else {
                        if (this.zzc == zzhyqVar2) {
                            throw zzv("Cannot escape a newline character in strict mode");
                        }
                        this.zzg++;
                        this.zzh = i14;
                    }
                    if (this.zzc == zzhyqVar2) {
                        throw zzv("Invalid escaped character \"'\" in strict mode");
                    }
                    c7 = c8;
                    sb.append(c7);
                    i8 = this.zze;
                    i7 = this.zzf;
                    i6 = i8;
                } else {
                    if (c6 == '\n') {
                        this.zzg++;
                        this.zzh = i9;
                    }
                    i6 = i9;
                }
            }
        } while (zzr(1));
        throw zzv("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        zzt();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzp() {
        String sb;
        int i5 = 0;
        StringBuilder sb2 = null;
        do {
            int i6 = 0;
            while (true) {
                int i7 = this.zze + i6;
                if (i7 < this.zzf) {
                    char c5 = this.zzd[i7];
                    if (c5 != '\t' && c5 != '\n' && c5 != '\f' && c5 != '\r' && c5 != ' ') {
                        if (c5 != '#') {
                            if (c5 != ',') {
                                if (c5 != '/' && c5 != '=') {
                                    if (c5 != '{' && c5 != '}' && c5 != ':') {
                                        if (c5 != ';') {
                                            switch (c5) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i6++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i6 >= 1024) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i6, 16));
                    }
                    sb2.append(this.zzd, this.zze, i6);
                    this.zze += i6;
                } else if (zzr(i6 + 1)) {
                }
            }
            i5 = i6;
            if (sb2 != null) {
                sb = new String(this.zzd, this.zze, i5);
            } else {
                sb2.append(this.zzd, this.zze, i5);
                sb = sb2.toString();
            }
            this.zze += i5;
            return sb;
        } while (zzr(1));
        if (sb2 != null) {
        }
        this.zze += i5;
        return sb;
    }

    private final void zzq(int i5) {
        int i6 = this.zzl;
        if (i6 - 1 >= 1280) {
            String zzl = zzl();
            throw new zzhzt(s.c.d(new StringBuilder(zzl.length() + 26), "Nesting limit 1280 reached", zzl));
        }
        int[] iArr = this.zzk;
        if (i6 == iArr.length) {
            int i7 = i6 + i6;
            this.zzk = Arrays.copyOf(iArr, i7);
            this.zzn = Arrays.copyOf(this.zzn, i7);
            this.zzm = (String[]) Arrays.copyOf(this.zzm, i7);
        }
        int[] iArr2 = this.zzk;
        int i8 = this.zzl;
        this.zzl = i8 + 1;
        iArr2[i8] = i5;
    }

    private final boolean zzr(int i5) {
        int i6;
        int i7 = this.zzh;
        int i8 = this.zze;
        this.zzh = i7 - i8;
        char[] cArr = this.zzd;
        int i9 = this.zzf;
        if (i9 != i8) {
            int i10 = i9 - i8;
            this.zzf = i10;
            System.arraycopy(cArr, i8, cArr, 0, i10);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i11 = this.zzf;
            int read = reader.read(cArr, i11, 1024 - i11);
            if (read == -1) {
                return false;
            }
            i6 = this.zzf + read;
            this.zzf = i6;
            if (this.zzg == 0 && this.zzh == 0 && i6 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i5++;
            }
        } while (i6 < i5);
        return true;
    }

    private final int zzs(boolean z4) {
        int i5;
        int i6 = this.zze;
        int i7 = this.zzf;
        while (true) {
            if (i6 == i7) {
                this.zze = i6;
                if (!zzr(1)) {
                    if (z4) {
                        throw new EOFException("End of input".concat(zzl()));
                    }
                    return -1;
                }
                i6 = this.zze;
                i7 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i8 = i6 + 1;
            char c5 = cArr[i6];
            if (c5 == '\n') {
                this.zzg++;
                this.zzh = i8;
            } else if (c5 != ' ' && c5 != '\r' && c5 != '\t') {
                if (c5 == '/') {
                    this.zze = i8;
                    if (i8 == i7) {
                        this.zze = i6;
                        boolean zzr = zzr(2);
                        this.zze++;
                        if (!zzr) {
                            return 47;
                        }
                    }
                    zzt();
                    int i9 = this.zze;
                    char c6 = cArr[i9];
                    if (c6 == '*') {
                        this.zze = i9 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzr(2)) {
                                throw zzv("Unterminated comment");
                            }
                            int i10 = this.zze;
                            if (cArr[i10] != '\n') {
                                while (i5 < 2) {
                                    i5 = cArr[this.zze + i5] == "*/".charAt(i5) ? i5 + 1 : 0;
                                }
                                i6 = this.zze + 2;
                                i7 = this.zzf;
                                break;
                            }
                            this.zzg++;
                            this.zzh = i10 + 1;
                            this.zze++;
                        }
                    } else {
                        if (c6 != '/') {
                            return 47;
                        }
                        this.zze = i9 + 1;
                        zzu();
                        i6 = this.zze;
                        i7 = this.zzf;
                    }
                } else {
                    if (c5 != '#') {
                        this.zze = i8;
                        return c5;
                    }
                    this.zze = i8;
                    zzt();
                    zzu();
                    i6 = this.zze;
                    i7 = this.zzf;
                }
            }
            i6 = i8;
        }
    }

    private final void zzt() {
        if (this.zzc != zzhyq.LENIENT) {
            throw zzv("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzu() {
        char c5;
        do {
            if (this.zze >= this.zzf && !zzr(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i5 = this.zze;
            int i6 = i5 + 1;
            this.zze = i6;
            c5 = cArr[i5];
            if (c5 == '\n') {
                this.zzg++;
                this.zzh = i6;
                return;
            }
        } while (c5 != '\r');
    }

    private final zzhzt zzv(String str) {
        String zzl = zzl();
        throw new zzhzt(h1.b(new StringBuilder(str.length() + zzl.length() + 79), str, zzl, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    private final IllegalStateException zzw(String str) {
        int zzm = zzm();
        String zza = zzhzr.zza(zzm());
        String zzl = zzl();
        int e4 = u.e(zza, str.length() + 18, zzl.length());
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(zzm == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(concat.length() + e4 + 5);
        s.c.e(sb, "Expected ", str, " but was ", zza);
        return new IllegalStateException(h1.b(sb, zzl, "\nSee ", concat));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    public final String toString() {
        return "zzhzq".concat(zzl());
    }

    public final void zza(zzhyq zzhyqVar) {
        Objects.requireNonNull(zzhyqVar);
        this.zzc = zzhyqVar;
    }

    public final void zzb() {
        int i5 = this.zza;
        if (i5 == 0) {
            i5 = zzg();
        }
        if (i5 != 3) {
            throw zzw("BEGIN_ARRAY");
        }
        zzq(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzc() {
        int i5 = this.zza;
        if (i5 == 0) {
            i5 = zzg();
        }
        if (i5 != 4) {
            throw zzw("END_ARRAY");
        }
        int i6 = this.zzl;
        this.zzl = i6 - 1;
        int[] iArr = this.zzn;
        int i7 = i6 - 2;
        iArr[i7] = iArr[i7] + 1;
        this.zza = 0;
    }

    public final void zzd() {
        int i5 = this.zza;
        if (i5 == 0) {
            i5 = zzg();
        }
        if (i5 != 1) {
            throw zzw("BEGIN_OBJECT");
        }
        zzq(3);
        this.zza = 0;
    }

    public final void zze() {
        int i5 = this.zza;
        if (i5 == 0) {
            i5 = zzg();
        }
        if (i5 != 2) {
            throw zzw("END_OBJECT");
        }
        int i6 = this.zzl;
        int i7 = i6 - 1;
        this.zzl = i7;
        this.zzm[i7] = null;
        int[] iArr = this.zzn;
        int i8 = i6 - 2;
        iArr[i8] = iArr[i8] + 1;
        this.zza = 0;
    }

    public final boolean zzf() {
        int i5 = this.zza;
        if (i5 == 0) {
            i5 = zzg();
        }
        return (i5 == 2 || i5 == 4 || i5 == 17) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01de, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022c, code lost:
    
        if (zzn(r1) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b3, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0230, code lost:
    
        if (r15 != 2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0232, code lost:
    
        if (r16 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0238, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x023a, code lost:
    
        if (r17 == 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x023c, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0245, code lost:
    
        if (r11 != r20) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0247, code lost:
    
        if (r3 != 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024d, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024e, code lost:
    
        r24.zzi = r11;
        r24.zze += r10;
        r3 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0257, code lost:
    
        r24.zza = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x024a, code lost:
    
        if (r3 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0241, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x023e, code lost:
    
        r8 = 2;
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x025a, code lost:
    
        if (r15 == r8) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x025d, code lost:
    
        if (r15 == 4) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x025f, code lost:
    
        if (r15 != 7) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0261, code lost:
    
        r24.zzj = r10;
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a2, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzg() {
        int i5;
        int i6;
        int zzs;
        int i7;
        int zzs2;
        int i8;
        String str;
        String str2;
        int i9;
        char c5;
        long j2;
        char[] cArr;
        int i10;
        int i11;
        int[] iArr = this.zzk;
        int i12 = this.zzl - 1;
        int i13 = iArr[i12];
        int i14 = 3;
        int i15 = 1;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    i5 = 2;
                    i6 = 4;
                } else if (i13 == 5) {
                    i6 = 4;
                    i5 = 2;
                } else if (i13 == 4) {
                    iArr[i12] = 5;
                    int zzs3 = zzs(true);
                    if (zzs3 != 58) {
                        if (zzs3 != 61) {
                            throw zzv("Expected ':'");
                        }
                        zzt();
                        if (this.zze < this.zzf || zzr(1)) {
                            char[] cArr2 = this.zzd;
                            int i16 = this.zze;
                            if (cArr2[i16] == '>') {
                                this.zze = i16 + 1;
                            }
                        }
                    }
                } else if (i13 == 6) {
                    if (this.zzc == zzhyq.LENIENT) {
                        zzs(true);
                        int i17 = this.zze;
                        this.zze = i17 - 1;
                        if (i17 + 4 <= this.zzf || zzr(5)) {
                            int i18 = this.zze;
                            char[] cArr3 = this.zzd;
                            if (cArr3[i18] == ')' && cArr3[i18 + 1] == ']' && cArr3[i18 + 2] == '}' && cArr3[i18 + 3] == '\'' && cArr3[i18 + 4] == '\n') {
                                this.zze = i18 + 5;
                            }
                        }
                    }
                    this.zzk[this.zzl - 1] = 7;
                } else if (i13 == 7) {
                    i7 = 0;
                    if (zzs(false) == -1) {
                        i14 = 17;
                        this.zza = i14;
                        return i14;
                    }
                    zzt();
                    this.zze--;
                } else {
                    i7 = 0;
                    if (i13 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iArr[i12] = i6;
                if (i13 == 5 && (zzs = zzs(true)) != 44) {
                    if (zzs != 59) {
                        if (zzs != 125) {
                            throw zzv("Unterminated object");
                        }
                        i14 = i5;
                        this.zza = i14;
                        return i14;
                    }
                    zzt();
                }
                int zzs4 = zzs(true);
                if (zzs4 == 34) {
                    i14 = 13;
                } else {
                    if (zzs4 == 39) {
                        zzt();
                        this.zza = 12;
                        return 12;
                    }
                    if (zzs4 != 125) {
                        zzt();
                        this.zze--;
                        if (!zzn((char) zzs4)) {
                            throw zzv("Expected name");
                        }
                        i14 = 14;
                    } else {
                        if (i13 == 5) {
                            throw zzv("Expected name");
                        }
                        i14 = i5;
                    }
                }
                this.zza = i14;
                return i14;
            }
            int zzs5 = zzs(true);
            if (zzs5 != 44) {
                if (zzs5 != 59) {
                    if (zzs5 != 93) {
                        throw zzv("Unterminated array");
                    }
                    i14 = 4;
                    this.zza = i14;
                    return i14;
                }
                zzt();
            }
            zzs2 = zzs(true);
            if (zzs2 == 34) {
                if (zzs2 == 39) {
                    zzt();
                    this.zza = 8;
                    return 8;
                }
                if (zzs2 == 44 || zzs2 == 59) {
                    i8 = 1;
                } else if (zzs2 != 91) {
                    if (zzs2 == 93) {
                        i8 = 1;
                        if (i13 == 1) {
                            i14 = 4;
                        }
                    } else if (zzs2 != 123) {
                        int i19 = this.zze - 1;
                        this.zze = i19;
                        char[] cArr4 = this.zzd;
                        char c6 = cArr4[i19];
                        if (c6 == 't' || c6 == 'T') {
                            str = "TRUE";
                            str2 = "true";
                            i9 = 5;
                        } else if (c6 == 'f' || c6 == 'F') {
                            str = "FALSE";
                            str2 = "false";
                            i9 = 6;
                        } else {
                            if (c6 == 'n' || c6 == 'N') {
                                str = "NULL";
                                str2 = "null";
                                i9 = 7;
                            }
                            i9 = i7;
                            if (i9 == 0) {
                                return i9;
                            }
                            int i20 = this.zze;
                            int i21 = this.zzf;
                            int i22 = i7;
                            int i23 = i22;
                            int i24 = i23;
                            boolean z4 = true;
                            long j5 = 0;
                            while (true) {
                                if (i20 + i22 == i21) {
                                    if (i22 == 1024) {
                                        break;
                                    }
                                    if (!zzr(i22 + 1)) {
                                        cArr = cArr4;
                                        j2 = 0;
                                        break;
                                    }
                                    int i25 = this.zze;
                                    i21 = this.zzf;
                                    i20 = i25;
                                }
                                char c7 = cArr4[i20 + i22];
                                j2 = 0;
                                if (c7 != '+') {
                                    if (c7 == 'E' || c7 == 'e') {
                                        cArr = cArr4;
                                        if (i23 != 2 && i23 != 4) {
                                            break;
                                        }
                                        i23 = 5;
                                        i22++;
                                        cArr4 = cArr;
                                        i15 = 1;
                                    } else if (c7 == '-') {
                                        cArr = cArr4;
                                        i10 = 6;
                                        if (i23 == 0) {
                                            i23 = 1;
                                            i24 = 1;
                                            i22++;
                                            cArr4 = cArr;
                                            i15 = 1;
                                        } else {
                                            if (i23 != 5) {
                                                break;
                                            }
                                            i23 = i10;
                                            i22++;
                                            cArr4 = cArr;
                                            i15 = 1;
                                        }
                                    } else if (c7 == '.') {
                                        cArr = cArr4;
                                        if (i23 != 2) {
                                            break;
                                        }
                                        i23 = 3;
                                        i22++;
                                        cArr4 = cArr;
                                        i15 = 1;
                                    } else {
                                        if (c7 < '0' || c7 > '9') {
                                            break;
                                        }
                                        if (i23 == i15 || i23 == 0) {
                                            cArr = cArr4;
                                            j5 = -(c7 - '0');
                                            i23 = 2;
                                        } else if (i23 != 2) {
                                            cArr = cArr4;
                                            if (i23 == 3) {
                                                i23 = 4;
                                            } else if (i23 == 5 || i23 == 6) {
                                                i23 = 7;
                                            }
                                        } else {
                                            if (j5 == 0) {
                                                break;
                                            }
                                            cArr = cArr4;
                                            long j6 = (10 * j5) - (c7 - '0');
                                            z4 &= j5 > -922337203685477580L || (j5 == -922337203685477580L && j6 < j5);
                                            j5 = j6;
                                        }
                                        i22++;
                                        cArr4 = cArr;
                                        i15 = 1;
                                    }
                                    if (i11 == 0) {
                                        return i11;
                                    }
                                    if (!zzn(cArr[this.zze])) {
                                        throw zzv("Expected value");
                                    }
                                    zzt();
                                    this.zza = 10;
                                    return 10;
                                }
                                cArr = cArr4;
                                i10 = 6;
                                if (i23 != 5) {
                                    break;
                                }
                                i23 = i10;
                                i22++;
                                cArr4 = cArr;
                                i15 = 1;
                            }
                            i11 = 0;
                            if (i11 == 0) {
                            }
                        }
                        zzhyq zzhyqVar = this.zzc;
                        zzhyq zzhyqVar2 = zzhyq.STRICT;
                        int i26 = i7;
                        while (true) {
                            int length = str2.length();
                            if (i26 < length) {
                                if ((this.zze + i26 >= this.zzf && !zzr(i26 + 1)) || ((c5 = cArr4[this.zze + i26]) != str2.charAt(i26) && (zzhyqVar == zzhyqVar2 || c5 != str.charAt(i26)))) {
                                    break;
                                }
                                i26++;
                            } else if ((this.zze + length >= this.zzf && !zzr(length + 1)) || !zzn(cArr4[this.zze + length])) {
                                this.zze += length;
                                this.zza = i9;
                            }
                        }
                        i9 = i7;
                        if (i9 == 0) {
                        }
                    } else {
                        i14 = 1;
                    }
                }
                if (i13 != i8 && i13 != 2) {
                    throw zzv("Unexpected value");
                }
                zzt();
                this.zze--;
                this.zza = 7;
                return 7;
            }
            i14 = 9;
            this.zza = i14;
            return i14;
        }
        iArr[i12] = 2;
        i7 = 0;
        zzs2 = zzs(true);
        if (zzs2 == 34) {
        }
        this.zza = i14;
        return i14;
    }

    public final String zzh() {
        String zzo;
        int i5 = this.zza;
        if (i5 == 0) {
            i5 = zzg();
        }
        if (i5 == 14) {
            zzo = zzp();
        } else if (i5 == 12) {
            zzo = zzo('\'');
        } else {
            if (i5 != 13) {
                throw zzw("a name");
            }
            zzo = zzo('\"');
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = zzo;
        return zzo;
    }

    public final String zzi() {
        String str;
        int i5 = this.zza;
        if (i5 == 0) {
            i5 = zzg();
        }
        if (i5 == 10) {
            str = zzp();
        } else if (i5 == 8) {
            str = zzo('\'');
        } else if (i5 == 9) {
            str = zzo('\"');
        } else if (i5 == 11) {
            str = null;
        } else if (i5 == 15) {
            str = Long.toString(this.zzi);
        } else {
            if (i5 != 16) {
                throw zzw("a string");
            }
            String str2 = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
            str = str2;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i6 = this.zzl - 1;
        iArr[i6] = iArr[i6] + 1;
        return str;
    }

    public final boolean zzj() {
        int i5 = this.zza;
        if (i5 == 0) {
            i5 = zzg();
        }
        if (i5 == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i6 = this.zzl - 1;
            iArr[i6] = iArr[i6] + 1;
            return true;
        }
        if (i5 != 6) {
            throw zzw("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i7 = this.zzl - 1;
        iArr2[i7] = iArr2[i7] + 1;
        return false;
    }

    public final void zzk() {
        int i5 = this.zza;
        if (i5 == 0) {
            i5 = zzg();
        }
        if (i5 != 7) {
            throw zzw("null");
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i6 = this.zzl - 1;
        iArr[i6] = iArr[i6] + 1;
    }

    public final String zzl() {
        int i5 = this.zzg + 1;
        int i6 = this.zze - this.zzh;
        StringBuilder sb = new StringBuilder("$");
        for (int i7 = 0; i7 < this.zzl; i7++) {
            int i8 = this.zzk[i7];
            switch (i8) {
                case 1:
                case 2:
                    int i9 = this.zzn[i7];
                    sb.append('[');
                    sb.append(i9);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.zzm[i7];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(u.l(new StringBuilder(String.valueOf(i8).length() + 21), "Unknown scope value: ", i8));
            }
        }
        int i10 = i6 + 1;
        String sb2 = sb.toString();
        int length = String.valueOf(i5).length();
        int length2 = String.valueOf(i10).length();
        StringBuilder sb3 = new StringBuilder(sb2.length() + length2 + length + 17 + 6);
        u.s(sb3, " at line ", i5, " column ", i10);
        return s.c.d(sb3, " path ", sb2);
    }

    public final int zzm() {
        int i5 = this.zza;
        if (i5 == 0) {
            i5 = zzg();
        }
        switch (i5) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
