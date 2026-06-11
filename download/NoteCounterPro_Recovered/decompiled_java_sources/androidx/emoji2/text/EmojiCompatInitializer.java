package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements f1.b {
    @Override // f1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // f1.b
    public final Object b(Context context) {
        Object obj;
        w wVar = new w(new k1.j(context));
        wVar.f295b = 1;
        if (l.f262k == null) {
            synchronized (l.f261j) {
                try {
                    if (l.f262k == null) {
                        l.f262k = new l(wVar);
                    }
                } finally {
                }
            }
        }
        f1.a c5 = f1.a.c(context);
        c5.getClass();
        synchronized (f1.a.f1435e) {
            try {
                obj = c5.f1436a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c5.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final androidx.lifecycle.o lifecycle = ((androidx.lifecycle.t) obj).getLifecycle();
        lifecycle.a(new androidx.lifecycle.e(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public final void onResume() {
                (Build.VERSION.SDK_INT >= 28 ? c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new n(), 500L);
                lifecycle.b(this);
            }
        });
        return Boolean.TRUE;
    }
}
