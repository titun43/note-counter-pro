package org.apache.cordova;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2913a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f2914b;

    public f0(String str) {
        str.getClass();
        this.f2913a = str;
        this.f2914b = null;
    }

    public static int c(l0 l0Var) {
        int i5 = l0Var.f2944b;
        ArrayList arrayList = l0Var.f2948f;
        switch (i5) {
            case 1:
                return l0Var.f2946d.length() + 1;
            case 2:
            default:
                return l0Var.a().length();
            case 3:
                return l0Var.a().length() + 1;
            case 4:
            case 5:
                return 1;
            case 6:
                return l0Var.a().length() + 1;
            case 7:
                return l0Var.a().length() + 1;
            case 8:
                int i6 = 1;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    int c5 = c((l0) arrayList.get(i7));
                    i6 += String.valueOf(c5).length() + 1 + c5;
                }
                return i6;
        }
    }

    public static void e(StringBuilder sb, l0 l0Var) {
        int i5 = l0Var.f2944b;
        ArrayList arrayList = l0Var.f2948f;
        switch (i5) {
            case 1:
                sb.append('s');
                sb.append(l0Var.f2946d);
                break;
            case 2:
            default:
                sb.append(l0Var.a());
                break;
            case 3:
                sb.append('n');
                sb.append(l0Var.a());
                break;
            case 4:
                sb.append(l0Var.a().charAt(0));
                break;
            case 5:
                sb.append('N');
                break;
            case 6:
                sb.append('A');
                sb.append(l0Var.a());
                break;
            case 7:
                sb.append('S');
                sb.append(l0Var.a());
                break;
            case 8:
                sb.append('M');
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    l0 l0Var2 = (l0) arrayList.get(i6);
                    sb.append(String.valueOf(c(l0Var2)));
                    sb.append(' ');
                    e(sb, l0Var2);
                }
                break;
        }
    }

    public final void a(StringBuilder sb) {
        l0 l0Var = this.f2914b;
        int i5 = l0Var.f2944b;
        ArrayList arrayList = l0Var.f2948f;
        if (i5 == 5) {
            sb.append("null");
            return;
        }
        if (i5 == 6) {
            sb.append("cordova.require('cordova/base64').toArrayBuffer('");
            sb.append(l0Var.a());
            sb.append("')");
            return;
        }
        if (i5 == 7) {
            sb.append("atob('");
            sb.append(l0Var.a());
            sb.append("')");
        } else {
            if (i5 != 8) {
                sb.append(l0Var.a());
                return;
            }
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                new f0((l0) arrayList.get(i6), this.f2913a).a(sb);
                if (i6 < size - 1) {
                    sb.append(",");
                }
            }
        }
    }

    public final int b() {
        String str = this.f2913a;
        l0 l0Var = this.f2914b;
        if (l0Var == null) {
            return str.length() + 1;
        }
        return c(l0Var) + androidx.emoji2.text.u.e(str, androidx.emoji2.text.u.b(l0Var.f2943a, 3), 1);
    }

    public final void d(StringBuilder sb) {
        String str = this.f2913a;
        l0 l0Var = this.f2914b;
        if (l0Var == null) {
            sb.append(str);
            return;
        }
        int i5 = l0Var.f2943a;
        boolean z4 = true;
        if (i5 != 1 && i5 != 0) {
            z4 = false;
        }
        sb.append("cordova.callbackFromNative('");
        sb.append(str);
        sb.append("',");
        sb.append(z4);
        sb.append(",");
        sb.append(i5);
        sb.append(",[");
        a(sb);
        sb.append("],");
        sb.append(l0Var.f2945c);
        sb.append(");");
    }

    public f0(l0 l0Var, String str) {
        if (str != null && l0Var != null) {
            this.f2913a = str;
            this.f2914b = l0Var;
            return;
        }
        throw null;
    }
}
