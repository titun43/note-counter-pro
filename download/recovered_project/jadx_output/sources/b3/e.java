package b3;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.emoji2.text.u;
import androidx.work.n;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.common.zzc;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f719d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f720e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f721f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f722g = -1;
    public static Boolean h;

    /* renamed from: l, reason: collision with root package name */
    public static k f726l;

    /* renamed from: m, reason: collision with root package name */
    public static l f727m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f728a;

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f723i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static final i f724j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final t2.i f725k = new t2.i(8);

    /* renamed from: b, reason: collision with root package name */
    public static final t2.i f717b = new t2.i(9);

    /* renamed from: c, reason: collision with root package name */
    public static final t2.i f718c = new t2.i(10);

    public e(Context context) {
        this.f728a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (b0.j(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e4) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02fd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x030c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0303 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r7v1, types: [b3.i, java.lang.ThreadLocal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e c(Context context, t2.i iVar, String str) {
        Context context2;
        int i5;
        e eVar;
        int i6;
        Context context3;
        a3.a a5;
        l lVar;
        boolean z4;
        a3.a a6;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = f723i;
        j jVar = (j) threadLocal.get();
        j jVar2 = new j();
        threadLocal.set(jVar2);
        ?? r7 = f724j;
        Long l5 = (Long) r7.get();
        long longValue = l5.longValue();
        try {
            r7.set(Long.valueOf(SystemClock.uptimeMillis()));
            d A = iVar.A(context, str, f725k);
            int i7 = A.f714a;
            int i8 = A.f715b;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i7).length() + 19 + str.length() + 1 + String.valueOf(i8).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i7);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i8);
            Log.i("DynamiteModule", sb.toString());
            int i9 = A.f716c;
            if (i9 != 0) {
                if (i9 == -1) {
                    if (A.f714a != 0) {
                        i9 = -1;
                    }
                }
                if (i9 != 1 || A.f715b != 0) {
                    if (i9 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        e eVar2 = new e(applicationContext);
                        if (longValue == 0) {
                            r7.remove();
                        } else {
                            r7.set(l5);
                        }
                        Cursor cursor = jVar2.f732a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(jVar);
                        return eVar2;
                    }
                    if (i9 != 1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i9).length() + 36);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(i9);
                        throw new b(sb2.toString());
                    }
                    try {
                        try {
                            i6 = A.f715b;
                        } catch (b e4) {
                            e = e4;
                            context2 = context;
                            String message = e.getMessage();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb3.append("Failed to load remote module: ");
                            sb3.append(message);
                            Log.w("DynamiteModule", sb3.toString());
                            i5 = A.f714a;
                            if (i5 != 0 || iVar.A(context2, str, new n(i5)).f716c != -1) {
                                throw new b("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            eVar = new e(applicationContext);
                            return eVar;
                        }
                    } catch (b e5) {
                        e = e5;
                        context2 = r7;
                        String message2 = e.getMessage();
                        StringBuilder sb32 = new StringBuilder(String.valueOf(message2).length() + 30);
                        sb32.append("Failed to load remote module: ");
                        sb32.append(message2);
                        Log.w("DynamiteModule", sb32.toString());
                        i5 = A.f714a;
                        if (i5 != 0) {
                        }
                        throw new b("Remote load failed. No local fallback found.", e);
                    }
                    try {
                        try {
                            try {
                                synchronized (e.class) {
                                    try {
                                        if (!e(context)) {
                                            throw new b("Remote loading disabled");
                                        }
                                        Boolean bool = f719d;
                                        if (bool == null) {
                                            throw new b("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i6).length());
                                            sb4.append("Selected remote version of ");
                                            sb4.append(str);
                                            sb4.append(", version >= ");
                                            sb4.append(i6);
                                            Log.i("DynamiteModule", sb4.toString());
                                            synchronized (e.class) {
                                                lVar = f727m;
                                            }
                                            if (lVar == null) {
                                                throw new b("DynamiteLoaderV2 was not cached.");
                                            }
                                            j jVar3 = (j) threadLocal.get();
                                            if (jVar3 == null || jVar3.f732a == null) {
                                                throw new b("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = jVar3.f732a;
                                            new a3.b(null);
                                            synchronized (e.class) {
                                                z4 = f722g >= 2;
                                            }
                                            if (z4) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                a6 = lVar.b(new a3.b(applicationContext2), str, i6, new a3.b(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                a6 = lVar.a(new a3.b(applicationContext2), str, i6, new a3.b(cursor2));
                                            }
                                            Context context4 = (Context) a3.b.b(a6);
                                            if (context4 == null) {
                                                throw new b("Failed to get module context");
                                            }
                                            eVar = new e(context4);
                                        } else {
                                            StringBuilder sb5 = new StringBuilder(str.length() + 40 + String.valueOf(i6).length());
                                            sb5.append("Selected remote version of ");
                                            sb5.append(str);
                                            sb5.append(", version >= ");
                                            sb5.append(i6);
                                            Log.i("DynamiteModule", sb5.toString());
                                            k h5 = h(context);
                                            if (h5 == null) {
                                                throw new b("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel zzB = h5.zzB(6, h5.zza());
                                            int readInt = zzB.readInt();
                                            zzB.recycle();
                                            if (readInt >= 3) {
                                                j jVar4 = (j) threadLocal.get();
                                                if (jVar4 == null) {
                                                    throw new b("No cached result cursor holder");
                                                }
                                                a5 = h5.c(new a3.b(context), str, i6, new a3.b(jVar4.f732a));
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                a5 = h5.b(new a3.b(context), str, i6);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                a5 = h5.a(new a3.b(context), str, i6);
                                            }
                                            Object b2 = a3.b.b(a5);
                                            if (b2 == null) {
                                                throw new b("Failed to load remote module.");
                                            }
                                            eVar = new e((Context) b2);
                                        }
                                        return eVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (RemoteException e6) {
                            e = e6;
                            throw new b("Failed to load remote module.", e);
                        } catch (b e7) {
                            throw e7;
                        } catch (Throwable th3) {
                            th = th3;
                            context3 = context;
                            x2.d.a(context3, th);
                            throw new b("Failed to load remote module.", th);
                        }
                    } catch (RemoteException e8) {
                        e = e8;
                        throw new b("Failed to load remote module.", e);
                    } catch (b e9) {
                        throw e9;
                    } catch (Throwable th4) {
                        th = th4;
                        context3 = r7;
                        x2.d.a(context3, th);
                        throw new b("Failed to load remote module.", th);
                    }
                }
            }
            int i10 = A.f714a;
            int i11 = A.f715b;
            StringBuilder sb6 = new StringBuilder(str.length() + 46 + String.valueOf(i10).length() + 23 + String.valueOf(i11).length() + 1);
            sb6.append("No acceptable module ");
            sb6.append(str);
            sb6.append(" found. Local version is ");
            sb6.append(i10);
            sb6.append(" and remote version is ");
            sb6.append(i11);
            sb6.append(".");
            throw new b(sb6.toString());
        } finally {
            if (longValue == 0) {
                f724j.remove();
            } else {
                f724j.set(l5);
            }
            Cursor cursor3 = jVar2.f732a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f723i.set(jVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x019e, code lost:
    
        if (r4 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z4) {
        Field declaredField;
        Throwable th;
        RemoteException e4;
        int readInt;
        Cursor cursor;
        try {
            synchronized (e.class) {
                Boolean bool = f719d;
                boolean z5 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e5) {
                        String obj = e5.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(obj);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (b unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!e(context)) {
                                return 0;
                            }
                            if (!f721f) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int f5 = f(context, str, z4, true);
                                        String str2 = f720e;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader A = g.A();
                                            if (A == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    a.b();
                                                    String str3 = f720e;
                                                    b0.g(str3);
                                                    A = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = f720e;
                                                    b0.g(str4);
                                                    A = new h(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(A);
                                            declaredField.set(null, A);
                                            f719d = bool2;
                                            return f5;
                                        }
                                        return f5;
                                    } catch (b unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f719d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z4, false);
                    } catch (b e6) {
                        String message = e6.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                k h5 = h(context);
                try {
                    if (h5 == null) {
                        return 0;
                    }
                    try {
                        Parcel zzB = h5.zzB(6, h5.zza());
                        int readInt2 = zzB.readInt();
                        zzB.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = f723i;
                            j jVar = (j) threadLocal.get();
                            if (jVar != null && (cursor = jVar.f732a) != null) {
                                return cursor.getInt(0);
                            }
                            a3.b bVar = new a3.b(context);
                            long longValue = ((Long) f724j.get()).longValue();
                            Parcel zza = h5.zza();
                            zzc.zze(zza, bVar);
                            zza.writeString(str);
                            zza.writeInt(z4 ? 1 : 0);
                            zza.writeLong(longValue);
                            Cursor cursor3 = (Cursor) a3.b.b(u.f(h5.zzB(7, zza)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            j jVar2 = (j) threadLocal.get();
                                            if (jVar2 == null || jVar2.f732a != null) {
                                                z5 = false;
                                            } else {
                                                jVar2.f732a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e7) {
                                    e4 = e7;
                                    cursor2 = cursor3;
                                    String message2 = e4.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            a3.b bVar2 = new a3.b(context);
                            Parcel zza2 = h5.zza();
                            zzc.zze(zza2, bVar2);
                            zza2.writeString(str);
                            zza2.writeInt(z4 ? 1 : 0);
                            Parcel zzB2 = h5.zzB(5, zza2);
                            readInt = zzB2.readInt();
                            zzB2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            a3.b bVar3 = new a3.b(context);
                            Parcel zza3 = h5.zza();
                            zzc.zze(zza3, bVar3);
                            zza3.writeString(str);
                            zza3.writeInt(z4 ? 1 : 0);
                            Parcel zzB3 = h5.zzB(3, zza3);
                            readInt = zzB3.readInt();
                            zzB3.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e8) {
                        e4 = e8;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            x2.d.a(context, th4);
            throw th4;
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z4 = false;
        if (h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (t2.f.f3374b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z4 = true;
            }
            h = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f721f = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r6 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, String str, boolean z4, boolean z5) {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z6;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z7 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z4 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f724j.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z8 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        acquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i5 = 0; i5 < count; i5++) {
                                if (!query.moveToPosition(i5)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i6 = 0; i6 < columnCount; i6++) {
                                    int type = query.getType(i6);
                                    if (type == 0) {
                                        objArr[i6] = null;
                                    } else if (type == 1) {
                                        objArr[i6] = Long.valueOf(query.getLong(i6));
                                    } else if (type == 2) {
                                        objArr[i6] = Double.valueOf(query.getDouble(i6));
                                    } else if (type == 3) {
                                        objArr[i6] = query.getString(i6);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i6] = query.getBlob(i6);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i7 = matrixCursor.getInt(0);
                                        if (i7 > 0) {
                                            synchronized (e.class) {
                                                try {
                                                    f720e = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        f722g = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z6 = matrixCursor.getInt(columnIndex2) != 0;
                                                        f721f = z6;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            j jVar = (j) f723i.get();
                                            if (jVar == null || jVar.f732a != null) {
                                                z7 = false;
                                            } else {
                                                jVar.f732a = matrixCursor;
                                            }
                                            z8 = z6;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z5 && z8) {
                                            throw new b("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i7;
                                    }
                                } catch (Exception e4) {
                                    exc = e4;
                                    if (exc instanceof b) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb.append("V2 version check failed: ");
                                    sb.append(message);
                                    throw new b(sb.toString(), exc);
                                } catch (Throwable th3) {
                                    th = th3;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th;
                                    }
                                    matrixCursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new b("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e5) {
            exc = e5;
        }
    }

    public static void g(ClassLoader classLoader) {
        try {
            l lVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                lVar = queryLocalInterface instanceof l ? (l) queryLocalInterface : new l(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f727m = lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e4) {
            throw new b("Failed to instantiate dynamite loader", e4);
        }
    }

    public static k h(Context context) {
        k kVar;
        synchronized (e.class) {
            k kVar2 = f726l;
            if (kVar2 != null) {
                return kVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    kVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (kVar != null) {
                    f726l = kVar;
                    return kVar;
                }
            } catch (Exception e4) {
                String message = e4.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f728a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new b("Failed to instantiate module class: ".concat(String.valueOf(str)), e4);
        }
    }
}
