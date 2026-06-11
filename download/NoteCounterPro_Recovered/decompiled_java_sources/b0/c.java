package b0;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: g, reason: collision with root package name */
    public final o4.f f685g;

    public c(o4.f fVar) {
        super(false);
        this.f685g = fVar;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f685g.resumeWith(b3.g.g(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f685g.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
