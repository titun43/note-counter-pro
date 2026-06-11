.class public final Lcom/google/android/gms/internal/ads/zzgat;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zza(Lh3/g;Lh3/a;)Lj3/a;
    .locals 3

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzgar;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/ads/zzgar;-><init>(Ljava/lang/Object;Ljava/lang/Runnable;)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhaf;->zza()Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgas;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzgas;-><init>(Lcom/google/android/gms/internal/ads/zzgar;)V

    .line 14
    .line 15
    .line 16
    check-cast p0, Lh3/n;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v2, Lh3/j;

    .line 22
    .line 23
    invoke-direct {v2, v0, v1}, Lh3/j;-><init>(Ljava/util/concurrent/Executor;Lh3/d;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lh3/n;->b:Lh3/m;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lh3/m;->a(Lh3/l;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lh3/n;->h()V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method
