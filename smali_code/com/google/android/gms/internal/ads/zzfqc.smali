.class public final Lcom/google/android/gms/internal/ads/zzfqc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzeiu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzeiu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfqc;->zza:Lcom/google/android/gms/internal/ads/zzeiu;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeiw;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lx2/c;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    move-object v4, p1

    .line 17
    move-object v3, p2

    .line 18
    move v5, p3

    .line 19
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzeiw;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfqc;->zza:Lcom/google/android/gms/internal/ads/zzeiu;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzeiu;->zze(Lcom/google/android/gms/internal/ads/zzeiw;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
