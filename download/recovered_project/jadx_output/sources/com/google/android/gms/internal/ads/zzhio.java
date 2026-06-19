package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhio {
    private static final zzhij zzb = new zzhij(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final zzhil zzc = new zzhil(new zzhim(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] zza(byte[] bArr) {
        int i5;
        byte[] bArr2 = new byte[64];
        int i6 = 0;
        while (true) {
            if (i6 >= 32) {
                break;
            }
            int i7 = i6 + i6;
            bArr2[i7] = (byte) (bArr[i6] & 15);
            bArr2[i7 + 1] = (byte) ((bArr[i6] & 255) >> 4);
            i6++;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < 63) {
            byte b2 = (byte) (bArr2[i8] + i9);
            bArr2[i8] = b2;
            int i10 = (b2 + 8) >> 4;
            bArr2[i8] = (byte) (b2 - (i10 << 4));
            i8++;
            i9 = i10;
        }
        bArr2[63] = (byte) (bArr2[63] + i9);
        zzhil zzhilVar = new zzhil(zzc);
        zzhin zzhinVar = new zzhin();
        for (i5 = 1; i5 < 64; i5 += 2) {
            zzhij zzhijVar = new zzhij(zzb);
            zzk(zzhijVar, i5 / 2, bArr2[i5]);
            zzhin.zza(zzhinVar, zzhilVar);
            zzg(zzhilVar, zzhinVar, zzhijVar);
        }
        zzhim zzhimVar = new zzhim();
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        for (int i11 = 0; i11 < 64; i11 += 2) {
            zzhij zzhijVar2 = new zzhij(zzb);
            zzk(zzhijVar2, i11 / 2, bArr2[i11]);
            zzhin.zza(zzhinVar, zzhilVar);
            zzg(zzhilVar, zzhinVar, zzhijVar2);
        }
        zzhim zzhimVar2 = new zzhim(zzhilVar);
        long[] jArr = new long[10];
        zzhiv.zzf(jArr, zzhimVar2.zza);
        long[] jArr2 = new long[10];
        zzhiv.zzf(jArr2, zzhimVar2.zzb);
        long[] jArr3 = new long[10];
        zzhiv.zzf(jArr3, zzhimVar2.zzc);
        long[] jArr4 = new long[10];
        zzhiv.zzf(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhiv.zzb(jArr5, jArr2, jArr);
        zzhiv.zze(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhiv.zze(jArr6, jArr, jArr2);
        zzhiv.zze(jArr6, jArr6, zzhiq.zza);
        zzhiv.zza(jArr6, jArr6, jArr4);
        zzhiv.zzc(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhiv.zzh(jArr5), zzhiv.zzh(jArr6))) {
            return zzhimVar2.zzb();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] zzb(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i5 = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i5;
        digest[31] = (byte) (i5 | 64);
        return digest;
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte b2;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i5 = 31;
        while (true) {
            if (i5 < 0) {
                break;
            }
            int i6 = copyOfRange[i5] & 255;
            int i7 = zza[i5] & 255;
            if (i6 == i7) {
                i5--;
                bArr4 = bArr2;
                bArr5 = bArr3;
            } else if (i6 < i7) {
                MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr5);
                messageDigest.update(bArr);
                byte[] digest = messageDigest.digest();
                long zzn = zzn(digest, 0) & 2097151;
                long zzo = zzo(digest, 2) >> 5;
                long zzn2 = zzn(digest, 5) >> 2;
                long zzo2 = zzo(digest, 7) >> 7;
                long zzo3 = zzo(digest, 10) >> 4;
                long zzn3 = zzn(digest, 13) >> 1;
                long zzo4 = zzo(digest, 15) >> 6;
                long zzn4 = zzn(digest, 18) >> 3;
                long zzn5 = zzn(digest, 21) & 2097151;
                long zzo5 = zzo(digest, 23) >> 5;
                long zzn6 = zzn(digest, 26) >> 2;
                long zzo6 = zzo(digest, 28) >> 7;
                long zzo7 = zzo(digest, 31) >> 4;
                long zzn7 = zzn(digest, 34) >> 1;
                long zzo8 = zzo(digest, 36) >> 6;
                long zzn8 = zzn(digest, 39) >> 3;
                long zzn9 = zzn(digest, 42) & 2097151;
                long zzo9 = zzo(digest, 44) >> 5;
                long zzn10 = (zzn(digest, 47) >> 2) & 2097151;
                long zzo10 = (zzo(digest, 49) >> 7) & 2097151;
                long zzo11 = (zzo(digest, 52) >> 4) & 2097151;
                long zzn11 = (zzn(digest, 55) >> 1) & 2097151;
                long zzo12 = (zzo(digest, 57) >> 6) & 2097151;
                long zzo13 = zzo(digest, 60) >> 3;
                long j2 = (zzo11 * 666643) + zzn5;
                long j5 = (zzo10 * 666643) + zzn4;
                long j6 = (zzn10 * 666643) + (zzo4 & 2097151);
                long j7 = (j6 + 1048576) >> 21;
                long j8 = j7 << 21;
                long j9 = (zzn10 * 654183) + (zzo10 * 470296) + j2;
                long j10 = (j9 + 1048576) >> 21;
                long j11 = j10 << 21;
                long j12 = (zzn10 * 136657) + (((zzo11 * 654183) + ((zzn11 * 470296) + ((zzo12 * 666643) + (zzn6 & 2097151)))) - (zzo10 * 997805));
                long j13 = (j12 + 1048576) >> 21;
                long j14 = j13 << 21;
                long j15 = ((zzo11 * 136657) + (((zzo12 * 654183) + ((zzo13 * 470296) + (zzo7 & 2097151))) - (zzn11 * 997805))) - (zzo10 * 683901);
                long j16 = (j15 + 1048576) >> 21;
                long j17 = ((zzo12 * 136657) + ((zzo8 & 2097151) - (zzo13 * 997805))) - (zzn11 * 683901);
                long j18 = (j17 + 1048576) >> 21;
                long j19 = j18 << 21;
                long j20 = zzn9 - (zzo13 * 683901);
                long j21 = (j20 + 1048576) >> 21;
                long j22 = (zzn10 * 470296) + j5 + j7;
                long j23 = (j22 + 1048576) >> 21;
                long j24 = j23 << 21;
                long j25 = (((zzo10 * 654183) + ((zzo11 * 470296) + ((zzn11 * 666643) + (zzo5 & 2097151)))) - (zzn10 * 997805)) + j10;
                long j26 = (j25 + 1048576) >> 21;
                long j27 = j26 << 21;
                long j28 = (((zzo10 * 136657) + (((zzn11 * 654183) + ((zzo12 * 470296) + ((zzo13 * 666643) + (zzo6 & 2097151)))) - (zzo11 * 997805))) - (zzn10 * 683901)) + j13;
                long j29 = (j28 + 1048576) >> 21;
                long j30 = j29 << 21;
                long j31 = (((zzn11 * 136657) + (((zzo13 * 654183) + (zzn7 & 2097151)) - (zzo12 * 997805))) - (zzo11 * 683901)) + j16;
                long j32 = (j31 + 1048576) >> 21;
                long j33 = (((zzo13 * 136657) + zzn8) - (zzo12 * 683901)) + j18;
                long j34 = (j33 + 1048576) >> 21;
                long j35 = (j15 - (j16 << 21)) + j29;
                long j36 = (j35 * 666643) + zzn;
                long j37 = (j36 + 1048576) >> 21;
                long j38 = j37 << 21;
                long j39 = (j17 - j19) + j32;
                long j40 = j31 - (j32 << 21);
                long j41 = (j35 * 654183) + (j40 * 470296) + (j39 * 666643) + (zzn2 & 2097151);
                long j42 = (j41 + 1048576) >> 21;
                long j43 = j42 << 21;
                long j44 = (j20 - (j21 << 21)) + j34;
                long j45 = j33 - (j34 << 21);
                long j46 = (j35 * 136657) + (((j39 * 654183) + ((j45 * 470296) + ((j44 * 666643) + (zzo3 & 2097151)))) - (j40 * 997805));
                long j47 = (j46 + 1048576) >> 21;
                long j48 = j47 << 21;
                long j49 = (zzo9 & 2097151) + j21;
                long j50 = ((j39 * 136657) + (((j44 * 654183) + ((j49 * 470296) + (j6 - j8))) - (j45 * 997805))) - (j40 * 683901);
                long j51 = (j50 + 1048576) >> 21;
                long j52 = j51 << 21;
                long j53 = ((j44 * 136657) + (((j9 - j11) + j23) - (j49 * 997805))) - (j45 * 683901);
                long j54 = (j53 + 1048576) >> 21;
                long j55 = j54 << 21;
                long j56 = ((j12 - j14) + j26) - (j49 * 683901);
                long j57 = (j56 + 1048576) >> 21;
                long j58 = j57 << 21;
                long j59 = (j35 * 470296) + (j40 * 666643) + (zzo & 2097151) + j37;
                long j60 = (j59 + 1048576) >> 21;
                long j61 = (((j40 * 654183) + ((j39 * 470296) + ((j45 * 666643) + (zzo2 & 2097151)))) - (j35 * 997805)) + j42;
                long j62 = (j61 + 1048576) >> 21;
                long j63 = (((j40 * 136657) + (((j45 * 654183) + ((j44 * 470296) + ((j49 * 666643) + (zzn3 & 2097151)))) - (j39 * 997805))) - (j35 * 683901)) + j47;
                long j64 = (j63 + 1048576) >> 21;
                long j65 = (((j45 * 136657) + (((j49 * 654183) + (j22 - j24)) - (j44 * 997805))) - (j39 * 683901)) + j51;
                long j66 = (j65 + 1048576) >> 21;
                long j67 = (((j49 * 136657) + (j25 - j27)) - (j44 * 683901)) + j54;
                long j68 = (j67 + 1048576) >> 21;
                long j69 = (j28 - j30) + j57;
                long j70 = (j69 + 1048576) >> 21;
                long j71 = j70 << 21;
                long j72 = (j70 * 666643) + (j36 - j38);
                long j73 = j72 >> 21;
                long j74 = j73 << 21;
                long j75 = (j70 * 470296) + (j59 - (j60 << 21)) + j73;
                long j76 = j75 >> 21;
                long j77 = j76 << 21;
                long j78 = (j70 * 654183) + (j41 - j43) + j60 + j76;
                long j79 = j78 >> 21;
                long j80 = j79 << 21;
                long j81 = ((j61 - (j62 << 21)) - (j70 * 997805)) + j79;
                long j82 = j81 >> 21;
                long j83 = j82 << 21;
                long j84 = (j70 * 136657) + (j46 - j48) + j62 + j82;
                long j85 = j84 >> 21;
                long j86 = j85 << 21;
                long j87 = ((j63 - (j64 << 21)) - (j70 * 683901)) + j85;
                long j88 = j87 >> 21;
                long j89 = j88 << 21;
                long j90 = (j50 - j52) + j64 + j88;
                long j91 = j90 >> 21;
                long j92 = j91 << 21;
                long j93 = (j65 - (j66 << 21)) + j91;
                long j94 = j93 >> 21;
                long j95 = j94 << 21;
                long j96 = (j53 - j55) + j66 + j94;
                long j97 = j96 >> 21;
                long j98 = j97 << 21;
                long j99 = (j67 - (j68 << 21)) + j97;
                long j100 = j99 >> 21;
                long j101 = j100 << 21;
                long j102 = (j56 - j58) + j68 + j100;
                long j103 = j102 >> 21;
                long j104 = j103 << 21;
                long j105 = (j69 - j71) + j103;
                long j106 = j105 >> 21;
                long j107 = j106 << 21;
                long j108 = (666643 * j106) + (j72 - j74);
                long j109 = j108 >> 21;
                long j110 = j109 << 21;
                long j111 = (470296 * j106) + (j75 - j77) + j109;
                long j112 = j111 >> 21;
                long j113 = j112 << 21;
                long j114 = (654183 * j106) + (j78 - j80) + j112;
                long j115 = j114 >> 21;
                long j116 = j115 << 21;
                long j117 = ((j81 - j83) - (997805 * j106)) + j115;
                long j118 = j117 >> 21;
                long j119 = j118 << 21;
                long j120 = (136657 * j106) + (j84 - j86) + j118;
                long j121 = j120 >> 21;
                long j122 = j121 << 21;
                long j123 = ((j87 - j89) - (j106 * 683901)) + j121;
                long j124 = j123 >> 21;
                long j125 = j124 << 21;
                long j126 = (j90 - j92) + j124;
                long j127 = j126 >> 21;
                long j128 = j127 << 21;
                long j129 = (j93 - j95) + j127;
                long j130 = j129 >> 21;
                long j131 = j130 << 21;
                long j132 = (j96 - j98) + j130;
                long j133 = j132 >> 21;
                long j134 = j133 << 21;
                long j135 = (j99 - j101) + j133;
                long j136 = j135 >> 21;
                long j137 = j136 << 21;
                long j138 = (j102 - j104) + j136;
                long j139 = j138 >> 21;
                digest[0] = (byte) (j108 - j110);
                long j140 = j129 - j131;
                long j141 = j126 - j128;
                long j142 = j123 - j125;
                long j143 = j120 - j122;
                long j144 = j117 - j119;
                long j145 = j114 - j116;
                long j146 = j111 - j113;
                digest[1] = (byte) (r7 >> 8);
                digest[2] = (byte) ((r7 >> 16) | (j146 << 5));
                digest[3] = (byte) (j146 >> 3);
                digest[4] = (byte) (j146 >> 11);
                digest[5] = (byte) ((j146 >> 19) | (j145 << 2));
                digest[6] = (byte) (j145 >> 6);
                digest[7] = (byte) ((j145 >> 14) | (j144 << 7));
                digest[8] = (byte) (j144 >> 1);
                digest[9] = (byte) (j144 >> 9);
                digest[10] = (byte) ((j144 >> 17) | (j143 << 4));
                digest[11] = (byte) (j143 >> 4);
                digest[12] = (byte) (j143 >> 12);
                digest[13] = (byte) ((j143 >> 20) | (j142 + j142));
                digest[14] = (byte) (j142 >> 7);
                digest[15] = (byte) ((j142 >> 15) | (j141 << 6));
                digest[16] = (byte) (j141 >> 2);
                digest[17] = (byte) (j141 >> 10);
                digest[18] = (byte) ((j141 >> 18) | (j140 << 3));
                long j147 = j138 - (j139 << 21);
                long j148 = (j105 - j107) + j139;
                long j149 = j135 - j137;
                digest[19] = (byte) (j140 >> 5);
                digest[20] = (byte) (j140 >> 13);
                digest[21] = (byte) (j132 - j134);
                digest[22] = (byte) (r7 >> 8);
                digest[23] = (byte) ((r7 >> 16) | (j149 << 5));
                digest[24] = (byte) (j149 >> 3);
                digest[25] = (byte) (j149 >> 11);
                digest[26] = (byte) ((j149 >> 19) | (j147 << 2));
                digest[27] = (byte) (j147 >> 6);
                digest[28] = (byte) ((j147 >> 14) | (j148 << 7));
                digest[29] = (byte) (j148 >> 1);
                digest[30] = (byte) (j148 >> 9);
                digest[31] = (byte) (j148 >> 17);
                long[] jArr = new long[10];
                long[] zzg = zzhiv.zzg(bArr5);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                zzhiv.zzf(jArr4, zzg);
                zzhiv.zze(jArr5, jArr4, zzhiq.zza);
                zzhiv.zzb(jArr4, jArr4, jArr2);
                zzhiv.zza(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                zzhiv.zzf(jArr8, jArr5);
                zzhiv.zze(jArr8, jArr8, jArr5);
                zzhiv.zzf(jArr, jArr8);
                zzhiv.zze(jArr, jArr, jArr5);
                zzhiv.zze(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                zzhiv.zzf(jArr9, jArr);
                zzhiv.zzf(jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr10);
                zzhiv.zze(jArr10, jArr, jArr10);
                zzhiv.zze(jArr9, jArr9, jArr10);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i8 = 1; i8 < 5; i8++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i9 = 1; i9 < 10; i9++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr10, jArr10, jArr9);
                zzhiv.zzf(jArr11, jArr10);
                for (int i10 = 1; i10 < 20; i10++) {
                    zzhiv.zzf(jArr11, jArr11);
                }
                zzhiv.zze(jArr10, jArr11, jArr10);
                zzhiv.zzf(jArr10, jArr10);
                for (int i11 = 1; i11 < 10; i11++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i12 = 1; i12 < 50; i12++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr10, jArr10, jArr9);
                zzhiv.zzf(jArr11, jArr10);
                for (int i13 = 1; i13 < 100; i13++) {
                    zzhiv.zzf(jArr11, jArr11);
                }
                zzhiv.zze(jArr10, jArr11, jArr10);
                zzhiv.zzf(jArr10, jArr10);
                for (int i14 = 1; i14 < 50; i14++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zze(jArr, jArr9, jArr);
                zzhiv.zze(jArr, jArr, jArr8);
                zzhiv.zze(jArr, jArr, jArr4);
                zzhiv.zzf(jArr6, jArr);
                zzhiv.zze(jArr6, jArr6, jArr5);
                zzhiv.zzb(jArr7, jArr6, jArr4);
                if (zze(jArr7)) {
                    zzhiv.zza(jArr7, jArr6, jArr4);
                    if (zze(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    zzhiv.zze(jArr, jArr, zzhiq.zzc);
                }
                if (zze(jArr)) {
                    b2 = 255;
                } else {
                    b2 = 255;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (zzf(jArr) == ((bArr3[31] & b2) >> 7)) {
                    zzm(jArr, jArr);
                }
                zzhiv.zze(jArr3, jArr, zzg);
                zzhin zzhinVar = new zzhin(new zzhim(jArr, zzg, jArr2), jArr3);
                zzhik[] zzhikVarArr = new zzhik[8];
                zzhikVarArr[0] = new zzhik(zzhinVar);
                zzhil zzhilVar = new zzhil(new zzhim(), new long[10]);
                zzi(zzhilVar, zzhinVar.zza);
                zzhin zzhinVar2 = new zzhin(zzhilVar);
                for (int i15 = 1; i15 < 8; i15++) {
                    zzg(zzhilVar, zzhinVar2, zzhikVarArr[i15 - 1]);
                    zzhikVarArr[i15] = new zzhik(new zzhin(zzhilVar));
                }
                byte[] zzl = zzl(digest);
                byte[] zzl2 = zzl(copyOfRange);
                zzhil zzhilVar2 = new zzhil(zzc);
                zzhin zzhinVar3 = new zzhin();
                int i16 = b2;
                while (i16 >= 0 && zzl[i16] == 0 && zzl2[i16] == 0) {
                    i16--;
                }
                while (i16 >= 0) {
                    zzi(zzhilVar2, new zzhim(zzhilVar2));
                    byte b5 = zzl[i16];
                    if (b5 > 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzg(zzhilVar2, zzhinVar3, zzhikVarArr[zzl[i16] / 2]);
                    } else if (b5 < 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzh(zzhilVar2, zzhinVar3, zzhikVarArr[(-zzl[i16]) / 2]);
                    }
                    byte b6 = zzl2[i16];
                    if (b6 > 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzg(zzhilVar2, zzhinVar3, zzhiq.zze[zzl2[i16] / 2]);
                    } else if (b6 < 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzh(zzhilVar2, zzhinVar3, zzhiq.zze[(-zzl2[i16]) / 2]);
                    }
                    i16--;
                }
                byte[] zzb2 = new zzhim(zzhilVar2).zzb();
                for (int i17 = 0; i17 < 32; i17++) {
                    if (zzb2[i17] != bArr2[i17]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void zzd() {
        if (zzhiq.zza == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    public static /* synthetic */ boolean zze(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhiv.zzd(jArr2);
        byte[] zzh = zzhiv.zzh(jArr2);
        for (int i5 = 0; i5 < 32; i5++) {
            if (zzh[i5] != 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int zzf(long[] jArr) {
        return zzhiv.zzh(jArr)[0] & 1;
    }

    private static void zzg(zzhil zzhilVar, zzhin zzhinVar, zzhij zzhijVar) {
        zzhim zzhimVar = zzhinVar.zza;
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhimVar.zzb;
        long[] jArr4 = zzhimVar.zza;
        zzhiv.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhimVar2.zzb;
        zzhiv.zzb(jArr5, jArr3, jArr4);
        zzhiv.zze(jArr5, jArr5, zzhijVar.zzb);
        long[] jArr6 = zzhijVar.zza;
        long[] jArr7 = zzhimVar2.zzc;
        zzhiv.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhilVar.zzb;
        zzhiv.zze(jArr8, zzhinVar.zzb, zzhijVar.zzc);
        zzhijVar.zza(jArr2, zzhimVar.zzc);
        zzhiv.zza(jArr, jArr2, jArr2);
        zzhiv.zzb(jArr2, jArr7, jArr5);
        zzhiv.zza(jArr5, jArr7, jArr5);
        zzhiv.zza(jArr7, jArr, jArr8);
        zzhiv.zzb(jArr8, jArr, jArr8);
    }

    private static void zzh(zzhil zzhilVar, zzhin zzhinVar, zzhij zzhijVar) {
        zzhim zzhimVar = zzhinVar.zza;
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhimVar.zzb;
        long[] jArr4 = zzhimVar.zza;
        zzhiv.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhimVar2.zzb;
        zzhiv.zzb(jArr5, jArr3, jArr4);
        zzhiv.zze(jArr5, jArr5, zzhijVar.zza);
        long[] jArr6 = zzhijVar.zzb;
        long[] jArr7 = zzhimVar2.zzc;
        zzhiv.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhilVar.zzb;
        zzhiv.zze(jArr8, zzhinVar.zzb, zzhijVar.zzc);
        zzhijVar.zza(jArr2, zzhimVar.zzc);
        zzhiv.zza(jArr, jArr2, jArr2);
        zzhiv.zzb(jArr2, jArr7, jArr5);
        zzhiv.zza(jArr5, jArr7, jArr5);
        zzhiv.zzb(jArr7, jArr, jArr8);
        zzhiv.zza(jArr8, jArr, jArr8);
    }

    private static void zzi(zzhil zzhilVar, zzhim zzhimVar) {
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = zzhimVar2.zza;
        long[] jArr2 = zzhimVar.zza;
        long[] jArr3 = new long[10];
        zzhiv.zzf(jArr, jArr2);
        long[] jArr4 = zzhimVar2.zzc;
        long[] jArr5 = zzhimVar.zzb;
        zzhiv.zzf(jArr4, jArr5);
        long[] jArr6 = zzhilVar.zzb;
        zzhiv.zzf(jArr6, zzhimVar.zzc);
        zzhiv.zza(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhimVar2.zzb;
        zzhiv.zza(jArr7, jArr2, jArr5);
        zzhiv.zzf(jArr3, jArr7);
        zzhiv.zza(jArr7, jArr4, jArr);
        zzhiv.zzb(jArr4, jArr4, jArr);
        zzhiv.zzb(jArr, jArr3, jArr7);
        zzhiv.zzb(jArr6, jArr6, jArr4);
    }

    private static int zzj(int i5, int i6) {
        int i7 = (~(i5 ^ i6)) & 255;
        int i8 = i7 & (i7 << 4);
        int i9 = i8 & (i8 << 2);
        return (i9 & (i9 + i9)) >> 7;
    }

    private static void zzk(zzhij zzhijVar, int i5, byte b2) {
        zzhij[][] zzhijVarArr = zzhiq.zzd;
        int i6 = (b2 & 255) >> 7;
        int i7 = (-i6) & b2;
        int i8 = b2 - (i7 + i7);
        zzhijVar.zzb(zzhijVarArr[i5][0], zzj(i8, 1));
        zzhijVar.zzb(zzhijVarArr[i5][1], zzj(i8, 2));
        zzhijVar.zzb(zzhijVarArr[i5][2], zzj(i8, 3));
        zzhijVar.zzb(zzhijVarArr[i5][3], zzj(i8, 4));
        zzhijVar.zzb(zzhijVarArr[i5][4], zzj(i8, 5));
        zzhijVar.zzb(zzhijVarArr[i5][5], zzj(i8, 6));
        zzhijVar.zzb(zzhijVarArr[i5][6], zzj(i8, 7));
        zzhijVar.zzb(zzhijVarArr[i5][7], zzj(i8, 8));
        long[] jArr = zzhijVar.zzc;
        long[] jArr2 = zzhijVar.zza;
        long[] copyOf = Arrays.copyOf(zzhijVar.zzb, 10);
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] copyOf3 = Arrays.copyOf(jArr, 10);
        zzm(copyOf3, copyOf3);
        zzhijVar.zzb(new zzhij(copyOf, copyOf2, copyOf3), i6);
    }

    private static byte[] zzl(byte[] bArr) {
        int i5;
        byte[] bArr2 = new byte[256];
        for (int i6 = 0; i6 < 256; i6++) {
            bArr2[i6] = (byte) (1 & ((bArr[i6 >> 3] & 255) >> (i6 & 7)));
        }
        for (int i7 = 0; i7 < 256; i7++) {
            if (bArr2[i7] != 0) {
                for (int i8 = 1; i8 <= 6 && (i5 = i7 + i8) < 256; i8++) {
                    byte b2 = bArr2[i5];
                    if (b2 != 0) {
                        byte b5 = bArr2[i7];
                        int i9 = b2 << i8;
                        int i10 = b5 + i9;
                        if (i10 <= 15) {
                            bArr2[i7] = (byte) i10;
                            bArr2[i5] = 0;
                        } else {
                            int i11 = b5 - i9;
                            if (i11 >= -15) {
                                bArr2[i7] = (byte) i11;
                                while (true) {
                                    if (i5 >= 256) {
                                        break;
                                    }
                                    if (bArr2[i5] == 0) {
                                        bArr2[i5] = 1;
                                        break;
                                    }
                                    bArr2[i5] = 0;
                                    i5++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void zzm(long[] jArr, long[] jArr2) {
        for (int i5 = 0; i5 < jArr2.length; i5++) {
            jArr[i5] = -jArr2[i5];
        }
    }

    private static long zzn(byte[] bArr, int i5) {
        return ((bArr[i5 + 2] & 255) << 16) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8);
    }

    private static long zzo(byte[] bArr, int i5) {
        return ((bArr[i5 + 3] & 255) << 24) | zzn(bArr, i5);
    }
}
