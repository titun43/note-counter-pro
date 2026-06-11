.class final Lcom/google/android/gms/internal/ads/zzfzn;
.super Ly3/c;
.source "SourceFile"


# instance fields
.field zza:Ljava/lang/Object;

.field synthetic zzb:Ljava/lang/Object;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzgaf;

.field zzd:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgaf;Lw3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzn;->zzc:Lcom/google/android/gms/internal/ads/zzgaf;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ly3/c;-><init>(Lw3/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzn;->zzb:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzfzn;->zzd:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfzn;->zzd:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzn;->zzc:Lcom/google/android/gms/internal/ads/zzgaf;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzgaf;->zzp(Lcom/google/android/gms/internal/ads/zzgaf;Lw3/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
