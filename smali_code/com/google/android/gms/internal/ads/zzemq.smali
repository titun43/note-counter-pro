.class final synthetic Lcom/google/android/gms/internal/ads/zzemq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzems;

.field private final synthetic zzb:Lj3/a;

.field private final synthetic zzc:Lj3/a;

.field private final synthetic zzd:Lcom/google/android/gms/internal/ads/zzfjc;

.field private final synthetic zze:Lcom/google/android/gms/internal/ads/zzfir;

.field private final synthetic zzf:Lorg/json/JSONObject;

.field private final synthetic zzg:Lcom/google/android/gms/ads/internal/zzb;

.field private final synthetic zzh:Lcom/google/android/gms/internal/ads/zzcce;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzems;Lj3/a;Lj3/a;Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Lorg/json/JSONObject;Lcom/google/android/gms/ads/internal/zzb;Lcom/google/android/gms/internal/ads/zzcce;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzemq;->zza:Lcom/google/android/gms/internal/ads/zzems;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzb:Lj3/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzc:Lj3/a;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzd:Lcom/google/android/gms/internal/ads/zzfjc;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzemq;->zze:Lcom/google/android/gms/internal/ads/zzfir;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzf:Lorg/json/JSONObject;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzg:Lcom/google/android/gms/ads/internal/zzb;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzh:Lcom/google/android/gms/internal/ads/zzcce;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzemq;->zza:Lcom/google/android/gms/internal/ads/zzems;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzb:Lj3/a;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzc:Lj3/a;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzd:Lcom/google/android/gms/internal/ads/zzfjc;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzemq;->zze:Lcom/google/android/gms/internal/ads/zzfir;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzf:Lorg/json/JSONObject;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzg:Lcom/google/android/gms/ads/internal/zzb;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzemq;->zzh:Lcom/google/android/gms/internal/ads/zzcce;

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzems;->zzf(Lj3/a;Lj3/a;Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Lorg/json/JSONObject;Lcom/google/android/gms/ads/internal/zzb;Lcom/google/android/gms/internal/ads/zzcce;)Lcom/google/android/gms/internal/ads/zzdoc;

    move-result-object v0

    return-object v0
.end method
