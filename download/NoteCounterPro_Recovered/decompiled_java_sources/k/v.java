package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2253b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static v f2254c;

    /* renamed from: a, reason: collision with root package name */
    public n2 f2255a;

    public static synchronized v a() {
        v vVar;
        synchronized (v.class) {
            try {
                if (f2254c == null) {
                    c();
                }
                vVar = f2254c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int[], java.io.Serializable] */
    public static synchronized void c() {
        synchronized (v.class) {
            if (f2254c == null) {
                v vVar = new v();
                f2254c = vVar;
                vVar.f2255a = n2.b();
                n2 n2Var = f2254c.f2255a;
                f2.h hVar = new f2.h();
                hVar.f1459a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                hVar.f1460b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                hVar.f1461c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                hVar.f1462d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                hVar.f1463e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                hVar.f1464f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (n2Var) {
                    n2Var.f2179e = hVar;
                }
            }
        }
    }

    public static void d(Drawable drawable, u2 u2Var, int[] iArr) {
        PorterDuff.Mode mode = n2.f2173f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = u2Var.f2252d;
        if (!z4 && !u2Var.f2251c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z4 ? u2Var.f2249a : null;
        PorterDuff.Mode mode2 = u2Var.f2251c ? u2Var.f2250b : n2.f2173f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = n2.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i5) {
        return this.f2255a.c(context, i5);
    }
}
