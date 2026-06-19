package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f603a = n.g("WrkMgrInitializer");

    @Override // f1.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // f1.b
    public final Object b(Context context) {
        n.e().b(f603a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        l1.k.R(context, new b(new t2.i(6)));
        return l1.k.Q(context);
    }
}
