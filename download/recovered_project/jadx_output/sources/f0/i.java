package f0;

import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f1378a;

    public i(DisplayCutout displayCutout) {
        this.f1378a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f1378a, ((i) obj).f1378a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f1378a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1378a + "}";
    }
}
