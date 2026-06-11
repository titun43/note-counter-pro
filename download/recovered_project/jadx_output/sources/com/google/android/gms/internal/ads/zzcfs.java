package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.b0;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzcfs extends FrameLayout implements zzcfj {
    final zzcgg zza;
    private final zzcge zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbht zze;
    private final long zzf;
    private final zzcfk zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcfs(Context context, zzcge zzcgeVar, int i5, boolean z4, zzbht zzbhtVar, zzcgd zzcgdVar, zzdxz zzdxzVar) {
        super(context);
        zzcfk zzcfiVar;
        zzbht zzbhtVar2;
        zzcfk zzcfkVar;
        this.zzb = zzcgeVar;
        this.zze = zzbhtVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        b0.g(zzcgeVar.zzk());
        zzcfl zzcflVar = zzcgeVar.zzk().zza;
        zzcgf zzcgfVar = new zzcgf(context, zzcgeVar.zzs(), zzcgeVar.zzm(), zzbhtVar, zzcgeVar.zzi());
        if (i5 == 3) {
            zzcfkVar = new zzcja(context, zzcgfVar);
            zzbhtVar2 = zzbhtVar;
        } else {
            if (i5 == 2) {
                zzcfiVar = new zzcgw(context, zzcgfVar, zzcgeVar, z4, zzcfl.zza(zzcgeVar), zzcgdVar, zzdxzVar);
                zzbhtVar2 = zzbhtVar;
            } else {
                zzbhtVar2 = zzbhtVar;
                zzcfiVar = new zzcfi(context, zzcgeVar, z4, zzcfl.zza(zzcgeVar), zzcgdVar, new zzcgf(context, zzcgeVar.zzs(), zzcgeVar.zzm(), zzbhtVar, zzcgeVar.zzi()), zzdxzVar);
            }
            zzcfkVar = zzcfiVar;
        }
        this.zzg = zzcfkVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcfkVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzap)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzam)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzar)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzao)).booleanValue();
        this.zzk = booleanValue;
        if (zzbhtVar2 != null) {
            zzbhtVar2.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcgg(this);
        zzcfkVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", hashMap);
    }

    private final void zzL() {
        zzcge zzcgeVar = this.zzb;
        if (zzcgeVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcgeVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() {
        try {
            this.zza.zza();
            final zzcfk zzcfkVar = this.zzg;
            if (zzcfkVar != null) {
                zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcfk.this.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z4) {
        super.onWindowFocusChanged(z4);
        if (z4) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcfs.this.zzG(z4);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfj
    public final void onWindowVisibilityChanged(int i5) {
        boolean z4;
        super.onWindowVisibilityChanged(i5);
        if (i5 == 0) {
            this.zza.zzb();
            z4 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z4 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfo(this, z4));
    }

    public final void zzA(int i5) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzB(i5);
    }

    public final void zzB(int i5) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzC(i5);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        TextView textView = new TextView(zzcfkVar.getContext());
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        textView.setText(String.valueOf(zzf == null ? "AdMob - " : zzf.getString(R.string.watermark_label_prefix)).concat(zzcfkVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            zzcfkVar.zzd();
        }
        zzL();
    }

    public final void zzF() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        long zzh = zzcfkVar.zzh();
        if (this.zzl == zzh || zzh <= 0) {
            return;
        }
        float f5 = zzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue()) {
            String valueOf = String.valueOf(f5);
            String valueOf2 = String.valueOf(zzcfkVar.zzo());
            String valueOf3 = String.valueOf(zzcfkVar.zzn());
            String valueOf4 = String.valueOf(zzcfkVar.zzm());
            String valueOf5 = String.valueOf(zzcfkVar.zzp());
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zzI("timeupdate", "time", valueOf, "totalBytes", valueOf2, "qoeCachedBytes", valueOf3, "qoeLoadedBytes", valueOf4, "droppedFrames", valueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f5));
        }
        this.zzl = zzh;
    }

    public final /* synthetic */ void zzG(boolean z4) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z4));
    }

    public final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfm(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzb() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzcfkVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzcfkVar.zzk()), "videoHeight", String.valueOf(zzcfkVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcy)).booleanValue()) {
            this.zza.zzb();
        }
        zzcge zzcgeVar = this.zzb;
        if (zzcgeVar.zzj() != null && !this.zzi) {
            boolean z4 = (zzcgeVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z4;
            if (!z4) {
                zzcgeVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcy)).booleanValue()) {
            this.zza.zza();
        }
        zzI("ended", new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzg(String str, String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfn(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null || this.zzp == null) {
            return;
        }
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzcfkVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (elapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbht zzbhtVar = this.zze;
            if (zzbhtVar != null) {
                zzbhtVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzj(int i5, int i6) {
        if (this.zzk) {
            zzbgv zzbgvVar = zzbhe.zzaq;
            int max = Math.max(i5 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue(), 1);
            int max2 = Math.max(i6 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcfs.this.zzH();
            }
        });
    }

    public final Integer zzl() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            return zzcfkVar.zzw();
        }
        return null;
    }

    public final void zzm(int i5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzap)).booleanValue()) {
            this.zzc.setBackgroundColor(i5);
            this.zzd.setBackgroundColor(i5);
        }
    }

    public final void zzn(int i5, int i6, int i7, int i8) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i5).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i6).length() + 3 + String.valueOf(i7).length() + 3 + String.valueOf(i8).length());
            u.s(sb, "Set video bounds to x:", i5, ";y:", i6);
            sb.append(";w:");
            sb.append(i7);
            sb.append(";h:");
            sb.append(i8);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (i7 == 0 || i8 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        layoutParams.setMargins(i5, i6, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f5, float f6) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            zzcfkVar.zzj(f5, f6);
        }
    }

    public final void zzq(Integer num) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzcfkVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzf();
    }

    public final void zzs() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zze();
    }

    public final void zzt(int i5) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzi(i5);
    }

    public final void zzu() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zza(true);
        zzcfkVar.zzq();
    }

    public final void zzv() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zza(false);
        zzcfkVar.zzq();
    }

    public final void zzw(float f5) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zzb(f5);
        zzcfkVar.zzq();
    }

    public final void zzx(int i5) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzy(i5);
    }

    public final void zzy(int i5) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzz(i5);
    }

    public final void zzz(int i5) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzA(i5);
    }
}
