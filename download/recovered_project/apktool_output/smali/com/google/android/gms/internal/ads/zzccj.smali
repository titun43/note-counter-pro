.class public final Lcom/google/android/gms/internal/ads/zzccj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lx2/b;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcch;


# direct methods
.method public constructor <init>(Lx2/b;Lcom/google/android/gms/internal/ads/zzcch;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzccj;->zza:Lx2/b;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzccj;->zzb:Lcom/google/android/gms/internal/ads/zzcch;

    .line 7
    .line 8
    return-void
.end method

.method public static zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzccj;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzccr;->zzb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzccr;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzccr;->zza()Lcom/google/android/gms/internal/ads/zzccj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public final zzb()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccj;->zza:Lx2/b;

    .line 2
    .line 3
    check-cast v0, Lx2/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzccj;->zzb:Lcom/google/android/gms/internal/ads/zzcch;

    .line 13
    .line 14
    const/4 v3, -0x1

    .line 15
    invoke-virtual {v2, v3, v0, v1}, Lcom/google/android/gms/internal/ads/zzcch;->zza(IJ)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final zzc(Lcom/google/android/gms/ads/internal/client/zzfv;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzccj;->zza:Lx2/b;

    .line 2
    .line 3
    check-cast p1, Lx2/c;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzccj;->zzb:Lcom/google/android/gms/internal/ads/zzcch;

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzcch;->zza(IJ)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final zzd(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccj;->zzb:Lcom/google/android/gms/internal/ads/zzcch;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzcch;->zza(IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
