package d2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbgj;
import e2.g;
import e2.h;
import e2.j;
import e2.k;
import e2.l;
import e2.n;
import e2.o;
import e2.q;
import e2.r;
import e2.s;
import e2.t;
import e2.u;
import e2.v;
import g2.e;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import m3.d;
import t2.i;
import u1.f;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final f f1195a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f1196b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1197c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f1198d;

    /* renamed from: e, reason: collision with root package name */
    public final i f1199e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1200f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1201g;

    public c(Context context, i iVar, i iVar2) {
        d dVar = new d();
        e2.c cVar = e2.c.f1255a;
        dVar.a(o.class, cVar);
        dVar.a(e2.i.class, cVar);
        e2.f fVar = e2.f.f1267a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        e2.d dVar2 = e2.d.f1257a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        e2.b bVar = e2.b.f1243a;
        dVar.a(e2.a.class, bVar);
        dVar.a(h.class, bVar);
        e2.e eVar = e2.e.f1260a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f1274a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f2595d = true;
        this.f1195a = new f(dVar, 17);
        this.f1197c = context;
        this.f1196b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f1198d = b(a.f1187c);
        this.f1199e = iVar2;
        this.f1200f = iVar;
        this.f1201g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(s.c.a("Invalid url: ", str), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((e2.t) e2.t.f1307g.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f2.i a(f2.i iVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f1196b.getActiveNetworkInfo();
        f2.h c5 = iVar.c();
        int i5 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c5.f1464f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i5));
        c5.a("model", Build.MODEL);
        c5.a("hardware", Build.HARDWARE);
        c5.a("device", Build.DEVICE);
        c5.a("product", Build.PRODUCT);
        c5.a("os-uild", Build.ID);
        c5.a("manufacturer", Build.MANUFACTURER);
        c5.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / zzbgj.zzq.zzf;
        HashMap hashMap3 = (HashMap) c5.f1464f;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i6 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f1308g;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c5.f1464f;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f1307g;
                subtype = 100;
            }
            hashMap = (HashMap) c5.f1464f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c5.a("country", Locale.getDefault().getCountry());
            c5.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f1197c;
            c5.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i6 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e4) {
                b3.g.p("CctTransportBackend", "Unable to find version code for package", e4);
            }
            c5.a("application_build", Integer.toString(i6));
            return c5.c();
        }
        SparseArray sparseArray3 = t.f1307g;
        subtype = 0;
        hashMap = (HashMap) c5.f1464f;
        if (hashMap != null) {
        }
    }
}
