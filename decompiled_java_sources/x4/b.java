package x4;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.cordova.p;

/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f3714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f3715d;

    public b(Uri uri, ValueCallback valueCallback) {
        this.f3714c = uri;
        this.f3715d = valueCallback;
    }

    @Override // org.apache.cordova.p
    public final void onActivityResult(int i5, int i6, Intent intent) {
        Uri[] uriArr;
        if (i6 == -1) {
            ArrayList arrayList = new ArrayList();
            if (intent == null || intent.getData() == null) {
                Uri uri = this.f3714c;
                if (uri != null) {
                    Objects.toString(uri);
                    arrayList.add(uri);
                } else if (intent != null && intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    int itemCount = clipData.getItemCount();
                    for (int i7 = 0; i7 < itemCount; i7++) {
                        Uri uri2 = clipData.getItemAt(i7).getUri();
                        Objects.toString(uri2);
                        if (uri2 != null) {
                            arrayList.add(uri2);
                        }
                    }
                }
            } else {
                Objects.toString(intent.getData());
                arrayList.add(intent.getData());
            }
            if (!arrayList.isEmpty()) {
                arrayList.toString();
                uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                this.f3715d.onReceiveValue(uriArr);
            }
        }
        uriArr = null;
        this.f3715d.onReceiveValue(uriArr);
    }
}
