.class final synthetic Lcom/google/android/gms/internal/ads/zzrp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzed;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzed;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzrp;->zza:Lcom/google/android/gms/internal/ads/zzed;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzrm;->zza:Lcom/google/android/gms/internal/ads/zzrm;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrp;->zza:Lcom/google/android/gms/internal/ads/zzed;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzed;->zzd(ILcom/google/android/gms/internal/ads/zzdy;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzed;->zze()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
