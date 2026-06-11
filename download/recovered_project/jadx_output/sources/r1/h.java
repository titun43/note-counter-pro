package r1;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.emoji2.text.t;
import androidx.fragment.app.b1;
import androidx.fragment.app.u0;
import androidx.fragment.app.y0;
import androidx.fragment.app.z;
import c0.j;
import com.google.android.gms.ads.RequestConfiguration;
import j.c0;
import j.n;
import j.u;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k0.m;
import o.l;
import o4.e0;
import o4.w;
import p3.a0;
import q4.i;
import r3.d0;
import r3.f0;
import r3.g0;
import r3.x;

/* loaded from: classes.dex */
public final class h implements i.a, h2.b {

    /* renamed from: k, reason: collision with root package name */
    public static h f3160k;

    /* renamed from: g, reason: collision with root package name */
    public Object f3161g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public Object f3162i;

    /* renamed from: j, reason: collision with root package name */
    public Object f3163j;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f3161g = obj;
        this.h = obj2;
        this.f3162i = obj3;
        this.f3163j = obj4;
    }

    public static synchronized h n(Context context, w1.a aVar) {
        h hVar;
        synchronized (h.class) {
            try {
                if (f3160k == null) {
                    h hVar2 = new h();
                    Context applicationContext = context.getApplicationContext();
                    hVar2.f3161g = new a(applicationContext, aVar);
                    hVar2.h = new b(applicationContext, aVar);
                    hVar2.f3162i = new f(applicationContext, aVar);
                    hVar2.f3163j = new g(applicationContext, aVar);
                    f3160k = hVar2;
                }
                hVar = f3160k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // i.a
    public boolean a(i.b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f3161g).onActionItemClicked(i(bVar), new u((Context) this.h, (a0.a) menuItem));
    }

    @Override // i.a
    public void b(i.b bVar) {
        ((ActionMode.Callback) this.f3161g).onDestroyActionMode(i(bVar));
    }

    public void c(z zVar) {
        if (((ArrayList) this.f3161g).contains(zVar)) {
            throw new IllegalStateException("Fragment already added: " + zVar);
        }
        synchronized (((ArrayList) this.f3161g)) {
            ((ArrayList) this.f3161g).add(zVar);
        }
        zVar.f500q = true;
    }

    public void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((l) this.h).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                d(arrayList2.get(i5), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public z e(String str) {
        b1 b1Var = (b1) ((HashMap) this.h).get(str);
        if (b1Var != null) {
            return b1Var.f341c;
        }
        return null;
    }

    @Override // i.a
    public boolean f(i.b bVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f3161g;
        i.f i5 = i(bVar);
        l lVar = (l) this.f3163j;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new c0((Context) this.h, (n) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(i5, menu2);
    }

    @Override // i.a
    public boolean g(i.b bVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f3161g;
        i.f i5 = i(bVar);
        l lVar = (l) this.f3163j;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new c0((Context) this.h, (n) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(i5, menu2);
    }

    @Override // s3.a
    public Object get() {
        return new h((Executor) ((s3.a) this.f3161g).get(), (m2.d) ((s3.a) this.h).get(), (t) ((t) this.f3162i).get(), (n2.c) ((s3.a) this.f3163j).get());
    }

    public z h(String str) {
        for (b1 b1Var : ((HashMap) this.h).values()) {
            if (b1Var != null) {
                z zVar = b1Var.f341c;
                if (!str.equals(zVar.f494k)) {
                    zVar = zVar.B.f441c.h(str);
                }
                if (zVar != null) {
                    return zVar;
                }
            }
        }
        return null;
    }

    public i.f i(i.b bVar) {
        ArrayList arrayList = (ArrayList) this.f3162i;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            i.f fVar = (i.f) arrayList.get(i5);
            if (fVar != null && fVar.f1747b == bVar) {
                return fVar;
            }
        }
        i.f fVar2 = new i.f((Context) this.h, bVar);
        arrayList.add(fVar2);
        return fVar2;
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (b1 b1Var : ((HashMap) this.h).values()) {
            if (b1Var != null) {
                arrayList.add(b1Var);
            }
        }
        return arrayList;
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (b1 b1Var : ((HashMap) this.h).values()) {
            if (b1Var != null) {
                arrayList.add(b1Var.f341c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public File l(x xVar) {
        switch (xVar == null ? -1 : p3.z.f3041a[xVar.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new androidx.fragment.app.x();
            case 1:
                return (File) this.f3161g;
            case 2:
                return (File) this.h;
            case 3:
                return (File) this.f3162i;
            case 4:
                return (File) this.f3163j;
            case 5:
                return Environment.getExternalStorageDirectory();
            case 6:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
        }
    }

    public List m() {
        ArrayList arrayList;
        if (((ArrayList) this.f3161g).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f3161g)) {
            arrayList = new ArrayList((ArrayList) this.f3161g);
        }
        return arrayList;
    }

    public void o(b1 b1Var) {
        z zVar = b1Var.f341c;
        String str = zVar.f494k;
        HashMap hashMap = (HashMap) this.h;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(zVar.f494k, b1Var);
        if (u0.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + zVar);
        }
    }

    public void p(b1 b1Var) {
        HashMap hashMap = (HashMap) this.h;
        z zVar = b1Var.f341c;
        if (zVar.I) {
            ((y0) this.f3163j).f(zVar);
        }
        if (hashMap.get(zVar.f494k) == b1Var && ((b1) hashMap.put(zVar.f494k, null)) != null && u0.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + zVar);
        }
    }

    public void q(m mVar) {
        Object m5 = ((q4.c) this.f3162i).m(mVar);
        if (m5 instanceof q4.h) {
            Throwable th = ((q4.h) m5).f3134a;
            if (th != null) {
                throw th;
            }
            throw new h3.c("Channel was closed normally");
        }
        if (m5 instanceof i) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f3163j).getAndIncrement() == 0) {
            w.i((o4.t) this.f3161g, new k0.b(this, (w3.c) null, 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
    
        if (r2 == r7) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(g0 g0Var, y3.c cVar) {
        a0 a0Var;
        int i5;
        try {
            if (cVar instanceof a0) {
                a0Var = (a0) cVar;
                int i6 = a0Var.f2986i;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    a0Var.f2986i = i6 - Integer.MIN_VALUE;
                    a0 a0Var2 = a0Var;
                    Object obj = a0Var2.f2985g;
                    x3.a aVar = x3.a.f3712g;
                    i5 = a0Var2.f2986i;
                    if (i5 == 0) {
                        if (i5 == 1) {
                            b3.g.x(obj);
                            return (f0) obj;
                        }
                        if (i5 == 2) {
                            b3.g.x(obj);
                            return (f0) obj;
                        }
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b3.g.x(obj);
                        return (f0) obj;
                    }
                    b3.g.x(obj);
                    x xVar = g0Var.f3185c;
                    String str = g0Var.f3186d;
                    File l5 = l(xVar);
                    if (l5 == null) {
                        Uri parse = Uri.parse(str);
                        if (g4.i.a(parse.getScheme(), "content")) {
                            return new d0(parse);
                        }
                        if (n4.i.S(str, "/synthetic/")) {
                            String str2 = g0Var.f3186d;
                            int T = n4.i.T(str2);
                            g4.i.e(str2, "<this>");
                            int V = (!(str2 instanceof String) ? n4.i.V(str2, "/synthetic/", T, 0, false, true) : str2.lastIndexOf("/synthetic/", T)) + 11;
                            int Y = n4.i.Y(str2);
                            if (Y < V) {
                                throw new r3.t(str2);
                            }
                            String substring = str2.substring(V, Y);
                            g4.i.d(substring, "substring(...)");
                            return new d0(Uri.parse("content://media/".concat(substring)));
                        }
                        if (!g4.i.a(parse.getScheme(), "file")) {
                            if (parse.getScheme() != null) {
                                throw new r3.t(str);
                            }
                            String str3 = g0Var.f3186d;
                            a0Var2.f2986i = 2;
                            v4.e eVar = e0.f2793a;
                            obj = w.p(new p3.b(this, (File) null, str3, (Boolean) null, (w3.c) null), v4.d.f3605i, a0Var2);
                            if (obj == aVar) {
                            }
                            return (f0) obj;
                        }
                        String path = parse.getPath();
                        if (path == null) {
                            path = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        String str4 = path;
                        a0Var2.f2986i = 1;
                        v4.e eVar2 = e0.f2793a;
                        obj = w.p(new p3.b(this, (File) null, str4, (Boolean) null, (w3.c) null), v4.d.f3605i, a0Var2);
                        if (obj == aVar) {
                        }
                        return (f0) obj;
                    }
                    x xVar2 = g0Var.f3185c;
                    Boolean valueOf = xVar2 != null ? Boolean.valueOf(xVar2.f3205g) : null;
                    a0Var2.f2986i = 3;
                    v4.e eVar3 = e0.f2793a;
                    obj = w.p(new p3.b(this, l5, str, valueOf, (w3.c) null), v4.d.f3605i, a0Var2);
                    return aVar;
                }
            }
            if (i5 == 0) {
            }
        } catch (Throwable th) {
            return b3.g.g(th);
        }
        a0Var = new a0(this, cVar);
        a0 a0Var22 = a0Var;
        Object obj2 = a0Var22.f2985g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = a0Var22.f2986i;
    }

    public Bundle s(Bundle bundle, String str) {
        HashMap hashMap = (HashMap) this.f3162i;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public h(int i5) {
        switch (i5) {
            case 9:
                this.f3161g = new j(10);
                this.h = new l(0);
                this.f3162i = new ArrayList();
                this.f3163j = new HashSet();
                break;
            default:
                this.f3161g = new ArrayList();
                this.h = new HashMap();
                this.f3162i = new HashMap();
                break;
        }
    }

    public h(Typeface typeface, m0.b bVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        this.f3163j = typeface;
        this.f3161g = bVar;
        this.f3162i = new androidx.emoji2.text.x(1024);
        int a5 = bVar.a(6);
        if (a5 != 0) {
            int i9 = a5 + bVar.f1374a;
            i5 = ((ByteBuffer) bVar.f1377d).getInt(((ByteBuffer) bVar.f1377d).getInt(i9) + i9);
        } else {
            i5 = 0;
        }
        this.h = new char[i5 * 2];
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i10 = a6 + bVar.f1374a;
            i6 = ((ByteBuffer) bVar.f1377d).getInt(((ByteBuffer) bVar.f1377d).getInt(i10) + i10);
        } else {
            i6 = 0;
        }
        for (int i11 = 0; i11 < i6; i11++) {
            androidx.emoji2.text.a0 a0Var = new androidx.emoji2.text.a0(this, i11);
            m0.a b2 = a0Var.b();
            int a7 = b2.a(4);
            Character.toChars(a7 != 0 ? ((ByteBuffer) b2.f1377d).getInt(a7 + b2.f1374a) : 0, (char[]) this.h, i11 * 2);
            m0.a b5 = a0Var.b();
            int a8 = b5.a(16);
            if (a8 != 0) {
                int i12 = a8 + b5.f1374a;
                i7 = ((ByteBuffer) b5.f1377d).getInt(((ByteBuffer) b5.f1377d).getInt(i12) + i12);
            } else {
                i7 = 0;
            }
            if (i7 > 0) {
                androidx.emoji2.text.x xVar = (androidx.emoji2.text.x) this.f3162i;
                m0.a b6 = a0Var.b();
                int a9 = b6.a(16);
                if (a9 != 0) {
                    int i13 = a9 + b6.f1374a;
                    i8 = ((ByteBuffer) b6.f1377d).getInt(((ByteBuffer) b6.f1377d).getInt(i13) + i13);
                } else {
                    i8 = 0;
                }
                xVar.a(a0Var, 0, i8 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }
}
