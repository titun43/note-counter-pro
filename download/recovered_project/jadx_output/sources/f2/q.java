package f2;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.t;
import com.google.android.gms.internal.common.zzg;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1484g;
    public final Object h;

    public /* synthetic */ q(Object obj, int i5) {
        this.f1484g = i5;
        this.h = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1484g) {
            case 0:
                ((Executor) this.h).execute(new androidx.fragment.app.o(runnable, 9));
                break;
            case 1:
                ((zza) this.h).post(runnable);
                break;
            case 2:
                ((Handler) ((t) this.h).f284i).post(runnable);
                break;
            default:
                ((zzg) this.h).post(runnable);
                break;
        }
    }

    public q() {
        this.f1484g = 1;
        this.h = new zza(Looper.getMainLooper());
    }

    public q(Looper looper) {
        this.f1484g = 3;
        this.h = new zzg(looper);
    }
}
