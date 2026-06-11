.class final synthetic Lcom/google/android/gms/internal/ads/zzefb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgyw;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzikv;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbzu;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzikv;Lcom/google/android/gms/internal/ads/zzbzu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzefb;->zza:Lcom/google/android/gms/internal/ads/zzikv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzefb;->zzb:Lcom/google/android/gms/internal/ads/zzbzu;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)Lj3/a;
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzecr;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzefb;->zza:Lcom/google/android/gms/internal/ads/zzikv;

    .line 4
    .line 5
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/google/android/gms/internal/ads/zzefe;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzefb;->zzb:Lcom/google/android/gms/internal/ads/zzbzu;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzefe;->zza(Lcom/google/android/gms/internal/ads/zzbzu;)Lj3/a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
