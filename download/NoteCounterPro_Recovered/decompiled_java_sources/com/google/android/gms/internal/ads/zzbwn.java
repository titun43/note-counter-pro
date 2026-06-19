package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbwn implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwo zza;

    public zzbwn(zzbwo zzbwoVar) {
        Objects.requireNonNull(zzbwoVar);
        this.zza = zzbwoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        this.zza.zzg("Operation denied by user.");
    }
}
