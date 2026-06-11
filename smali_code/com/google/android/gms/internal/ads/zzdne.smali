.class public final Lcom/google/android/gms/internal/ads/zzdne;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzikg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzikp;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzdnd;Lcom/google/android/gms/internal/ads/zzikp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdne;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzdnd;Lcom/google/android/gms/internal/ads/zzikp;)Lcom/google/android/gms/internal/ads/zzdne;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdne;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzdne;-><init>(Lcom/google/android/gms/internal/ads/zzdnd;Lcom/google/android/gms/internal/ads/zzikp;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdne;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zzdng;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdng;->zza()Lcom/google/android/gms/internal/ads/zzdom;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdom;->zza()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
