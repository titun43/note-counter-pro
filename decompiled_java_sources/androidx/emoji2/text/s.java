package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f276a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final x f277b;

    /* renamed from: c, reason: collision with root package name */
    public x f278c;

    /* renamed from: d, reason: collision with root package name */
    public x f279d;

    /* renamed from: e, reason: collision with root package name */
    public int f280e;

    /* renamed from: f, reason: collision with root package name */
    public int f281f;

    public s(x xVar) {
        this.f277b = xVar;
        this.f278c = xVar;
    }

    public final void a() {
        this.f276a = 1;
        this.f278c = this.f277b;
        this.f281f = 0;
    }

    public final boolean b() {
        m0.a b2 = this.f278c.f298b.b();
        int a5 = b2.a(6);
        return !(a5 == 0 || ((ByteBuffer) b2.f1377d).get(a5 + b2.f1374a) == 0) || this.f280e == 65039;
    }
}
