package l;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2446g;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2446g) {
            case 0:
                b.S().f2449i.f2452j.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
