package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzare {
    public static X509Certificate[][] zza(String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair zza = zzarf.zza(randomAccessFile2);
            try {
                if (zza == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                    sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb.append(length);
                    sb.append(" bytes");
                    throw new zzarb(sb.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) zza.first;
                long longValue = ((Long) zza.second).longValue();
                long j2 = (-20) + longValue;
                if (j2 >= 0) {
                    randomAccessFile2.seek(j2);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzarb("ZIP64 APK not supported");
                    }
                }
                long zzb = zzarf.zzb(byteBuffer);
                if (zzb >= longValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 82 + String.valueOf(longValue).length());
                    sb2.append("ZIP Central Directory offset out of range: ");
                    sb2.append(zzb);
                    sb2.append(". ZIP End of Central Directory offset: ");
                    sb2.append(longValue);
                    throw new zzarb(sb2.toString());
                }
                if (zzarf.zzd(byteBuffer) + zzb != longValue) {
                    throw new zzarb("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (zzb < 32) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(zzb).length() + 67);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(zzb);
                    throw new zzarb(sb3.toString());
                }
                ByteBuffer allocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder);
                randomAccessFile2.seek(zzb - allocate.capacity());
                randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                    throw new zzarb("No APK Signing Block before ZIP Central Directory");
                }
                long j5 = zzb;
                long j6 = allocate.getLong(0);
                if (j6 < allocate.capacity() || j6 > 2147483639) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j6).length() + 37);
                    sb4.append("APK Signing Block size out of range: ");
                    sb4.append(j6);
                    throw new zzarb(sb4.toString());
                }
                int i5 = (int) (8 + j6);
                long j7 = j5 - i5;
                if (j7 < 0) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j7).length() + 39);
                    sb5.append("APK Signing Block offset out of range: ");
                    sb5.append(j7);
                    throw new zzarb(sb5.toString());
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(i5);
                allocate2.order(byteOrder);
                randomAccessFile2.seek(j7);
                randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                long j8 = allocate2.getLong(0);
                if (j8 != j6) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j8).length() + 63 + String.valueOf(j6).length());
                    sb6.append("APK Signing Block sizes in header and footer do not match: ");
                    sb6.append(j8);
                    sb6.append(" vs ");
                    sb6.append(j6);
                    throw new zzarb(sb6.toString());
                }
                Pair create = Pair.create(allocate2, Long.valueOf(j7));
                ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                long longValue2 = ((Long) create.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int capacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (capacity < 8) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(capacity).length() + 17);
                    sb7.append("end < start: ");
                    sb7.append(capacity);
                    sb7.append(" < 8");
                    throw new IllegalArgumentException(sb7.toString());
                }
                int capacity2 = byteBuffer2.capacity();
                if (capacity > byteBuffer2.capacity()) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(capacity).length() + 19 + String.valueOf(capacity2).length());
                    sb8.append("end > capacity: ");
                    sb8.append(capacity);
                    sb8.append(" > ");
                    sb8.append(capacity2);
                    throw new IllegalArgumentException(sb8.toString());
                }
                int limit = byteBuffer2.limit();
                int position = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(capacity);
                    byteBuffer2.position(8);
                    ByteBuffer slice = byteBuffer2.slice();
                    slice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(limit);
                    byteBuffer2.position(position);
                    int i6 = 0;
                    while (slice.hasRemaining()) {
                        i6++;
                        if (slice.remaining() < 8) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i6).length() + 59);
                            sb9.append("Insufficient data to read size of APK Signing Block entry #");
                            sb9.append(i6);
                            throw new zzarb(sb9.toString());
                        }
                        long j9 = slice.getLong();
                        if (j9 < 4 || j9 > 2147483647L) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i6).length() + 45 + String.valueOf(j9).length());
                            sb10.append("APK Signing Block entry #");
                            sb10.append(i6);
                            sb10.append(" size out of range: ");
                            sb10.append(j9);
                            throw new zzarb(sb10.toString());
                        }
                        int i7 = (int) j9;
                        int position2 = slice.position() + i7;
                        if (i7 > slice.remaining()) {
                            int remaining = slice.remaining();
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i6).length() + 45 + String.valueOf(i7).length() + 13 + String.valueOf(remaining).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i6);
                            sb11.append(" size out of range: ");
                            sb11.append(i7);
                            sb11.append(", available: ");
                            sb11.append(remaining);
                            throw new zzarb(sb11.toString());
                        }
                        if (slice.getInt() == 1896449818) {
                            X509Certificate[][] zzb2 = zzb(randomAccessFile.getChannel(), new zzara(zzi(slice, i7 - 4), longValue2, j5, longValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return zzb2;
                        }
                        long j10 = j5;
                        slice.position(position2);
                        j5 = j10;
                    }
                    throw new zzarb("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(limit);
                    byteBuffer2.position(position);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = randomAccessFile2;
        }
    }

    private static X509Certificate[][] zzb(FileChannel fileChannel, zzara zzaraVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer zzj = zzj(zzaraVar.zza());
                int i5 = 0;
                while (zzj.hasRemaining()) {
                    i5++;
                    try {
                        arrayList.add(zzc(zzj(zzj), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e4) {
                        throw new SecurityException(u.m(new StringBuilder(String.valueOf(i5).length() + 37), "Failed to parse/verify signer #", i5, " block"), e4);
                    }
                }
                if (i5 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzd(hashMap, fileChannel, zzaraVar.zzb(), zzaraVar.zzc(), zzaraVar.zzd(), zzaraVar.zze());
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e5) {
                throw new SecurityException("Failed to read list of signers", e5);
            }
        } catch (CertificateException e6) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = zzf(r6);
        r12 = zzf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static X509Certificate[] zzc(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer zzj = zzj(byteBuffer);
        ByteBuffer zzj2 = zzj(byteBuffer);
        byte[] zzk = zzk(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i5 = -1;
        int i6 = 0;
        while (zzj2.hasRemaining()) {
            i6++;
            try {
                ByteBuffer zzj3 = zzj(zzj2);
                if (zzj3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i7 = zzj3.getInt();
                arrayList.add(Integer.valueOf(i7));
                if (i7 != 513 && i7 != 514 && i7 != 769) {
                    switch (i7) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = zzk(zzj3);
                i5 = i7;
            } catch (IOException e4) {
                e = e4;
                throw new SecurityException(u.l(new StringBuilder(String.valueOf(i6).length() + 34), "Failed to parse signature record #", i6), e);
            } catch (BufferUnderflowException e5) {
                e = e5;
                throw new SecurityException(u.l(new StringBuilder(String.valueOf(i6).length() + 34), "Failed to parse signature record #", i6), e);
            }
        }
        if (i5 == -1) {
            if (i6 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i5 == 513 || i5 == 514) {
            str = "EC";
        } else if (i5 != 769) {
            switch (i5) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i5))));
            }
        } else {
            str = "DSA";
        }
        if (i5 == 513) {
            create = Pair.create("SHA256withECDSA", null);
        } else if (i5 == 514) {
            create = Pair.create("SHA512withECDSA", null);
        } else if (i5 != 769) {
            switch (i5) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i5))));
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(zzk));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(zzj);
            if (!signature.verify(bArr2)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            zzj.clear();
            ByteBuffer zzj4 = zzj(zzj);
            ArrayList arrayList2 = new ArrayList();
            int i8 = 0;
            while (zzj4.hasRemaining()) {
                i8++;
                try {
                    ByteBuffer zzj5 = zzj(zzj4);
                    if (zzj5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i9 = zzj5.getInt();
                    arrayList2.add(Integer.valueOf(i9));
                    if (i9 == i5) {
                        bArr = zzk(zzj5);
                    }
                } catch (IOException e6) {
                    e = e6;
                    throw new IOException(u.l(new StringBuilder(String.valueOf(i8).length() + 31), "Failed to parse digest record #", i8), e);
                } catch (BufferUnderflowException e7) {
                    e = e7;
                    throw new IOException(u.l(new StringBuilder(String.valueOf(i8).length() + 31), "Failed to parse digest record #", i8), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int zzf = zzf(i5);
            byte[] bArr3 = (byte[]) map.put(Integer.valueOf(zzf), bArr);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                throw new SecurityException(zzg(zzf).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer zzj6 = zzj(zzj);
            ArrayList arrayList3 = new ArrayList();
            int i10 = 0;
            while (zzj6.hasRemaining()) {
                i10++;
                byte[] zzk2 = zzk(zzj6);
                try {
                    arrayList3.add(new zzarc((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(zzk2)), zzk2));
                } catch (CertificateException e8) {
                    throw new SecurityException(u.l(new StringBuilder(String.valueOf(i10).length() + 30), "Failed to decode certificate #", i10), e8);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(zzk, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e9) {
            e = e9;
            throw new SecurityException(h1.b(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e10) {
            e = e10;
            throw new SecurityException(h1.b(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            throw new SecurityException(h1.b(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e12) {
            e = e12;
            throw new SecurityException(h1.b(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e13) {
            e = e13;
            throw new SecurityException(h1.b(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    private static void zzd(Map map, FileChannel fileChannel, long j2, long j5, long j6, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzaqz zzaqzVar = new zzaqz(fileChannel, 0L, j2);
        zzaqz zzaqzVar2 = new zzaqz(fileChannel, j5, j6 - j5);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzarf.zzc(duplicate, j2);
        zzaqx zzaqxVar = new zzaqx(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            iArr[i5] = ((Integer) it.next()).intValue();
            i5++;
        }
        try {
            byte[][] zze = zze(iArr, new zzaqy[]{zzaqzVar, zzaqzVar2, zzaqxVar});
            for (int i6 = 0; i6 < size; i6++) {
                int i7 = iArr[i6];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i7)), zze[i6])) {
                    throw new SecurityException(zzg(i7).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e4) {
            throw new SecurityException("Failed to compute digest(s) of contents", e4);
        }
    }

    private static byte[][] zze(int[] iArr, zzaqy[] zzaqyVarArr) {
        long j2;
        int i5;
        int length;
        char c5;
        int i6;
        String str;
        int i7 = 0;
        long j5 = 0;
        while (true) {
            j2 = 1048576;
            i5 = 3;
            if (i7 >= 3) {
                break;
            }
            j5 += (zzaqyVarArr[i7].zza() + 1048575) / 1048576;
            i7++;
        }
        if (j5 >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(j5).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(j5);
            throw new DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i8 = 0;
        while (true) {
            length = iArr.length;
            c5 = 5;
            i6 = 1;
            if (i8 >= length) {
                break;
            }
            int i9 = (int) j5;
            byte[] bArr2 = new byte[(zzh(iArr[i8]) * i9) + 5];
            bArr2[0] = 90;
            zzl(i9, bArr2, 1);
            bArr[i8] = bArr2;
            i8++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i10 = 0;
        while (true) {
            str = " digest not supported";
            if (i10 >= iArr.length) {
                break;
            }
            String zzg = zzg(iArr[i10]);
            try {
                messageDigestArr[i10] = MessageDigest.getInstance(zzg);
                i10++;
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(zzg.concat(" digest not supported"), e4);
            }
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i5) {
            zzaqy zzaqyVar = zzaqyVarArr[i11];
            int i14 = i11;
            long zza = zzaqyVar.zza();
            long j6 = 0;
            while (zza > 0) {
                int i15 = i12;
                String str2 = str;
                int min = (int) Math.min(zza, j2);
                zzl(min, bArr3, i6);
                for (int i16 = 0; i16 < length; i16++) {
                    messageDigestArr[i16].update(bArr3);
                }
                try {
                    zzaqyVar.zzb(messageDigestArr, j6, min);
                    int i17 = 0;
                    while (i17 < iArr.length) {
                        int i18 = iArr[i17];
                        byte[] bArr4 = bArr[i17];
                        int zzh = zzh(i18);
                        char c6 = c5;
                        MessageDigest messageDigest = messageDigestArr[i17];
                        int digest = messageDigest.digest(bArr4, (i15 * zzh) + 5, zzh);
                        if (digest != zzh) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(digest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i17++;
                        c5 = c6;
                    }
                    long j7 = min;
                    j6 += j7;
                    zza -= j7;
                    i12 = i15 + 1;
                    str = str2;
                    j2 = 1048576;
                    i6 = 1;
                } catch (IOException e5) {
                    throw new DigestException(s.c.c(new StringBuilder(String.valueOf(i15).length() + 37 + String.valueOf(i13).length()), "Failed to digest chunk #", i15, " of section #", i13), e5);
                }
            }
            i13++;
            i11 = i14 + 1;
            j2 = 1048576;
            i5 = 3;
            i6 = 1;
        }
        String str3 = str;
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i19 = 0; i19 < iArr.length; i19++) {
            int i20 = iArr[i19];
            byte[] bArr6 = bArr[i19];
            String zzg2 = zzg(i20);
            try {
                bArr5[i19] = MessageDigest.getInstance(zzg2).digest(bArr6);
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(zzg2.concat(str3), e6);
            }
        }
        return bArr5;
    }

    private static int zzf(int i5) {
        if (i5 == 513) {
            return 1;
        }
        if (i5 == 514) {
            return 2;
        }
        if (i5 == 769) {
            return 1;
        }
        switch (i5) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i5))));
        }
    }

    private static String zzg(int i5) {
        if (i5 == 1) {
            return "SHA-256";
        }
        if (i5 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(u.l(new StringBuilder(String.valueOf(i5).length() + 33), "Unknown content digest algorthm: ", i5));
    }

    private static int zzh(int i5) {
        if (i5 == 1) {
            return 32;
        }
        if (i5 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(u.l(new StringBuilder(String.valueOf(i5).length() + 33), "Unknown content digest algorthm: ", i5));
    }

    private static ByteBuffer zzi(ByteBuffer byteBuffer, int i5) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i6 = i5 + position;
        if (i6 < position || i6 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i6);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i6);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzj(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            throw new IOException(u.l(new StringBuilder(String.valueOf(remaining).length() + 82), "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", remaining));
        }
        int i5 = byteBuffer.getInt();
        if (i5 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i5 <= byteBuffer.remaining()) {
            return zzi(byteBuffer, i5);
        }
        int remaining2 = byteBuffer.remaining();
        throw new IOException(s.c.c(new StringBuilder(String.valueOf(i5).length() + 79 + String.valueOf(remaining2).length()), "Length-prefixed field longer than remaining buffer. Field length: ", i5, ", remaining: ", remaining2));
    }

    private static byte[] zzk(ByteBuffer byteBuffer) {
        int i5 = byteBuffer.getInt();
        if (i5 < 0) {
            throw new IOException("Negative length");
        }
        if (i5 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i5];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        throw new IOException(s.c.c(new StringBuilder(String.valueOf(i5).length() + 68 + String.valueOf(remaining).length()), "Underflow while reading length-prefixed value. Length: ", i5, ", available: ", remaining));
    }

    private static void zzl(int i5, byte[] bArr, int i6) {
        bArr[1] = (byte) (i5 & 255);
        bArr[2] = (byte) ((i5 >>> 8) & 255);
        bArr[3] = (byte) ((i5 >>> 16) & 255);
        bArr[4] = (byte) (i5 >> 24);
    }
}
