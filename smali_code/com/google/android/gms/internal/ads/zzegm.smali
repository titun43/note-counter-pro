.class final synthetic Lcom/google/android/gms/internal/ads/zzegm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzegw;

.field private final synthetic zzb:Lj3/a;

.field private final synthetic zzc:Lj3/a;

.field private final synthetic zzd:Lcom/google/android/gms/internal/ads/zzbzu;

.field private final synthetic zze:Lcom/google/android/gms/internal/ads/zzfoe;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzegw;Lj3/a;Lj3/a;Lcom/google/android/gms/internal/ads/zzbzu;Lcom/google/android/gms/internal/ads/zzfoe;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzegm;->zza:Lcom/google/android/gms/internal/ads/zzegw;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzegm;->zzb:Lj3/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzegm;->zzc:Lj3/a;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzegm;->zzd:Lcom/google/android/gms/internal/ads/zzbzu;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzegm;->zze:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzegm;->zza:Lcom/google/android/gms/internal/ads/zzegw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzegm;->zzb:Lj3/a;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzegm;->zzc:Lj3/a;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzegm;->zzd:Lcom/google/android/gms/internal/ads/zzbzu;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzegm;->zze:Lcom/google/android/gms/internal/ads/zzfoe;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzegw;->zzl(Lj3/a;Lj3/a;Lcom/google/android/gms/internal/ads/zzbzu;Lcom/google/android/gms/internal/ads/zzfoe;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
