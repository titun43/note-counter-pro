.class public final Lcom/google/android/gms/internal/ads/zzdoq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field zza:Lcom/google/android/gms/internal/ads/zzblt;

.field zzb:Lcom/google/android/gms/internal/ads/zzblq;

.field zzc:Lcom/google/android/gms/internal/ads/zzbmg;

.field zzd:Lcom/google/android/gms/internal/ads/zzbmd;

.field zze:Lcom/google/android/gms/internal/ads/zzbrb;

.field final zzf:Lo/l;

.field final zzg:Lo/l;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lo/l;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lo/l;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdoq;->zzf:Lo/l;

    .line 11
    .line 12
    new-instance v0, Lo/l;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lo/l;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdoq;->zzg:Lo/l;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzblt;)Lcom/google/android/gms/internal/ads/zzdoq;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdoq;->zza:Lcom/google/android/gms/internal/ads/zzblt;

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzblq;)Lcom/google/android/gms/internal/ads/zzdoq;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdoq;->zzb:Lcom/google/android/gms/internal/ads/zzblq;

    return-object p0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzbmg;)Lcom/google/android/gms/internal/ads/zzdoq;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdoq;->zzc:Lcom/google/android/gms/internal/ads/zzbmg;

    return-object p0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzbmd;)Lcom/google/android/gms/internal/ads/zzdoq;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdoq;->zzd:Lcom/google/android/gms/internal/ads/zzbmd;

    return-object p0
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzbrb;)Lcom/google/android/gms/internal/ads/zzdoq;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdoq;->zze:Lcom/google/android/gms/internal/ads/zzbrb;

    return-object p0
.end method

.method public final zzf(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzblz;Lcom/google/android/gms/internal/ads/zzblw;)Lcom/google/android/gms/internal/ads/zzdoq;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdoq;->zzf:Lo/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lo/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdoq;->zzg:Lo/l;

    .line 9
    .line 10
    invoke-virtual {p2, p1, p3}, Lo/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object p0
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzdor;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdor;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzdor;-><init>(Lcom/google/android/gms/internal/ads/zzdoq;[B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
