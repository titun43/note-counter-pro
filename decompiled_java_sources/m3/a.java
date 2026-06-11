package m3;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2586a;

    @Override // k3.a
    public final void a(Object obj, Object obj2) {
        switch (this.f2586a) {
            case 0:
                throw new k3.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                k3.e eVar = (k3.e) obj2;
                eVar.d(n3.e.f2691g, entry.getKey());
                eVar.d(n3.e.h, entry.getValue());
                return;
            default:
                throw new k3.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
