package androidx.work;

import androidx.fragment.app.h1;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final c f622i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f624b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f625c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f626d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f627e;

    /* renamed from: a, reason: collision with root package name */
    public int f623a = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f628f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f629g = -1;
    public e h = new e();

    static {
        e eVar = new e();
        c cVar = new c();
        cVar.f623a = 1;
        cVar.f628f = -1L;
        cVar.f629g = -1L;
        new HashSet();
        cVar.f624b = false;
        cVar.f625c = false;
        cVar.f623a = 1;
        cVar.f626d = false;
        cVar.f627e = false;
        cVar.h = eVar;
        cVar.f628f = -1L;
        cVar.f629g = -1L;
        f622i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f624b == cVar.f624b && this.f625c == cVar.f625c && this.f626d == cVar.f626d && this.f627e == cVar.f627e && this.f628f == cVar.f628f && this.f629g == cVar.f629g && this.f623a == cVar.f623a) {
            return this.h.equals(cVar.h);
        }
        return false;
    }

    public final int hashCode() {
        int c5 = ((((((((h1.c(this.f623a) * 31) + (this.f624b ? 1 : 0)) * 31) + (this.f625c ? 1 : 0)) * 31) + (this.f626d ? 1 : 0)) * 31) + (this.f627e ? 1 : 0)) * 31;
        long j2 = this.f628f;
        int i5 = (c5 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j5 = this.f629g;
        return this.h.f632a.hashCode() + ((i5 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
    }
}
