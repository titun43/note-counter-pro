package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class zzdpk implements GestureDetector.OnGestureListener {
    private final zzdoc zza;
    private final zzdpc zzb;

    public zzdpk(zzdoc zzdocVar, zzdpc zzdpcVar) {
        this.zza = zzdocVar;
        this.zzb = zzdpcVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0001, B:9:0x0008, B:13:0x001c, B:14:0x0064, B:16:0x006a, B:22:0x0030, B:26:0x0044, B:29:0x0057), top: B:2:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        int y2;
        try {
            zzdoc zzdocVar = this.zza;
            if (zzdocVar != null) {
                int i5 = -1;
                if (Math.abs(f5) > Math.abs(f6)) {
                    if (f5 > 0.0f) {
                        y2 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f5) * 1000.0f);
                        i5 = 1;
                    } else {
                        if (f5 < 0.0f) {
                            y2 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f5) * 1000.0f);
                            i5 = 2;
                        }
                        y2 = 0;
                    }
                    if (i5 == zzdocVar.zzG()) {
                        zzdocVar.zzE(this.zzb.zzr(), y2);
                        return false;
                    }
                } else {
                    if (f6 > 0.0f) {
                        y2 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f6) * 1000.0f);
                        i5 = 8;
                    } else {
                        if (f6 < 0.0f) {
                            y2 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f6) * 1000.0f);
                            i5 = 4;
                        }
                        y2 = 0;
                    }
                    if (i5 == zzdocVar.zzG()) {
                    }
                }
            }
            return false;
        } finally {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
