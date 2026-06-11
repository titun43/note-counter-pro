package l1;

import androidx.work.n;
import androidx.work.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends y4.b {

    /* renamed from: n, reason: collision with root package name */
    public static final String f2466n = n.g("WorkContinuationImpl");

    /* renamed from: i, reason: collision with root package name */
    public final k f2467i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2468j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2469k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2470l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f2471m;

    public e(k kVar, List list) {
        this.f2467i = kVar;
        this.f2468j = list;
        this.f2469k = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            String uuid = ((o) list.get(i5)).f672a.toString();
            this.f2469k.add(uuid);
            this.f2470l.add(uuid);
        }
    }

    public static HashSet S(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
