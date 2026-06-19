package y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.emoji2.text.p;
import androidx.fragment.app.o;
import c0.n;
import f0.h1;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.u0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b3.g f3734a;

    /* renamed from: b, reason: collision with root package name */
    public static final o.k f3735b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f3736c;

    static {
        a.a.e("TypefaceCompat static init");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            f3734a = new l();
        } else if (i5 >= 29) {
            f3734a = new k();
        } else if (i5 >= 28) {
            f3734a = new j();
        } else if (i5 >= 26) {
            f3734a = new i();
        } else {
            Method method = h.f3744e;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f3734a = new h();
            } else {
                f3734a = new g();
            }
        }
        f3735b = new o.k(16);
        f3736c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, x.d dVar, Resources resources, int i5, String str, int i6, int i7, u0 u0Var) {
        Typeface h;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i8 = 10;
        if (dVar instanceof x.g) {
            x.g gVar = (x.g) dVar;
            String str2 = gVar.f3674d;
            h = null;
            int i9 = 1;
            int i10 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = gVar.f3671a;
                if (arrayList.size() == 1) {
                    build = c(((c0.e) arrayList.get(0)).f747e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= arrayList.size()) {
                                        break;
                                    }
                                    c0.e eVar = (c0.e) arrayList.get(i12);
                                    if (i12 == arrayList.size() - 1 && TextUtils.isEmpty(eVar.f748f)) {
                                        customFallbackBuilder.setSystemFallback(eVar.f747e);
                                        break;
                                    }
                                    String str3 = eVar.f747e;
                                    String str4 = eVar.f748f;
                                    Font d5 = d(c(str3));
                                    if (d5 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + eVar.f747e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        try {
                                            h1.m();
                                            h1.v();
                                            fontVariationSettings = e.a(d5).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = h1.g(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    } else {
                                        build3 = h1.g(d5).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = h1.c(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i12++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((c0.e) arrayList.get(i11)).f747e) == null) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                new Handler(Looper.getMainLooper()).post(new a2.b(i8, u0Var, build));
                f3735b.put(b(resources, i5, str, i6, i7), build);
                return build;
            }
            boolean z4 = gVar.f3673c == 0;
            int i13 = gVar.f3672b;
            Handler handler = new Handler(Looper.getMainLooper());
            u1.f fVar = new u1.f();
            fVar.h = u0Var;
            ArrayList arrayList2 = gVar.f3671a;
            b0.d dVar2 = new b0.d(handler, 1);
            p pVar = new p(3, fVar, dVar2);
            if (!z4) {
                String a5 = c0.i.a(i7, arrayList2);
                Typeface typeface = (Typeface) c0.i.f759a.get(a5);
                if (typeface != null) {
                    dVar2.execute(new c0.a(i10, fVar, typeface));
                    h = typeface;
                } else {
                    c0.g gVar2 = new c0.g(pVar, i10);
                    synchronized (c0.i.f761c) {
                        try {
                            o.l lVar = c0.i.f762d;
                            ArrayList arrayList3 = (ArrayList) lVar.get(a5);
                            if (arrayList3 != null) {
                                arrayList3.add(gVar2);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(gVar2);
                                lVar.put(a5, arrayList4);
                                c0.f fVar2 = new c0.f(a5, context, arrayList2, i7, 1);
                                ThreadPoolExecutor threadPoolExecutor = c0.i.f760b;
                                c0.g gVar3 = new c0.g(a5, i9);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n(i10);
                                nVar.h = fVar2;
                                nVar.f773i = gVar3;
                                nVar.f774j = handler2;
                                threadPoolExecutor.execute(nVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                c0.e eVar2 = (c0.e) arrayList2.get(0);
                o.k kVar = c0.i.f759a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{eVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a6 = c0.i.a(i7, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) c0.i.f759a.get(a6);
                if (typeface2 != null) {
                    dVar2.execute(new c0.a(i10, fVar, typeface2));
                    h = typeface2;
                } else if (i13 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{eVar2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    c0.h b2 = c0.i.b(a6, context, Collections.unmodifiableList(arrayList6), i7);
                    pVar.C(b2);
                    h = b2.f757a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    c0.h hVar = (c0.h) c0.i.f760b.submit(new c0.f(a6, context, eVar2, i7, 0)).get(i13, TimeUnit.MILLISECONDS);
                                    pVar.C(hVar);
                                    h = hVar.f757a;
                                } catch (ExecutionException e4) {
                                    throw new RuntimeException(e4);
                                }
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e5) {
                            throw e5;
                        }
                    } catch (InterruptedException unused3) {
                        ((b0.d) pVar.f274i).execute(new o((u1.f) pVar.h, -3));
                    }
                }
            }
        } else {
            h = f3734a.h(context, (x.e) dVar, resources, i7);
            if (h != null) {
                new Handler(Looper.getMainLooper()).post(new a2.b(i8, u0Var, h));
            } else {
                u0Var.a();
            }
        }
        if (h != null) {
            f3735b.put(b(resources, i5, str, i6, i7), h);
        }
        return h;
    }

    public static String b(Resources resources, int i5, String str, int i6, int i7) {
        return resources.getResourcePackageName(i5) + '-' + str + '-' + i6 + '-' + i5 + '-' + i7;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (f3736c == null) {
            f3736c = new Paint();
        }
        f3736c.setTextSize(10.0f);
        f3736c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f3736c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
