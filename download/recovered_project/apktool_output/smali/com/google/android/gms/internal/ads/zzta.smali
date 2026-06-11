.class public final Lcom/google/android/gms/internal/ads/zzta;
.super Lcom/google/android/gms/internal/ads/zzuu;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzlm;


# instance fields
.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzrb;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzrj;

.field private final zze:Lcom/google/android/gms/internal/ads/zzug;

.field private final zzf:Ljava/util/Set;

.field private zzg:I

.field private zzh:Z

.field private zzi:Z

.field private zzj:Lcom/google/android/gms/internal/ads/zzv;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzil;

.field private zzl:Lcom/google/android/gms/internal/ads/zzil;

.field private zzm:Lcom/google/android/gms/internal/ads/zzv;

.field private zzn:J

.field private zzo:Z

.field private zzp:Z

.field private zzq:Z

.field private zzr:I

.field private zzs:Z

.field private zzt:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzui;Lcom/google/android/gms/internal/ads/zzuw;ZLandroid/os/Handler;Lcom/google/android/gms/internal/ads/zzrc;Lcom/google/android/gms/internal/ads/zzrj;)V
    .locals 8

    .line 1
    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v0, 0x23

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-lt p4, v0, :cond_0

    .line 7
    .line 8
    new-instance p4, Lcom/google/android/gms/internal/ads/zzug;

    .line 9
    .line 10
    sget-object v0, Lcom/google/android/gms/internal/ads/zzuf;->zzb:Lcom/google/android/gms/internal/ads/zzuf;

    .line 11
    .line 12
    invoke-direct {p4, v0}, Lcom/google/android/gms/internal/ads/zzug;-><init>(Lcom/google/android/gms/internal/ads/zzuf;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p4, v1

    .line 17
    :goto_0
    const/4 v6, 0x0

    .line 18
    const v7, 0x472c4400    # 44100.0f

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    move-object v2, p0

    .line 23
    move-object v4, p2

    .line 24
    move-object v5, p3

    .line 25
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzuu;-><init>(ILcom/google/android/gms/internal/ads/zzui;Lcom/google/android/gms/internal/ads/zzuw;ZF)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, v2, Lcom/google/android/gms/internal/ads/zzta;->zzb:Landroid/content/Context;

    .line 33
    .line 34
    iput-object p7, v2, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 35
    .line 36
    iput-object p4, v2, Lcom/google/android/gms/internal/ads/zzta;->zze:Lcom/google/android/gms/internal/ads/zzug;

    .line 37
    .line 38
    const/16 p1, -0x3e8

    .line 39
    .line 40
    iput p1, v2, Lcom/google/android/gms/internal/ads/zzta;->zzr:I

    .line 41
    .line 42
    new-instance p1, Lcom/google/android/gms/internal/ads/zzrb;

    .line 43
    .line 44
    invoke-direct {p1, p5, p6}, Lcom/google/android/gms/internal/ads/zzrb;-><init>(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzrc;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, v2, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    .line 48
    .line 49
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    iput-wide p1, v2, Lcom/google/android/gms/internal/ads/zzta;->zzt:J

    .line 55
    .line 56
    new-instance p1, Lcom/google/android/gms/internal/ads/zzsz;

    .line 57
    .line 58
    invoke-direct {p1, p0, v1}, Lcom/google/android/gms/internal/ads/zzsz;-><init>(Lcom/google/android/gms/internal/ads/zzta;[B)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p7, p1}, Lcom/google/android/gms/internal/ads/zzrj;->zza(Lcom/google/android/gms/internal/ads/zzrg;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Ljava/util/HashSet;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, v2, Lcom/google/android/gms/internal/ads/zzta;->zzf:Ljava/util/Set;

    .line 70
    .line 71
    sget-object p1, Lcom/google/android/gms/internal/ads/zzil;->zza:Lcom/google/android/gms/internal/ads/zzil;

    .line 72
    .line 73
    iput-object p1, v2, Lcom/google/android/gms/internal/ads/zzta;->zzk:Lcom/google/android/gms/internal/ads/zzil;

    .line 74
    .line 75
    iput-object p1, v2, Lcom/google/android/gms/internal/ads/zzta;->zzl:Lcom/google/android/gms/internal/ads/zzil;

    .line 76
    .line 77
    return-void
.end method

.method public static synthetic zzat(Lcom/google/android/gms/internal/ads/zzta;)Lcom/google/android/gms/internal/ads/zzmk;
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzaY()Lcom/google/android/gms/internal/ads/zzmk;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic zzau(Lcom/google/android/gms/internal/ads/zzta;)Lcom/google/android/gms/internal/ads/zzmk;
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzaY()Lcom/google/android/gms/internal/ads/zzmk;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic zzav(Lcom/google/android/gms/internal/ads/zzta;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zzR()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static zzbg(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/internal/ads/zzv;ZLcom/google/android/gms/internal/ads/zzrj;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p3, p1}, Lcom/google/android/gms/internal/ads/zzrj;->zzd(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzvg;->zza()Lcom/google/android/gms/internal/ads/zzun;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    const/4 p2, 0x0

    .line 28
    invoke-static {p0, p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzvg;->zzc(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/internal/ads/zzv;ZZ)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method private final zzbh(Lcom/google/android/gms/internal/ads/zzun;Lcom/google/android/gms/internal/ads/zzv;)I
    .locals 1

    .line 1
    const-string v0, "OMX.google.raw.decoder"

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzun;->zza:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget p1, p2, Lcom/google/android/gms/internal/ads/zzv;->zzp:I

    .line 9
    .line 10
    return p1
.end method

.method private final zzbi()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzta;->zzZ()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzrj;->zzg(Z)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/high16 v2, -0x8000000000000000L

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzta;->zzo:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzta;->zzn:J

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :goto_0
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzn:J

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzo:Z

    .line 32
    .line 33
    :cond_1
    return-void
.end method


# virtual methods
.method public final zzA(JZZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzuu;->zzA(JZZ)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 5
    .line 6
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzrj;->zzA()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzn:J

    .line 10
    .line 11
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzt:J

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzq:Z

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzo:Z

    .line 23
    .line 24
    return-void
.end method

.method public final zzB()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzi()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzs:Z

    .line 8
    .line 9
    return-void
.end method

.method public final zzC()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzta;->zzbi()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzs:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzz()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final zzD()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzp:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzj:Lcom/google/android/gms/internal/ads/zzv;

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzt:J

    .line 13
    .line 14
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzA()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    .line 19
    :try_start_1
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzD()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzuu;->zza:Lcom/google/android/gms/internal/ads/zzin;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzrb;->zzg(Lcom/google/android/gms/internal/ads/zzin;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_0

    .line 32
    :catchall_1
    move-exception v0

    .line 33
    :try_start_2
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzD()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzuu;->zza:Lcom/google/android/gms/internal/ads/zzin;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzrb;->zzg(Lcom/google/android/gms/internal/ads/zzin;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    .line 45
    .line 46
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzuu;->zza:Lcom/google/android/gms/internal/ads/zzin;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzrb;->zzg(Lcom/google/android/gms/internal/ads/zzin;)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public final zzE()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzq:Z

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzt:J

    .line 10
    .line 11
    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzE()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzp:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzp:Z

    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzB()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzta;->zzp:Z

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzp:Z

    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 35
    .line 36
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzB()V

    .line 37
    .line 38
    .line 39
    :goto_0
    throw v1
.end method

.method public final zzF()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzC()V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x23

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zze:Lcom/google/android/gms/internal/ads/zzug;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzug;->zzd()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final zzS()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method public final zzY()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzn()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final zzZ()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzZ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzm()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final zzac(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/internal/ads/zzv;)I
    .locals 9

    .line 1
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzas;->zza(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x80

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    iget v1, p2, Lcom/google/android/gms/internal/ads/zzv;->zzN:I

    .line 13
    .line 14
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzuu;->zzbd(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzvg;->zza()Lcom/google/android/gms/internal/ads/zzun;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v7, v4

    .line 32
    goto :goto_3

    .line 33
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 34
    .line 35
    invoke-interface {v1, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzf(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzpz;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    iget-boolean v7, v6, Lcom/google/android/gms/internal/ads/zzpz;->zzb:Z

    .line 40
    .line 41
    if-nez v7, :cond_3

    .line 42
    .line 43
    move v7, v4

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    iget-boolean v7, v6, Lcom/google/android/gms/internal/ads/zzpz;->zzc:Z

    .line 46
    .line 47
    if-eq v5, v7, :cond_4

    .line 48
    .line 49
    const/16 v7, 0x200

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    const/16 v7, 0x600

    .line 53
    .line 54
    :goto_1
    iget-boolean v6, v6, Lcom/google/android/gms/internal/ads/zzpz;->zzd:Z

    .line 55
    .line 56
    if-eqz v6, :cond_5

    .line 57
    .line 58
    or-int/lit16 v7, v7, 0x800

    .line 59
    .line 60
    :cond_5
    :goto_2
    invoke-interface {v1, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzd(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_6

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_6
    or-int/lit16 p1, v7, 0xac

    .line 68
    .line 69
    return p1

    .line 70
    :goto_3
    const-string v1, "audio/raw"

    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_7

    .line 77
    .line 78
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 79
    .line 80
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzd(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_7

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 88
    .line 89
    iget v1, p2, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 90
    .line 91
    iget v6, p2, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 92
    .line 93
    const/4 v8, 0x2

    .line 94
    invoke-static {v8, v1, v6}, Lcom/google/android/gms/internal/ads/zzfj;->zzy(III)Lcom/google/android/gms/internal/ads/zzv;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzrj;->zzd(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_8

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_8
    invoke-static {p1, p2, v4, v0}, Lcom/google/android/gms/internal/ads/zzta;->zzbg(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/internal/ads/zzv;ZLcom/google/android/gms/internal/ads/zzrj;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_9

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_9
    if-nez v3, :cond_a

    .line 117
    .line 118
    move v5, v8

    .line 119
    :goto_4
    or-int/lit16 p1, v5, 0x80

    .line 120
    .line 121
    return p1

    .line 122
    :cond_a
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Lcom/google/android/gms/internal/ads/zzun;

    .line 127
    .line 128
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzun;->zzc(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-nez v1, :cond_c

    .line 133
    .line 134
    move v3, v5

    .line 135
    :goto_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-ge v3, v6, :cond_c

    .line 140
    .line 141
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    check-cast v6, Lcom/google/android/gms/internal/ads/zzun;

    .line 146
    .line 147
    invoke-virtual {v6, p2}, Lcom/google/android/gms/internal/ads/zzun;->zzc(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-eqz v8, :cond_b

    .line 152
    .line 153
    move p1, v4

    .line 154
    move v1, v5

    .line 155
    move-object v0, v6

    .line 156
    goto :goto_6

    .line 157
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_c
    move p1, v5

    .line 161
    :goto_6
    if-eq v5, v1, :cond_d

    .line 162
    .line 163
    const/4 v3, 0x3

    .line 164
    goto :goto_7

    .line 165
    :cond_d
    const/4 v3, 0x4

    .line 166
    :goto_7
    const/16 v6, 0x8

    .line 167
    .line 168
    if-eqz v1, :cond_e

    .line 169
    .line 170
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzun;->zze(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-eqz p2, :cond_e

    .line 175
    .line 176
    const/16 v6, 0x10

    .line 177
    .line 178
    :cond_e
    iget-boolean p2, v0, Lcom/google/android/gms/internal/ads/zzun;->zzg:Z

    .line 179
    .line 180
    if-eq v5, p2, :cond_f

    .line 181
    .line 182
    move p2, v4

    .line 183
    goto :goto_8

    .line 184
    :cond_f
    const/16 p2, 0x40

    .line 185
    .line 186
    :goto_8
    if-eq v5, p1, :cond_10

    .line 187
    .line 188
    move v2, v4

    .line 189
    :cond_10
    or-int p1, v3, v6

    .line 190
    .line 191
    or-int/lit8 p1, p1, 0x20

    .line 192
    .line 193
    or-int/2addr p1, p2

    .line 194
    or-int/2addr p1, v2

    .line 195
    or-int/2addr p1, v7

    .line 196
    return p1
.end method

.method public final zzad(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/internal/ads/zzv;Z)Ljava/util/List;
    .locals 1

    .line 1
    const/4 p3, 0x0

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 3
    .line 4
    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/zzta;->zzbg(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/internal/ads/zzv;ZLcom/google/android/gms/internal/ads/zzrj;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzvg;->zze(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzv;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final zzae(Lcom/google/android/gms/internal/ads/zzv;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zzJ()Lcom/google/android/gms/internal/ads/zzmo;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzrj;->zzd(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final zzaf(Lcom/google/android/gms/internal/ads/zzun;Lcom/google/android/gms/internal/ads/zzv;Landroid/media/MediaCrypto;F)Lcom/google/android/gms/internal/ads/zzuh;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zzI()[Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    array-length v0, p3

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzta;->zzbh(Lcom/google/android/gms/internal/ads/zzun;Lcom/google/android/gms/internal/ads/zzv;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v0, v3, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    move v4, v2

    .line 16
    :goto_0
    if-ge v4, v0, :cond_2

    .line 17
    .line 18
    aget-object v5, p3, v4

    .line 19
    .line 20
    invoke-virtual {p1, p2, v5}, Lcom/google/android/gms/internal/ads/zzun;->zzf(Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzio;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    iget v6, v6, Lcom/google/android/gms/internal/ads/zzio;->zzd:I

    .line 25
    .line 26
    if-eqz v6, :cond_1

    .line 27
    .line 28
    invoke-direct {p0, p1, v5}, Lcom/google/android/gms/internal/ads/zzta;->zzbh(Lcom/google/android/gms/internal/ads/zzun;Lcom/google/android/gms/internal/ads/zzv;)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzg:I

    .line 40
    .line 41
    iget-object p3, p1, Lcom/google/android/gms/internal/ads/zzun;->zza:Ljava/lang/String;

    .line 42
    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzta;->zzh:Z

    .line 46
    .line 47
    const-string v1, "OMX.google.opus.decoder"

    .line 48
    .line 49
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    const-string v1, "c2.android.opus.decoder"

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    const-string v1, "OMX.google.vorbis.decoder"

    .line 64
    .line 65
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    const-string v1, "c2.android.vorbis.decoder"

    .line 72
    .line 73
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    if-eqz p3, :cond_4

    .line 78
    .line 79
    :cond_3
    move p3, v3

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move p3, v2

    .line 82
    :goto_2
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzta;->zzi:Z

    .line 83
    .line 84
    iget-object p3, p1, Lcom/google/android/gms/internal/ads/zzun;->zzc:Ljava/lang/String;

    .line 85
    .line 86
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzg:I

    .line 87
    .line 88
    new-instance v4, Landroid/media/MediaFormat;

    .line 89
    .line 90
    invoke-direct {v4}, Landroid/media/MediaFormat;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v5, "mime"

    .line 94
    .line 95
    invoke-virtual {v4, v5, p3}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget p3, p2, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 99
    .line 100
    const-string v5, "channel-count"

    .line 101
    .line 102
    invoke-virtual {v4, v5, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    iget v5, p2, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 106
    .line 107
    const-string v6, "sample-rate"

    .line 108
    .line 109
    invoke-virtual {v4, v6, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    iget-object v6, p2, Lcom/google/android/gms/internal/ads/zzv;->zzr:Ljava/util/List;

    .line 113
    .line 114
    invoke-static {v4, v6}, Lcom/google/android/gms/internal/ads/zzeh;->zza(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    const-string v6, "max-input-size"

    .line 118
    .line 119
    invoke-static {v4, v6, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 120
    .line 121
    .line 122
    const-string v1, "priority"

    .line 123
    .line 124
    invoke-virtual {v4, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 125
    .line 126
    .line 127
    const/high16 v1, -0x40800000    # -1.0f

    .line 128
    .line 129
    cmpl-float v1, p4, v1

    .line 130
    .line 131
    if-eqz v1, :cond_5

    .line 132
    .line 133
    const-string v1, "operating-rate"

    .line 134
    .line 135
    invoke-virtual {v4, v1, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 136
    .line 137
    .line 138
    :cond_5
    iget-object p4, p2, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 139
    .line 140
    const-string v1, "audio/ac4"

    .line 141
    .line 142
    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_7

    .line 147
    .line 148
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzdo;->zzd(Lcom/google/android/gms/internal/ads/zzv;)Landroid/util/Pair;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-eqz v1, :cond_6

    .line 153
    .line 154
    iget-object v6, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v6, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    const-string v7, "profile"

    .line 163
    .line 164
    invoke-static {v4, v7, v6}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v1, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    const-string v6, "level"

    .line 176
    .line 177
    invoke-static {v4, v6, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 178
    .line 179
    .line 180
    :cond_6
    const/16 v1, 0x1c

    .line 181
    .line 182
    if-gt v0, v1, :cond_7

    .line 183
    .line 184
    const-string v1, "ac4-is-sync"

    .line 185
    .line 186
    invoke-virtual {v4, v1, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 187
    .line 188
    .line 189
    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 190
    .line 191
    const/4 v3, 0x4

    .line 192
    invoke-static {v3, p3, v5}, Lcom/google/android/gms/internal/ads/zzfj;->zzy(III)Lcom/google/android/gms/internal/ads/zzv;

    .line 193
    .line 194
    .line 195
    move-result-object p3

    .line 196
    invoke-interface {v1, p3}, Lcom/google/android/gms/internal/ads/zzrj;->zze(Lcom/google/android/gms/internal/ads/zzv;)I

    .line 197
    .line 198
    .line 199
    move-result p3

    .line 200
    const/4 v1, 0x2

    .line 201
    if-ne p3, v1, :cond_8

    .line 202
    .line 203
    const-string p3, "pcm-encoding"

    .line 204
    .line 205
    invoke-virtual {v4, p3, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 206
    .line 207
    .line 208
    :cond_8
    const/16 p3, 0x20

    .line 209
    .line 210
    if-lt v0, p3, :cond_9

    .line 211
    .line 212
    const-string p3, "max-output-channel-count"

    .line 213
    .line 214
    const/16 v1, 0x63

    .line 215
    .line 216
    invoke-virtual {v4, p3, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 217
    .line 218
    .line 219
    :cond_9
    const/16 p3, 0x23

    .line 220
    .line 221
    if-lt v0, p3, :cond_a

    .line 222
    .line 223
    iget p3, p0, Lcom/google/android/gms/internal/ads/zzta;->zzr:I

    .line 224
    .line 225
    neg-int p3, p3

    .line 226
    invoke-static {v2, p3}, Ljava/lang/Math;->max(II)I

    .line 227
    .line 228
    .line 229
    move-result p3

    .line 230
    const-string v1, "importance"

    .line 231
    .line 232
    invoke-virtual {v4, v1, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 233
    .line 234
    .line 235
    :cond_a
    const/16 p3, 0x1d

    .line 236
    .line 237
    if-lt v0, p3, :cond_b

    .line 238
    .line 239
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzta;->zzk:Lcom/google/android/gms/internal/ads/zzil;

    .line 240
    .line 241
    invoke-virtual {p3, v4}, Lcom/google/android/gms/internal/ads/zzil;->zzb(Landroid/media/MediaFormat;)V

    .line 242
    .line 243
    .line 244
    :cond_b
    iget-object p3, p1, Lcom/google/android/gms/internal/ads/zzun;->zzb:Ljava/lang/String;

    .line 245
    .line 246
    const-string v0, "audio/raw"

    .line 247
    .line 248
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result p3

    .line 252
    const/4 v1, 0x0

    .line 253
    if-eqz p3, :cond_c

    .line 254
    .line 255
    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p3

    .line 259
    if-nez p3, :cond_c

    .line 260
    .line 261
    move-object p3, p2

    .line 262
    goto :goto_3

    .line 263
    :cond_c
    move-object p3, v1

    .line 264
    :goto_3
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzta;->zzm:Lcom/google/android/gms/internal/ads/zzv;

    .line 265
    .line 266
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzta;->zze:Lcom/google/android/gms/internal/ads/zzug;

    .line 267
    .line 268
    invoke-static {p1, v4, p2, v1, p3}, Lcom/google/android/gms/internal/ads/zzuh;->zza(Lcom/google/android/gms/internal/ads/zzun;Landroid/media/MediaFormat;Lcom/google/android/gms/internal/ads/zzv;Landroid/media/MediaCrypto;Lcom/google/android/gms/internal/ads/zzug;)Lcom/google/android/gms/internal/ads/zzuh;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    return-object p1
.end method

.method public final zzag(Lcom/google/android/gms/internal/ads/zzun;Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzio;
    .locals 8

    .line 1
    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzun;->zzf(Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzio;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzio;->zze:I

    .line 6
    .line 7
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/ads/zzuu;->zzaB(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const v2, 0x8000

    .line 14
    .line 15
    .line 16
    or-int/2addr v1, v2

    .line 17
    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzta;->zzbh(Lcom/google/android/gms/internal/ads/zzun;Lcom/google/android/gms/internal/ads/zzv;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzta;->zzg:I

    .line 22
    .line 23
    if-le v2, v3, :cond_1

    .line 24
    .line 25
    or-int/lit8 v1, v1, 0x40

    .line 26
    .line 27
    :cond_1
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzun;->zza:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v2, Lcom/google/android/gms/internal/ads/zzio;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    move v6, p1

    .line 35
    move v7, v1

    .line 36
    :goto_0
    move-object v4, p2

    .line 37
    move-object v5, p3

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzio;->zzd:I

    .line 40
    .line 41
    move v7, p1

    .line 42
    move v6, v0

    .line 43
    goto :goto_0

    .line 44
    :goto_1
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzio;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzv;II)V

    .line 45
    .line 46
    .line 47
    return-object v2
.end method

.method public final zzah(JJZ)J
    .locals 8

    .line 1
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 2
    .line 3
    invoke-interface {p5}, Lcom/google/android/gms/internal/ads/zzrj;->zzn()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzta;->zzt:J

    .line 16
    .line 17
    cmp-long v0, v4, v2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzs:Z

    .line 23
    .line 24
    const-wide/16 v4, 0x2710

    .line 25
    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzZ()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-wide v4

    .line 38
    :cond_2
    :goto_0
    const-wide/32 p1, 0xf4240

    .line 39
    .line 40
    .line 41
    return-wide p1

    .line 42
    :cond_3
    invoke-interface {p5}, Lcom/google/android/gms/internal/ads/zzrj;->zzw()J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    if-eqz v1, :cond_6

    .line 47
    .line 48
    cmp-long p5, v6, v2

    .line 49
    .line 50
    if-nez p5, :cond_4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzt:J

    .line 54
    .line 55
    sub-long/2addr v0, p1

    .line 56
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide p1

    .line 60
    long-to-float p1, p1

    .line 61
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzta;->zzj()Lcom/google/android/gms/internal/ads/zzav;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-eqz p2, :cond_5

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzta;->zzj()Lcom/google/android/gms/internal/ads/zzav;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iget p2, p2, Lcom/google/android/gms/internal/ads/zzav;->zzb:F

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_5
    const/high16 p2, 0x3f800000    # 1.0f

    .line 75
    .line 76
    :goto_1
    div-float/2addr p1, p2

    .line 77
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zzL()Lcom/google/android/gms/internal/ads/zzdn;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzdn;->zzb()J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    sub-long/2addr v0, p3

    .line 90
    const/high16 p2, 0x40000000    # 2.0f

    .line 91
    .line 92
    div-float/2addr p1, p2

    .line 93
    float-to-long p1, p1

    .line 94
    sub-long/2addr p1, v0

    .line 95
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 96
    .line 97
    .line 98
    move-result-wide p1

    .line 99
    return-wide p1

    .line 100
    :cond_6
    :goto_2
    return-wide v4
.end method

.method public final zzai(FLcom/google/android/gms/internal/ads/zzv;[Lcom/google/android/gms/internal/ads/zzv;)F
    .locals 3

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 v0, -0x1

    .line 3
    move v1, v0

    .line 4
    :goto_0
    array-length v2, p3

    .line 5
    if-ge p2, v2, :cond_1

    .line 6
    .line 7
    aget-object v2, p3, p2

    .line 8
    .line 9
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 10
    .line 11
    if-eq v2, v0, :cond_0

    .line 12
    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v1, v0, :cond_2

    .line 21
    .line 22
    const/high16 p1, -0x40800000    # -1.0f

    .line 23
    .line 24
    return p1

    .line 25
    :cond_2
    int-to-float p2, v1

    .line 26
    mul-float/2addr p2, p1

    .line 27
    return p2
.end method

.method public final zzaj(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzuh;JJ)V
    .locals 0

    .line 1
    move-object p2, p1

    .line 2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    .line 3
    .line 4
    invoke-virtual/range {p1 .. p6}, Lcom/google/android/gms/internal/ads/zzrb;->zzb(Ljava/lang/String;JJ)V

    .line 5
    .line 6
    .line 7
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 p2, 0x1f

    .line 10
    .line 11
    if-lt p1, p2, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzf:Ljava/util/Set;

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzaE()Lcom/google/android/gms/internal/ads/zzuk;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance p3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzuk;->zzr(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final zzak(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzrb;->zzf(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzal(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzee;->zzf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzrb;->zzj(Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final zzam(Lcom/google/android/gms/internal/ads/zzlh;)Lcom/google/android/gms/internal/ads/zzio;
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzlh;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzj:Lcom/google/android/gms/internal/ads/zzv;

    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzuu;->zzam(Lcom/google/android/gms/internal/ads/zzlh;)Lcom/google/android/gms/internal/ads/zzio;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    .line 13
    .line 14
    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzrb;->zzc(Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzio;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public final zzan(Lcom/google/android/gms/internal/ads/zzv;Landroid/media/MediaFormat;)V
    .locals 11

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    const/16 v6, 0x1d

    .line 9
    .line 10
    if-lt v0, v6, :cond_8

    .line 11
    .line 12
    if-eqz p2, :cond_8

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzf:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    sget-object v7, Lcom/google/android/gms/internal/ads/zzil;->zza:Lcom/google/android/gms/internal/ads/zzil;

    .line 24
    .line 25
    new-instance v7, Lcom/google/android/gms/internal/ads/zzik;

    .line 26
    .line 27
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzik;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    if-eqz v8, :cond_7

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    check-cast v8, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p2, v8}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    if-eqz v9, :cond_1

    .line 51
    .line 52
    invoke-static {p2, v8}, Landroidx/lifecycle/g0;->a(Landroid/media/MediaFormat;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-eq v9, v5, :cond_6

    .line 57
    .line 58
    if-eq v9, v4, :cond_5

    .line 59
    .line 60
    if-eq v9, v3, :cond_4

    .line 61
    .line 62
    if-eq v9, v2, :cond_3

    .line 63
    .line 64
    if-eq v9, v1, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {p2, v8}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzik;->zze(Ljava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/android/gms/internal/ads/zzik;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-virtual {p2, v8}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzik;->zzd(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzik;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    invoke-virtual {p2, v8}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;)F

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzik;->zzc(Ljava/lang/String;F)Lcom/google/android/gms/internal/ads/zzik;

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    invoke-virtual {p2, v8}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v9

    .line 95
    invoke-virtual {v7, v8, v9, v10}, Lcom/google/android/gms/internal/ads/zzik;->zzb(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/zzik;

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    invoke-virtual {p2, v8}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzik;->zza(Ljava/lang/String;I)Lcom/google/android/gms/internal/ads/zzik;

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_7
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzik;->zzg()Lcom/google/android/gms/internal/ads/zzil;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzta;->zzl:Lcom/google/android/gms/internal/ads/zzil;

    .line 112
    .line 113
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzil;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-nez v7, :cond_8

    .line 118
    .line 119
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzl:Lcom/google/android/gms/internal/ads/zzil;

    .line 120
    .line 121
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    .line 122
    .line 123
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/zzrb;->zzn(Lcom/google/android/gms/internal/ads/zzil;)V

    .line 124
    .line 125
    .line 126
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzm:Lcom/google/android/gms/internal/ads/zzv;

    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    const/4 v8, 0x0

    .line 130
    if-eqz v0, :cond_9

    .line 131
    .line 132
    move-object p1, v0

    .line 133
    goto/16 :goto_5

    .line 134
    .line 135
    :cond_9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzaE()Lcom/google/android/gms/internal/ads/zzuk;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-nez v0, :cond_a

    .line 140
    .line 141
    goto/16 :goto_5

    .line 142
    .line 143
    :cond_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 147
    .line 148
    const-string v9, "audio/raw"

    .line 149
    .line 150
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_b

    .line 155
    .line 156
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzI:I

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_b
    const-string v0, "pcm-encoding"

    .line 160
    .line 161
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    if-eqz v10, :cond_c

    .line 166
    .line 167
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    goto :goto_2

    .line 172
    :cond_c
    const-string v0, "v-bits-per-sample"

    .line 173
    .line 174
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-eqz v10, :cond_d

    .line 179
    .line 180
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    sget-object v10, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 185
    .line 186
    invoke-static {v0, v10}, Lcom/google/android/gms/internal/ads/zzfj;->zzz(ILjava/nio/ByteOrder;)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    goto :goto_2

    .line 191
    :cond_d
    move v0, v4

    .line 192
    :goto_2
    new-instance v10, Lcom/google/android/gms/internal/ads/zzt;

    .line 193
    .line 194
    invoke-direct {v10}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v10, v9}, Lcom/google/android/gms/internal/ads/zzt;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 201
    .line 202
    .line 203
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzJ:I

    .line 204
    .line 205
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzH(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 206
    .line 207
    .line 208
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzK:I

    .line 209
    .line 210
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 211
    .line 212
    .line 213
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 214
    .line 215
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 216
    .line 217
    .line 218
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zza:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 221
    .line 222
    .line 223
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzb:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 226
    .line 227
    .line 228
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzc:Ljava/util/List;

    .line 229
    .line 230
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzd(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    .line 231
    .line 232
    .line 233
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzd:Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 236
    .line 237
    .line 238
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zze:I

    .line 239
    .line 240
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzf(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 241
    .line 242
    .line 243
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzf:I

    .line 244
    .line 245
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzg(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 246
    .line 247
    .line 248
    const-string v0, "channel-count"

    .line 249
    .line 250
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzE(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 255
    .line 256
    .line 257
    const-string v0, "sample-rate"

    .line 258
    .line 259
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 260
    .line 261
    .line 262
    move-result p2

    .line 263
    invoke-virtual {v10, p2}, Lcom/google/android/gms/internal/ads/zzt;->zzF(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzh:Z

    .line 271
    .line 272
    const/4 v9, 0x6

    .line 273
    if-eqz v0, :cond_f

    .line 274
    .line 275
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 276
    .line 277
    if-ne v0, v9, :cond_f

    .line 278
    .line 279
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 280
    .line 281
    if-ge p1, v9, :cond_f

    .line 282
    .line 283
    new-array v7, p1, [I

    .line 284
    .line 285
    move v0, v8

    .line 286
    :goto_3
    if-ge v0, p1, :cond_e

    .line 287
    .line 288
    aput v0, v7, v0

    .line 289
    .line 290
    add-int/lit8 v0, v0, 0x1

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_e
    :goto_4
    move-object p1, p2

    .line 294
    goto :goto_5

    .line 295
    :cond_f
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzi:Z

    .line 296
    .line 297
    if-eqz p1, :cond_e

    .line 298
    .line 299
    iget p1, p2, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 300
    .line 301
    if-eq p1, v3, :cond_14

    .line 302
    .line 303
    if-eq p1, v1, :cond_13

    .line 304
    .line 305
    if-eq p1, v9, :cond_12

    .line 306
    .line 307
    const/4 v0, 0x7

    .line 308
    if-eq p1, v0, :cond_11

    .line 309
    .line 310
    const/16 v10, 0x8

    .line 311
    .line 312
    if-eq p1, v10, :cond_10

    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_10
    new-array v7, v10, [I

    .line 316
    .line 317
    aput v8, v7, v8

    .line 318
    .line 319
    aput v4, v7, v5

    .line 320
    .line 321
    aput v5, v7, v4

    .line 322
    .line 323
    aput v0, v7, v3

    .line 324
    .line 325
    aput v1, v7, v2

    .line 326
    .line 327
    aput v9, v7, v1

    .line 328
    .line 329
    aput v3, v7, v9

    .line 330
    .line 331
    aput v2, v7, v0

    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_11
    new-array v7, v0, [I

    .line 335
    .line 336
    aput v8, v7, v8

    .line 337
    .line 338
    aput v4, v7, v5

    .line 339
    .line 340
    aput v5, v7, v4

    .line 341
    .line 342
    aput v9, v7, v3

    .line 343
    .line 344
    aput v1, v7, v2

    .line 345
    .line 346
    aput v3, v7, v1

    .line 347
    .line 348
    aput v2, v7, v9

    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_12
    new-array v7, v9, [I

    .line 352
    .line 353
    aput v8, v7, v8

    .line 354
    .line 355
    aput v4, v7, v5

    .line 356
    .line 357
    aput v5, v7, v4

    .line 358
    .line 359
    aput v1, v7, v3

    .line 360
    .line 361
    aput v3, v7, v2

    .line 362
    .line 363
    aput v2, v7, v1

    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_13
    new-array v7, v1, [I

    .line 367
    .line 368
    aput v8, v7, v8

    .line 369
    .line 370
    aput v4, v7, v5

    .line 371
    .line 372
    aput v5, v7, v4

    .line 373
    .line 374
    aput v3, v7, v3

    .line 375
    .line 376
    aput v2, v7, v2

    .line 377
    .line 378
    goto :goto_4

    .line 379
    :cond_14
    new-array v7, v3, [I

    .line 380
    .line 381
    aput v8, v7, v8

    .line 382
    .line 383
    aput v4, v7, v5

    .line 384
    .line 385
    aput v5, v7, v4

    .line 386
    .line 387
    goto :goto_4

    .line 388
    :goto_5
    :try_start_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 389
    .line 390
    if-lt p2, v6, :cond_17

    .line 391
    .line 392
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzaD()Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-eqz v0, :cond_15

    .line 397
    .line 398
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zzJ()Lcom/google/android/gms/internal/ads/zzmo;

    .line 399
    .line 400
    .line 401
    goto :goto_6

    .line 402
    :catch_0
    move-exception p1

    .line 403
    goto :goto_8

    .line 404
    :cond_15
    :goto_6
    if-lt p2, v6, :cond_16

    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_16
    move v5, v8

    .line 408
    :goto_7
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 409
    .line 410
    .line 411
    :cond_17
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 412
    .line 413
    invoke-interface {p2, p1, v8, v7}, Lcom/google/android/gms/internal/ads/zzrj;->zzh(Lcom/google/android/gms/internal/ads/zzv;I[I)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzre; {:try_start_0 .. :try_end_0} :catch_0

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :goto_8
    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzre;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 418
    .line 419
    const/16 v0, 0x1389

    .line 420
    .line 421
    invoke-virtual {p0, p1, p2, v8, v0}, Lcom/google/android/gms/internal/ads/zzij;->zzN(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;ZI)Lcom/google/android/gms/internal/ads/zziw;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    throw p1
.end method

.method public final zzao()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzo:Z

    return-void
.end method

.method public final zzap()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzj()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzaq(JJLcom/google/android/gms/internal/ads/zzuk;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzv;)Z
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzt:J

    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzm:Lcom/google/android/gms/internal/ads/zzv;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    const/4 p3, 0x0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    and-int/lit8 p1, p8, 0x2

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {p5, p7, p3}, Lcom/google/android/gms/internal/ads/zzuk;->zzc(IZ)V

    .line 25
    .line 26
    .line 27
    return p2

    .line 28
    :cond_0
    if-eqz p12, :cond_2

    .line 29
    .line 30
    if-eqz p5, :cond_1

    .line 31
    .line 32
    invoke-interface {p5, p7, p3}, Lcom/google/android/gms/internal/ads/zzuk;->zzc(IZ)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzuu;->zza:Lcom/google/android/gms/internal/ads/zzin;

    .line 36
    .line 37
    iget p3, p1, Lcom/google/android/gms/internal/ads/zzin;->zzf:I

    .line 38
    .line 39
    add-int/2addr p3, p9

    .line 40
    iput p3, p1, Lcom/google/android/gms/internal/ads/zzin;->zzf:I

    .line 41
    .line 42
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 43
    .line 44
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzrj;->zzj()V

    .line 45
    .line 46
    .line 47
    return p2

    .line 48
    :cond_2
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 49
    .line 50
    invoke-interface {p1, p6, p10, p11, p9}, Lcom/google/android/gms/internal/ads/zzrj;->zzk(Ljava/nio/ByteBuffer;JI)Z

    .line 51
    .line 52
    .line 53
    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzrf; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/internal/ads/zzri; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    if-eqz p5, :cond_3

    .line 57
    .line 58
    invoke-interface {p5, p7, p3}, Lcom/google/android/gms/internal/ads/zzuk;->zzc(IZ)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzuu;->zza:Lcom/google/android/gms/internal/ads/zzin;

    .line 62
    .line 63
    iget p3, p1, Lcom/google/android/gms/internal/ads/zzin;->zze:I

    .line 64
    .line 65
    add-int/2addr p3, p9

    .line 66
    iput p3, p1, Lcom/google/android/gms/internal/ads/zzin;->zze:I

    .line 67
    .line 68
    return p2

    .line 69
    :cond_4
    iput-wide p10, p0, Lcom/google/android/gms/internal/ads/zzta;->zzt:J

    .line 70
    .line 71
    return p3

    .line 72
    :catch_0
    move-exception p1

    .line 73
    goto :goto_0

    .line 74
    :catch_1
    move-exception p1

    .line 75
    goto :goto_2

    .line 76
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzaD()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-nez p2, :cond_5

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zzJ()Lcom/google/android/gms/internal/ads/zzmo;

    .line 84
    .line 85
    .line 86
    :goto_1
    iget-boolean p2, p1, Lcom/google/android/gms/internal/ads/zzri;->zzb:Z

    .line 87
    .line 88
    const/16 p3, 0x138a

    .line 89
    .line 90
    invoke-virtual {p0, p1, p14, p2, p3}, Lcom/google/android/gms/internal/ads/zzij;->zzN(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;ZI)Lcom/google/android/gms/internal/ads/zziw;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    throw p1

    .line 95
    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzta;->zzj:Lcom/google/android/gms/internal/ads/zzv;

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzaD()Z

    .line 98
    .line 99
    .line 100
    move-result p4

    .line 101
    if-eqz p4, :cond_6

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zzJ()Lcom/google/android/gms/internal/ads/zzmo;

    .line 104
    .line 105
    .line 106
    :cond_6
    const/16 p4, 0x1389

    .line 107
    .line 108
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzij;->zzN(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;ZI)Lcom/google/android/gms/internal/ads/zziw;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    throw p1
.end method

.method public final zzar()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzl()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzba()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzba()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzt:J
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzri; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void

    .line 29
    :goto_0
    const/4 v1, 0x1

    .line 30
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzaD()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v1, v2, :cond_1

    .line 35
    .line 36
    const/16 v1, 0x138a

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/16 v1, 0x138b

    .line 40
    .line 41
    :goto_1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzri;->zzc:Lcom/google/android/gms/internal/ads/zzv;

    .line 42
    .line 43
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzri;->zzb:Z

    .line 44
    .line 45
    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzij;->zzN(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;ZI)Lcom/google/android/gms/internal/ads/zziw;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    throw v0
.end method

.method public final zzas(Lcom/google/android/gms/internal/ads/zzih;)V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzih;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "audio/opus"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzaD()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzih;->zzf:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzih;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzv;->zzJ:I

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/16 v2, 0x8

    .line 44
    .line 45
    if-ne v1, v2, :cond_0

    .line 46
    .line 47
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    const-wide/32 v2, 0xbb80

    .line 58
    .line 59
    .line 60
    mul-long/2addr v0, v2

    .line 61
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 62
    .line 63
    const-wide/32 v3, 0x3b9aca00

    .line 64
    .line 65
    .line 66
    div-long/2addr v0, v3

    .line 67
    long-to-int v0, v0

    .line 68
    invoke-interface {v2, p1, v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzx(II)V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-void
.end method

.method public final synthetic zzaw()Lcom/google/android/gms/internal/ads/zzrb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    return-object v0
.end method

.method public final synthetic zzax()Lcom/google/android/gms/internal/ads/zzug;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zze:Lcom/google/android/gms/internal/ads/zzug;

    return-object v0
.end method

.method public final synthetic zzay(Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzq:Z

    return-void
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzlm;
    .locals 0

    return-object p0
.end method

.method public final zzg()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zze()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzta;->zzbi()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzn:J

    .line 12
    .line 13
    return-wide v0
.end method

.method public final zzh()Z
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzq:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzq:Z

    return v0
.end method

.method public final zzi(Lcom/google/android/gms/internal/ads/zzav;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzrj;->zzo(Lcom/google/android/gms/internal/ads/zzav;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzj()Lcom/google/android/gms/internal/ads/zzav;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrj;->zzp()Lcom/google/android/gms/internal/ads/zzav;

    move-result-object v0

    return-object v0
.end method

.method public final zzx(ILjava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_8

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p1, v0, :cond_7

    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    if-eq p1, v0, :cond_6

    .line 9
    .line 10
    const/16 v0, 0xc

    .line 11
    .line 12
    if-eq p1, v0, :cond_5

    .line 13
    .line 14
    const/16 v0, 0x10

    .line 15
    .line 16
    const/16 v1, 0x23

    .line 17
    .line 18
    if-eq p1, v0, :cond_3

    .line 19
    .line 20
    const/16 v0, 0x13

    .line 21
    .line 22
    if-eq p1, v0, :cond_2

    .line 23
    .line 24
    const/16 v0, 0x9

    .line 25
    .line 26
    if-eq p1, v0, :cond_1

    .line 27
    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    if-eq p1, v0, :cond_0

    .line 31
    .line 32
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzuu;->zzx(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 46
    .line 47
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzrj;->zzs(I)V

    .line 48
    .line 49
    .line 50
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    if-lt p2, v1, :cond_4

    .line 53
    .line 54
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzta;->zze:Lcom/google/android/gms/internal/ads/zzug;

    .line 55
    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzug;->zza(I)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    check-cast p2, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzq(Z)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    check-cast p2, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzv(I)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzr:I

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzuu;->zzaE()Lcom/google/android/gms/internal/ads/zzuk;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    if-lt p2, v1, :cond_4

    .line 112
    .line 113
    new-instance p2, Landroid/os/Bundle;

    .line 114
    .line 115
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 116
    .line 117
    .line 118
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzta;->zzr:I

    .line 119
    .line 120
    neg-int v0, v0

    .line 121
    const/4 v1, 0x0

    .line 122
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    const-string v1, "importance"

    .line 127
    .line 128
    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzuk;->zzp(Landroid/os/Bundle;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    return-void

    .line 135
    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 136
    .line 137
    check-cast p2, Landroid/media/AudioDeviceInfo;

    .line 138
    .line 139
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzu(Landroid/media/AudioDeviceInfo;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_6
    check-cast p2, Lcom/google/android/gms/internal/ads/zze;

    .line 144
    .line 145
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzt(Lcom/google/android/gms/internal/ads/zze;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_7
    check-cast p2, Lcom/google/android/gms/internal/ads/zzd;

    .line 155
    .line 156
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 157
    .line 158
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzr(Lcom/google/android/gms/internal/ads/zzd;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_8
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 166
    .line 167
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    check-cast p2, Ljava/lang/Float;

    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzy(F)V

    .line 177
    .line 178
    .line 179
    return-void
.end method

.method public final zzy(ZZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzuu;->zzy(ZZ)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzc:Lcom/google/android/gms/internal/ads/zzrb;

    .line 5
    .line 6
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzuu;->zza:Lcom/google/android/gms/internal/ads/zzin;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzrb;->zza(Lcom/google/android/gms/internal/ads/zzin;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zzJ()Lcom/google/android/gms/internal/ads/zzmo;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzta;->zzd:Lcom/google/android/gms/internal/ads/zzrj;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zzK()Lcom/google/android/gms/internal/ads/zzpq;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzb(Lcom/google/android/gms/internal/ads/zzpq;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzij;->zzL()Lcom/google/android/gms/internal/ads/zzdn;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzrj;->zzc(Lcom/google/android/gms/internal/ads/zzdn;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
