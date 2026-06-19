package org.apache.cordova;

import android.util.Base64;
import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2942g = {"No result", "OK", "Class not found", "Illegal access", "Instantiation error", "Malformed url", "IO error", "Invalid action", "JSON error", "Error"};

    /* renamed from: a, reason: collision with root package name */
    public final int f2943a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2944b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2945c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2946d;

    /* renamed from: e, reason: collision with root package name */
    public String f2947e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2948f;

    public l0(int i5) {
        this(i5, f2942g[h1.c(i5)]);
    }

    public final String a() {
        if (this.f2947e == null) {
            this.f2947e = JSONObject.quote(this.f2946d);
        }
        return this.f2947e;
    }

    public l0(int i5, String str) {
        this.f2945c = false;
        this.f2943a = h1.c(i5);
        this.f2944b = str == null ? 5 : 1;
        this.f2946d = str;
    }

    public l0(JSONArray jSONArray) {
        this.f2945c = false;
        this.f2943a = h1.c(2);
        this.f2944b = 2;
        this.f2947e = jSONArray.toString();
    }

    public l0(int i5, JSONObject jSONObject) {
        this.f2945c = false;
        this.f2943a = h1.c(i5);
        this.f2944b = 2;
        this.f2947e = jSONObject.toString();
    }

    public l0(int i5, int i6) {
        this.f2945c = false;
        this.f2943a = h1.c(i5);
        this.f2944b = 3;
        this.f2947e = androidx.emoji2.text.u.h(i6, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public l0(byte[] bArr) {
        this.f2945c = false;
        this.f2943a = h1.c(2);
        this.f2944b = 6;
        this.f2947e = Base64.encodeToString(bArr, 2);
    }

    public l0(ArrayList arrayList) {
        this.f2945c = false;
        this.f2943a = h1.c(2);
        this.f2944b = 8;
        this.f2948f = arrayList;
    }
}
