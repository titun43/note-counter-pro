package b0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class d implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f686g;
    public final Handler h;

    public /* synthetic */ d(Handler handler, int i5) {
        this.f686g = i5;
        this.h = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f686g) {
            case 0:
                runnable.getClass();
                Handler handler = this.h;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                runnable.getClass();
                Handler handler2 = this.h;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                this.h.post(runnable);
                return;
        }
    }
}
