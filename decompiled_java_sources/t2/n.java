package t2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends m {
    public final byte[] h;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.h = bArr;
    }

    @Override // t2.m
    public final byte[] a() {
        return this.h;
    }
}
