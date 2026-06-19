package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f261j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile l f262k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f263a;

    /* renamed from: b, reason: collision with root package name */
    public final o.g f264b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f265c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f266d;

    /* renamed from: e, reason: collision with root package name */
    public final g f267e;

    /* renamed from: f, reason: collision with root package name */
    public final k f268f;

    /* renamed from: g, reason: collision with root package name */
    public final t2.i f269g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final e f270i;

    public l(w wVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f263a = reentrantReadWriteLock;
        this.f265c = 3;
        k kVar = wVar.f294a;
        this.f268f = kVar;
        int i5 = wVar.f295b;
        this.h = i5;
        this.f270i = wVar.f296c;
        this.f266d = new Handler(Looper.getMainLooper());
        this.f264b = new o.g(0);
        this.f269g = new t2.i(2);
        g gVar = new g(this);
        this.f267e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i5 == 0) {
            try {
                this.f265c = 0;
            } catch (Throwable th) {
                this.f263a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                kVar.i(new f(gVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static l a() {
        l lVar;
        synchronized (f261j) {
            try {
                lVar = f262k;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    public final int b() {
        this.f263a.readLock().lock();
        try {
            return this.f265c;
        } finally {
            this.f263a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f263a.writeLock().lock();
        try {
            if (this.f265c == 0) {
                return;
            }
            this.f265c = 0;
            this.f263a.writeLock().unlock();
            g gVar = this.f267e;
            l lVar = (l) gVar.f257b;
            try {
                lVar.f268f.i(new f(gVar));
            } catch (Throwable th) {
                lVar.d(th);
            }
        } finally {
            this.f263a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f263a.writeLock().lock();
        try {
            this.f265c = 2;
            arrayList.addAll(this.f264b);
            this.f264b.clear();
            this.f263a.writeLock().unlock();
            this.f266d.post(new j(arrayList, this.f265c, th));
        } catch (Throwable th2) {
            this.f263a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: all -> 0x007c, TryCatch #3 {all -> 0x007c, blocks: (B:87:0x0054, B:90:0x0059, B:92:0x005d, B:94:0x006a, B:33:0x0089, B:35:0x0093, B:37:0x0096, B:39:0x0099, B:41:0x00a9, B:42:0x00ac), top: B:86:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i5, int i6) {
        CharSequence charSequence2;
        Throwable th;
        int i7;
        int i8;
        b0[] b0VarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i5 <= i6)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        d0 d0Var = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i5 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i6 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i5 == i6) {
            return charSequence;
        }
        t tVar = (t) this.f267e.f256a;
        tVar.getClass();
        boolean z4 = charSequence instanceof z;
        if (z4) {
            ((z) charSequence).a();
        }
        try {
            if (!z4) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i5 - 1, i6 + 1, b0.class) <= i6) {
                            d0Var = new d0();
                            d0Var.f252g = false;
                            d0Var.h = new SpannableString(charSequence);
                        }
                        if (d0Var != null && (b0VarArr = (b0[]) d0Var.h.getSpans(i5, i6, b0.class)) != null && b0VarArr.length > 0) {
                            for (b0 b0Var : b0VarArr) {
                                int spanStart = d0Var.h.getSpanStart(b0Var);
                                int spanEnd = d0Var.h.getSpanEnd(b0Var);
                                if (spanStart != i6) {
                                    d0Var.removeSpan(b0Var);
                                }
                                i5 = Math.min(spanStart, i5);
                                i6 = Math.max(spanEnd, i6);
                            }
                        }
                        i7 = i5;
                        i8 = i6;
                        if (i7 != i8 || i7 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z4) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                            } catch (Throwable th2) {
                                charSequence2 = charSequence;
                                th = th2;
                                if (z4) {
                                }
                            }
                            try {
                                d0 d0Var2 = (d0) tVar.t(charSequence2, i7, i8, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, false, new p(0, d0Var, (t2.i) tVar.h));
                                if (d0Var2 != null) {
                                    Spannable spannable = d0Var2.h;
                                    if (z4) {
                                        ((z) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z4) {
                                    return charSequence2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                if (z4) {
                                }
                            }
                        }
                        ((z) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z4) {
                    }
                }
            }
            d0Var = new d0((Spannable) charSequence);
            if (d0Var != null) {
                while (r1 < r5) {
                }
            }
            i7 = i5;
            i8 = i6;
            if (i7 != i8) {
            }
            charSequence2 = charSequence;
            if (!z4) {
            }
            ((z) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z4) {
                throw th;
            }
            ((z) charSequence2).b();
            throw th;
        }
    }

    public final void f(i iVar) {
        y4.b.g(iVar, "initCallback cannot be null");
        this.f263a.writeLock().lock();
        try {
            if (this.f265c != 1 && this.f265c != 2) {
                this.f264b.add(iVar);
                this.f263a.writeLock().unlock();
            }
            this.f266d.post(new j(Arrays.asList(iVar), this.f265c, (Throwable) null));
            this.f263a.writeLock().unlock();
        } catch (Throwable th) {
            this.f263a.writeLock().unlock();
            throw th;
        }
    }
}
