package org.apache.cordova;

import android.content.Context;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class AllowListPlugin extends p {
    public static final String PLUGIN_NAME = "CordovaAllowListPlugin";

    /* renamed from: c, reason: collision with root package name */
    public b f2856c;

    /* renamed from: d, reason: collision with root package name */
    public b f2857d;

    /* renamed from: e, reason: collision with root package name */
    public b f2858e;

    public AllowListPlugin() {
    }

    public b getAllowedIntents() {
        return this.f2857d;
    }

    public b getAllowedNavigations() {
        return this.f2856c;
    }

    public b getAllowedRequests() {
        return this.f2858e;
    }

    @Override // org.apache.cordova.p
    public void pluginInitialize() {
        if (this.f2856c == null) {
            this.f2856c = new b();
            this.f2857d = new b();
            this.f2858e = new b();
            new c(this).c(this.webView.getContext());
        }
    }

    public void setAllowedIntents(b bVar) {
        this.f2857d = bVar;
    }

    public void setAllowedNavigations(b bVar) {
        this.f2856c = bVar;
    }

    public void setAllowedRequests(b bVar) {
        this.f2858e = bVar;
    }

    @Override // org.apache.cordova.p
    public Boolean shouldAllowNavigation(String str) {
        if (this.f2856c.b(str)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // org.apache.cordova.p
    public Boolean shouldAllowRequest(String str) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(shouldAllowNavigation(str)) || this.f2858e.b(str)) {
            return bool;
        }
        return null;
    }

    @Override // org.apache.cordova.p
    public Boolean shouldOpenExternalUrl(String str) {
        if (this.f2857d.b(str)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public AllowListPlugin(b bVar, b bVar2, b bVar3) {
        if (bVar3 == null) {
            bVar3 = new b();
            bVar3.a("file:///*");
            bVar3.a("data:*");
        }
        this.f2856c = bVar;
        this.f2857d = bVar2;
        this.f2858e = bVar3;
    }

    public AllowListPlugin(Context context) {
        this(new b(), new b(), null);
        new c(this).c(context);
    }

    public AllowListPlugin(XmlPullParser xmlPullParser) {
        this(new b(), new b(), null);
        new c(this).d(xmlPullParser);
    }
}
