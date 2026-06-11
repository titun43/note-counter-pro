package androidx.emoji2.text;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.h1;
import androidx.fragment.app.u0;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlq;
import f0.i0;
import f0.r0;
import f0.w0;
import g.f0;
import g.m0;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class p implements q, h3.d, i.a, h2.b, androidx.work.s, r4.b, y1.a0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f273g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public Object f274i;

    public /* synthetic */ p(int i5, Object obj, Object obj2) {
        this.f273g = i5;
        this.h = obj;
        this.f274i = obj2;
    }

    public static void i(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e4) {
            Log.w("SupportSQLite", "delete failed: ", e4);
        }
    }

    public ArrayList A(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.h;
        z0.j d5 = z0.j.d(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            d5.f(1);
        } else {
            d5.g(1, str);
        }
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                arrayList.add(g5.getString(0));
            }
            return arrayList;
        } finally {
            g5.close();
            d5.h();
        }
    }

    public void B(t1.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.h;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((t1.b) this.f274i).e(cVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void C(c0.h hVar) {
        b0.d dVar = (b0.d) this.f274i;
        u1.f fVar = (u1.f) this.h;
        int i5 = hVar.f758b;
        if (i5 != 0) {
            dVar.execute(new androidx.fragment.app.o(fVar, i5));
        } else {
            dVar.execute(new c0.a(0, fVar, hVar.f757a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071 A[EDGE_INSN: B:78:0x0071->B:62:0x0071 BREAK  A[LOOP:3: B:42:0x0022->B:63:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(e1.b bVar, int i5, int i6) {
        List list;
        TreeMap treeMap;
        boolean z4;
        k1.j jVar = (k1.j) this.f274i;
        z0.a aVar = (z0.a) this.h;
        int i7 = 0;
        if (aVar != null) {
            k1.j jVar2 = aVar.f3890d;
            jVar2.getClass();
            if (i5 == i6) {
                list = Collections.EMPTY_LIST;
            } else {
                boolean z5 = i6 > i5;
                ArrayList arrayList = new ArrayList();
                int i8 = i5;
                do {
                    if (z5) {
                        if (i8 >= i6) {
                            list = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((HashMap) jVar2.h).get(Integer.valueOf(i8));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z5 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            int intValue = num.intValue();
                            if (z5) {
                                if (intValue <= i6 && intValue > i8) {
                                    arrayList.add(treeMap.get(num));
                                    z4 = true;
                                    i8 = intValue;
                                    break;
                                }
                            } else if (intValue >= i6 && intValue < i8) {
                                arrayList.add(treeMap.get(num));
                                z4 = true;
                                i8 = intValue;
                                break;
                                break;
                            }
                        }
                        z4 = false;
                    } else {
                        if (i8 <= i6) {
                            list = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((HashMap) jVar2.h).get(Integer.valueOf(i8));
                        if (treeMap == null) {
                        }
                    }
                } while (z4);
                list = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Cursor j2 = bVar.j("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (j2.moveToNext()) {
                    try {
                        arrayList2.add(j2.getString(0));
                    } catch (Throwable th) {
                        j2.close();
                        throw th;
                    }
                }
                j2.close();
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    String str = (String) obj;
                    if (str.startsWith("room_fts_content_sync_")) {
                        bVar.h("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((a1.a) it.next()).a(bVar);
                }
                m0 A = k1.j.A(bVar);
                if (!A.f1592g) {
                    throw new IllegalStateException("Migration didn't properly handle: " + ((String) A.h));
                }
                F(bVar);
                return;
            }
        }
        z0.a aVar2 = (z0.a) this.h;
        if (aVar2 != null) {
            if (!((i5 <= i6 || !aVar2.f3894i) && aVar2.h)) {
                bVar.h("DROP TABLE IF EXISTS `Dependency`");
                bVar.h("DROP TABLE IF EXISTS `WorkSpec`");
                bVar.h("DROP TABLE IF EXISTS `WorkTag`");
                bVar.h("DROP TABLE IF EXISTS `SystemIdInfo`");
                bVar.h("DROP TABLE IF EXISTS `WorkName`");
                bVar.h("DROP TABLE IF EXISTS `WorkProgress`");
                bVar.h("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.h;
                int i9 = WorkDatabase_Impl.f643s;
                List list2 = workDatabase_Impl.f3928g;
                if (list2 != null) {
                    int size2 = list2.size();
                    while (i7 < size2) {
                        ((l1.f) workDatabase_Impl.f3928g.get(i7)).getClass();
                        i7++;
                    }
                }
                k1.j.t(bVar);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i5 + " to " + i6 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void E(b3.g gVar) {
        boolean z4;
        androidx.lifecycle.a0 a0Var = (androidx.lifecycle.a0) this.h;
        synchronized (a0Var.f517a) {
            z4 = a0Var.f522f == androidx.lifecycle.a0.f516k;
            a0Var.f522f = gVar;
        }
        if (z4) {
            l.b S = l.b.S();
            androidx.fragment.app.o oVar = a0Var.f525j;
            l.d dVar = S.f2449i;
            if (dVar.f2453k == null) {
                synchronized (dVar.f2451i) {
                    try {
                        if (dVar.f2453k == null) {
                            dVar.f2453k = l.d.S(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            dVar.f2453k.post(oVar);
        }
        if (gVar instanceof androidx.work.r) {
            ((v1.j) this.f274i).h((androidx.work.r) gVar);
        } else if (gVar instanceof androidx.work.p) {
            ((v1.j) this.f274i).i(((androidx.work.p) gVar).f675c);
        }
    }

    public void F(e1.b bVar) {
        bVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public void G(boolean z4, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.h)) {
            hashMap = new HashMap((Map) this.h);
        }
        synchronized (((Map) this.f274i)) {
            hashMap2 = new HashMap((Map) this.f274i);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((h3.h) entry2.getKey()).b(new com.google.android.gms.common.api.j(status));
            }
        }
    }

    public void H(zzjz zzjzVar) {
        if (zzjzVar == null) {
            return;
        }
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo((zzku) this.h);
            zzc.zza(zzjzVar);
            ((m0) this.f274i).a((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    public void I(zzkd zzkdVar) {
        if (zzkdVar == null) {
            return;
        }
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo((zzku) this.h);
            zzc.zzm(zzkdVar);
            ((m0) this.f274i).a((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    public void J(zzlq zzlqVar) {
        try {
            m0 m0Var = (m0) this.f274i;
            zzli zzc = zzlk.zzc();
            zzc.zzo((zzku) this.h);
            zzc.zzp(zzlqVar);
            m0Var.a((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // i.a
    public boolean a(i.b bVar, MenuItem menuItem) {
        return ((i.a) this.h).a(bVar, menuItem);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [g.l, java.lang.Object] */
    @Override // i.a
    public void b(i.b bVar) {
        ((i.a) this.h).b(bVar);
        f0 f0Var = (f0) this.f274i;
        if (f0Var.C != null) {
            f0Var.f1545r.getDecorView().removeCallbacks(f0Var.D);
        }
        if (f0Var.B != null) {
            w0 w0Var = f0Var.E;
            if (w0Var != null) {
                w0Var.b();
            }
            w0 a5 = r0.a(f0Var.B);
            a5.a(0.0f);
            f0Var.E = a5;
            a5.d(new g.v(this, 2));
        }
        f0Var.f1547t.onSupportActionModeFinished(f0Var.A);
        f0Var.A = null;
        ViewGroup viewGroup = f0Var.G;
        WeakHashMap weakHashMap = r0.f1407a;
        i0.c(viewGroup);
        f0Var.K();
    }

    @Override // androidx.emoji2.text.q
    public Object c() {
        return (d0) this.h;
    }

    @Override // androidx.emoji2.text.q
    public boolean e(CharSequence charSequence, int i5, int i6, a0 a0Var) {
        if ((a0Var.f247c & 4) > 0) {
            return true;
        }
        if (((d0) this.h) == null) {
            this.h = new d0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((t2.i) this.f274i).getClass();
        ((d0) this.h).setSpan(new b0(a0Var), i5, i6, 33);
        return true;
    }

    @Override // i.a
    public boolean f(i.b bVar, Menu menu) {
        ViewGroup viewGroup = ((f0) this.f274i).G;
        WeakHashMap weakHashMap = r0.f1407a;
        i0.c(viewGroup);
        return ((i.a) this.h).f(bVar, menu);
    }

    @Override // i.a
    public boolean g(i.b bVar, Menu menu) {
        return ((i.a) this.h).g(bVar, menu);
    }

    @Override // s3.a
    public Object get() {
        switch (this.f273g) {
            case 11:
                return new g2.d((Context) ((u1.f) this.h).h, (t) ((u1.f) this.f274i).get());
            default:
                t2.i iVar = new t2.i(24);
                t2.i iVar2 = new t2.i(23);
                Object obj = ((s3.a) this.h).get();
                s3.a aVar = (s3.a) this.f274i;
                return new m2.h(iVar, iVar2, m2.a.f2564f, (m2.j) obj, aVar);
        }
    }

    public void h(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.h).add(h1.b(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Type inference failed for: r2v4, types: [f4.q, y3.g] */
    @Override // r4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(r4.c cVar, w3.c cVar2) {
        r4.i iVar;
        int i5;
        p pVar;
        Throwable th;
        switch (this.f273g) {
            case 17:
                if (cVar2 instanceof r4.i) {
                    iVar = (r4.i) cVar2;
                    int i6 = iVar.h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        iVar.h = i6 - Integer.MIN_VALUE;
                        Object obj = iVar.f3234g;
                        Object obj2 = x3.a.f3712g;
                        i5 = iVar.h;
                        if (i5 != 0) {
                            b3.g.x(obj);
                            r4.b bVar = (r4.b) this.h;
                            iVar.f3236j = this;
                            iVar.f3237k = cVar;
                            iVar.h = 1;
                            obj = r4.t.b(bVar, cVar, iVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            pVar = this;
                        } else {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b3.g.x(obj);
                                return t3.h.f3400a;
                            }
                            cVar = iVar.f3237k;
                            pVar = iVar.f3236j;
                            b3.g.x(obj);
                        }
                        th = (Throwable) obj;
                        if (th != null) {
                            ?? r2 = (y3.g) pVar.f274i;
                            iVar.f3236j = null;
                            iVar.f3237k = null;
                            iVar.h = 2;
                            if (r2.invoke(cVar, th, iVar) == obj2) {
                                return obj2;
                            }
                        }
                        return t3.h.f3400a;
                    }
                }
                iVar = new r4.i(this, (y3.c) cVar2);
                Object obj3 = iVar.f3234g;
                Object obj22 = x3.a.f3712g;
                i5 = iVar.h;
                if (i5 != 0) {
                }
                th = (Throwable) obj3;
                if (th != null) {
                }
                return t3.h.f3400a;
            default:
                Object j2 = ((u1.f) this.h).j(new r4.l(cVar, (f4.p) this.f274i, 1), cVar2);
                return j2 == x3.a.f3712g ? j2 : t3.h.f3400a;
        }
    }

    public void k(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.k(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void l(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        u0 u0Var = (u0) this.h;
        g.k kVar = u0Var.w.f368n;
        androidx.fragment.app.z zVar2 = u0Var.f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.l(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void m(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.m(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void n(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.n(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void o(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.o(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    @Override // h3.d
    public void onComplete(h3.g gVar) {
        ((Map) ((p) this.f274i).f274i).remove((h3.h) this.h);
    }

    public void p(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.p(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void q(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        u0 u0Var = (u0) this.h;
        g.k kVar = u0Var.w.f368n;
        androidx.fragment.app.z zVar2 = u0Var.f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.q(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void r(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.r(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void s(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.s(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void t(androidx.fragment.app.z zVar, Bundle bundle, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.t(zVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f273g) {
            case 7:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f274i.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    sb.append((String) arrayList.get(i5));
                    if (i5 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.u(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void v(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.v(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void w(androidx.fragment.app.z zVar, boolean z4) {
        g4.i.e(zVar, "f");
        androidx.fragment.app.z zVar2 = ((u0) this.h).f461y;
        if (zVar2 != null) {
            zVar2.e().f452o.w(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f274i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory x(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f274i) == null) {
            Context context = (Context) this.h;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f274i = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f274i = map;
        }
        String str4 = (String) ((Map) this.f274i).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e4) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e4);
            return null;
        } catch (IllegalAccessException e5) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e5);
            return null;
        } catch (InstantiationException e6) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e6);
            return null;
        } catch (NoSuchMethodException e7) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e7);
            return null;
        } catch (InvocationTargetException e8) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e8);
            return null;
        }
    }

    public ArrayList y(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.h;
        z0.j d5 = z0.j.d(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            d5.f(1);
        } else {
            d5.g(1, str);
        }
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                arrayList.add(g5.getString(0));
            }
            return arrayList;
        } finally {
            g5.close();
            d5.h();
        }
    }

    public Long z(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.h;
        z0.j d5 = z0.j.d(1, "SELECT long_value FROM Preference where `key`=?");
        d5.g(1, str);
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            Long l5 = null;
            if (g5.moveToFirst() && !g5.isNull(0)) {
                l5 = Long.valueOf(g5.getLong(0));
            }
            return l5;
        } finally {
            g5.close();
            d5.h();
        }
    }

    public /* synthetic */ p(Object obj, int i5) {
        this.f273g = i5;
        this.h = obj;
        this.f274i = null;
    }

    public /* synthetic */ p(Object obj, Object obj2, int i5, boolean z4) {
        this.f273g = i5;
        this.f274i = obj;
        this.h = obj2;
    }

    public p(int i5) {
        this.f273g = i5;
        switch (i5) {
            case 8:
                t2.e eVar = t2.e.f3372d;
                this.h = new SparseIntArray();
                this.f274i = eVar;
                break;
            case 12:
                this.h = new androidx.lifecycle.a0();
                this.f274i = new v1.j();
                E(androidx.work.s.f677b);
                break;
            case 23:
                break;
            default:
                this.h = Collections.synchronizedMap(new WeakHashMap());
                this.f274i = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public p(Context context, zzku zzkuVar) {
        t c5;
        c2.b bVar;
        y0.c cVar;
        Set set;
        this.f273g = 24;
        m0 m0Var = new m0();
        try {
            f2.r.b(context);
            c5 = f2.r.a().c(d2.a.f1189e);
            bVar = new c2.b("proto");
            cVar = new y0.c();
            set = (Set) c5.h;
        } catch (Throwable unused) {
            m0Var.f1592g = true;
        }
        if (set.contains(bVar)) {
            m0Var.h = new t((f2.j) c5.f284i, bVar, cVar, (f2.r) c5.f285j);
            this.f274i = m0Var;
            this.h = zzkuVar;
            return;
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }

    public /* synthetic */ p(Object obj) {
        this.f273g = 7;
        this.f274i = obj;
        this.h = new ArrayList();
    }

    public p(WorkDatabase_Impl workDatabase_Impl, int i5) {
        this.f273g = i5;
        switch (i5) {
            case 20:
                this.h = workDatabase_Impl;
                this.f274i = new t1.b(workDatabase_Impl, 1);
                break;
            case zzbgj.zzt.zzm /* 21 */:
                this.h = workDatabase_Impl;
                this.f274i = new t1.b(workDatabase_Impl, 3);
                break;
            case 22:
                this.h = workDatabase_Impl;
                this.f274i = new t1.b(workDatabase_Impl, 6);
                break;
            default:
                this.h = workDatabase_Impl;
                this.f274i = new t1.b(workDatabase_Impl, 0);
                break;
        }
    }

    public p(u0 u0Var) {
        this.f273g = 2;
        this.h = u0Var;
        this.f274i = new CopyOnWriteArrayList();
    }

    public p(Context context) {
        this.f273g = 16;
        this.h = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(r4.b bVar, f4.q qVar) {
        this.f273g = 17;
        this.h = bVar;
        this.f274i = (y3.g) qVar;
    }

    public p(Animator animator) {
        this.f273g = 1;
        this.h = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f274i = animatorSet;
        animatorSet.play(animator);
    }

    public p(EditText editText) {
        this.f273g = 15;
        this.h = editText;
        n0.i iVar = new n0.i(editText);
        this.f274i = iVar;
        editText.addTextChangedListener(iVar);
        if (n0.a.f2641b == null) {
            synchronized (n0.a.f2640a) {
                try {
                    if (n0.a.f2641b == null) {
                        n0.a aVar = new n0.a();
                        try {
                            n0.a.f2642c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, n0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        n0.a.f2641b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(n0.a.f2641b);
    }
}
