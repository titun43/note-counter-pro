package n4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class i extends h {
    public static boolean S(CharSequence charSequence, String str) {
        g4.i.e(charSequence, "<this>");
        return U(charSequence, str, 0, false) >= 0;
    }

    public static final int T(CharSequence charSequence) {
        g4.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int U(CharSequence charSequence, String str, int i5, boolean z4) {
        g4.i.e(charSequence, "<this>");
        g4.i.e(str, "string");
        return (z4 || !(charSequence instanceof String)) ? V(charSequence, str, i5, charSequence.length(), z4, false) : ((String) charSequence).indexOf(str, i5);
    }

    public static final int V(CharSequence charSequence, CharSequence charSequence2, int i5, int i6, boolean z4, boolean z5) {
        k4.a aVar;
        boolean z6;
        boolean regionMatches;
        if (z5) {
            int T = T(charSequence);
            if (i5 > T) {
                i5 = T;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            aVar = new k4.a(i5, i6, -1);
        } else {
            if (i5 < 0) {
                i5 = 0;
            }
            int length = charSequence.length();
            if (i6 > length) {
                i6 = length;
            }
            aVar = new k4.c(i5, i6, 1);
        }
        boolean z7 = charSequence instanceof String;
        int i7 = aVar.f2442i;
        int i8 = aVar.h;
        int i9 = aVar.f2441g;
        if (z7 && (charSequence2 instanceof String)) {
            if ((i7 > 0 && i9 <= i8) || (i7 < 0 && i8 <= i9)) {
                int i10 = i9;
                while (true) {
                    String str = (String) charSequence2;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (z4) {
                        z6 = z4;
                        regionMatches = str.regionMatches(z6, 0, str2, i10, length2);
                    } else {
                        regionMatches = str.regionMatches(0, str2, i10, length2);
                        z6 = z4;
                    }
                    if (regionMatches) {
                        return i10;
                    }
                    if (i10 == i8) {
                        break;
                    }
                    i10 += i7;
                    z4 = z6;
                }
            }
        } else if ((i7 > 0 && i9 <= i8) || (i7 < 0 && i8 <= i9)) {
            while (true) {
                int length3 = charSequence2.length();
                g4.i.e(charSequence, "other");
                if (i9 >= 0 && charSequence2.length() - length3 >= 0 && i9 <= charSequence.length() - length3) {
                    for (int i11 = 0; i11 < length3; i11++) {
                        if (b3.g.q(charSequence2.charAt(i11), charSequence.charAt(i9 + i11), z4)) {
                        }
                    }
                    return i9;
                }
                if (i9 == i8) {
                    break;
                }
                i9 += i7;
            }
        }
        return -1;
    }

    public static int W(String str, char c5, int i5, int i6) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return str.indexOf(c5, i5);
    }

    public static boolean X(String str) {
        g4.i.e(str, "<this>");
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int Y(CharSequence charSequence) {
        int T = T(charSequence);
        g4.i.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(46, T);
        }
        char[] cArr = {'.'};
        if (charSequence instanceof String) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length == 1) {
                return ((String) charSequence).lastIndexOf(cArr[0], T);
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        int T2 = T(charSequence);
        if (T > T2) {
            T = T2;
        }
        while (-1 < T) {
            if (b3.g.q(cArr[0], charSequence.charAt(T), false)) {
                return T;
            }
            T--;
        }
        return -1;
    }

    public static String Z(String str, String str2) {
        g4.i.e(str2, "delimiter");
        int U = U(str, str2, 0, false);
        if (U == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + U, str.length());
        g4.i.d(substring, "substring(...)");
        return substring;
    }

    public static Long a0(String str) {
        boolean z4;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        long j2 = -9223372036854775807L;
        if (charAt < '0') {
            z4 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z4 = false;
                i5 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j2 = Long.MIN_VALUE;
                i5 = 1;
            }
        } else {
            z4 = false;
        }
        long j5 = 0;
        long j6 = -256204778801521550L;
        while (i5 < length) {
            int digit = Character.digit((int) str.charAt(i5), 10);
            if (digit < 0) {
                return null;
            }
            if (j5 < j6) {
                if (j6 != -256204778801521550L) {
                    return null;
                }
                j6 = j2 / 10;
                if (j5 < j6) {
                    return null;
                }
            }
            long j7 = j5 * 10;
            long j8 = digit;
            if (j7 < j2 + j8) {
                return null;
            }
            j5 = j7 - j8;
            i5++;
        }
        return z4 ? Long.valueOf(j5) : Long.valueOf(-j5);
    }
}
