package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class n implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, h hVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b.d dVar;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i5 = b.c.f682g;
        if (iBinder == null) {
            dVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.d.f683d);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b.d)) {
                b.b bVar = new b.b();
                bVar.f681g = iBinder;
                dVar = bVar;
            } else {
                dVar = (b.d) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new m(dVar, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
