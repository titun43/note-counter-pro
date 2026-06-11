package androidx.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.getcapacitor.PluginMethod;
import com.lokhnathtechnical.notecounterpro.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class s extends u.h implements x0, androidx.lifecycle.i, c1.f {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final l Companion = new l();
    private w0 _viewModelStore;
    private final d.h activityResultRegistry;
    private int contentLayoutId;
    private final t3.b defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final t3.b fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final t3.b onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<e0.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<e0.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<e0.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<e0.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<e0.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final n reportFullyDrawnExecutor;
    private final c1.e savedStateRegistryController;
    private final c.a contextAwareHelper = new c.a();
    private final f0.m menuHostHelper = new f0.m(new e(this, 0));

    public s() {
        c1.e eVar = new c1.e(this);
        this.savedStateRegistryController = eVar;
        this.reportFullyDrawnExecutor = new p(this);
        this.fullyDrawnReporter$delegate = new t3.f(new f(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new r(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new h(this, 0));
        getLifecycle().a(new h(this, 1));
        getLifecycle().a(new androidx.lifecycle.r() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.r
            public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                s sVar = s.this;
                s.access$ensureViewModelStore(sVar);
                sVar.getLifecycle().b(this);
            }
        });
        eVar.a();
        k0.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new i(this, 0));
        addOnContextAvailableListener(new c.b() { // from class: androidx.activity.j
            @Override // c.b
            public final void a(s sVar) {
                s.e(s.this, sVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = new t3.f(new f(this, 2));
        this.onBackPressedDispatcher$delegate = new t3.f(new f(this, 3));
    }

    public static Bundle a(s sVar) {
        Bundle bundle = new Bundle();
        d.h hVar = sVar.activityResultRegistry;
        hVar.getClass();
        LinkedHashMap linkedHashMap = hVar.f1170b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f1172d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(hVar.f1175g));
        return bundle;
    }

    public static final void access$ensureViewModelStore(s sVar) {
        if (sVar._viewModelStore == null) {
            m mVar = (m) sVar.getLastNonConfigurationInstance();
            if (mVar != null) {
                sVar._viewModelStore = mVar.f55b;
            }
            if (sVar._viewModelStore == null) {
                sVar._viewModelStore = new w0();
            }
        }
    }

    public static void b(s sVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e4) {
            if (!g4.i.a(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e4;
            }
        } catch (NullPointerException e5) {
            if (!g4.i.a(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e5;
            }
        }
    }

    public static void c(s sVar, androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        if (mVar == androidx.lifecycle.m.ON_DESTROY) {
            sVar.contextAwareHelper.f735b = null;
            if (!sVar.isChangingConfigurations()) {
                sVar.getViewModelStore().a();
            }
            p pVar = (p) sVar.reportFullyDrawnExecutor;
            s sVar2 = pVar.f59j;
            sVar2.getWindow().getDecorView().removeCallbacks(pVar);
            sVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(pVar);
        }
    }

    public static v d(s sVar) {
        return new v(sVar.reportFullyDrawnExecutor, new f(sVar, 0));
    }

    public static void e(s sVar, Context context) {
        g4.i.e(context, "it");
        Bundle a5 = sVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a5 != null) {
            d.h hVar = sVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = hVar.f1170b;
            LinkedHashMap linkedHashMap2 = hVar.f1169a;
            Bundle bundle = hVar.f1175g;
            ArrayList<Integer> integerArrayList = a5.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a5.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a5.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                hVar.f1172d.addAll(stringArrayList2);
            }
            Bundle bundle2 = a5.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                String str = stringArrayList.get(i5);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (bundle.containsKey(str)) {
                        continue;
                    } else {
                        if (linkedHashMap2 instanceof h4.a) {
                            g4.q.c(linkedHashMap2, "kotlin.collections.MutableMap");
                            throw null;
                        }
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i5);
                g4.i.d(num2, "get(...)");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i5);
                g4.i.d(str2, "get(...)");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                hVar.f1170b.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        n nVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        g4.i.d(decorView, "getDecorView(...)");
        ((p) nVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(f0.o oVar) {
        g4.i.e(oVar, "provider");
        f0.m mVar = this.menuHostHelper;
        mVar.f1392b.add(oVar);
        mVar.f1391a.run();
    }

    public final void addOnConfigurationChangedListener(e0.a aVar) {
        g4.i.e(aVar, "listener");
        this.onConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(c.b bVar) {
        g4.i.e(bVar, "listener");
        c.a aVar = this.contextAwareHelper;
        aVar.getClass();
        s sVar = aVar.f735b;
        if (sVar != null) {
            bVar.a(sVar);
        }
        aVar.f734a.add(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(e0.a aVar) {
        g4.i.e(aVar, "listener");
        this.onMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(e0.a aVar) {
        g4.i.e(aVar, "listener");
        this.onNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(e0.a aVar) {
        g4.i.e(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(e0.a aVar) {
        g4.i.e(aVar, "listener");
        this.onTrimMemoryListeners.add(aVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        g4.i.e(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final d.h getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.i
    public q0.b getDefaultViewModelCreationExtras() {
        q0.d dVar = new q0.d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f3075a;
        if (application != null) {
            linkedHashMap.put(s0.f577a, getApplication());
        }
        linkedHashMap.put(k0.f549a, this);
        linkedHashMap.put(k0.f550b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(k0.f551c, extras);
        }
        return dVar;
    }

    public u0 getDefaultViewModelProviderFactory() {
        return (u0) ((t3.f) this.defaultViewModelProviderFactory$delegate).a();
    }

    public v getFullyDrawnReporter() {
        return (v) ((t3.f) this.fullyDrawnReporter$delegate).a();
    }

    public Object getLastCustomNonConfigurationInstance() {
        m mVar = (m) getLastNonConfigurationInstance();
        if (mVar != null) {
            return mVar.f54a;
        }
        return null;
    }

    @Override // u.h, androidx.lifecycle.t
    public androidx.lifecycle.o getLifecycle() {
        return super.getLifecycle();
    }

    public final f0 getOnBackPressedDispatcher() {
        return (f0) ((t3.f) this.onBackPressedDispatcher$delegate).a();
    }

    @Override // c1.f
    public final c1.d getSavedStateRegistry() {
        return this.savedStateRegistryController.f784b;
    }

    @Override // androidx.lifecycle.x0
    public w0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            m mVar = (m) getLastNonConfigurationInstance();
            if (mVar != null) {
                this._viewModelStore = mVar.f55b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new w0();
            }
        }
        w0 w0Var = this._viewModelStore;
        g4.i.b(w0Var);
        return w0Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        g4.i.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        g4.i.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        g4.i.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        g4.i.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        g4.i.d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i5, int i6, Intent intent) {
        if (this.activityResultRegistry.a(i5, i6, intent)) {
            return;
        }
        super.onActivityResult(i5, i6, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        g4.i.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<e0.a> it = this.onConfigurationChangedListeners.iterator();
        g4.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // u.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        c.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f735b = this;
        Iterator it = aVar.f734a.iterator();
        while (it.hasNext()) {
            ((c.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i5 = i0.h;
        androidx.lifecycle.f0.b(this);
        int i6 = this.contentLayoutId;
        if (i6 != 0) {
            setContentView(i6);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i5, Menu menu) {
        g4.i.e(menu, "menu");
        if (i5 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i5, menu);
        f0.m mVar = this.menuHostHelper;
        getMenuInflater();
        Iterator it = mVar.f1392b.iterator();
        while (it.hasNext()) {
            ((m0) ((f0.o) it.next())).f404a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        g4.i.e(menuItem, "item");
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 0) {
            return this.menuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<e0.a> it = this.onMultiWindowModeChangedListeners.iterator();
        g4.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new u.j(z4));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        g4.i.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<e0.a> it = this.onNewIntentListeners.iterator();
        g4.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, Menu menu) {
        g4.i.e(menu, "menu");
        Iterator it = this.menuHostHelper.f1392b.iterator();
        while (it.hasNext()) {
            ((m0) ((f0.o) it.next())).f404a.q();
        }
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<e0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        g4.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new u.w(z4));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i5, View view, Menu menu) {
        g4.i.e(menu, "menu");
        if (i5 != 0) {
            return true;
        }
        super.onPreparePanel(i5, view, menu);
        Iterator it = this.menuHostHelper.f1392b.iterator();
        while (it.hasNext()) {
            ((m0) ((f0.o) it.next())).f404a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        g4.i.e(strArr, "permissions");
        g4.i.e(iArr, "grantResults");
        if (this.activityResultRegistry.a(i5, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        m mVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        w0 w0Var = this._viewModelStore;
        if (w0Var == null && (mVar = (m) getLastNonConfigurationInstance()) != null) {
            w0Var = mVar.f55b;
        }
        if (w0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        m mVar2 = new m();
        mVar2.f54a = onRetainCustomNonConfigurationInstance;
        mVar2.f55b = w0Var;
        return mVar2;
    }

    @Override // u.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        g4.i.e(bundle, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.v) {
            androidx.lifecycle.o lifecycle = getLifecycle();
            g4.i.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.v) lifecycle).g();
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        Iterator<e0.a> it = this.onTrimMemoryListeners.iterator();
        g4.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i5));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        g4.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f735b;
    }

    public final <I, O> d.c registerForActivityResult(e.a aVar, d.h hVar, d.b bVar) {
        g4.i.e(aVar, "contract");
        g4.i.e(hVar, "registry");
        g4.i.e(bVar, PluginMethod.RETURN_CALLBACK);
        return hVar.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public void removeMenuProvider(f0.o oVar) {
        g4.i.e(oVar, "provider");
        this.menuHostHelper.b(oVar);
    }

    public final void removeOnConfigurationChangedListener(e0.a aVar) {
        g4.i.e(aVar, "listener");
        this.onConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(c.b bVar) {
        g4.i.e(bVar, "listener");
        c.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f734a.remove(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(e0.a aVar) {
        g4.i.e(aVar, "listener");
        this.onMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(e0.a aVar) {
        g4.i.e(aVar, "listener");
        this.onNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(e0.a aVar) {
        g4.i.e(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(e0.a aVar) {
        g4.i.e(aVar, "listener");
        this.onTrimMemoryListeners.remove(aVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        g4.i.e(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (a.a.p()) {
                a.a.e("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            v fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f66b) {
                try {
                    fullyDrawnReporter.f67c = true;
                    ArrayList arrayList = fullyDrawnReporter.f68d;
                    int size = arrayList.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList.get(i5);
                        i5++;
                        ((f4.a) obj).invoke();
                    }
                    fullyDrawnReporter.f68d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i5) {
        initializeViewTreeOwners();
        n nVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        g4.i.d(decorView, "getDecorView(...)");
        ((p) nVar).a(decorView);
        super.setContentView(i5);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i5) {
        g4.i.e(intent, "intent");
        super.startActivityForResult(intent, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8) {
        g4.i.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i5, Bundle bundle) {
        g4.i.e(intent, "intent");
        super.startActivityForResult(intent, i5, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) {
        g4.i.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
    }

    public final <I, O> d.c registerForActivityResult(e.a aVar, d.b bVar) {
        g4.i.e(aVar, "contract");
        g4.i.e(bVar, PluginMethod.RETURN_CALLBACK);
        return registerForActivityResult(aVar, this.activityResultRegistry, bVar);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4, Configuration configuration) {
        g4.i.e(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z4, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<e0.a> it = this.onMultiWindowModeChangedListeners.iterator();
            g4.i.d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new u.j(z4));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        g4.i.e(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z4, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<e0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            g4.i.d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new u.w(z4));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        n nVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        g4.i.d(decorView, "getDecorView(...)");
        ((p) nVar).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(f0.o oVar, androidx.lifecycle.t tVar) {
        g4.i.e(oVar, "provider");
        g4.i.e(tVar, "owner");
        f0.m mVar = this.menuHostHelper;
        mVar.f1392b.add(oVar);
        mVar.f1391a.run();
        androidx.lifecycle.o lifecycle = tVar.getLifecycle();
        HashMap hashMap = mVar.f1393c;
        f0.l lVar = (f0.l) hashMap.remove(oVar);
        if (lVar != null) {
            lVar.f1388a.b(lVar.f1389b);
            lVar.f1389b = null;
        }
        hashMap.put(oVar, new f0.l(lifecycle, new g(1, mVar, oVar)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        n nVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        g4.i.d(decorView, "getDecorView(...)");
        ((p) nVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final f0.o oVar, androidx.lifecycle.t tVar, final androidx.lifecycle.n nVar) {
        g4.i.e(oVar, "provider");
        g4.i.e(tVar, "owner");
        g4.i.e(nVar, "state");
        final f0.m mVar = this.menuHostHelper;
        mVar.getClass();
        androidx.lifecycle.o lifecycle = tVar.getLifecycle();
        HashMap hashMap = mVar.f1393c;
        f0.l lVar = (f0.l) hashMap.remove(oVar);
        if (lVar != null) {
            lVar.f1388a.b(lVar.f1389b);
            lVar.f1389b = null;
        }
        hashMap.put(oVar, new f0.l(lifecycle, new androidx.lifecycle.r() { // from class: f0.k
            @Override // androidx.lifecycle.r
            public final void a(androidx.lifecycle.t tVar2, androidx.lifecycle.m mVar2) {
                m mVar3 = m.this;
                mVar3.getClass();
                Runnable runnable = mVar3.f1391a;
                CopyOnWriteArrayList copyOnWriteArrayList = mVar3.f1392b;
                androidx.lifecycle.m.Companion.getClass();
                androidx.lifecycle.n nVar2 = nVar;
                int ordinal = nVar2.ordinal();
                androidx.lifecycle.m mVar4 = null;
                androidx.lifecycle.m mVar5 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : androidx.lifecycle.m.ON_RESUME : androidx.lifecycle.m.ON_START : androidx.lifecycle.m.ON_CREATE;
                o oVar2 = oVar;
                if (mVar2 == mVar5) {
                    copyOnWriteArrayList.add(oVar2);
                    runnable.run();
                    return;
                }
                androidx.lifecycle.m mVar6 = androidx.lifecycle.m.ON_DESTROY;
                if (mVar2 == mVar6) {
                    mVar3.b(oVar2);
                    return;
                }
                int ordinal2 = nVar2.ordinal();
                if (ordinal2 == 2) {
                    mVar4 = mVar6;
                } else if (ordinal2 == 3) {
                    mVar4 = androidx.lifecycle.m.ON_STOP;
                } else if (ordinal2 == 4) {
                    mVar4 = androidx.lifecycle.m.ON_PAUSE;
                }
                if (mVar2 == mVar4) {
                    copyOnWriteArrayList.remove(oVar2);
                    runnable.run();
                }
            }
        }));
    }
}
