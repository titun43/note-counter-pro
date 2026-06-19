package h0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: g, reason: collision with root package name */
    public final InputContentInfo f1709g;

    public f(Object obj) {
        this.f1709g = (InputContentInfo) obj;
    }

    @Override // h0.g
    public final Uri a() {
        return this.f1709g.getContentUri();
    }

    @Override // h0.g
    public final void b() {
        this.f1709g.requestPermission();
    }

    @Override // h0.g
    public final Uri c() {
        return this.f1709g.getLinkUri();
    }

    @Override // h0.g
    public final Object d() {
        return this.f1709g;
    }

    @Override // h0.g
    public final ClipDescription getDescription() {
        return this.f1709g.getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1709g = new InputContentInfo(uri, clipDescription, uri2);
    }
}
