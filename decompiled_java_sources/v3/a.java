package v3;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.capacitorjs.plugins.filesystem.a f3581g;

    public a(com.capacitorjs.plugins.filesystem.a aVar) {
        this.f3581g = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f3581g.invoke();
    }
}
