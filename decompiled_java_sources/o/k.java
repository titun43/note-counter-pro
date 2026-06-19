package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class k {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final p.b lock;
    private final p.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public k(int i5) {
        this.maxSize = i5;
        if (i5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new p.c();
        this.lock = new p.b();
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public Object create(Object obj) {
        g4.i.e(obj, "key");
        return null;
    }

    public final int createCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.createCount;
        }
        return i5;
    }

    public void entryRemoved(boolean z4, Object obj, Object obj2, Object obj3) {
        g4.i.e(obj, "key");
        g4.i.e(obj2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.evictionCount;
        }
        return i5;
    }

    public final Object get(Object obj) {
        Object put;
        g4.i.e(obj, "key");
        synchronized (this.lock) {
            p.c cVar = this.map;
            cVar.getClass();
            Object obj2 = cVar.f2969a.get(obj);
            if (obj2 != null) {
                this.hitCount++;
                return obj2;
            }
            this.missCount++;
            Object create = create(obj);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    put = this.map.f2969a.put(obj, create);
                    if (put != null) {
                        this.map.f2969a.put(obj, put);
                    } else {
                        this.size += a(obj, create);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                entryRemoved(false, obj, create, put);
                return put;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.hitCount;
        }
        return i5;
    }

    public final int maxSize() {
        int i5;
        synchronized (this.lock) {
            i5 = this.maxSize;
        }
        return i5;
    }

    public final int missCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.missCount;
        }
        return i5;
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        g4.i.e(obj, "key");
        g4.i.e(obj2, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(obj, obj2);
            put = this.map.f2969a.put(obj, obj2);
            if (put != null) {
                this.size -= a(obj, put);
            }
        }
        if (put != null) {
            entryRemoved(false, obj, put, obj2);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.putCount;
        }
        return i5;
    }

    public final Object remove(Object obj) {
        Object remove;
        g4.i.e(obj, "key");
        synchronized (this.lock) {
            p.c cVar = this.map;
            cVar.getClass();
            remove = cVar.f2969a.remove(obj);
            if (remove != null) {
                this.size -= a(obj, remove);
            }
        }
        if (remove != null) {
            entryRemoved(false, obj, remove, null);
        }
        return remove;
    }

    public void resize(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i5;
        }
        trimToSize(i5);
    }

    public final int size() {
        int i5;
        synchronized (this.lock) {
            i5 = this.size;
        }
        return i5;
    }

    public int sizeOf(Object obj, Object obj2) {
        g4.i.e(obj, "key");
        g4.i.e(obj2, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Set<Map.Entry> entrySet = this.map.f2969a.entrySet();
            g4.i.d(entrySet, "map.entries");
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i5 = this.hitCount;
                int i6 = this.missCount + i5;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i6 != 0 ? (i5 * 100) / i6 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:16:0x0019, B:18:0x001d, B:20:0x0028, B:22:0x003a, B:25:0x0059, B:27:0x005f, B:33:0x0044, B:34:0x004a, B:37:0x0055, B:12:0x008d, B:13:0x0094), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int i5) {
        Object next;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.f2969a.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size <= i5 || this.map.f2969a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.map.f2969a.entrySet();
                    g4.i.d(entrySet, "map.entries");
                    if (entrySet instanceof List) {
                        List list = (List) entrySet;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                            entry = (Map.Entry) next;
                            if (entry != null) {
                                return;
                            }
                            key = entry.getKey();
                            value = entry.getValue();
                            p.c cVar = this.map;
                            cVar.getClass();
                            g4.i.e(key, "key");
                            cVar.f2969a.remove(key);
                            this.size -= a(key, value);
                            this.evictionCount++;
                        }
                        next = null;
                        entry = (Map.Entry) next;
                        if (entry != null) {
                        }
                    } else {
                        Iterator it = entrySet.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        } else {
                            next = null;
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
