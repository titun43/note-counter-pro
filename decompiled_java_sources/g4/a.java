package g4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class a implements Iterator, h4.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1688g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1689i;

    public /* synthetic */ a(Object obj, int i5) {
        this.f1688g = i5;
        this.f1689i = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1688g) {
            case 0:
                if (this.h < ((Object[]) this.f1689i).length) {
                }
                break;
            default:
                if (this.h < ((u3.c) this.f1689i).a()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1688g) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f1689i;
                    int i5 = this.h;
                    this.h = i5 + 1;
                    return objArr[i5];
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.h--;
                    throw new NoSuchElementException(e4.getMessage());
                }
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                u3.c cVar = (u3.c) this.f1689i;
                int i6 = this.h;
                this.h = i6 + 1;
                return cVar.get(i6);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1688g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
