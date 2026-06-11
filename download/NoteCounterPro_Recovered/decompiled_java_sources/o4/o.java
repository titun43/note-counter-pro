package o4;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2824g;

    public /* synthetic */ o(int i5) {
        this.f2824g = i5;
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        w3.b bVar;
        switch (this.f2824g) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((w3.h) obj).l((w3.f) obj2);
            case 2:
                return ((w3.h) obj).l((w3.f) obj2);
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                w3.f fVar = (w3.f) obj2;
                if (!(fVar instanceof f1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fVar : Integer.valueOf(intValue + 1);
            case 5:
                f1 f1Var = (f1) obj;
                w3.f fVar2 = (w3.f) obj2;
                if (f1Var != null) {
                    return f1Var;
                }
                if (fVar2 instanceof f1) {
                    return (f1) fVar2;
                }
                return null;
            case 6:
                return (t4.w) obj;
            case 7:
                String str = (String) obj;
                w3.f fVar3 = (w3.f) obj2;
                g4.i.e(str, "acc");
                g4.i.e(fVar3, "element");
                if (str.length() == 0) {
                    return fVar3.toString();
                }
                return str + ", " + fVar3;
            default:
                w3.h hVar = (w3.h) obj;
                w3.f fVar4 = (w3.f) obj2;
                g4.i.e(hVar, "acc");
                g4.i.e(fVar4, "element");
                w3.h i5 = hVar.i(fVar4.getKey());
                w3.i iVar = w3.i.f3631g;
                if (i5 == iVar) {
                    return fVar4;
                }
                w3.d dVar = w3.d.f3630g;
                w3.e eVar = (w3.e) i5.d(dVar);
                if (eVar == null) {
                    bVar = new w3.b(i5, fVar4);
                } else {
                    w3.h i6 = i5.i(dVar);
                    if (i6 == iVar) {
                        return new w3.b(fVar4, eVar);
                    }
                    bVar = new w3.b(new w3.b(i6, fVar4), eVar);
                }
                return bVar;
        }
    }
}
