package m3;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k3.f;
import k3.g;

/* loaded from: classes.dex */
public final class e implements k3.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2596a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f2597b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f2598c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f2599d;

    /* renamed from: e, reason: collision with root package name */
    public final k3.d f2600e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2601f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z4) {
        this.f2597b = new JsonWriter(bufferedWriter);
        this.f2598c = hashMap;
        this.f2599d = hashMap2;
        this.f2600e = aVar;
        this.f2601f = z4;
    }

    @Override // k3.e
    public final k3.e a(k3.c cVar, long j2) {
        String str = cVar.f2439a;
        g();
        JsonWriter jsonWriter = this.f2597b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j2);
        return this;
    }

    @Override // k3.g
    public final g b(String str) {
        g();
        this.f2597b.value(str);
        return this;
    }

    @Override // k3.g
    public final g c(boolean z4) {
        g();
        this.f2597b.value(z4);
        return this;
    }

    @Override // k3.e
    public final k3.e d(k3.c cVar, Object obj) {
        f(obj, cVar.f2439a);
        return this;
    }

    public final e e(Object obj) {
        JsonWriter jsonWriter = this.f2597b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        f(entry.getValue(), (String) key);
                    } catch (ClassCastException e4) {
                        throw new k3.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e4);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            k3.d dVar = (k3.d) this.f2598c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f2599d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                g();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.f2600e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            g();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i5 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i5 < length) {
                jsonWriter.value(r6[i5]);
                i5++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i5 < length2) {
                long j2 = jArr[i5];
                g();
                jsonWriter.value(j2);
                i5++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i5 < length3) {
                jsonWriter.value(dArr[i5]);
                i5++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i5 < length4) {
                jsonWriter.value(zArr[i5]);
                i5++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i5 < length5) {
                e(numberArr[i5]);
                i5++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i5 < length6) {
                e(objArr[i5]);
                i5++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e f(Object obj, String str) {
        boolean z4 = this.f2601f;
        JsonWriter jsonWriter = this.f2597b;
        if (z4) {
            if (obj == null) {
                return this;
            }
            g();
            jsonWriter.name(str);
            e(obj);
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        e(obj);
        return this;
    }

    public final void g() {
        if (!this.f2596a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
