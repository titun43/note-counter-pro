package org.apache.cordova;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2922a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f2923b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2924c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public e0 f2925d;

    public static void c(f0 f0Var, StringBuilder sb) {
        sb.append(f0Var.b());
        sb.append(' ');
        String str = f0Var.f2913a;
        l0 l0Var = f0Var.f2914b;
        if (l0Var == null) {
            sb.append('J');
            sb.append(str);
            return;
        }
        int i5 = l0Var.f2943a;
        boolean z4 = i5 == 0;
        boolean z5 = i5 == 1;
        boolean z6 = l0Var.f2945c;
        sb.append((z4 || z5) ? 'S' : 'F');
        sb.append(z6 ? '1' : '0');
        sb.append(i5);
        sb.append(' ');
        sb.append(str);
        sb.append(' ');
        f0.e(sb, l0Var);
    }

    public final void a(l0 l0Var, String str) {
        if (str == null) {
            Log.e("JsMessageQueue", "Got plugin result with no callbackId", new Throwable());
            return;
        }
        boolean z4 = l0Var.f2943a == 0;
        boolean z5 = l0Var.f2945c;
        if (z4 && z5) {
            return;
        }
        b(new f0(l0Var, str));
    }

    public final void b(f0 f0Var) {
        synchronized (this) {
            try {
                if (this.f2925d == null) {
                    return;
                }
                this.f2923b.add(f0Var);
                if (!this.f2922a) {
                    this.f2925d.onNativeToJsMessageAvailable(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d(boolean z4) {
        synchronized (this) {
            try {
                e0 e0Var = this.f2925d;
                if (e0Var == null) {
                    return null;
                }
                e0Var.notifyOfFlush(this, z4);
                if (this.f2923b.isEmpty()) {
                    return null;
                }
                Iterator it = this.f2923b.iterator();
                int i5 = 0;
                int i6 = 0;
                while (it.hasNext()) {
                    int b2 = ((f0) it.next()).b();
                    int length = String.valueOf(b2).length() + b2 + 1;
                    if (i5 > 0 && i6 + length > 16777216) {
                        break;
                    }
                    i6 += length;
                    i5++;
                }
                StringBuilder sb = new StringBuilder(i6);
                for (int i7 = 0; i7 < i5; i7++) {
                    c((f0) this.f2923b.removeFirst(), sb);
                }
                if (!this.f2923b.isEmpty()) {
                    sb.append('*');
                }
                return sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e() {
        synchronized (this) {
            try {
                if (this.f2923b.size() == 0) {
                    return null;
                }
                Iterator it = this.f2923b.iterator();
                int i5 = 0;
                int i6 = 0;
                while (it.hasNext()) {
                    int b2 = ((f0) it.next()).b() + 50;
                    if (i5 > 0 && i6 + b2 > 16777216) {
                        break;
                    }
                    i6 += b2;
                    i5++;
                }
                int i7 = i5 == this.f2923b.size() ? 1 : 0;
                StringBuilder sb = new StringBuilder(i6 + (i7 != 0 ? 0 : 100));
                for (int i8 = 0; i8 < i5; i8++) {
                    f0 f0Var = (f0) this.f2923b.removeFirst();
                    if (i7 == 0 || i8 + 1 != i5) {
                        sb.append("try{");
                        f0Var.d(sb);
                        sb.append("}finally{");
                    } else {
                        f0Var.d(sb);
                    }
                }
                if (i7 == 0) {
                    sb.append("window.setTimeout(function(){cordova.require('cordova/plugin/android/polling').pollOnce();},0);");
                }
                while (i7 < i5) {
                    sb.append('}');
                    i7++;
                }
                return sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(int i5) {
        if (i5 < -1 || i5 >= this.f2924c.size()) {
            return;
        }
        e0 e0Var = i5 < 0 ? null : (e0) this.f2924c.get(i5);
        if (e0Var != this.f2925d) {
            synchronized (this) {
                try {
                    this.f2925d = e0Var;
                    if (e0Var != null) {
                        e0Var.reset();
                        if (!this.f2922a && !this.f2923b.isEmpty()) {
                            e0Var.onNativeToJsMessageAvailable(this);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(boolean z4) {
        e0 e0Var;
        if (this.f2922a && z4) {
            Log.e("JsMessageQueue", "nested call to setPaused detected.", new Throwable());
        }
        this.f2922a = z4;
        if (z4) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f2923b.isEmpty() && (e0Var = this.f2925d) != null) {
                    e0Var.onNativeToJsMessageAvailable(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
