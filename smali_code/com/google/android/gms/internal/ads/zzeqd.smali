.class public final Lcom/google/android/gms/internal/ads/zzeqd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdlu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdlu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeqd;->zza:Lcom/google/android/gms/internal/ads/zzdlu;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Landroid/view/View;Lcom/google/android/gms/internal/ads/zzepz;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance p3, Lcom/google/android/gms/internal/ads/zzeqb;

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeqa;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/zzeqa;-><init>(Lcom/google/android/gms/internal/ads/zzeqd;Lcom/google/android/gms/internal/ads/zzfir;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p3, p0, v0}, Lcom/google/android/gms/internal/ads/zzeqb;-><init>(Lcom/google/android/gms/internal/ads/zzeqd;Lcom/google/android/gms/internal/ads/zzdmc;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcwv;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzcwv;-><init>(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzeqd;->zza:Lcom/google/android/gms/internal/ads/zzdlu;

    .line 18
    .line 19
    invoke-virtual {p1, v0, p3}, Lcom/google/android/gms/internal/ads/zzdlu;->zzd(Lcom/google/android/gms/internal/ads/zzcwv;Lcom/google/android/gms/internal/ads/zzdkr;)Lcom/google/android/gms/internal/ads/zzdko;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance p2, Lcom/google/android/gms/internal/ads/zzeqc;

    .line 24
    .line 25
    invoke-direct {p2, p0, p1}, Lcom/google/android/gms/internal/ads/zzeqc;-><init>(Lcom/google/android/gms/internal/ads/zzeqd;Lcom/google/android/gms/internal/ads/zzdko;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p4, p2}, Lcom/google/android/gms/internal/ads/zzepz;->zzd(Lcom/google/android/gms/ads/internal/zzg;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdko;->zzh()Lcom/google/android/gms/internal/ads/zzdkn;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method
