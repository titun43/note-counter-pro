package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import i1.a;
import i1.b;
import i1.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f203a;
        boolean z4 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f203a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f204b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1826e);
        }
        remoteActionCompat.f204b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f205c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1826e);
        }
        remoteActionCompat.f205c = charSequence2;
        remoteActionCompat.f206d = (PendingIntent) aVar.f(remoteActionCompat.f206d, 4);
        boolean z5 = remoteActionCompat.f207e;
        if (aVar.e(5)) {
            z5 = ((b) aVar).f1826e.readInt() != 0;
        }
        remoteActionCompat.f207e = z5;
        boolean z6 = remoteActionCompat.f208f;
        if (!aVar.e(6)) {
            z4 = z6;
        } else if (((b) aVar).f1826e.readInt() == 0) {
            z4 = false;
        }
        remoteActionCompat.f208f = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f203a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f204b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f1826e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f205c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f206d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z4 = remoteActionCompat.f207e;
        aVar.h(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = remoteActionCompat.f208f;
        aVar.h(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
