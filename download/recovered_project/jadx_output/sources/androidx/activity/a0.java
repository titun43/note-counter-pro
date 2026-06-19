package androidx.activity;

import com.capacitorjs.plugins.filesystem.FilesystemPlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements f4.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f25g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a0(Object obj, int i5) {
        this.f25g = i5;
        this.h = obj;
    }

    @Override // f4.a
    public final Object invoke() {
        o3.k controller_delegate$lambda$0;
        switch (this.f25g) {
            case 0:
                ((f0) this.h).c();
                return t3.h.f3400a;
            case 1:
                ((f0) this.h).b();
                return t3.h.f3400a;
            case 2:
                ((f0) this.h).c();
                return t3.h.f3400a;
            default:
                controller_delegate$lambda$0 = FilesystemPlugin.controller_delegate$lambda$0((FilesystemPlugin) this.h);
                return controller_delegate$lambda$0;
        }
    }
}
