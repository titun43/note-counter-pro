package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f244d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f245a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.h f246b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f247c = 0;

    public a0(r1.h hVar, int i5) {
        this.f246b = hVar;
        this.f245a = i5;
    }

    public final int a(int i5) {
        m0.a b2 = b();
        int a5 = b2.a(16);
        if (a5 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b2.f1377d;
        int i6 = a5 + b2.f1374a;
        return byteBuffer.getInt((i5 * 4) + byteBuffer.getInt(i6) + i6 + 4);
    }

    public final m0.a b() {
        ThreadLocal threadLocal = f244d;
        m0.a aVar = (m0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new m0.a();
            threadLocal.set(aVar);
        }
        m0.b bVar = (m0.b) this.f246b.f3161g;
        int a5 = bVar.a(6);
        if (a5 != 0) {
            int i5 = a5 + bVar.f1374a;
            int i6 = (this.f245a * 4) + ((ByteBuffer) bVar.f1377d).getInt(i5) + i5 + 4;
            int i7 = ((ByteBuffer) bVar.f1377d).getInt(i6) + i6;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f1377d;
            aVar.f1377d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f1374a = i7;
                int i8 = i7 - byteBuffer.getInt(i7);
                aVar.f1375b = i8;
                aVar.f1376c = ((ByteBuffer) aVar.f1377d).getShort(i8);
                return aVar;
            }
            aVar.f1374a = 0;
            aVar.f1375b = 0;
            aVar.f1376c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i5;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        m0.a b2 = b();
        int a5 = b2.a(4);
        sb.append(Integer.toHexString(a5 != 0 ? ((ByteBuffer) b2.f1377d).getInt(a5 + b2.f1374a) : 0));
        sb.append(", codepoints:");
        m0.a b5 = b();
        int a6 = b5.a(16);
        if (a6 != 0) {
            int i6 = a6 + b5.f1374a;
            i5 = ((ByteBuffer) b5.f1377d).getInt(((ByteBuffer) b5.f1377d).getInt(i6) + i6);
        } else {
            i5 = 0;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(Integer.toHexString(a(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
