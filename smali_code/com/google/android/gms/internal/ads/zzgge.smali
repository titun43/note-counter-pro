.class final Lcom/google/android/gms/internal/ads/zzgge;
.super Lcom/google/android/gms/internal/ads/zzghb;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/app/Activity;

.field private final zzb:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzawg;Lcom/google/android/gms/internal/ads/zzgfx;Landroid/view/View;Landroid/app/Activity;Lcom/google/android/gms/internal/ads/zzgoe;)V
    .locals 7

    .line 1
    const/16 v0, 0x6f

    .line 2
    .line 3
    invoke-virtual {p5, v0}, Lcom/google/android/gms/internal/ads/zzgoe;->zza(I)Lcom/google/android/gms/internal/ads/zzgoc;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    const-string v2, "bnVSgdPP2gLWa4hBN3KENgNw/HH5/Lu+gCRQEGIHMH/zN0uabg0EmprGntHqQpss"

    .line 8
    .line 9
    const-string v3, "4mb2wE47WPzlH8QFuj7X929jGLgzTiMr8Iu3TogjJ0U="

    .line 10
    .line 11
    move-object v1, p0

    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzghb;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzawg;Lcom/google/android/gms/internal/ads/zzgfx;Lcom/google/android/gms/internal/ads/zzgoc;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, v1, Lcom/google/android/gms/internal/ads/zzgge;->zzb:Landroid/view/View;

    .line 18
    .line 19
    iput-object p4, v1, Lcom/google/android/gms/internal/ads/zzgge;->zza:Landroid/app/Activity;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/reflect/Method;Lcom/google/android/gms/internal/ads/zzawg;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgge;->zzb:Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgge;->zza:Landroid/app/Activity;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, ""

    .line 10
    .line 11
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    monitor-enter p2

    .line 21
    const/4 v0, 0x0

    .line 22
    :try_start_0
    aget-object v0, p1, v0

    .line 23
    .line 24
    check-cast v0, Ljava/lang/Long;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzawg;->zzS(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    aget-object v0, p1, v0

    .line 35
    .line 36
    check-cast v0, Ljava/lang/Long;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzawg;->zzT(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    aget-object p1, p1, v0

    .line 47
    .line 48
    check-cast p1, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzawg;->zzU(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzawg;

    .line 51
    .line 52
    .line 53
    monitor-exit p2

    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    throw p1
.end method
