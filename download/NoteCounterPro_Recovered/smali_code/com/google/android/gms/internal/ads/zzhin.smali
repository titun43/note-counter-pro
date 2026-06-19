.class final Lcom/google/android/gms/internal/ads/zzhin;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzhim;

.field final zzb:[J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhim;-><init>()V

    const/16 v1, 0xa

    new-array v1, v1, [J

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzhin;-><init>(Lcom/google/android/gms/internal/ads/zzhim;[J)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhil;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhin;-><init>()V

    .line 4
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzhin;->zzb(Lcom/google/android/gms/internal/ads/zzhin;Lcom/google/android/gms/internal/ads/zzhil;)Lcom/google/android/gms/internal/ads/zzhin;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhim;[J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhin;->zza:Lcom/google/android/gms/internal/ads/zzhim;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhin;->zzb:[J

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/ads/zzhin;Lcom/google/android/gms/internal/ads/zzhil;)Lcom/google/android/gms/internal/ads/zzhin;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzhin;->zzb(Lcom/google/android/gms/internal/ads/zzhin;Lcom/google/android/gms/internal/ads/zzhil;)Lcom/google/android/gms/internal/ads/zzhin;

    return-object p0
.end method

.method private static zzb(Lcom/google/android/gms/internal/ads/zzhin;Lcom/google/android/gms/internal/ads/zzhil;)Lcom/google/android/gms/internal/ads/zzhin;
    .locals 5

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzhil;->zza:Lcom/google/android/gms/internal/ads/zzhim;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhin;->zza:Lcom/google/android/gms/internal/ads/zzhim;

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzhim;->zza:[J

    .line 6
    .line 7
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzhim;->zza:[J

    .line 8
    .line 9
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzhil;->zzb:[J

    .line 10
    .line 11
    invoke-static {v2, v3, p1}, Lcom/google/android/gms/internal/ads/zzhiv;->zze([J[J[J)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzhim;->zzb:[J

    .line 15
    .line 16
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzhim;->zzb:[J

    .line 17
    .line 18
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhim;->zzc:[J

    .line 19
    .line 20
    invoke-static {v2, v4, v0}, Lcom/google/android/gms/internal/ads/zzhiv;->zze([J[J[J)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzhim;->zzc:[J

    .line 24
    .line 25
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzhiv;->zze([J[J[J)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhin;->zzb:[J

    .line 29
    .line 30
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzhiv;->zze([J[J[J)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method
