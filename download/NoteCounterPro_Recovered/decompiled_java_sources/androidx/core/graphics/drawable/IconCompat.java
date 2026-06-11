package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import b0.a;
import b0.e;
import com.google.android.gms.ads.RequestConfiguration;
import f0.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f214k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f215a;

    /* renamed from: b, reason: collision with root package name */
    public Object f216b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f217c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f218d;

    /* renamed from: e, reason: collision with root package name */
    public int f219e;

    /* renamed from: f, reason: collision with root package name */
    public int f220f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f221g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public String f222i;

    /* renamed from: j, reason: collision with root package name */
    public String f223j;

    public IconCompat() {
        this.f215a = -1;
        this.f217c = null;
        this.f218d = null;
        this.f219e = 0;
        this.f220f = 0;
        this.f221g = null;
        this.h = f214k;
        this.f222i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z4) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f5 = min;
        float f6 = 0.5f * f5;
        float f7 = 0.9166667f * f6;
        if (z4) {
            float f8 = 0.010416667f * f5;
            paint.setColor(0);
            paint.setShadowLayer(f8, 0.0f, f5 * 0.020833334f, 1023410176);
            canvas.drawCircle(f6, f6, f7, paint);
            paint.setShadowLayer(f8, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f6, f6, f7, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f6, f6, f7, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f219e = i5;
        iconCompat.f216b = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        iconCompat.f223j = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        return iconCompat;
    }

    public final int c() {
        int i5 = this.f215a;
        if (i5 != -1) {
            if (i5 == 2) {
                return this.f219e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i6 = Build.VERSION.SDK_INT;
        Object obj = this.f216b;
        if (i6 >= 28) {
            return e.f(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        }
    }

    public final int d() {
        int i5 = this.f215a;
        if (i5 != -1) {
            return i5;
        }
        int i6 = Build.VERSION.SDK_INT;
        Object obj = this.f216b;
        if (i6 >= 28) {
            return e.n(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e4);
            return -1;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e5);
            return -1;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e6);
            return -1;
        }
    }

    public final Uri e() {
        int i5 = this.f215a;
        if (i5 != -1) {
            if (i5 == 4 || i5 == 6) {
                return Uri.parse((String) this.f216b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i6 = Build.VERSION.SDK_INT;
        Object obj = this.f216b;
        if (i6 >= 28) {
            return e.o(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        }
    }

    public final Icon f(Context context) {
        Icon createWithBitmap;
        int i5 = Build.VERSION.SDK_INT;
        int i6 = this.f215a;
        String str = null;
        r3 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i6) {
            case -1:
                return (Icon) this.f216b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f216b);
                break;
            case 2:
                if (i6 == -1) {
                    Object obj = this.f216b;
                    if (i5 >= 28) {
                        str = e.g(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                        } catch (NoSuchMethodException e5) {
                            Log.e("IconCompat", "Unable to get icon package", e5);
                        } catch (InvocationTargetException e6) {
                            Log.e("IconCompat", "Unable to get icon package", e6);
                        }
                    }
                } else {
                    if (i6 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str2 = this.f223j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.f216b).split(":", -1)[0] : this.f223j;
                }
                createWithBitmap = Icon.createWithResource(str, this.f219e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f216b, this.f219e, this.f220f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f216b);
                break;
            case 5:
                if (i5 < 26) {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f216b, false));
                    break;
                } else {
                    createWithBitmap = n.a((Bitmap) this.f216b);
                    break;
                }
            case 6:
                if (i5 >= 30) {
                    createWithBitmap = a.b(e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    Uri e7 = e();
                    String scheme = e7.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(e7);
                        } catch (Exception e8) {
                            Log.w("IconCompat", "Unable to load image from URI: " + e7, e8);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.f216b));
                        } catch (FileNotFoundException e9) {
                            Log.w("IconCompat", "Unable to load image from path: " + e7, e9);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = n.a(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.f221g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode != f214k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f215a == -1) {
            return String.valueOf(this.f216b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f215a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f215a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f216b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f216b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f223j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f219e);
                if (this.f220f != 0) {
                    sb.append(" off=");
                    sb.append(this.f220f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f216b);
                break;
        }
        if (this.f221g != null) {
            sb.append(" tint=");
            sb.append(this.f221g);
        }
        if (this.h != f214k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i5) {
        this.f217c = null;
        this.f218d = null;
        this.f219e = 0;
        this.f220f = 0;
        this.f221g = null;
        this.h = f214k;
        this.f222i = null;
        this.f215a = i5;
    }
}
