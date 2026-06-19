package a2;

import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.consent.AdConsentExecutor;
import com.lokhnathtechnical.notecounterpro.plugins.PremiumPlugin;
import i3.j;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements i3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginCall f13a;

    public /* synthetic */ d(PluginCall pluginCall) {
        this.f13a = pluginCall;
    }

    public void a(y1.e eVar, List list) {
        PremiumPlugin.lambda$restorePurchases$2(this.f13a, eVar, list);
    }

    @Override // i3.e
    public void onConsentInfoUpdateFailure(j jVar) {
        AdConsentExecutor.lambda$requestConsentInfo$1(this.f13a, jVar);
    }
}
