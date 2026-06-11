package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f302a;

    /* renamed from: b, reason: collision with root package name */
    public int f303b;

    /* renamed from: c, reason: collision with root package name */
    public int f304c;

    /* renamed from: d, reason: collision with root package name */
    public int f305d;

    /* renamed from: e, reason: collision with root package name */
    public int f306e;

    /* renamed from: f, reason: collision with root package name */
    public int f307f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f308g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public int f309i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f310j;

    /* renamed from: k, reason: collision with root package name */
    public int f311k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f312l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f313m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f314n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f315o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f316p;

    /* renamed from: q, reason: collision with root package name */
    public final u0 f317q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f318r;

    /* renamed from: s, reason: collision with root package name */
    public int f319s;

    public a(u0 u0Var) {
        u0Var.G();
        d0 d0Var = u0Var.w;
        if (d0Var != null) {
            d0Var.f368n.getClassLoader();
        }
        this.f302a = new ArrayList();
        this.f315o = false;
        this.f319s = -1;
        this.f317q = u0Var;
    }

    @Override // androidx.fragment.app.r0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (u0.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f308g) {
            return true;
        }
        this.f317q.f442d.add(this);
        return true;
    }

    public final void b(c1 c1Var) {
        this.f302a.add(c1Var);
        c1Var.f361d = this.f303b;
        c1Var.f362e = this.f304c;
        c1Var.f363f = this.f305d;
        c1Var.f364g = this.f306e;
    }

    public final void c(int i5) {
        if (this.f308g) {
            if (u0.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i5);
            }
            ArrayList arrayList = this.f302a;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                c1 c1Var = (c1) arrayList.get(i6);
                z zVar = c1Var.f359b;
                if (zVar != null) {
                    zVar.f507y += i5;
                    if (u0.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c1Var.f359b + " to " + c1Var.f359b.f507y);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f302a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            c1 c1Var = (c1) arrayList.get(size);
            if (c1Var.f360c) {
                if (c1Var.f358a == 8) {
                    c1Var.f360c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i5 = c1Var.f359b.E;
                    c1Var.f358a = 2;
                    c1Var.f360c = false;
                    for (int i6 = size - 1; i6 >= 0; i6--) {
                        c1 c1Var2 = (c1) arrayList.get(i6);
                        if (c1Var2.f360c && c1Var2.f359b.E == i5) {
                            arrayList.remove(i6);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z4, boolean z5) {
        if (this.f318r) {
            throw new IllegalStateException("commit already called");
        }
        if (u0.J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new e1());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.f318r = true;
        boolean z6 = this.f308g;
        u0 u0Var = this.f317q;
        if (z6) {
            this.f319s = u0Var.f448k.getAndIncrement();
        } else {
            this.f319s = -1;
        }
        if (z5) {
            u0Var.y(this, z4);
        }
        return this.f319s;
    }

    public final void f(int i5, z zVar, String str) {
        String str2 = zVar.R;
        if (str2 != null) {
            p0.c.c(zVar, str2);
        }
        Class<?> cls = zVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = zVar.F;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(zVar);
                sb.append(": was ");
                throw new IllegalStateException(h1.b(sb, zVar.F, " now ", str));
            }
            zVar.F = str;
        }
        if (i5 != 0) {
            if (i5 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + zVar + " with tag " + str + " to container view with no id");
            }
            int i6 = zVar.D;
            if (i6 != 0 && i6 != i5) {
                throw new IllegalStateException("Can't change container ID of fragment " + zVar + ": was " + zVar.D + " now " + i5);
            }
            zVar.D = i5;
            zVar.E = i5;
        }
        b(new c1(1, zVar));
        zVar.f508z = this.f317q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f319s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f318r);
            if (this.f307f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f307f));
            }
            if (this.f303b != 0 || this.f304c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f303b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f304c));
            }
            if (this.f305d != 0 || this.f306e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f305d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f306e));
            }
            if (this.f309i != 0 || this.f310j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f309i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f310j);
            }
            if (this.f311k != 0 || this.f312l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f311k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f312l);
            }
        }
        ArrayList arrayList = this.f302a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            c1 c1Var = (c1) arrayList.get(i5);
            switch (c1Var.f358a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c1Var.f358a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i5);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c1Var.f359b);
            if (z4) {
                if (c1Var.f361d != 0 || c1Var.f362e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c1Var.f361d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c1Var.f362e));
                }
                if (c1Var.f363f != 0 || c1Var.f364g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c1Var.f363f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c1Var.f364g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f319s >= 0) {
            sb.append(" #");
            sb.append(this.f319s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
