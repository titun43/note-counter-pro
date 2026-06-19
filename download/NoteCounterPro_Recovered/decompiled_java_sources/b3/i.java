package b3;

import java.util.Random;

/* loaded from: classes.dex */
public final class i extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f731a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f731a) {
            case 0:
                return 0L;
            case 1:
                return Boolean.FALSE;
            default:
                return new Random();
        }
    }
}
