.class public final Lcom/google/android/gms/internal/ads/zzsp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzps;

.field private zzc:Z

.field private zzd:Lcom/google/android/gms/internal/ads/zzso;

.field private zze:Lcom/google/android/gms/internal/ads/zzqm;

.field private zzf:Lcom/google/android/gms/internal/ads/zzsr;

.field private zzg:Lcom/google/android/gms/internal/ads/zzsm;


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zza:Landroid/content/Context;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzps;->zza:Lcom/google/android/gms/internal/ads/zzps;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzb:Lcom/google/android/gms/internal/ads/zzps;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsp;->zza:Landroid/content/Context;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzps;->zza:Lcom/google/android/gms/internal/ads/zzps;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzb:Lcom/google/android/gms/internal/ads/zzps;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzsw;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzc:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzc:Z

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzf:Lcom/google/android/gms/internal/ads/zzsr;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/internal/ads/zzsr;

    .line 16
    .line 17
    new-array v3, v2, [Lcom/google/android/gms/internal/ads/zzco;

    .line 18
    .line 19
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzsr;-><init>([Lcom/google/android/gms/internal/ads/zzco;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzf:Lcom/google/android/gms/internal/ads/zzsr;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zze:Lcom/google/android/gms/internal/ads/zzqm;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-nez v0, :cond_4

    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzg:Lcom/google/android/gms/internal/ads/zzsm;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zza:Landroid/content/Context;

    .line 34
    .line 35
    new-instance v1, Lcom/google/android/gms/internal/ads/zzsm;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzsm;-><init>(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzg:Lcom/google/android/gms/internal/ads/zzsm;

    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzd:Lcom/google/android/gms/internal/ads/zzso;

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    sget-object v0, Lcom/google/android/gms/internal/ads/zzso;->zza:Lcom/google/android/gms/internal/ads/zzso;

    .line 47
    .line 48
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzd:Lcom/google/android/gms/internal/ads/zzso;

    .line 49
    .line 50
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zza:Landroid/content/Context;

    .line 51
    .line 52
    new-instance v1, Lcom/google/android/gms/internal/ads/zzsg;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzsg;-><init>(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    move-object v0, v3

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzb:Lcom/google/android/gms/internal/ads/zzps;

    .line 62
    .line 63
    :goto_0
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzsg;->zzb(Lcom/google/android/gms/internal/ads/zzps;)Lcom/google/android/gms/internal/ads/zzsg;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzg:Lcom/google/android/gms/internal/ads/zzsm;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzsg;->zzf(Lcom/google/android/gms/internal/ads/zzsm;)Lcom/google/android/gms/internal/ads/zzsg;

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzd:Lcom/google/android/gms/internal/ads/zzso;

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzsg;->zza(Lcom/google/android/gms/internal/ads/zzso;)Lcom/google/android/gms/internal/ads/zzsg;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzsg;->zzc()Lcom/google/android/gms/internal/ads/zzsi;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zze:Lcom/google/android/gms/internal/ads/zzqm;

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzg:Lcom/google/android/gms/internal/ads/zzsm;

    .line 84
    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    move v0, v1

    .line 88
    goto :goto_1

    .line 89
    :cond_5
    move v0, v2

    .line 90
    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzd:Lcom/google/android/gms/internal/ads/zzso;

    .line 94
    .line 95
    if-nez v0, :cond_6

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_6
    move v1, v2

    .line 99
    :goto_2
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 100
    .line 101
    .line 102
    :goto_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzsw;

    .line 103
    .line 104
    invoke-direct {v0, p0, v3}, Lcom/google/android/gms/internal/ads/zzsw;-><init>(Lcom/google/android/gms/internal/ads/zzsp;[B)V

    .line 105
    .line 106
    .line 107
    return-object v0
.end method

.method public final synthetic zzb()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zza:Landroid/content/Context;

    return-object v0
.end method

.method public final synthetic zzc()Lcom/google/android/gms/internal/ads/zzqm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zze:Lcom/google/android/gms/internal/ads/zzqm;

    return-object v0
.end method

.method public final synthetic zzd()Lcom/google/android/gms/internal/ads/zzsr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzf:Lcom/google/android/gms/internal/ads/zzsr;

    return-object v0
.end method
