package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.emoji2.text.t;
import androidx.lifecycle.w;
import androidx.work.impl.WorkDatabase;
import androidx.work.n;
import java.util.UUID;
import l1.k;
import s1.b;
import u1.a;

/* loaded from: classes.dex */
public class SystemForegroundService extends w {

    /* renamed from: l, reason: collision with root package name */
    public static final String f658l = n.g("SystemFgService");
    public Handler h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f659i;

    /* renamed from: j, reason: collision with root package name */
    public b f660j;

    /* renamed from: k, reason: collision with root package name */
    public NotificationManager f661k;

    public final void a() {
        this.h = new Handler(Looper.getMainLooper());
        this.f661k = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f660j = bVar;
        if (bVar.f3297o != null) {
            n.e().d(b.f3289p, "A callback already exists.", new Throwable[0]);
        } else {
            bVar.f3297o = this;
        }
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f660j.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i6) {
        super.onStartCommand(intent, i5, i6);
        boolean z4 = this.f659i;
        String str = f658l;
        if (z4) {
            n.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f660j.g();
            a();
            this.f659i = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f660j;
        k kVar = bVar.f3290g;
        String str2 = b.f3289p;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            n.e().f(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = kVar.f2489e;
            ((t) bVar.h).i(new c0.n(bVar, workDatabase, stringExtra, 5));
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            n.e().f(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID fromString = UUID.fromString(stringExtra2);
            kVar.getClass();
            kVar.f2490f.i(new a(kVar, fromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        n.e().f(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = bVar.f3297o;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f659i = true;
        n.e().b(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
