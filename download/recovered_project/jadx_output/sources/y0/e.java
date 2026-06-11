package y0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final t2.i f3767a = new t2.i(29);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3768b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f3769c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f3770d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3771e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f3772f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f3773g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f3774i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f3775j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) {
        int i5 = 0;
        int i6 = 0;
        for (b bVar : bVarArr) {
            i6 += ((((bVar.f3765g * 2) + 7) & (-8)) / 8) + (bVar.f3763e * 2) + d(bVar.f3759a, bVar.f3760b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f3764f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i6);
        if (Arrays.equals(bArr, f3772f)) {
            int length = bVarArr.length;
            while (i5 < length) {
                b bVar2 = bVarArr[i5];
                q(byteArrayOutputStream, bVar2, d(bVar2.f3759a, bVar2.f3760b, bArr));
                p(byteArrayOutputStream, bVar2);
                i5++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                q(byteArrayOutputStream, bVar3, d(bVar3.f3759a, bVar3.f3760b, bArr));
            }
            int length2 = bVarArr.length;
            while (i5 < length2) {
                p(byteArrayOutputStream, bVarArr[i5]);
                i5++;
            }
        }
        if (byteArrayOutputStream.size() == i6) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i6);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z4 = true;
        for (File file2 : listFiles) {
            z4 = c(file2) && z4;
        }
        return z4;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f3773g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return s.c.d(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i5) {
        byte[] bArr = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            int read = inputStream.read(bArr, i6, i5 - i6);
            if (read < 0) {
                throw new IllegalStateException(u.h(i5, "Not enough bytes to read: "));
            }
            i6 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i5) {
        int[] iArr = new int[i5];
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += (int) m(byteArrayInputStream, 2);
            iArr[i7] = i6;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i5, int i6) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i6];
            byte[] bArr2 = new byte[2048];
            int i7 = 0;
            int i8 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i7 < i5) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i5 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i8 += inflater.inflate(bArr, i8, i6 - i8);
                    i7 += read;
                } catch (DataFormatException e4) {
                    throw new IllegalStateException(e4.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i5 + " actual=" + i7);
        } finally {
            inflater.end();
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f3774i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f3775j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m5 = (int) m(fileInputStream, 2);
            byte[] h5 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h5);
            try {
                b[] k5 = k(byteArrayInputStream, bArr2, m5, bVarArr);
                byteArrayInputStream.close();
                return k5;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f3770d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m6 = (int) m(fileInputStream, 1);
        byte[] h6 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h6);
        try {
            b[] j2 = j(byteArrayInputStream2, m6, bVarArr);
            byteArrayInputStream2.close();
            return j2;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i5, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i5 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i5];
        int[] iArr = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int m5 = (int) m(byteArrayInputStream, 2);
            iArr[i6] = (int) m(byteArrayInputStream, 2);
            strArr[i6] = new String(f(byteArrayInputStream, m5), StandardCharsets.UTF_8);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            b bVar = bVarArr[i7];
            if (!bVar.f3760b.equals(strArr[i7])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i8 = iArr[i7];
            bVar.f3763e = i8;
            bVar.h = g(byteArrayInputStream, i8);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i5, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i5 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m5 = m(byteArrayInputStream, 4);
            int m6 = (int) m(byteArrayInputStream, 2);
            b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i7 = 0;
                while (true) {
                    if (i7 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i7].f3760b.equals(substring)) {
                        bVar = bVarArr[i7];
                        break;
                    }
                    i7++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f3762d = m5;
            int[] g5 = g(byteArrayInputStream, m6);
            if (Arrays.equals(bArr, h)) {
                bVar.f3763e = m6;
                bVar.h = g5;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f3771e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m5 = (int) m(fileInputStream, 1);
        byte[] h5 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h5);
        try {
            b[] n5 = n(byteArrayInputStream, str, m5);
            byteArrayInputStream.close();
            return n5;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i5) {
        byte[] f5 = f(inputStream, i5);
        long j2 = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            j2 += (f5[i6] & 255) << (i6 * 8);
        }
        return j2;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i5) {
        int i6 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            int m5 = (int) m(byteArrayInputStream, 2);
            int m6 = (int) m(byteArrayInputStream, 2);
            bVarArr[i7] = new b(str, new String(f(byteArrayInputStream, m5), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m6, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m6], new TreeMap());
        }
        int i8 = 0;
        while (i8 < i5) {
            b bVar = bVarArr[i8];
            int available = byteArrayInputStream.available();
            int i9 = bVar.f3764f;
            int i10 = bVar.f3765g;
            TreeMap treeMap = bVar.f3766i;
            int i11 = available - i9;
            int i12 = i6;
            while (byteArrayInputStream.available() > i11) {
                i12 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i12), 1);
                int m7 = (int) m(byteArrayInputStream, 2);
                while (m7 > 0) {
                    m(byteArrayInputStream, 2);
                    int m8 = (int) m(byteArrayInputStream, 1);
                    if (m8 != 6 && m8 != 7) {
                        while (m8 > 0) {
                            m(byteArrayInputStream, 1);
                            int i13 = i6;
                            int i14 = i8;
                            for (int m9 = (int) m(byteArrayInputStream, 1); m9 > 0; m9--) {
                                m(byteArrayInputStream, 2);
                            }
                            m8--;
                            i6 = i13;
                            i8 = i14;
                        }
                    }
                    m7--;
                    i6 = i6;
                    i8 = i8;
                }
            }
            int i15 = i6;
            int i16 = i8;
            if (byteArrayInputStream.available() != i11) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.h = g(byteArrayInputStream, bVar.f3763e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i10 * 2) + 7) & (-8)) / 8));
            for (int i17 = i15; i17 < i10; i17++) {
                int i18 = valueOf.get(i17) ? 2 : i15;
                if (valueOf.get(i17 + i10)) {
                    i18 |= 4;
                }
                if (i18 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i17));
                    if (num == null) {
                        num = Integer.valueOf(i15);
                    }
                    treeMap.put(Integer.valueOf(i17), Integer.valueOf(i18 | num.intValue()));
                }
            }
            i8 = i16 + 1;
            i6 = i15;
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f3770d;
        int i5 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f3771e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b2 = b(bVarArr, bArr3);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, b2.length, 4);
                byte[] a5 = a(b2);
                u(byteArrayOutputStream, a5.length, 4);
                byteArrayOutputStream.write(a5);
                return true;
            }
            byte[] bArr4 = f3773g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f3766i.size() * 4;
                    String d5 = d(bVar.f3759a, bVar.f3760b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d5.getBytes(charset).length);
                    v(byteArrayOutputStream, bVar.h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, bVar.f3761c, 4);
                    byteArrayOutputStream.write(d5.getBytes(charset));
                    Iterator it = bVar.f3766i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i6 : bVar.h) {
                        v(byteArrayOutputStream, i6);
                    }
                }
                return true;
            }
            byte[] bArr5 = f3772f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b5 = b(bVarArr, bArr5);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, b5.length, 4);
                byte[] a6 = a(b5);
                u(byteArrayOutputStream, a6.length, 4);
                byteArrayOutputStream.write(a6);
                return true;
            }
            byte[] bArr6 = h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.f3759a;
                TreeMap treeMap = bVar2.f3766i;
                String d6 = d(str, bVar2.f3760b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d6.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, bVar2.h.length);
                u(byteArrayOutputStream, bVar2.f3761c, 4);
                byteArrayOutputStream.write(d6.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i7 : bVar2.h) {
                    v(byteArrayOutputStream, i7);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, bVarArr.length);
            int i8 = 2;
            int i9 = 2;
            for (b bVar3 : bVarArr) {
                u(byteArrayOutputStream2, bVar3.f3761c, 4);
                u(byteArrayOutputStream2, bVar3.f3762d, 4);
                u(byteArrayOutputStream2, bVar3.f3765g, 4);
                String d7 = d(bVar3.f3759a, bVar3.f3760b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d7.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i9 = i9 + 14 + length2;
                byteArrayOutputStream2.write(d7.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i9 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            }
            j jVar = new j(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(jVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i10];
                    v(byteArrayOutputStream3, i10);
                    v(byteArrayOutputStream3, bVar4.f3763e);
                    i11 = i11 + 4 + (bVar4.f3763e * i8);
                    int[] iArr = bVar4.h;
                    int length3 = iArr.length;
                    int i12 = i5;
                    int i13 = i8;
                    int i14 = i12;
                    while (i14 < length3) {
                        int i15 = iArr[i14];
                        v(byteArrayOutputStream3, i15 - i12);
                        i14++;
                        i12 = i15;
                    }
                    i10++;
                    i8 = i13;
                    i5 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
            }
            j jVar2 = new j(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i16 = 0;
            int i17 = 0;
            while (i16 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i16];
                    Iterator it3 = bVar5.f3766i.entrySet().iterator();
                    int i18 = 0;
                    while (it3.hasNext()) {
                        i18 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i18, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i16);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i19 = i17 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i18);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i17 = i19 + length4;
                            i16++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i17 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
            }
            j jVar3 = new j(byteArray5, 4, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar3);
            long j5 = 4;
            long size2 = j5 + j5 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i20 = 0;
            while (i20 < arrayList2.size()) {
                j jVar4 = (j) arrayList2.get(i20);
                int i21 = jVar4.f3784a;
                byte[] bArr7 = jVar4.f3785b;
                if (i21 == 1) {
                    j2 = 0;
                } else if (i21 == 2) {
                    j2 = 1;
                } else if (i21 == 3) {
                    j2 = 2;
                } else if (i21 == 4) {
                    j2 = 3;
                } else {
                    if (i21 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                u(byteArrayOutputStream, j2, 4);
                u(byteArrayOutputStream, size2, 4);
                if (jVar4.f3786c) {
                    long length5 = bArr7.length;
                    byte[] a7 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a7);
                    u(byteArrayOutputStream, a7.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a7.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i20++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        s(byteArrayOutputStream, bVar);
        int i5 = bVar.f3765g;
        int[] iArr = bVar.h;
        int length = iArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int i8 = iArr[i6];
            v(byteArrayOutputStream, i8 - i7);
            i6++;
            i7 = i8;
        }
        byte[] bArr = new byte[(((i5 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f3766i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i9 = intValue / 8;
                bArr[i9] = (byte) (bArr[i9] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i10 = intValue + i5;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, bVar.f3763e);
        u(byteArrayOutputStream, bVar.f3764f, 4);
        u(byteArrayOutputStream, bVar.f3761c, 4);
        u(byteArrayOutputStream, bVar.f3765g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i5, b bVar) {
        int i6 = bVar.f3765g;
        byte[] bArr = new byte[(((Integer.bitCount(i5 & (-2)) * i6) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f3766i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i7 = 0;
            for (int i8 = 1; i8 <= 4; i8 <<= 1) {
                if (i8 != 1 && (i8 & i5) != 0) {
                    if ((i8 & intValue2) == i8) {
                        int i9 = (i7 * i6) + intValue;
                        int i10 = i9 / 8;
                        bArr[i10] = (byte) ((1 << (i9 % 8)) | bArr[i10]);
                    }
                    i7++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i5 = 0;
        for (Map.Entry entry : bVar.f3766i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i5);
                v(byteArrayOutputStream, 0);
                i5 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, d dVar, boolean z4) {
        boolean z5;
        ?? r7;
        byte[] bArr;
        b[] bVarArr;
        b[] bVarArr2;
        b[] bVarArr3;
        byte[] bArr2;
        boolean z6;
        boolean z7;
        Throwable th;
        Throwable th2;
        boolean z8;
        boolean z9;
        ?? r72;
        boolean z10;
        a aVar;
        boolean z11;
        FileInputStream a5;
        boolean z12;
        boolean z13;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z4) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z13 = readLong == packageInfo.lastUpdateTime;
                            if (z13) {
                                dVar.h(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z13) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        i.c(context, false);
                        return;
                    }
                }
                z13 = false;
                if (z13) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            a aVar2 = new a(assets, executor, dVar, name, file2);
            byte[] bArr3 = aVar2.f3754c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        aVar2.b(4, null);
                    }
                    aVar2.f3757f = true;
                    try {
                        try {
                            r7 = aVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e4) {
                            dVar.h(6, e4);
                            r7 = 0;
                            bArr = f3768b;
                            if (r7 != 0) {
                            }
                            bVarArr2 = aVar2.f3758g;
                            if (bVarArr2 != null) {
                            }
                            d dVar2 = aVar2.f3753b;
                            bVarArr3 = aVar2.f3758g;
                            byte[] bArr4 = aVar2.f3754c;
                            boolean z14 = r7;
                            z14 = r7;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = aVar2.h;
                            if (bArr2 != null) {
                            }
                            if (z7) {
                            }
                            z9 = z7;
                            z12 = z8;
                            i.c(context, (z9 || !z4) ? false : z12);
                        } catch (IOException e5) {
                            dVar.h(7, e5);
                            r7 = 0;
                            bArr = f3768b;
                            if (r7 != 0) {
                            }
                            bVarArr2 = aVar2.f3758g;
                            if (bVarArr2 != null) {
                            }
                            d dVar22 = aVar2.f3753b;
                            bVarArr3 = aVar2.f3758g;
                            byte[] bArr42 = aVar2.f3754c;
                            boolean z142 = r7;
                            z142 = r7;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = aVar2.h;
                            if (bArr2 != null) {
                            }
                            if (z7) {
                            }
                            z9 = z7;
                            z12 = z8;
                            i.c(context, (z9 || !z4) ? false : z12);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e6) {
                                    dVar.h(8, e6);
                                    try {
                                        r7.close();
                                    } catch (IOException e7) {
                                        dVar.h(7, e7);
                                    }
                                    bVarArr = null;
                                    aVar2.f3758g = bVarArr;
                                    bVarArr2 = aVar2.f3758g;
                                    if (bVarArr2 != null) {
                                    }
                                    d dVar222 = aVar2.f3753b;
                                    bVarArr3 = aVar2.f3758g;
                                    byte[] bArr422 = aVar2.f3754c;
                                    boolean z1422 = r7;
                                    z1422 = r7;
                                    if (bVarArr3 != null) {
                                    }
                                    bArr2 = aVar2.h;
                                    if (bArr2 != null) {
                                    }
                                    if (z7) {
                                    }
                                    z9 = z7;
                                    z12 = z8;
                                    i.c(context, (z9 || !z4) ? false : z12);
                                }
                            } catch (IOException e8) {
                                dVar.h(7, e8);
                                r7.close();
                                bVarArr = null;
                                aVar2.f3758g = bVarArr;
                                bVarArr2 = aVar2.f3758g;
                                if (bVarArr2 != null) {
                                }
                                d dVar2222 = aVar2.f3753b;
                                bVarArr3 = aVar2.f3758g;
                                byte[] bArr4222 = aVar2.f3754c;
                                boolean z14222 = r7;
                                z14222 = r7;
                                if (bVarArr3 != null) {
                                }
                                bArr2 = aVar2.h;
                                if (bArr2 != null) {
                                }
                                if (z7) {
                                }
                                z9 = z7;
                                z12 = z8;
                                i.c(context, (z9 || !z4) ? false : z12);
                            }
                            if (!Arrays.equals(bArr, f(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            bVarArr = l(r7, f(r7, 4), aVar2.f3756e);
                            try {
                                r7.close();
                            } catch (IOException e9) {
                                dVar.h(7, e9);
                            }
                            aVar2.f3758g = bVarArr;
                        }
                        bVarArr2 = aVar2.f3758g;
                        if (bVarArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                r7 = "dexopt/baseline.profm";
                                a5 = aVar2.a(assets, "dexopt/baseline.profm");
                                z11 = r7;
                            } catch (FileNotFoundException e10) {
                                dVar.h(9, e10);
                                z11 = r7;
                            } catch (IOException e11) {
                                dVar.h(7, e11);
                                z11 = r7;
                            } catch (IllegalStateException e12) {
                                aVar2.f3758g = null;
                                dVar.h(8, e12);
                                z11 = r7;
                            }
                            if (a5 == null) {
                                try {
                                    if (!Arrays.equals(f3769c, f(a5, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] f5 = f(a5, 4);
                                    aVar2.f3758g = i(a5, f5, bArr3, bVarArr2);
                                    a5.close();
                                    aVar = aVar2;
                                    r7 = f5;
                                    if (aVar != null) {
                                        aVar2 = aVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a5 != null) {
                                    a5.close();
                                    z11 = r7;
                                }
                                aVar = null;
                                r7 = z11;
                                if (aVar != null) {
                                }
                            }
                        }
                        d dVar22222 = aVar2.f3753b;
                        bVarArr3 = aVar2.f3758g;
                        byte[] bArr42222 = aVar2.f3754c;
                        boolean z142222 = r7;
                        z142222 = r7;
                        if (bVarArr3 != null && bArr42222 != null) {
                            r72 = aVar2.f3757f;
                            if (r72 != 0) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                r72 = new ByteArrayOutputStream();
                                try {
                                    r72.write(bArr);
                                    r72.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e13) {
                                dVar22222.h(7, e13);
                                z10 = r72;
                            } catch (IllegalStateException e14) {
                                dVar22222.h(8, e14);
                                z10 = r72;
                            }
                            if (o(r72, bArr42222, bVarArr3)) {
                                aVar2.h = r72.toByteArray();
                                r72.close();
                                z10 = r72;
                                aVar2.f3758g = null;
                                z142222 = z10;
                            } else {
                                dVar22222.h(5, null);
                                aVar2.f3758g = null;
                                r72.close();
                                z142222 = r72;
                            }
                        }
                        bArr2 = aVar2.h;
                        if (bArr2 != null) {
                            z7 = false;
                            z8 = true;
                        } else {
                            try {
                                if (!aVar2.f3757f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(aVar2.f3755d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z8 = true;
                                                                                aVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                aVar2.h = null;
                                                                                aVar2.f3758g = null;
                                                                                z7 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e15) {
                                        e = e15;
                                        aVar2.b(6, e);
                                        z6 = z142222;
                                        z7 = false;
                                        z8 = z6;
                                        if (z7) {
                                        }
                                        z9 = z7;
                                        z12 = z8;
                                        i.c(context, (z9 || !z4) ? false : z12);
                                    } catch (IOException e16) {
                                        e = e16;
                                        aVar2.b(7, e);
                                        z6 = z142222;
                                        z7 = false;
                                        z8 = z6;
                                        if (z7) {
                                        }
                                        z9 = z7;
                                        z12 = z8;
                                        i.c(context, (z9 || !z4) ? false : z12);
                                    }
                                } catch (FileNotFoundException e17) {
                                    e = e17;
                                    z142222 = true;
                                    aVar2.b(6, e);
                                    z6 = z142222;
                                    z7 = false;
                                    z8 = z6;
                                    if (z7) {
                                    }
                                    z9 = z7;
                                    z12 = z8;
                                    i.c(context, (z9 || !z4) ? false : z12);
                                } catch (IOException e18) {
                                    e = e18;
                                    z142222 = true;
                                    aVar2.b(7, e);
                                    z6 = z142222;
                                    z7 = false;
                                    z8 = z6;
                                    if (z7) {
                                    }
                                    z9 = z7;
                                    z12 = z8;
                                    i.c(context, (z9 || !z4) ? false : z12);
                                }
                            } finally {
                                aVar2.h = null;
                                aVar2.f3758g = null;
                            }
                        }
                        if (z7) {
                            e(packageInfo, filesDir);
                        }
                        z9 = z7;
                        z12 = z8;
                    } finally {
                    }
                    bArr = f3768b;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            aVar2.b(4, null);
                        }
                        aVar2.f3757f = true;
                        r7 = aVar2.a(assets, "dexopt/baseline.prof");
                        bArr = f3768b;
                        if (r7 != 0) {
                        }
                        bVarArr2 = aVar2.f3758g;
                        if (bVarArr2 != null) {
                            r7 = "dexopt/baseline.profm";
                            a5 = aVar2.a(assets, "dexopt/baseline.profm");
                            z11 = r7;
                            if (a5 == null) {
                            }
                        }
                        d dVar222222 = aVar2.f3753b;
                        bVarArr3 = aVar2.f3758g;
                        byte[] bArr422222 = aVar2.f3754c;
                        boolean z1422222 = r7;
                        z1422222 = r7;
                        if (bVarArr3 != null) {
                            r72 = aVar2.f3757f;
                            if (r72 != 0) {
                            }
                        }
                        bArr2 = aVar2.h;
                        if (bArr2 != null) {
                        }
                        if (z7) {
                        }
                        z9 = z7;
                        z12 = z8;
                    } catch (IOException unused2) {
                        z5 = true;
                        aVar2.b(4, null);
                    }
                }
                i.c(context, (z9 || !z4) ? false : z12);
            }
            aVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z5 = true;
            z9 = false;
            z12 = z5;
            i.c(context, (z9 || !z4) ? false : z12);
        } catch (PackageManager.NameNotFoundException e19) {
            dVar.h(7, e19);
            i.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j2, int i5) {
        byte[] bArr = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i6] = (byte) ((j2 >> (i6 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i5) {
        u(byteArrayOutputStream, i5, 2);
    }
}
