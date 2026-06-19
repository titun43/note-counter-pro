package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.j0;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements c1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52b;

    public /* synthetic */ i(Object obj, int i5) {
        this.f51a = i5;
        this.f52b = obj;
    }

    @Override // c1.c
    public final Bundle a() {
        switch (this.f51a) {
            case 0:
                return s.a((s) this.f52b);
            default:
                return j0.a((j0) this.f52b);
        }
    }
}
