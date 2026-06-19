package c0;

import android.net.Uri;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f766b;

    /* renamed from: c, reason: collision with root package name */
    public final int f767c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f768d;

    /* renamed from: e, reason: collision with root package name */
    public final String f769e;

    /* renamed from: f, reason: collision with root package name */
    public final int f770f;

    public k(Uri uri, int i5, int i6, boolean z4, int i7) {
        uri.getClass();
        this.f765a = uri;
        this.f766b = i5;
        this.f767c = i6;
        this.f768d = z4;
        this.f769e = null;
        this.f770f = i7;
    }

    public k(String str, String str2) {
        this.f765a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f766b = 0;
        this.f767c = 400;
        this.f768d = false;
        this.f769e = str2;
        this.f770f = 0;
    }
}
