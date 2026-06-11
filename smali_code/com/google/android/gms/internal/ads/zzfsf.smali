.class public final Lcom/google/android/gms/internal/ads/zzfsf;
.super Lcom/google/android/gms/internal/ads/zzfsa;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILcom/google/android/gms/internal/ads/zzfkg;Lcom/google/android/gms/ads/internal/client/zzft;Lcom/google/android/gms/ads/internal/client/zzce;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/zzfmy;Lcom/google/android/gms/internal/ads/zzfra;Lx2/b;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lcom/google/android/gms/internal/ads/zzfsa;-><init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILcom/google/android/gms/internal/ads/zzfkg;Lcom/google/android/gms/ads/internal/client/zzft;Lcom/google/android/gms/ads/internal/client/zzce;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/zzfmy;Lcom/google/android/gms/internal/ads/zzfra;Lx2/b;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILcom/google/android/gms/internal/ads/zzfkg;Lcom/google/android/gms/ads/internal/client/zzft;Lcom/google/android/gms/ads/internal/client/zzch;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/zzfmy;Lcom/google/android/gms/internal/ads/zzfra;Lx2/b;Lcom/google/android/gms/internal/ads/zzfqr;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p12}, Lcom/google/android/gms/internal/ads/zzfsa;-><init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILcom/google/android/gms/internal/ads/zzfkg;Lcom/google/android/gms/ads/internal/client/zzft;Lcom/google/android/gms/ads/internal/client/zzch;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/zzfmy;Lcom/google/android/gms/internal/ads/zzfra;Lx2/b;Lcom/google/android/gms/internal/ads/zzfqr;)V

    return-void
.end method


# virtual methods
.method public final zza(Landroid/content/Context;)Lj3/a;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsa;->zzd:Lcom/google/android/gms/internal/ads/zzfkg;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfkg;->zzd()Lcom/google/android/gms/internal/ads/zzbtt;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "Failed to create a rewarded ad."

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfqs;

    .line 13
    .line 14
    invoke-direct {p1, v2, v1}, Lcom/google/android/gms/internal/ads/zzfqs;-><init>(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzc(Ljava/lang/Throwable;)Lj3/a;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfsa;->zza:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 23
    .line 24
    new-instance v4, La3/b;

    .line 25
    .line 26
    invoke-direct {v4, p1}, La3/b;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfsa;->zze:Lcom/google/android/gms/ads/internal/client/zzft;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zzft;->zza:Ljava/lang/String;

    .line 32
    .line 33
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzfsa;->zzc:I

    .line 34
    .line 35
    invoke-virtual {v3, v4, p1, v0, v5}, Lcom/google/android/gms/ads/internal/ClientApi;->zzl(La3/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbtt;I)Lcom/google/android/gms/internal/ads/zzcaz;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfqs;

    .line 42
    .line 43
    invoke-direct {p1, v2, v1}, Lcom/google/android/gms/internal/ads/zzfqs;-><init>(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzc(Ljava/lang/Throwable;)Lj3/a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhah;->zze()Lcom/google/android/gms/internal/ads/zzhah;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfsa;->zze:Lcom/google/android/gms/ads/internal/client/zzft;

    .line 56
    .line 57
    iget-object v1, v1, Lcom/google/android/gms/ads/internal/client/zzft;->zzc:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzfsa;->zzx(Lcom/google/android/gms/ads/internal/client/zzm;)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfsa;->zze:Lcom/google/android/gms/ads/internal/client/zzft;

    .line 63
    .line 64
    iget-object v1, v1, Lcom/google/android/gms/ads/internal/client/zzft;->zzc:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 65
    .line 66
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfse;

    .line 67
    .line 68
    invoke-direct {v3, p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzfse;-><init>(Lcom/google/android/gms/internal/ads/zzfsf;Lcom/google/android/gms/internal/ads/zzhah;Lcom/google/android/gms/internal/ads/zzcaz;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, v1, v3}, Lcom/google/android/gms/internal/ads/zzcaz;->zzc(Lcom/google/android/gms/ads/internal/client/zzm;Lcom/google/android/gms/internal/ads/zzcbg;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :catch_0
    const-string p1, "Failed to load rewarded ad."

    .line 76
    .line 77
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfqs;

    .line 81
    .line 82
    const-string v0, "remote exception"

    .line 83
    .line 84
    invoke-direct {p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzfqs;-><init>(ILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzc(Ljava/lang/Throwable;)Lj3/a;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method

.method public final zzb()J
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzR:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0
.end method

.method public final bridge synthetic zzc(Ljava/lang/Object;)Lcom/google/android/gms/ads/internal/client/zzea;
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcaz;

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcaz;->zzm()Lcom/google/android/gms/ads/internal/client/zzea;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p1

    .line 8
    :catch_0
    move-exception p1

    .line 9
    sget v0, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 10
    .line 11
    const-string v0, "Failed to get response info for the rewarded ad."

    .line 12
    .line 13
    invoke-static {v0, p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zze(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method
