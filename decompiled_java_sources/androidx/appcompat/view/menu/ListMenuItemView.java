package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.emoji2.text.t;
import com.google.android.gms.ads.RequestConfiguration;
import com.lokhnathtechnical.notecounterpro.R;
import f.a;
import j.a0;
import j.n;
import j.p;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements a0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: g, reason: collision with root package name */
    public p f84g;
    public ImageView h;

    /* renamed from: i, reason: collision with root package name */
    public RadioButton f85i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f86j;

    /* renamed from: k, reason: collision with root package name */
    public CheckBox f87k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f88l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f89m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f90n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f91o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f92p;

    /* renamed from: q, reason: collision with root package name */
    public final int f93q;

    /* renamed from: r, reason: collision with root package name */
    public final Context f94r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f95s;

    /* renamed from: t, reason: collision with root package name */
    public final Drawable f96t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f97u;

    /* renamed from: v, reason: collision with root package name */
    public LayoutInflater f98v;
    public boolean w;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t r2 = t.r(getContext(), attributeSet, a.f1326r, R.attr.listMenuViewStyle);
        this.f92p = r2.l(5);
        TypedArray typedArray = (TypedArray) r2.f284i;
        this.f93q = typedArray.getResourceId(1, -1);
        this.f95s = typedArray.getBoolean(7, false);
        this.f94r = context;
        this.f96t = r2.l(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f97u = obtainStyledAttributes.hasValue(0);
        r2.u();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f98v == null) {
            this.f98v = LayoutInflater.from(getContext());
        }
        return this.f98v;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f89m;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f90n;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f90n.getLayoutParams();
        rect.top = this.f90n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // j.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(p pVar) {
        boolean z4;
        String sb;
        boolean z5;
        this.f84g = pVar;
        boolean isVisible = pVar.isVisible();
        n nVar = pVar.f1979n;
        int i5 = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(pVar.f1971e);
        setCheckable(pVar.isCheckable());
        if (nVar.o()) {
            if ((nVar.n() ? pVar.f1975j : pVar.h) != 0) {
                z4 = true;
                nVar.n();
                if (z4) {
                    p pVar2 = this.f84g;
                    n nVar2 = pVar2.f1979n;
                    if (nVar2.o()) {
                        if ((nVar2.n() ? pVar2.f1975j : pVar2.h) != 0) {
                            z5 = true;
                        }
                    }
                    z5 = false;
                }
                i5 = 8;
                if (i5 == 0) {
                    TextView textView = this.f88l;
                    p pVar3 = this.f84g;
                    n nVar3 = pVar3.f1979n;
                    Context context = nVar3.f1943a;
                    char c5 = nVar3.n() ? pVar3.f1975j : pVar3.h;
                    if (c5 == 0) {
                        sb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i6 = nVar3.n() ? pVar3.f1976k : pVar3.f1974i;
                        p.c(sb2, i6, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        p.c(sb2, i6, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        p.c(sb2, i6, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        p.c(sb2, i6, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        p.c(sb2, i6, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        p.c(sb2, i6, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c5 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c5 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c5 != ' ') {
                            sb2.append(c5);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f88l.getVisibility() != i5) {
                    this.f88l.setVisibility(i5);
                }
                setIcon(pVar.getIcon());
                setEnabled(pVar.isEnabled());
                setSubMenuArrowVisible(pVar.hasSubMenu());
                setContentDescription(pVar.f1982q);
            }
        }
        z4 = false;
        nVar.n();
        if (z4) {
        }
        i5 = 8;
        if (i5 == 0) {
        }
        if (this.f88l.getVisibility() != i5) {
        }
        setIcon(pVar.getIcon());
        setEnabled(pVar.isEnabled());
        setSubMenuArrowVisible(pVar.hasSubMenu());
        setContentDescription(pVar.f1982q);
    }

    @Override // j.a0
    public p getItemData() {
        return this.f84g;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f92p);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f86j = textView;
        int i5 = this.f93q;
        if (i5 != -1) {
            textView.setTextAppearance(this.f94r, i5);
        }
        this.f88l = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f89m = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f96t);
        }
        this.f90n = (ImageView) findViewById(R.id.group_divider);
        this.f91o = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        if (this.h != null && this.f95s) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.h.getLayoutParams();
            int i7 = layoutParams.height;
            if (i7 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i7;
            }
        }
        super.onMeasure(i5, i6);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f85i == null && this.f87k == null) {
            return;
        }
        if ((this.f84g.f1988x & 4) != 0) {
            if (this.f85i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f85i = radioButton;
                LinearLayout linearLayout = this.f91o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f85i;
            view = this.f87k;
        } else {
            if (this.f87k == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f87k = checkBox;
                LinearLayout linearLayout2 = this.f91o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f87k;
            view = this.f85i;
        }
        if (z4) {
            compoundButton.setChecked(this.f84g.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f87k;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f85i;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f84g.f1988x & 4) != 0) {
            if (this.f85i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f85i = radioButton;
                LinearLayout linearLayout = this.f91o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f85i;
        } else {
            if (this.f87k == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f87k = checkBox;
                LinearLayout linearLayout2 = this.f91o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f87k;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.w = z4;
        this.f95s = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f90n;
        if (imageView != null) {
            imageView.setVisibility((this.f97u || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        n nVar = this.f84g.f1979n;
        boolean z4 = this.w;
        if (z4 || this.f95s) {
            ImageView imageView = this.h;
            if (imageView == null && drawable == null && !this.f95s) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.h = imageView2;
                LinearLayout linearLayout = this.f91o;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f95s) {
                this.h.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.h;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f86j.getVisibility() != 8) {
                this.f86j.setVisibility(8);
            }
        } else {
            this.f86j.setText(charSequence);
            if (this.f86j.getVisibility() != 0) {
                this.f86j.setVisibility(0);
            }
        }
    }
}
