package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.RequestConfiguration;
import com.lokhnathtechnical.notecounterpro.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class u0 {
    public final n0 A;
    public final t2.i B;
    public d.g C;
    public d.g D;
    public d.g E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public y0 O;
    public final o P;

    /* renamed from: b, reason: collision with root package name */
    public boolean f440b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f443e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.f0 f445g;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f451n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.emoji2.text.p f452o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f453p;

    /* renamed from: q, reason: collision with root package name */
    public final j0 f454q;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f455r;

    /* renamed from: s, reason: collision with root package name */
    public final j0 f456s;

    /* renamed from: t, reason: collision with root package name */
    public final j0 f457t;

    /* renamed from: u, reason: collision with root package name */
    public final m0 f458u;

    /* renamed from: v, reason: collision with root package name */
    public int f459v;
    public d0 w;

    /* renamed from: x, reason: collision with root package name */
    public a.a f460x;

    /* renamed from: y, reason: collision with root package name */
    public z f461y;

    /* renamed from: z, reason: collision with root package name */
    public z f462z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f439a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final r1.h f441c = new r1.h(2);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f442d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final i0 f444f = new i0(this);
    public a h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f446i = false;

    /* renamed from: j, reason: collision with root package name */
    public final l0 f447j = new l0(this);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f448k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map f449l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f450m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.j0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.j0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.j0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.j0] */
    public u0() {
        Collections.synchronizedMap(new HashMap());
        this.f451n = new ArrayList();
        this.f452o = new androidx.emoji2.text.p(this);
        this.f453p = new CopyOnWriteArrayList();
        final int i5 = 0;
        this.f454q = new e0.a(this) { // from class: androidx.fragment.app.j0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f399b;

            {
                this.f399b = this;
            }

            @Override // e0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        u0 u0Var = this.f399b;
                        if (u0Var.L()) {
                            u0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f399b;
                        if (u0Var2.L() && num.intValue() == 80) {
                            u0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        u.j jVar = (u.j) obj;
                        u0 u0Var3 = this.f399b;
                        if (u0Var3.L()) {
                            boolean z4 = jVar.f3461a;
                            u0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        u.w wVar = (u.w) obj;
                        u0 u0Var4 = this.f399b;
                        if (u0Var4.L()) {
                            boolean z5 = wVar.f3491a;
                            u0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 1;
        this.f455r = new e0.a(this) { // from class: androidx.fragment.app.j0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f399b;

            {
                this.f399b = this;
            }

            @Override // e0.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        u0 u0Var = this.f399b;
                        if (u0Var.L()) {
                            u0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f399b;
                        if (u0Var2.L() && num.intValue() == 80) {
                            u0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        u.j jVar = (u.j) obj;
                        u0 u0Var3 = this.f399b;
                        if (u0Var3.L()) {
                            boolean z4 = jVar.f3461a;
                            u0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        u.w wVar = (u.w) obj;
                        u0 u0Var4 = this.f399b;
                        if (u0Var4.L()) {
                            boolean z5 = wVar.f3491a;
                            u0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i7 = 2;
        this.f456s = new e0.a(this) { // from class: androidx.fragment.app.j0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f399b;

            {
                this.f399b = this;
            }

            @Override // e0.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        u0 u0Var = this.f399b;
                        if (u0Var.L()) {
                            u0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f399b;
                        if (u0Var2.L() && num.intValue() == 80) {
                            u0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        u.j jVar = (u.j) obj;
                        u0 u0Var3 = this.f399b;
                        if (u0Var3.L()) {
                            boolean z4 = jVar.f3461a;
                            u0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        u.w wVar = (u.w) obj;
                        u0 u0Var4 = this.f399b;
                        if (u0Var4.L()) {
                            boolean z5 = wVar.f3491a;
                            u0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i8 = 3;
        this.f457t = new e0.a(this) { // from class: androidx.fragment.app.j0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f399b;

            {
                this.f399b = this;
            }

            @Override // e0.a
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        u0 u0Var = this.f399b;
                        if (u0Var.L()) {
                            u0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f399b;
                        if (u0Var2.L() && num.intValue() == 80) {
                            u0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        u.j jVar = (u.j) obj;
                        u0 u0Var3 = this.f399b;
                        if (u0Var3.L()) {
                            boolean z4 = jVar.f3461a;
                            u0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        u.w wVar = (u.w) obj;
                        u0 u0Var4 = this.f399b;
                        if (u0Var4.L()) {
                            boolean z5 = wVar.f3491a;
                            u0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f458u = new m0(this);
        this.f459v = -1;
        this.A = new n0(this);
        this.B = new t2.i(5);
        this.F = new ArrayDeque();
        this.P = new o(this, 2);
    }

    public static HashSet E(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < aVar.f302a.size(); i5++) {
            z zVar = ((c1) aVar.f302a.get(i5)).f359b;
            if (zVar != null && aVar.f308g) {
                hashSet.add(zVar);
            }
        }
        return hashSet;
    }

    public static boolean J(int i5) {
        return Log.isLoggable("FragmentManager", i5);
    }

    public static boolean K(z zVar) {
        zVar.getClass();
        ArrayList k5 = zVar.B.f441c.k();
        int size = k5.size();
        boolean z4 = false;
        int i5 = 0;
        while (i5 < size) {
            Object obj = k5.get(i5);
            i5++;
            z zVar2 = (z) obj;
            if (zVar2 != null) {
                z4 = K(zVar2);
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(z zVar) {
        if (zVar == null) {
            return true;
        }
        if (zVar.J) {
            return zVar.f508z == null || M(zVar.C);
        }
        return false;
    }

    public static boolean N(z zVar) {
        if (zVar == null) {
            return true;
        }
        u0 u0Var = zVar.f508z;
        return zVar.equals(u0Var.f462z) && N(u0Var.f461y);
    }

    public static void b0(z zVar) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + zVar);
        }
        if (zVar.G) {
            zVar.G = false;
            zVar.P = !zVar.P;
        }
    }

    public final boolean A(boolean z4) {
        boolean z5;
        a aVar;
        z(z4);
        if (!this.f446i && (aVar = this.h) != null) {
            aVar.f318r = false;
            aVar.d();
            if (J(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.f439a);
            }
            this.h.e(false, false);
            this.f439a.add(0, this.h);
            ArrayList arrayList = this.h.f302a;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                z zVar = ((c1) obj).f359b;
                if (zVar != null) {
                    zVar.f502s = false;
                }
            }
            this.h = null;
        }
        boolean z6 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.f439a) {
                if (this.f439a.isEmpty()) {
                    z5 = false;
                } else {
                    try {
                        int size2 = this.f439a.size();
                        z5 = false;
                        for (int i6 = 0; i6 < size2; i6++) {
                            z5 |= ((r0) this.f439a.get(i6)).a(arrayList2, arrayList3);
                        }
                    } finally {
                    }
                }
            }
            if (!z5) {
                e0();
                v();
                ((HashMap) this.f441c.h).values().removeAll(Collections.singleton(null));
                return z6;
            }
            z6 = true;
            this.f440b = true;
            try {
                T(this.L, this.M);
            } finally {
                d();
            }
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i5, int i6) {
        String str;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        int i8;
        int i9;
        r1.h hVar = this.f441c;
        ArrayList arrayList3 = this.f451n;
        boolean z7 = ((a) arrayList.get(i5)).f315o;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(hVar.m());
        z zVar = this.f462z;
        int i10 = i5;
        boolean z8 = false;
        while (i10 < i6) {
            a aVar = (a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                z4 = z7;
                i7 = i10;
                z5 = z8;
                int i11 = 1;
                ArrayList arrayList5 = this.N;
                ArrayList arrayList6 = aVar.f302a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    c1 c1Var = (c1) arrayList6.get(size);
                    int i12 = c1Var.f358a;
                    if (i12 != i11) {
                        if (i12 != 3) {
                            switch (i12) {
                                case 8:
                                    zVar = null;
                                    break;
                                case 9:
                                    zVar = c1Var.f359b;
                                    break;
                                case 10:
                                    c1Var.f365i = c1Var.h;
                                    break;
                            }
                            size--;
                            i11 = 1;
                        }
                        arrayList5.add(c1Var.f359b);
                        size--;
                        i11 = 1;
                    }
                    arrayList5.remove(c1Var.f359b);
                    size--;
                    i11 = 1;
                }
            } else {
                ArrayList arrayList7 = this.N;
                ArrayList arrayList8 = aVar.f302a;
                int i13 = 0;
                while (i13 < arrayList8.size()) {
                    c1 c1Var2 = (c1) arrayList8.get(i13);
                    boolean z9 = z7;
                    int i14 = c1Var2.f358a;
                    int i15 = i10;
                    int i16 = 1;
                    if (i14 != 1) {
                        z6 = z8;
                        if (i14 != 2) {
                            if (i14 == 3 || i14 == 6) {
                                arrayList7.remove(c1Var2.f359b);
                                z zVar2 = c1Var2.f359b;
                                if (zVar2 == zVar) {
                                    arrayList8.add(i13, new c1(9, zVar2));
                                    i13++;
                                    zVar = null;
                                }
                            } else if (i14 == 7) {
                                i16 = 1;
                            } else if (i14 == 8) {
                                arrayList8.add(i13, new c1(9, zVar, 0));
                                c1Var2.f360c = true;
                                i13++;
                                zVar = c1Var2.f359b;
                            }
                            i16 = 1;
                        } else {
                            z zVar3 = c1Var2.f359b;
                            int i17 = zVar3.E;
                            int size2 = arrayList7.size() - 1;
                            boolean z10 = false;
                            while (size2 >= 0) {
                                int i18 = size2;
                                z zVar4 = (z) arrayList7.get(size2);
                                if (zVar4.E != i17) {
                                    i8 = i17;
                                } else if (zVar4 == zVar3) {
                                    i8 = i17;
                                    z10 = true;
                                } else {
                                    if (zVar4 == zVar) {
                                        i8 = i17;
                                        arrayList8.add(i13, new c1(9, zVar4, 0));
                                        i13++;
                                        i9 = 0;
                                        zVar = null;
                                    } else {
                                        i8 = i17;
                                        i9 = 0;
                                    }
                                    c1 c1Var3 = new c1(3, zVar4, i9);
                                    c1Var3.f361d = c1Var2.f361d;
                                    c1Var3.f363f = c1Var2.f363f;
                                    c1Var3.f362e = c1Var2.f362e;
                                    c1Var3.f364g = c1Var2.f364g;
                                    arrayList8.add(i13, c1Var3);
                                    arrayList7.remove(zVar4);
                                    i13++;
                                    zVar = zVar;
                                }
                                size2 = i18 - 1;
                                i17 = i8;
                            }
                            i16 = 1;
                            if (z10) {
                                arrayList8.remove(i13);
                                i13--;
                            } else {
                                c1Var2.f358a = 1;
                                c1Var2.f360c = true;
                                arrayList7.add(zVar3);
                            }
                        }
                        i13 += i16;
                        z7 = z9;
                        i10 = i15;
                        z8 = z6;
                    } else {
                        z6 = z8;
                    }
                    arrayList7.add(c1Var2.f359b);
                    i13 += i16;
                    z7 = z9;
                    i10 = i15;
                    z8 = z6;
                }
                z4 = z7;
                i7 = i10;
                z5 = z8;
            }
            z8 = z5 || aVar.f308g;
            i10 = i7 + 1;
            z7 = z4;
        }
        boolean z11 = z7;
        boolean z12 = z8;
        this.N.clear();
        if (!z11 && this.f459v >= 1) {
            for (int i19 = i5; i19 < i6; i19++) {
                ArrayList arrayList9 = ((a) arrayList.get(i19)).f302a;
                int size3 = arrayList9.size();
                int i20 = 0;
                while (i20 < size3) {
                    Object obj = arrayList9.get(i20);
                    i20++;
                    z zVar5 = ((c1) obj).f359b;
                    if (zVar5 != null && zVar5.f508z != null) {
                        hVar.o(g(zVar5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i21 = i5;
        while (i21 < i6) {
            a aVar2 = (a) arrayList.get(i21);
            if (((Boolean) arrayList2.get(i21)).booleanValue()) {
                aVar2.c(-1);
                u0 u0Var = aVar2.f317q;
                ArrayList arrayList10 = aVar2.f302a;
                boolean z13 = true;
                for (int size4 = arrayList10.size() - 1; size4 >= 0; size4--) {
                    c1 c1Var4 = (c1) arrayList10.get(size4);
                    z zVar6 = c1Var4.f359b;
                    if (zVar6 != null) {
                        if (zVar6.O != null) {
                            zVar6.b().f468a = z13;
                        }
                        int i22 = aVar2.f307f;
                        int i23 = 8194;
                        int i24 = 4097;
                        if (i22 != 4097) {
                            if (i22 != 8194) {
                                i23 = 4100;
                                if (i22 != 8197) {
                                    i24 = 4099;
                                    if (i22 != 4099) {
                                        i23 = i22 != 4100 ? 0 : 8197;
                                    }
                                }
                            }
                            i23 = i24;
                        }
                        if (zVar6.O != null || i23 != 0) {
                            zVar6.b();
                            zVar6.O.f473f = i23;
                        }
                        zVar6.b();
                        zVar6.O.getClass();
                    }
                    switch (c1Var4.f358a) {
                        case 1:
                            zVar6.w(c1Var4.f361d, c1Var4.f362e, c1Var4.f363f, c1Var4.f364g);
                            z13 = true;
                            u0Var.X(zVar6, true);
                            u0Var.S(zVar6);
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + c1Var4.f358a);
                        case 3:
                            zVar6.w(c1Var4.f361d, c1Var4.f362e, c1Var4.f363f, c1Var4.f364g);
                            u0Var.a(zVar6);
                            z13 = true;
                        case 4:
                            zVar6.w(c1Var4.f361d, c1Var4.f362e, c1Var4.f363f, c1Var4.f364g);
                            u0Var.getClass();
                            b0(zVar6);
                            z13 = true;
                        case 5:
                            zVar6.w(c1Var4.f361d, c1Var4.f362e, c1Var4.f363f, c1Var4.f364g);
                            u0Var.X(zVar6, true);
                            u0Var.I(zVar6);
                            z13 = true;
                        case 6:
                            zVar6.w(c1Var4.f361d, c1Var4.f362e, c1Var4.f363f, c1Var4.f364g);
                            u0Var.c(zVar6);
                            z13 = true;
                        case 7:
                            zVar6.w(c1Var4.f361d, c1Var4.f362e, c1Var4.f363f, c1Var4.f364g);
                            u0Var.X(zVar6, true);
                            u0Var.h(zVar6);
                            z13 = true;
                        case 8:
                            u0Var.Z(null);
                            z13 = true;
                        case 9:
                            u0Var.Z(zVar6);
                            z13 = true;
                        case 10:
                            c1Var4.f365i = zVar6.S;
                            u0Var.Y(zVar6, c1Var4.h);
                            z13 = true;
                    }
                }
            } else {
                aVar2.c(1);
                u0 u0Var2 = aVar2.f317q;
                ArrayList arrayList11 = aVar2.f302a;
                int size5 = arrayList11.size();
                int i25 = 0;
                while (i25 < size5) {
                    c1 c1Var5 = (c1) arrayList11.get(i25);
                    z zVar7 = c1Var5.f359b;
                    if (zVar7 != null) {
                        if (zVar7.O != null) {
                            zVar7.b().f468a = false;
                        }
                        int i26 = aVar2.f307f;
                        if (zVar7.O != null || i26 != 0) {
                            zVar7.b();
                            zVar7.O.f473f = i26;
                        }
                        zVar7.b();
                        zVar7.O.getClass();
                    }
                    switch (c1Var5.f358a) {
                        case 1:
                            str = str2;
                            zVar7.w(c1Var5.f361d, c1Var5.f362e, c1Var5.f363f, c1Var5.f364g);
                            u0Var2.X(zVar7, false);
                            u0Var2.a(zVar7);
                            i25++;
                            str2 = str;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + c1Var5.f358a);
                        case 3:
                            str = str2;
                            zVar7.w(c1Var5.f361d, c1Var5.f362e, c1Var5.f363f, c1Var5.f364g);
                            u0Var2.S(zVar7);
                            i25++;
                            str2 = str;
                        case 4:
                            str = str2;
                            zVar7.w(c1Var5.f361d, c1Var5.f362e, c1Var5.f363f, c1Var5.f364g);
                            u0Var2.I(zVar7);
                            i25++;
                            str2 = str;
                        case 5:
                            str = str2;
                            zVar7.w(c1Var5.f361d, c1Var5.f362e, c1Var5.f363f, c1Var5.f364g);
                            u0Var2.X(zVar7, false);
                            b0(zVar7);
                            i25++;
                            str2 = str;
                        case 6:
                            str = str2;
                            zVar7.w(c1Var5.f361d, c1Var5.f362e, c1Var5.f363f, c1Var5.f364g);
                            u0Var2.h(zVar7);
                            i25++;
                            str2 = str;
                        case 7:
                            str = str2;
                            zVar7.w(c1Var5.f361d, c1Var5.f362e, c1Var5.f363f, c1Var5.f364g);
                            u0Var2.X(zVar7, false);
                            u0Var2.c(zVar7);
                            i25++;
                            str2 = str;
                        case 8:
                            u0Var2.Z(zVar7);
                            str = str2;
                            i25++;
                            str2 = str;
                        case 9:
                            u0Var2.Z(null);
                            str = str2;
                            i25++;
                            str2 = str;
                        case 10:
                            c1Var5.h = zVar7.S;
                            u0Var2.Y(zVar7, c1Var5.f365i);
                            str = str2;
                            i25++;
                            str2 = str;
                    }
                }
            }
            i21++;
            str2 = str2;
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i6 - 1)).booleanValue();
        if (z12 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i27 = 0;
            while (i27 < size6) {
                Object obj2 = arrayList.get(i27);
                i27++;
                linkedHashSet.addAll(E((a) obj2));
            }
            if (this.h == null) {
                int size7 = arrayList3.size();
                int i28 = 0;
                while (i28 < size7) {
                    Object obj3 = arrayList3.get(i28);
                    i28++;
                    if (obj3 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i29 = 0;
                while (i29 < size8) {
                    Object obj4 = arrayList3.get(i29);
                    i29++;
                    if (obj4 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i30 = i5; i30 < i6; i30++) {
            a aVar3 = (a) arrayList.get(i30);
            if (booleanValue) {
                for (int size9 = aVar3.f302a.size() - 1; size9 >= 0; size9--) {
                    z zVar8 = ((c1) aVar3.f302a.get(size9)).f359b;
                    if (zVar8 != null) {
                        g(zVar8).j();
                    }
                }
            } else {
                ArrayList arrayList12 = aVar3.f302a;
                int size10 = arrayList12.size();
                int i31 = 0;
                while (i31 < size10) {
                    Object obj5 = arrayList12.get(i31);
                    i31++;
                    z zVar9 = ((c1) obj5).f359b;
                    if (zVar9 != null) {
                        g(zVar9).j();
                    }
                }
            }
        }
        O(this.f459v, true);
        int i32 = i5;
        Iterator it3 = f(arrayList, i32, i6).iterator();
        while (it3.hasNext()) {
            n nVar = (n) it3.next();
            nVar.f409e = booleanValue;
            synchronized (nVar.f406b) {
                nVar.f();
                ArrayList arrayList13 = nVar.f406b;
                ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                if (listIterator.hasPrevious()) {
                    ((g1) listIterator.previous()).getClass();
                    throw null;
                }
                nVar.f410f = false;
            }
            nVar.c();
        }
        while (i32 < i6) {
            a aVar4 = (a) arrayList.get(i32);
            if (((Boolean) arrayList2.get(i32)).booleanValue() && aVar4.f319s >= 0) {
                aVar4.f319s = -1;
            }
            if (aVar4.f316p != null) {
                for (int i33 = 0; i33 < aVar4.f316p.size(); i33++) {
                    ((Runnable) aVar4.f316p.get(i33)).run();
                }
                aVar4.f316p = null;
            }
            i32++;
        }
        if (!z12 || arrayList3.size() <= 0) {
            return;
        }
        arrayList3.get(0).getClass();
        throw new ClassCastException();
    }

    public final z C(int i5) {
        r1.h hVar = this.f441c;
        ArrayList arrayList = (ArrayList) hVar.f3161g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            if (zVar != null && zVar.D == i5) {
                return zVar;
            }
        }
        for (b1 b1Var : ((HashMap) hVar.h).values()) {
            if (b1Var != null) {
                z zVar2 = b1Var.f341c;
                if (zVar2.D == i5) {
                    return zVar2;
                }
            }
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar.f410f) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                nVar.f410f = false;
                nVar.c();
            }
        }
    }

    public final ViewGroup F(z zVar) {
        ViewGroup viewGroup = zVar.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (zVar.E <= 0 || !this.f460x.s()) {
            return null;
        }
        View r2 = this.f460x.r(zVar.E);
        if (r2 instanceof ViewGroup) {
            return (ViewGroup) r2;
        }
        return null;
    }

    public final n0 G() {
        z zVar = this.f461y;
        return zVar != null ? zVar.f508z.G() : this.A;
    }

    public final t2.i H() {
        z zVar = this.f461y;
        return zVar != null ? zVar.f508z.H() : this.B;
    }

    public final void I(z zVar) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + zVar);
        }
        if (zVar.G) {
            return;
        }
        zVar.G = true;
        zVar.P = true ^ zVar.P;
        a0(zVar);
    }

    public final boolean L() {
        z zVar = this.f461y;
        if (zVar == null) {
            return true;
        }
        return zVar.A != null && zVar.f500q && zVar.e().L();
    }

    public final void O(int i5, boolean z4) {
        d0 d0Var;
        if (this.w == null && i5 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i5 != this.f459v) {
            this.f459v = i5;
            r1.h hVar = this.f441c;
            HashMap hashMap = (HashMap) hVar.h;
            ArrayList arrayList = (ArrayList) hVar.f3161g;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                b1 b1Var = (b1) hashMap.get(((z) obj).f494k);
                if (b1Var != null) {
                    b1Var.j();
                }
            }
            for (b1 b1Var2 : hashMap.values()) {
                if (b1Var2 != null) {
                    b1Var2.j();
                    z zVar = b1Var2.f341c;
                    if (zVar.f501r && !zVar.i()) {
                        hVar.p(b1Var2);
                    }
                }
            }
            c0();
            if (this.G && (d0Var = this.w) != null && this.f459v == 7) {
                d0Var.f371q.invalidateMenu();
                this.G = false;
            }
        }
    }

    public final void P() {
        if (this.w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.f490i = false;
        for (z zVar : this.f441c.m()) {
            if (zVar != null) {
                zVar.B.P();
            }
        }
    }

    public final boolean Q() {
        A(false);
        z(true);
        z zVar = this.f462z;
        if (zVar != null && zVar.c().Q()) {
            return true;
        }
        boolean R = R(this.L, this.M, -1, 0);
        if (R) {
            this.f440b = true;
            try {
                T(this.L, this.M);
            } finally {
                d();
            }
        }
        e0();
        v();
        ((HashMap) this.f441c.h).values().removeAll(Collections.singleton(null));
        return R;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i5, int i6) {
        boolean z4 = (i6 & 1) != 0;
        int i7 = -1;
        if (!this.f442d.isEmpty()) {
            if (i5 < 0) {
                i7 = z4 ? 0 : this.f442d.size() - 1;
            } else {
                int size = this.f442d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.f442d.get(size);
                    if (i5 >= 0 && i5 == aVar.f319s) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i7 = size;
                } else if (z4) {
                    i7 = size;
                    while (i7 > 0) {
                        a aVar2 = (a) this.f442d.get(i7 - 1);
                        if (i5 < 0 || i5 != aVar2.f319s) {
                            break;
                        }
                        i7--;
                    }
                } else if (size != this.f442d.size() - 1) {
                    i7 = size + 1;
                }
            }
        }
        if (i7 < 0) {
            return false;
        }
        for (int size2 = this.f442d.size() - 1; size2 >= i7; size2--) {
            arrayList.add((a) this.f442d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(z zVar) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + zVar + " nesting=" + zVar.f507y);
        }
        boolean i5 = zVar.i();
        if (zVar.H && i5) {
            return;
        }
        r1.h hVar = this.f441c;
        synchronized (((ArrayList) hVar.f3161g)) {
            ((ArrayList) hVar.f3161g).remove(zVar);
        }
        zVar.f500q = false;
        if (K(zVar)) {
            this.G = true;
        }
        zVar.f501r = true;
        a0(zVar);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            if (!((a) arrayList.get(i5)).f315o) {
                if (i6 != i5) {
                    B(arrayList, arrayList2, i6, i5);
                }
                i6 = i5 + 1;
                if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                    while (i6 < size && ((Boolean) arrayList2.get(i6)).booleanValue() && !((a) arrayList.get(i6)).f315o) {
                        i6++;
                    }
                }
                B(arrayList, arrayList2, i5, i6);
                i5 = i6 - 1;
            }
            i5++;
        }
        if (i6 != size) {
            B(arrayList, arrayList2, i6, size);
        }
    }

    public final void U(Bundle bundle) {
        androidx.emoji2.text.p pVar;
        int i5;
        int i6;
        Bundle bundle2;
        b1 b1Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.w.f368n.getClassLoader());
                this.f450m.put(str.substring(7), bundle4);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.w.f368n.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        r1.h hVar = this.f441c;
        HashMap hashMap2 = (HashMap) hVar.f3162i;
        HashMap hashMap3 = (HashMap) hVar.h;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        w0 w0Var = (w0) bundle.getParcelable("state");
        if (w0Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = w0Var.f477g;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            pVar = this.f452o;
            if (i7 >= size) {
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            Bundle s5 = hVar.s(null, (String) obj);
            if (s5 != null) {
                z zVar = (z) this.O.f486d.get(((a1) s5.getParcelable("state")).h);
                if (zVar != null) {
                    if (J(2)) {
                        i6 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + zVar);
                    } else {
                        i6 = 2;
                    }
                    b1Var = new b1(pVar, hVar, zVar, s5);
                    bundle2 = s5;
                } else {
                    i6 = 2;
                    bundle2 = s5;
                    b1Var = new b1(this.f452o, this.f441c, this.w.f368n.getClassLoader(), G(), s5);
                }
                z zVar2 = b1Var.f341c;
                zVar2.h = bundle2;
                zVar2.f508z = this;
                if (J(i6)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + zVar2.f494k + "): " + zVar2);
                }
                b1Var.l(this.w.f368n.getClassLoader());
                hVar.o(b1Var);
                b1Var.f343e = this.f459v;
            }
        }
        y0 y0Var = this.O;
        y0Var.getClass();
        ArrayList arrayList2 = new ArrayList(y0Var.f486d.values());
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            z zVar3 = (z) obj2;
            if (hashMap3.get(zVar3.f494k) == null) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + zVar3 + " that was not found in the set of active Fragments " + w0Var.f477g);
                }
                this.O.f(zVar3);
                zVar3.f508z = this;
                b1 b1Var2 = new b1(pVar, hVar, zVar3);
                b1Var2.f343e = 1;
                b1Var2.j();
                zVar3.f501r = true;
                b1Var2.j();
            }
        }
        ArrayList arrayList3 = w0Var.h;
        ((ArrayList) hVar.f3161g).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList3.get(i9);
                i9++;
                String str3 = (String) obj3;
                z e4 = hVar.e(str3);
                if (e4 == null) {
                    throw new IllegalStateException(s.c.b("No instantiated fragment for (", str3, ")"));
                }
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + e4);
                }
                hVar.c(e4);
            }
        }
        if (w0Var.f478i != null) {
            this.f442d = new ArrayList(w0Var.f478i.length);
            int i10 = 0;
            while (true) {
                c[] cVarArr = w0Var.f478i;
                if (i10 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i10];
                ArrayList arrayList4 = cVar.h;
                a aVar = new a(this);
                int[] iArr = cVar.f344g;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iArr.length) {
                    c1 c1Var = new c1();
                    int i13 = i11 + 1;
                    c1Var.f358a = iArr[i11];
                    if (J(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i12 + " base fragment #" + iArr[i13]);
                    }
                    c1Var.h = androidx.lifecycle.n.values()[cVar.f345i[i12]];
                    c1Var.f365i = androidx.lifecycle.n.values()[cVar.f346j[i12]];
                    int i14 = i11 + 2;
                    c1Var.f360c = iArr[i13] != 0;
                    int i15 = iArr[i14];
                    c1Var.f361d = i15;
                    int i16 = iArr[i11 + 3];
                    c1Var.f362e = i16;
                    int i17 = i11 + 5;
                    int i18 = iArr[i11 + 4];
                    c1Var.f363f = i18;
                    i11 += 6;
                    int[] iArr2 = iArr;
                    int i19 = iArr2[i17];
                    c1Var.f364g = i19;
                    aVar.f303b = i15;
                    aVar.f304c = i16;
                    aVar.f305d = i18;
                    aVar.f306e = i19;
                    aVar.b(c1Var);
                    i12++;
                    iArr = iArr2;
                }
                aVar.f307f = cVar.f347k;
                aVar.h = cVar.f348l;
                aVar.f308g = true;
                aVar.f309i = cVar.f350n;
                aVar.f310j = cVar.f351o;
                aVar.f311k = cVar.f352p;
                aVar.f312l = cVar.f353q;
                aVar.f313m = cVar.f354r;
                aVar.f314n = cVar.f355s;
                aVar.f315o = cVar.f356t;
                aVar.f319s = cVar.f349m;
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    String str4 = (String) arrayList4.get(i20);
                    if (str4 != null) {
                        ((c1) aVar.f302a.get(i20)).f359b = hVar.e(str4);
                    }
                }
                aVar.c(1);
                if (J(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + aVar.f319s + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new e1());
                    aVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.f442d.add(aVar);
                i10++;
            }
            i5 = 0;
        } else {
            i5 = 0;
            this.f442d = new ArrayList();
        }
        this.f448k.set(w0Var.f479j);
        String str5 = w0Var.f480k;
        if (str5 != null) {
            z e5 = hVar.e(str5);
            this.f462z = e5;
            r(e5);
        }
        ArrayList arrayList5 = w0Var.f481l;
        if (arrayList5 != null) {
            for (int i21 = i5; i21 < arrayList5.size(); i21++) {
                this.f449l.put((String) arrayList5.get(i21), (d) w0Var.f482m.get(i21));
            }
        }
        this.F = new ArrayDeque(w0Var.f483n);
    }

    public final Bundle V() {
        int i5;
        ArrayList arrayList;
        c[] cVarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        D();
        x();
        A(true);
        this.H = true;
        this.O.f490i = true;
        r1.h hVar = this.f441c;
        hVar.getClass();
        HashMap hashMap = (HashMap) hVar.h;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b1 b1Var = (b1) it.next();
            if (b1Var != null) {
                z zVar = b1Var.f341c;
                String str = zVar.f494k;
                Bundle bundle3 = new Bundle();
                z zVar2 = b1Var.f341c;
                if (zVar2.f491g == -1 && (bundle = zVar2.h) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new a1(zVar2));
                if (zVar2.f491g > 0) {
                    Bundle bundle4 = new Bundle();
                    zVar2.q(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    b1Var.f339a.t(zVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    zVar2.V.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle V = zVar2.B.V();
                    if (!V.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", V);
                    }
                    SparseArray<? extends Parcelable> sparseArray = zVar2.f492i;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = zVar2.f493j;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = zVar2.f495l;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                hVar.s(bundle3, str);
                arrayList2.add(zVar.f494k);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + zVar + ": " + zVar.h);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f441c.f3162i;
        if (!hashMap2.isEmpty()) {
            r1.h hVar2 = this.f441c;
            synchronized (((ArrayList) hVar2.f3161g)) {
                try {
                    if (((ArrayList) hVar2.f3161g).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) hVar2.f3161g).size());
                        ArrayList arrayList3 = (ArrayList) hVar2.f3161g;
                        int size = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj = arrayList3.get(i6);
                            i6++;
                            z zVar3 = (z) obj;
                            arrayList.add(zVar3.f494k);
                            if (J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + zVar3.f494k + "): " + zVar3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.f442d.size();
            if (size2 > 0) {
                cVarArr = new c[size2];
                for (i5 = 0; i5 < size2; i5++) {
                    cVarArr[i5] = new c((a) this.f442d.get(i5));
                    if (J(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.f442d.get(i5));
                    }
                }
            } else {
                cVarArr = null;
            }
            w0 w0Var = new w0();
            w0Var.f480k = null;
            ArrayList arrayList4 = new ArrayList();
            w0Var.f481l = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            w0Var.f482m = arrayList5;
            w0Var.f477g = arrayList2;
            w0Var.h = arrayList;
            w0Var.f478i = cVarArr;
            w0Var.f479j = this.f448k.get();
            z zVar4 = this.f462z;
            if (zVar4 != null) {
                w0Var.f480k = zVar4.f494k;
            }
            arrayList4.addAll(this.f449l.keySet());
            arrayList5.addAll(this.f449l.values());
            w0Var.f483n = new ArrayList(this.F);
            bundle2.putParcelable("state", w0Var);
            for (String str2 : this.f450m.keySet()) {
                bundle2.putBundle(s.c.a("result_", str2), (Bundle) this.f450m.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(s.c.a("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void W() {
        synchronized (this.f439a) {
            try {
                if (this.f439a.size() == 1) {
                    this.w.f369o.removeCallbacks(this.P);
                    this.w.f369o.post(this.P);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(z zVar, boolean z4) {
        ViewGroup F = F(zVar);
        if (F == null || !(F instanceof g0)) {
            return;
        }
        ((g0) F).setDrawDisappearingViewsLast(!z4);
    }

    public final void Y(z zVar, androidx.lifecycle.n nVar) {
        if (zVar.equals(this.f441c.e(zVar.f494k)) && (zVar.A == null || zVar.f508z == this)) {
            zVar.S = nVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + zVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(z zVar) {
        if (zVar != null) {
            if (!zVar.equals(this.f441c.e(zVar.f494k)) || (zVar.A != null && zVar.f508z != this)) {
                throw new IllegalArgumentException("Fragment " + zVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        z zVar2 = this.f462z;
        this.f462z = zVar;
        r(zVar2);
        r(this.f462z);
    }

    public final b1 a(z zVar) {
        String str = zVar.R;
        if (str != null) {
            p0.c.c(zVar, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + zVar);
        }
        b1 g5 = g(zVar);
        zVar.f508z = this;
        r1.h hVar = this.f441c;
        hVar.o(g5);
        if (!zVar.H) {
            hVar.c(zVar);
            zVar.f501r = false;
            zVar.P = false;
            if (K(zVar)) {
                this.G = true;
            }
        }
        return g5;
    }

    public final void a0(z zVar) {
        ViewGroup F = F(zVar);
        if (F != null) {
            w wVar = zVar.O;
            if ((wVar == null ? 0 : wVar.f472e) + (wVar == null ? 0 : wVar.f471d) + (wVar == null ? 0 : wVar.f470c) + (wVar == null ? 0 : wVar.f469b) > 0) {
                if (F.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F.setTag(R.id.visible_removing_fragment_view_tag, zVar);
                }
                z zVar2 = (z) F.getTag(R.id.visible_removing_fragment_view_tag);
                w wVar2 = zVar.O;
                boolean z4 = wVar2 != null ? wVar2.f468a : false;
                if (zVar2.O == null) {
                    return;
                }
                zVar2.b().f468a = z4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(d0 d0Var, a.a aVar, z zVar) {
        if (this.w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.w = d0Var;
        this.f460x = aVar;
        this.f461y = zVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f453p;
        if (zVar != 0) {
            copyOnWriteArrayList.add(new o0(zVar));
        } else if (d0Var != null) {
            copyOnWriteArrayList.add(d0Var);
        }
        if (this.f461y != null) {
            e0();
        }
        if (d0Var != null) {
            androidx.activity.f0 onBackPressedDispatcher = d0Var.f371q.getOnBackPressedDispatcher();
            this.f445g = onBackPressedDispatcher;
            onBackPressedDispatcher.a(zVar != 0 ? zVar : d0Var, this.f447j);
        }
        if (zVar != 0) {
            y0 y0Var = zVar.f508z.O;
            HashMap hashMap = y0Var.f487e;
            y0 y0Var2 = (y0) hashMap.get(zVar.f494k);
            if (y0Var2 == null) {
                y0Var2 = new y0(y0Var.f489g);
                hashMap.put(zVar.f494k, y0Var2);
            }
            this.O = y0Var2;
        } else if (d0Var != null) {
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(d0Var.f371q.getViewModelStore(), y0.f485j);
            String canonicalName = y0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.O = (y0) tVar.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), y0.class);
        } else {
            this.O = new y0(false);
        }
        y0 y0Var3 = this.O;
        y0Var3.f490i = this.H || this.I;
        this.f441c.f3163j = y0Var3;
        d0 d0Var2 = this.w;
        if (d0Var2 != null && zVar == 0) {
            c1.d savedStateRegistry = d0Var2.f371q.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new a0(this, 1));
            Bundle a5 = savedStateRegistry.a("android:support:fragments");
            if (a5 != null) {
                U(a5);
            }
        }
        d0 d0Var3 = this.w;
        if (d0Var3 != null) {
            d.h activityResultRegistry = d0Var3.f371q.getActivityResultRegistry();
            String a6 = s.c.a("FragmentManager:", zVar != 0 ? s.c.d(new StringBuilder(), zVar.f494k, ":") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            this.C = activityResultRegistry.d(androidx.emoji2.text.u.j(a6, "StartActivityForResult"), new p0(2), new u1.f(this, 2));
            this.D = activityResultRegistry.d(androidx.emoji2.text.u.j(a6, "StartIntentSenderForResult"), new p0(0), new k0(this, 1));
            this.E = activityResultRegistry.d(androidx.emoji2.text.u.j(a6, "RequestPermissions"), new p0(1), new k0(this, 0));
        }
        d0 d0Var4 = this.w;
        if (d0Var4 != null) {
            d0Var4.f371q.addOnConfigurationChangedListener(this.f454q);
        }
        d0 d0Var5 = this.w;
        if (d0Var5 != null) {
            d0Var5.f371q.addOnTrimMemoryListener(this.f455r);
        }
        d0 d0Var6 = this.w;
        if (d0Var6 != null) {
            d0Var6.f371q.addOnMultiWindowModeChangedListener(this.f456s);
        }
        d0 d0Var7 = this.w;
        if (d0Var7 != null) {
            d0Var7.f371q.addOnPictureInPictureModeChangedListener(this.f457t);
        }
        d0 d0Var8 = this.w;
        if (d0Var8 == null || zVar != 0) {
            return;
        }
        d0Var8.f371q.addMenuProvider(this.f458u);
    }

    public final void c(z zVar) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + zVar);
        }
        if (zVar.H) {
            zVar.H = false;
            if (zVar.f500q) {
                return;
            }
            this.f441c.c(zVar);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + zVar);
            }
            if (K(zVar)) {
                this.G = true;
            }
        }
    }

    public final void c0() {
        ArrayList j2 = this.f441c.j();
        int size = j2.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = j2.get(i5);
            i5++;
            b1 b1Var = (b1) obj;
            z zVar = b1Var.f341c;
            if (zVar.M) {
                if (this.f440b) {
                    this.K = true;
                } else {
                    zVar.M = false;
                    b1Var.j();
                }
            }
        }
    }

    public final void d() {
        this.f440b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new e1());
        d0 d0Var = this.w;
        if (d0Var == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
                throw illegalStateException;
            }
        }
        try {
            d0Var.f371q.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e5) {
            Log.e("FragmentManager", "Failed dumping state", e5);
            throw illegalStateException;
        }
    }

    public final HashSet e() {
        n nVar;
        HashSet hashSet = new HashSet();
        ArrayList j2 = this.f441c.j();
        int size = j2.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = j2.get(i5);
            i5++;
            ViewGroup viewGroup = ((b1) obj).f341c.L;
            if (viewGroup != null) {
                g4.i.e(H(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof n) {
                    nVar = (n) tag;
                } else {
                    nVar = new n(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, nVar);
                }
                hashSet.add(nVar);
            }
        }
        return hashSet;
    }

    public final void e0() {
        synchronized (this.f439a) {
            try {
                if (!this.f439a.isEmpty()) {
                    this.f447j.setEnabled(true);
                    if (J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z4 = this.f442d.size() + (this.h != null ? 1 : 0) > 0 && N(this.f461y);
                if (J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z4);
                }
                this.f447j.setEnabled(z4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i5, int i6) {
        ViewGroup viewGroup;
        n nVar;
        HashSet hashSet = new HashSet();
        while (i5 < i6) {
            ArrayList arrayList2 = ((a) arrayList.get(i5)).f302a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                z zVar = ((c1) obj).f359b;
                if (zVar != null && (viewGroup = zVar.L) != null) {
                    g4.i.d(H(), "fragmentManager.specialEffectsControllerFactory");
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof n) {
                        nVar = (n) tag;
                    } else {
                        nVar = new n(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, nVar);
                    }
                    hashSet.add(nVar);
                }
            }
            i5++;
        }
        return hashSet;
    }

    public final b1 g(z zVar) {
        String str = zVar.f494k;
        r1.h hVar = this.f441c;
        b1 b1Var = (b1) ((HashMap) hVar.h).get(str);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(this.f452o, hVar, zVar);
        b1Var2.l(this.w.f368n.getClassLoader());
        b1Var2.f343e = this.f459v;
        return b1Var2;
    }

    public final void h(z zVar) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + zVar);
        }
        if (zVar.H) {
            return;
        }
        zVar.H = true;
        if (zVar.f500q) {
            if (J(2)) {
                Log.v("FragmentManager", "remove from detach: " + zVar);
            }
            r1.h hVar = this.f441c;
            synchronized (((ArrayList) hVar.f3161g)) {
                ((ArrayList) hVar.f3161g).remove(zVar);
            }
            zVar.f500q = false;
            if (K(zVar)) {
                this.G = true;
            }
            a0(zVar);
        }
    }

    public final void i(boolean z4) {
        if (z4 && this.w != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (z zVar : this.f441c.m()) {
            if (zVar != null) {
                zVar.K = true;
                if (z4) {
                    zVar.B.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f459v >= 1) {
            for (z zVar : this.f441c.m()) {
                if (zVar != null) {
                    if (!zVar.G ? zVar.B.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f459v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (z zVar : this.f441c.m()) {
            if (zVar != null && M(zVar)) {
                if (!zVar.G ? zVar.B.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(zVar);
                    z4 = true;
                }
            }
        }
        if (this.f443e != null) {
            for (int i5 = 0; i5 < this.f443e.size(); i5++) {
                z zVar2 = (z) this.f443e.get(i5);
                if (arrayList == null || !arrayList.contains(zVar2)) {
                    zVar2.getClass();
                }
            }
        }
        this.f443e = arrayList;
        return z4;
    }

    public final void l() {
        boolean z4 = true;
        this.J = true;
        A(true);
        x();
        d0 d0Var = this.w;
        r1.h hVar = this.f441c;
        if (d0Var != null) {
            z4 = ((y0) hVar.f3163j).h;
        } else {
            g.k kVar = d0Var.f368n;
            if (kVar != null) {
                z4 = true ^ kVar.isChangingConfigurations();
            }
        }
        if (z4) {
            Iterator it = this.f449l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((d) it.next()).f366g;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((y0) hVar.f3163j).d((String) obj, false);
                }
            }
        }
        u(-1);
        d0 d0Var2 = this.w;
        if (d0Var2 != null) {
            d0Var2.f371q.removeOnTrimMemoryListener(this.f455r);
        }
        d0 d0Var3 = this.w;
        if (d0Var3 != null) {
            d0Var3.f371q.removeOnConfigurationChangedListener(this.f454q);
        }
        d0 d0Var4 = this.w;
        if (d0Var4 != null) {
            d0Var4.f371q.removeOnMultiWindowModeChangedListener(this.f456s);
        }
        d0 d0Var5 = this.w;
        if (d0Var5 != null) {
            d0Var5.f371q.removeOnPictureInPictureModeChangedListener(this.f457t);
        }
        d0 d0Var6 = this.w;
        if (d0Var6 != null && this.f461y == null) {
            d0Var6.f371q.removeMenuProvider(this.f458u);
        }
        this.w = null;
        this.f460x = null;
        this.f461y = null;
        if (this.f445g != null) {
            this.f447j.remove();
            this.f445g = null;
        }
        d.g gVar = this.C;
        if (gVar != null) {
            gVar.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z4) {
        if (z4 && this.w != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (z zVar : this.f441c.m()) {
            if (zVar != null) {
                zVar.K = true;
                if (z4) {
                    zVar.B.m(true);
                }
            }
        }
    }

    public final void n(boolean z4) {
        if (z4 && this.w != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (z zVar : this.f441c.m()) {
            if (zVar != null && z4) {
                zVar.B.n(true);
            }
        }
    }

    public final void o() {
        ArrayList k5 = this.f441c.k();
        int size = k5.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = k5.get(i5);
            i5++;
            z zVar = (z) obj;
            if (zVar != null) {
                zVar.h();
                zVar.B.o();
            }
        }
    }

    public final boolean p() {
        if (this.f459v >= 1) {
            for (z zVar : this.f441c.m()) {
                if (zVar != null) {
                    if (!zVar.G ? zVar.B.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f459v < 1) {
            return;
        }
        for (z zVar : this.f441c.m()) {
            if (zVar != null && !zVar.G) {
                zVar.B.q();
            }
        }
    }

    public final void r(z zVar) {
        if (zVar != null) {
            if (zVar.equals(this.f441c.e(zVar.f494k))) {
                zVar.f508z.getClass();
                boolean N = N(zVar);
                Boolean bool = zVar.f499p;
                if (bool == null || bool.booleanValue() != N) {
                    zVar.f499p = Boolean.valueOf(N);
                    v0 v0Var = zVar.B;
                    v0Var.e0();
                    v0Var.r(v0Var.f462z);
                }
            }
        }
    }

    public final void s(boolean z4) {
        if (z4 && this.w != null) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (z zVar : this.f441c.m()) {
            if (zVar != null && z4) {
                zVar.B.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f459v < 1) {
            return false;
        }
        boolean z4 = false;
        for (z zVar : this.f441c.m()) {
            if (zVar != null && M(zVar)) {
                if (!zVar.G ? zVar.B.t() : false) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        z zVar = this.f461y;
        if (zVar != null) {
            sb.append(zVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f461y)));
            sb.append("}");
        } else {
            d0 d0Var = this.w;
            if (d0Var != null) {
                sb.append(d0Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i5) {
        try {
            this.f440b = true;
            for (b1 b1Var : ((HashMap) this.f441c.h).values()) {
                if (b1Var != null) {
                    b1Var.f343e = i5;
                }
            }
            O(i5, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((n) it.next()).d();
            }
            this.f440b = false;
            A(true);
        } catch (Throwable th) {
            this.f440b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.K) {
            this.K = false;
            c0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String j2 = androidx.emoji2.text.u.j(str, "    ");
        r1.h hVar = this.f441c;
        ArrayList arrayList = (ArrayList) hVar.f3161g;
        String j5 = androidx.emoji2.text.u.j(str, "    ");
        HashMap hashMap = (HashMap) hVar.h;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (b1 b1Var : hashMap.values()) {
                printWriter.print(str);
                if (b1Var != null) {
                    z zVar = b1Var.f341c;
                    printWriter.println(zVar);
                    zVar.getClass();
                    printWriter.print(j5);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(zVar.D));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(zVar.E));
                    printWriter.print(" mTag=");
                    printWriter.println(zVar.F);
                    printWriter.print(j5);
                    printWriter.print("mState=");
                    printWriter.print(zVar.f491g);
                    printWriter.print(" mWho=");
                    printWriter.print(zVar.f494k);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(zVar.f507y);
                    printWriter.print(j5);
                    printWriter.print("mAdded=");
                    printWriter.print(zVar.f500q);
                    printWriter.print(" mRemoving=");
                    printWriter.print(zVar.f501r);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(zVar.f503t);
                    printWriter.print(" mInLayout=");
                    printWriter.println(zVar.f504u);
                    printWriter.print(j5);
                    printWriter.print("mHidden=");
                    printWriter.print(zVar.G);
                    printWriter.print(" mDetached=");
                    printWriter.print(zVar.H);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(zVar.J);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(j5);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(zVar.I);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(zVar.N);
                    if (zVar.f508z != null) {
                        printWriter.print(j5);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(zVar.f508z);
                    }
                    if (zVar.A != null) {
                        printWriter.print(j5);
                        printWriter.print("mHost=");
                        printWriter.println(zVar.A);
                    }
                    if (zVar.C != null) {
                        printWriter.print(j5);
                        printWriter.print("mParentFragment=");
                        printWriter.println(zVar.C);
                    }
                    if (zVar.f495l != null) {
                        printWriter.print(j5);
                        printWriter.print("mArguments=");
                        printWriter.println(zVar.f495l);
                    }
                    if (zVar.h != null) {
                        printWriter.print(j5);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(zVar.h);
                    }
                    if (zVar.f492i != null) {
                        printWriter.print(j5);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(zVar.f492i);
                    }
                    if (zVar.f493j != null) {
                        printWriter.print(j5);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(zVar.f493j);
                    }
                    Object obj = zVar.f496m;
                    if (obj == null) {
                        u0 u0Var = zVar.f508z;
                        obj = (u0Var == null || (str2 = zVar.f497n) == null) ? null : u0Var.f441c.e(str2);
                    }
                    if (obj != null) {
                        printWriter.print(j5);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(zVar.f498o);
                    }
                    printWriter.print(j5);
                    printWriter.print("mPopDirection=");
                    w wVar = zVar.O;
                    printWriter.println(wVar == null ? false : wVar.f468a);
                    w wVar2 = zVar.O;
                    if ((wVar2 == null ? 0 : wVar2.f469b) != 0) {
                        printWriter.print(j5);
                        printWriter.print("getEnterAnim=");
                        w wVar3 = zVar.O;
                        printWriter.println(wVar3 == null ? 0 : wVar3.f469b);
                    }
                    w wVar4 = zVar.O;
                    if ((wVar4 == null ? 0 : wVar4.f470c) != 0) {
                        printWriter.print(j5);
                        printWriter.print("getExitAnim=");
                        w wVar5 = zVar.O;
                        printWriter.println(wVar5 == null ? 0 : wVar5.f470c);
                    }
                    w wVar6 = zVar.O;
                    if ((wVar6 == null ? 0 : wVar6.f471d) != 0) {
                        printWriter.print(j5);
                        printWriter.print("getPopEnterAnim=");
                        w wVar7 = zVar.O;
                        printWriter.println(wVar7 == null ? 0 : wVar7.f471d);
                    }
                    w wVar8 = zVar.O;
                    if ((wVar8 == null ? 0 : wVar8.f472e) != 0) {
                        printWriter.print(j5);
                        printWriter.print("getPopExitAnim=");
                        w wVar9 = zVar.O;
                        printWriter.println(wVar9 != null ? wVar9.f472e : 0);
                    }
                    if (zVar.L != null) {
                        printWriter.print(j5);
                        printWriter.print("mContainer=");
                        printWriter.println(zVar.L);
                    }
                    d0 d0Var = zVar.A;
                    if ((d0Var != null ? d0Var.f368n : null) != null) {
                        r0.a.a(zVar).b(j5, printWriter);
                    }
                    printWriter.print(j5);
                    printWriter.println("Child " + zVar.B + ":");
                    zVar.B.w(androidx.emoji2.text.u.j(j5, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i5 = 0; i5 < size2; i5++) {
                z zVar2 = (z) arrayList.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(zVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f443e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i6 = 0; i6 < size; i6++) {
                z zVar3 = (z) this.f443e.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(zVar3.toString());
            }
        }
        int size3 = this.f442d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i7 = 0; i7 < size3; i7++) {
                a aVar = (a) this.f442d.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(j2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f448k.get());
        synchronized (this.f439a) {
            try {
                int size4 = this.f439a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i8 = 0; i8 < size4; i8++) {
                        Object obj2 = (r0) this.f439a.get(i8);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i8);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f460x);
        if (this.f461y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f461y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f459v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((n) it.next()).d();
        }
    }

    public final void y(r0 r0Var, boolean z4) {
        if (!z4) {
            if (this.w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.H || this.I) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f439a) {
            try {
                if (this.w == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f439a.add(r0Var);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z4) {
        if (this.f440b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.w.f369o.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4 && (this.H || this.I)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
