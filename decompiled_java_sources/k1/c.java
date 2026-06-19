package k1;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f2404c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f2405a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2406b;

    public c(String str, String str2) {
        this.f2405a = str;
        this.f2406b = str2;
        f2404c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f2402a;
        String str = this.f2406b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
