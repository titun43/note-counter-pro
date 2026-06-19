package u;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.lokhnathtechnical.notecounterpro.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3473a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3477e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3478f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f3479g;
    public IconCompat h;

    /* renamed from: i, reason: collision with root package name */
    public int f3480i;

    /* renamed from: k, reason: collision with root package name */
    public q f3482k;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f3484m;

    /* renamed from: n, reason: collision with root package name */
    public String f3485n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3486o;

    /* renamed from: p, reason: collision with root package name */
    public final Notification f3487p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f3488q;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3474b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3475c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3476d = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3481j = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3483l = false;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f3487p = notification;
        this.f3473a = context;
        this.f3485n = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f3480i = 0;
        this.f3488q = new ArrayList();
        this.f3486o = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification a() {
        Bundle bundle;
        int i5;
        ArrayList arrayList;
        int i6;
        r1.h hVar = new r1.h();
        new ArrayList();
        hVar.f3163j = new Bundle();
        hVar.f3162i = this;
        Context context = this.f3473a;
        hVar.f3161g = context;
        if (Build.VERSION.SDK_INT >= 26) {
            hVar.h = r.a(context, this.f3485n);
        } else {
            hVar.h = new Notification.Builder(context);
        }
        Notification.Builder builder = (Notification.Builder) hVar.h;
        Notification notification = this.f3487p;
        Context context2 = null;
        int i7 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f3477e).setContentText(this.f3478f).setContentInfo(null).setContentIntent(this.f3479g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder2 = (Notification.Builder) hVar.h;
        IconCompat iconCompat = this.h;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) hVar.h).setSubText(null).setUsesChronometer(false).setPriority(this.f3480i);
        ArrayList arrayList2 = this.f3474b;
        int size = arrayList2.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList2.get(i8);
            i8++;
            k kVar = (k) obj;
            int i9 = Build.VERSION.SDK_INT;
            if (kVar.f3463b == null && (i6 = kVar.f3466e) != 0) {
                kVar.f3463b = IconCompat.b(i6);
            }
            IconCompat iconCompat2 = kVar.f3463b;
            boolean z4 = kVar.f3464c;
            Bundle bundle2 = kVar.f3462a;
            Notification.Action.Builder builder3 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, kVar.f3467f, kVar.f3468g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z4);
            builder3.setAllowGeneratedReplies(z4);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i9 >= 28) {
                s.a(builder3);
            }
            if (i9 >= 29) {
                f.d(builder3);
            }
            if (i9 >= 31) {
                t.a(builder3);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", kVar.f3465d);
            builder3.addExtras(bundle3);
            ((Notification.Builder) hVar.h).addAction(builder3.build());
            context2 = null;
        }
        Bundle bundle4 = this.f3484m;
        if (bundle4 != null) {
            ((Bundle) hVar.f3163j).putAll(bundle4);
        }
        int i10 = Build.VERSION.SDK_INT;
        ((Notification.Builder) hVar.h).setShowWhen(this.f3481j);
        ((Notification.Builder) hVar.h).setLocalOnly(this.f3483l);
        ((Notification.Builder) hVar.h).setGroup(null);
        ((Notification.Builder) hVar.h).setSortKey(null);
        ((Notification.Builder) hVar.h).setGroupSummary(false);
        ((Notification.Builder) hVar.h).setCategory(null);
        ((Notification.Builder) hVar.h).setColor(0);
        ((Notification.Builder) hVar.h).setVisibility(0);
        ((Notification.Builder) hVar.h).setPublicVersion(null);
        ((Notification.Builder) hVar.h).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.f3488q;
        ArrayList arrayList4 = this.f3475c;
        if (i10 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    o.g gVar = new o.g(arrayList3.size() + arrayList.size());
                    gVar.addAll(arrayList);
                    gVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(gVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                ((Notification.Builder) hVar.h).addPerson((String) obj2);
            }
        }
        ArrayList arrayList5 = this.f3476d;
        if (arrayList5.size() > 0) {
            if (this.f3484m == null) {
                this.f3484m = new Bundle();
            }
            Bundle bundle5 = this.f3484m.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i12 = 0;
            while (i12 < arrayList5.size()) {
                String num = Integer.toString(i12);
                k kVar2 = (k) arrayList5.get(i12);
                Bundle bundle8 = new Bundle();
                if (kVar2.f3463b == null && (i5 = kVar2.f3466e) != 0) {
                    kVar2.f3463b = IconCompat.b(i5);
                }
                IconCompat iconCompat3 = kVar2.f3463b;
                Bundle bundle9 = kVar2.f3462a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i7);
                bundle8.putCharSequence("title", kVar2.f3467f);
                bundle8.putParcelable("actionIntent", kVar2.f3468g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", kVar2.f3464c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", kVar2.f3465d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i12++;
                i7 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f3484m == null) {
                this.f3484m = new Bundle();
            }
            this.f3484m.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) hVar.f3163j).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i13 = Build.VERSION.SDK_INT;
        ((Notification.Builder) hVar.h).setExtras(this.f3484m);
        ((Notification.Builder) hVar.h).setRemoteInputHistory(null);
        if (i13 >= 26) {
            r.b((Notification.Builder) hVar.h);
            r.d((Notification.Builder) hVar.h);
            r.e((Notification.Builder) hVar.h);
            r.f((Notification.Builder) hVar.h);
            r.c((Notification.Builder) hVar.h);
            if (!TextUtils.isEmpty(this.f3485n)) {
                ((Notification.Builder) hVar.h).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i13 >= 29) {
            f.b((Notification.Builder) hVar.h, this.f3486o);
            f.c((Notification.Builder) hVar.h);
        }
        if (i13 >= 36) {
            u.a((Notification.Builder) hVar.h);
        }
        p pVar = (p) hVar.f3162i;
        q qVar = pVar.f3482k;
        if (qVar != null) {
            qVar.a(hVar);
        }
        Notification.Builder builder4 = (Notification.Builder) hVar.h;
        Notification build = Build.VERSION.SDK_INT >= 26 ? builder4.build() : builder4.build();
        if (qVar != null) {
            pVar.f3482k.getClass();
        }
        if (qVar != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", qVar.b());
        }
        return build;
    }

    public final void c(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f3473a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        PorterDuff.Mode mode = IconCompat.f214k;
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f216b = bitmap;
        this.h = iconCompat;
    }

    public final void d(q qVar) {
        if (this.f3482k != qVar) {
            this.f3482k = qVar;
            if (qVar.f3489a != this) {
                qVar.f3489a = this;
                d(qVar);
            }
        }
    }
}
