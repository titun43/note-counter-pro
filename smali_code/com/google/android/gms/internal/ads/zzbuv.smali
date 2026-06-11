.class public final Lcom/google/android/gms/internal/ads/zzbuv;
.super Lcom/google/android/gms/internal/ads/zzbub;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/ads/mediation/MediationInterscrollerAd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/mediation/MediationInterscrollerAd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbub;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbuv;->zza:Lcom/google/android/gms/ads/mediation/MediationInterscrollerAd;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zze()La3/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbuv;->zza:Lcom/google/android/gms/ads/mediation/MediationInterscrollerAd;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/MediationBannerAd;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La3/b;

    .line 8
    .line 9
    invoke-direct {v1, v0}, La3/b;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v1
.end method

.method public final zzf()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbuv;->zza:Lcom/google/android/gms/ads/mediation/MediationInterscrollerAd;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/MediationInterscrollerAd;->shouldDelegateInterscrollerEffect()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
