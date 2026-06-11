package f0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class g1 extends f1 {
    public g1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var, windowInsets);
    }

    @Override // f0.m1
    public q1 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f1358c.consumeDisplayCutout();
        return q1.g(consumeDisplayCutout, null);
    }

    @Override // f0.m1
    public i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f1358c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    @Override // f0.e1, f0.m1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Objects.equals(this.f1358c, g1Var.f1358c) && Objects.equals(this.f1362g, g1Var.f1362g) && e1.A(this.h, g1Var.h);
    }

    @Override // f0.m1
    public int hashCode() {
        return this.f1358c.hashCode();
    }
}
