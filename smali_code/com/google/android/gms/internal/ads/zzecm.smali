.class public final Lcom/google/android/gms/internal/ads/zzecm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field zza:Lcom/google/android/gms/internal/ads/zzbyr;

.field zzb:Lcom/google/android/gms/internal/ads/zzbyr;

.field private final zzc:Landroid/content/Context;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzecj;

.field private final zze:Lcom/google/android/gms/internal/ads/zzdxz;

.field private final zzf:Lcom/google/android/gms/ads/internal/util/zzg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzecj;Lcom/google/android/gms/internal/ads/zzdxz;Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/zzg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzd:Lcom/google/android/gms/internal/ads/zzecj;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzecm;->zze:Lcom/google/android/gms/internal/ads/zzdxz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzc:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzf:Lcom/google/android/gms/ads/internal/util/zzg;

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzf:Lcom/google/android/gms/ads/internal/util/zzg;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/util/zzg;->zzP()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzd:Lcom/google/android/gms/internal/ads/zzecj;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzecj;->zza()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/google/android/gms/internal/ads/zzecl;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzecl;-><init>(Lcom/google/android/gms/internal/ads/zzecm;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzecj;->zzb(Lcom/google/android/gms/internal/ads/zzaqu;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 25
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzfP:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 26
    .line 27
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 44
    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzc:Landroid/content/Context;

    .line 48
    .line 49
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbyp;->zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbyr;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 54
    .line 55
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 56
    .line 57
    const-string v2, "InstallReferrerUnsampled.initializeAndReport"

    .line 58
    .line 59
    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzbyr;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzecm;->zza:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzc:Landroid/content/Context;

    .line 68
    .line 69
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbyp;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbyr;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzecm;->zza:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 74
    .line 75
    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzecm;->zza:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 76
    .line 77
    const-string v2, "InstallReferrer.initializeAndReport"

    .line 78
    .line 79
    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzbyr;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final synthetic zzb()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzc:Landroid/content/Context;

    return-object v0
.end method

.method public final synthetic zzc()Lcom/google/android/gms/internal/ads/zzecj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzd:Lcom/google/android/gms/internal/ads/zzecj;

    return-object v0
.end method

.method public final synthetic zzd()Lcom/google/android/gms/internal/ads/zzdxz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzecm;->zze:Lcom/google/android/gms/internal/ads/zzdxz;

    return-object v0
.end method

.method public final synthetic zze()Lcom/google/android/gms/ads/internal/util/zzg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzecm;->zzf:Lcom/google/android/gms/ads/internal/util/zzg;

    return-object v0
.end method
