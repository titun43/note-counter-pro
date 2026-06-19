package g;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.i3;
import k.n2;

/* loaded from: classes.dex */
public abstract class k extends androidx.fragment.app.e0 implements l, u.y {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private r mDelegate;
    private Resources mResources;

    @Override // androidx.activity.s, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        f0 f0Var = (f0) getDelegate();
        f0Var.y();
        ((ViewGroup) f0Var.G.findViewById(R.id.content)).addView(view, layoutParams);
        f0Var.f1546s.a(f0Var.f1545r.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        f0 f0Var = (f0) getDelegate();
        f0Var.U = true;
        int i13 = f0Var.Y;
        if (i13 == -100) {
            i13 = r.h;
        }
        int E = f0Var.E(context, i13);
        int i14 = 0;
        if (r.d(context) && r.d(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (r.f1619o) {
                    try {
                        b0.g gVar = r.f1613i;
                        if (gVar == null) {
                            if (r.f1614j == null) {
                                r.f1614j = b0.g.a(u.e.e(context));
                            }
                            if (!r.f1614j.b()) {
                                r.f1613i = r.f1614j;
                            }
                        } else if (!gVar.equals(r.f1614j)) {
                            b0.g gVar2 = r.f1613i;
                            r.f1614j = gVar2;
                            u.e.d(context, gVar2.f689a.f690a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!r.f1616l) {
                r.f1612g.execute(new m(context, i14));
            }
        }
        b0.g r2 = f0.r(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(f0.v(context, E, r2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof i.d) {
            try {
                ((i.d) context).a(f0.v(context, E, r2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (f0.f1530p0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f5 = configuration3.fontScale;
                    float f6 = configuration4.fontScale;
                    if (f5 != f6) {
                        configuration.fontScale = f6;
                    }
                    int i15 = configuration3.mcc;
                    int i16 = configuration4.mcc;
                    if (i15 != i16) {
                        configuration.mcc = i16;
                    }
                    int i17 = configuration3.mnc;
                    int i18 = configuration4.mnc;
                    if (i17 != i18) {
                        configuration.mnc = i18;
                    }
                    int i19 = Build.VERSION.SDK_INT;
                    x.a(configuration3, configuration4, configuration);
                    int i20 = configuration3.touchscreen;
                    int i21 = configuration4.touchscreen;
                    if (i20 != i21) {
                        configuration.touchscreen = i21;
                    }
                    int i22 = configuration3.keyboard;
                    int i23 = configuration4.keyboard;
                    if (i22 != i23) {
                        configuration.keyboard = i23;
                    }
                    int i24 = configuration3.keyboardHidden;
                    int i25 = configuration4.keyboardHidden;
                    if (i24 != i25) {
                        configuration.keyboardHidden = i25;
                    }
                    int i26 = configuration3.navigation;
                    int i27 = configuration4.navigation;
                    if (i26 != i27) {
                        configuration.navigation = i27;
                    }
                    int i28 = configuration3.navigationHidden;
                    int i29 = configuration4.navigationHidden;
                    if (i28 != i29) {
                        configuration.navigationHidden = i29;
                    }
                    int i30 = configuration3.orientation;
                    int i31 = configuration4.orientation;
                    if (i30 != i31) {
                        configuration.orientation = i31;
                    }
                    int i32 = configuration3.screenLayout & 15;
                    int i33 = configuration4.screenLayout & 15;
                    if (i32 != i33) {
                        configuration.screenLayout |= i33;
                    }
                    int i34 = configuration3.screenLayout & 192;
                    int i35 = configuration4.screenLayout & 192;
                    if (i34 != i35) {
                        configuration.screenLayout |= i35;
                    }
                    int i36 = configuration3.screenLayout & 48;
                    int i37 = configuration4.screenLayout & 48;
                    if (i36 != i37) {
                        configuration.screenLayout |= i37;
                    }
                    int i38 = configuration3.screenLayout & 768;
                    int i39 = configuration4.screenLayout & 768;
                    if (i38 != i39) {
                        configuration.screenLayout |= i39;
                    }
                    if (i19 >= 26) {
                        i5 = configuration3.colorMode;
                        int i40 = i5 & 3;
                        i6 = configuration4.colorMode;
                        if (i40 != (i6 & 3)) {
                            i11 = configuration.colorMode;
                            i12 = configuration4.colorMode;
                            configuration.colorMode = i11 | (i12 & 3);
                        }
                        i7 = configuration3.colorMode;
                        int i41 = i7 & 12;
                        i8 = configuration4.colorMode;
                        if (i41 != (i8 & 12)) {
                            i9 = configuration.colorMode;
                            i10 = configuration4.colorMode;
                            configuration.colorMode = i9 | (i10 & 12);
                        }
                    }
                    int i42 = configuration3.uiMode & 15;
                    int i43 = configuration4.uiMode & 15;
                    if (i42 != i43) {
                        configuration.uiMode |= i43;
                    }
                    int i44 = configuration3.uiMode & 48;
                    int i45 = configuration4.uiMode & 48;
                    if (i44 != i45) {
                        configuration.uiMode |= i45;
                    }
                    int i46 = configuration3.screenWidthDp;
                    int i47 = configuration4.screenWidthDp;
                    if (i46 != i47) {
                        configuration.screenWidthDp = i47;
                    }
                    int i48 = configuration3.screenHeightDp;
                    int i49 = configuration4.screenHeightDp;
                    if (i48 != i49) {
                        configuration.screenHeightDp = i49;
                    }
                    int i50 = configuration3.smallestScreenWidthDp;
                    int i51 = configuration4.smallestScreenWidthDp;
                    if (i50 != i51) {
                        configuration.smallestScreenWidthDp = i51;
                    }
                    int i52 = configuration3.densityDpi;
                    int i53 = configuration4.densityDpi;
                    if (i52 != i53) {
                        configuration.densityDpi = i53;
                    }
                }
            }
            Configuration v5 = f0.v(context, E, r2, configuration, true);
            i.d dVar = new i.d(context, com.lokhnathtechnical.notecounterpro.R.style.Theme_AppCompat_Empty);
            dVar.a(v5);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = dVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        x.j.a(theme);
                    } else {
                        synchronized (x.b.f3660e) {
                            if (!x.b.f3662g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    x.b.f3661f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e4) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e4);
                                }
                                x.b.f3662g = true;
                            }
                            Method method = x.b.f3661f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e5) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e5);
                                    x.b.f3661f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = dVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // u.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i5) {
        f0 f0Var = (f0) getDelegate();
        f0Var.y();
        return (T) f0Var.f1545r.findViewById(i5);
    }

    public r getDelegate() {
        if (this.mDelegate == null) {
            p pVar = r.f1612g;
            this.mDelegate = new f0(this, null, this, this);
        }
        return this.mDelegate;
    }

    public b getDrawerToggleDelegate() {
        ((f0) getDelegate()).getClass();
        return new t2.i(15);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        f0 f0Var = (f0) getDelegate();
        if (f0Var.f1549v == null) {
            f0Var.C();
            a aVar = f0Var.f1548u;
            f0Var.f1549v = new i.i(aVar != null ? aVar.e() : f0Var.f1544q);
        }
        return f0Var.f1549v;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i5 = i3.f2127a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public a getSupportActionBar() {
        f0 f0Var = (f0) getDelegate();
        f0Var.C();
        return f0Var.f1548u;
    }

    @Override // u.y
    public Intent getSupportParentActivityIntent() {
        return u.e.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().c();
    }

    @Override // androidx.activity.s, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f0 f0Var = (f0) getDelegate();
        if (f0Var.L && f0Var.F) {
            f0Var.C();
            a aVar = f0Var.f1548u;
            if (aVar != null) {
                aVar.g();
            }
        }
        k.v a5 = k.v.a();
        Context context = f0Var.f1544q;
        synchronized (a5) {
            n2 n2Var = a5.f2255a;
            synchronized (n2Var) {
                o.i iVar = (o.i) n2Var.f2176b.get(context);
                if (iVar != null) {
                    int i5 = iVar.f2729j;
                    Object[] objArr = iVar.f2728i;
                    for (int i6 = 0; i6 < i5; i6++) {
                        objArr[i6] = null;
                    }
                    iVar.f2729j = 0;
                    iVar.f2727g = false;
                }
            }
        }
        f0Var.X = new Configuration(f0Var.f1544q.getResources().getConfiguration());
        f0Var.p(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(u.z zVar) {
        ArrayList arrayList = zVar.f3492g;
        k kVar = zVar.h;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = u.e.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(kVar.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent b2 = u.e.b(kVar, component); b2 != null; b2 = u.e.b(kVar, b2.getComponent())) {
                    arrayList.add(size, b2);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e4);
            }
        }
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().h();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i5, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.e0, androidx.activity.s, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i5, Menu menu) {
        return super.onMenuOpened(i5, menu);
    }

    @Override // androidx.activity.s, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, Menu menu) {
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((f0) getDelegate()).y();
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        f0 f0Var = (f0) getDelegate();
        f0Var.C();
        a aVar = f0Var.f1548u;
        if (aVar != null) {
            aVar.m(true);
        }
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public void onStart() {
        super.onStart();
        ((f0) getDelegate()).p(true, false);
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public void onStop() {
        super.onStop();
        f0 f0Var = (f0) getDelegate();
        f0Var.C();
        a aVar = f0Var.f1548u;
        if (aVar != null) {
            aVar.m(false);
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        u.z zVar = new u.z(this);
        onCreateSupportNavigateUpTaskStack(zVar);
        onPrepareSupportNavigateUpTaskStack(zVar);
        ArrayList arrayList = zVar.f3492g;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        k kVar = zVar.h;
        if (!v.a.startActivities(kVar, intentArr, null)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            kVar.startActivity(intent);
        }
        try {
            finishAffinity();
        } catch (IllegalStateException unused) {
            finish();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i5) {
        super.onTitleChanged(charSequence, i5);
        getDelegate().n(charSequence);
    }

    @Override // g.l
    public i.b onWindowStartingSupportActionMode(i.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.s, android.app.Activity
    public void setContentView(int i5) {
        initializeViewTreeOwners();
        getDelegate().k(i5);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        f0 f0Var = (f0) getDelegate();
        if (f0Var.f1543p instanceof Activity) {
            f0Var.C();
            a aVar = f0Var.f1548u;
            if (aVar instanceof s0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            f0Var.f1549v = null;
            if (aVar != null) {
                aVar.h();
            }
            f0Var.f1548u = null;
            if (toolbar != null) {
                Object obj = f0Var.f1543p;
                n0 n0Var = new n0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : f0Var.w, f0Var.f1546s);
                f0Var.f1548u = n0Var;
                f0Var.f1546s.h = n0Var.f1595c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                f0Var.f1546s.h = null;
            }
            f0Var.c();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i5) {
        super.setTheme(i5);
        ((f0) getDelegate()).Z = i5;
    }

    public i.b startSupportActionMode(i.a aVar) {
        return getDelegate().o(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().c();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i5) {
        return getDelegate().j(i5);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // androidx.activity.s, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().l(view);
    }

    @Override // androidx.activity.s, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().m(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(b0.g gVar) {
    }

    public void onNightModeChanged(int i5) {
    }

    public void onPrepareSupportNavigateUpTaskStack(u.z zVar) {
    }

    @Override // g.l
    public void onSupportActionModeFinished(i.b bVar) {
    }

    @Override // g.l
    public void onSupportActionModeStarted(i.b bVar) {
    }

    @Deprecated
    public void setSupportProgress(int i5) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z4) {
    }
}
