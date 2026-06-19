package q1;

import android.os.Build;
import t1.i;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3078e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(r1.d dVar, int i5) {
        super(dVar);
        this.f3078e = i5;
    }

    @Override // q1.c
    public final boolean a(i iVar) {
        switch (this.f3078e) {
            case 0:
                return iVar.f3348j.f624b;
            case 1:
                return iVar.f3348j.f626d;
            case 2:
                return iVar.f3348j.f623a == 2;
            case 3:
                int i5 = iVar.f3348j.f623a;
                return i5 == 3 || (Build.VERSION.SDK_INT >= 30 && i5 == 6);
            default:
                return iVar.f3348j.f627e;
        }
    }

    @Override // q1.c
    public final boolean b(Object obj) {
        boolean booleanValue;
        switch (this.f3078e) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                p1.a aVar = (p1.a) obj;
                return Build.VERSION.SDK_INT >= 26 ? (aVar.f2973a && aVar.f2974b) ? false : true : true ^ aVar.f2973a;
            case 3:
                p1.a aVar2 = (p1.a) obj;
                return !aVar2.f2973a || aVar2.f2975c;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
