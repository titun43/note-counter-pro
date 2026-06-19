package z0;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3912a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3913b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3914c;

    /* renamed from: d, reason: collision with root package name */
    public Executor f3915d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f3916e;

    /* renamed from: f, reason: collision with root package name */
    public d1.b f3917f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3918g;
    public boolean h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3919i;

    /* renamed from: j, reason: collision with root package name */
    public final k1.j f3920j;

    /* renamed from: k, reason: collision with root package name */
    public HashSet f3921k;

    public h(Context context, String str) {
        this.f3913b = context;
        this.f3912a = str;
        k1.j jVar = new k1.j(28);
        jVar.h = new HashMap();
        this.f3920j = jVar;
    }

    public final void a(a1.a... aVarArr) {
        if (this.f3921k == null) {
            this.f3921k = new HashSet();
        }
        for (a1.a aVar : aVarArr) {
            this.f3921k.add(Integer.valueOf(aVar.f5a));
            this.f3921k.add(Integer.valueOf(aVar.f6b));
        }
        k1.j jVar = this.f3920j;
        jVar.getClass();
        for (a1.a aVar2 : aVarArr) {
            int i5 = aVar2.f5a;
            int i6 = aVar2.f6b;
            HashMap hashMap = (HashMap) jVar.h;
            TreeMap treeMap = (TreeMap) hashMap.get(Integer.valueOf(i5));
            if (treeMap == null) {
                treeMap = new TreeMap();
                hashMap.put(Integer.valueOf(i5), treeMap);
            }
            a1.a aVar3 = (a1.a) treeMap.get(Integer.valueOf(i6));
            if (aVar3 != null) {
                Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
            }
            treeMap.put(Integer.valueOf(i6), aVar2);
        }
    }
}
