package d4;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class c extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(File file, File file2, String str) {
        super(r3);
        g4.i.e(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String sb2 = sb.toString();
        g4.i.d(sb2, "toString(...)");
    }
}
