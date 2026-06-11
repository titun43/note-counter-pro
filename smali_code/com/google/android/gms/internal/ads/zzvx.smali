.class public final Lcom/google/android/gms/internal/ads/zzvx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzwj;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzvw;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzamd;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzafa;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhg;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzhg;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaly;

    .line 10
    .line 11
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaly;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvx;->zzb:Lcom/google/android/gms/internal/ads/zzamd;

    .line 15
    .line 16
    new-instance v1, Lcom/google/android/gms/internal/ads/zzvw;

    .line 17
    .line 18
    invoke-direct {v1, p2, p1}, Lcom/google/android/gms/internal/ads/zzvw;-><init>(Lcom/google/android/gms/internal/ads/zzafa;Lcom/google/android/gms/internal/ads/zzamd;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzvx;->zza:Lcom/google/android/gms/internal/ads/zzvw;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzvw;->zza(Lcom/google/android/gms/internal/ads/zzha;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
