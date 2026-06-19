package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import u2.a;
import z2.b;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new k0(12);

    /* renamed from: g, reason: collision with root package name */
    public final int f910g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final String f911i;

    /* renamed from: j, reason: collision with root package name */
    public final String f912j;

    /* renamed from: k, reason: collision with root package name */
    public final String f913k;

    /* renamed from: l, reason: collision with root package name */
    public final Uri f914l;

    /* renamed from: m, reason: collision with root package name */
    public String f915m;

    /* renamed from: n, reason: collision with root package name */
    public final long f916n;

    /* renamed from: o, reason: collision with root package name */
    public final String f917o;

    /* renamed from: p, reason: collision with root package name */
    public final List f918p;

    /* renamed from: q, reason: collision with root package name */
    public final String f919q;

    /* renamed from: r, reason: collision with root package name */
    public final String f920r;

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f921s = new HashSet();

    public GoogleSignInAccount(int i5, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, ArrayList arrayList, String str7, String str8) {
        this.f910g = i5;
        this.h = str;
        this.f911i = str2;
        this.f912j = str3;
        this.f913k = str4;
        this.f914l = uri;
        this.f915m = str5;
        this.f916n = j2;
        this.f917o = str6;
        this.f918p = arrayList;
        this.f919q = str7;
        this.f920r = str8;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            hashSet.add(new Scope(1, jSONArray.getString(i5)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        b0.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f915m = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f917o.equals(this.f917o)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f918p);
        hashSet.addAll(googleSignInAccount.f921s);
        HashSet hashSet2 = new HashSet(this.f918p);
        hashSet2.addAll(this.f921s);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.f917o.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f918p);
        hashSet.addAll(this.f921s);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        b.N(parcel, 1, 4);
        parcel.writeInt(this.f910g);
        b.I(parcel, 2, this.h);
        b.I(parcel, 3, this.f911i);
        b.I(parcel, 4, this.f912j);
        b.I(parcel, 5, this.f913k);
        b.H(parcel, 6, this.f914l, i5);
        b.I(parcel, 7, this.f915m);
        b.N(parcel, 8, 8);
        parcel.writeLong(this.f916n);
        b.I(parcel, 9, this.f917o);
        b.M(parcel, 10, this.f918p);
        b.I(parcel, 11, this.f919q);
        b.I(parcel, 12, this.f920r);
        b.P(parcel, O);
    }
}
