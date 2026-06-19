package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1083a;

    public /* synthetic */ k0(int i5) {
        this.f1083a = i5;
    }

    public static void a(k kVar, Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        int i6 = kVar.f1070g;
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        int i7 = kVar.h;
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(i7);
        int i8 = kVar.f1071i;
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(i8);
        z2.b.I(parcel, 4, kVar.f1072j);
        z2.b.G(parcel, 5, kVar.f1073k);
        z2.b.L(parcel, 6, kVar.f1074l, i5);
        z2.b.E(parcel, 7, kVar.f1075m);
        z2.b.H(parcel, 8, kVar.f1076n, i5);
        z2.b.L(parcel, 10, kVar.f1077o, i5);
        z2.b.L(parcel, 11, kVar.f1078p, i5);
        boolean z4 = kVar.f1079q;
        z2.b.N(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i9 = kVar.f1080r;
        z2.b.N(parcel, 13, 4);
        parcel.writeInt(i9);
        boolean z5 = kVar.f1081s;
        z2.b.N(parcel, 14, 4);
        parcel.writeInt(z5 ? 1 : 0);
        z2.b.I(parcel, 15, kVar.f1082t);
        z2.b.P(parcel, O);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1083a) {
            case 0:
                int Q = y4.b.Q(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = k.f1068u;
                String str = null;
                IBinder iBinder = null;
                Account account = null;
                String str2 = null;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                boolean z4 = false;
                int i8 = 0;
                boolean z5 = false;
                t2.d[] dVarArr = k.f1069v;
                t2.d[] dVarArr2 = dVarArr;
                while (parcel.dataPosition() < Q) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i5 = y4.b.L(parcel, readInt);
                            break;
                        case 2:
                            i6 = y4.b.L(parcel, readInt);
                            break;
                        case 3:
                            i7 = y4.b.L(parcel, readInt);
                            break;
                        case 4:
                            str = y4.b.o(parcel, readInt);
                            break;
                        case 5:
                            iBinder = y4.b.K(parcel, readInt);
                            break;
                        case 6:
                            scopeArr = (Scope[]) y4.b.r(parcel, readInt, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = y4.b.l(parcel, readInt);
                            break;
                        case '\b':
                            account = (Account) y4.b.n(parcel, readInt, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            y4.b.P(parcel, readInt);
                            break;
                        case '\n':
                            dVarArr = (t2.d[]) y4.b.r(parcel, readInt, t2.d.CREATOR);
                            break;
                        case 11:
                            dVarArr2 = (t2.d[]) y4.b.r(parcel, readInt, t2.d.CREATOR);
                            break;
                        case '\f':
                            z4 = y4.b.G(parcel, readInt);
                            break;
                        case '\r':
                            i8 = y4.b.L(parcel, readInt);
                            break;
                        case 14:
                            z5 = y4.b.G(parcel, readInt);
                            break;
                        case 15:
                            str2 = y4.b.o(parcel, readInt);
                            break;
                    }
                }
                y4.b.t(parcel, Q);
                return new k(i5, i6, i7, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z4, i8, z5, str2);
            case 1:
                g4.i.e(parcel, "parcel");
                return new d.a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 2:
                g4.i.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                g4.i.b(readParcelable);
                return new d.i((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 3:
                int Q2 = y4.b.Q(parcel);
                Intent intent = null;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < Q2) {
                    int readInt2 = parcel.readInt();
                    char c5 = (char) readInt2;
                    if (c5 == 1) {
                        i9 = y4.b.L(parcel, readInt2);
                    } else if (c5 == 2) {
                        i10 = y4.b.L(parcel, readInt2);
                    } else if (c5 != 3) {
                        y4.b.P(parcel, readInt2);
                    } else {
                        intent = (Intent) y4.b.n(parcel, readInt2, Intent.CREATOR);
                    }
                }
                y4.b.t(parcel, Q2);
                return new g3.b(i9, i10, intent);
            case 4:
                int Q3 = y4.b.Q(parcel);
                ArrayList arrayList = null;
                String str3 = null;
                while (parcel.dataPosition() < Q3) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 == 1) {
                        arrayList = y4.b.q(parcel, readInt3);
                    } else if (c6 != 2) {
                        y4.b.P(parcel, readInt3);
                    } else {
                        str3 = y4.b.o(parcel, readInt3);
                    }
                }
                y4.b.t(parcel, Q3);
                return new g3.e(arrayList, str3);
            case 5:
                int Q4 = y4.b.Q(parcel);
                x xVar = null;
                int i11 = 0;
                while (parcel.dataPosition() < Q4) {
                    int readInt4 = parcel.readInt();
                    char c7 = (char) readInt4;
                    if (c7 == 1) {
                        i11 = y4.b.L(parcel, readInt4);
                    } else if (c7 != 2) {
                        y4.b.P(parcel, readInt4);
                    } else {
                        xVar = (x) y4.b.n(parcel, readInt4, x.CREATOR);
                    }
                }
                y4.b.t(parcel, Q4);
                return new g3.f(i11, xVar);
            case 6:
                int Q5 = y4.b.Q(parcel);
                t2.b bVar = null;
                int i12 = 0;
                y yVar = null;
                while (parcel.dataPosition() < Q5) {
                    int readInt5 = parcel.readInt();
                    char c8 = (char) readInt5;
                    if (c8 == 1) {
                        i12 = y4.b.L(parcel, readInt5);
                    } else if (c8 == 2) {
                        bVar = (t2.b) y4.b.n(parcel, readInt5, t2.b.CREATOR);
                    } else if (c8 != 3) {
                        y4.b.P(parcel, readInt5);
                    } else {
                        yVar = (y) y4.b.n(parcel, readInt5, y.CREATOR);
                    }
                }
                y4.b.t(parcel, Q5);
                return new g3.g(i12, bVar, yVar);
            case 7:
                i0.h hVar = new i0.h(parcel);
                hVar.f1815g = parcel.readInt();
                return hVar;
            case 8:
                return new ParcelImpl(parcel);
            case 9:
                k.q0 q0Var = new k.q0(parcel);
                q0Var.f2201g = parcel.readByte() != 0;
                return q0Var;
            case 10:
                int Q6 = y4.b.Q(parcel);
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < Q6) {
                    int readInt6 = parcel.readInt();
                    char c9 = (char) readInt6;
                    if (c9 == 1) {
                        str4 = y4.b.o(parcel, readInt6);
                    } else if (c9 != 2) {
                        y4.b.P(parcel, readInt6);
                    } else {
                        str5 = y4.b.o(parcel, readInt6);
                    }
                }
                y4.b.t(parcel, Q6);
                return new q2.c(str4, str5);
            case 11:
                int Q7 = y4.b.Q(parcel);
                String str6 = null;
                int i13 = 0;
                while (parcel.dataPosition() < Q7) {
                    int readInt7 = parcel.readInt();
                    char c10 = (char) readInt7;
                    if (c10 == 1) {
                        str6 = y4.b.o(parcel, readInt7);
                    } else if (c10 != 2) {
                        y4.b.P(parcel, readInt7);
                    } else {
                        i13 = y4.b.L(parcel, readInt7);
                    }
                }
                y4.b.t(parcel, Q7);
                return new q2.d(str6, i13);
            case 12:
                int Q8 = y4.b.Q(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Uri uri = null;
                String str11 = null;
                String str12 = null;
                ArrayList arrayList2 = null;
                String str13 = null;
                String str14 = null;
                long j2 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < Q8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i14 = y4.b.L(parcel, readInt8);
                            break;
                        case 2:
                            str7 = y4.b.o(parcel, readInt8);
                            break;
                        case 3:
                            str8 = y4.b.o(parcel, readInt8);
                            break;
                        case 4:
                            str9 = y4.b.o(parcel, readInt8);
                            break;
                        case 5:
                            str10 = y4.b.o(parcel, readInt8);
                            break;
                        case 6:
                            uri = (Uri) y4.b.n(parcel, readInt8, Uri.CREATOR);
                            break;
                        case 7:
                            str11 = y4.b.o(parcel, readInt8);
                            break;
                        case '\b':
                            j2 = y4.b.M(parcel, readInt8);
                            break;
                        case '\t':
                            str12 = y4.b.o(parcel, readInt8);
                            break;
                        case '\n':
                            arrayList2 = y4.b.s(parcel, readInt8, Scope.CREATOR);
                            break;
                        case 11:
                            str13 = y4.b.o(parcel, readInt8);
                            break;
                        case '\f':
                            str14 = y4.b.o(parcel, readInt8);
                            break;
                        default:
                            y4.b.P(parcel, readInt8);
                            break;
                    }
                }
                y4.b.t(parcel, Q8);
                return new GoogleSignInAccount(i14, str7, str8, str9, str10, uri, str11, j2, str12, arrayList2, str13, str14);
            case 13:
                int Q9 = y4.b.Q(parcel);
                PendingIntent pendingIntent = null;
                String str15 = null;
                Integer num = null;
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < Q9) {
                    int readInt9 = parcel.readInt();
                    char c11 = (char) readInt9;
                    if (c11 == 1) {
                        i15 = y4.b.L(parcel, readInt9);
                    } else if (c11 == 2) {
                        i16 = y4.b.L(parcel, readInt9);
                    } else if (c11 == 3) {
                        pendingIntent = (PendingIntent) y4.b.n(parcel, readInt9, PendingIntent.CREATOR);
                    } else if (c11 == 4) {
                        str15 = y4.b.o(parcel, readInt9);
                    } else if (c11 != 5) {
                        y4.b.P(parcel, readInt9);
                    } else {
                        int N = y4.b.N(parcel, readInt9);
                        if (N == 0) {
                            num = null;
                        } else {
                            if (N != 4) {
                                String hexString = Integer.toHexString(N);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(N).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(N);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new androidx.fragment.app.x(sb.toString(), parcel);
                            }
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                y4.b.t(parcel, Q9);
                return new t2.b(i15, i16, pendingIntent, str15, num);
            default:
                int Q10 = y4.b.Q(parcel);
                int i17 = 0;
                boolean z6 = false;
                long j5 = -1;
                String str16 = null;
                while (parcel.dataPosition() < Q10) {
                    int readInt10 = parcel.readInt();
                    char c12 = (char) readInt10;
                    if (c12 == 1) {
                        str16 = y4.b.o(parcel, readInt10);
                    } else if (c12 == 2) {
                        i17 = y4.b.L(parcel, readInt10);
                    } else if (c12 == 3) {
                        j5 = y4.b.M(parcel, readInt10);
                    } else if (c12 != 4) {
                        y4.b.P(parcel, readInt10);
                    } else {
                        z6 = y4.b.G(parcel, readInt10);
                    }
                }
                y4.b.t(parcel, Q10);
                return new t2.d(str16, i17, j5, z6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f1083a) {
            case 0:
                return new k[i5];
            case 1:
                return new d.a[i5];
            case 2:
                return new d.i[i5];
            case 3:
                return new g3.b[i5];
            case 4:
                return new g3.e[i5];
            case 5:
                return new g3.f[i5];
            case 6:
                return new g3.g[i5];
            case 7:
                return new i0.h[i5];
            case 8:
                return new ParcelImpl[i5];
            case 9:
                return new k.q0[i5];
            case 10:
                return new q2.c[i5];
            case 11:
                return new q2.d[i5];
            case 12:
                return new GoogleSignInAccount[i5];
            case 13:
                return new t2.b[i5];
            default:
                return new t2.d[i5];
        }
    }
}
