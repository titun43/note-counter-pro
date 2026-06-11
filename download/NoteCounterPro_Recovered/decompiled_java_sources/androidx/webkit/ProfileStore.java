package androidx.webkit;

import j1.b;
import java.util.List;
import k1.h;
import k1.m;
import k1.n;

/* loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (!m.f2422g.b()) {
            throw m.a();
        }
        if (h.f2410b == null) {
            h.f2410b = new h(n.f2424a.getProfileStore());
        }
        return h.f2410b;
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    b getOrCreateProfile(String str);

    b getProfile(String str);
}
