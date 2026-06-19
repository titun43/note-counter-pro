package n3;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements k3.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f2690f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final k3.c f2691g;
    public static final k3.c h;

    /* renamed from: i, reason: collision with root package name */
    public static final m3.a f2692i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f2693a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2694b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2695c;

    /* renamed from: d, reason: collision with root package name */
    public final k3.d f2696d;

    /* renamed from: e, reason: collision with root package name */
    public final g f2697e = new g(this);

    static {
        a aVar = new a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.class, aVar);
        f2691g = new k3.c("key", Collections.unmodifiableMap(new HashMap(hashMap)));
        a aVar2 = new a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d.class, aVar2);
        h = new k3.c("value", Collections.unmodifiableMap(new HashMap(hashMap2)));
        f2692i = new m3.a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, k3.d dVar) {
        this.f2693a = byteArrayOutputStream;
        this.f2694b = hashMap;
        this.f2695c = hashMap2;
        this.f2696d = dVar;
    }

    public static int f(k3.c cVar) {
        d dVar = (d) ((Annotation) cVar.f2440b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f2687a;
        }
        throw new k3.b("Field has no @Protobuf config");
    }

    @Override // k3.e
    public final k3.e a(k3.c cVar, long j2) {
        if (j2 == 0) {
            return this;
        }
        d dVar = (d) ((Annotation) cVar.f2440b.get(d.class));
        if (dVar == null) {
            throw new k3.b("Field has no @Protobuf config");
        }
        g(((a) dVar).f2687a << 3);
        h(j2);
        return this;
    }

    public final void b(k3.c cVar, int i5, boolean z4) {
        if (z4 && i5 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f2440b.get(d.class));
        if (dVar == null) {
            throw new k3.b("Field has no @Protobuf config");
        }
        g(((a) dVar).f2687a << 3);
        g(i5);
    }

    public final void c(k3.c cVar, Object obj, boolean z4) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z4 && charSequence.length() == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f2690f);
            g(bytes.length);
            this.f2693a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(f2692i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z4 && doubleValue == 0.0d) {
                return;
            }
            g((f(cVar) << 3) | 1);
            this.f2693a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z4 && floatValue == 0.0f) {
                return;
            }
            g((f(cVar) << 3) | 5);
            this.f2693a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z4 && longValue == 0) {
                return;
            }
            d dVar = (d) ((Annotation) cVar.f2440b.get(d.class));
            if (dVar == null) {
                throw new k3.b("Field has no @Protobuf config");
            }
            g(((a) dVar).f2687a << 3);
            h(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z4 && bArr.length == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            g(bArr.length);
            this.f2693a.write(bArr);
            return;
        }
        k3.d dVar2 = (k3.d) this.f2694b.get(obj.getClass());
        if (dVar2 != null) {
            e(dVar2, cVar, obj, z4);
            return;
        }
        k3.f fVar = (k3.f) this.f2695c.get(obj.getClass());
        if (fVar != null) {
            g gVar = this.f2697e;
            gVar.f2699a = false;
            gVar.f2701c = cVar;
            gVar.f2700b = z4;
            fVar.a(obj, gVar);
            return;
        }
        if (obj instanceof i2.c) {
            b(cVar, ((i2.c) obj).f1845g, true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            e(this.f2696d, cVar, obj, z4);
        }
    }

    @Override // k3.e
    public final k3.e d(k3.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final void e(k3.d dVar, k3.c cVar, Object obj, boolean z4) {
        b bVar = new b();
        bVar.f2688g = 0L;
        try {
            OutputStream outputStream = this.f2693a;
            this.f2693a = bVar;
            try {
                dVar.a(obj, this);
                this.f2693a = outputStream;
                long j2 = bVar.f2688g;
                bVar.close();
                if (z4 && j2 == 0) {
                    return;
                }
                g((f(cVar) << 3) | 2);
                h(j2);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f2693a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i5) {
        while ((i5 & (-128)) != 0) {
            this.f2693a.write((i5 & 127) | 128);
            i5 >>>= 7;
        }
        this.f2693a.write(i5 & 127);
    }

    public final void h(long j2) {
        while (((-128) & j2) != 0) {
            this.f2693a.write((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        this.f2693a.write(((int) j2) & 127);
    }
}
