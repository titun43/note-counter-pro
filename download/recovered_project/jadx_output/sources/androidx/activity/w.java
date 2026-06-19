package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements f4.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f69g;

    public /* synthetic */ w(int i5) {
        this.f69g = i5;
    }

    @Override // f4.a
    public final Object invoke() {
        o4.t coroutineScope_delegate$lambda$0;
        switch (this.f69g) {
            case 0:
                int i5 = ImmLeaksCleaner.f21g;
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new x();
                } catch (NoSuchFieldException unused) {
                    return x.f70m;
                }
            case 1:
                coroutineScope_delegate$lambda$0 = FilesystemPlugin.coroutineScope_delegate$lambda$0();
                return coroutineScope_delegate$lambda$0;
            default:
                i4.a aVar = i4.d.f1866g;
                return Integer.valueOf(i4.d.f1866g.a().nextInt(2147418112) + 65536);
        }
    }
}
