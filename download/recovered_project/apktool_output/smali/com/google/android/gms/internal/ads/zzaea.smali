.class public final Lcom/google/android/gms/internal/ads/zzaea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzafy;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzaed;

.field private final zzb:J

.field private final zzc:J

.field private final zzd:J

.field private final zze:J

.field private final zzf:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaed;JJJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaea;->zza:Lcom/google/android/gms/internal/ads/zzaed;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzb:J

    iput-wide p6, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzc:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzd:J

    iput-wide p10, p0, Lcom/google/android/gms/internal/ads/zzaea;->zze:J

    iput-wide p12, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzf:J

    return-void
.end method


# virtual methods
.method public final zza()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzb:J

    return-wide v0
.end method

.method public final zzb()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzc(J)Lcom/google/android/gms/internal/ads/zzafw;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaea;->zza:Lcom/google/android/gms/internal/ads/zzaed;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzaed;->zza(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzc:J

    .line 8
    .line 9
    iget-wide v7, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzd:J

    .line 10
    .line 11
    iget-wide v9, p0, Lcom/google/android/gms/internal/ads/zzaea;->zze:J

    .line 12
    .line 13
    iget-wide v11, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzf:J

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    invoke-static/range {v1 .. v12}, Lcom/google/android/gms/internal/ads/zzaec;->zza(JJJJJJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    new-instance v2, Lcom/google/android/gms/internal/ads/zzafw;

    .line 22
    .line 23
    new-instance v3, Lcom/google/android/gms/internal/ads/zzafz;

    .line 24
    .line 25
    invoke-direct {v3, p1, p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzafz;-><init>(JJ)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzafw;-><init>(Lcom/google/android/gms/internal/ads/zzafz;Lcom/google/android/gms/internal/ads/zzafz;)V

    .line 29
    .line 30
    .line 31
    return-object v2
.end method

.method public final zzd(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaea;->zza:Lcom/google/android/gms/internal/ads/zzaed;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzaed;->zza(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final synthetic zze()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzc:J

    return-wide v0
.end method

.method public final synthetic zzf()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzd:J

    return-wide v0
.end method

.method public final synthetic zzg()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaea;->zze:J

    return-wide v0
.end method

.method public final synthetic zzh()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzf:J

    return-wide v0
.end method
