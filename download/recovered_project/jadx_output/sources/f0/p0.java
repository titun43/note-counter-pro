package f0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class p0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f b(View view, f fVar) {
        ContentInfo m5 = fVar.f1363a.m();
        Objects.requireNonNull(m5);
        ContentInfo performReceiveContent = view.performReceiveContent(m5);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == m5 ? fVar : new f(new k1.j(performReceiveContent));
    }
}
