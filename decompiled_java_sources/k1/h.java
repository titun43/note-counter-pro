package k1;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* loaded from: classes.dex */
public final class h implements ProfileStore {

    /* renamed from: b, reason: collision with root package name */
    public static h f2410b;

    /* renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f2411a;

    public h(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f2411a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (m.f2422g.b()) {
            return this.f2411a.deleteProfile(str);
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (m.f2422g.b()) {
            return this.f2411a.getAllProfileNames();
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final j1.b getOrCreateProfile(String str) {
        if (m.f2422g.b()) {
            return new u1.f((ProfileBoundaryInterface) y4.b.f(ProfileBoundaryInterface.class, this.f2411a.getOrCreateProfile(str)), 14);
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final j1.b getProfile(String str) {
        if (!m.f2422g.b()) {
            throw m.a();
        }
        InvocationHandler profile = this.f2411a.getProfile(str);
        if (profile != null) {
            return new u1.f((ProfileBoundaryInterface) y4.b.f(ProfileBoundaryInterface.class, profile), 14);
        }
        return null;
    }
}
