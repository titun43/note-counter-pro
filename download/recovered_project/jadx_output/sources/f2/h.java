package f2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.lokhnathtechnical.notecounterpro.R;
import java.io.Serializable;
import java.util.HashMap;
import k.n2;
import k.s2;
import k.v;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f1459a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f1460b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1461c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f1462d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f1463e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1464f;

    public static boolean b(int[] iArr, int i5) {
        for (int i6 : iArr) {
            if (i6 == i5) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i5) {
        int c5 = s2.c(context, R.attr.colorControlHighlight);
        int b2 = s2.b(context, R.attr.colorButtonNormal);
        int[] iArr = s2.f2218b;
        int[] iArr2 = s2.f2220d;
        int b5 = y.a.b(c5, i5);
        return new ColorStateList(new int[][]{iArr, iArr2, s2.f2219c, s2.f2222f}, new int[]{b2, b5, y.a.b(c5, i5), i5});
    }

    public static LayerDrawable e(n2 n2Var, Context context, int i5) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i5);
        Drawable c5 = n2Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c6 = n2Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c5 instanceof BitmapDrawable) && c5.getIntrinsicWidth() == dimensionPixelSize && c5.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c5;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c5.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c6 instanceof BitmapDrawable) && c6.getIntrinsicWidth() == dimensionPixelSize && c6.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c6;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c6.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c6.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void g(Drawable drawable, int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter e4;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = v.f2253b;
        }
        PorterDuff.Mode mode2 = v.f2253b;
        synchronized (v.class) {
            e4 = n2.e(i5, mode);
        }
        mutate.setColorFilter(e4);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f1464f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public i c() {
        String str = ((String) this.f1459a) == null ? " transportName" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (((n) this.f1461c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f1462d) == null) {
            str = u.j(str, " eventMillis");
        }
        if (((Long) this.f1463e) == null) {
            str = u.j(str, " uptimeMillis");
        }
        if (((HashMap) this.f1464f) == null) {
            str = u.j(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new i((String) this.f1459a, (Integer) this.f1460b, (n) this.f1461c, ((Long) this.f1462d).longValue(), ((Long) this.f1463e).longValue(), (HashMap) this.f1464f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ColorStateList f(Context context, int i5) {
        if (i5 == R.drawable.abc_edit_text_material) {
            return v.a.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i5 == R.drawable.abc_switch_track_mtrl_alpha) {
            return v.a.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i5 != R.drawable.abc_switch_thumb_material) {
            if (i5 == R.drawable.abc_btn_default_mtrl_shape) {
                return d(context, s2.c(context, R.attr.colorButtonNormal));
            }
            if (i5 == R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i5 == R.drawable.abc_btn_colored_material) {
                return d(context, s2.c(context, R.attr.colorAccent));
            }
            if (i5 == R.drawable.abc_spinner_mtrl_am_alpha || i5 == R.drawable.abc_spinner_textfield_background_material) {
                return v.a.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.f1460b, i5)) {
                return s2.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.f1463e, i5)) {
                return v.a.getColorStateList(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f1464f, i5)) {
                return v.a.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i5 == R.drawable.abc_seekbar_thumb_material) {
                return v.a.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d5 = s2.d(context, R.attr.colorSwitchThumbNormal);
        if (d5 == null || !d5.isStateful()) {
            iArr[0] = s2.f2218b;
            iArr2[0] = s2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = s2.f2221e;
            iArr2[1] = s2.c(context, R.attr.colorControlActivated);
            iArr[2] = s2.f2222f;
            iArr2[2] = s2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = s2.f2218b;
            iArr[0] = iArr3;
            iArr2[0] = d5.getColorForState(iArr3, 0);
            iArr[1] = s2.f2221e;
            iArr2[1] = s2.c(context, R.attr.colorControlActivated);
            iArr[2] = s2.f2222f;
            iArr2[2] = d5.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
