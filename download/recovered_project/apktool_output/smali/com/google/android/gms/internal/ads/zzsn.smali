.class final Lcom/google/android/gms/internal/ads/zzsn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzqa;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzsw;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzql;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzsw;Lcom/google/android/gms/internal/ads/zzql;[B)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsn;->zza:Lcom/google/android/gms/internal/ads/zzsw;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsn;->zzb:Lcom/google/android/gms/internal/ads/zzql;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final zza(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsn;->zza:Lcom/google/android/gms/internal/ads/zzsw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzI()Lcom/google/android/gms/internal/ads/zzsn;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzJ()Lcom/google/android/gms/internal/ads/zzrg;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzJ()Lcom/google/android/gms/internal/ads/zzrg;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/google/android/gms/internal/ads/zzsz;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzta;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzta;->zzaw()Lcom/google/android/gms/internal/ads/zzrb;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzrb;->zzd(J)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method public final zzb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsn;->zza:Lcom/google/android/gms/internal/ads/zzsw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzI()Lcom/google/android/gms/internal/ads/zzsn;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzJ()Lcom/google/android/gms/internal/ads/zzrg;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzN()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzJ()Lcom/google/android/gms/internal/ads/zzrg;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/google/android/gms/internal/ads/zzsz;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzta;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzta;->zzat(Lcom/google/android/gms/internal/ads/zzta;)Lcom/google/android/gms/internal/ads/zzmk;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzmk;->zza()V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void
.end method

.method public final zzc()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsn;->zza:Lcom/google/android/gms/internal/ads/zzsw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzI()Lcom/google/android/gms/internal/ads/zzsn;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v1, 0x1

    .line 15
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzsw;->zzM(Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final zzd()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsn;->zza:Lcom/google/android/gms/internal/ads/zzsw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzI()Lcom/google/android/gms/internal/ads/zzsn;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzJ()Lcom/google/android/gms/internal/ads/zzrg;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzK()Lcom/google/android/gms/internal/ads/zzsq;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzsq;->zzj()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, -0x1

    .line 29
    if-eq v1, v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzK()Lcom/google/android/gms/internal/ads/zzsq;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzsq;->zzk()Lcom/google/android/gms/internal/ads/zzql;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzql;->zze:I

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzK()Lcom/google/android/gms/internal/ads/zzsq;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzsq;->zzj()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    div-int/2addr v1, v2

    .line 50
    int-to-long v1, v1

    .line 51
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzL()Lcom/google/android/gms/internal/ads/zzqc;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzqc;->zzi()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzfj;->zzr(JI)J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzO()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 77
    .line 78
    .line 79
    move-result-wide v5

    .line 80
    sub-long v11, v5, v3

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzJ()Lcom/google/android/gms/internal/ads/zzrg;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzK()Lcom/google/android/gms/internal/ads/zzsq;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsq;->zzk()Lcom/google/android/gms/internal/ads/zzql;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzql;->zze:I

    .line 95
    .line 96
    check-cast v3, Lcom/google/android/gms/internal/ads/zzsz;

    .line 97
    .line 98
    iget-object v0, v3, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzta;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzta;->zzaw()Lcom/google/android/gms/internal/ads/zzrb;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzfj;->zzp(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v9

    .line 108
    invoke-virtual/range {v7 .. v12}, Lcom/google/android/gms/internal/ads/zzrb;->zze(IJJ)V

    .line 109
    .line 110
    .line 111
    :cond_2
    :goto_1
    return-void
.end method

.method public final zze()V
    .locals 9

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzsw;->zzH()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndDecrement()I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsn;->zza:Lcom/google/android/gms/internal/ads/zzsw;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzJ()Lcom/google/android/gms/internal/ads/zzrg;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsn;->zzb:Lcom/google/android/gms/internal/ads/zzql;

    .line 17
    .line 18
    new-instance v2, Lcom/google/android/gms/internal/ads/zzrd;

    .line 19
    .line 20
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    .line 21
    .line 22
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzql;->zzb:I

    .line 23
    .line 24
    iget v5, v1, Lcom/google/android/gms/internal/ads/zzql;->zzc:I

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    iget v8, v1, Lcom/google/android/gms/internal/ads/zzql;->zze:I

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzrd;-><init>(IIIZZI)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsw;->zzJ()Lcom/google/android/gms/internal/ads/zzrg;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lcom/google/android/gms/internal/ads/zzsz;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzta;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzta;->zzaw()Lcom/google/android/gms/internal/ads/zzrb;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzrb;->zzl(Lcom/google/android/gms/internal/ads/zzrd;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method
