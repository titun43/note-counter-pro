package x;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: k, reason: collision with root package name */
    public static final l f3683k;

    /* renamed from: a, reason: collision with root package name */
    public final float f3684a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3685b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3686c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3687d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3688e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3689f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3690g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3691i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3692j;

    static {
        float[] fArr = b.f3658c;
        float f5 = (float) ((b.f() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f3656a;
        float f6 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f7 = fArr3[0] * f6;
        float f8 = fArr[1];
        float f9 = (fArr3[1] * f8) + f7;
        float f10 = fArr[2];
        float f11 = (fArr3[2] * f10) + f9;
        float[] fArr4 = fArr2[1];
        float f12 = (fArr4[2] * f10) + (fArr4[1] * f8) + (fArr4[0] * f6);
        float[] fArr5 = fArr2[2];
        float f13 = (f10 * fArr5[2]) + (f8 * fArr5[1]) + (f6 * fArr5[0]);
        float f14 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-f5) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = exp;
        if (d5 > 1.0d) {
            exp = 1.0f;
        } else if (d5 < 0.0d) {
            exp = 0.0f;
        }
        float f15 = 1.0f / ((5.0f * f5) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float cbrt = (0.1f * f17 * f17 * ((float) Math.cbrt(f5 * 5.0d))) + (f16 * f5);
        float f18 = b.f() / fArr[1];
        double d6 = f18;
        float sqrt = ((float) Math.sqrt(d6)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d6, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f11) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f13) / 100.0d, 0.42d)};
        float f19 = fArr6[0];
        float f20 = (f19 * 400.0f) / (f19 + 27.13f);
        float f21 = fArr6[1];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr6[2];
        float[] fArr7 = {f20, f22, (400.0f * f23) / (f23 + 27.13f)};
        f3683k = new l(f18, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f14, 1.0f, new float[]{(((100.0f / f11) * exp) + 1.0f) - exp, (((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public l(float f5, float f6, float f7, float f8, float f9, float f10, float[] fArr, float f11, float f12, float f13) {
        this.f3689f = f5;
        this.f3684a = f6;
        this.f3685b = f7;
        this.f3686c = f8;
        this.f3687d = f9;
        this.f3688e = f10;
        this.f3690g = fArr;
        this.h = f11;
        this.f3691i = f12;
        this.f3692j = f13;
    }
}
