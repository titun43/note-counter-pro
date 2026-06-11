package r4;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o4.r0;

/* loaded from: classes.dex */
public final class s extends s4.b implements q, b, s4.f {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3266k = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: j, reason: collision with root package name */
    public int f3267j;

    public s(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a() {
        Object obj = f3266k.get(this);
        if (obj == s4.i.f3314a) {
            return null;
        }
        return obj;
    }

    @Override // r4.c
    public final Object b(Object obj, w3.c cVar) {
        c(obj);
        return t3.h.f3400a;
    }

    public final void c(Object obj) {
        int i5;
        u[] uVarArr;
        androidx.emoji2.text.r rVar;
        if (obj == null) {
            obj = s4.i.f3314a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3266k;
            if (g4.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i6 = this.f3267j;
            if ((i6 & 1) != 0) {
                this.f3267j = i6 + 2;
                return;
            }
            int i7 = i6 + 1;
            this.f3267j = i7;
            u[] uVarArr2 = this.f3303g;
            while (true) {
                if (uVarArr2 != null) {
                    for (u uVar : uVarArr2) {
                        if (uVar != null) {
                            AtomicReference atomicReference = uVar.f3270a;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 != null && obj2 != (rVar = t.f3269b)) {
                                    androidx.emoji2.text.r rVar2 = t.f3268a;
                                    if (obj2 != rVar2) {
                                        while (!atomicReference.compareAndSet(obj2, rVar2)) {
                                            if (atomicReference.get() != obj2) {
                                                break;
                                            }
                                        }
                                        ((o4.f) obj2).resumeWith(t3.h.f3400a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj2, rVar)) {
                                        if (atomicReference.get() != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i5 = this.f3267j;
                    if (i5 == i7) {
                        this.f3267j = i7 + 1;
                        return;
                    }
                    uVarArr = this.f3303g;
                }
                uVarArr2 = uVarArr;
                i7 = i5;
            }
        }
    }

    @Override // s4.f
    public final b d(w3.h hVar, q4.a aVar) {
        return aVar == q4.a.f3098g ? this : new s4.d(this, hVar, -3, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0142, code lost:
    
        if (r5 == r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0145, code lost:
    
        if (r4 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00c6, B:18:0x00ce, B:21:0x00d5, B:22:0x00d9, B:26:0x00dc, B:28:0x00fd, B:31:0x010d, B:32:0x0129, B:39:0x0139, B:34:0x0130, B:38:0x0136, B:47:0x00e2, B:50:0x00e9, B:58:0x0054, B:60:0x005f, B:61:0x00b7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00c6, B:18:0x00ce, B:21:0x00d5, B:22:0x00d9, B:26:0x00dc, B:28:0x00fd, B:31:0x010d, B:32:0x0129, B:39:0x0139, B:34:0x0130, B:38:0x0136, B:47:0x00e2, B:50:0x00e9, B:58:0x0054, B:60:0x005f, B:61:0x00b7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x010c -> B:16:0x00c6). Please report as a decompilation issue!!! */
    @Override // r4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(c cVar, w3.c cVar2) {
        r rVar;
        x3.a aVar;
        int i5;
        u uVar;
        AtomicReference atomicReference;
        c cVar3;
        s sVar;
        u uVar2;
        r0 r0Var;
        c cVar4;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (cVar2 instanceof r) {
                rVar = (r) cVar2;
                int i6 = rVar.f3265n;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    rVar.f3265n = i6 - Integer.MIN_VALUE;
                    Object obj4 = rVar.f3263l;
                    aVar = x3.a.f3712g;
                    i5 = rVar.f3265n;
                    int i7 = 3;
                    int i8 = 2;
                    if (i5 != 0) {
                        b3.g.x(obj4);
                        synchronized (this) {
                            try {
                                u[] uVarArr = this.f3303g;
                                if (uVarArr == null) {
                                    uVarArr = new u[2];
                                    this.f3303g = uVarArr;
                                } else if (this.h >= uVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(uVarArr, uVarArr.length * 2);
                                    g4.i.d(copyOf, "copyOf(...)");
                                    this.f3303g = (u[]) copyOf;
                                    uVarArr = (u[]) copyOf;
                                }
                                int i9 = this.f3304i;
                                do {
                                    uVar = uVarArr[i9];
                                    if (uVar == null) {
                                        uVar = new u();
                                        uVarArr[i9] = uVar;
                                    }
                                    i9++;
                                    if (i9 >= uVarArr.length) {
                                        i9 = 0;
                                    }
                                    atomicReference = uVar.f3270a;
                                } while (atomicReference.get() != null);
                                atomicReference.set(t.f3268a);
                                this.f3304i = i9;
                                this.h++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        cVar3 = cVar;
                        sVar = this;
                        uVar2 = uVar;
                    } else if (i5 == 1) {
                        uVar2 = rVar.f3260i;
                        cVar3 = rVar.h;
                        sVar = rVar.f3259g;
                        b3.g.x(obj4);
                    } else if (i5 == 2) {
                        obj2 = rVar.f3262k;
                        r0Var = rVar.f3261j;
                        uVar2 = rVar.f3260i;
                        cVar4 = rVar.h;
                        sVar = rVar.f3259g;
                        b3.g.x(obj4);
                        obj = obj2;
                        AtomicReference atomicReference2 = uVar2.f3270a;
                        androidx.emoji2.text.r rVar2 = t.f3268a;
                        andSet = atomicReference2.getAndSet(rVar2);
                        g4.i.b(andSet);
                        if (andSet == t.f3269b) {
                        }
                    } else {
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = rVar.f3262k;
                        r0Var = rVar.f3261j;
                        uVar2 = rVar.f3260i;
                        cVar4 = rVar.h;
                        sVar = rVar.f3259g;
                        b3.g.x(obj4);
                        obj = obj5;
                        i7 = 3;
                        i8 = 2;
                        obj2 = f3266k.get(sVar);
                        if (r0Var != null && !r0Var.a()) {
                            throw r0Var.g();
                        }
                        obj3 = obj2 != s4.i.f3314a ? null : obj2;
                        rVar.f3259g = sVar;
                        rVar.h = cVar4;
                        rVar.f3260i = uVar2;
                        rVar.f3261j = r0Var;
                        rVar.f3262k = obj2;
                        rVar.f3265n = i8;
                        if (cVar4.b(obj3, rVar) == aVar) {
                            return aVar;
                        }
                        obj = obj2;
                        AtomicReference atomicReference22 = uVar2.f3270a;
                        androidx.emoji2.text.r rVar22 = t.f3268a;
                        andSet = atomicReference22.getAndSet(rVar22);
                        g4.i.b(andSet);
                        if (andSet == t.f3269b) {
                            obj2 = f3266k.get(sVar);
                            if (r0Var != null) {
                                throw r0Var.g();
                            }
                            if (obj2 != s4.i.f3314a) {
                            }
                            rVar.f3259g = sVar;
                            rVar.h = cVar4;
                            rVar.f3260i = uVar2;
                            rVar.f3261j = r0Var;
                            rVar.f3262k = obj2;
                            rVar.f3265n = i8;
                            if (cVar4.b(obj3, rVar) == aVar) {
                            }
                            obj = obj2;
                            AtomicReference atomicReference222 = uVar2.f3270a;
                            androidx.emoji2.text.r rVar222 = t.f3268a;
                            andSet = atomicReference222.getAndSet(rVar222);
                            g4.i.b(andSet);
                            if (andSet == t.f3269b) {
                                rVar.f3259g = sVar;
                                rVar.h = cVar4;
                                rVar.f3260i = uVar2;
                                rVar.f3261j = r0Var;
                                rVar.f3262k = obj;
                                rVar.f3265n = i7;
                                t3.h hVar = t3.h.f3400a;
                                o4.f fVar = new o4.f(1, a.a.o(rVar));
                                fVar.r();
                                AtomicReference atomicReference3 = uVar2.f3270a;
                                while (true) {
                                    if (atomicReference3.compareAndSet(rVar222, fVar)) {
                                        break;
                                    }
                                    if (atomicReference3.get() != rVar222) {
                                        fVar.resumeWith(hVar);
                                        break;
                                    }
                                }
                                Object q5 = fVar.q();
                                if (q5 == x3.a.f3712g) {
                                }
                            }
                        }
                    }
                    r0Var = (r0) rVar.getContext().d(o4.s.h);
                    cVar4 = cVar3;
                    obj = null;
                    obj2 = f3266k.get(sVar);
                    if (r0Var != null) {
                    }
                    if (obj2 != s4.i.f3314a) {
                    }
                    rVar.f3259g = sVar;
                    rVar.h = cVar4;
                    rVar.f3260i = uVar2;
                    rVar.f3261j = r0Var;
                    rVar.f3262k = obj2;
                    rVar.f3265n = i8;
                    if (cVar4.b(obj3, rVar) == aVar) {
                    }
                    obj = obj2;
                    AtomicReference atomicReference2222 = uVar2.f3270a;
                    androidx.emoji2.text.r rVar2222 = t.f3268a;
                    andSet = atomicReference2222.getAndSet(rVar2222);
                    g4.i.b(andSet);
                    if (andSet == t.f3269b) {
                    }
                }
            }
            if (i5 != 0) {
            }
            r0Var = (r0) rVar.getContext().d(o4.s.h);
            cVar4 = cVar3;
            obj = null;
            obj2 = f3266k.get(sVar);
            if (r0Var != null) {
            }
            if (obj2 != s4.i.f3314a) {
            }
            rVar.f3259g = sVar;
            rVar.h = cVar4;
            rVar.f3260i = uVar2;
            rVar.f3261j = r0Var;
            rVar.f3262k = obj2;
            rVar.f3265n = i8;
            if (cVar4.b(obj3, rVar) == aVar) {
            }
            obj = obj2;
            AtomicReference atomicReference22222 = uVar2.f3270a;
            androidx.emoji2.text.r rVar22222 = t.f3268a;
            andSet = atomicReference22222.getAndSet(rVar22222);
            g4.i.b(andSet);
            if (andSet == t.f3269b) {
            }
        } catch (Throwable th2) {
            synchronized (sVar) {
                try {
                    int i10 = sVar.h - 1;
                    sVar.h = i10;
                    if (i10 == 0) {
                        sVar.f3304i = 0;
                    }
                    g4.i.c(uVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    uVar2.f3270a.set(null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        rVar = new r(this, cVar2);
        Object obj42 = rVar.f3263l;
        aVar = x3.a.f3712g;
        i5 = rVar.f3265n;
        int i72 = 3;
        int i82 = 2;
    }
}
