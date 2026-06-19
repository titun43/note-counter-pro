.class public final Lcom/google/android/gms/internal/ads/zzaff;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzafy;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzafh;

.field private final zzb:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzafh;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaff;->zza:Lcom/google/android/gms/internal/ads/zzafh;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzaff;->zzb:J

    return-void
.end method

.method private final zzd(JJ)Lcom/google/android/gms/internal/ads/zzafz;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaff;->zza:Lcom/google/android/gms/internal/ads/zzafh;

    .line 2
    .line 3
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzafh;->zze:I

    .line 4
    .line 5
    const-wide/32 v1, 0xf4240

    .line 6
    .line 7
    .line 8
    mul-long/2addr p1, v1

    .line 9
    int-to-long v0, v0

    .line 10
    div-long/2addr p1, v0

    .line 11
    new-instance v0, Lcom/google/android/gms/internal/ads/zzafz;

    .line 12
    .line 13
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzaff;->zzb:J

    .line 14
    .line 15
    add-long/2addr v1, p3

    .line 16
    invoke-direct {v0, p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzafz;-><init>(JJ)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method


# virtual methods
.method public final zza()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaff;->zza:Lcom/google/android/gms/internal/ads/zzafh;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzafh;->zza()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final zzb()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzc(J)Lcom/google/android/gms/internal/ads/zzafw;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaff;->zza:Lcom/google/android/gms/internal/ads/zzafh;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzafh;->zzk:Lcom/google/android/gms/internal/ads/zzafg;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzafh;->zzb(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzafg;->zza:[J

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x1

    .line 16
    invoke-static {v0, v2, v3, v5, v4}, Lcom/google/android/gms/internal/ads/zzfj;->zzm([JJZZ)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    const/4 v6, -0x1

    .line 23
    if-ne v2, v6, :cond_0

    .line 24
    .line 25
    move-wide v7, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    aget-wide v7, v0, v2

    .line 28
    .line 29
    :goto_0
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzafg;->zzb:[J

    .line 30
    .line 31
    if-ne v2, v6, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    aget-wide v3, v1, v2

    .line 35
    .line 36
    :goto_1
    invoke-direct {p0, v7, v8, v3, v4}, Lcom/google/android/gms/internal/ads/zzaff;->zzd(JJ)Lcom/google/android/gms/internal/ads/zzafz;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-wide v7, v3, Lcom/google/android/gms/internal/ads/zzafz;->zzb:J

    .line 41
    .line 42
    cmp-long p1, v7, p1

    .line 43
    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    array-length p1, v0

    .line 47
    add-int/2addr p1, v6

    .line 48
    if-ne v2, p1, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    add-int/2addr v2, v5

    .line 52
    aget-wide p1, v0, v2

    .line 53
    .line 54
    aget-wide v0, v1, v2

    .line 55
    .line 56
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaff;->zzd(JJ)Lcom/google/android/gms/internal/ads/zzafz;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance p2, Lcom/google/android/gms/internal/ads/zzafw;

    .line 61
    .line 62
    invoke-direct {p2, v3, p1}, Lcom/google/android/gms/internal/ads/zzafw;-><init>(Lcom/google/android/gms/internal/ads/zzafz;Lcom/google/android/gms/internal/ads/zzafz;)V

    .line 63
    .line 64
    .line 65
    return-object p2

    .line 66
    :cond_3
    :goto_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzafw;

    .line 67
    .line 68
    invoke-direct {p1, v3, v3}, Lcom/google/android/gms/internal/ads/zzafw;-><init>(Lcom/google/android/gms/internal/ads/zzafz;Lcom/google/android/gms/internal/ads/zzafz;)V

    .line 69
    .line 70
    .line 71
    return-object p1
.end method
