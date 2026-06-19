package a;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.InputFilter;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.emoji2.text.u;
import b3.g;
import com.google.android.gms.internal.ads.zzbgj;
import com.lokhnathtechnical.notecounterpro.R;
import f0.j;
import f0.q0;
import f0.r0;
import f4.l;
import f4.p;
import g4.i;
import g4.n;
import g4.q;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import k0.e;
import k0.w;
import k1.b;
import k1.d;
import o4.b0;
import q.m;
import t3.h;
import t4.r;
import y3.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f0g = false;
    public static Method h = null;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f1i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Field f2j;

    /* renamed from: k, reason: collision with root package name */
    public static long f3k;

    /* renamed from: l, reason: collision with root package name */
    public static Method f4l;

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(List list, w wVar, c cVar) {
        k0.c cVar2;
        int i5;
        List list2;
        n nVar;
        Iterator it;
        Throwable th;
        if (cVar instanceof k0.c) {
            cVar2 = (k0.c) cVar;
            int i6 = cVar2.f2326j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar2.f2326j = i6 - Integer.MIN_VALUE;
                Object obj = cVar2.f2325i;
                Object obj2 = x3.a.f3712g;
                i5 = cVar2.f2326j;
                if (i5 != 0) {
                    g.x(obj);
                    ArrayList arrayList = new ArrayList();
                    e eVar = new e(list, arrayList, null);
                    cVar2.f2324g = arrayList;
                    cVar2.f2326j = 1;
                    if (wVar.a(eVar, cVar2) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = cVar2.h;
                        nVar = (n) cVar2.f2324g;
                        try {
                            g.x(obj);
                        } catch (Throwable th2) {
                            Object obj3 = nVar.f1704g;
                            if (obj3 == null) {
                                nVar.f1704g = th2;
                            } else {
                                d((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            l lVar = (l) it.next();
                            cVar2.f2324g = nVar;
                            cVar2.h = it;
                            cVar2.f2326j = 2;
                            if (lVar.a(cVar2) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) nVar.f1704g;
                        if (th == null) {
                            return h.f3400a;
                        }
                        throw th;
                    }
                    list2 = (List) cVar2.f2324g;
                    g.x(obj);
                }
                nVar = new n();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) nVar.f1704g;
                if (th == null) {
                }
            }
        }
        cVar2 = new k0.c(cVar);
        Object obj4 = cVar2.f2325i;
        Object obj22 = x3.a.f3712g;
        i5 = cVar2.f2326j;
        if (i5 != 0) {
        }
        nVar = new n();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) nVar.f1704g;
        if (th == null) {
        }
    }

    public static void d(Throwable th, Throwable th2) {
        i.e(th, "<this>");
        i.e(th2, "exception");
        if (th != th2) {
            Integer num = b4.a.f733a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = a4.a.f19a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void f(int i5, int i6, int i7) {
        if (i5 >= 0 && i6 <= i7) {
            if (i5 > i6) {
                throw new IllegalArgumentException(u.g(i5, i6, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i5 + ", toIndex: " + i6 + ", size: " + i7);
    }

    public static final void g(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                d(th, th2);
            }
        }
    }

    public static boolean h(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = r0.f1407a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = q0.f1401d;
        q0 q0Var = (q0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (q0Var == null) {
            q0Var = new q0();
            q0Var.f1402a = null;
            q0Var.f1403b = null;
            q0Var.f1404c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, q0Var);
        }
        WeakReference weakReference2 = q0Var.f1404c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        q0Var.f1404c = new WeakReference(keyEvent);
        if (q0Var.f1403b == null) {
            q0Var.f1403b = new SparseArray();
        }
        SparseArray sparseArray = q0Var.f1403b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(j jVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z4 = false;
        if (jVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return jVar.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f0g) {
                            try {
                                h = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f0g = true;
                        }
                        Method method = h;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z4 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z4) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (r0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f1i) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f2j = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f1i = true;
                }
                Field field = f2j;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (r0.c(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && r0.c(view, keyEvent)) || jVar.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static Set j() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static q.l l(q.j jVar) {
        q.i iVar = new q.i();
        iVar.f3070c = new m();
        q.l lVar = new q.l(iVar);
        iVar.f3069b = lVar;
        iVar.f3068a = jVar.getClass();
        try {
            Object attachCompleter = jVar.attachCompleter(iVar);
            if (attachCompleter == null) {
                return lVar;
            }
            iVar.f3068a = attachCompleter;
            return lVar;
        } catch (Exception e4) {
            lVar.h.h(e4);
            return lVar;
        }
    }

    public static String m(int i5) {
        switch (i5) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return u.l(new StringBuilder(String.valueOf(i5).length() + 21), "unknown status code: ", i5);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case zzbgj.zzt.zzm /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static w3.c o(w3.c cVar) {
        w3.c intercepted;
        i.e(cVar, "<this>");
        c cVar2 = cVar instanceof c ? (c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }

    public static boolean p() {
        if (Build.VERSION.SDK_INT >= 29) {
            return g1.a.a();
        }
        try {
            if (f4l == null) {
                f3k = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f4l = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f4l.invoke(null, Long.valueOf(f3k))).booleanValue();
        } catch (Exception e4) {
            if (!(e4 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e4);
                return false;
            }
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean q(String str) {
        b bVar = k1.m.f2416a;
        Set<d> unmodifiableSet = Collections.unmodifiableSet(k1.c.f2404c);
        HashSet hashSet = new HashSet();
        for (d dVar : unmodifiableSet) {
            if (((k1.c) dVar).f2405a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            k1.c cVar = (k1.c) ((d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static final Object y(r rVar, r rVar2, p pVar) {
        Object nVar;
        Object H;
        try {
            q.a(2, pVar);
            nVar = pVar.invoke(rVar2, rVar);
        } catch (b0 e4) {
            Throwable th = e4.f2787g;
            rVar.G(new o4.n(false, th));
            throw th;
        } catch (Throwable th2) {
            nVar = new o4.n(false, th2);
        }
        x3.a aVar = x3.a.f3712g;
        if (nVar == aVar || (H = rVar.H(nVar)) == o4.w.f2838d) {
            return aVar;
        }
        rVar.V();
        if (H instanceof o4.n) {
            throw ((o4.n) H).f2822a;
        }
        return o4.w.n(H);
    }

    public static Object z(p pVar, Object obj, w3.c cVar) {
        Object cVar2;
        i.e(pVar, "<this>");
        w3.h context = cVar.getContext();
        if (context == w3.i.f3631g) {
            cVar2 = new x3.b(cVar);
            if (cVar.getContext() != w3.i.f3631g) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
            }
        } else {
            cVar2 = new x3.c(cVar, context);
        }
        q.a(2, pVar);
        return pVar.invoke(obj, cVar2);
    }

    public abstract InputFilter[] k(InputFilter[] inputFilterArr);

    public abstract void n(int i5);

    public abstract View r(int i5);

    public abstract boolean s();

    public abstract void t(boolean z4);

    public abstract void v(boolean z4);

    public abstract void w(boolean z4);

    public abstract void x(int i5);

    public void u(boolean z4) {
    }
}
