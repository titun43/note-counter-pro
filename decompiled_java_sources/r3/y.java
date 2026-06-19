package r3;

import android.net.Uri;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f3206a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3207b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f3208c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3209d;

    /* renamed from: e, reason: collision with root package name */
    public final a.a f3210e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f3211f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3212g;

    public y(String str, String str2, Uri uri, long j2, a.a aVar, Long l5, long j5) {
        g4.i.e(uri, "uri");
        this.f3206a = str;
        this.f3207b = str2;
        this.f3208c = uri;
        this.f3209d = j2;
        this.f3210e = aVar;
        this.f3211f = l5;
        this.f3212g = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return g4.i.a(this.f3206a, yVar.f3206a) && g4.i.a(this.f3207b, yVar.f3207b) && g4.i.a(this.f3208c, yVar.f3208c) && this.f3209d == yVar.f3209d && g4.i.a(this.f3210e, yVar.f3210e) && g4.i.a(this.f3211f, yVar.f3211f) && this.f3212g == yVar.f3212g;
    }

    public final int hashCode() {
        int hashCode = (this.f3210e.hashCode() + ((Long.hashCode(this.f3209d) + ((this.f3208c.hashCode() + ((this.f3207b.hashCode() + (this.f3206a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        Long l5 = this.f3211f;
        return Long.hashCode(this.f3212g) + ((hashCode + (l5 == null ? 0 : l5.hashCode())) * 31);
    }

    public final String toString() {
        return "IONFILEMetadataResult(fullPath=" + this.f3206a + ", name=" + this.f3207b + ", uri=" + this.f3208c + ", size=" + this.f3209d + ", type=" + this.f3210e + ", createdTimestamp=" + this.f3211f + ", lastModifiedTimestamp=" + this.f3212g + ")";
    }
}
