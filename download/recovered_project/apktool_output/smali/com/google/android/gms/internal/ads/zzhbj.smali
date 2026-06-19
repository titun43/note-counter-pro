.class final synthetic Lcom/google/android/gms/internal/ads/zzhbj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbg;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzhbk;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzhjr;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzhbk;Lcom/google/android/gms/internal/ads/zzhjr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhbj;->zza:Lcom/google/android/gms/internal/ads/zzhbk;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhbj;->zzb:Lcom/google/android/gms/internal/ads/zzhjr;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzhbi;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhkb;->zza()Lcom/google/android/gms/internal/ads/zzhkb;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhkb;->zzb()Lcom/google/android/gms/internal/ads/zzhjt;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhbj;->zza:Lcom/google/android/gms/internal/ads/zzhbk;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhbj;->zzb:Lcom/google/android/gms/internal/ads/zzhjr;

    .line 12
    .line 13
    const-string v2, "keyset_handle"

    .line 14
    .line 15
    const-string v3, "get_key"

    .line 16
    .line 17
    invoke-interface {p1, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzhjt;->zza(Lcom/google/android/gms/internal/ads/zzhjj;Lcom/google/android/gms/internal/ads/zzhjr;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhjs;

    .line 18
    .line 19
    .line 20
    return-void
.end method
