package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i0 implements LayoutInflater.Factory2 {

    /* renamed from: g, reason: collision with root package name */
    public final u0 f394g;

    public i0(u0 u0Var) {
        this.f394g = u0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z4;
        z zVar;
        int i5;
        b1 g5;
        boolean equals = g0.class.getName().equals(str);
        u0 u0Var = this.f394g;
        if (equals) {
            return new g0(context, attributeSet, u0Var);
        }
        z zVar2 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0.a.f2736a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            int i6 = 2;
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z4 = z.class.isAssignableFrom(n0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z4 = false;
                }
                if (z4) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    z C = resourceId != -1 ? u0Var.C(resourceId) : null;
                    if (C == null && string != null) {
                        r1.h hVar = u0Var.f441c;
                        ArrayList arrayList = (ArrayList) hVar.f3161g;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                zVar = zVar2;
                                i5 = i6;
                                Iterator it = ((HashMap) hVar.h).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        C = zVar;
                                        break;
                                    }
                                    b1 b1Var = (b1) it.next();
                                    if (b1Var != null) {
                                        z zVar3 = b1Var.f341c;
                                        if (string.equals(zVar3.F)) {
                                            C = zVar3;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                zVar = zVar2;
                                z zVar4 = (z) arrayList.get(size);
                                i5 = i6;
                                if (zVar4 != null && string.equals(zVar4.F)) {
                                    C = zVar4;
                                    break;
                                }
                                size--;
                                zVar2 = zVar;
                                i6 = i5;
                            }
                        }
                    } else {
                        zVar = null;
                        i5 = 2;
                    }
                    if (C == null && id != -1) {
                        C = u0Var.C(id);
                    }
                    if (C == null) {
                        n0 G = u0Var.G();
                        context.getClassLoader();
                        C = G.a(attributeValue);
                        C.f503t = true;
                        C.D = resourceId != 0 ? resourceId : id;
                        C.E = id;
                        C.F = string;
                        C.f504u = true;
                        C.f508z = u0Var;
                        d0 d0Var = u0Var.w;
                        C.A = d0Var;
                        g.k kVar = d0Var.f368n;
                        C.K = true;
                        if ((d0Var == null ? zVar : d0Var.f367m) != null) {
                            C.K = true;
                        }
                        g5 = u0Var.a(C);
                        if (u0.J(i5)) {
                            Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C.f504u) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        C.f504u = true;
                        C.f508z = u0Var;
                        d0 d0Var2 = u0Var.w;
                        C.A = d0Var2;
                        g.k kVar2 = d0Var2.f368n;
                        C.K = true;
                        if ((d0Var2 == null ? zVar : d0Var2.f367m) != null) {
                            C.K = true;
                        }
                        g5 = u0Var.g(C);
                        if (u0.J(i5)) {
                            Log.v("FragmentManager", "Retained Fragment " + C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    p0.b bVar = p0.c.f2971a;
                    p0.c.b(new p0.d(C, viewGroup, 0));
                    p0.c.a(C).getClass();
                    C.L = viewGroup;
                    g5.j();
                    g5.i();
                    throw new IllegalStateException(s.c.b("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
