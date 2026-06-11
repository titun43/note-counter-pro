package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbgj;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzpc implements zzmx {
    private final zzdn zza;
    private final zzbd zzb;
    private final zzbe zzc;
    private final zzpb zzd;
    private final SparseArray zze;
    private zzed zzf;
    private zzbb zzg;
    private zzdx zzh;
    private boolean zzi;

    public zzpc(zzdn zzdnVar) {
        zzdnVar.getClass();
        this.zza = zzdnVar;
        this.zzf = new zzed(zzfj.zze().getThread());
        zzbd zzbdVar = new zzbd();
        this.zzb = zzbdVar;
        this.zzc = new zzbe();
        this.zzd = new zzpb(zzbdVar);
        this.zze = new SparseArray();
    }

    private final zzmy zzad(zzwk zzwkVar) {
        this.zzg.getClass();
        zzbf zze = zzwkVar == null ? null : this.zzd.zze(zzwkVar);
        if (zzwkVar != null && zze != null) {
            return zzaa(zze, zze.zzo(zzwkVar.zza, this.zzb).zzc, zzwkVar);
        }
        int zzs = this.zzg.zzs();
        zzbf zzq = this.zzg.zzq();
        if (zzs >= zzq.zza()) {
            zzq = zzbf.zza;
        }
        return zzaa(zzq, zzs, null);
    }

    private final zzmy zzae() {
        return zzad(this.zzd.zzb());
    }

    private final zzmy zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final zzmy zzag(int i5, zzwk zzwkVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        if (zzwkVar != null) {
            return this.zzd.zze(zzwkVar) != null ? zzad(zzwkVar) : zzaa(zzbf.zza, i5, zzwkVar);
        }
        zzbf zzq = zzbbVar.zzq();
        if (i5 >= zzq.zza()) {
            zzq = zzbf.zza;
        }
        return zzaa(zzq, i5, null);
    }

    private final zzmy zzah(zzau zzauVar) {
        zzwk zzwkVar;
        return (!(zzauVar instanceof zziw) || (zzwkVar = ((zziw) zzauVar).zzh) == null) ? zzZ() : zzad(zzwkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzA() {
        if (this.zzi) {
            return;
        }
        final zzmy zzZ = zzZ();
        this.zzi = true;
        zzY(zzZ, -1, new zzdy(zzZ) { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzB(final int i5, final int i6, final boolean z4) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1033, new zzdy(zzaf, i5, i6, z4) { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzC(final zzin zzinVar) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1007, new zzdy(zzaf, zzinVar) { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzD(final String str, final long j2, final long j5) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1008, new zzdy(zzaf, str, j5, j2) { // from class: com.google.android.gms.internal.ads.zzos
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzE(final zzv zzvVar, final zzio zzioVar) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1009, new zzdy() { // from class: com.google.android.gms.internal.ads.zzov
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzk(zzmy.this, zzvVar, zzioVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzF(final long j2) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1010, new zzdy(zzaf, j2) { // from class: com.google.android.gms.internal.ads.zzow
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzG(final int i5, final long j2, final long j5) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1011, new zzdy(zzaf, i5, j2, j5) { // from class: com.google.android.gms.internal.ads.zzox
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzH(final String str) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1012, new zzdy(zzaf, str) { // from class: com.google.android.gms.internal.ads.zzoy
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzI(final zzin zzinVar) {
        final zzmy zzae = zzae();
        zzY(zzae, 1013, new zzdy(zzae, zzinVar) { // from class: com.google.android.gms.internal.ads.zzoz
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzJ(final Exception exc) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1014, new zzdy(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzK(final Exception exc) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1029, new zzdy(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzL(final zzrd zzrdVar) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1031, new zzdy(zzaf, zzrdVar) { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzM(final zzrd zzrdVar) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1032, new zzdy(zzaf, zzrdVar) { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzN(final zzin zzinVar) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1015, new zzdy(zzaf, zzinVar) { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzO(final String str, final long j2, final long j5) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1016, new zzdy(zzaf, str, j5, j2) { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzP(final zzv zzvVar, final zzio zzioVar) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1017, new zzdy() { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzl(zzmy.this, zzvVar, zzioVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzQ(final int i5, final long j2) {
        final zzmy zzae = zzae();
        zzY(zzae, 1018, new zzdy() { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzm(zzmy.this, i5, j2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzR(final String str) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1019, new zzdy(zzaf, str) { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzS(final zzin zzinVar) {
        final zzmy zzae = zzae();
        zzY(zzae, 1020, new zzdy() { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzdh(zzmy.this, zzinVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzT(final Object obj, final long j2) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 26, new zzdy() { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj2) {
                ((zzna) obj2).zzo(zzmy.this, obj, j2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzU(final long j2, final int i5) {
        final zzmy zzae = zzae();
        zzY(zzae, 1021, new zzdy(zzae, j2, i5) { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzV(final Exception exc) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 1030, new zzdy(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzW(final int i5) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 1034, new zzdy(zzZ, i5) { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void zzX(final int i5, final long j2, final long j5) {
        final zzmy zzad = zzad(this.zzd.zzd());
        zzY(zzad, 1006, new zzdy() { // from class: com.google.android.gms.internal.ads.zzot
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzdg(zzmy.this, i5, j2, j5);
            }
        });
    }

    public final void zzY(zzmy zzmyVar, int i5, zzdy zzdyVar) {
        this.zze.put(i5, zzmyVar);
        zzed zzedVar = this.zzf;
        zzedVar.zzd(i5, zzdyVar);
        zzedVar.zze();
    }

    public final zzmy zzZ() {
        return zzad(this.zzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zza(zzbb zzbbVar, zzay zzayVar) {
    }

    public final zzmy zzaa(zzbf zzbfVar, int i5, zzwk zzwkVar) {
        zzwk zzwkVar2 = true == zzbfVar.zzg() ? null : zzwkVar;
        long zzb = this.zza.zzb();
        boolean z4 = zzbfVar.equals(this.zzg.zzq()) && i5 == this.zzg.zzs();
        long j2 = 0;
        if (zzwkVar2 == null || !zzwkVar2.zzb()) {
            if (z4) {
                j2 = this.zzg.zzA();
            } else if (!zzbfVar.zzg()) {
                long j5 = zzbfVar.zzb(i5, this.zzc, 0L).zzl;
                j2 = zzfj.zzp(0L);
            }
        } else if (z4 && this.zzg.zzy() == zzwkVar2.zzb && this.zzg.zzz() == zzwkVar2.zzc) {
            j2 = this.zzg.zzu();
        }
        return new zzmy(zzb, zzbfVar, i5, zzwkVar2, j2, this.zzg.zzq(), this.zzg.zzs(), this.zzd.zza(), this.zzg.zzu(), this.zzg.zzw());
    }

    public final /* synthetic */ void zzab(zzbb zzbbVar, zzna zznaVar, zzs zzsVar) {
        zznaVar.zzdi(zzbbVar, new zzmz(zzsVar, this.zze));
    }

    public final /* synthetic */ void zzac() {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 1028, new zzdy(zzZ) { // from class: com.google.android.gms.internal.ads.zzou
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        this.zzf.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzai(int i5, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar, final int i6) {
        final zzmy zzag = zzag(i5, zzwkVar);
        zzY(zzag, zzbgj.zzq.zzf, new zzdy(zzag, zzwbVar, zzwgVar, i6) { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzaj(int i5, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar) {
        final zzmy zzag = zzag(i5, zzwkVar);
        zzY(zzag, 1001, new zzdy(zzag, zzwbVar, zzwgVar) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzak(int i5, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar) {
        final zzmy zzag = zzag(i5, zzwkVar);
        zzY(zzag, 1002, new zzdy(zzag, zzwbVar, zzwgVar) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzal(int i5, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar, final IOException iOException, final boolean z4) {
        final zzmy zzag = zzag(i5, zzwkVar);
        zzY(zzag, 1003, new zzdy() { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzh(zzmy.this, zzwbVar, zzwgVar, iOException, z4);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzam(int i5, zzwk zzwkVar, final zzwg zzwgVar) {
        final zzmy zzag = zzag(i5, zzwkVar);
        zzY(zzag, 1004, new zzdy() { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzdf(zzmy.this, zzwgVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzb(zzbf zzbfVar, final int i5) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzg(zzbbVar);
        final zzmy zzZ = zzZ();
        zzY(zzZ, 0, new zzdy(zzZ, i5) { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzc(final zzak zzakVar, final int i5) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 1, new zzdy(zzZ, zzakVar, i5) { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzd(final zzbn zzbnVar) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 2, new zzdy(zzZ, zzbnVar) { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zze(final zzan zzanVar) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 14, new zzdy(zzZ, zzanVar) { // from class: com.google.android.gms.internal.ads.zzoo
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzf(final boolean z4) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 3, new zzdy(zzZ, z4) { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzg(final zzax zzaxVar) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 13, new zzdy(zzZ, zzaxVar) { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzh(final boolean z4, final int i5) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, -1, new zzdy(zzZ, z4, i5) { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzi(final int i5) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zze(zzmy.this, i5);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzj(final boolean z4, final int i5) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 5, new zzdy(zzZ, z4, i5) { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzk(final int i5) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 6, new zzdy(zzZ, i5) { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzl(final boolean z4) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 7, new zzdy(zzZ, z4) { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzm(final zzau zzauVar) {
        final zzmy zzah = zzah(zzauVar);
        zzY(zzah, 10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzok
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzg(zzmy.this, zzauVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzn(final zzau zzauVar) {
        final zzmy zzah = zzah(zzauVar);
        zzY(zzah, 10, new zzdy(zzah, zzauVar) { // from class: com.google.android.gms.internal.ads.zzol
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzo(final zzba zzbaVar, final zzba zzbaVar2, final int i5) {
        if (i5 == 1) {
            this.zzi = false;
            i5 = 1;
        }
        zzpb zzpbVar = this.zzd;
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        zzpbVar.zzf(zzbbVar);
        final zzmy zzZ = zzZ();
        zzY(zzZ, 11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzom
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzde(zzmy.this, zzbaVar, zzbaVar2, i5);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzp(final zzav zzavVar) {
        final zzmy zzZ = zzZ();
        zzY(zzZ, 12, new zzdy(zzZ, zzavVar) { // from class: com.google.android.gms.internal.ads.zzon
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzq(final int i5) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 21, new zzdy(zzaf, i5) { // from class: com.google.android.gms.internal.ads.zzoq
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzr(final float f5) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 22, new zzdy(zzaf, f5) { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzs(final boolean z4) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 23, new zzdy(zzaf, z4) { // from class: com.google.android.gms.internal.ads.zzop
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzt(final zzbv zzbvVar) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 25, new zzdy() { // from class: com.google.android.gms.internal.ads.zzor
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                zzmy zzmyVar = zzmy.this;
                zzbv zzbvVar2 = zzbvVar;
                ((zzna) obj).zzp(zzmyVar, zzbvVar2);
                int i5 = zzbvVar2.zzb;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzu(final int i5, final int i6) {
        final zzmy zzaf = zzaf();
        zzY(zzaf, 24, new zzdy(zzaf, i5, i6) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzv(zzna zznaVar) {
        this.zzf.zzb(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzw(zzna zznaVar) {
        this.zzf.zzc(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzx(final zzbb zzbbVar, Looper looper) {
        boolean z4 = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z4 = false;
        }
        zzgrc.zzi(z4);
        zzbbVar.getClass();
        this.zzg = zzbbVar;
        zzdn zzdnVar = this.zza;
        this.zzh = zzdnVar.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, zzdnVar, new zzdz() { // from class: com.google.android.gms.internal.ads.zzpa
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                zzpc.this.zzab(zzbbVar, (zzna) obj, zzsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzy() {
        zzdx zzdxVar = this.zzh;
        zzdxVar.getClass();
        zzdxVar.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zznb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzpc.this.zzac();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzz(List list, zzwk zzwkVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzh(list, zzwkVar, zzbbVar);
    }
}
