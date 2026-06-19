package com.google.android.gms.internal.ads;

import java.lang.Character;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzbek {
    public static int zza(String str) {
        int i5;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i5 = length & (-4);
            if (i6 >= i5) {
                break;
            }
            int i8 = ((bytes[i6] & 255) | ((bytes[i6 + 1] & 255) << 8) | ((bytes[i6 + 2] & 255) << 16) | (bytes[i6 + 3] << 24)) * (-862048943);
            int i9 = i7 ^ (((i8 >>> 17) | (i8 << 15)) * 461845907);
            i7 = (((i9 >>> 19) | (i9 << 13)) * 5) - 430675100;
            i6 += 4;
        }
        int i10 = length & 3;
        if (i10 != 1) {
            if (i10 != 2) {
                r1 = i10 == 3 ? (bytes[i5 + 2] & 255) << 16 : 0;
                int i11 = i7 ^ length;
                int i12 = (i11 ^ (i11 >>> 16)) * (-2048144789);
                int i13 = (i12 ^ (i12 >>> 13)) * (-1028477387);
                return i13 ^ (i13 >>> 16);
            }
            r1 |= (bytes[i5 + 1] & 255) << 8;
        }
        int i14 = ((bytes[i5] & 255) | r1) * (-862048943);
        i7 ^= ((i14 >>> 17) | (i14 << 15)) * 461845907;
        int i112 = i7 ^ length;
        int i122 = (i112 ^ (i112 >>> 16)) * (-2048144789);
        int i132 = (i122 ^ (i122 >>> 13)) * (-1028477387);
        return i132 ^ (i132 >>> 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (true != r4) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] zzb(String str, boolean z4) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i5 = 0;
        boolean z5 = false;
        int i6 = 0;
        while (i5 < str.length()) {
            int codePointAt = Character.codePointAt(charArray, i5);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (of.equals(Character.UnicodeBlock.BOPOMOFO) || of.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || of.equals(Character.UnicodeBlock.HANGUL_JAMO) || of.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || of.equals(Character.UnicodeBlock.HIRAGANA) || of.equals(Character.UnicodeBlock.KATAKANA) || of.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500))) {
                    if (z5) {
                        arrayList.add(new String(charArray, i6, i5 - i6));
                    }
                    arrayList.add(new String(charArray, i5, charCount));
                    z5 = false;
                    i5 += charCount;
                }
            }
            if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                if (!z4 || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                    if (z5) {
                        arrayList.add(new String(charArray, i6, i5 - i6));
                    }
                    z5 = false;
                }
            }
            i5 += charCount;
        }
        if (z5) {
            arrayList.add(new String(charArray, i6, i5 - i6));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
