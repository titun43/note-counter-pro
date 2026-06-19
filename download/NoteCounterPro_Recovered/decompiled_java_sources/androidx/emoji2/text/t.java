package androidx.emoji2.text;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.lifecycle.k0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.play_billing.zzlk;
import g.p0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.zip.Adler32;
import k.h3;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class t implements h2.b, h0.g, w1.a {

    /* renamed from: k, reason: collision with root package name */
    public static t f282k;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f283g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public Object f284i;

    /* renamed from: j, reason: collision with root package name */
    public Object f285j;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i5) {
        this.f283g = i5;
        this.h = obj;
        this.f284i = obj2;
        this.f285j = obj3;
    }

    public static boolean g(Editable editable, KeyEvent keyEvent, boolean z4) {
        b0[] b0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (b0VarArr = (b0[]) editable.getSpans(selectionStart, selectionEnd, b0.class)) != null && b0VarArr.length > 0) {
                for (b0 b0Var : b0VarArr) {
                    int spanStart = editable.getSpanStart(b0Var);
                    int spanEnd = editable.getSpanEnd(b0Var);
                    if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static t r(Context context, AttributeSet attributeSet, int[] iArr, int i5) {
        return new t(context, context.obtainStyledAttributes(attributeSet, iArr, i5, 0));
    }

    @Override // h0.g
    public Uri a() {
        return (Uri) this.h;
    }

    @Override // h0.g
    public Uri c() {
        return (Uri) this.f285j;
    }

    @Override // h0.g
    public Object d() {
        return null;
    }

    public androidx.work.o e() {
        UUID uuid = (UUID) this.h;
        t1.i iVar = (t1.i) this.f284i;
        HashSet hashSet = (HashSet) this.f285j;
        androidx.work.o oVar = new androidx.work.o();
        oVar.f672a = uuid;
        oVar.f673b = iVar;
        oVar.f674c = hashSet;
        androidx.work.c cVar = iVar.f3348j;
        boolean z4 = cVar.h.f632a.size() > 0 || cVar.f626d || cVar.f624b || cVar.f625c;
        if (((t1.i) this.f284i).f3355q && z4) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.h = UUID.randomUUID();
        t1.i iVar2 = (t1.i) this.f284i;
        t1.i iVar3 = new t1.i();
        iVar3.f3341b = 1;
        androidx.work.g gVar = androidx.work.g.f635c;
        iVar3.f3344e = gVar;
        iVar3.f3345f = gVar;
        iVar3.f3348j = androidx.work.c.f622i;
        iVar3.f3350l = 1;
        iVar3.f3351m = 30000L;
        iVar3.f3354p = -1L;
        iVar3.f3356r = 1;
        iVar3.f3340a = iVar2.f3340a;
        iVar3.f3342c = iVar2.f3342c;
        iVar3.f3341b = iVar2.f3341b;
        iVar3.f3343d = iVar2.f3343d;
        iVar3.f3344e = new androidx.work.g(iVar2.f3344e);
        iVar3.f3345f = new androidx.work.g(iVar2.f3345f);
        iVar3.f3346g = iVar2.f3346g;
        iVar3.h = iVar2.h;
        iVar3.f3347i = iVar2.f3347i;
        androidx.work.c cVar2 = iVar2.f3348j;
        androidx.work.c cVar3 = new androidx.work.c();
        cVar3.f623a = 1;
        cVar3.f628f = -1L;
        cVar3.f629g = -1L;
        cVar3.h = new androidx.work.e();
        cVar3.f624b = cVar2.f624b;
        cVar3.f625c = cVar2.f625c;
        cVar3.f623a = cVar2.f623a;
        cVar3.f626d = cVar2.f626d;
        cVar3.f627e = cVar2.f627e;
        cVar3.h = cVar2.h;
        iVar3.f3348j = cVar3;
        iVar3.f3349k = iVar2.f3349k;
        iVar3.f3350l = iVar2.f3350l;
        iVar3.f3351m = iVar2.f3351m;
        iVar3.f3352n = iVar2.f3352n;
        iVar3.f3353o = iVar2.f3353o;
        iVar3.f3354p = iVar2.f3354p;
        iVar3.f3355q = iVar2.f3355q;
        iVar3.f3356r = iVar2.f3356r;
        this.f284i = iVar3;
        iVar3.f3340a = ((UUID) this.h).toString();
        return oVar;
    }

    public f2.j f() {
        String str = ((String) this.h) == null ? " backendName" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (((c2.c) this.f285j) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new f2.j((String) this.h, (byte[]) this.f284i, (c2.c) this.f285j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // s3.a
    public Object get() {
        switch (this.f283g) {
            case 9:
                return new f2.r(new t2.i(24), new t2.i(23), (k2.d) ((k2.c) this.h).get(), (l2.j) ((h3) this.f284i).get(), (r1.h) ((r1.h) this.f285j).get());
            default:
                return new t((Context) ((s3.a) this.h).get(), (m2.d) ((s3.a) this.f284i).get(), (l2.b) ((t2.i) this.f285j).get(), 15);
        }
    }

    @Override // h0.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f284i;
    }

    public void h(i2.a aVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.h;
        n3.e eVar = new n3.e(byteArrayOutputStream, hashMap, (HashMap) this.f284i, (k3.d) this.f285j);
        k3.d dVar = (k3.d) hashMap.get(i2.a.class);
        if (dVar != null) {
            dVar.a(aVar, eVar);
        } else {
            throw new k3.b("No encoder for " + i2.a.class);
        }
    }

    public void i(Runnable runnable) {
        ((u1.i) this.h).execute(runnable);
    }

    public r0 j(String str, Class cls) {
        r0 a5;
        u0 u0Var = (u0) this.f284i;
        g4.i.e(str, "key");
        w0 w0Var = (w0) this.h;
        w0Var.getClass();
        LinkedHashMap linkedHashMap = w0Var.f592a;
        r0 r0Var = (r0) linkedHashMap.get(str);
        if (!cls.isInstance(r0Var)) {
            q0.d dVar = new q0.d((q0.b) this.f285j);
            dVar.f3075a.put(s0.f578b, str);
            try {
                a5 = u0Var.b(cls, dVar);
            } catch (AbstractMethodError unused) {
                a5 = u0Var.a(cls);
            }
            g4.i.e(a5, "viewModel");
            r0 r0Var2 = (r0) linkedHashMap.put(str, a5);
            if (r0Var2 != null) {
                r0Var2.b();
            }
            return a5;
        }
        o0 o0Var = u0Var instanceof o0 ? (o0) u0Var : null;
        if (o0Var != null) {
            g4.i.b(r0Var);
            androidx.lifecycle.o oVar = o0Var.f567d;
            if (oVar != null) {
                c1.d dVar2 = o0Var.f568e;
                g4.i.b(dVar2);
                k0.a(r0Var, dVar2, oVar);
            }
        }
        g4.i.c(r0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return r0Var;
    }

    public ColorStateList k(int i5) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f284i;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (colorStateList = v.a.getColorStateList((Context) this.h, resourceId)) == null) ? typedArray.getColorStateList(i5) : colorStateList;
    }

    public Drawable l(int i5) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f284i;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0) ? typedArray.getDrawable(i5) : b3.g.t((Context) this.h, resourceId);
    }

    public Drawable m(int i5) {
        int resourceId;
        Drawable d5;
        if (!((TypedArray) this.f284i).hasValue(i5) || (resourceId = ((TypedArray) this.f284i).getResourceId(i5, 0)) == 0) {
            return null;
        }
        k.v a5 = k.v.a();
        Context context = (Context) this.h;
        synchronized (a5) {
            d5 = a5.f2255a.d(context, resourceId, true);
        }
        return d5;
    }

    public Typeface n(int i5, int i6, k.u0 u0Var) {
        k.u0 u0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f284i).getResourceId(i5, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f285j) == null) {
                this.f285j = new TypedValue();
            }
            Context context = (Context) this.h;
            TypedValue typedValue = (TypedValue) this.f285j;
            ThreadLocal threadLocal = x.k.f3680a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    u0Var.a();
                    return null;
                }
                int i7 = typedValue.assetCookie;
                o.k kVar = y.f.f3735b;
                Typeface typeface = (Typeface) kVar.get(y.f.b(resources, resourceId, charSequence2, i7, i6));
                int i8 = 10;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new a2.b(i8, u0Var, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        u0Var2 = u0Var;
                        try {
                            int i9 = typedValue.assetCookie;
                            Typeface l5 = y.f.f3734a.l(context, resources, resourceId, charSequence2, i6);
                            if (l5 != null) {
                                kVar.put(y.f.b(resources, resourceId, charSequence2, i9, i6), l5);
                            }
                            if (l5 != null) {
                                new Handler(Looper.getMainLooper()).post(new a2.b(i8, u0Var2, l5));
                            } else {
                                u0Var2.a();
                            }
                            return l5;
                        } catch (IOException e4) {
                            e = e4;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            u0Var2.a();
                            return null;
                        } catch (XmlPullParserException e5) {
                            e = e5;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            u0Var2.a();
                            return null;
                        }
                    }
                    x.d c5 = x.b.c(resources.getXml(resourceId), resources);
                    if (c5 != null) {
                        try {
                            return y.f.a(context, c5, resources, resourceId, charSequence2, typedValue.assetCookie, i6, u0Var);
                        } catch (IOException e6) {
                            e = e6;
                            u0Var2 = u0Var;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            u0Var2.a();
                            return null;
                        } catch (XmlPullParserException e7) {
                            e = e7;
                            u0Var2 = u0Var;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            u0Var2.a();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        u0Var.a();
                        return null;
                    } catch (IOException e8) {
                        iOException = e8;
                        u0Var2 = u0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        u0Var2.a();
                        return null;
                    } catch (XmlPullParserException e9) {
                        xmlPullParserException = e9;
                        u0Var2 = u0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        u0Var2.a();
                        return null;
                    }
                } catch (IOException e10) {
                    e = e10;
                    u0Var2 = u0Var;
                } catch (XmlPullParserException e11) {
                    e = e11;
                    u0Var2 = u0Var;
                }
            }
        }
        return null;
    }

    public t1.d o(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.h;
        z0.j d5 = z0.j.d(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            d5.f(1);
        } else {
            d5.g(1, str);
        }
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            return g5.moveToFirst() ? new t1.d(g5.getString(z2.b.i(g5, "work_spec_id")), g5.getInt(z2.b.i(g5, "system_id"))) : null;
        } finally {
            g5.close();
            d5.h();
        }
    }

    public boolean p(CharSequence charSequence, int i5, int i6, a0 a0Var) {
        if ((a0Var.f247c & 3) == 0) {
            h hVar = (h) this.f285j;
            m0.a b2 = a0Var.b();
            int a5 = b2.a(8);
            if (a5 != 0) {
                ((ByteBuffer) b2.f1377d).getShort(a5 + b2.f1374a);
            }
            e eVar = (e) hVar;
            eVar.getClass();
            ThreadLocal threadLocal = e.f253b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i5 < i6) {
                sb.append(charSequence.charAt(i5));
                i5++;
            }
            TextPaint textPaint = eVar.f254a;
            String sb2 = sb.toString();
            int i7 = y.d.f3733a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i8 = a0Var.f247c & 4;
            a0Var.f247c = hasGlyph ? i8 | 2 : i8 | 1;
        }
        return (a0Var.f247c & 3) == 2;
    }

    public void q(t1.d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.h;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((t1.b) this.f284i).e(dVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void s(androidx.lifecycle.m mVar) {
        q0 q0Var = (q0) this.f285j;
        if (q0Var != null) {
            q0Var.run();
        }
        q0 q0Var2 = new q0((androidx.lifecycle.v) this.h, mVar);
        this.f285j = q0Var2;
        ((Handler) this.f284i).postAtFrontOfQueue(q0Var2);
    }

    public Object t(CharSequence charSequence, int i5, int i6, int i7, boolean z4, q qVar) {
        int i8;
        char c5;
        s sVar = new s((x) ((r1.h) this.f284i).f3162i);
        int codePointAt = Character.codePointAt(charSequence, i5);
        int i9 = 0;
        boolean z5 = true;
        int i10 = i5;
        loop0: while (true) {
            i8 = i10;
            while (i10 < i6 && i9 < i7 && z5) {
                SparseArray sparseArray = sVar.f278c.f297a;
                x xVar = sparseArray == null ? null : (x) sparseArray.get(codePointAt);
                if (sVar.f276a == 2) {
                    if (xVar != null) {
                        sVar.f278c = xVar;
                        sVar.f281f++;
                    } else {
                        if (codePointAt == 65038) {
                            sVar.a();
                        } else if (codePointAt != 65039) {
                            x xVar2 = sVar.f278c;
                            if (xVar2.f298b != null) {
                                if (sVar.f281f != 1) {
                                    sVar.f279d = xVar2;
                                    sVar.a();
                                } else if (sVar.b()) {
                                    sVar.f279d = sVar.f278c;
                                    sVar.a();
                                } else {
                                    sVar.a();
                                }
                                c5 = 3;
                            } else {
                                sVar.a();
                            }
                        }
                        c5 = 1;
                    }
                    c5 = 2;
                } else if (xVar == null) {
                    sVar.a();
                    c5 = 1;
                } else {
                    sVar.f276a = 2;
                    sVar.f278c = xVar;
                    sVar.f281f = 1;
                    c5 = 2;
                }
                sVar.f280e = codePointAt;
                if (c5 == 1) {
                    i10 = Character.charCount(Character.codePointAt(charSequence, i8)) + i8;
                    if (i10 < i6) {
                        codePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (c5 == 2) {
                    int charCount = Character.charCount(codePointAt) + i10;
                    if (charCount < i6) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i10 = charCount;
                } else if (c5 == 3) {
                    if (z4 || !p(charSequence, i8, i10, sVar.f279d.f298b)) {
                        z5 = qVar.e(charSequence, i8, i10, sVar.f279d.f298b);
                        i9++;
                    }
                }
            }
        }
        if (sVar.f276a == 2 && sVar.f278c.f298b != null && ((sVar.f281f > 1 || sVar.b()) && i9 < i7 && z5 && (z4 || !p(charSequence, i8, i10, sVar.f278c.f298b)))) {
            qVar.e(charSequence, i8, i10, sVar.f278c.f298b);
        }
        return qVar.c();
    }

    public void u() {
        ((TypedArray) this.f284i).recycle();
    }

    public void v(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.h;
        workDatabase_Impl.b();
        t1.e eVar = (t1.e) this.f285j;
        e1.f a5 = eVar.a();
        if (str == null) {
            a5.e(1);
        } else {
            a5.f(1, str);
        }
        workDatabase_Impl.c();
        try {
            a5.l();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void w(f2.j jVar, int i5, boolean z4) {
        l2.b bVar = (l2.b) this.f285j;
        Context context = (Context) this.h;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = jVar.f1471a;
        String str2 = jVar.f1471a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        c2.c cVar = jVar.f1473c;
        adler32.update(allocate.putInt(p2.a.a(cVar)).array());
        byte[] bArr = jVar.f1472b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z4) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i6 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i6 >= i5) {
                        b3.g.n("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((m2.h) ((m2.d) this.f284i)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(p2.a.a(cVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bVar.a(cVar, longValue, i5));
            Set set = ((l2.c) bVar.f2514b.get(cVar)).f2517c;
            if (set.contains(l2.d.f2518g)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(l2.d.f2519i)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(l2.d.h)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i5);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", p2.a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(bVar.a(cVar, longValue, i5)), valueOf, Integer.valueOf(i5)};
            String v5 = b3.g.v("JobInfoScheduler");
            if (Log.isLoggable(v5, 3)) {
                Log.d(v5, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void x(c2.a aVar) {
        f0.g gVar = new f0.g();
        f2.r rVar = (f2.r) this.f285j;
        f2.j jVar = (f2.j) this.h;
        c2.b bVar = (c2.b) this.f284i;
        k2.d dVar = rVar.f1488c;
        t a5 = f2.j.a();
        a5.y(jVar.f1471a);
        a5.f285j = c2.c.f788g;
        a5.f284i = jVar.f1472b;
        f2.j f5 = a5.f();
        f2.h hVar = new f2.h();
        hVar.f1464f = new HashMap();
        hVar.f1462d = Long.valueOf(rVar.f1486a.s());
        hVar.f1463e = Long.valueOf(rVar.f1487b.s());
        hVar.f1459a = "PLAY_BILLING_LIBRARY";
        hVar.f1461c = new f2.n(bVar, ((zzlk) aVar.f786a).zzh());
        hVar.f1460b = null;
        k2.b bVar2 = (k2.b) dVar;
        bVar2.f2431b.execute(new a2.f(bVar2, f5, gVar, hVar.c()));
    }

    public void y(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.h = str;
    }

    public t(WorkDatabase_Impl workDatabase_Impl) {
        this.f283g = 17;
        this.h = workDatabase_Impl;
        this.f284i = new t1.b(workDatabase_Impl, 2);
        this.f285j = new t1.e(workDatabase_Impl, 0);
    }

    public t(androidx.lifecycle.w wVar) {
        this.f283g = 1;
        this.h = new androidx.lifecycle.v(wVar);
        this.f284i = new Handler();
    }

    public t(f2.j jVar, c2.b bVar, y0.c cVar, f2.r rVar) {
        this.f283g = 8;
        this.h = jVar;
        this.f284i = bVar;
        this.f285j = rVar;
    }

    public t(ExecutorService executorService) {
        this.f283g = 18;
        this.f284i = new Handler(Looper.getMainLooper());
        this.f285j = new f2.q(this, 2);
        this.h = new u1.i(executorService);
    }

    public t(w0 w0Var, u0 u0Var, q0.b bVar) {
        this.f283g = 2;
        g4.i.e(w0Var, "store");
        g4.i.e(bVar, "defaultCreationExtras");
        this.h = w0Var;
        this.f284i = u0Var;
        this.f285j = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(w0 w0Var, u0 u0Var) {
        this(w0Var, u0Var, q0.a.f3074b);
        this.f283g = 2;
        g4.i.e(w0Var, "store");
    }

    public t(Context context, TypedArray typedArray) {
        this.f283g = 13;
        this.h = context;
        this.f284i = typedArray;
    }

    @Override // h0.g
    public void b() {
    }

    public t(Context context, LocationManager locationManager) {
        this.f283g = 10;
        this.f285j = new p0();
        this.h = context;
        this.f284i = locationManager;
    }

    public t(Class cls) {
        this.f283g = 3;
        HashSet hashSet = new HashSet();
        this.f285j = hashSet;
        this.h = UUID.randomUUID();
        this.f284i = new t1.i(((UUID) this.h).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((t1.i) this.f284i).f3343d = OverwritingInputMerger.class.getName();
    }

    public t(r1.h hVar, t2.i iVar, e eVar, Set set) {
        this.f283g = 0;
        this.h = iVar;
        this.f284i = hVar;
        this.f285j = eVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            t(str, 0, str.length(), 1, true, new r(str, 0));
        }
    }

    public t(int i5) {
        this.f283g = i5;
        switch (i5) {
            case 6:
                break;
            default:
                List list = Collections.EMPTY_LIST;
                this.h = list;
                this.f284i = list;
                break;
        }
    }
}
