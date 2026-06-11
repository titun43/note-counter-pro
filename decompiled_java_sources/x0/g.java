package x0;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import com.google.android.gms.ads.MobileAds;
import g4.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f3702a;

    public g(TopicsManager topicsManager) {
        i.e(topicsManager, "mTopicsManager");
        this.f3702a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(g gVar, a aVar, w3.c cVar) {
        f fVar;
        int i5;
        List topics;
        Iterator it;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i6 = fVar.f3701j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fVar.f3701j = i6 - Integer.MIN_VALUE;
                Object obj = fVar.h;
                x3.a aVar2 = x3.a.f3712g;
                i5 = fVar.f3701j;
                if (i5 != 0) {
                    b3.g.x(obj);
                    GetTopicsRequest a5 = gVar.a(aVar);
                    fVar.f3699g = gVar;
                    fVar.f3701j = 1;
                    o4.f fVar2 = new o4.f(1, a.a.o(fVar));
                    fVar2.r();
                    gVar.f3702a.getTopics(a5, new l.a(1), new b0.c(fVar2));
                    obj = fVar2.q();
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = fVar.f3699g;
                    b3.g.x(obj);
                }
                GetTopicsResponse j2 = com.google.android.gms.internal.ads.a.j(obj);
                gVar.getClass();
                i.e(j2, "response");
                ArrayList arrayList = new ArrayList();
                topics = j2.getTopics();
                it = topics.iterator();
                while (it.hasNext()) {
                    Topic k5 = com.google.android.gms.internal.ads.a.k(it.next());
                    taxonomyVersion = k5.getTaxonomyVersion();
                    modelVersion = k5.getModelVersion();
                    topicId = k5.getTopicId();
                    arrayList.add(new c(taxonomyVersion, modelVersion, topicId));
                }
                return new b(arrayList);
            }
        }
        fVar = new f(gVar, cVar);
        Object obj2 = fVar.h;
        x3.a aVar22 = x3.a.f3712g;
        i5 = fVar.f3701j;
        if (i5 != 0) {
        }
        GetTopicsResponse j22 = com.google.android.gms.internal.ads.a.j(obj2);
        gVar.getClass();
        i.e(j22, "response");
        ArrayList arrayList2 = new ArrayList();
        topics = j22.getTopics();
        it = topics.iterator();
        while (it.hasNext()) {
        }
        return new b(arrayList2);
    }

    public GetTopicsRequest a(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        i.e(aVar, "request");
        adsSdkName = com.google.android.gms.internal.ads.a.f().setAdsSdkName(MobileAds.ERROR_DOMAIN);
        build = adsSdkName.build();
        i.d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public Object b(a aVar, w3.c cVar) {
        return c(this, aVar, cVar);
    }
}
