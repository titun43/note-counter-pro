.class public final Lcom/google/android/gms/internal/ads/zzxu;
.super Lcom/google/android/gms/internal/ads/zzvj;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzxi;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzha;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzxc;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzto;

.field private final zzd:I

.field private zze:Z

.field private zzf:J

.field private zzg:Z

.field private zzh:Z

.field private zzi:Lcom/google/android/gms/internal/ads/zzhz;

.field private zzj:Lcom/google/android/gms/internal/ads/zzak;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzaaw;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzak;Lcom/google/android/gms/internal/ads/zzha;Lcom/google/android/gms/internal/ads/zzxc;Lcom/google/android/gms/internal/ads/zzto;Lcom/google/android/gms/internal/ads/zzaaw;IZILcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzgru;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvj;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzj:Lcom/google/android/gms/internal/ads/zzak;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzxu;->zza:Lcom/google/android/gms/internal/ads/zzha;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzb:Lcom/google/android/gms/internal/ads/zzxc;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzc:Lcom/google/android/gms/internal/ads/zzto;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzk:Lcom/google/android/gms/internal/ads/zzaaw;

    .line 13
    .line 14
    iput p6, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzd:I

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzxu;->zze:Z

    .line 18
    .line 19
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzf:J

    .line 25
    .line 26
    return-void
.end method

.method private final zzu()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzyg;

    .line 4
    .line 5
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzxu;->zzf:J

    .line 6
    .line 7
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzxu;->zzg:Z

    .line 8
    .line 9
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzxu;->zzh:Z

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzxu;->zzJ()Lcom/google/android/gms/internal/ads/zzak;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    iget-object v3, v4, Lcom/google/android/gms/internal/ads/zzak;->zzc:Lcom/google/android/gms/internal/ads/zzaf;

    .line 18
    .line 19
    :goto_0
    move-object/from16 v21, v3

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v3, 0x0

    .line 23
    goto :goto_0

    .line 24
    :goto_1
    const/16 v18, 0x0

    .line 25
    .line 26
    const/16 v19, 0x0

    .line 27
    .line 28
    move/from16 v16, v2

    .line 29
    .line 30
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide/16 v12, 0x0

    .line 36
    .line 37
    const-wide/16 v14, 0x0

    .line 38
    .line 39
    const/16 v17, 0x0

    .line 40
    .line 41
    move-object/from16 v20, v4

    .line 42
    .line 43
    move-wide v4, v2

    .line 44
    move-wide v6, v2

    .line 45
    move-wide v10, v8

    .line 46
    invoke-direct/range {v1 .. v21}, Lcom/google/android/gms/internal/ads/zzyg;-><init>(JJJJJJJZZZLjava/lang/Object;Lcom/google/android/gms/internal/ads/zzak;Lcom/google/android/gms/internal/ads/zzaf;)V

    .line 47
    .line 48
    .line 49
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzxu;->zze:Z

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    new-instance v2, Lcom/google/android/gms/internal/ads/zzxr;

    .line 54
    .line 55
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzxr;-><init>(Lcom/google/android/gms/internal/ads/zzxu;Lcom/google/android/gms/internal/ads/zzbf;)V

    .line 56
    .line 57
    .line 58
    move-object v1, v2

    .line 59
    :cond_1
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzvj;->zze(Lcom/google/android/gms/internal/ads/zzbf;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final declared-synchronized zzA(Lcom/google/android/gms/internal/ads/zzak;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzj:Lcom/google/android/gms/internal/ads/zzak;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final zzD(Lcom/google/android/gms/internal/ads/zzwi;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzxq;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzxq;->zza()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzG(Lcom/google/android/gms/internal/ads/zzwk;Lcom/google/android/gms/internal/ads/zzaan;J)Lcom/google/android/gms/internal/ads/zzwi;
    .locals 18

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzxu;->zza:Lcom/google/android/gms/internal/ads/zzha;

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzha;->zza()Lcom/google/android/gms/internal/ads/zzhb;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzxu;->zzi:Lcom/google/android/gms/internal/ads/zzhz;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/zzhb;->zze(Lcom/google/android/gms/internal/ads/zzhz;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzxu;->zzJ()Lcom/google/android/gms/internal/ads/zzak;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzak;->zzb:Lcom/google/android/gms/internal/ads/zzag;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzag;->zza:Landroid/net/Uri;

    .line 26
    .line 27
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzxu;->zzb:Lcom/google/android/gms/internal/ads/zzxc;

    .line 28
    .line 29
    new-instance v3, Lcom/google/android/gms/internal/ads/zzxq;

    .line 30
    .line 31
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzvj;->zzk()Lcom/google/android/gms/internal/ads/zzpq;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v0, v4}, Lcom/google/android/gms/internal/ads/zzxc;->zza(Lcom/google/android/gms/internal/ads/zzpq;)Lcom/google/android/gms/internal/ads/zzxd;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v4, v8, Lcom/google/android/gms/internal/ads/zzxu;->zzc:Lcom/google/android/gms/internal/ads/zzto;

    .line 40
    .line 41
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzvj;->zzh(Lcom/google/android/gms/internal/ads/zzwk;)Lcom/google/android/gms/internal/ads/zztj;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iget-object v6, v8, Lcom/google/android/gms/internal/ads/zzxu;->zzk:Lcom/google/android/gms/internal/ads/zzaaw;

    .line 46
    .line 47
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzvj;->zzf(Lcom/google/android/gms/internal/ads/zzwk;)Lcom/google/android/gms/internal/ads/zzwu;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    iget v11, v8, Lcom/google/android/gms/internal/ads/zzxu;->zzd:I

    .line 52
    .line 53
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v15

    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, 0x0

    .line 67
    const/4 v14, 0x0

    .line 68
    move-object v9, v3

    .line 69
    move-object v3, v0

    .line 70
    move-object v0, v9

    .line 71
    move-object/from16 v9, p2

    .line 72
    .line 73
    invoke-direct/range {v0 .. v17}, Lcom/google/android/gms/internal/ads/zzxq;-><init>(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/zzhb;Lcom/google/android/gms/internal/ads/zzxd;Lcom/google/android/gms/internal/ads/zzto;Lcom/google/android/gms/internal/ads/zztj;Lcom/google/android/gms/internal/ads/zzaaw;Lcom/google/android/gms/internal/ads/zzwu;Lcom/google/android/gms/internal/ads/zzxi;Lcom/google/android/gms/internal/ads/zzaan;Ljava/lang/String;IZILcom/google/android/gms/internal/ads/zzv;JLcom/google/android/gms/internal/ads/zzabl;)V

    .line 74
    .line 75
    .line 76
    return-object v0
.end method

.method public final declared-synchronized zzJ()Lcom/google/android/gms/internal/ads/zzak;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzj:Lcom/google/android/gms/internal/ads/zzak;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzhz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzi:Lcom/google/android/gms/internal/ads/zzhz;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvj;->zzk()Lcom/google/android/gms/internal/ads/zzpq;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzxu;->zzu()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final zzb(JLcom/google/android/gms/internal/ads/zzafy;Z)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzf:J

    .line 11
    .line 12
    :cond_0
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzafy;->zzb()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzxu;->zze:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzf:J

    .line 21
    .line 22
    cmp-long v0, v0, p1

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzg:Z

    .line 27
    .line 28
    if-ne v0, p3, :cond_1

    .line 29
    .line 30
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzh:Z

    .line 31
    .line 32
    if-ne v0, p4, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzf:J

    .line 36
    .line 37
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzg:Z

    .line 38
    .line 39
    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzxu;->zzh:Z

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzxu;->zze:Z

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzxu;->zzu()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final zzd()V
    .locals 0

    return-void
.end method

.method public final zzt()V
    .locals 0

    return-void
.end method
