package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f1734f;

    /* renamed from: a, reason: collision with root package name */
    public int f1735a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f1736b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f1737c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f1738d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f1739e;

    public d(Context context, int i5) {
        super(context);
        this.f1735a = i5;
    }

    public final void a(Configuration configuration) {
        if (this.f1739e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1738d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1738d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f1736b == null) {
            this.f1736b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1736b.setTo(theme);
            }
        }
        this.f1736b.applyStyle(this.f1735a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(i.d.f1734f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f1739e == null) {
            Configuration configuration = this.f1738d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f1734f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f1734f = configuration2;
                    }
                }
                this.f1739e = createConfigurationContext(this.f1738d).getResources();
            }
            this.f1739e = super.getResources();
        }
        return this.f1739e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1737c == null) {
            this.f1737c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1737c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f1736b;
        if (theme != null) {
            return theme;
        }
        if (this.f1735a == 0) {
            this.f1735a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f1736b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i5) {
        if (this.f1735a != i5) {
            this.f1735a = i5;
            b();
        }
    }
}
