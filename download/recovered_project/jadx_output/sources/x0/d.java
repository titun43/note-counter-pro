package x0;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import com.google.android.gms.ads.MobileAds;
import g4.i;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TopicsManager topicsManager, int i5) {
        super(topicsManager);
        this.f3698b = i5;
    }

    @Override // x0.g
    public GetTopicsRequest a(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        switch (this.f3698b) {
            case 1:
                i.e(aVar, "request");
                adsSdkName = com.google.android.gms.internal.ads.a.f().setAdsSdkName(MobileAds.ERROR_DOMAIN);
                shouldRecordObservation = adsSdkName.setShouldRecordObservation(aVar.f3693a);
                build = shouldRecordObservation.build();
                i.d(build, "Builder()\n            .s…ion)\n            .build()");
                return build;
            default:
                return super.a(aVar);
        }
    }
}
