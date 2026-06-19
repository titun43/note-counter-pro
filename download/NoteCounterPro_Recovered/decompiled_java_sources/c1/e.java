package c1;

import android.os.Bundle;
import androidx.activity.h;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import androidx.savedstate.Recreator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f783a;

    /* renamed from: b, reason: collision with root package name */
    public final d f784b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f785c;

    public e(f fVar) {
        this.f783a = fVar;
    }

    public final void a() {
        f fVar = this.f783a;
        o lifecycle = fVar.getLifecycle();
        if (((v) lifecycle).f585c != n.h) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(fVar));
        d dVar = this.f784b;
        dVar.getClass();
        if (dVar.f778b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new h(dVar, 2));
        dVar.f778b = true;
        this.f785c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f785c) {
            a();
        }
        v vVar = (v) this.f783a.getLifecycle();
        if (vVar.f585c.compareTo(n.f560j) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + vVar.f585c).toString());
        }
        d dVar = this.f784b;
        if (!dVar.f778b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f780d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f779c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f780d = true;
    }

    public final void c(Bundle bundle) {
        d dVar = this.f784b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = dVar.f779c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.f fVar = dVar.f777a;
        fVar.getClass();
        m.d dVar2 = new m.d(fVar);
        fVar.f2550i.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
