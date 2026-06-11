.class final synthetic Lcom/google/android/gms/internal/ads/zzwq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdr;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzwu;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzwb;

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzwg;

.field private final synthetic zzd:Ljava/io/IOException;

.field private final synthetic zze:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzwu;Lcom/google/android/gms/internal/ads/zzwb;Lcom/google/android/gms/internal/ads/zzwg;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzwq;->zza:Lcom/google/android/gms/internal/ads/zzwu;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzb:Lcom/google/android/gms/internal/ads/zzwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzc:Lcom/google/android/gms/internal/ads/zzwg;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzd:Ljava/io/IOException;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzwq;->zze:Z

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzwq;->zza:Lcom/google/android/gms/internal/ads/zzwu;

    .line 2
    .line 3
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzwu;->zzb:Lcom/google/android/gms/internal/ads/zzwk;

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, Lcom/google/android/gms/internal/ads/zzwv;

    .line 7
    .line 8
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzb:Lcom/google/android/gms/internal/ads/zzwb;

    .line 9
    .line 10
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzc:Lcom/google/android/gms/internal/ads/zzwg;

    .line 11
    .line 12
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzd:Ljava/io/IOException;

    .line 13
    .line 14
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzwq;->zze:Z

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzwv;->zzal(ILcom/google/android/gms/internal/ads/zzwk;Lcom/google/android/gms/internal/ads/zzwb;Lcom/google/android/gms/internal/ads/zzwg;Ljava/io/IOException;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
