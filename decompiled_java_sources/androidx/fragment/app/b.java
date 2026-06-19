package androidx.fragment.app;

import android.accounts.Account;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f336a;

    public /* synthetic */ b(int i5) {
        this.f336a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f336a) {
            case 0:
                return new c(parcel);
            case 1:
                return new d(parcel);
            case 2:
                q0 q0Var = new q0();
                q0Var.f418g = parcel.readString();
                q0Var.h = parcel.readInt();
                return q0Var;
            case 3:
                w0 w0Var = new w0();
                w0Var.f480k = null;
                w0Var.f481l = new ArrayList();
                w0Var.f482m = new ArrayList();
                w0Var.f477g = parcel.createStringArrayList();
                w0Var.h = parcel.createStringArrayList();
                w0Var.f478i = (c[]) parcel.createTypedArray(c.CREATOR);
                w0Var.f479j = parcel.readInt();
                w0Var.f480k = parcel.readString();
                w0Var.f481l = parcel.createStringArrayList();
                w0Var.f482m = parcel.createTypedArrayList(d.CREATOR);
                w0Var.f483n = parcel.createTypedArrayList(q0.CREATOR);
                return w0Var;
            case 4:
                return new a1(parcel);
            case 5:
                int Q = y4.b.Q(parcel);
                String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                ArrayList arrayList = null;
                int i5 = 0;
                String str2 = null;
                while (parcel.dataPosition() < Q) {
                    int readInt = parcel.readInt();
                    char c5 = (char) readInt;
                    if (c5 == 1) {
                        arrayList = y4.b.s(parcel, readInt, zzbe.CREATOR);
                    } else if (c5 == 2) {
                        i5 = y4.b.L(parcel, readInt);
                    } else if (c5 == 3) {
                        str = y4.b.o(parcel, readInt);
                    } else if (c5 != 4) {
                        y4.b.P(parcel, readInt);
                    } else {
                        str2 = y4.b.o(parcel, readInt);
                    }
                }
                y4.b.t(parcel, Q);
                return new c3.e(arrayList, i5, str, str2);
            case 6:
                int Q2 = y4.b.Q(parcel);
                int i6 = zzbgj.zzq.zzf;
                long j2 = 0;
                c3.z[] zVarArr = null;
                int i7 = 1;
                int i8 = 1;
                while (parcel.dataPosition() < Q2) {
                    int readInt2 = parcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 == 1) {
                        i7 = y4.b.L(parcel, readInt2);
                    } else if (c6 == 2) {
                        i8 = y4.b.L(parcel, readInt2);
                    } else if (c6 == 3) {
                        j2 = y4.b.M(parcel, readInt2);
                    } else if (c6 == 4) {
                        i6 = y4.b.L(parcel, readInt2);
                    } else if (c6 != 5) {
                        y4.b.P(parcel, readInt2);
                    } else {
                        zVarArr = (c3.z[]) y4.b.r(parcel, readInt2, c3.z.CREATOR);
                    }
                }
                y4.b.t(parcel, Q2);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.f1142j = i6;
                locationAvailability.f1140g = i7;
                locationAvailability.h = i8;
                locationAvailability.f1141i = j2;
                locationAvailability.f1143k = zVarArr;
                return locationAvailability;
            case 7:
                int Q3 = y4.b.Q(parcel);
                int i9 = 102;
                long j5 = 3600000;
                long j6 = 600000;
                boolean z4 = false;
                long j7 = 0;
                float f5 = 0.0f;
                int i10 = Integer.MAX_VALUE;
                long j8 = Long.MAX_VALUE;
                boolean z5 = false;
                while (parcel.dataPosition() < Q3) {
                    int readInt3 = parcel.readInt();
                    boolean z6 = z5;
                    switch ((char) readInt3) {
                        case 1:
                            i9 = y4.b.L(parcel, readInt3);
                            break;
                        case 2:
                            j5 = y4.b.M(parcel, readInt3);
                            break;
                        case 3:
                            j6 = y4.b.M(parcel, readInt3);
                            break;
                        case 4:
                            z4 = y4.b.G(parcel, readInt3);
                            break;
                        case 5:
                            j8 = y4.b.M(parcel, readInt3);
                            break;
                        case 6:
                            i10 = y4.b.L(parcel, readInt3);
                            break;
                        case 7:
                            f5 = y4.b.I(parcel, readInt3);
                            break;
                        case '\b':
                            j7 = y4.b.M(parcel, readInt3);
                            break;
                        case '\t':
                            z5 = y4.b.G(parcel, readInt3);
                            continue;
                        default:
                            y4.b.P(parcel, readInt3);
                            break;
                    }
                    z5 = z6;
                }
                y4.b.t(parcel, Q3);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.f1144g = i9;
                locationRequest.h = j5;
                locationRequest.f1145i = j6;
                locationRequest.f1146j = z4;
                locationRequest.f1147k = j8;
                locationRequest.f1148l = i10;
                locationRequest.f1149m = f5;
                locationRequest.f1150n = j7;
                locationRequest.f1151o = z5;
                return locationRequest;
            case 8:
                int Q4 = y4.b.Q(parcel);
                List list = LocationResult.h;
                while (parcel.dataPosition() < Q4) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        y4.b.P(parcel, readInt4);
                    } else {
                        list = y4.b.s(parcel, readInt4, Location.CREATOR);
                    }
                }
                y4.b.t(parcel, Q4);
                return new LocationResult(list);
            case 9:
                int Q5 = y4.b.Q(parcel);
                String str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                String str4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                String str5 = str4;
                while (parcel.dataPosition() < Q5) {
                    int readInt5 = parcel.readInt();
                    char c7 = (char) readInt5;
                    if (c7 == 1) {
                        str4 = y4.b.o(parcel, readInt5);
                    } else if (c7 == 2) {
                        str5 = y4.b.o(parcel, readInt5);
                    } else if (c7 != 5) {
                        y4.b.P(parcel, readInt5);
                    } else {
                        str3 = y4.b.o(parcel, readInt5);
                    }
                }
                y4.b.t(parcel, Q5);
                return new c3.y(str3, str4, str5);
            case 10:
                int Q6 = y4.b.Q(parcel);
                ArrayList arrayList2 = null;
                boolean z7 = false;
                boolean z8 = false;
                c3.y yVar = null;
                while (parcel.dataPosition() < Q6) {
                    int readInt6 = parcel.readInt();
                    char c8 = (char) readInt6;
                    if (c8 == 1) {
                        arrayList2 = y4.b.s(parcel, readInt6, LocationRequest.CREATOR);
                    } else if (c8 == 2) {
                        z7 = y4.b.G(parcel, readInt6);
                    } else if (c8 == 3) {
                        z8 = y4.b.G(parcel, readInt6);
                    } else if (c8 != 5) {
                        y4.b.P(parcel, readInt6);
                    } else {
                        yVar = (c3.y) y4.b.n(parcel, readInt6, c3.y.CREATOR);
                    }
                }
                y4.b.t(parcel, Q6);
                return new c3.i(arrayList2, z7, z8, yVar);
            case 11:
                int Q7 = y4.b.Q(parcel);
                Status status = null;
                c3.k kVar = null;
                while (parcel.dataPosition() < Q7) {
                    int readInt7 = parcel.readInt();
                    char c9 = (char) readInt7;
                    if (c9 == 1) {
                        status = (Status) y4.b.n(parcel, readInt7, Status.CREATOR);
                    } else if (c9 != 2) {
                        y4.b.P(parcel, readInt7);
                    } else {
                        kVar = (c3.k) y4.b.n(parcel, readInt7, c3.k.CREATOR);
                    }
                }
                y4.b.t(parcel, Q7);
                return new c3.j(status, kVar);
            case 12:
                int Q8 = y4.b.Q(parcel);
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                while (parcel.dataPosition() < Q8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            z9 = y4.b.G(parcel, readInt8);
                            break;
                        case 2:
                            z10 = y4.b.G(parcel, readInt8);
                            break;
                        case 3:
                            z11 = y4.b.G(parcel, readInt8);
                            break;
                        case 4:
                            z12 = y4.b.G(parcel, readInt8);
                            break;
                        case 5:
                            z13 = y4.b.G(parcel, readInt8);
                            break;
                        case 6:
                            z14 = y4.b.G(parcel, readInt8);
                            break;
                        default:
                            y4.b.P(parcel, readInt8);
                            break;
                    }
                }
                y4.b.t(parcel, Q8);
                return new c3.k(z9, z10, z11, z12, z13, z14);
            case 13:
                int Q9 = y4.b.Q(parcel);
                int i11 = 1;
                int i12 = 1;
                long j9 = -1;
                long j10 = -1;
                while (parcel.dataPosition() < Q9) {
                    int readInt9 = parcel.readInt();
                    char c10 = (char) readInt9;
                    if (c10 == 1) {
                        i11 = y4.b.L(parcel, readInt9);
                    } else if (c10 == 2) {
                        i12 = y4.b.L(parcel, readInt9);
                    } else if (c10 == 3) {
                        j9 = y4.b.M(parcel, readInt9);
                    } else if (c10 != 4) {
                        y4.b.P(parcel, readInt9);
                    } else {
                        j10 = y4.b.M(parcel, readInt9);
                    }
                }
                y4.b.t(parcel, Q9);
                return new c3.z(j9, i11, i12, j10);
            case 14:
                int Q10 = y4.b.Q(parcel);
                String str6 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                ArrayList arrayList3 = null;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < Q10) {
                    int readInt10 = parcel.readInt();
                    char c11 = (char) readInt10;
                    if (c11 == 1) {
                        arrayList3 = y4.b.q(parcel, readInt10);
                    } else if (c11 == 2) {
                        pendingIntent = (PendingIntent) y4.b.n(parcel, readInt10, PendingIntent.CREATOR);
                    } else if (c11 != 3) {
                        y4.b.P(parcel, readInt10);
                    } else {
                        str6 = y4.b.o(parcel, readInt10);
                    }
                }
                y4.b.t(parcel, Q10);
                return new c3.a0(arrayList3, pendingIntent, str6);
            case 15:
                int Q11 = y4.b.Q(parcel);
                ArrayList arrayList4 = null;
                int i13 = 0;
                while (parcel.dataPosition() < Q11) {
                    int readInt11 = parcel.readInt();
                    char c12 = (char) readInt11;
                    if (c12 == 1) {
                        arrayList4 = y4.b.s(parcel, readInt11, c3.b0.CREATOR);
                    } else if (c12 != 2) {
                        y4.b.P(parcel, readInt11);
                    } else {
                        i13 = y4.b.L(parcel, readInt11);
                    }
                }
                y4.b.t(parcel, Q11);
                return new c3.l(arrayList4, i13);
            case 16:
                int Q12 = y4.b.Q(parcel);
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < Q12) {
                    int readInt12 = parcel.readInt();
                    char c13 = (char) readInt12;
                    if (c13 == 1) {
                        i14 = y4.b.L(parcel, readInt12);
                    } else if (c13 == 2) {
                        i15 = y4.b.L(parcel, readInt12);
                    } else if (c13 == 3) {
                        i16 = y4.b.L(parcel, readInt12);
                    } else if (c13 != 4) {
                        y4.b.P(parcel, readInt12);
                    } else {
                        i17 = y4.b.L(parcel, readInt12);
                    }
                }
                y4.b.t(parcel, Q12);
                return new c3.b0(i14, i15, i16, i17);
            case 17:
                int Q13 = y4.b.Q(parcel);
                int i18 = 0;
                int i19 = 0;
                while (parcel.dataPosition() < Q13) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 == 1) {
                        i18 = y4.b.L(parcel, readInt13);
                    } else if (c14 != 2) {
                        y4.b.P(parcel, readInt13);
                    } else {
                        i19 = y4.b.L(parcel, readInt13);
                    }
                }
                y4.b.t(parcel, Q13);
                return new c3.b(i18, i19);
            case 18:
                int Q14 = y4.b.Q(parcel);
                ArrayList arrayList5 = null;
                String str7 = null;
                ArrayList arrayList6 = null;
                String str8 = null;
                while (parcel.dataPosition() < Q14) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 == 1) {
                        arrayList5 = y4.b.s(parcel, readInt14, c3.b.CREATOR);
                    } else if (c15 == 2) {
                        str7 = y4.b.o(parcel, readInt14);
                    } else if (c15 == 3) {
                        arrayList6 = y4.b.s(parcel, readInt14, com.google.android.gms.common.internal.g.CREATOR);
                    } else if (c15 != 4) {
                        y4.b.P(parcel, readInt14);
                    } else {
                        str8 = y4.b.o(parcel, readInt14);
                    }
                }
                y4.b.t(parcel, Q14);
                return new c3.c(arrayList5, str7, arrayList6, str8);
            case 19:
                int Q15 = y4.b.Q(parcel);
                boolean z15 = true;
                long j11 = 50;
                float f6 = 0.0f;
                long j12 = Long.MAX_VALUE;
                int i20 = Integer.MAX_VALUE;
                while (parcel.dataPosition() < Q15) {
                    int readInt15 = parcel.readInt();
                    char c16 = (char) readInt15;
                    if (c16 == 1) {
                        z15 = y4.b.G(parcel, readInt15);
                    } else if (c16 == 2) {
                        j11 = y4.b.M(parcel, readInt15);
                    } else if (c16 == 3) {
                        f6 = y4.b.I(parcel, readInt15);
                    } else if (c16 == 4) {
                        j12 = y4.b.M(parcel, readInt15);
                    } else if (c16 != 5) {
                        y4.b.P(parcel, readInt15);
                    } else {
                        i20 = y4.b.L(parcel, readInt15);
                    }
                }
                y4.b.t(parcel, Q15);
                return new c3.d0(z15, j11, f6, j12, i20);
            case 20:
                int Q16 = y4.b.Q(parcel);
                String str9 = null;
                int i21 = 0;
                while (parcel.dataPosition() < Q16) {
                    int readInt16 = parcel.readInt();
                    char c17 = (char) readInt16;
                    if (c17 == 1) {
                        i21 = y4.b.L(parcel, readInt16);
                    } else if (c17 != 2) {
                        y4.b.P(parcel, readInt16);
                    } else {
                        str9 = y4.b.o(parcel, readInt16);
                    }
                }
                y4.b.t(parcel, Q16);
                return new Scope(i21, str9);
            case zzbgj.zzt.zzm /* 21 */:
                int Q17 = y4.b.Q(parcel);
                String str10 = null;
                t2.b bVar = null;
                int i22 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < Q17) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 1) {
                        i22 = y4.b.L(parcel, readInt17);
                    } else if (c18 == 2) {
                        str10 = y4.b.o(parcel, readInt17);
                    } else if (c18 == 3) {
                        pendingIntent2 = (PendingIntent) y4.b.n(parcel, readInt17, PendingIntent.CREATOR);
                    } else if (c18 != 4) {
                        y4.b.P(parcel, readInt17);
                    } else {
                        bVar = (t2.b) y4.b.n(parcel, readInt17, t2.b.CREATOR);
                    }
                }
                y4.b.t(parcel, Q17);
                return new Status(i22, str10, pendingIntent2, bVar);
            case 22:
                int Q18 = y4.b.Q(parcel);
                String str11 = null;
                int i23 = 0;
                while (parcel.dataPosition() < Q18) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        i23 = y4.b.L(parcel, readInt18);
                    } else if (c19 != 2) {
                        y4.b.P(parcel, readInt18);
                    } else {
                        str11 = y4.b.o(parcel, readInt18);
                    }
                }
                y4.b.t(parcel, Q18);
                return new com.google.android.gms.common.internal.g(i23, str11);
            case 23:
                int Q19 = y4.b.Q(parcel);
                ArrayList arrayList7 = null;
                int i24 = 0;
                while (parcel.dataPosition() < Q19) {
                    int readInt19 = parcel.readInt();
                    char c20 = (char) readInt19;
                    if (c20 == 1) {
                        i24 = y4.b.L(parcel, readInt19);
                    } else if (c20 != 2) {
                        y4.b.P(parcel, readInt19);
                    } else {
                        arrayList7 = y4.b.s(parcel, readInt19, com.google.android.gms.common.internal.q.CREATOR);
                    }
                }
                y4.b.t(parcel, Q19);
                return new com.google.android.gms.common.internal.t(i24, arrayList7);
            case 24:
                int Q20 = y4.b.Q(parcel);
                int i25 = -1;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                String str12 = null;
                String str13 = null;
                long j13 = 0;
                long j14 = 0;
                while (parcel.dataPosition() < Q20) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            i26 = y4.b.L(parcel, readInt20);
                            break;
                        case 2:
                            i27 = y4.b.L(parcel, readInt20);
                            break;
                        case 3:
                            i28 = y4.b.L(parcel, readInt20);
                            break;
                        case 4:
                            j13 = y4.b.M(parcel, readInt20);
                            break;
                        case 5:
                            j14 = y4.b.M(parcel, readInt20);
                            break;
                        case 6:
                            str12 = y4.b.o(parcel, readInt20);
                            break;
                        case 7:
                            str13 = y4.b.o(parcel, readInt20);
                            break;
                        case '\b':
                            i29 = y4.b.L(parcel, readInt20);
                            break;
                        case '\t':
                            i25 = y4.b.L(parcel, readInt20);
                            break;
                        default:
                            y4.b.P(parcel, readInt20);
                            break;
                    }
                }
                y4.b.t(parcel, Q20);
                return new com.google.android.gms.common.internal.q(i26, i27, i28, j13, j14, str12, str13, i29, i25);
            case 25:
                int Q21 = y4.b.Q(parcel);
                Account account = null;
                int i30 = 0;
                int i31 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < Q21) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 1) {
                        i30 = y4.b.L(parcel, readInt21);
                    } else if (c21 == 2) {
                        account = (Account) y4.b.n(parcel, readInt21, Account.CREATOR);
                    } else if (c21 == 3) {
                        i31 = y4.b.L(parcel, readInt21);
                    } else if (c21 != 4) {
                        y4.b.P(parcel, readInt21);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) y4.b.n(parcel, readInt21, GoogleSignInAccount.CREATOR);
                    }
                }
                y4.b.t(parcel, Q21);
                return new com.google.android.gms.common.internal.x(i30, account, i31, googleSignInAccount);
            case 26:
                int Q22 = y4.b.Q(parcel);
                int i32 = 0;
                boolean z16 = false;
                boolean z17 = false;
                IBinder iBinder = null;
                t2.b bVar2 = null;
                while (parcel.dataPosition() < Q22) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 1) {
                        i32 = y4.b.L(parcel, readInt22);
                    } else if (c22 == 2) {
                        iBinder = y4.b.K(parcel, readInt22);
                    } else if (c22 == 3) {
                        bVar2 = (t2.b) y4.b.n(parcel, readInt22, t2.b.CREATOR);
                    } else if (c22 == 4) {
                        z16 = y4.b.G(parcel, readInt22);
                    } else if (c22 != 5) {
                        y4.b.P(parcel, readInt22);
                    } else {
                        z17 = y4.b.G(parcel, readInt22);
                    }
                }
                y4.b.t(parcel, Q22);
                return new com.google.android.gms.common.internal.y(i32, iBinder, bVar2, z16, z17);
            case 27:
                int Q23 = y4.b.Q(parcel);
                int i33 = 0;
                boolean z18 = false;
                boolean z19 = false;
                int i34 = 0;
                int i35 = 0;
                while (parcel.dataPosition() < Q23) {
                    int readInt23 = parcel.readInt();
                    char c23 = (char) readInt23;
                    if (c23 == 1) {
                        i33 = y4.b.L(parcel, readInt23);
                    } else if (c23 == 2) {
                        z18 = y4.b.G(parcel, readInt23);
                    } else if (c23 == 3) {
                        z19 = y4.b.G(parcel, readInt23);
                    } else if (c23 == 4) {
                        i34 = y4.b.L(parcel, readInt23);
                    } else if (c23 != 5) {
                        y4.b.P(parcel, readInt23);
                    } else {
                        i35 = y4.b.L(parcel, readInt23);
                    }
                }
                y4.b.t(parcel, Q23);
                return new com.google.android.gms.common.internal.s(i33, z18, z19, i34, i35);
            case 28:
                int Q24 = y4.b.Q(parcel);
                Bundle bundle = null;
                com.google.android.gms.common.internal.j jVar = null;
                int i36 = 0;
                t2.d[] dVarArr = null;
                while (parcel.dataPosition() < Q24) {
                    int readInt24 = parcel.readInt();
                    char c24 = (char) readInt24;
                    if (c24 == 1) {
                        bundle = y4.b.l(parcel, readInt24);
                    } else if (c24 == 2) {
                        dVarArr = (t2.d[]) y4.b.r(parcel, readInt24, t2.d.CREATOR);
                    } else if (c24 == 3) {
                        i36 = y4.b.L(parcel, readInt24);
                    } else if (c24 != 4) {
                        y4.b.P(parcel, readInt24);
                    } else {
                        jVar = (com.google.android.gms.common.internal.j) y4.b.n(parcel, readInt24, com.google.android.gms.common.internal.j.CREATOR);
                    }
                }
                y4.b.t(parcel, Q24);
                com.google.android.gms.common.internal.j0 j0Var = new com.google.android.gms.common.internal.j0();
                j0Var.f1065g = bundle;
                j0Var.h = dVarArr;
                j0Var.f1066i = i36;
                j0Var.f1067j = jVar;
                return j0Var;
            default:
                int Q25 = y4.b.Q(parcel);
                com.google.android.gms.common.internal.s sVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z20 = false;
                boolean z21 = false;
                int i37 = 0;
                while (parcel.dataPosition() < Q25) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            sVar = (com.google.android.gms.common.internal.s) y4.b.n(parcel, readInt25, com.google.android.gms.common.internal.s.CREATOR);
                            break;
                        case 2:
                            z20 = y4.b.G(parcel, readInt25);
                            break;
                        case 3:
                            z21 = y4.b.G(parcel, readInt25);
                            break;
                        case 4:
                            int N = y4.b.N(parcel, readInt25);
                            int dataPosition = parcel.dataPosition();
                            if (N != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition + N);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i37 = y4.b.L(parcel, readInt25);
                            break;
                        case 6:
                            int N2 = y4.b.N(parcel, readInt25);
                            int dataPosition2 = parcel.dataPosition();
                            if (N2 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + N2);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            y4.b.P(parcel, readInt25);
                            break;
                    }
                }
                y4.b.t(parcel, Q25);
                return new com.google.android.gms.common.internal.j(sVar, z20, z21, iArr, i37, iArr2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f336a) {
            case 0:
                return new c[i5];
            case 1:
                return new d[i5];
            case 2:
                return new q0[i5];
            case 3:
                return new w0[i5];
            case 4:
                return new a1[i5];
            case 5:
                return new c3.e[i5];
            case 6:
                return new LocationAvailability[i5];
            case 7:
                return new LocationRequest[i5];
            case 8:
                return new LocationResult[i5];
            case 9:
                return new c3.y[i5];
            case 10:
                return new c3.i[i5];
            case 11:
                return new c3.j[i5];
            case 12:
                return new c3.k[i5];
            case 13:
                return new c3.z[i5];
            case 14:
                return new c3.a0[i5];
            case 15:
                return new c3.l[i5];
            case 16:
                return new c3.b0[i5];
            case 17:
                return new c3.b[i5];
            case 18:
                return new c3.c[i5];
            case 19:
                return new c3.d0[i5];
            case 20:
                return new Scope[i5];
            case zzbgj.zzt.zzm /* 21 */:
                return new Status[i5];
            case 22:
                return new com.google.android.gms.common.internal.g[i5];
            case 23:
                return new com.google.android.gms.common.internal.t[i5];
            case 24:
                return new com.google.android.gms.common.internal.q[i5];
            case 25:
                return new com.google.android.gms.common.internal.x[i5];
            case 26:
                return new com.google.android.gms.common.internal.y[i5];
            case 27:
                return new com.google.android.gms.common.internal.s[i5];
            case 28:
                return new com.google.android.gms.common.internal.j0[i5];
            default:
                return new com.google.android.gms.common.internal.j[i5];
        }
    }
}
