.class public final Lcom/google/android/gms/internal/ads/zzwf;
.super Lcom/google/android/gms/internal/ads/zzyp;
.source "SourceFile"


# instance fields
.field private final zzb:Z

.field private final zzc:Lcom/google/android/gms/internal/ads/zzbe;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzbd;

.field private zze:Lcom/google/android/gms/internal/ads/zzwd;

.field private zzf:Lcom/google/android/gms/internal/ads/zzwc;

.field private zzg:Z

.field private zzh:Z

.field private zzi:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzwm;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzyp;-><init>(Lcom/google/android/gms/internal/ads/zzwm;)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzwm;->zzI()Z

    .line 7
    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzb:Z

    .line 13
    .line 14
    new-instance p2, Lcom/google/android/gms/internal/ads/zzbe;

    .line 15
    .line 16
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzbe;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzc:Lcom/google/android/gms/internal/ads/zzbe;

    .line 20
    .line 21
    new-instance p2, Lcom/google/android/gms/internal/ads/zzbd;

    .line 22
    .line 23
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzbd;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzd:Lcom/google/android/gms/internal/ads/zzbd;

    .line 27
    .line 28
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzwm;->zzH()Lcom/google/android/gms/internal/ads/zzbf;

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzwm;->zzJ()Lcom/google/android/gms/internal/ads/zzak;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzwd;->zzp(Lcom/google/android/gms/internal/ads/zzak;)Lcom/google/android/gms/internal/ads/zzwd;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 40
    .line 41
    return-void
.end method

.method private final zzK(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzwd;->zzs()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/android/gms/internal/ads/zzwd;->zzc:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzwd;->zzs()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    return-object p1
.end method

.method private final zzL(J)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzf:Lcom/google/android/gms/internal/ads/zzwc;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzwc;->zza:Lcom/google/android/gms/internal/ads/zzwk;

    .line 6
    .line 7
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzwk;->zza:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzwd;->zze(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, -0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    return v3

    .line 18
    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 19
    .line 20
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzd:Lcom/google/android/gms/internal/ads/zzbd;

    .line 21
    .line 22
    invoke-virtual {v2, v1, v4, v3}, Lcom/google/android/gms/internal/ads/zzwd;->zzd(ILcom/google/android/gms/internal/ads/zzbd;Z)Lcom/google/android/gms/internal/ads/zzbd;

    .line 23
    .line 24
    .line 25
    iget-wide v1, v4, Lcom/google/android/gms/internal/ads/zzbd;->zzd:J

    .line 26
    .line 27
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v3, v1, v3

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    cmp-long v3, p1, v1

    .line 37
    .line 38
    if-ltz v3, :cond_1

    .line 39
    .line 40
    const-wide/16 p1, -0x1

    .line 41
    .line 42
    add-long/2addr v1, p1

    .line 43
    const-wide/16 p1, 0x0

    .line 44
    .line 45
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    :cond_1
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzwc;->zzo(J)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1
.end method


# virtual methods
.method public final zzA(Lcom/google/android/gms/internal/ads/zzak;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzi:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/gms/internal/ads/zzyl;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 10
    .line 11
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzvy;->zzb:Lcom/google/android/gms/internal/ads/zzbf;

    .line 12
    .line 13
    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzyl;-><init>(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzak;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzwd;->zzr(Lcom/google/android/gms/internal/ads/zzbf;)Lcom/google/android/gms/internal/ads/zzwd;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzwd;->zzp(Lcom/google/android/gms/internal/ads/zzak;)Lcom/google/android/gms/internal/ads/zzwd;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 28
    .line 29
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyp;->zza:Lcom/google/android/gms/internal/ads/zzwm;

    .line 30
    .line 31
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzwm;->zzA(Lcom/google/android/gms/internal/ads/zzak;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final zzB()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzb:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzg:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyp;->zza:Lcom/google/android/gms/internal/ads/zzwm;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzvs;->zzv(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzwm;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final zzC(Lcom/google/android/gms/internal/ads/zzwk;Lcom/google/android/gms/internal/ads/zzaan;J)Lcom/google/android/gms/internal/ads/zzwc;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzwc;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzwc;-><init>(Lcom/google/android/gms/internal/ads/zzwk;Lcom/google/android/gms/internal/ads/zzaan;J)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzyp;->zza:Lcom/google/android/gms/internal/ads/zzwm;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzwc;->zzr(Lcom/google/android/gms/internal/ads/zzwm;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzh:Z

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzwk;->zza:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzwf;->zzK(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzwk;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzwk;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzwc;->zzt(Lcom/google/android/gms/internal/ads/zzwk;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzf:Lcom/google/android/gms/internal/ads/zzwc;

    .line 30
    .line 31
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzg:Z

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzg:Z

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzyp;->zza:Lcom/google/android/gms/internal/ads/zzwm;

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzvs;->zzv(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzwm;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-object v0
.end method

.method public final zzD(Lcom/google/android/gms/internal/ads/zzwi;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/ads/zzwc;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzwc;->zzu()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzf:Lcom/google/android/gms/internal/ads/zzwc;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzf:Lcom/google/android/gms/internal/ads/zzwc;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final zzE(Lcom/google/android/gms/internal/ads/zzbf;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzh:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzwd;->zzr(Lcom/google/android/gms/internal/ads/zzbf;)Lcom/google/android/gms/internal/ads/zzwd;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzf:Lcom/google/android/gms/internal/ads/zzwc;

    .line 15
    .line 16
    if-eqz p1, :cond_5

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzwc;->zzq()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/zzwf;->zzL(J)Z

    .line 23
    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbf;->zzg()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzi:Z

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzwd;->zzr(Lcom/google/android/gms/internal/ads/zzbf;)Lcom/google/android/gms/internal/ads/zzwd;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbe;->zza:Ljava/lang/Object;

    .line 45
    .line 46
    sget-object v2, Lcom/google/android/gms/internal/ads/zzwd;->zzc:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {p1, v0, v2}, Lcom/google/android/gms/internal/ads/zzwd;->zzq(Lcom/google/android/gms/internal/ads/zzbf;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzwd;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzc:Lcom/google/android/gms/internal/ads/zzbe;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    const-wide/16 v4, 0x0

    .line 59
    .line 60
    invoke-virtual {p1, v0, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzbf;->zzb(ILcom/google/android/gms/internal/ads/zzbe;J)Lcom/google/android/gms/internal/ads/zzbe;

    .line 61
    .line 62
    .line 63
    iget-object v8, v3, Lcom/google/android/gms/internal/ads/zzbe;->zzb:Ljava/lang/Object;

    .line 64
    .line 65
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzf:Lcom/google/android/gms/internal/ads/zzwc;

    .line 66
    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzwc;->zza()J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 74
    .line 75
    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzd:Lcom/google/android/gms/internal/ads/zzbd;

    .line 76
    .line 77
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzwc;->zza:Lcom/google/android/gms/internal/ads/zzwk;

    .line 78
    .line 79
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzwk;->zza:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {v9, v2, v10}, Lcom/google/android/gms/internal/ads/zzbf;->zzo(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzbd;)Lcom/google/android/gms/internal/ads/zzbd;

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 85
    .line 86
    invoke-virtual {v2, v0, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzwd;->zzb(ILcom/google/android/gms/internal/ads/zzbe;J)Lcom/google/android/gms/internal/ads/zzbe;

    .line 87
    .line 88
    .line 89
    cmp-long v0, v6, v4

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    move-wide v6, v4

    .line 95
    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzd:Lcom/google/android/gms/internal/ads/zzbd;

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    move-object v2, p1

    .line 99
    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzbf;->zzm(Lcom/google/android/gms/internal/ads/zzbe;Lcom/google/android/gms/internal/ads/zzbd;IJ)Landroid/util/Pair;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 104
    .line 105
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, Ljava/lang/Long;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzi:Z

    .line 114
    .line 115
    if-eqz p1, :cond_4

    .line 116
    .line 117
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzwd;->zzr(Lcom/google/android/gms/internal/ads/zzbf;)Lcom/google/android/gms/internal/ads/zzwd;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    goto :goto_2

    .line 124
    :cond_4
    invoke-static {v2, v8, v0}, Lcom/google/android/gms/internal/ads/zzwd;->zzq(Lcom/google/android/gms/internal/ads/zzbf;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzwd;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :goto_2
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 129
    .line 130
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzf:Lcom/google/android/gms/internal/ads/zzwc;

    .line 131
    .line 132
    if-eqz p1, :cond_5

    .line 133
    .line 134
    invoke-direct {p0, v3, v4}, Lcom/google/android/gms/internal/ads/zzwf;->zzL(J)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzwc;->zza:Lcom/google/android/gms/internal/ads/zzwk;

    .line 141
    .line 142
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzwk;->zza:Ljava/lang/Object;

    .line 143
    .line 144
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzwf;->zzK(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzwk;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzwk;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    :cond_5
    :goto_3
    const/4 p1, 0x1

    .line 153
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzi:Z

    .line 154
    .line 155
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzh:Z

    .line 156
    .line 157
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 158
    .line 159
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzvj;->zze(Lcom/google/android/gms/internal/ads/zzbf;)V

    .line 160
    .line 161
    .line 162
    if-eqz v1, :cond_6

    .line 163
    .line 164
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzf:Lcom/google/android/gms/internal/ads/zzwc;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzwc;->zzt(Lcom/google/android/gms/internal/ads/zzwk;)V

    .line 170
    .line 171
    .line 172
    :cond_6
    return-void
.end method

.method public final zzF(Lcom/google/android/gms/internal/ads/zzwk;)Lcom/google/android/gms/internal/ads/zzwk;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzwd;->zzs()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzwk;->zza:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzwd;->zzs()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v1, Lcom/google/android/gms/internal/ads/zzwd;->zzc:Ljava/lang/Object;

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzwk;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzwk;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public final bridge synthetic zzG(Lcom/google/android/gms/internal/ads/zzwk;Lcom/google/android/gms/internal/ads/zzaan;J)Lcom/google/android/gms/internal/ads/zzwi;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzwf;->zzC(Lcom/google/android/gms/internal/ads/zzwk;Lcom/google/android/gms/internal/ads/zzaan;J)Lcom/google/android/gms/internal/ads/zzwc;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final zzd()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzh:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zzg:Z

    .line 5
    .line 6
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzvs;->zzd()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final zzz()Lcom/google/android/gms/internal/ads/zzbf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzwf;->zze:Lcom/google/android/gms/internal/ads/zzwd;

    return-object v0
.end method
