package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class y {
    private final CopyOnWriteArrayList<d> cancellables = new CopyOnWriteArrayList<>();
    private f4.a enabledChangedCallback;
    private boolean isEnabled;

    public y(boolean z4) {
        this.isEnabled = z4;
    }

    public final void addCancellable(d dVar) {
        g4.i.e(dVar, "cancellable");
        this.cancellables.add(dVar);
    }

    public final f4.a getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(c cVar) {
        g4.i.e(cVar, "backEvent");
    }

    public void handleOnBackStarted(c cVar) {
        g4.i.e(cVar, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((d) it.next()).cancel();
        }
    }

    public final void removeCancellable(d dVar) {
        g4.i.e(dVar, "cancellable");
        this.cancellables.remove(dVar);
    }

    public final void setEnabled(boolean z4) {
        this.isEnabled = z4;
        f4.a aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(f4.a aVar) {
        this.enabledChangedCallback = aVar;
    }
}
