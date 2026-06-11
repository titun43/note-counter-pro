.class public final Lcom/google/android/gms/internal/ads/zzdhj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzikg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdhf;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzdhf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdhj;->zza:Lcom/google/android/gms/internal/ads/zzdhf;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzdhf;)Lcom/google/android/gms/internal/ads/zzdhj;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdhj;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzdhj;-><init>(Lcom/google/android/gms/internal/ads/zzdhf;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdhj;->zza:Lcom/google/android/gms/internal/ads/zzdhf;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhf;->zzn()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
