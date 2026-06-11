.class public final Lcom/google/android/gms/internal/ads/zzeun;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfax;


# instance fields
.field final zza:Landroid/content/Context;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;

.field private final zzd:J

.field private final zze:Lcom/google/android/gms/internal/ads/zzcxv;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfks;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfjk;

.field private final zzh:Lcom/google/android/gms/ads/internal/util/zzg;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzdxt;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzcyj;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcxv;Lcom/google/android/gms/internal/ads/zzfks;Lcom/google/android/gms/internal/ads/zzfjk;Lcom/google/android/gms/internal/ads/zzdxt;Lcom/google/android/gms/internal/ads/zzcyj;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeun;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzb:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzc:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeun;->zze:Lcom/google/android/gms/internal/ads/zzcxv;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzf:Lcom/google/android/gms/internal/ads/zzfks;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzg:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcdu;->zzo()Lcom/google/android/gms/ads/internal/util/zzg;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzh:Lcom/google/android/gms/ads/internal/util/zzg;

    .line 25
    .line 26
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzi:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 27
    .line 28
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzj:Lcom/google/android/gms/internal/ads/zzcyj;

    .line 29
    .line 30
    iput-wide p9, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzd:J

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final zza()Lj3/a;
    .locals 8

    .line 1
    new-instance v2, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzi:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdxt;->zzc()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzb:Ljava/lang/String;

    .line 13
    .line 14
    const-string v4, "seq_num"

    .line 15
    .line 16
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzcK:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 20
    .line 21
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lx2/c;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzd:J

    .line 51
    .line 52
    sub-long/2addr v4, v6

    .line 53
    const-string v1, "tsacc"

    .line 54
    .line 55
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/internal/ads/zzdxt;->zzd(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeun;->zza:Landroid/content/Context;

    .line 66
    .line 67
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzL(Landroid/content/Context;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v4, 0x1

    .line 72
    if-eq v4, v1, :cond_0

    .line 73
    .line 74
    const-string v1, "1"

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string v1, "0"

    .line 78
    .line 79
    :goto_0
    const-string v4, "foreground"

    .line 80
    .line 81
    invoke-virtual {v0, v4, v1}, Lcom/google/android/gms/internal/ads/zzdxt;->zzd(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeun;->zze:Lcom/google/android/gms/internal/ads/zzcxv;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzg:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 87
    .line 88
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzfjk;->zzd:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 89
    .line 90
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzcxv;->zzi(Lcom/google/android/gms/ads/internal/client/zzm;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzf:Lcom/google/android/gms/internal/ads/zzfks;

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfks;->zzc()Landroid/os/Bundle;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 100
    .line 101
    .line 102
    move-object v0, v1

    .line 103
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeun;->zza:Landroid/content/Context;

    .line 104
    .line 105
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzc:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzh:Lcom/google/android/gms/ads/internal/util/zzg;

    .line 108
    .line 109
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzeun;->zzj:Lcom/google/android/gms/internal/ads/zzcyj;

    .line 110
    .line 111
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzg:Ljava/lang/String;

    .line 112
    .line 113
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeuo;

    .line 114
    .line 115
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzeuo;-><init>(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/zzg;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcyj;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0
.end method

.method public final zzb()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method
