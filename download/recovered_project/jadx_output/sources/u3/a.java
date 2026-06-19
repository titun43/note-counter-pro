package u3;

import androidx.emoji2.text.u;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a extends g4.a implements ListIterator {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f3539j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i5) {
        super(cVar, 1);
        this.f3539j = cVar;
        int a5 = cVar.a();
        if (i5 < 0 || i5 > a5) {
            throw new IndexOutOfBoundsException(u.g(i5, a5, "index: ", ", size: "));
        }
        this.h = i5;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.h > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.h;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.h - 1;
        this.h = i5;
        return this.f3539j.get(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.h - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
