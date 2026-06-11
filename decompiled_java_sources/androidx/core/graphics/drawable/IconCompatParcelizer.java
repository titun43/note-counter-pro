package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import i1.a;
import i1.b;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i5 = iconCompat.f215a;
        if (aVar.e(1)) {
            i5 = ((b) aVar).f1826e.readInt();
        }
        iconCompat.f215a = i5;
        byte[] bArr = iconCompat.f217c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f1826e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f217c = bArr;
        iconCompat.f218d = aVar.f(iconCompat.f218d, 3);
        int i6 = iconCompat.f219e;
        if (aVar.e(4)) {
            i6 = ((b) aVar).f1826e.readInt();
        }
        iconCompat.f219e = i6;
        int i7 = iconCompat.f220f;
        if (aVar.e(5)) {
            i7 = ((b) aVar).f1826e.readInt();
        }
        iconCompat.f220f = i7;
        iconCompat.f221g = (ColorStateList) aVar.f(iconCompat.f221g, 6);
        String str = iconCompat.f222i;
        if (aVar.e(7)) {
            str = ((b) aVar).f1826e.readString();
        }
        iconCompat.f222i = str;
        String str2 = iconCompat.f223j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f1826e.readString();
        }
        iconCompat.f223j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.f222i);
        switch (iconCompat.f215a) {
            case -1:
                Parcelable parcelable = iconCompat.f218d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f216b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f218d;
                if (parcelable2 != null) {
                    iconCompat.f216b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f217c;
                iconCompat.f216b = bArr3;
                iconCompat.f215a = 3;
                iconCompat.f219e = 0;
                iconCompat.f220f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f217c, Charset.forName("UTF-16"));
                iconCompat.f216b = str3;
                if (iconCompat.f215a == 2 && iconCompat.f223j == null) {
                    iconCompat.f223j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f216b = iconCompat.f217c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f222i = iconCompat.h.name();
        switch (iconCompat.f215a) {
            case -1:
                iconCompat.f218d = (Parcelable) iconCompat.f216b;
                break;
            case 1:
            case 5:
                iconCompat.f218d = (Parcelable) iconCompat.f216b;
                break;
            case 2:
                iconCompat.f217c = ((String) iconCompat.f216b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f217c = (byte[]) iconCompat.f216b;
                break;
            case 4:
            case 6:
                iconCompat.f217c = iconCompat.f216b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i5 = iconCompat.f215a;
        if (-1 != i5) {
            aVar.h(1);
            ((b) aVar).f1826e.writeInt(i5);
        }
        byte[] bArr = iconCompat.f217c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f1826e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f218d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f1826e.writeParcelable(parcelable, 0);
        }
        int i6 = iconCompat.f219e;
        if (i6 != 0) {
            aVar.h(4);
            ((b) aVar).f1826e.writeInt(i6);
        }
        int i7 = iconCompat.f220f;
        if (i7 != 0) {
            aVar.h(5);
            ((b) aVar).f1826e.writeInt(i7);
        }
        ColorStateList colorStateList = iconCompat.f221g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f1826e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f222i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f1826e.writeString(str);
        }
        String str2 = iconCompat.f223j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f1826e.writeString(str2);
        }
    }
}
