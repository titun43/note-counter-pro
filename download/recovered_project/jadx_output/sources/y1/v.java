package y1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzkd;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f3874a;

    public /* synthetic */ v(w wVar) {
        this.f3874a = wVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zze.zzk("BillingClientTesting", "Billing Override Service connected.");
        this.f3874a.B = zzau.zzc(iBinder);
        this.f3874a.A = 2;
        w wVar = this.f3874a;
        zzkd d5 = z.d(26);
        Objects.requireNonNull(d5, "ApiSuccess should not be null");
        wVar.f3794g.I(d5);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zze.zzl("BillingClientTesting", "Billing Override Service disconnected.");
        this.f3874a.B = null;
        this.f3874a.A = 0;
    }
}
