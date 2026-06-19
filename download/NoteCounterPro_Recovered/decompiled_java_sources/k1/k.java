package k1;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f2414d;

    public k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f2414d = Pattern.compile("\\A\\d+");
    }

    @Override // k1.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // k1.c
    public final boolean b() {
        int i5;
        PackageInfo packageInfo;
        boolean b2 = super.b();
        if (!b2 || (i5 = Build.VERSION.SDK_INT) >= 29) {
            return b2;
        }
        boolean z4 = j1.f.f2020a;
        if (i5 >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = j1.f.c();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            Matcher matcher = this.f2414d.matcher(packageInfo.versionName);
            if (matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
