.class public final Lcom/google/android/gms/internal/ads/zzbbb;
.super Lcom/google/android/gms/internal/ads/zzbby;
.source "SourceFile"


# instance fields
.field private final zzh:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbak;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzawg;JII)V
    .locals 7

    .line 1
    const-string v3, "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig="

    .line 2
    .line 3
    const/16 v6, 0x19

    .line 4
    .line 5
    const-string v2, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh"

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v4, p4

    .line 10
    move v5, p7

    .line 11
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzbby;-><init>(Lcom/google/android/gms/internal/ads/zzbak;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzawg;II)V

    .line 12
    .line 13
    .line 14
    iput-wide p5, v0, Lcom/google/android/gms/internal/ads/zzbbb;->zzh:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbby;->zze:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbby;->zzd:Lcom/google/android/gms/internal/ads/zzawg;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzawg;->zzac(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 18
    .line 19
    .line 20
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzbbb;->zzh:J

    .line 21
    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    cmp-long v5, v3, v5

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    sub-long/2addr v0, v3

    .line 29
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzawg;->zzk(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzawg;->zzn(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :goto_0
    monitor-exit v2

    .line 39
    return-void

    .line 40
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw v0
.end method
