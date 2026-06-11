.class public final Lcom/google/android/gms/internal/ads/zzfzd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzikg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzikp;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzd;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)Lcom/google/android/gms/internal/ads/zzfzd;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzd;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzfzd;-><init>(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)V

    return-object v0
.end method


# virtual methods
.method public final zzb()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfzd;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zzcmh;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcmh;->zza()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzcml;->zzc()Lcom/google/android/gms/internal/ads/zzfzh;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "context"

    .line 14
    .line 15
    invoke-static {v0, v2}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v2, "coroutineScopeProvider"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v5, Lcom/google/android/gms/internal/ads/zzfzb;->zza:Lcom/google/android/gms/internal/ads/zzfzb;

    .line 24
    .line 25
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzfzh;->zza()Lo4/t;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    new-instance v4, Lcom/google/android/gms/internal/ads/zzfzc;

    .line 30
    .line 31
    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/ads/zzfzc;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    const-string v0, "serializer"

    .line 35
    .line 36
    invoke-static {v5, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "scope"

    .line 40
    .line 41
    invoke-static {v8, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v7, Lt2/i;

    .line 45
    .line 46
    const/16 v0, 0x12

    .line 47
    .line 48
    invoke-direct {v7, v0}, Lt2/i;-><init>(I)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lk0/b;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    sget-object v2, Lu3/o;->g:Lu3/o;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v0, v2, v3, v1}, Lk0/b;-><init>(Ljava/lang/Object;Lw3/c;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ly4/b;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    new-instance v3, Lk0/d0;

    .line 65
    .line 66
    invoke-direct/range {v3 .. v8}, Lk0/d0;-><init>(Lf4/a;Lcom/google/android/gms/internal/ads/zzfzb;Ljava/util/List;Lt2/i;Lo4/t;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zziko;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    return-object v3
.end method
