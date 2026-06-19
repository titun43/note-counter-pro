package f0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d implements c, e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1341g = 0;
    public ClipData h;

    /* renamed from: i, reason: collision with root package name */
    public int f1342i;

    /* renamed from: j, reason: collision with root package name */
    public int f1343j;

    /* renamed from: k, reason: collision with root package name */
    public Uri f1344k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f1345l;

    public /* synthetic */ d() {
    }

    @Override // f0.e
    public ClipData a() {
        return this.h;
    }

    @Override // f0.c
    public void b(Uri uri) {
        this.f1344k = uri;
    }

    @Override // f0.c
    public f build() {
        return new f(new d(this));
    }

    @Override // f0.c
    public void h(int i5) {
        this.f1343j = i5;
    }

    @Override // f0.e
    public int l() {
        return this.f1343j;
    }

    @Override // f0.e
    public ContentInfo m() {
        return null;
    }

    @Override // f0.e
    public int o() {
        return this.f1342i;
    }

    @Override // f0.c
    public void setExtras(Bundle bundle) {
        this.f1345l = bundle;
    }

    public String toString() {
        String str;
        switch (this.f1341g) {
            case 1:
                Uri uri = this.f1344k;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.h.getDescription());
                sb.append(", source=");
                int i5 = this.f1342i;
                sb.append(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? String.valueOf(i5) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i6 = this.f1343j;
                sb.append((i6 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i6));
                String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                if (uri == null) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                if (this.f1345l != null) {
                    str2 = ", hasExtras";
                }
                return s.c.d(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    public d(d dVar) {
        ClipData clipData = dVar.h;
        clipData.getClass();
        this.h = clipData;
        int i5 = dVar.f1342i;
        if (i5 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i5 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f1342i = i5;
        int i6 = dVar.f1343j;
        if ((i6 & 1) == i6) {
            this.f1343j = i6;
            this.f1344k = dVar.f1344k;
            this.f1345l = dVar.f1345l;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i6) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
