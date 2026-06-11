package l2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.emoji2.text.t;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f2521g;
    public final /* synthetic */ f2.j h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2522i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Runnable f2523j;

    public /* synthetic */ e(j jVar, f2.j jVar2, int i5, Runnable runnable) {
        this.f2521g = jVar;
        this.h = jVar2;
        this.f2522i = i5;
        this.f2523j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final f2.j jVar = this.h;
        final int i5 = this.f2522i;
        Runnable runnable = this.f2523j;
        final j jVar2 = this.f2521g;
        n2.c cVar = (n2.c) jVar2.f2538f;
        try {
            try {
                m2.d dVar = (m2.d) jVar2.f2535c;
                Objects.requireNonNull(dVar);
                ((m2.h) cVar).g(new com.getcapacitor.plugin.c(dVar, 6));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) jVar2.f2533a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((m2.h) cVar).g(new n2.b() { // from class: l2.f
                        @Override // n2.b
                        public final Object a() {
                            ((t) j.this.f2536d).w(jVar, i5 + 1, false);
                            return null;
                        }
                    });
                } else {
                    jVar2.j(jVar, i5);
                }
                runnable.run();
            } catch (n2.a unused) {
                ((t) jVar2.f2536d).w(jVar, i5 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
