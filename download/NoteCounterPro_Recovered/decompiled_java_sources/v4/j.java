package v4;

import o4.w;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f3611i;

    public j(Runnable runnable, long j2, boolean z4) {
        super(j2, z4);
        this.f3611i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3611i.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3611i;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(w.e(runnable));
        sb.append(", ");
        sb.append(this.f3610g);
        sb.append(", ");
        sb.append(this.h ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
