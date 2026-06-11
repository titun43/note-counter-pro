.class final Lcom/google/android/gms/internal/ads/zzfzs;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field synthetic zza:Ljava/lang/Object;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfyu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfyu;Lw3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzs;->zzb:Lcom/google/android/gms/internal/ads/zzfyu;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ly3/g;-><init>(ILw3/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzs;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfzs;->zzb:Lcom/google/android/gms/internal/ads/zzfyu;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzfzs;-><init>(Lcom/google/android/gms/internal/ads/zzfyu;Lw3/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/google/android/gms/internal/ads/zzfzs;->zza:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfyy;

    .line 2
    .line 3
    check-cast p2, Lw3/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzfzs;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfzs;

    .line 10
    .line 11
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzfzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 2
    .line 3
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzs;->zza:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfyy;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzibr;->zzbp()Lcom/google/android/gms/internal/ads/zzibl;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfyw;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfyz;->zza(Lcom/google/android/gms/internal/ads/zzfyw;)Lcom/google/android/gms/internal/ads/zzfza;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfza;->zzb()Lcom/google/android/gms/internal/ads/zziev;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfzs;->zzb:Lcom/google/android/gms/internal/ads/zzfyu;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfyu;->zza()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "getGwsQueryId(...)"

    .line 31
    .line 32
    invoke-static {v2, v3}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzfza;->zzc(Lcom/google/android/gms/internal/ads/zziev;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfyu;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfza;->zza()Lcom/google/android/gms/internal/ads/zzfyy;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method
