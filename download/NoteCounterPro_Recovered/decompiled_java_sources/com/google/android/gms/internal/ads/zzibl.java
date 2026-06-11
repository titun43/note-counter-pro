package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzibl;
import com.google.android.gms.internal.ads.zzibr;
import java.io.IOException;

/* loaded from: classes.dex */
public class zzibl<MessageType extends zzibr<MessageType, BuilderType>, BuilderType extends zzibl<MessageType, BuilderType>> extends zzhzv<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzibl(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbg();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzidm.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    /* renamed from: zzaE */
    public /* bridge */ /* synthetic */ zzhzv zzbd(zziaq zziaqVar, zzibb zzibbVar) {
        zzbr(zziaqVar, zzibbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    /* renamed from: zzaI */
    public /* bridge */ /* synthetic */ zzhzv zzaZ(byte[] bArr, int i5, int i6) {
        zzbq(bArr, i5, i6);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzhzv zzaX(byte[] bArr, int i5, int i6, zzibb zzibbVar) {
        zzbp(bArr, i5, i6, zzibbVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhzv
    public /* bridge */ /* synthetic */ zzhzv zzaQ(zzhzw zzhzwVar) {
        zzbn((zzibr) zzhzwVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    public /* bridge */ /* synthetic */ zzidb zzaX(byte[] bArr, int i5, int i6, zzibb zzibbVar) {
        zzbp(bArr, i5, i6, zzibbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    public /* bridge */ /* synthetic */ zzidb zzaZ(byte[] bArr, int i5, int i6) {
        zzbq(bArr, i5, i6);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    public /* bridge */ /* synthetic */ zzidb zzbd(zziaq zziaqVar, zzibb zzibbVar) {
        zzbr(zziaqVar, zzibbVar);
        return this;
    }

    public final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    public void zzbh() {
        MessageType zza = zza();
        zzb(zza, this.zza);
        this.zza = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    public final boolean zzbi() {
        boolean zzg;
        zzg = zzibr.zzg(this.zza, false);
        return zzg;
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    /* renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzcY();
        buildertype.zza = zzbt();
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzidb
    /* renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzbm();
        return this.zza;
    }

    /* renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbu() {
        MessageType zzbt = zzbt();
        if (zzbt.zzbi()) {
            return zzbt;
        }
        throw zzhzv.zzaR(zzbt);
    }

    public BuilderType zzbn(MessageType messagetype) {
        zzbo(messagetype);
        return this;
    }

    public BuilderType zzbo(MessageType messagetype) {
        if (zzbw().equals(messagetype)) {
            return this;
        }
        zzbg();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbp(byte[] bArr, int i5, int i6, zzibb zzibbVar) {
        zzbg();
        try {
            zzidm.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i5, i5 + i6, new zziab(zzibbVar));
            return this;
        } catch (zzicg e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e5);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbq(byte[] bArr, int i5, int i6) {
        int i7 = zzibb.zzb;
        int i8 = zziaa.zza;
        zzbp(bArr, i5, i6, zzibb.zza);
        return this;
    }

    public BuilderType zzbr(zziaq zziaqVar, zzibb zzibbVar) {
        zzbg();
        try {
            zzidm.zza().zzb(this.zza.getClass()).zzg(this.zza, zziar.zza(zziaqVar), zzibbVar);
            return this;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof IOException) {
                throw ((IOException) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    /* renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzidb zzbv() {
        zzbj();
        return this;
    }
}
