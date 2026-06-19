package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f405a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f406b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f407c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f408d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f409e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f410f;

    public n(ViewGroup viewGroup) {
        g4.i.e(viewGroup, "container");
        this.f405a = viewGroup;
        this.f406b = new ArrayList();
        this.f407c = new ArrayList();
    }

    public final void a(g1 g1Var) {
        g4.i.e(g1Var, "operation");
        if (g1Var.f385b) {
            throw null;
        }
    }

    public final void b(ArrayList arrayList, boolean z4) {
        if (u0.J(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((g1) it.next()).getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            ((g1) listIterator.previous()).getClass();
            throw null;
        }
        if (u0.J(2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ((g1) u3.g.Y(arrayList)).getClass();
        if (arrayList.size() > 0) {
            ((g1) arrayList.get(0)).getClass();
            throw null;
        }
        if (arrayList.size() > 0) {
            g1 g1Var = (g1) arrayList.get(0);
            arrayList2.add(new h(g1Var, z4));
            g1Var.getClass();
            new m(g1Var);
            if (!z4) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList3.get(i5);
            i5++;
            if (!((m) obj).x()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList4.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList4.get(i6);
            i6++;
            ((m) obj2).getClass();
        }
        int size3 = arrayList5.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj3 = arrayList5.get(i7);
            i7++;
            ((m) obj3).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        if (arrayList2.size() > 0) {
            ((h) arrayList2.get(0)).getClass();
            throw null;
        }
        arrayList7.isEmpty();
        int size4 = arrayList2.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj4 = arrayList2.get(i8);
            i8++;
            h hVar = (h) obj4;
            Context context = this.f405a.getContext();
            hVar.getClass();
            g4.i.d(context, "context");
            androidx.emoji2.text.p S = hVar.S(context);
            if (S != null) {
                if (((AnimatorSet) S.f274i) != null) {
                    throw null;
                }
                arrayList6.add(hVar);
            }
        }
        if (arrayList6.size() <= 0) {
            return;
        }
        ((h) arrayList6.get(0)).getClass();
        throw null;
    }

    public final void c() {
        if (this.f410f) {
            return;
        }
        if (!this.f405a.isAttachedToWindow()) {
            d();
            this.f409e = false;
            return;
        }
        synchronized (this.f406b) {
            try {
                ArrayList b02 = u3.g.b0(this.f407c);
                this.f407c.clear();
                int size = b02.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = b02.get(i5);
                    i5++;
                    g1 g1Var = (g1) obj;
                    if (!this.f406b.isEmpty()) {
                        g1Var.getClass();
                        throw null;
                    }
                    g1Var.getClass();
                }
                int size2 = b02.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = b02.get(i6);
                    i6++;
                    g1 g1Var2 = (g1) obj2;
                    if (this.f408d) {
                        if (u0.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + g1Var2);
                        }
                        g1Var2.b();
                        throw null;
                    }
                    if (u0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + g1Var2);
                    }
                    g1Var2.a(this.f405a);
                    this.f408d = false;
                    this.f407c.add(g1Var2);
                }
                if (!this.f406b.isEmpty()) {
                    f();
                    ArrayList b03 = u3.g.b0(this.f406b);
                    if (b03.isEmpty()) {
                        return;
                    }
                    this.f406b.clear();
                    this.f407c.addAll(b03);
                    if (u0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(b03, this.f409e);
                    int i7 = 0;
                    if (b03.size() > 0) {
                        ((g1) b03.get(0)).getClass();
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size3 = b03.size();
                    while (i7 < size3) {
                        Object obj3 = b03.get(i7);
                        i7++;
                        ((g1) obj3).getClass();
                        u3.m.U(arrayList, null);
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    boolean z4 = !isEmpty;
                    if (b03.size() > 0) {
                        ((g1) b03.get(0)).getClass();
                        throw null;
                    }
                    this.f408d = !z4;
                    if (u0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + z4 + " \ntransition = true");
                    }
                    if (!isEmpty) {
                        e(b03);
                        int size4 = b03.size();
                        for (int i8 = 0; i8 < size4; i8++) {
                            a((g1) b03.get(i8));
                        }
                    }
                    this.f409e = false;
                    if (u0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str;
        String str2;
        if (u0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f405a.isAttachedToWindow();
        synchronized (this.f406b) {
            try {
                f();
                e(this.f406b);
                ArrayList b02 = u3.g.b0(this.f407c);
                int size = b02.size();
                int i5 = 0;
                int i6 = 0;
                while (i6 < size) {
                    Object obj = b02.get(i6);
                    i6++;
                    ((g1) obj).getClass();
                }
                int size2 = b02.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = b02.get(i7);
                    i7++;
                    g1 g1Var = (g1) obj2;
                    if (u0.J(2)) {
                        if (isAttachedToWindow) {
                            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        } else {
                            str2 = "Container " + this.f405a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + g1Var);
                    }
                    g1Var.a(this.f405a);
                }
                ArrayList b03 = u3.g.b0(this.f406b);
                int size3 = b03.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj3 = b03.get(i8);
                    i8++;
                    ((g1) obj3).getClass();
                }
                int size4 = b03.size();
                while (i5 < size4) {
                    Object obj4 = b03.get(i5);
                    i5++;
                    g1 g1Var2 = (g1) obj4;
                    if (u0.J(2)) {
                        if (isAttachedToWindow) {
                            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        } else {
                            str = "Container " + this.f405a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + g1Var2);
                    }
                    g1Var2.a(this.f405a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(List list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            g1 g1Var = (g1) list.get(i5);
            g1Var.getClass();
            if (!g1Var.f384a) {
                g1Var.f384a = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((g1) it.next()).getClass();
            u3.m.U(arrayList, null);
        }
        List a02 = u3.g.a0(u3.g.c0(arrayList));
        int size2 = a02.size();
        for (int i6 = 0; i6 < size2; i6++) {
            f1 f1Var = (f1) a02.get(i6);
            f1Var.getClass();
            ViewGroup viewGroup = this.f405a;
            g4.i.e(viewGroup, "container");
            if (!f1Var.f379a) {
                f1Var.c(viewGroup);
            }
            f1Var.f379a = true;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f406b;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((g1) obj).getClass();
        }
    }
}
