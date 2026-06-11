.class final Lcom/google/android/gms/internal/ads/zzfzt;
.super Ly3/c;
.source "SourceFile"


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:J

.field synthetic zzc:Ljava/lang/Object;

.field final synthetic zzd:Lcom/google/android/gms/internal/ads/zzgaf;

.field zze:I

.field zzf:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgaf;Lw3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzt;->zzd:Lcom/google/android/gms/internal/ads/zzgaf;

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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzt;->zzc:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzfzt;->zze:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfzt;->zze:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzt;->zzd:Lcom/google/android/gms/internal/ads/zzgaf;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/ads/zzgaf;->zzi(Ljava/lang/String;Lw3/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
