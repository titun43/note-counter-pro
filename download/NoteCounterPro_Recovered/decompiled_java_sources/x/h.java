package x;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f3675a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f3676b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3677c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f3675a = colorStateList;
        this.f3676b = configuration;
        this.f3677c = theme == null ? 0 : theme.hashCode();
    }
}
