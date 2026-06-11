package k1;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final p f2424a;

    static {
        p eVar;
        try {
            eVar = new u1.f((WebViewProviderFactoryBoundaryInterface) y4.b.f(WebViewProviderFactoryBoundaryInterface.class, b3.g.r()), 15);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
        f2424a = eVar;
    }
}
