package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class zzazd implements zzazc {
    protected static volatile zzbak zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzbac zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    public zzazd(Context context) {
        try {
            zzayg.zza();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue()) {
                this.zzr = new zzbac();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzo() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        LinkedList linkedList = this.zzc;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzp(Context context, String str, int i5, View view, Activity activity, byte[] bArr) {
        zzazb zzazbVar;
        String str2;
        int i6;
        Exception exc;
        int i7;
        int i8;
        String zzb;
        zzawg zza2;
        int i9;
        int i10;
        int i11 = i5;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdm)).booleanValue();
        zzawg zzawgVar = null;
        if (booleanValue) {
            zzazbVar = zza != null ? zza.zzh() : null;
            str2 = "be";
        } else {
            zzazbVar = null;
            str2 = null;
        }
        try {
            if (i11 == 3) {
                zzawgVar = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i10 = 1002;
                } catch (Exception e4) {
                    exc = e4;
                    i6 = 3;
                    if (booleanValue) {
                        if (i11 != i6) {
                        }
                        i7 = i8;
                        zzazbVar.zza(i7, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (zzawgVar != null) {
                    }
                    zzb = Integer.toString(5);
                    return zzb;
                }
            } else {
                if (i11 == 2) {
                    zza2 = zzc(context, view, activity);
                    i9 = 1008;
                } else {
                    zza2 = zza(context, null);
                    i9 = zzbgj.zzq.zzf;
                }
                zzawgVar = zza2;
                i10 = i9;
            }
            if (!booleanValue || zzazbVar == null) {
                i6 = 3;
            } else {
                i6 = 3;
                try {
                    zzazbVar.zza(i10, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e5) {
                    e = e5;
                    exc = e;
                    if (booleanValue && zzazbVar != null) {
                        if (i11 != i6) {
                            i8 = 1003;
                        } else if (i11 == 2) {
                            i8 = 1009;
                        } else {
                            i7 = 1001;
                            i11 = 1;
                            zzazbVar.zza(i7, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        }
                        i7 = i8;
                        zzazbVar.zza(i7, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzawgVar != null) {
                    }
                    zzb = Integer.toString(5);
                    return zzb;
                }
            }
        } catch (Exception e6) {
            e = e6;
            i6 = 3;
        }
        long currentTimeMillis222 = System.currentTimeMillis();
        if (zzawgVar != null) {
            try {
            } catch (Exception e7) {
                zzb = Integer.toString(7);
                if (booleanValue && zzazbVar != null) {
                    zzazbVar.zza(i11 == i6 ? 1007 : i11 == 2 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis222, str2, e7);
                }
            }
            if (((zzaxg) zzawgVar.zzbu()).zzbr() != 0) {
                zzaxg zzaxgVar = (zzaxg) zzawgVar.zzbu();
                int i12 = zzayg.zzc;
                zzb = zzayg.zzb(zzaxgVar.zzaN(), str);
                if (booleanValue && zzazbVar != null) {
                    zzazbVar.zza(i11 == i6 ? 1006 : i11 == 2 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis222, str2, null);
                }
                return zzb;
            }
        }
        zzb = Integer.toString(5);
        return zzb;
    }

    public abstract zzawg zza(Context context, zzavs zzavsVar);

    public abstract zzawg zzb(Context context, View view, Activity activity);

    public abstract zzawg zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzazc
    public final synchronized void zzd(MotionEvent motionEvent) {
        Long l5;
        try {
            if (this.zzu) {
                zzo();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzs = motionEvent.getRawX();
                this.zzt = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d5 = rawX - this.zzs;
                double d6 = rawY - this.zzt;
                this.zzk += Math.sqrt((d6 * d6) + (d5 * d5));
                this.zzs = rawX;
                this.zzt = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.zzb = obtain;
                        LinkedList linkedList = this.zzc;
                        linkedList.add(obtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zzn(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += motionEvent.getHistorySize() + 1;
                        zzbam zzm = zzm(motionEvent);
                        Long l6 = zzm.zzd;
                        if (l6 != null && zzm.zzg != null) {
                            this.zzi = l6.longValue() + zzm.zzg.longValue() + this.zzi;
                        }
                        if (this.zzq != null && (l5 = zzm.zze) != null && zzm.zzh != null) {
                            this.zzj = l5.longValue() + zzm.zzh.longValue() + this.zzj;
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzbaa unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final synchronized void zze(int i5, int i6, int i7) {
        try {
            if (this.zzb != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdk)).booleanValue()) {
                    zzo();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f5 = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i7, 1, i5 * f5, i6 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, String str, View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbac zzbacVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue() || (zzbacVar = this.zzr) == null) {
            return;
        }
        zzbacVar.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, View view, Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        if (zzban.zzd()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    public abstract zzbam zzm(MotionEvent motionEvent);

    public abstract long zzn(StackTraceElement[] stackTraceElementArr);
}
