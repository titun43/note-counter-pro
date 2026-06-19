package c0;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.common.internal.b0;
import j.o;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int f763a;

    /* renamed from: b, reason: collision with root package name */
    public Object f764b;

    public j(y1.e eVar, int i5) {
        this.f764b = eVar;
        this.f763a = i5;
    }

    public Object a() {
        Object[] objArr = (Object[]) this.f764b;
        int i5 = this.f763a;
        if (i5 <= 0) {
            return null;
        }
        int i6 = i5 - 1;
        Object obj = objArr[i6];
        g4.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i6] = null;
        this.f763a--;
        return obj;
    }

    public y1.e b() {
        y1.e eVar = new y1.e();
        eVar.f3832a = this.f763a;
        eVar.f3833b = (String) this.f764b;
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public g.i c() {
        g.e eVar = (g.e) this.f764b;
        g.i iVar = new g.i(eVar.f1503a, this.f763a);
        View view = eVar.f1507e;
        g.h hVar = iVar.f1580l;
        if (view != null) {
            hVar.f1566n = view;
        } else {
            CharSequence charSequence = eVar.f1506d;
            if (charSequence != null) {
                hVar.f1557d = charSequence;
                TextView textView = hVar.f1564l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = eVar.f1505c;
            if (drawable != null) {
                hVar.f1562j = drawable;
                ImageView imageView = hVar.f1563k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    hVar.f1563k.setImageDrawable(drawable);
                }
            }
        }
        if (eVar.f1509g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) eVar.f1504b.inflate(hVar.f1570r, (ViewGroup) null);
            int i5 = eVar.f1510i ? hVar.f1571s : hVar.f1572t;
            Object obj = eVar.f1509g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new g.g(eVar.f1503a, i5, R.id.text1, null);
            }
            hVar.f1567o = r7;
            hVar.f1568p = eVar.f1511j;
            if (eVar.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.d(eVar, hVar));
            }
            if (eVar.f1510i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            hVar.f1558e = alertController$RecycleListView;
        }
        iVar.setCancelable(true);
        iVar.setCanceledOnTouchOutside(true);
        iVar.setOnCancelListener(null);
        iVar.setOnDismissListener(null);
        o oVar = eVar.f1508f;
        if (oVar != null) {
            iVar.setOnKeyListener(oVar);
        }
        return iVar;
    }

    public boolean d(Object obj) {
        Object[] objArr = (Object[]) this.f764b;
        int i5 = this.f763a;
        for (int i6 = 0; i6 < i5; i6++) {
            if (objArr[i6] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i7 = this.f763a;
        if (i7 >= objArr.length) {
            return false;
        }
        objArr[i7] = obj;
        this.f763a = i7 + 1;
        return true;
    }

    public j(t2.b bVar, int i5) {
        b0.g(bVar);
        this.f764b = bVar;
        this.f763a = i5;
    }

    public j(int i5) {
        if (i5 > 0) {
            this.f764b = new Object[i5];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public j(Context context) {
        int e4 = g.i.e(context, 0);
        this.f764b = new g.e(new ContextThemeWrapper(context, g.i.e(context, e4)));
        this.f763a = e4;
    }
}
