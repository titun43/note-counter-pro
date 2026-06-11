package g;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1609g;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1609g) {
            case 0:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
