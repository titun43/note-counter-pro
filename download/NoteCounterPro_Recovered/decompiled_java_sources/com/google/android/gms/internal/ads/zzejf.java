package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.impl.R;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import u.n;
import u.p;
import u.v;

/* loaded from: classes.dex */
public final class zzejf extends zzbxk {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdxz zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzeiu zze;
    private String zzf;
    private String zzg;

    public zzejf(Context context, zzeiu zzeiuVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdxz zzdxzVar) {
        this.zzb = context;
        this.zzc = zzdxzVar;
        this.zzd = zzuVar;
        this.zze = zzeiuVar;
    }

    public static void zzd(Context context, zzdxz zzdxzVar, zzeiu zzeiuVar, String str, String str2) {
        zzk(context, zzdxzVar, zzeiuVar, str, str2, new HashMap());
    }

    public static void zzk(Context context, zzdxz zzdxzVar, zzeiu zzeiuVar, String str, String str2, Map map) {
        String str3;
        String str4 = true != com.google.android.gms.ads.internal.zzt.zzh().zzs(context) ? "offline" : n.a.ONLINE_EXTRAS_KEY;
        if (zzdxzVar != null) {
            zzdxy zza = zzdxzVar.zza();
            zza.zzc("gqi", str);
            zza.zzc("action", str2);
            zza.zzc("device_connectivity", str4);
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zza.zzc("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza.zzg();
        } else {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String str5 = str3;
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        zzeiuVar.zze(new zzeiw(System.currentTimeMillis(), str, str5, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzgog.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzgog.zza(context, 0, intent, 201326592);
    }

    private final void zzs(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (new v(activity).f3490a.areNotificationsEnabled()) {
            zzt();
            zzu(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzgui.zza());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder zzP = com.google.android.gms.ads.internal.util.zzs.zzP(activity);
            zzP.setTitle(zzx(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzx(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeja
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i5) {
                    zzejf.this.zzo(activity, zzmVar, dialogInterface, i5);
                }
            }).setNegativeButton(zzx(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzejb
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i5) {
                    zzejf.this.zzp(zzmVar, dialogInterface, i5);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzejc
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    zzejf.this.zzq(zzmVar, dialogInterface);
                }
            });
            zzP.create().show();
            zzw(this.zzf, "rtsdi", zzgui.zza());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzt() {
        boolean z4;
        boolean z5;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zzb;
            com.google.android.gms.ads.internal.util.zzbo zzE = com.google.android.gms.ads.internal.util.zzs.zzE(context);
            a3.b bVar = new a3.b(context);
            String str = this.zzg;
            String str2 = this.zzf;
            zzeim zzeimVar = (zzeim) this.zza.get(str2);
            z4 = zzE.zzg(bVar, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzeimVar == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzeimVar.zzb()));
            if (z4) {
                z5 = true;
            } else {
                try {
                    z5 = zzE.zze(new a3.b(context), this.zzg, this.zzf);
                } catch (RemoteException e4) {
                    e = e4;
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to schedule offline notification poster.", e);
                    z5 = z4;
                    if (z5) {
                    }
                }
            }
        } catch (RemoteException e5) {
            e = e5;
            z4 = false;
        }
        if (z5) {
            this.zze.zzd(this.zzf);
            zzw(this.zzf, "offline_notification_worker_not_scheduled", zzgui.zza());
        }
    }

    private final void zzu(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog zzv = zzv(activity, zzmVar);
        zzv.show();
        Timer timer = new Timer();
        timer.schedule(new zzeix(this, zzv, timer, zzmVar), 3000L);
    }

    private final AlertDialog zzv(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzP(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzejd
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        XmlResourceParser zzy = zzy(R.layout.offline_ads_dialog);
        if (zzy == null) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View inflate = activity.getLayoutInflater().inflate(zzy, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzz = zzz();
            if (!TextUtils.isEmpty(zzz)) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzz);
            }
            zzeim zzeimVar = (zzeim) this.zza.get(this.zzf);
            Drawable zzc = zzeimVar != null ? zzeimVar.zzc() : null;
            if (zzc != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(zzc);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static String zzx(int i5, String str) {
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (zzf == null) {
            return str;
        }
        try {
            return zzf.getString(i5);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private static XmlResourceParser zzy(int i5) {
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (zzf == null) {
            return null;
        }
        try {
            return zzf.getLayout(i5);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzz() {
        zzeim zzeimVar = (zzeim) this.zza.get(this.zzf);
        return zzeimVar == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzeimVar.zza();
    }

    public final void zzc(String str, zzdoh zzdohVar) {
        String zzQ = zzdohVar.zzQ();
        String zzB = zzdohVar.zzB();
        boolean isEmpty = TextUtils.isEmpty(zzQ);
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (isEmpty) {
            zzQ = zzB != null ? zzB : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzbks zzD = zzdohVar.zzD();
        if (zzD != null) {
            try {
                str2 = zzD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbks zzP = zzdohVar.zzP();
        Drawable drawable = null;
        if (zzP != null) {
            try {
                a3.a zzb = zzP.zzb();
                if (zzb != null) {
                    drawable = (Drawable) a3.b.b(zzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzeij(zzQ, str2, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(context);
                HashMap hashMap = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r9 = true == zzs ? (char) 1 : (char) 2;
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith(Bridge.CAPACITOR_HTTP_SCHEME)));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (r9 == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzeiu.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e4) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e4.toString());
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(concat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzf(a3.a aVar, String str, String str2) {
        zzj(aVar, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzg() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzeis
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) {
                zzeiu.zzf(com.google.android.gms.ads.internal.util.client.zzu.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzh(a3.a aVar) {
        zzejh zzejhVar = (zzejh) a3.b.b(aVar);
        final Activity zza = zzejhVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzejhVar.zzb();
        this.zzf = zzejhVar.zzc();
        this.zzg = zzejhVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjM)).booleanValue()) {
            zzs(zza, zzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzgui.zza());
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder zzP = com.google.android.gms.ads.internal.util.zzs.zzP(zza);
        zzP.setTitle(zzx(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzx(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeje
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i5) {
                zzejf.this.zzl(zza, zzb, dialogInterface, i5);
            }
        }).setNegativeButton(zzx(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeiy
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i5) {
                zzejf.this.zzm(zzb, dialogInterface, i5);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                zzejf.this.zzn(zzb, dialogInterface);
            }
        });
        zzP.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzi(String[] strArr, int[] iArr, a3.a aVar) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (strArr[i5].equals("android.permission.POST_NOTIFICATIONS")) {
                zzejh zzejhVar = (zzejh) a3.b.b(aVar);
                Activity zza = zzejhVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzejhVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i5] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzt();
                    zzu(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e0, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbxl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(a3.a aVar, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmap;
        Context context = (Context) a3.b.b(aVar);
        String str = zzaVar.zza;
        String str2 = zzaVar.zzb;
        String str3 = zzaVar.zzc;
        String zzz = zzz();
        com.google.android.gms.ads.internal.zzt.zzf().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent zzr = zzr(context, "offline_notification_clicked", str2, str);
        PendingIntent zzr2 = zzr(context, "offline_notification_dismissed", str2, str);
        p pVar = new p(context, "offline_notification_channel");
        if (TextUtils.isEmpty(zzz)) {
            pVar.f3477e = p.b(zzx(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            pVar.f3477e = p.b(String.format(zzx(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), zzz));
        }
        Notification notification = pVar.f3487p;
        notification.flags |= 16;
        notification.deleteIntent = zzr2;
        pVar.f3479g = zzr;
        pVar.f3487p.icon = context.getApplicationInfo().icon;
        pVar.f3480i = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjN)).intValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjP)).booleanValue() && !str3.isEmpty()) {
            try {
                bitmap = BitmapFactory.decodeStream(new URL(str3).openConnection().getInputStream());
            } catch (IOException unused) {
            }
            if (bitmap != null) {
                try {
                    pVar.c(bitmap);
                    n nVar = new n();
                    IconCompat iconCompat = new IconCompat(1);
                    iconCompat.f216b = bitmap;
                    nVar.f3469b = iconCompat;
                    nVar.f3470c = null;
                    nVar.f3471d = true;
                    pVar.d(nVar);
                } catch (Resources.NotFoundException unused2) {
                }
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            HashMap hashMap = new HashMap();
            notificationManager.notify(str2, 54321, pVar.a());
            String str4 = "offline_notification_impression";
            zzw(str2, str4, hashMap);
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str2, 54321, pVar.a());
        String str42 = "offline_notification_impression";
        zzw(str2, str42, hashMap2);
    }

    public final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzw(this.zzf, "dialog_click", hashMap);
        zzs(activity, zzmVar);
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i5) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzo(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzw(this.zzf, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzf().zzi(activity));
        zzt();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i5) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzq(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}
