package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbwr extends zzbwx {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcjl zzj;
    private final Activity zzk;
    private zzclv zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbwy zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        o.g gVar = new o.g(7);
        Collections.addAll(gVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(gVar);
    }

    public zzbwr(zzcjl zzcjlVar, zzbwy zzbwyVar) {
        super(zzcjlVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcjlVar;
        this.zzk = zzcjlVar.zzj();
        this.zzo = zzbwyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z4) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmn)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmo)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmp)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcjl zzcjlVar = this.zzj;
                    viewGroup2.addView((View) zzcjlVar);
                    zzcjlVar.zzaf(this.zzl);
                } catch (IllegalStateException e4) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e4);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcjl zzcjlVar2 = this.zzj;
                viewGroup3.addView((View) zzcjlVar2);
                zzcjlVar2.zzaf(this.zzl);
            }
        }
        if (z4) {
            zzk("default");
            zzbwy zzbwyVar = this.zzo;
            if (zzbwyVar != null) {
                zzbwyVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023a, code lost:
    
        zzg("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0240, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x041a A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0017, B:12:0x001f, B:13:0x0024, B:15:0x0026, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003d, B:23:0x0042, B:25:0x0044, B:27:0x0052, B:28:0x0063, B:30:0x0071, B:31:0x0082, B:33:0x0090, B:34:0x00a1, B:36:0x00af, B:37:0x00c0, B:39:0x00ce, B:40:0x00dc, B:42:0x00ea, B:43:0x00ec, B:45:0x00f0, B:47:0x00f4, B:49:0x00fa, B:52:0x0102, B:56:0x0121, B:62:0x012d, B:64:0x023a, B:65:0x023f, B:67:0x0241, B:69:0x025e, B:71:0x026a, B:72:0x02a1, B:77:0x0313, B:78:0x036a, B:80:0x0382, B:81:0x039f, B:83:0x03a7, B:84:0x03ae, B:85:0x03d5, B:89:0x03d8, B:91:0x0406, B:92:0x0418, B:96:0x0322, B:99:0x0331, B:102:0x0340, B:105:0x034f, B:109:0x0360, B:110:0x0364, B:111:0x029e, B:112:0x041a, B:113:0x041f, B:115:0x0136, B:117:0x013a, B:121:0x014d, B:122:0x0158, B:125:0x01d2, B:127:0x01d5, B:129:0x01d9, B:132:0x01df, B:135:0x0165, B:136:0x0170, B:140:0x017f, B:143:0x0192, B:146:0x01a2, B:149:0x01b2, B:150:0x01c5, B:151:0x01ee, B:154:0x0214, B:157:0x0224, B:158:0x021a, B:160:0x0222, B:161:0x020c, B:163:0x0212, B:164:0x0229, B:165:0x0231, B:166:0x0421, B:167:0x0426, B:169:0x0428, B:170:0x042d), top: B:3:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025e A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0017, B:12:0x001f, B:13:0x0024, B:15:0x0026, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003d, B:23:0x0042, B:25:0x0044, B:27:0x0052, B:28:0x0063, B:30:0x0071, B:31:0x0082, B:33:0x0090, B:34:0x00a1, B:36:0x00af, B:37:0x00c0, B:39:0x00ce, B:40:0x00dc, B:42:0x00ea, B:43:0x00ec, B:45:0x00f0, B:47:0x00f4, B:49:0x00fa, B:52:0x0102, B:56:0x0121, B:62:0x012d, B:64:0x023a, B:65:0x023f, B:67:0x0241, B:69:0x025e, B:71:0x026a, B:72:0x02a1, B:77:0x0313, B:78:0x036a, B:80:0x0382, B:81:0x039f, B:83:0x03a7, B:84:0x03ae, B:85:0x03d5, B:89:0x03d8, B:91:0x0406, B:92:0x0418, B:96:0x0322, B:99:0x0331, B:102:0x0340, B:105:0x034f, B:109:0x0360, B:110:0x0364, B:111:0x029e, B:112:0x041a, B:113:0x041f, B:115:0x0136, B:117:0x013a, B:121:0x014d, B:122:0x0158, B:125:0x01d2, B:127:0x01d5, B:129:0x01d9, B:132:0x01df, B:135:0x0165, B:136:0x0170, B:140:0x017f, B:143:0x0192, B:146:0x01a2, B:149:0x01b2, B:150:0x01c5, B:151:0x01ee, B:154:0x0214, B:157:0x0224, B:158:0x021a, B:160:0x0222, B:161:0x020c, B:163:0x0212, B:164:0x0229, B:165:0x0231, B:166:0x0421, B:167:0x0426, B:169:0x0428, B:170:0x042d), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Map map) {
        ViewParent parent;
        int i5;
        int i6;
        int i7;
        int i8;
        synchronized (this.zzi) {
            try {
                Activity activity = this.zzk;
                if (activity == null) {
                    zzg("Not an activity context. Cannot resize.");
                    return;
                }
                zzcjl zzcjlVar = this.zzj;
                if (zzcjlVar.zzN() == null) {
                    zzg("Webview is not yet available, size is not set.");
                    return;
                }
                if (zzcjlVar.zzN().zzg()) {
                    zzg("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (zzcjlVar.zzW()) {
                    zzg("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zze = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzf = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzg = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.zza = str;
                }
                if (this.zzh < 0 || this.zze < 0) {
                    zzg("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = activity.getWindow();
                if (window != null && window.getDecorView() != null) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    int[] zzac = com.google.android.gms.ads.internal.util.zzs.zzac(activity);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    int[] zzY = com.google.android.gms.ads.internal.util.zzs.zzY(activity);
                    int i9 = zzac[0];
                    int i10 = zzac[1];
                    int i11 = this.zzh;
                    int[] iArr = null;
                    if (i11 >= 50 && i11 <= i9) {
                        int i12 = this.zze;
                        if (i12 >= 50 && i12 <= i10) {
                            if (i12 == i10 && i11 == i9) {
                                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                            } else if (this.zzb) {
                                String str2 = this.zza;
                                switch (str2.hashCode()) {
                                    case -1364013995:
                                        if (str2.equals("center")) {
                                            i5 = ((this.zzc + this.zzf) + (i11 >> 1)) - 25;
                                            i7 = ((this.zzd + this.zzg) + (i12 >> 1)) - 25;
                                            break;
                                        }
                                        i5 = ((this.zzc + this.zzf) + i11) - 50;
                                        i6 = this.zzd;
                                        i7 = i6 + this.zzg;
                                        break;
                                    case -1012429441:
                                        if (str2.equals("top-left")) {
                                            i5 = this.zzc + this.zzf;
                                            i6 = this.zzd;
                                            i7 = i6 + this.zzg;
                                            break;
                                        }
                                        i5 = ((this.zzc + this.zzf) + i11) - 50;
                                        i6 = this.zzd;
                                        i7 = i6 + this.zzg;
                                    case -655373719:
                                        if (str2.equals("bottom-left")) {
                                            i5 = this.zzc + this.zzf;
                                            i8 = this.zzd;
                                            i7 = ((i8 + this.zzg) + i12) - 50;
                                            break;
                                        }
                                        i5 = ((this.zzc + this.zzf) + i11) - 50;
                                        i6 = this.zzd;
                                        i7 = i6 + this.zzg;
                                        break;
                                    case 1163912186:
                                        if (str2.equals("bottom-right")) {
                                            i5 = ((this.zzc + this.zzf) + i11) - 50;
                                            i8 = this.zzd;
                                            i7 = ((i8 + this.zzg) + i12) - 50;
                                            break;
                                        }
                                        i5 = ((this.zzc + this.zzf) + i11) - 50;
                                        i6 = this.zzd;
                                        i7 = i6 + this.zzg;
                                        break;
                                    case 1288627767:
                                        if (str2.equals("bottom-center")) {
                                            i5 = ((this.zzc + this.zzf) + (i11 >> 1)) - 25;
                                            i8 = this.zzd;
                                            i7 = ((i8 + this.zzg) + i12) - 50;
                                            break;
                                        }
                                        i5 = ((this.zzc + this.zzf) + i11) - 50;
                                        i6 = this.zzd;
                                        i7 = i6 + this.zzg;
                                        break;
                                    case 1755462605:
                                        if (str2.equals("top-center")) {
                                            i5 = ((this.zzc + this.zzf) + (i11 >> 1)) - 25;
                                            i6 = this.zzd;
                                            i7 = i6 + this.zzg;
                                            break;
                                        }
                                        i5 = ((this.zzc + this.zzf) + i11) - 50;
                                        i6 = this.zzd;
                                        i7 = i6 + this.zzg;
                                    default:
                                        i5 = ((this.zzc + this.zzf) + i11) - 50;
                                        i6 = this.zzd;
                                        i7 = i6 + this.zzg;
                                        break;
                                }
                                if (i5 >= 0 && i5 + 50 <= i9 && i7 >= zzY[0] && i7 + 50 <= zzY[1]) {
                                    iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                }
                            } else {
                                com.google.android.gms.ads.internal.zzt.zzc();
                                int[] zzac2 = com.google.android.gms.ads.internal.util.zzs.zzac(activity);
                                com.google.android.gms.ads.internal.zzt.zzc();
                                int[] zzY2 = com.google.android.gms.ads.internal.util.zzs.zzY(activity);
                                int i14 = zzac2[0];
                                int i15 = this.zzc + this.zzf;
                                int i16 = this.zzd + this.zzg;
                                if (i15 < 0) {
                                    i15 = 0;
                                } else {
                                    int i17 = this.zzh;
                                    if (i15 + i17 > i14) {
                                        i15 = i14 - i17;
                                    }
                                }
                                int i18 = zzY2[0];
                                if (i16 < i18) {
                                    i16 = i18;
                                } else {
                                    int i19 = this.zze;
                                    int i20 = i16 + i19;
                                    int i21 = zzY2[1];
                                    if (i20 > i21) {
                                        i16 = i21 - i19;
                                    }
                                }
                                iArr = new int[]{i15, i16};
                            }
                            com.google.android.gms.ads.internal.client.zzbb.zza();
                            int zzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                            com.google.android.gms.ads.internal.client.zzbb.zza();
                            int zzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                            parent = ((View) zzcjlVar).getParent();
                            if (!(parent instanceof ViewGroup)) {
                                zzg("Webview is detached, probably in the middle of a resize or expand.");
                                return;
                            }
                            ViewGroup viewGroup = (ViewGroup) parent;
                            viewGroup.removeView((View) zzcjlVar);
                            PopupWindow popupWindow = this.zzp;
                            if (popupWindow == null) {
                                this.zzr = viewGroup;
                                com.google.android.gms.ads.internal.zzt.zzc();
                                ((View) zzcjlVar).setDrawingCacheEnabled(true);
                                Bitmap createBitmap = Bitmap.createBitmap(((View) zzcjlVar).getDrawingCache());
                                ((View) zzcjlVar).setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(activity);
                                this.zzm = imageView;
                                imageView.setImageBitmap(createBitmap);
                                this.zzl = zzcjlVar.zzN();
                                this.zzr.addView(this.zzm);
                            } else {
                                popupWindow.dismiss();
                            }
                            RelativeLayout relativeLayout = new RelativeLayout(activity);
                            this.zzq = relativeLayout;
                            relativeLayout.setBackgroundColor(0);
                            this.zzq.setLayoutParams(new ViewGroup.LayoutParams(zzC, zzC2));
                            com.google.android.gms.ads.internal.zzt.zzc();
                            PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, zzC, zzC2, false);
                            this.zzp = popupWindow2;
                            popupWindow2.setOutsideTouchable(false);
                            this.zzp.setTouchable(true);
                            this.zzp.setClippingEnabled(!this.zzb);
                            this.zzq.addView((View) zzcjlVar, -1, -1);
                            this.zzn = new LinearLayout(activity);
                            com.google.android.gms.ads.internal.client.zzbb.zza();
                            int zzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, 50);
                            com.google.android.gms.ads.internal.client.zzbb.zza();
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, 50));
                            String str3 = this.zza;
                            switch (str3.hashCode()) {
                                case -1364013995:
                                    if (str3.equals("center")) {
                                        layoutParams.addRule(13);
                                        break;
                                    }
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(11);
                                    break;
                                case -1012429441:
                                    if (str3.equals("top-left")) {
                                        layoutParams.addRule(10);
                                        layoutParams.addRule(9);
                                        break;
                                    }
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(11);
                                    break;
                                case -655373719:
                                    if (str3.equals("bottom-left")) {
                                        layoutParams.addRule(12);
                                        layoutParams.addRule(9);
                                        break;
                                    }
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(11);
                                    break;
                                case 1163912186:
                                    if (str3.equals("bottom-right")) {
                                        layoutParams.addRule(12);
                                        layoutParams.addRule(11);
                                        break;
                                    }
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(11);
                                    break;
                                case 1288627767:
                                    if (str3.equals("bottom-center")) {
                                        layoutParams.addRule(12);
                                        layoutParams.addRule(14);
                                        break;
                                    }
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(11);
                                    break;
                                case 1755462605:
                                    if (str3.equals("top-center")) {
                                        layoutParams.addRule(10);
                                        layoutParams.addRule(14);
                                        break;
                                    }
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(11);
                                    break;
                                default:
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(11);
                                    break;
                            }
                            this.zzn.setOnClickListener(new zzbwp(this));
                            this.zzn.setContentDescription("Close button");
                            this.zzq.addView(this.zzn, layoutParams);
                            try {
                                PopupWindow popupWindow3 = this.zzp;
                                View decorView = window.getDecorView();
                                com.google.android.gms.ads.internal.client.zzbb.zza();
                                int zzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[0]);
                                com.google.android.gms.ads.internal.client.zzbb.zza();
                                popupWindow3.showAtLocation(decorView, 0, zzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[1]));
                                int i22 = iArr[0];
                                int i23 = iArr[1];
                                zzbwy zzbwyVar = this.zzo;
                                if (zzbwyVar != null) {
                                    zzbwyVar.zza(i22, i23, this.zzh, this.zze);
                                }
                                this.zzj.zzaf(zzclv.zzc(zzC, zzC2));
                                int i24 = iArr[0];
                                int i25 = iArr[1];
                                com.google.android.gms.ads.internal.zzt.zzc();
                                zzi(i24, i25 - com.google.android.gms.ads.internal.util.zzs.zzY(this.zzk)[0], this.zzh, this.zze);
                                zzk("resized");
                                return;
                            } catch (RuntimeException e4) {
                                String message = e4.getMessage();
                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                sb.append("Cannot show popup window: ");
                                sb.append(message);
                                zzg(sb.toString());
                                RelativeLayout relativeLayout2 = this.zzq;
                                zzcjl zzcjlVar2 = this.zzj;
                                relativeLayout2.removeView((View) zzcjlVar2);
                                ViewGroup viewGroup2 = this.zzr;
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(this.zzm);
                                    this.zzr.addView((View) zzcjlVar2);
                                    zzcjlVar2.zzaf(this.zzl);
                                }
                                return;
                            }
                        }
                        int i26 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        int zzC5 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        int zzC22 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                        parent = ((View) zzcjlVar).getParent();
                        if (!(parent instanceof ViewGroup)) {
                        }
                    }
                    int i27 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int zzC52 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int zzC222 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                    parent = ((View) zzcjlVar).getParent();
                    if (!(parent instanceof ViewGroup)) {
                    }
                }
                zzg("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(final boolean z4) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmm)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z4);
                    } else {
                        zzcei.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwq
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzbwr.this.zzf(z4);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(int i5, int i6, boolean z4) {
        synchronized (this.zzi) {
            this.zzc = i5;
            this.zzd = i6;
        }
    }

    public final boolean zzd() {
        boolean z4;
        synchronized (this.zzi) {
            z4 = this.zzp != null;
        }
        return z4;
    }

    public final void zze(int i5, int i6) {
        this.zzc = i5;
        this.zzd = i6;
    }
}
