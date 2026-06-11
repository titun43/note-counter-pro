package b1;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public final int f704g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final String f705i;

    /* renamed from: j, reason: collision with root package name */
    public final String f706j;

    public c(int i5, int i6, String str, String str2) {
        this.f704g = i5;
        this.h = i6;
        this.f705i = str;
        this.f706j = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i5 = this.f704g - cVar.f704g;
        return i5 == 0 ? this.h - cVar.h : i5;
    }
}
