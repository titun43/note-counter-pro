package c0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            byte b2 = bArr[i5];
            byte b5 = bArr2[i5];
            if (b2 != b5) {
                return b2 - b5;
            }
        }
        return 0;
    }
}
