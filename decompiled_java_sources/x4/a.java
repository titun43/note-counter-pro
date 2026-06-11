package x4;

import android.webkit.JavascriptInterface;
import org.apache.cordova.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final i f3713a;

    public a(i iVar) {
        this.f3713a = iVar;
    }

    @JavascriptInterface
    public String exec(int i5, String str, String str2, String str3, String str4) {
        return this.f3713a.a(i5, str, str2, str3, str4);
    }

    @JavascriptInterface
    public String retrieveJsMessages(int i5, boolean z4) {
        i iVar = this.f3713a;
        if (iVar.b(i5)) {
            return iVar.f2927b.d(z4);
        }
        return null;
    }

    @JavascriptInterface
    public void setNativeToJsBridgeMode(int i5, int i6) {
        i iVar = this.f3713a;
        if (iVar.b(i5)) {
            iVar.f2927b.f(i6);
        }
    }
}
