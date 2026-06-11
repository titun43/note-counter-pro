package a3;

import android.os.IBinder;
import android.os.IInterface;
import androidx.emoji2.text.u;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.internal.common.zzb;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b extends zzb implements a {

    /* renamed from: g, reason: collision with root package name */
    public final Object f18g;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f18g = obj;
    }

    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new e(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object b(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f18g;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i5 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i5++;
                field = field2;
            }
        }
        if (i5 != 1) {
            int length = declaredFields.length;
            throw new IllegalArgumentException(u.l(new StringBuilder(String.valueOf(length).length() + 53), "Unexpected number of IObjectWrapper declared fields: ", length));
        }
        b0.g(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e4) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
        } catch (NullPointerException e5) {
            throw new IllegalArgumentException("Binder object is null.", e5);
        }
    }
}
