.class final synthetic Lcom/google/android/gms/internal/ads/zzdrz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbde;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzcjl;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcjl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdrz;->zza:Lcom/google/android/gms/internal/ads/zzcjl;

    return-void
.end method


# virtual methods
.method public final synthetic zzdj(Lcom/google/android/gms/internal/ads/zzbdd;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzbdd;->zzd:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdrz;->zza:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcjl;->zzP()Lcom/google/android/gms/internal/ads/zzclj;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 10
    .line 11
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ads/zzclj;->zza(IIZ)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
