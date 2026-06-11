package j;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import f0.s0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class n implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1942y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f1943a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f1944b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1945c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1946d;

    /* renamed from: e, reason: collision with root package name */
    public l f1947e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1948f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1949g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1950i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1951j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1952k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f1954m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f1955n;

    /* renamed from: o, reason: collision with root package name */
    public View f1956o;

    /* renamed from: v, reason: collision with root package name */
    public p f1963v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1964x;

    /* renamed from: l, reason: collision with root package name */
    public int f1953l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1957p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1958q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1959r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1960s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f1961t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f1962u = new CopyOnWriteArrayList();
    public boolean w = false;

    public n(Context context) {
        boolean z4;
        boolean z5 = false;
        this.f1943a = context;
        Resources resources = context.getResources();
        this.f1944b = resources;
        this.f1948f = new ArrayList();
        this.f1949g = new ArrayList();
        this.h = true;
        this.f1950i = new ArrayList();
        this.f1951j = new ArrayList();
        this.f1952k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i5 = s0.f1417a;
            if (Build.VERSION.SDK_INT >= 28) {
                z4 = b0.e.q(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z4 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z4) {
                z5 = true;
            }
        }
        this.f1946d = z5;
    }

    public final p a(int i5, int i6, int i7, CharSequence charSequence) {
        int i8;
        int i9 = ((-65536) & i7) >> 16;
        if (i9 < 0 || i9 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i10 = (f1942y[i9] << 16) | (65535 & i7);
        p pVar = new p(this, i5, i6, i7, i10, charSequence, this.f1953l);
        ArrayList arrayList = this.f1948f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i8 = 0;
                break;
            }
            if (((p) arrayList.get(size)).f1970d <= i10) {
                i8 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i8, pVar);
        p(true);
        return pVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i5, int i6, int i7, ComponentName componentName, Intent[] intentArr, Intent intent, int i8, MenuItem[] menuItemArr) {
        int i9;
        PackageManager packageManager = this.f1943a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i8 & 1) == 0) {
            removeGroup(i5);
        }
        for (int i10 = 0; i10 < size; i10++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i10);
            int i11 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i11 < 0 ? intent : intentArr[i11]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            p a5 = a(i5, i6, i7, resolveInfo.loadLabel(packageManager));
            a5.setIcon(resolveInfo.loadIcon(packageManager));
            a5.f1973g = intent2;
            if (menuItemArr != null && (i9 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i9] = a5;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(z zVar, Context context) {
        this.f1962u.add(new WeakReference(zVar));
        zVar.i(context, this);
        this.f1952k = true;
    }

    public final void c(boolean z4) {
        if (this.f1960s) {
            return;
        }
        this.f1960s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1962u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zVar.b(this, z4);
            }
        }
        this.f1960s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        p pVar = this.f1963v;
        if (pVar != null) {
            d(pVar);
        }
        this.f1948f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f1955n = null;
        this.f1954m = null;
        this.f1956o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(p pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1962u;
        boolean z4 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f1963v == pVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 = zVar.k(pVar);
                    if (z4) {
                        break;
                    }
                }
            }
            v();
            if (z4) {
                this.f1963v = null;
            }
        }
        return z4;
    }

    public boolean e(n nVar, MenuItem menuItem) {
        l lVar = this.f1947e;
        return lVar != null && lVar.g(nVar, menuItem);
    }

    public boolean f(p pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1962u;
        boolean z4 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z4 = zVar.c(pVar);
                if (z4) {
                    break;
                }
            }
        }
        v();
        if (z4) {
            this.f1963v = pVar;
        }
        return z4;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i5) {
        MenuItem findItem;
        ArrayList arrayList = this.f1948f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = (p) arrayList.get(i6);
            if (pVar.f1967a == i5) {
                return pVar;
            }
            if (pVar.hasSubMenu() && (findItem = pVar.f1980o.findItem(i5)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final p g(int i5, KeyEvent keyEvent) {
        ArrayList arrayList = this.f1961t;
        arrayList.clear();
        h(arrayList, i5, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (p) arrayList.get(0);
        }
        boolean n5 = n();
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = (p) arrayList.get(i6);
            char c5 = n5 ? pVar.f1975j : pVar.h;
            char[] cArr = keyData.meta;
            if ((c5 == cArr[0] && (metaState & 2) == 0) || ((c5 == cArr[2] && (metaState & 2) != 0) || (n5 && c5 == '\b' && i5 == 67))) {
                return pVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i5) {
        return (MenuItem) this.f1948f.get(i5);
    }

    public final void h(List list, int i5, KeyEvent keyEvent) {
        boolean n5 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i5 == 67) {
            ArrayList arrayList = this.f1948f;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                p pVar = (p) arrayList.get(i6);
                if (pVar.hasSubMenu()) {
                    pVar.f1980o.h(list, i5, keyEvent);
                }
                char c5 = n5 ? pVar.f1975j : pVar.h;
                if ((modifiers & 69647) == ((n5 ? pVar.f1976k : pVar.f1974i) & 69647) && c5 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c5 == cArr[0] || c5 == cArr[2] || (n5 && c5 == '\b' && i5 == 67)) && pVar.isEnabled()) {
                        list.add(pVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f1964x) {
            return true;
        }
        ArrayList arrayList = this.f1948f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((p) arrayList.get(i5)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l5 = l();
        if (this.f1952k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f1962u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 |= zVar.d();
                }
            }
            ArrayList arrayList = this.f1950i;
            ArrayList arrayList2 = this.f1951j;
            if (z4) {
                arrayList.clear();
                arrayList2.clear();
                int size = l5.size();
                for (int i5 = 0; i5 < size; i5++) {
                    p pVar = (p) l5.get(i5);
                    if ((pVar.f1988x & 32) == 32) {
                        arrayList.add(pVar);
                    } else {
                        arrayList2.add(pVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f1952k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return g(i5, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z4 = this.h;
        ArrayList arrayList = this.f1949g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f1948f;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            p pVar = (p) arrayList2.get(i5);
            if (pVar.isVisible()) {
                arrayList.add(pVar);
            }
        }
        this.h = false;
        this.f1952k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.f1945c;
    }

    public boolean o() {
        return this.f1946d;
    }

    public final void p(boolean z4) {
        if (this.f1957p) {
            this.f1958q = true;
            if (z4) {
                this.f1959r = true;
                return;
            }
            return;
        }
        if (z4) {
            this.h = true;
            this.f1952k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1962u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zVar.h();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i5, int i6) {
        return q(findItem(i5), null, i6);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i5, KeyEvent keyEvent, int i6) {
        p g5 = g(i5, keyEvent);
        boolean q5 = g5 != null ? q(g5, null, i6) : false;
        if ((i6 & 2) != 0) {
            c(true);
        }
        return q5;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, z zVar, int i5) {
        boolean z4;
        p pVar = (p) menuItem;
        if (pVar == null || !pVar.isEnabled()) {
            return false;
        }
        n nVar = pVar.f1979n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = pVar.f1981p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(pVar)) && !nVar.e(nVar, pVar)) {
            Intent intent = pVar.f1973g;
            if (intent != null) {
                try {
                    nVar.f1943a.startActivity(intent);
                } catch (ActivityNotFoundException e4) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
                }
            }
            q qVar = pVar.A;
            if (qVar == null || !qVar.f1992b.onPerformDefaultAction()) {
                z4 = false;
                q qVar2 = pVar.A;
                boolean z5 = qVar2 == null && qVar2.f1992b.hasSubMenu();
                if (!pVar.e()) {
                    z4 |= pVar.expandActionView();
                    if (z4) {
                        c(true);
                    }
                } else if (pVar.hasSubMenu() || z5) {
                    if ((i5 & 4) == 0) {
                        c(false);
                    }
                    if (!pVar.hasSubMenu()) {
                        f0 f0Var = new f0(this.f1943a, this, pVar);
                        pVar.f1980o = f0Var;
                        f0Var.setHeaderTitle(pVar.f1971e);
                    }
                    f0 f0Var2 = pVar.f1980o;
                    if (z5) {
                        qVar2.f1992b.onPrepareSubMenu(f0Var2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f1962u;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = zVar != null ? zVar.f(f0Var2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            z zVar2 = (z) weakReference.get();
                            if (zVar2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = zVar2.f(f0Var2);
                            }
                        }
                    }
                    z4 |= r0;
                    if (!z4) {
                        c(true);
                    }
                } else if ((i5 & 1) == 0) {
                    c(true);
                }
                return z4;
            }
        }
        z4 = true;
        q qVar22 = pVar.A;
        if (qVar22 == null) {
        }
        if (!pVar.e()) {
        }
        return z4;
    }

    public final void r(z zVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1962u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar2 = (z) weakReference.get();
            if (zVar2 == null || zVar2 == zVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i5) {
        ArrayList arrayList = this.f1948f;
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (((p) arrayList.get(i7)).f1968b == i5) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            int size2 = arrayList.size() - i7;
            while (true) {
                int i8 = i6 + 1;
                if (i6 >= size2 || ((p) arrayList.get(i7)).f1968b != i5) {
                    break;
                }
                if (i7 >= 0 && i7 < arrayList.size()) {
                    arrayList.remove(i7);
                }
                i6 = i8;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i5) {
        ArrayList arrayList = this.f1948f;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((p) arrayList.get(i6)).f1967a == i5) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 < 0 || i6 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i6);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f1948f.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((f0) item.getSubMenu()).s(bundle);
            }
        }
        int i6 = bundle.getInt("android:menu:expandedactionview");
        if (i6 <= 0 || (findItem = findItem(i6)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i5, boolean z4, boolean z5) {
        ArrayList arrayList = this.f1948f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = (p) arrayList.get(i6);
            if (pVar.f1968b == i5) {
                pVar.f1988x = (pVar.f1988x & (-5)) | (z5 ? 4 : 0);
                pVar.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.w = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i5, boolean z4) {
        ArrayList arrayList = this.f1948f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = (p) arrayList.get(i6);
            if (pVar.f1968b == i5) {
                pVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i5, boolean z4) {
        ArrayList arrayList = this.f1948f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = (p) arrayList.get(i6);
            if (pVar.f1968b == i5) {
                int i7 = pVar.f1988x;
                int i8 = (i7 & (-9)) | (z4 ? 0 : 8);
                pVar.f1988x = i8;
                if (i7 != i8) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f1945c = z4;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f1948f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f1948f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((f0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i5, CharSequence charSequence, int i6, Drawable drawable, View view) {
        if (view != null) {
            this.f1956o = view;
            this.f1954m = null;
            this.f1955n = null;
        } else {
            if (i5 > 0) {
                this.f1954m = this.f1944b.getText(i5);
            } else if (charSequence != null) {
                this.f1954m = charSequence;
            }
            if (i6 > 0) {
                this.f1955n = v.a.getDrawable(this.f1943a, i6);
            } else if (drawable != null) {
                this.f1955n = drawable;
            }
            this.f1956o = null;
        }
        p(false);
    }

    public final void v() {
        this.f1957p = false;
        if (this.f1958q) {
            this.f1958q = false;
            p(this.f1959r);
        }
    }

    public final void w() {
        if (this.f1957p) {
            return;
        }
        this.f1957p = true;
        this.f1958q = false;
        this.f1959r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5) {
        return a(0, 0, 0, this.f1944b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5) {
        return addSubMenu(0, 0, 0, this.f1944b.getString(i5));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i6, int i7, CharSequence charSequence) {
        return a(i5, i6, i7, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i6, int i7, CharSequence charSequence) {
        p a5 = a(i5, i6, i7, charSequence);
        f0 f0Var = new f0(this.f1943a, this, a5);
        a5.f1980o = f0Var;
        f0Var.setHeaderTitle(a5.f1971e);
        return f0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i6, int i7, int i8) {
        return a(i5, i6, i7, this.f1944b.getString(i8));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i6, int i7, int i8) {
        return addSubMenu(i5, i6, i7, this.f1944b.getString(i8));
    }

    public n k() {
        return this;
    }
}
