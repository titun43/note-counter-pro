.class final synthetic Lcom/google/android/gms/internal/ads/zzdtg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgyw;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzdtk;

.field private final synthetic zzb:Ljava/lang/String;

.field private final synthetic zzc:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdtk;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdtg;->zza:Lcom/google/android/gms/internal/ads/zzdtk;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdtg;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdtg;->zzc:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)Lj3/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdtg;->zza:Lcom/google/android/gms/internal/ads/zzdtk;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdtg;->zzb:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdtg;->zzc:Lorg/json/JSONObject;

    .line 6
    .line 7
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcjl;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzdtk;->zzj(Ljava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzcjl;)Lj3/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
