package z3;

import androidx.emoji2.text.u;
import g4.i;
import java.io.Serializable;
import u3.c;

/* loaded from: classes.dex */
public final class b extends c implements a, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final Enum[] f3945g;

    public b(Enum[] enumArr) {
        i.e(enumArr, "entries");
        this.f3945g = enumArr;
    }

    @Override // u3.c
    public final int a() {
        return this.f3945g.length;
    }

    @Override // u3.c, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        Enum[] enumArr = this.f3945g;
        i.e(enumArr, "<this>");
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        Enum[] enumArr = this.f3945g;
        int length = enumArr.length;
        if (i5 < 0 || i5 >= length) {
            throw new IndexOutOfBoundsException(u.g(i5, length, "index: ", ", size: "));
        }
        return enumArr[i5];
    }

    @Override // u3.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f3945g;
        i.e(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r5) {
            return ordinal;
        }
        return -1;
    }

    @Override // u3.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f3945g;
        i.e(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r5) {
            return ordinal;
        }
        return -1;
    }
}
