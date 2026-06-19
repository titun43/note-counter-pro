.class final Lcom/google/android/gms/internal/ads/zzage;
.super Lcom/google/android/gms/internal/ads/zzafj;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzafy;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzagf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzagf;Lcom/google/android/gms/internal/ads/zzafy;Lcom/google/android/gms/internal/ads/zzafy;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzage;->zza:Lcom/google/android/gms/internal/ads/zzafy;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzage;->zzb:Lcom/google/android/gms/internal/ads/zzagf;

    .line 7
    .line 8
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzafj;-><init>(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final zzc(J)Lcom/google/android/gms/internal/ads/zzafw;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzage;->zza:Lcom/google/android/gms/internal/ads/zzafy;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzafy;->zzc(J)Lcom/google/android/gms/internal/ads/zzafw;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzafw;->zza:Lcom/google/android/gms/internal/ads/zzafz;

    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/internal/ads/zzafw;

    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/internal/ads/zzafz;

    .line 12
    .line 13
    iget-wide v2, p2, Lcom/google/android/gms/internal/ads/zzafz;->zzb:J

    .line 14
    .line 15
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzage;->zzb:Lcom/google/android/gms/internal/ads/zzagf;

    .line 16
    .line 17
    iget-wide v5, p2, Lcom/google/android/gms/internal/ads/zzafz;->zzc:J

    .line 18
    .line 19
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzagf;->zza()J

    .line 20
    .line 21
    .line 22
    move-result-wide v7

    .line 23
    add-long/2addr v7, v5

    .line 24
    invoke-direct {v1, v2, v3, v7, v8}, Lcom/google/android/gms/internal/ads/zzafz;-><init>(JJ)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzafw;->zzb:Lcom/google/android/gms/internal/ads/zzafz;

    .line 28
    .line 29
    new-instance p2, Lcom/google/android/gms/internal/ads/zzafz;

    .line 30
    .line 31
    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/zzafz;->zzb:J

    .line 32
    .line 33
    iget-wide v5, p1, Lcom/google/android/gms/internal/ads/zzafz;->zzc:J

    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzagf;->zza()J

    .line 36
    .line 37
    .line 38
    move-result-wide v7

    .line 39
    add-long/2addr v7, v5

    .line 40
    invoke-direct {p2, v2, v3, v7, v8}, Lcom/google/android/gms/internal/ads/zzafz;-><init>(JJ)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzafw;-><init>(Lcom/google/android/gms/internal/ads/zzafz;Lcom/google/android/gms/internal/ads/zzafz;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method
