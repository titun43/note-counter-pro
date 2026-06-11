package n0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends a.a {

    /* renamed from: m, reason: collision with root package name */
    public final TextView f2651m;

    /* renamed from: n, reason: collision with root package name */
    public final d f2652n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2653o = true;

    public f(TextView textView) {
        this.f2651m = textView;
        this.f2652n = new d(textView);
    }

    public final void A() {
        TextView textView = this.f2651m;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f2653o) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f2658g;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // a.a
    public final InputFilter[] k(InputFilter[] inputFilterArr) {
        if (!this.f2653o) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i5 = 0; i5 < inputFilterArr.length; i5++) {
                InputFilter inputFilter = inputFilterArr[i5];
                if (inputFilter instanceof d) {
                    sparseArray.put(i5, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                if (sparseArray.indexOfKey(i7) < 0) {
                    inputFilterArr2[i6] = inputFilterArr[i7];
                    i6++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i8 = 0;
        while (true) {
            d dVar = this.f2652n;
            if (i8 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i8] == dVar) {
                return inputFilterArr;
            }
            i8++;
        }
    }

    @Override // a.a
    public final void t(boolean z4) {
        if (z4) {
            A();
        }
    }

    @Override // a.a
    public final void w(boolean z4) {
        this.f2653o = z4;
        A();
        TextView textView = this.f2651m;
        textView.setFilters(k(textView.getFilters()));
    }
}
