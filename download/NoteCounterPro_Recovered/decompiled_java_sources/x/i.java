package x;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f3678a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f3679b;

    public i(Resources resources, Resources.Theme theme) {
        this.f3678a = resources;
        this.f3679b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f3678a.equals(iVar.f3678a) && Objects.equals(this.f3679b, iVar.f3679b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3678a, this.f3679b);
    }
}
