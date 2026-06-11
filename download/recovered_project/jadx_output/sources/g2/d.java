package g2;

import android.content.Context;
import androidx.emoji2.text.p;
import androidx.emoji2.text.t;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import t2.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final p f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1676b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1677c;

    public d(Context context, t tVar) {
        p pVar = new p(context, 10);
        this.f1677c = new HashMap();
        this.f1675a = pVar;
        this.f1676b = tVar;
    }

    public final synchronized e a(String str) {
        if (this.f1677c.containsKey(str)) {
            return (e) this.f1677c.get(str);
        }
        CctBackendFactory x5 = this.f1675a.x(str);
        if (x5 == null) {
            return null;
        }
        t tVar = this.f1676b;
        e create = x5.create(new b((Context) tVar.h, (i) tVar.f284i, (i) tVar.f285j, str));
        this.f1677c.put(str, create);
        return create;
    }
}
