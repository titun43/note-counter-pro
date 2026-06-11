package s2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f3298c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f3299d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f3300a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f3301b;

    public a(Context context) {
        this.f3301b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f3300a;
        reentrantLock.lock();
        try {
            return this.f3301b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
