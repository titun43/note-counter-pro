package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class h0 implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final View f1575g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public Method f1576i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1577j;

    public h0(String str, View view) {
        this.f1575g = view;
        this.h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f1576i == null) {
            View view2 = this.f1575g;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.h;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f1576i = method;
                        this.f1577j = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f1576i.invoke(this.f1577j, view);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Could not execute method for android:onClick", e5);
        }
    }
}
