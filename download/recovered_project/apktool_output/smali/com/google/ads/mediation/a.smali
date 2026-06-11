.class public final Lcom/google/ads/mediation/a;
.super Lcom/google/android/gms/ads/mediation/UnifiedNativeAdMapper;
.source "SourceFile"


# virtual methods
.method public final trackViews(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    .line 1
    instance-of p2, p1, Lcom/google/android/gms/ads/formats/zzh;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    if-nez p2, :cond_1

    .line 5
    .line 6
    sget-object p2, Lcom/google/android/gms/ads/formats/zzc;->zza:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/google/android/gms/ads/formats/zzc;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    throw p3

    .line 18
    :cond_1
    throw p3
.end method
