package t2;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.r0;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m extends zzb implements r0 {

    /* renamed from: g, reason: collision with root package name */
    public final int f3387g;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        b0.b(bArr.length == 25);
        this.f3387g = Arrays.hashCode(bArr);
    }

    public static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    public abstract byte[] a();

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            try {
                r0 r0Var = (r0) obj;
                if (((m) r0Var).f3387g == this.f3387g) {
                    return Arrays.equals(a(), (byte[]) a3.b.b(new a3.b(((m) r0Var).a())));
                }
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3387g;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            a3.b bVar = new a3.b(a());
            parcel2.writeNoException();
            zzc.zze(parcel2, bVar);
            return true;
        }
        if (i5 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f3387g);
        return true;
    }
}
