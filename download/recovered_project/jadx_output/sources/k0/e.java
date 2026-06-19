package k0;

import android.util.Base64;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2343g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2344i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2345j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f2346k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2347l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2348m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, Object obj, Object obj2, w3.c cVar, int i5) {
        super(2, cVar);
        this.f2343g = i5;
        this.f2346k = str;
        this.f2347l = obj;
        this.f2348m = obj2;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f2343g) {
            case 0:
                e eVar = new e((List) this.f2347l, (ArrayList) this.f2348m, cVar);
                eVar.f2346k = obj;
                return eVar;
            case 1:
                e eVar2 = new e((String) this.f2346k, (String) this.f2347l, (t2.i) this.f2348m, cVar, 1);
                eVar2.f2344i = obj;
                return eVar2;
            case 2:
                e eVar3 = new e((String) this.f2346k, (String) this.f2347l, (t2.i) this.f2348m, cVar, 2);
                eVar3.f2344i = obj;
                return eVar3;
            default:
                e eVar4 = new e((String) this.f2346k, (t2.i) this.f2347l, (r3.c0) this.f2348m, cVar, 3);
                eVar4.f2344i = obj;
                return eVar4;
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2343g) {
        }
        return ((e) create((o4.t) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01af A[Catch: all -> 0x011f, TryCatch #8 {all -> 0x011f, blocks: (B:102:0x0116, B:103:0x01a8, B:108:0x01af, B:109:0x01b4, B:113:0x0130, B:114:0x0195, B:116:0x019b, B:120:0x01b5, B:121:0x01ba, B:123:0x0147, B:125:0x0157, B:127:0x015d, B:129:0x0163, B:131:0x0169, B:133:0x016f, B:136:0x0176, B:137:0x017b, B:138:0x017c, B:140:0x0185, B:145:0x01bb, B:146:0x01c0, B:147:0x01c1, B:148:0x01c6), top: B:98:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027c A[Catch: all -> 0x01e4, TryCatch #0 {all -> 0x01e4, blocks: (B:156:0x01db, B:157:0x0275, B:162:0x027c, B:163:0x0281, B:167:0x01f5, B:168:0x025d, B:170:0x0263, B:174:0x0282, B:175:0x0287, B:177:0x020c, B:179:0x021c, B:181:0x0222, B:183:0x0228, B:185:0x022e, B:187:0x0234, B:190:0x023b, B:191:0x0240, B:192:0x0241, B:194:0x0247, B:196:0x024d, B:201:0x0288, B:202:0x028d, B:203:0x028e, B:204:0x0293, B:205:0x0294, B:206:0x0299), top: B:152:0x01d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #3 {all -> 0x0098, blocks: (B:17:0x007e, B:19:0x0082, B:22:0x0093, B:33:0x009e, B:34:0x00a1, B:35:0x00a2, B:39:0x00b6, B:41:0x00c0, B:68:0x00d0, B:48:0x00d6, B:53:0x00d9, B:56:0x00ee, B:63:0x00f8, B:64:0x00fb, B:55:0x00eb, B:60:0x00f6, B:21:0x0090, B:30:0x009c), top: B:16:0x007e, outer: #4, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[Catch: all -> 0x0098, TryCatch #3 {all -> 0x0098, blocks: (B:17:0x007e, B:19:0x0082, B:22:0x0093, B:33:0x009e, B:34:0x00a1, B:35:0x00a2, B:39:0x00b6, B:41:0x00c0, B:68:0x00d0, B:48:0x00d6, B:53:0x00d9, B:56:0x00ee, B:63:0x00f8, B:64:0x00fb, B:55:0x00eb, B:60:0x00f6, B:21:0x0090, B:30:0x009c), top: B:16:0x007e, outer: #4, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007a  */
    @Override // y3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        t2.i iVar;
        String str;
        Object obj2;
        Object n5;
        Throwable a5;
        t2.i iVar2;
        String str2;
        Object obj3;
        Object o2;
        Throwable a6;
        r3.c0 c0Var;
        File file;
        Object m5;
        File file2;
        FileOutputStream fileOutputStream;
        r3.e eVar;
        boolean z4;
        int i5 = this.f2343g;
        Object obj4 = t3.h.f3400a;
        Object obj5 = this.f2348m;
        Object obj6 = this.f2347l;
        switch (i5) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                int i6 = this.h;
                if (i6 == 0) {
                    b3.g.x(obj);
                    obj = this.f2346k;
                    list = (ArrayList) obj5;
                    it = ((List) obj6).iterator();
                } else if (i6 == 1) {
                    Object obj7 = this.f2344i;
                    Iterator it2 = (Iterator) this.f2345j;
                    List list2 = (List) this.f2346k;
                    b3.g.x(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list2.add(new d(1, null));
                        this.f2346k = list2;
                        this.f2345j = it2;
                        this.f2344i = null;
                        this.h = 2;
                        throw null;
                    }
                    obj = obj7;
                    it = it2;
                    list = list2;
                } else {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f2345j;
                    list = (List) this.f2346k;
                    b3.g.x(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                this.f2346k = list;
                this.f2345j = it;
                this.f2344i = obj;
                this.h = 1;
                throw null;
            case 1:
                x3.a aVar2 = x3.a.f3712g;
                int i7 = this.h;
                try {
                } catch (Throwable th) {
                    obj4 = b3.g.g(th);
                }
                if (i7 == 0) {
                    b3.g.x(obj);
                    String str3 = (String) this.f2346k;
                    String str4 = (String) obj6;
                    iVar = (t2.i) obj5;
                    File file3 = new File(str3);
                    File file4 = new File(str4);
                    if (!file3.equals(file4)) {
                        if (!file3.exists()) {
                            throw new r3.o(str3, null);
                        }
                        if (file3.isFile() || file4.isFile()) {
                            throw new r3.h();
                        }
                        File parentFile = file4.getParentFile();
                        if (parentFile != null && !parentFile.exists()) {
                            throw new r3.i();
                        }
                        if (file4.isDirectory()) {
                            throw new r3.f(str4);
                        }
                        if (!file3.renameTo(file4)) {
                            this.f2344i = str3;
                            this.f2345j = iVar;
                            this.h = 1;
                            Object i8 = iVar.i(str3, str4, this);
                            if (i8 == aVar2) {
                                return aVar2;
                            }
                            str = str3;
                            obj2 = i8;
                        }
                    }
                    return new t3.e(obj4);
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    n5 = ((t3.e) obj).f3396g;
                    a5 = t3.e.a(n5);
                    if (a5 != null) {
                        return new t3.e(obj4);
                    }
                    throw new r3.s(a5);
                }
                iVar = (t2.i) this.f2345j;
                str = (String) this.f2344i;
                b3.g.x(obj);
                obj2 = ((t3.e) obj).f3396g;
                Throwable a7 = t3.e.a(obj2);
                if (a7 != null) {
                    throw new r3.s(a7);
                }
                r3.b bVar = new r3.b(true);
                this.f2344i = null;
                this.f2345j = null;
                this.h = 2;
                n5 = iVar.n(str, bVar, this);
                if (n5 == aVar2) {
                    return aVar2;
                }
                a5 = t3.e.a(n5);
                if (a5 != null) {
                }
                break;
            case 2:
                x3.a aVar3 = x3.a.f3712g;
                int i9 = this.h;
                try {
                } catch (Throwable th2) {
                    obj4 = b3.g.g(th2);
                }
                if (i9 == 0) {
                    b3.g.x(obj);
                    String str5 = (String) this.f2346k;
                    String str6 = (String) obj6;
                    iVar2 = (t2.i) obj5;
                    File file5 = new File(str5);
                    File file6 = new File(str6);
                    if (!file5.equals(file6)) {
                        if (!file5.exists()) {
                            throw new r3.o(str5, null);
                        }
                        if (file5.isDirectory() || file6.isDirectory()) {
                            throw new r3.h();
                        }
                        File parentFile2 = file6.getParentFile();
                        if (parentFile2 != null && !parentFile2.exists()) {
                            throw new r3.i();
                        }
                        file6.delete();
                        if (!file5.renameTo(file6)) {
                            this.f2344i = str5;
                            this.f2345j = iVar2;
                            this.h = 1;
                            Object j2 = iVar2.j(str5, str6, this);
                            if (j2 == aVar3) {
                                return aVar3;
                            }
                            str2 = str5;
                            obj3 = j2;
                        }
                    }
                    return new t3.e(obj4);
                }
                if (i9 != 1) {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    o2 = ((t3.e) obj).f3396g;
                    a6 = t3.e.a(o2);
                    if (a6 != null) {
                        return new t3.e(obj4);
                    }
                    throw new r3.s(a6);
                }
                iVar2 = (t2.i) this.f2345j;
                str2 = (String) this.f2344i;
                b3.g.x(obj);
                obj3 = ((t3.e) obj).f3396g;
                Throwable a8 = t3.e.a(obj3);
                if (a8 != null) {
                    throw new r3.s(a8);
                }
                this.f2344i = null;
                this.f2345j = null;
                this.h = 2;
                o2 = iVar2.o(str2, this);
                if (o2 == aVar3) {
                    return aVar3;
                }
                a6 = t3.e.a(o2);
                if (a6 != null) {
                }
                break;
            default:
                x3.a aVar4 = x3.a.f3712g;
                int i10 = this.h;
                try {
                } catch (Throwable th3) {
                    obj4 = b3.g.g(th3);
                }
                if (i10 == 0) {
                    b3.g.x(obj);
                    String str7 = (String) this.f2346k;
                    t2.i iVar3 = (t2.i) obj6;
                    c0Var = (r3.c0) obj5;
                    file = new File(str7);
                    if (!file.exists()) {
                        r3.a aVar5 = new r3.a(c0Var.f3175d);
                        this.f2344i = c0Var;
                        this.f2345j = file;
                        this.h = 1;
                        m5 = iVar3.m(str7, aVar5, this);
                        if (m5 == aVar4) {
                            return aVar4;
                        }
                        file2 = file;
                    }
                    r3.b0 b0Var = c0Var.f3174c;
                    String str8 = c0Var.f3172a;
                    eVar = c0Var.f3173b;
                    fileOutputStream = new FileOutputStream(file, b0Var != r3.b0.h);
                    try {
                        if (eVar instanceof r3.d) {
                            String Z = n4.i.Z(str8, ",");
                            int length = Z.length() - 1;
                            int i11 = 0;
                            boolean z5 = false;
                            try {
                                while (i11 <= length) {
                                    char charAt = Z.charAt(!z5 ? i11 : length);
                                    if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                                        z4 = false;
                                        if (z5) {
                                            if (z4) {
                                                i11++;
                                            } else {
                                                z5 = true;
                                            }
                                        } else if (z4) {
                                            length--;
                                        } else {
                                            byte[] decode = Base64.decode(Z.subSequence(i11, length + 1).toString(), 2);
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                            bufferedOutputStream.write(decode);
                                            bufferedOutputStream.close();
                                        }
                                    }
                                    z4 = true;
                                    if (z5) {
                                    }
                                }
                                bufferedOutputStream.write(decode);
                                bufferedOutputStream.close();
                            } finally {
                            }
                            byte[] decode2 = Base64.decode(Z.subSequence(i11, length + 1).toString(), 2);
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                        } else {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, ((r3.d) eVar).f3176b));
                            try {
                                bufferedWriter.write(str8);
                                bufferedWriter.close();
                            } finally {
                            }
                        }
                        fileOutputStream.close();
                        return new t3.e(obj4);
                    } finally {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file2 = (File) this.f2345j;
                    c0Var = (r3.c0) this.f2344i;
                    b3.g.x(obj);
                    m5 = ((t3.e) obj).f3396g;
                }
                Throwable a9 = t3.e.a(m5);
                if (a9 != null) {
                    throw a9;
                }
                file = file2;
                r3.b0 b0Var2 = c0Var.f3174c;
                String str82 = c0Var.f3172a;
                eVar = c0Var.f3173b;
                fileOutputStream = new FileOutputStream(file, b0Var2 != r3.b0.h);
                if (eVar instanceof r3.d) {
                }
                fileOutputStream.close();
                return new t3.e(obj4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, ArrayList arrayList, w3.c cVar) {
        super(2, cVar);
        this.f2343g = 0;
        this.f2347l = list;
        this.f2348m = arrayList;
    }
}
