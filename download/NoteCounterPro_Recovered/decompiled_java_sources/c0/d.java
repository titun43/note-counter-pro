package c0;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final o.k f741a = new o.k(2);

    /* renamed from: b, reason: collision with root package name */
    public static final b f742b = new b();

    public static j a(Context context, List list) {
        String str;
        Typeface c5;
        a.a.e("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < list.size(); i5++) {
                e eVar = (e) list.get(i5);
                if (Build.VERSION.SDK_INT < 31 || (c5 = y.f.c((str = eVar.f747e))) == null || y.f.d(c5) == null) {
                    ProviderInfo b2 = b(context.getPackageManager(), eVar, context.getResources());
                    if (b2 == null) {
                        j jVar = new j();
                        jVar.f763a = 1;
                        jVar.f764b = Collections.singletonList(null);
                        return jVar;
                    }
                    arrayList.add(c(context, eVar, b2.authority));
                } else {
                    arrayList.add(new k[]{new k(str, eVar.f748f)});
                }
            }
            j jVar2 = new j();
            jVar2.f763a = 0;
            jVar2.f764b = arrayList;
            return jVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        b bVar = f742b;
        o.k kVar = f741a;
        a.a.e("FontProvider.getProvider");
        try {
            List list = eVar.f746d;
            String str = eVar.f743a;
            String str2 = eVar.f744b;
            if (list == null) {
                list = x.b.d(resources, 0);
            }
            c cVar = new c();
            cVar.f738a = str;
            cVar.f739b = str2;
            cVar.f740c = list;
            ProviderInfo providerInfo = (ProviderInfo) kVar.get(cVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, bVar);
            for (int i5 = 0; i5 < list.size(); i5++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i5));
                Collections.sort(arrayList2, bVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i6), (byte[]) arrayList2.get(i6))) {
                            break;
                        }
                    }
                    kVar.put(cVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static k[] c(Context context, e eVar, String str) {
        a.a.e("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                a.a.e("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {eVar.f745c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e4) {
                            Log.w("FontsProvider", "Unable to query the content provider", e4);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i5 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new k(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i5));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (k[]) arrayList.toArray(new k[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
