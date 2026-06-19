package c1;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f775a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f776b;

    public a(d dVar) {
        this.f775a = 0;
        this.f776b = new LinkedHashSet();
        dVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // c1.c
    public final Bundle a() {
        switch (this.f775a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f776b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((BridgeActivity) this.f776b).getDelegate().getClass();
                return bundle2;
        }
    }

    public a(BridgeActivity bridgeActivity) {
        this.f775a = 1;
        this.f776b = bridgeActivity;
    }
}
