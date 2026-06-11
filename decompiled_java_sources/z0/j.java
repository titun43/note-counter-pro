package z0;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class j implements d1.d, Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static final TreeMap f3930o = new TreeMap();

    /* renamed from: g, reason: collision with root package name */
    public volatile String f3931g;
    public final long[] h;

    /* renamed from: i, reason: collision with root package name */
    public final double[] f3932i;

    /* renamed from: j, reason: collision with root package name */
    public final String[] f3933j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[][] f3934k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f3935l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3936m;

    /* renamed from: n, reason: collision with root package name */
    public int f3937n;

    public j(int i5) {
        this.f3936m = i5;
        int i6 = i5 + 1;
        this.f3935l = new int[i6];
        this.h = new long[i6];
        this.f3932i = new double[i6];
        this.f3933j = new String[i6];
        this.f3934k = new byte[i6][];
    }

    public static j d(int i5, String str) {
        TreeMap treeMap = f3930o;
        synchronized (treeMap) {
            try {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i5));
                if (ceilingEntry == null) {
                    j jVar = new j(i5);
                    jVar.f3931g = str;
                    jVar.f3937n = i5;
                    return jVar;
                }
                treeMap.remove(ceilingEntry.getKey());
                j jVar2 = (j) ceilingEntry.getValue();
                jVar2.f3931g = str;
                jVar2.f3937n = i5;
                return jVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d1.d
    public final String a() {
        return this.f3931g;
    }

    @Override // d1.d
    public final void b(e1.b bVar) {
        for (int i5 = 1; i5 <= this.f3937n; i5++) {
            int i6 = this.f3935l[i5];
            if (i6 == 1) {
                bVar.e(i5);
            } else if (i6 == 2) {
                bVar.d(i5, this.h[i5]);
            } else if (i6 == 3) {
                ((SQLiteProgram) bVar.h).bindDouble(i5, this.f3932i[i5]);
            } else if (i6 == 4) {
                bVar.f(i5, this.f3933j[i5]);
            } else if (i6 == 5) {
                bVar.b(i5, this.f3934k[i5]);
            }
        }
    }

    public final void e(int i5, long j2) {
        this.f3935l[i5] = 2;
        this.h[i5] = j2;
    }

    public final void f(int i5) {
        this.f3935l[i5] = 1;
    }

    public final void g(int i5, String str) {
        this.f3935l[i5] = 4;
        this.f3933j[i5] = str;
    }

    public final void h() {
        TreeMap treeMap = f3930o;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f3936m), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i5 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i5;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
