package y1;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3850c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3851d;

    public /* synthetic */ k(b bVar, Object obj, Object obj2, int i5) {
        this.f3848a = i5;
        this.f3849b = bVar;
        this.f3850c = obj;
        this.f3851d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Exception exc;
        DeadObjectException deadObjectException;
        zzan zzanVar;
        String str;
        int i5;
        String zzh;
        i3.a aVar;
        zzan zzanVar2;
        zzan zzanVar3;
        switch (this.f3848a) {
            case 0:
                b bVar = this.f3849b;
                androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.f3850c;
                a2.c cVar = (a2.c) this.f3851d;
                bVar.getClass();
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = rVar.h;
                try {
                    zze.zzk("BillingClient", "Consuming purchase with token: " + str3);
                    synchronized (bVar.f3788a) {
                        try {
                            try {
                                zzanVar = bVar.h;
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } catch (DeadObjectException e4) {
                            e = e4;
                        } catch (Exception e5) {
                            e = e5;
                        }
                    }
                    if (zzanVar == null) {
                        try {
                            str2 = str3;
                        } catch (DeadObjectException e6) {
                            e = e6;
                            str = str3;
                            deadObjectException = e;
                            str2 = str;
                            bVar.q(cVar, str2, b0.f3818i, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e7) {
                            e = e7;
                            str = str3;
                            exc = e;
                            str2 = str;
                            bVar.q(cVar, str2, b0.f3817g, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                        try {
                            bVar.q(cVar, str2, b0.f3818i, 119, "Service has been reset to null.", null);
                            return null;
                        } catch (DeadObjectException e8) {
                            e = e8;
                            deadObjectException = e;
                            bVar.q(cVar, str2, b0.f3818i, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e9) {
                            e = e9;
                            exc = e;
                            bVar.q(cVar, str2, b0.f3817g, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    }
                    str = str3;
                    try {
                        if (bVar.f3799m) {
                            try {
                                String packageName = bVar.f3793f.getPackageName();
                                boolean z4 = bVar.f3799m;
                                String str4 = bVar.f3790c;
                                long longValue = bVar.f3810y.longValue();
                                Bundle bundle = new Bundle();
                                if (z4) {
                                    zze.zzc(bundle, str4, longValue);
                                }
                                Bundle zze = zzanVar.zze(9, packageName, str, bundle);
                                i5 = zze.getInt("RESPONSE_CODE");
                                zzh = zze.zzh(zze, "BillingClient");
                            } catch (DeadObjectException e10) {
                                e = e10;
                                deadObjectException = e;
                                str2 = str;
                                bVar.q(cVar, str2, b0.f3818i, 29, "Error consuming purchase!", deadObjectException);
                                return null;
                            } catch (Exception e11) {
                                e = e11;
                                exc = e;
                                str2 = str;
                                bVar.q(cVar, str2, b0.f3817g, 29, "Error consuming purchase!", exc);
                                return null;
                            }
                        } else {
                            i5 = zzanVar.zza(3, bVar.f3793f.getPackageName(), str);
                            zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        e a5 = b0.a(i5, zzh);
                        if (i5 == 0) {
                            zze.zzk("BillingClient", "Successfully consumed purchase.");
                            cVar.b(a5, str);
                            return null;
                        }
                        bVar.q(cVar, str, a5, 23, "Error consuming purchase with token. Response code: " + i5, null);
                        return null;
                    } catch (DeadObjectException e12) {
                        e = e12;
                        str2 = str;
                        deadObjectException = e;
                        bVar.q(cVar, str2, b0.f3818i, 29, "Error consuming purchase!", deadObjectException);
                        return null;
                    } catch (Exception e13) {
                        e = e13;
                        str2 = str;
                        exc = e;
                        bVar.q(cVar, str2, b0.f3817g, 29, "Error consuming purchase!", exc);
                        return null;
                    }
                } catch (DeadObjectException e14) {
                    e = e14;
                    str2 = str3;
                } catch (Exception e15) {
                    e = e15;
                    str2 = str3;
                }
            case 1:
                b bVar2 = this.f3849b;
                u1.f fVar = (u1.f) this.f3850c;
                ArrayList arrayList = new ArrayList();
                ((j) ((zzco) fVar.h).get(0)).getClass();
                zzco zzcoVar = (zzco) fVar.h;
                int size = zzcoVar.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        int i7 = i6 + 20;
                        ArrayList arrayList2 = new ArrayList(zzcoVar.subList(i6, i7 > size ? size : i7));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            ((j) arrayList2.get(i8)).getClass();
                            arrayList3.add("note_counter_pro_premium");
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle2.putString("playBillingLibraryVersion", bVar2.f3790c);
                        try {
                            synchronized (bVar2.f3788a) {
                                zzanVar2 = bVar2.h;
                            }
                            if (zzanVar2 == null) {
                                aVar = bVar2.o(b0.f3818i, 119, "Service has been reset to null.", null);
                            } else {
                                int i9 = true != bVar2.f3805s ? 17 : 20;
                                String packageName2 = bVar2.f3793f.getPackageName();
                                if (bVar2.f3804r) {
                                    bVar2.f3807u.getClass();
                                }
                                String str5 = bVar2.f3790c;
                                bVar2.h();
                                bVar2.h();
                                bVar2.h();
                                bVar2.h();
                                long longValue2 = bVar2.f3810y.longValue();
                                Bundle bundle3 = new Bundle();
                                zze.zzc(bundle3, str5, longValue2);
                                bundle3.putBoolean("enablePendingPurchases", true);
                                bundle3.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                                ArrayList<String> arrayList4 = new ArrayList<>();
                                ArrayList<String> arrayList5 = new ArrayList<>();
                                int size3 = arrayList2.size();
                                int i10 = 0;
                                boolean z5 = false;
                                while (i10 < size3) {
                                    j jVar = (j) arrayList2.get(i10);
                                    arrayList4.add(null);
                                    z5 |= !TextUtils.isEmpty(null);
                                    jVar.getClass();
                                    i10++;
                                    size = size;
                                }
                                int i11 = size;
                                if (z5) {
                                    bundle3.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                                }
                                if (!arrayList5.isEmpty()) {
                                    bundle3.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                                }
                                Bundle zzl = zzanVar2.zzl(i9, packageName2, "inapp", bundle2, bundle3);
                                if (zzl == null) {
                                    aVar = bVar2.o(b0.f3824o, 44, "queryProductDetailsAsync got empty product details response.", null);
                                } else if (zzl.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = zzl.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList != null) {
                                        for (int i12 = 0; i12 < stringArrayList.size(); i12++) {
                                            try {
                                                h hVar = new h(stringArrayList.get(i12));
                                                zze.zzk("BillingClient", "Got product details: ".concat(hVar.toString()));
                                                arrayList.add(hVar);
                                            } catch (JSONException e16) {
                                                aVar = bVar2.o(b0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e16);
                                            }
                                        }
                                        i6 = i7;
                                        size = i11;
                                    } else {
                                        aVar = bVar2.o(b0.f3824o, 46, "queryProductDetailsAsync got null response list", null);
                                    }
                                } else {
                                    int zzb = zze.zzb(zzl, "BillingClient");
                                    String zzh2 = zze.zzh(zzl, "BillingClient");
                                    aVar = zzb != 0 ? bVar2.o(b0.a(zzb, zzh2), 23, androidx.emoji2.text.u.h(zzb, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : bVar2.o(b0.a(6, zzh2), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                                }
                            }
                        } catch (DeadObjectException e17) {
                            aVar = bVar2.o(b0.f3818i, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e17);
                        } catch (Exception e18) {
                            aVar = bVar2.o(b0.f3817g, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e18);
                        }
                    } else {
                        aVar = new i3.a(0, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, arrayList);
                    }
                }
                ((com.getcapacitor.plugin.c) this.f3851d).f(b0.a(aVar.f1855a, (String) aVar.f1857c), (ArrayList) aVar.f1856b);
                return null;
            default:
                b bVar3 = this.f3849b;
                String str6 = (String) this.f3850c;
                String str7 = (String) this.f3851d;
                try {
                    synchronized (bVar3.f3788a) {
                        zzanVar3 = bVar3.h;
                    }
                    return zzanVar3 == null ? zze.zzn(b0.f3818i, 119) : zzanVar3.zzf(3, bVar3.f3793f.getPackageName(), str6, str7, null);
                } catch (DeadObjectException e19) {
                    return zze.zzo(b0.f3818i, 5, z.a(e19));
                } catch (Exception e20) {
                    return zze.zzo(b0.f3817g, 5, z.a(e20));
                }
        }
    }
}
