package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdpg {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfjk zzc;
    private final zzdom zzd;
    private final zzdoh zze;
    private final zzdpu zzf;
    private final zzdqc zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbkh zzj;
    private final zzdoe zzk;

    public zzdpg(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfjk zzfjkVar, zzdom zzdomVar, zzdoh zzdohVar, zzdpu zzdpuVar, zzdqc zzdqcVar, Executor executor, Executor executor2, zzdoe zzdoeVar) {
        this.zzb = zzgVar;
        this.zzc = zzfjkVar;
        this.zzj = zzfjkVar.zzj;
        this.zzd = zzdomVar;
        this.zze = zzdohVar;
        this.zzf = zzdpuVar;
        this.zzg = zzdqcVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdoeVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i5) {
        if (i5 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i5 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i5 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z4) {
        View zzJ = z4 ? this.zze.zzJ() : this.zze.zzK();
        if (zzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzJ.getParent()).removeView(zzJ);
        }
        viewGroup.addView(zzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeJ)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdqe zzdqeVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdpg.this.zzf(zzdqeVar);
            }
        });
    }

    public final void zzb(zzdqe zzdqeVar) {
        zzdpu zzdpuVar;
        if (zzdqeVar == null || (zzdpuVar = this.zzf) == null || zzdqeVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdqeVar.zzdA().addView(zzdpuVar.zza());
        } catch (zzcka e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e4);
        }
    }

    public final void zzc(zzdqe zzdqeVar) {
        if (zzdqeVar == null) {
            return;
        }
        Context context = zzdqeVar.zzdE().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdqc zzdqcVar = this.zzg;
            if (zzdqcVar == null || zzdqeVar.zzdA() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdqcVar.zza(zzdqeVar.zzdA(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzcka e4) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e4);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final /* synthetic */ void zzf(zzdqe zzdqeVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbkp zza2;
        Drawable drawable;
        zzdom zzdomVar = this.zzd;
        if (zzdomVar.zze() || zzdomVar.zzc()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i5 = 0; i5 < 2; i5++) {
                View zzm = zzdqeVar.zzm(strArr[i5]);
                if (zzm instanceof ViewGroup) {
                    viewGroup = (ViewGroup) zzm;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdqeVar.zzdE().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdoh zzdohVar = this.zze;
        if (zzdohVar.zzA() != null) {
            view = zzdohVar.zzA();
            zzbkh zzbkhVar = this.zzj;
            if (zzbkhVar != null && viewGroup == null) {
                zzh(layoutParams, zzbkhVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdohVar.zzz() instanceof zzbka) {
            zzbka zzbkaVar = (zzbka) zzdohVar.zzz();
            if (viewGroup == null) {
                zzh(layoutParams, zzbkaVar.zzi());
                viewGroup = null;
            }
            View zzbkbVar = new zzbkb(context, zzbkaVar, layoutParams);
            zzbkbVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeH));
            view = zzbkbVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdqeVar.zzdE().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzdA = zzdqeVar.zzdA();
                if (zzdA != null) {
                    zzdA.addView(zzaVar);
                }
            }
            zzdqeVar.zzi(zzdqeVar.zzn(), view, true);
        }
        zzguf zzgufVar = zzdpc.zza;
        int size = zzgufVar.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzm2 = zzdqeVar.zzm((String) zzgufVar.get(i6));
            i6++;
            if (zzm2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzm2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdpg.this.zzg(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            if (zzdohVar.zzT() != null) {
                zzdohVar.zzT().zzaq(new zzdpd(zzdqeVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlx)).booleanValue() && zzi(viewGroup2, false)) {
            if (zzdohVar.zzU() != null) {
                zzdohVar.zzU().zzaq(new zzdpd(zzdqeVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzdE = zzdqeVar.zzdE();
        Context context2 = zzdE != null ? zzdE.getContext() : null;
        if (context2 == null || (zza2 = this.zzk.zza()) == null) {
            return;
        }
        try {
            a3.a zzg = zza2.zzg();
            if (zzg == null || (drawable = (Drawable) a3.b.b(zzg)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            a3.a zzo = zzdqeVar.zzo();
            if (zzo != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhe)).booleanValue()) {
                    imageView.setScaleType((ImageView.ScaleType) a3.b.b(zzo));
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
            imageView.setScaleType(zza);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get main image drawable");
        }
    }

    public final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdoh zzdohVar = this.zze;
        if (zzdohVar.zzJ() != null) {
            boolean z4 = viewGroup != null;
            if (zzdohVar.zzx() == 2 || zzdohVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdohVar.zzx()), z4);
            } else if (zzdohVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, "2", z4);
                zzgVar.zzr(str, "1", z4);
            }
        }
    }
}
