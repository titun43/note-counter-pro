package f2;

import android.content.Context;
import androidx.emoji2.text.t;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static volatile l f1485e;

    /* renamed from: a, reason: collision with root package name */
    public final t2.i f1486a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.i f1487b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.d f1488c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.j f1489d;

    public r(t2.i iVar, t2.i iVar2, k2.d dVar, l2.j jVar, r1.h hVar) {
        this.f1486a = iVar;
        this.f1487b = iVar2;
        this.f1488c = dVar;
        this.f1489d = jVar;
        ((Executor) hVar.f3161g).execute(new androidx.activity.o(hVar, 6));
    }

    public static r a() {
        l lVar = f1485e;
        if (lVar != null) {
            return (r) lVar.f1479l.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f1485e == null) {
            synchronized (r.class) {
                try {
                    if (f1485e == null) {
                        k kVar = new k();
                        context.getClass();
                        kVar.f1474g = context;
                        f1485e = kVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final t c(m mVar) {
        byte[] bytes;
        Set unmodifiableSet = mVar != null ? Collections.unmodifiableSet(d2.a.f1188d) : Collections.singleton(new c2.b("proto"));
        t a5 = j.a();
        mVar.getClass();
        a5.h = "cct";
        d2.a aVar = (d2.a) mVar;
        String str = aVar.f1190a;
        String str2 = aVar.f1191b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a5.f284i = bytes;
        return new t(unmodifiableSet, a5.f(), this, 7);
    }
}
