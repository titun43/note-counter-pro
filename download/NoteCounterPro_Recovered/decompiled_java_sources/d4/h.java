package d4;

import androidx.fragment.app.x;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator, h4.a {

    /* renamed from: g, reason: collision with root package name */
    public int f1214g;
    public File h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f1215i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f1216j;

    public h(j jVar) {
        this.f1216j = jVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1215i = arrayDeque;
        File file = jVar.f1218a;
        if (file.isDirectory()) {
            arrayDeque.push(a(file));
        } else if (file.isFile()) {
            arrayDeque.push(new f(file));
        } else {
            this.f1214g = 2;
        }
    }

    public final d a(File file) {
        int ordinal = this.f1216j.f1219b.ordinal();
        if (ordinal == 0) {
            return new g(this, file);
        }
        if (ordinal == 1) {
            return new e(this, file);
        }
        throw new x();
    }

    public final boolean b() {
        File file;
        File a5;
        this.f1214g = 3;
        while (true) {
            ArrayDeque arrayDeque = this.f1215i;
            i iVar = (i) arrayDeque.peek();
            if (iVar == null) {
                file = null;
                break;
            }
            a5 = iVar.a();
            if (a5 == null) {
                arrayDeque.pop();
            } else {
                if (a5.equals(iVar.f1217a) || !a5.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                }
                arrayDeque.push(a(a5));
            }
        }
        file = a5;
        if (file != null) {
            this.h = file;
            this.f1214g = 1;
        } else {
            this.f1214g = 2;
        }
        return this.f1214g == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5 = this.f1214g;
        if (i5 == 0) {
            return b();
        }
        if (i5 == 1) {
            return true;
        }
        if (i5 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f1214g;
        if (i5 == 1) {
            this.f1214g = 0;
            return this.h;
        }
        if (i5 == 2 || !b()) {
            throw new NoSuchElementException();
        }
        this.f1214g = 0;
        return this.h;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
