package z0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class g extends Binder implements IInterface {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f3911g;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3911g = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
        b bVar = null;
        if (i5 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                    bVar = new b();
                    bVar.f3895g = readStrongBinder;
                } else {
                    bVar = (b) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            int i7 = 0;
            if (readString != null) {
                synchronized (this.f3911g.f599i) {
                    try {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3911g;
                        int i8 = multiInstanceInvalidationService.f598g + 1;
                        multiInstanceInvalidationService.f598g = i8;
                        if (multiInstanceInvalidationService.f599i.register(bVar, Integer.valueOf(i8))) {
                            this.f3911g.h.put(Integer.valueOf(i8), readString);
                            i7 = i8;
                        } else {
                            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f3911g;
                            multiInstanceInvalidationService2.f598g--;
                        }
                    } finally {
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i7);
            return true;
        }
        if (i5 == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof b)) {
                    bVar = new b();
                    bVar.f3895g = readStrongBinder2;
                } else {
                    bVar = (b) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            synchronized (this.f3911g.f599i) {
                this.f3911g.f599i.unregister(bVar);
                this.f3911g.h.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i5 != 3) {
            if (i5 != 1598968902) {
                return super.onTransact(i5, parcel, parcel2, i6);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        int readInt2 = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        synchronized (this.f3911g.f599i) {
            try {
                String str = (String) this.f3911g.h.get(Integer.valueOf(readInt2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = this.f3911g.f599i.beginBroadcast();
                    for (int i9 = 0; i9 < beginBroadcast; i9++) {
                        try {
                            Integer num = (Integer) this.f3911g.f599i.getBroadcastCookie(i9);
                            int intValue = num.intValue();
                            String str2 = (String) this.f3911g.h.get(num);
                            if (readInt2 != intValue && str.equals(str2)) {
                                try {
                                    ((b) this.f3911g.f599i.getBroadcastItem(i9)).a(createStringArray);
                                } catch (RemoteException e4) {
                                    Log.w("ROOM", "Error invoking a remote callback", e4);
                                }
                            }
                        } finally {
                            this.f3911g.f599i.finishBroadcast();
                        }
                    }
                }
            } finally {
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
