package t2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import androidx.emoji2.text.b0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.common.zzad;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzal;
import com.google.android.gms.internal.common.zzr;
import f0.x;
import f2.q;
import j.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import o4.e0;
import o4.w;
import p3.r;
import p3.t;
import p3.u;
import p3.v;
import r3.a0;
import r3.c0;

/* loaded from: classes.dex */
public class i implements b3.c, s, d1.b, x, h2.b, g.b, y, y0.d {
    public static i h;

    /* renamed from: i, reason: collision with root package name */
    public static i f3378i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3379g;

    public /* synthetic */ i(int i5) {
        this.f3379g = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean B(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        zzah zzahVar;
        SigningInfo signingInfo;
        zzah zzj;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        if (packageInfo != null) {
            boolean z4 = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) ? false : true;
            try {
                zzahVar = z4 ? o.f3390c : o.f3389b;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    zzj = bArr != null ? zzah.zzk(bArr) : zzah.zzj();
                } else {
                    zzr.zza(i5 >= 28);
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        if (!hasMultipleSigners) {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            if (signingCertificateHistory != null) {
                                int i6 = zzah.zzd;
                                zzad zzadVar = new zzad();
                                signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                                for (Signature signature : signingCertificateHistory2) {
                                    zzadVar.zzb(signature.toByteArray());
                                }
                                zzj = zzadVar.zzd();
                            }
                        }
                    }
                    zzj = zzah.zzj();
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z4 ? C(packageInfo, o.f3388a) : C(packageInfo, o.f3388a[0])) != null) {
                }
            }
            if (zzj.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            zzah zzh = zzj.zzh();
            int size = zzh.size();
            int i7 = 0;
            while (i7 < size) {
                byte[] bArr2 = (byte[]) zzh.get(i7);
                zzal listIterator = zzahVar.listIterator(0);
                do {
                    int i8 = i7 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static m C(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i5 = 0; i5 < mVarArr.length; i5++) {
                if (mVarArr[i5].equals(nVar)) {
                    return mVarArr[i5];
                }
            }
        }
        return null;
    }

    public static String g(String str) {
        g4.i.e(str, "alias");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (Character.isLetter(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        g4.i.d(sb2, "toString(...)");
        String lowerCase = sb2.toLowerCase(Locale.ROOT);
        g4.i.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static r3.x p(String str) {
        Object obj = null;
        if (str == null || n4.i.X(str)) {
            return null;
        }
        z3.b bVar = r3.x.f3204q;
        bVar.getClass();
        g4.a aVar = new g4.a(bVar, 1);
        loop0: while (aVar.hasNext()) {
            Object next = aVar.next();
            r3.x xVar = (r3.x) next;
            i iVar = r3.x.f3196i;
            String name = xVar.name();
            iVar.getClass();
            if (!g(str).equals(g(name))) {
                List<String> list = xVar.h;
                if (list == null || !list.isEmpty()) {
                    for (String str2 : list) {
                        r3.x.f3196i.getClass();
                        if (g(str).equals(g(str2))) {
                        }
                    }
                }
            }
            obj = next;
        }
        return (r3.x) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean t(n0.b bVar, Editable editable, int i5, int i6, boolean z4) {
        int min;
        if (editable != null && i5 >= 0 && i6 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z4) {
                    int max = Math.max(i5, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z5 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z5) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z5 = true;
                                    }
                                } else if (!z5) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i6, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z6 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z6) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z6 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i5, 0);
                    min = Math.min(selectionEnd + i6, editable.length());
                }
                b0[] b0VarArr = (b0[]) editable.getSpans(selectionStart, min, b0.class);
                if (b0VarArr != null && b0VarArr.length > 0) {
                    for (b0 b0Var : b0VarArr) {
                        int spanStart = editable.getSpanStart(b0Var);
                        int spanEnd = editable.getSpanEnd(b0Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public b3.d A(Context context, String str, b3.c cVar) {
        switch (this.f3379g) {
            case 9:
                b3.d dVar = new b3.d();
                int a5 = cVar.a(context, str, true);
                dVar.f715b = a5;
                if (a5 != 0) {
                    dVar.f716c = 1;
                } else {
                    int c5 = cVar.c(context, str);
                    dVar.f714a = c5;
                    if (c5 != 0) {
                        dVar.f716c = -1;
                    }
                }
                return dVar;
            default:
                b3.d dVar2 = new b3.d();
                dVar2.f714a = cVar.c(context, str);
                int i5 = 1;
                int a6 = cVar.a(context, str, true);
                dVar2.f715b = a6;
                int i6 = dVar2.f714a;
                if (i6 == 0) {
                    i6 = 0;
                    if (a6 == 0) {
                        i5 = 0;
                        dVar2.f716c = i5;
                        return dVar2;
                    }
                }
                if (i6 >= a6) {
                    i5 = -1;
                }
                dVar2.f716c = i5;
                return dVar2;
        }
    }

    @Override // b3.c
    public int a(Context context, String str, boolean z4) {
        return b3.e.d(context, str, z4);
    }

    @Override // b3.c
    public int c(Context context, String str) {
        return b3.e.a(context, str);
    }

    @Override // d1.b
    public d1.c f(d1.a aVar) {
        return new e1.e((Context) aVar.f1184b, (String) aVar.f1185c, (androidx.emoji2.text.p) aVar.f1186d, aVar.f1183a);
    }

    @Override // s3.a
    public Object get() {
        switch (this.f3379g) {
            case 14:
                return new q(Executors.newSingleThreadExecutor(), 0);
            default:
                i iVar = new i(24);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(c2.c.f788g, new l2.c(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(c2.c.f789i, new l2.c(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(l2.d.h)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(c2.c.h, new l2.c(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < c2.c.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new l2.b(iVar, hashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(String str, String str2, y3.c cVar) {
        p3.i iVar;
        int i5;
        if (cVar instanceof p3.i) {
            iVar = (p3.i) cVar;
            int i6 = iVar.f3006i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                iVar.f3006i = i6 - Integer.MIN_VALUE;
                Object obj = iVar.f3005g;
                x3.a aVar = x3.a.f3712g;
                i5 = iVar.f3006i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.j jVar = new p3.j(str, str2, null, 0);
                    iVar.f3006i = 1;
                    obj = w.p(jVar, dVar, iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        iVar = new p3.i(this, cVar);
        Object obj2 = iVar.f3005g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = iVar.f3006i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(String str, String str2, y3.c cVar) {
        p3.q qVar;
        int i5;
        if (cVar instanceof p3.q) {
            qVar = (p3.q) cVar;
            int i6 = qVar.f3023i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                qVar.f3023i = i6 - Integer.MIN_VALUE;
                Object obj = qVar.f3022g;
                x3.a aVar = x3.a.f3712g;
                i5 = qVar.f3023i;
                int i7 = 1;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.j jVar = new p3.j(str, str2, null, i7);
                    qVar.f3023i = 1;
                    obj = w.p(jVar, dVar, qVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        qVar = new p3.q(this, cVar);
        Object obj2 = qVar.f3022g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = qVar.f3023i;
        int i72 = 1;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    @Override // j.y
    public boolean k(j.n nVar) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(String str, r3.a aVar, y3.c cVar) {
        p3.k kVar;
        int i5;
        if (cVar instanceof p3.k) {
            kVar = (p3.k) cVar;
            int i6 = kVar.f3011i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                kVar.f3011i = i6 - Integer.MIN_VALUE;
                Object obj = kVar.f3010g;
                x3.a aVar2 = x3.a.f3712g;
                i5 = kVar.f3011i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.l lVar = new p3.l(str, aVar, null, 0);
                    kVar.f3011i = 1;
                    obj = w.p(lVar, dVar, kVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        kVar = new p3.k(this, cVar);
        Object obj2 = kVar.f3010g;
        x3.a aVar22 = x3.a.f3712g;
        i5 = kVar.f3011i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(String str, r3.a aVar, y3.c cVar) {
        r rVar;
        int i5;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i6 = rVar.f3025i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                rVar.f3025i = i6 - Integer.MIN_VALUE;
                Object obj = rVar.f3024g;
                x3.a aVar2 = x3.a.f3712g;
                i5 = rVar.f3025i;
                int i7 = 1;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.l lVar = new p3.l(str, aVar, null, i7);
                    rVar.f3025i = 1;
                    obj = w.p(lVar, dVar, rVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.f3024g;
        x3.a aVar22 = x3.a.f3712g;
        i5 = rVar.f3025i;
        int i72 = 1;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(String str, r3.b bVar, y3.c cVar) {
        p3.m mVar;
        int i5;
        if (cVar instanceof p3.m) {
            mVar = (p3.m) cVar;
            int i6 = mVar.f3015i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                mVar.f3015i = i6 - Integer.MIN_VALUE;
                Object obj = mVar.f3014g;
                x3.a aVar = x3.a.f3712g;
                i5 = mVar.f3015i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    k0.q qVar = new k0.q(str, bVar, null);
                    mVar.f3015i = 1;
                    obj = w.p(qVar, dVar, mVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        mVar = new p3.m(this, cVar);
        Object obj2 = mVar.f3014g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = mVar.f3015i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(String str, y3.c cVar) {
        p3.s sVar;
        int i5;
        if (cVar instanceof p3.s) {
            sVar = (p3.s) cVar;
            int i6 = sVar.f3027i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                sVar.f3027i = i6 - Integer.MIN_VALUE;
                Object obj = sVar.f3026g;
                x3.a aVar = x3.a.f3712g;
                i5 = sVar.f3027i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    t tVar = new t(str, null);
                    sVar.f3027i = 1;
                    obj = w.p(tVar, dVar, sVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        sVar = new p3.s(this, cVar);
        Object obj2 = sVar.f3026g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = sVar.f3027i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(String str, y3.c cVar) {
        u uVar;
        int i5;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i6 = uVar.f3030i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                uVar.f3030i = i6 - Integer.MIN_VALUE;
                Object obj = uVar.f3029g;
                x3.a aVar = x3.a.f3712g;
                i5 = uVar.f3030i;
                int i7 = 1;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.o oVar = new p3.o(str, null, i7);
                    uVar.f3030i = 1;
                    obj = w.p(oVar, dVar, uVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        uVar = new u(this, cVar);
        Object obj2 = uVar.f3029g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = uVar.f3030i;
        int i72 = 1;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    public Signature[] r(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public long s() {
        switch (this.f3379g) {
            case 23:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    public boolean u(CharSequence charSequence) {
        return charSequence instanceof d0.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(String str, y3.c cVar) {
        p3.n nVar;
        int i5;
        if (cVar instanceof p3.n) {
            nVar = (p3.n) cVar;
            int i6 = nVar.f3017i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                nVar.f3017i = i6 - Integer.MIN_VALUE;
                Object obj = nVar.f3016g;
                x3.a aVar = x3.a.f3712g;
                i5 = nVar.f3017i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.o oVar = new p3.o(str, null, 0);
                    nVar.f3017i = 1;
                    obj = w.p(oVar, dVar, nVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        nVar = new p3.n(this, cVar);
        Object obj2 = nVar.f3016g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = nVar.f3017i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(String str, String str2, y3.c cVar) {
        p3.p pVar;
        int i5;
        if (cVar instanceof p3.p) {
            pVar = (p3.p) cVar;
            int i6 = pVar.f3021i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                pVar.f3021i = i6 - Integer.MIN_VALUE;
                Object obj = pVar.f3020g;
                x3.a aVar = x3.a.f3712g;
                i5 = pVar.f3021i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    k0.e eVar2 = new k0.e(str, str2, this, null, 1);
                    pVar.f3021i = 1;
                    obj = w.p(eVar2, dVar, pVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        pVar = new p3.p(this, cVar);
        Object obj2 = pVar.f3020g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = pVar.f3021i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(String str, a0 a0Var, y3.c cVar) {
        v vVar;
        int i5;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i6 = vVar.f3032i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                vVar.f3032i = i6 - Integer.MIN_VALUE;
                Object obj = vVar.f3031g;
                x3.a aVar = x3.a.f3712g;
                i5 = vVar.f3032i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.d dVar2 = new p3.d(str, a0Var, null, 2);
                    vVar.f3032i = 1;
                    obj = w.p(dVar2, dVar, vVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        vVar = new v(this, cVar);
        Object obj2 = vVar.f3031g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = vVar.f3032i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(String str, String str2, y3.c cVar) {
        p3.x xVar;
        int i5;
        if (cVar instanceof p3.x) {
            xVar = (p3.x) cVar;
            int i6 = xVar.f3038i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                xVar.f3038i = i6 - Integer.MIN_VALUE;
                Object obj = xVar.f3037g;
                x3.a aVar = x3.a.f3712g;
                i5 = xVar.f3038i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    k0.e eVar2 = new k0.e(str, str2, this, null, 2);
                    xVar.f3038i = 1;
                    obj = w.p(eVar2, dVar, xVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        xVar = new p3.x(this, cVar);
        Object obj2 = xVar.f3037g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = xVar.f3038i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(String str, c0 c0Var, y3.c cVar) {
        p3.y yVar;
        int i5;
        if (cVar instanceof p3.y) {
            yVar = (p3.y) cVar;
            int i6 = yVar.f3040i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                yVar.f3040i = i6 - Integer.MIN_VALUE;
                Object obj = yVar.f3039g;
                x3.a aVar = x3.a.f3712g;
                i5 = yVar.f3040i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    k0.e eVar2 = new k0.e(str, this, c0Var, null, 3);
                    yVar.f3040i = 1;
                    obj = w.p(eVar2, dVar, yVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        yVar = new p3.y(this, cVar);
        Object obj2 = yVar.f3039g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = yVar.f3040i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    @Override // y0.d
    public void e() {
    }

    @Override // j.y
    public void b(j.n nVar, boolean z4) {
    }

    @Override // y0.d
    public void h(int i5, Object obj) {
    }

    @Override // f0.x
    public void d(boolean z4, int i5, int i6, int i7) {
    }

    @Override // f0.x
    public void onScrollProgress(int i5, int i6, int i7, int i8) {
    }
}
