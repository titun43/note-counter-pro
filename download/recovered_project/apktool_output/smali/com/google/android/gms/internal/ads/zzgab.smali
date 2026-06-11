.class final Lcom/google/android/gms/internal/ads/zzgab;
.super Ly3/c;
.source "SourceFile"


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:J

.field synthetic zzc:Ljava/lang/Object;

.field final synthetic zzd:Lcom/google/android/gms/internal/ads/zzgaf;

.field zze:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgaf;Lw3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgab;->zzd:Lcom/google/android/gms/internal/ads/zzgaf;

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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgab;->zzc:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzgab;->zze:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgab;->zze:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgab;->zzd:Lcom/google/android/gms/internal/ads/zzgaf;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzgaf;->zzm(Lw3/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
