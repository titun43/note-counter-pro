package y4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.activity.k;
import androidx.emoji2.text.u;
import androidx.emoji2.text.v;
import androidx.emoji2.text.w;
import androidx.fragment.app.g1;
import androidx.fragment.app.h1;
import androidx.fragment.app.x;
import b3.g;
import com.google.android.gms.ads.RequestConfiguration;
import f4.p;
import g4.i;
import g4.m;
import i0.c;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q.l;
import r3.a0;
import r3.d;
import r3.e;
import r3.z;
import t3.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Field f3880a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3881b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f3882c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3883d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f3884e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3885f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f3886g;
    public static boolean h;

    public b(g1 g1Var) {
        i.e(g1Var, "operation");
    }

    public static MappedByteBuffer A(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void B(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float C(EdgeEffect edgeEffect, float f5, float f6) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.c(edgeEffect, f5, f6);
        }
        i0.b.a(edgeEffect, f5, f6);
        return f5;
    }

    public static final String D(byte[] bArr, int i5, e eVar) {
        if (i5 <= 0) {
            return null;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i5);
        i.d(copyOf, "copyOf(...)");
        return eVar instanceof d ? new String(copyOf, ((d) eVar).f3176b) : Base64.encodeToString(copyOf, 2);
    }

    public static boolean G(Parcel parcel, int i5) {
        R(parcel, i5, 4);
        return parcel.readInt() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[EDGE_INSN: B:30:0x0096->B:22:0x0096 BREAK  A[LOOP:0: B:16:0x0085->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009e -> B:11:0x00cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00be -> B:10:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(InputStream inputStream, z zVar, int i5, p pVar, y3.c cVar) {
        q3.a aVar;
        int i6;
        m mVar;
        m mVar2;
        InputStream inputStream2;
        int i7;
        p pVar2;
        int i8;
        z zVar2;
        int min;
        byte[] bArr;
        int i9;
        int read;
        String D;
        if (cVar instanceof q3.a) {
            aVar = (q3.a) cVar;
            int i10 = aVar.f3097o;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f3097o = i10 - Integer.MIN_VALUE;
                Object obj = aVar.f3096n;
                x3.a aVar2 = x3.a.f3712g;
                i6 = aVar.f3097o;
                if (i6 != 0) {
                    g.x(obj);
                    int i11 = zVar.f3214b;
                    int i12 = zVar.f3215c;
                    int min2 = Math.min(i11, Math.min(inputStream.available() - i12, zVar.f3216d));
                    if (min2 < i5) {
                        min2 = i5;
                    }
                    if (i.a(zVar.f3213a, r3.c.f3171b)) {
                        min2 = (min2 - (min2 % 3)) + 3;
                    }
                    a(inputStream, i12);
                    mVar = new m();
                    mVar2 = new m();
                    inputStream2 = inputStream;
                    i7 = min2;
                    pVar2 = pVar;
                    i8 = i5;
                    zVar2 = zVar;
                    min = Math.min(i7, zVar2.f3216d - mVar2.f1703g);
                    bArr = new byte[min];
                    i9 = 0;
                    do {
                        read = inputStream2.read(bArr, i9, Math.min(min - i9, i8));
                        if (read > 0) {
                        }
                        if (read > 0) {
                        }
                    } while (i9 < min);
                    mVar.f1703g = i9;
                    D = D(bArr, i9, zVar2.f3213a);
                    if (D != null) {
                    }
                    if (mVar.f1703g > 0) {
                    }
                    return h.f3400a;
                }
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i7 = aVar.f3095m;
                int i13 = aVar.f3094l;
                m mVar3 = aVar.f3093k;
                m mVar4 = aVar.f3092j;
                p pVar3 = aVar.f3091i;
                z zVar3 = aVar.h;
                InputStream inputStream3 = aVar.f3090g;
                g.x(obj);
                z zVar4 = zVar3;
                mVar2 = mVar3;
                zVar2 = zVar4;
                pVar2 = pVar3;
                mVar = mVar4;
                i8 = i13;
                inputStream2 = inputStream3;
                if (mVar.f1703g > 0 || mVar2.f1703g >= zVar2.f3216d) {
                    return h.f3400a;
                }
                min = Math.min(i7, zVar2.f3216d - mVar2.f1703g);
                bArr = new byte[min];
                i9 = 0;
                do {
                    read = inputStream2.read(bArr, i9, Math.min(min - i9, i8));
                    if (read > 0) {
                        i9 += read;
                    }
                    if (read > 0) {
                        break;
                    }
                } while (i9 < min);
                mVar.f1703g = i9;
                D = D(bArr, i9, zVar2.f3213a);
                if (D != null) {
                    mVar2.f1703g += mVar.f1703g;
                    aVar.f3090g = inputStream2;
                    aVar.h = zVar2;
                    aVar.f3091i = pVar2;
                    aVar.f3092j = mVar;
                    aVar.f3093k = mVar2;
                    aVar.f3094l = i8;
                    aVar.f3095m = i7;
                    aVar.f3097o = 1;
                    if (pVar2.invoke(D, aVar) == aVar2) {
                        return aVar2;
                    }
                    m mVar5 = mVar2;
                    zVar3 = zVar2;
                    mVar3 = mVar5;
                    inputStream3 = inputStream2;
                    i13 = i8;
                    mVar4 = mVar;
                    pVar3 = pVar2;
                    z zVar42 = zVar3;
                    mVar2 = mVar3;
                    zVar2 = zVar42;
                    pVar2 = pVar3;
                    mVar = mVar4;
                    i8 = i13;
                    inputStream2 = inputStream3;
                }
                if (mVar.f1703g > 0) {
                }
                return h.f3400a;
            }
        }
        aVar = new q3.a(cVar);
        Object obj2 = aVar.f3096n;
        x3.a aVar22 = x3.a.f3712g;
        i6 = aVar.f3097o;
        if (i6 != 0) {
        }
    }

    public static float I(Parcel parcel, int i5) {
        R(parcel, i5, 4);
        return parcel.readFloat();
    }

    public static final String J(InputStream inputStream, a0 a0Var) {
        i.e(a0Var, "options");
        e eVar = a0Var.f3165a;
        a(inputStream, a0Var.f3166b);
        int i5 = a0Var.f3167c;
        if (1 <= i5 && i5 < Integer.MAX_VALUE) {
            String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            int i6 = 0;
            do {
                int min = Math.min(i.a(eVar, r3.c.f3171b) ? 8193 : 8192, i5 - i6);
                byte[] bArr = new byte[min];
                int i7 = 0;
                do {
                    int read = inputStream.read(bArr, i7, Math.min(min - i7, min));
                    if (read > 0) {
                        i7 += read;
                    }
                    if (read <= 0) {
                        break;
                    }
                } while (i7 < min);
                String D = D(bArr, i7, eVar);
                if (D != null) {
                    i6 += i7;
                    str = ((Object) str) + D;
                }
                if (i7 <= 0) {
                    break;
                }
            } while (i6 < i5);
            return str;
        }
        if (!(eVar instanceof d)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
            z2.b.e(inputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            i.d(byteArray, "toByteArray(...)");
            String encodeToString = Base64.encodeToString(byteArray, 2);
            i.b(encodeToString);
            return encodeToString;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, ((d) eVar).f3176b);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int read2 = inputStreamReader.read(cArr); read2 >= 0; read2 = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read2);
            }
            String stringWriter2 = stringWriter.toString();
            i.d(stringWriter2, "toString(...)");
            inputStreamReader.close();
            return stringWriter2;
        } finally {
        }
    }

    public static IBinder K(Parcel parcel, int i5) {
        int N = N(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + N);
        return readStrongBinder;
    }

    public static int L(Parcel parcel, int i5) {
        R(parcel, i5, 4);
        return parcel.readInt();
    }

    public static long M(Parcel parcel, int i5) {
        R(parcel, i5, 8);
        return parcel.readLong();
    }

    public static int N(Parcel parcel, int i5) {
        return (i5 & (-65536)) != -65536 ? (char) (i5 >> 16) : parcel.readInt();
    }

    public static void O(Window window) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            b0.a.h(window);
        } else if (i5 >= 30) {
            b0.a.g(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }

    public static void P(Parcel parcel, int i5) {
        parcel.setDataPosition(parcel.dataPosition() + N(parcel, i5));
    }

    public static int Q(Parcel parcel) {
        int readInt = parcel.readInt();
        int N = N(parcel, readInt);
        char c5 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c5 != 20293) {
            throw new x("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i5 = N + dataPosition;
        if (i5 >= dataPosition && i5 <= parcel.dataSize()) {
            return i5;
        }
        throw new x(s.c.c(new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i5).length()), "Size read is invalid start=", dataPosition, " end=", i5), parcel);
    }

    public static void R(Parcel parcel, int i5, int i6) {
        int N = N(parcel, i5);
        if (N == i6) {
            return;
        }
        String hexString = Integer.toHexString(N);
        int length = String.valueOf(i6).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(N).length() + 4 + 1);
        u.s(sb, "Expected size ", i6, " got ", N);
        throw new x(h1.b(sb, " (0x", hexString, ")"), parcel);
    }

    public static final void a(InputStream inputStream, int i5) {
        if (i5 <= 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            inputStream.skipNBytes(i5);
            return;
        }
        long j2 = i5;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    throw new EOFException("Reached end of stream with " + j2 + " bytes left to skip");
                }
                j2--;
            }
        }
    }

    public static l b(o4.z zVar) {
        return a.a.l(new com.getcapacitor.plugin.c(zVar, 9));
    }

    public static Object f(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean i(File file, Resources resources, int i5) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i5);
            try {
                boolean j2 = j(file, inputStream);
                h(inputStream);
                return j2;
            } catch (Throwable th) {
                th = th;
                h(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean j(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w k(Context context) {
        ProviderInfo providerInfo;
        c0.e eVar;
        ApplicationInfo applicationInfo;
        t2.i dVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.d(1) : new t2.i(1);
        PackageManager packageManager = context.getPackageManager();
        g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] r2 = dVar.r(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : r2) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new c0.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e4);
            }
            if (eVar != null) {
                return null;
            }
            return new w(new v(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public static Bundle l(Parcel parcel, int i5) {
        int N = N(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + N);
        return readBundle;
    }

    public static byte[] m(Parcel parcel, int i5) {
        int N = N(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + N);
        return createByteArray;
    }

    public static Parcelable n(Parcel parcel, int i5, Parcelable.Creator creator) {
        int N = N(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + N);
        return parcelable;
    }

    public static String o(Parcel parcel, int i5) {
        int N = N(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + N);
        return readString;
    }

    public static String[] p(Parcel parcel, int i5) {
        int N = N(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + N);
        return createStringArray;
    }

    public static ArrayList q(Parcel parcel, int i5) {
        int N = N(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + N);
        return createStringArrayList;
    }

    public static Object[] r(Parcel parcel, int i5, Parcelable.Creator creator) {
        int N = N(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + N);
        return createTypedArray;
    }

    public static ArrayList s(Parcel parcel, int i5, Parcelable.Creator creator) {
        int N = N(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + N);
        return createTypedArrayList;
    }

    public static void t(Parcel parcel, int i5) {
        if (parcel.dataPosition() != i5) {
            throw new x(u.l(new StringBuilder(String.valueOf(i5).length() + 26), "Overread allowed size end=", i5), parcel);
        }
    }

    public static float u(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Object v(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return k.b(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (d.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static File w(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i5 = 0; i5 < 100; i5++) {
            File file = new File(cacheDir, str + i5);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static List y(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static String z(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            sb.append(str.charAt(i5));
            if (str2.length() > i5) {
                sb.append(str2.charAt(i5));
            }
        }
        return sb.toString();
    }

    public abstract void E(v1.g gVar, v1.g gVar2);

    public abstract void F(v1.g gVar, Thread thread);

    public abstract boolean c(v1.h hVar, v1.c cVar, v1.c cVar2);

    public abstract boolean d(v1.h hVar, Object obj, Object obj2);

    public abstract boolean e(v1.h hVar, v1.g gVar, v1.g gVar2);

    public boolean x() {
        throw null;
    }
}
