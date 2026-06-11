.class public final Lcom/google/android/gms/internal/ads/zzetw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfax;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgzy;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgzy;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzetw;->zzb:Lcom/google/android/gms/internal/ads/zzgzy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzetw;->zza:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza()Lj3/a;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzor:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Lcom/google/android/gms/internal/ads/zzetx;

    .line 22
    .line 23
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzetx;-><init>(Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzetw;->zza:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Lcom/google/android/gms/internal/ads/zzetx;

    .line 40
    .line 41
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzetx;-><init>(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzetw;->zzb:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 50
    .line 51
    new-instance v2, Lcom/google/android/gms/internal/ads/zzetv;

    .line 52
    .line 53
    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzetv;-><init>(Landroid/content/ContentResolver;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzgzy;->zzc(Ljava/util/concurrent/Callable;)Lj3/a;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
.end method

.method public final zzb()I
    .locals 1

    const/16 v0, 0x3d

    return v0
.end method
