.class final synthetic Lcom/google/android/gms/internal/ads/zzgyp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzgyq;

.field private final synthetic zzb:I

.field private final synthetic zzc:Lj3/a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgyq;ILj3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgyp;->zza:Lcom/google/android/gms/internal/ads/zzgyq;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzgyp;->zzb:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgyp;->zzc:Lj3/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgyp;->zza:Lcom/google/android/gms/internal/ads/zzgyq;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzgyp;->zzb:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgyp;->zzc:Lj3/a;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgyq;->zzy(ILj3/a;)V

    return-void
.end method
