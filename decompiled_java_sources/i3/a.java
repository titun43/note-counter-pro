package i3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.emoji2.text.t;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzdb;
import f0.r0;
import java.util.ArrayList;
import k.n1;
import k.u2;
import k.v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1855a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1856b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1857c;

    public a(int i5, String str, ArrayList arrayList) {
        this.f1855a = i5;
        this.f1857c = str;
        this.f1856b = arrayList;
    }

    public void a() {
        u2 u2Var;
        ImageView imageView = (ImageView) this.f1856b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            n1.a(drawable);
        }
        if (drawable == null || (u2Var = (u2) this.f1857c) == null) {
            return;
        }
        v.d(drawable, u2Var, imageView.getDrawableState());
    }

    public b b() {
        boolean z4 = true;
        if (!zzdb.zza(true) && !((ArrayList) this.f1856b).contains(zzct.zza((Context) this.f1857c))) {
            z4 = false;
        }
        return new b(z4, this);
    }

    public void c(AttributeSet attributeSet, int i5) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1856b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f1315f;
        t r2 = t.r(context, attributeSet, iArr, i5);
        TypedArray typedArray = (TypedArray) r2.f284i;
        r0.h(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) r2.f284i, i5, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = b3.g.t(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                n1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(r2.k(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(n1.b(typedArray.getInt(3, -1), null));
            }
            r2.u();
        } catch (Throwable th) {
            r2.u();
            throw th;
        }
    }

    public a(Context context) {
        this.f1856b = new ArrayList();
        this.f1855a = 0;
        this.f1857c = context.getApplicationContext();
    }

    public a(ImageView imageView) {
        this.f1855a = 0;
        this.f1856b = imageView;
    }
}
