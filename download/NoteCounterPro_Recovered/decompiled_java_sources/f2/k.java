package f2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import androidx.emoji2.text.t;
import k.h3;

/* loaded from: classes.dex */
public final class k implements d1.b {

    /* renamed from: g, reason: collision with root package name */
    public Context f1474g;

    public /* synthetic */ k(Context context) {
        this.f1474g = context;
    }

    public l a() {
        Context context = this.f1474g;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        l lVar = new l();
        lVar.f1475g = h2.a.a(o.f1482a);
        u1.f fVar = new u1.f(context, 9);
        lVar.h = fVar;
        lVar.f1476i = h2.a.a(new androidx.emoji2.text.p(11, fVar, new u1.f(fVar, 8)));
        u1.f fVar2 = lVar.h;
        lVar.f1477j = new k1.j(fVar2, 17);
        s3.a a5 = h2.a.a(new androidx.emoji2.text.p(13, lVar.f1477j, h2.a.a(new u1.f(fVar2, 16))));
        lVar.f1478k = a5;
        t2.i iVar = new t2.i(17);
        u1.f fVar3 = lVar.h;
        t tVar = new t(fVar3, a5, iVar, 14);
        s3.a aVar = lVar.f1475g;
        s3.a aVar2 = lVar.f1476i;
        k2.c cVar = new k2.c(aVar, aVar2, tVar, a5, a5);
        h3 h3Var = new h3();
        h3Var.f2103g = fVar3;
        h3Var.h = aVar2;
        h3Var.f2104i = a5;
        h3Var.f2105j = tVar;
        h3Var.f2106k = aVar;
        h3Var.f2107l = a5;
        h3Var.f2108m = a5;
        lVar.f1479l = h2.a.a(new t(cVar, h3Var, new r1.h(aVar, a5, tVar, a5), 9));
        return lVar;
    }

    public ApplicationInfo b(int i5, String str) {
        return this.f1474g.getPackageManager().getApplicationInfo(str, i5);
    }

    public PackageInfo c(int i5, String str) {
        return this.f1474g.getPackageManager().getPackageInfo(str, i5);
    }

    public boolean d() {
        String nameForUid;
        boolean isInstantApp;
        Context context = this.f1474g;
        if (Binder.getCallingUid() == Process.myUid()) {
            return z2.b.q(context);
        }
        if (!x2.d.f() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    @Override // d1.b
    public d1.c f(d1.a aVar) {
        Context context = this.f1474g;
        String str = (String) aVar.f1185c;
        androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) aVar.f1186d;
        if (pVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        d1.a aVar2 = new d1.a(context, str, pVar, true);
        return new e1.e((Context) aVar2.f1184b, (String) aVar2.f1185c, (androidx.emoji2.text.p) aVar2.f1186d, aVar2.f1183a);
    }
}
