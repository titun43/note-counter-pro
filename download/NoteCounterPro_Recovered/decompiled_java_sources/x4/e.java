package x4;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: classes.dex */
public final class e extends ServiceWorkerClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3722a;

    public e(f fVar) {
        this.f3722a = fVar;
    }

    @Override // android.webkit.ServiceWorkerClient
    public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f3722a.f3724b.n(webResourceRequest.getUrl());
    }
}
