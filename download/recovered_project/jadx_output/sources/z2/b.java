package z2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import androidx.work.d;
import androidx.work.e;
import androidx.work.n;
import androidx.work.o;
import i0.i;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import k.d1;
import k.e3;
import k.g3;
import l1.k;
import w3.f;
import w3.g;
import w3.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f3941a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f3942b;

    public static int A(int i5) {
        int c5 = h1.c(i5);
        if (c5 == 0) {
            return 0;
        }
        int i6 = 1;
        if (c5 != 1) {
            i6 = 2;
            if (c5 != 2) {
                i6 = 3;
                if (c5 != 3) {
                    i6 = 4;
                    if (c5 != 4) {
                        if (c5 == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + u.B(i5) + " to int");
                    }
                }
            }
        }
        return i6;
    }

    public static int B(Context context, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i5});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static ActionMode.Callback C(ActionMode.Callback callback) {
        return (!(callback instanceof i) || Build.VERSION.SDK_INT < 26) ? callback : ((i) callback).f1816a;
    }

    public static ActionMode.Callback D(ActionMode.Callback callback, TextView textView) {
        int i5 = Build.VERSION.SDK_INT;
        return (i5 < 26 || i5 > 27 || (callback instanceof i) || callback == null) ? callback : new i(callback, textView);
    }

    public static void E(Parcel parcel, int i5, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int O = O(parcel, i5);
        parcel.writeBundle(bundle);
        P(parcel, O);
    }

    public static void F(Parcel parcel, int i5, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int O = O(parcel, i5);
        parcel.writeByteArray(bArr);
        P(parcel, O);
    }

    public static void G(Parcel parcel, int i5, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int O = O(parcel, i5);
        parcel.writeStrongBinder(iBinder);
        P(parcel, O);
    }

    public static void H(Parcel parcel, int i5, Parcelable parcelable, int i6) {
        if (parcelable == null) {
            return;
        }
        int O = O(parcel, i5);
        parcelable.writeToParcel(parcel, i6);
        P(parcel, O);
    }

    public static void I(Parcel parcel, int i5, String str) {
        if (str == null) {
            return;
        }
        int O = O(parcel, i5);
        parcel.writeString(str);
        P(parcel, O);
    }

    public static void J(Parcel parcel, int i5, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int O = O(parcel, i5);
        parcel.writeStringArray(strArr);
        P(parcel, O);
    }

    public static void K(Parcel parcel, int i5, List list) {
        if (list == null) {
            return;
        }
        int O = O(parcel, i5);
        parcel.writeStringList(list);
        P(parcel, O);
    }

    public static void L(Parcel parcel, int i5, Parcelable[] parcelableArr, int i6) {
        if (parcelableArr == null) {
            return;
        }
        int O = O(parcel, i5);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i6);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        P(parcel, O);
    }

    public static void M(Parcel parcel, int i5, List list) {
        if (list == null) {
            return;
        }
        int O = O(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            Parcelable parcelable = (Parcelable) list.get(i6);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        P(parcel, O);
    }

    public static void N(Parcel parcel, int i5, int i6) {
        parcel.writeInt(i5 | (i6 << 16));
    }

    public static int O(Parcel parcel, int i5) {
        parcel.writeInt(i5 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void P(Parcel parcel, int i5) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i5 - 4);
        parcel.writeInt(dataPosition - i5);
        parcel.setDataPosition(dataPosition);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(byte[] bArr) {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e4;
        e eVar = new e();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                            eVar.f632a.add(new d(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                        }
                    } catch (IOException e5) {
                        e4 = e5;
                        e4.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e8) {
                objectInputStream = null;
                e4 = e8;
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                }
                byteArrayInputStream.close();
                throw th;
            }
            try {
                objectInputStream.close();
            } catch (IOException e9) {
                e9.printStackTrace();
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return eVar;
    }

    public static final long e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static final z3.b g(Enum[] enumArr) {
        g4.i.e(enumArr, "entries");
        return new z3.b(enumArr);
    }

    public static r3.e h(String str) {
        if (str == null || n4.i.X(str)) {
            r3.d dVar = r3.e.f3178a;
            return r3.c.f3171b;
        }
        try {
            Charset forName = Charset.forName(str);
            g4.i.d(forName, "forName(...)");
            return new r3.d(forName);
        } catch (Exception unused) {
            return r3.e.f3178a;
        }
    }

    public static int i(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class j(l4.b bVar) {
        g4.i.e(bVar, "<this>");
        Class a5 = ((g4.d) bVar).a();
        if (a5.isPrimitive()) {
            String name = a5.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a5;
    }

    public static d0.a k(d1 d1Var) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            return new d0.a(b0.e.m(d1Var));
        }
        TextPaint textPaint = new TextPaint(d1Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = d1Var.getBreakStrategy();
        int hyphenationFrequency = d1Var.getHyphenationFrequency();
        if (d1Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i5 < 28 || (d1Var.getInputType() & 15) != 3) {
                boolean z4 = d1Var.getLayoutDirection() == 1;
                switch (d1Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z4) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(b0.e.c(DecimalFormatSymbols.getInstance(d1Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new d0.a(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int l(int i5) {
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 4) {
            return 2;
        }
        if (i5 == 8) {
            return 3;
        }
        if (i5 == 16) {
            return 4;
        }
        if (i5 == 32) {
            return 5;
        }
        if (i5 == 64) {
            return 6;
        }
        if (i5 == 128) {
            return 7;
        }
        if (i5 == 256) {
            return 8;
        }
        if (i5 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(u.h(i5, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static int m(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(u.i(i5, "Could not convert ", " to BackoffPolicy"));
    }

    public static int n(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 == 3) {
            return 4;
        }
        if (i5 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i5 != 5) {
            throw new IllegalArgumentException(u.i(i5, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static int o(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(u.i(i5, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static int p(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 == 3) {
            return 4;
        }
        if (i5 == 4) {
            return 5;
        }
        if (i5 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(u.i(i5, "Could not convert ", " to State"));
    }

    public static synchronized boolean q(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f3941a;
            if (context2 != null && (bool = f3942b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f3942b = null;
            if (x2.d.f()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f3942b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f3942b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f3942b = Boolean.FALSE;
                }
            }
            f3941a = applicationContext;
            return f3942b.booleanValue();
        }
    }

    public static h r(f fVar, g gVar) {
        g4.i.e(gVar, "key");
        return g4.i.a(fVar.getKey(), gVar) ? w3.i.f3631g : fVar;
    }

    public static void w(TextView textView, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            b0.e.p(textView, i5);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i6 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i5 > Math.abs(i6)) {
            textView.setPadding(textView.getPaddingLeft(), i5 + i6, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void x(TextView textView, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i6 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i5 > Math.abs(i6)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i5 - i6);
        }
    }

    public static void y(TextView textView, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
        if (i5 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i5 - r0, 1.0f);
        }
    }

    public static void z(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            e3.a(view, charSequence);
            return;
        }
        g3 g3Var = g3.f2089q;
        if (g3Var != null && g3Var.f2091g == view) {
            g3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new g3(view, charSequence);
            return;
        }
        g3 g3Var2 = g3.f2090r;
        if (g3Var2 != null && g3Var2.f2091g == view) {
            g3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public abstract boolean b(q.h hVar, q.d dVar, q.d dVar2);

    public abstract boolean c(q.h hVar, Object obj, Object obj2);

    public abstract boolean d(q.h hVar, q.g gVar, q.g gVar2);

    public void f(o oVar) {
        List singletonList = Collections.singletonList(oVar);
        k kVar = (k) this;
        if (singletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        l1.e eVar = new l1.e(kVar, singletonList);
        if (eVar.f2471m) {
            n.e().h(l1.e.f2466n, s.c.b("Already enqueued work ids (", TextUtils.join(", ", eVar.f2469k), ")"), new Throwable[0]);
        } else {
            kVar.f2490f.i(new u1.d(eVar));
        }
    }

    public abstract void s(Throwable th);

    public abstract void t(r1.h hVar);

    public abstract void u(q.g gVar, q.g gVar2);

    public abstract void v(q.g gVar, Thread thread);
}
