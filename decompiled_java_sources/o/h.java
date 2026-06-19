package o;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2723a;

    /* renamed from: b, reason: collision with root package name */
    public int f2724b;

    /* renamed from: c, reason: collision with root package name */
    public int f2725c;

    /* renamed from: d, reason: collision with root package name */
    public int f2726d;

    public h() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f2726d = highestOneBit - 1;
        this.f2723a = new int[highestOneBit];
    }

    public final void a(int i5) {
        int[] iArr = this.f2723a;
        int i6 = this.f2725c;
        iArr[i6] = i5;
        int i7 = this.f2726d & (i6 + 1);
        this.f2725c = i7;
        int i8 = this.f2724b;
        if (i7 == i8) {
            int length = iArr.length;
            int i9 = length - i8;
            int i10 = length << 1;
            if (i10 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i10];
            u3.f.B(0, i8, length, iArr, iArr2);
            u3.f.B(i9, 0, this.f2724b, this.f2723a, iArr2);
            this.f2723a = iArr2;
            this.f2724b = 0;
            this.f2725c = length;
            this.f2726d = i10 - 1;
        }
    }
}
