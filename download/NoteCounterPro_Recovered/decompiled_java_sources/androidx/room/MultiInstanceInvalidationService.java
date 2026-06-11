package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import z0.f;
import z0.g;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: g, reason: collision with root package name */
    public int f598g = 0;
    public final HashMap h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final f f599i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public final g f600j = new g(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f600j;
    }
}
