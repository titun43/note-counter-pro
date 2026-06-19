package y;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class k extends b3.g {
    public static Font B(FontFamily fontFamily, int i5) {
        FontStyle fontStyle = new FontStyle((i5 & 1) != 0 ? 700 : 400, (i5 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int E = E(fontStyle, font.getStyle());
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font font2 = fontFamily.getFont(i6);
            int E2 = E(fontStyle, font2.getStyle());
            if (E2 < E) {
                font = font2;
                E = E2;
            }
        }
        return font;
    }

    public static int E(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily C(c0.k[] kVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (c0.k kVar : kVarArr) {
            if (Objects.equals(kVar.f765a.getScheme(), "systemfont")) {
                font = D(kVar);
            } else {
                try {
                    Uri uri = kVar.f765a;
                    str = kVar.f769e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e4) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(kVar.f767c).setSlant(kVar.f768d ? 1 : 0).setTtcIndex(kVar.f766b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font D(c0.k kVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // b3.g
    public final Typeface h(Context context, x.e eVar, Resources resources, int i5) {
        try {
            FontFamily.Builder builder = null;
            for (x.f fVar : eVar.f3664a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f3670f).setWeight(fVar.f3666b).setSlant(fVar.f3667c ? 1 : 0).setTtcIndex(fVar.f3669e).setFontVariationSettings(fVar.f3668d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(B(build2, i5).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // b3.g
    public final Typeface i(Context context, c0.k[] kVarArr, int i5) {
        try {
            FontFamily C = C(kVarArr, context.getContentResolver());
            if (C == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(C).setStyle(B(C, i5).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // b3.g
    public final Typeface j(Context context, List list, int i5) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily C = C((c0.k[]) list.get(0), contentResolver);
            if (C == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(C);
            for (int i6 = 1; i6 < list.size(); i6++) {
                FontFamily C2 = C((c0.k[]) list.get(i6), contentResolver);
                if (C2 != null) {
                    customFallbackBuilder.addCustomFallback(C2);
                }
            }
            return customFallbackBuilder.setStyle(B(C, i5).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // b3.g
    public final Typeface k(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // b3.g
    public final Typeface l(Context context, Resources resources, int i5, String str, int i6) {
        try {
            Font build = new Font.Builder(resources, i5).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // b3.g
    public final c0.k s(c0.k[] kVarArr, int i5) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
