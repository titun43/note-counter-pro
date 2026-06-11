package k;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2039d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2040a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f2041b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2042c;

    public /* synthetic */ d0() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((androidx.emoji2.text.p) ((k1.j) this.f2042c).h).getClass();
        if (keyListener instanceof n0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new n0.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i5) {
        switch (this.f2040a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2041b;
                androidx.emoji2.text.t r2 = androidx.emoji2.text.t.r(absSeekBar.getContext(), attributeSet, f2039d, i5);
                Drawable m5 = r2.m(0);
                if (m5 != null) {
                    if (m5 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) m5;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i6 = 0; i6 < numberOfFrames; i6++) {
                            Drawable e4 = e(animationDrawable.getFrame(i6), true);
                            e4.setLevel(10000);
                            animationDrawable2.addFrame(e4, animationDrawable.getDuration(i6));
                        }
                        animationDrawable2.setLevel(10000);
                        m5 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(m5);
                }
                Drawable m6 = r2.m(1);
                if (m6 != null) {
                    absSeekBar.setProgressDrawable(e(m6, false));
                }
                r2.u();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f2041b).getContext().obtainStyledAttributes(attributeSet, f.a.f1317i, i5, 0);
                try {
                    boolean z4 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z4);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public n0.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        k1.j jVar = (k1.j) this.f2042c;
        if (inputConnection == null) {
            jVar.getClass();
            inputConnection = null;
        } else {
            androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) jVar.h;
            pVar.getClass();
            if (!(inputConnection instanceof n0.b)) {
                inputConnection = new n0.b((EditText) pVar.h, inputConnection, editorInfo);
            }
        }
        return (n0.b) inputConnection;
    }

    public void d(boolean z4) {
        n0.i iVar = (n0.i) ((androidx.emoji2.text.p) ((k1.j) this.f2042c).h).f274i;
        if (iVar.f2657i != z4) {
            if (iVar.h != null) {
                androidx.emoji2.text.l a5 = androidx.emoji2.text.l.a();
                n0.h hVar = iVar.h;
                a5.getClass();
                y4.b.g(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a5.f263a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a5.f264b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f2657i = z4;
            if (z4) {
                n0.i.a(iVar.f2656g, androidx.emoji2.text.l.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z4) {
        if (drawable instanceof z.a) {
            ((z.b) ((z.a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    int id = layerDrawable.getId(i5);
                    drawableArr[i5] = e(layerDrawable.getDrawable(i5), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i6 = 0; i6 < numberOfLayers; i6++) {
                    layerDrawable2.setId(i6, layerDrawable.getId(i6));
                    layerDrawable2.setLayerGravity(i6, layerDrawable.getLayerGravity(i6));
                    layerDrawable2.setLayerWidth(i6, layerDrawable.getLayerWidth(i6));
                    layerDrawable2.setLayerHeight(i6, layerDrawable.getLayerHeight(i6));
                    layerDrawable2.setLayerInsetLeft(i6, layerDrawable.getLayerInsetLeft(i6));
                    layerDrawable2.setLayerInsetRight(i6, layerDrawable.getLayerInsetRight(i6));
                    layerDrawable2.setLayerInsetTop(i6, layerDrawable.getLayerInsetTop(i6));
                    layerDrawable2.setLayerInsetBottom(i6, layerDrawable.getLayerInsetBottom(i6));
                    layerDrawable2.setLayerInsetStart(i6, layerDrawable.getLayerInsetStart(i6));
                    layerDrawable2.setLayerInsetEnd(i6, layerDrawable.getLayerInsetEnd(i6));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f2042c) == null) {
                    this.f2042c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public d0(AbsSeekBar absSeekBar) {
        this.f2041b = absSeekBar;
    }

    public d0(EditText editText) {
        this.f2041b = editText;
        this.f2042c = new k1.j(editText);
    }
}
