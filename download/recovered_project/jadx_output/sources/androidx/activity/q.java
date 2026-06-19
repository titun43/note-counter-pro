package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f60g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f62j;

    public /* synthetic */ q(Object obj, int i5, int i6, Object obj2) {
        this.f60g = i6;
        this.h = obj;
        this.f61i = i5;
        this.f62j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60g) {
            case 0:
                r rVar = (r) this.h;
                Object obj = ((k1.j) this.f62j).h;
                String str = (String) rVar.f1169a.get(Integer.valueOf(this.f61i));
                if (str != null) {
                    d.e eVar = (d.e) rVar.f1173e.get(str);
                    if ((eVar != null ? eVar.f1161a : null) != null) {
                        d.b bVar = eVar.f1161a;
                        g4.i.c(bVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (rVar.f1172d.remove(str)) {
                            bVar.c(obj);
                            break;
                        }
                    } else {
                        rVar.f1175g.remove(str);
                        rVar.f1174f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                ((r) this.h).a(this.f61i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f62j));
                break;
            default:
                ((y0.a) this.h).f3753b.h(this.f61i, this.f62j);
                break;
        }
    }
}
