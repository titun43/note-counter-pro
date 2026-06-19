package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f543f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f544a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f545b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f546c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f547d;

    /* renamed from: e, reason: collision with root package name */
    public final c1.c f548e;

    public j0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f544a = linkedHashMap;
        this.f545b = new LinkedHashMap();
        this.f546c = new LinkedHashMap();
        this.f547d = new LinkedHashMap();
        this.f548e = new androidx.activity.i(this, 1);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(j0 j0Var) {
        Map map;
        LinkedHashMap linkedHashMap = j0Var.f544a;
        LinkedHashMap linkedHashMap2 = j0Var.f545b;
        g4.i.e(linkedHashMap2, "<this>");
        int size = linkedHashMap2.size();
        if (size == 0) {
            map = u3.p.f3548g;
        } else if (size != 1) {
            map = new LinkedHashMap(linkedHashMap2);
        } else {
            g4.i.e(linkedHashMap2, "<this>");
            Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
            map = Collections.singletonMap(entry.getKey(), entry.getValue());
            g4.i.d(map, "with(...)");
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            int i5 = 0;
            if (!it.hasNext()) {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                t3.c[] cVarArr = {new t3.c("keys", arrayList), new t3.c("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i5 < 2) {
                    t3.c cVar = cVarArr[i5];
                    String str2 = (String) cVar.f3394g;
                    Object obj = cVar.h;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        g4.i.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        bundle.putSize(str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        bundle.putSizeF(str2, (SizeF) obj);
                    }
                    i5++;
                }
                return bundle;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            String str3 = (String) entry2.getKey();
            Bundle a5 = ((c1.c) entry2.getValue()).a();
            g4.i.e(str3, "key");
            if (a5 != null) {
                while (i5 < 29) {
                    Class cls = f543f[i5];
                    g4.i.b(cls);
                    if (!cls.isInstance(a5)) {
                        i5++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + a5.getClass() + " into saved state");
            }
            Object obj2 = j0Var.f546c.get(str3);
            a0 a0Var = obj2 instanceof a0 ? (a0) obj2 : null;
            if (a0Var != null) {
                a0Var.e(a5);
            } else {
                linkedHashMap.put(str3, a5);
            }
            r4.q qVar = (r4.q) j0Var.f547d.get(str3);
            if (qVar != null) {
                ((r4.s) qVar).c(a5);
            }
        }
    }

    public j0() {
        this.f544a = new LinkedHashMap();
        this.f545b = new LinkedHashMap();
        this.f546c = new LinkedHashMap();
        this.f547d = new LinkedHashMap();
        this.f548e = new androidx.activity.i(this, 1);
    }
}
