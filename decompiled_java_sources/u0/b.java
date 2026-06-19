package u0;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import g4.i;

/* loaded from: classes.dex */
public abstract class b {
    public static final a a(Context context) {
        i.e(context, "context");
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i5 = Build.VERSION.SDK_INT;
        s0.a aVar = s0.a.f3288a;
        sb.append(i5 >= 30 ? aVar.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        w0.b bVar = (i5 >= 30 ? aVar.a() : 0) >= 5 ? new w0.b(context) : null;
        if (bVar != null) {
            return new a(bVar);
        }
        return null;
    }

    public abstract j3.a b(Uri uri, InputEvent inputEvent);
}
