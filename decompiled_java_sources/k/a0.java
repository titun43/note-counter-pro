package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class a0 extends ImageView {

    /* renamed from: g, reason: collision with root package name */
    public final q f2025g;
    public final i3.a h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2026i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        t2.a(context);
        this.f2026i = false;
        s2.a(this, getContext());
        q qVar = new q(this);
        this.f2025g = qVar;
        qVar.d(attributeSet, i5);
        i3.a aVar = new i3.a(this);
        this.h = aVar;
        aVar.c(attributeSet, i5);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f2025g;
        if (qVar != null) {
            qVar.a();
        }
        i3.a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f2025g;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f2025g;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        u2 u2Var;
        i3.a aVar = this.h;
        if (aVar == null || (u2Var = (u2) aVar.f1857c) == null) {
            return null;
        }
        return u2Var.f2249a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        u2 u2Var;
        i3.a aVar = this.h;
        if (aVar == null || (u2Var = (u2) aVar.f1857c) == null) {
            return null;
        }
        return u2Var.f2250b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.h.f1856b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f2025g;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        q qVar = this.f2025g;
        if (qVar != null) {
            qVar.f(i5);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        i3.a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        i3.a aVar = this.h;
        if (aVar != null && drawable != null && !this.f2026i) {
            aVar.f1855a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (aVar != null) {
            aVar.a();
            if (this.f2026i) {
                return;
            }
            ImageView imageView = (ImageView) aVar.f1856b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(aVar.f1855a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i5) {
        super.setImageLevel(i5);
        this.f2026i = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i5) {
        i3.a aVar = this.h;
        if (aVar != null) {
            ImageView imageView = (ImageView) aVar.f1856b;
            if (i5 != 0) {
                Drawable t5 = b3.g.t(imageView.getContext(), i5);
                if (t5 != null) {
                    n1.a(t5);
                }
                imageView.setImageDrawable(t5);
            } else {
                imageView.setImageDrawable(null);
            }
            aVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        i3.a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f2025g;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2025g;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        i3.a aVar = this.h;
        if (aVar != null) {
            if (((u2) aVar.f1857c) == null) {
                aVar.f1857c = new u2();
            }
            u2 u2Var = (u2) aVar.f1857c;
            u2Var.f2249a = colorStateList;
            u2Var.f2252d = true;
            aVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        i3.a aVar = this.h;
        if (aVar != null) {
            if (((u2) aVar.f1857c) == null) {
                aVar.f1857c = new u2();
            }
            u2 u2Var = (u2) aVar.f1857c;
            u2Var.f2250b = mode;
            u2Var.f2251c = true;
            aVar.a();
        }
    }
}
