package r3;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    public static final t2.i f3196i;

    /* renamed from: j, reason: collision with root package name */
    public static final x f3197j;

    /* renamed from: k, reason: collision with root package name */
    public static final x f3198k;

    /* renamed from: l, reason: collision with root package name */
    public static final x f3199l;

    /* renamed from: m, reason: collision with root package name */
    public static final x f3200m;

    /* renamed from: n, reason: collision with root package name */
    public static final x f3201n;

    /* renamed from: o, reason: collision with root package name */
    public static final x f3202o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ x[] f3203p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ z3.b f3204q;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3205g;
    public final List h;

    static {
        int i5 = 1;
        x xVar = new x("INTERNAL_CACHE", 0, u3.h.S("CACHE", "TEMPORARY"), i5);
        f3197j = xVar;
        x xVar2 = new x("INTERNAL_FILES", i5, u3.h.S("DATA", "LIBRARY", "FILES", "LIBRARY_NO_CLOUD"), i5);
        f3198k = xVar2;
        int i6 = 2;
        x xVar3 = new x("EXTERNAL_CACHE", i6, y4.b.y("CACHE_EXTERNAL"), i5);
        f3199l = xVar3;
        x xVar4 = new x("EXTERNAL_FILES", 3, u3.h.S("EXTERNAL", "FILES_EXTERNAL"), i5);
        f3200m = xVar4;
        x xVar5 = new x("EXTERNAL_STORAGE", 4, true, y4.b.y("sdcard"));
        f3201n = xVar5;
        x xVar6 = new x("DOCUMENTS", 5, (List) null, i6);
        f3202o = xVar6;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5, xVar6};
        f3203p = xVarArr;
        f3204q = z2.b.g(xVarArr);
        f3196i = new t2.i(27);
    }

    public x(String str, int i5, boolean z4, List list) {
        this.f3205g = z4;
        this.h = list;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f3203p.clone();
    }

    public /* synthetic */ x(String str, int i5, List list, int i6) {
        this(str, i5, (i6 & 1) == 0, (i6 & 2) != 0 ? u3.o.f3547g : list);
    }
}
