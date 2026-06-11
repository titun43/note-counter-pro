.class final Lcom/google/android/gms/internal/ads/zzfzw;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzgaf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgaf;Lw3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzw;->zzb:Lcom/google/android/gms/internal/ads/zzgaf;

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
    .locals 1

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfzw;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfzw;->zzb:Lcom/google/android/gms/internal/ads/zzgaf;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzfzw;-><init>(Lcom/google/android/gms/internal/ads/zzgaf;Lw3/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lo4/t;

    .line 2
    .line 3
    check-cast p2, Lw3/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzfzw;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfzw;

    .line 10
    .line 11
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzfzw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzfzw;->zza:I

    .line 4
    .line 5
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzw;->zzb:Lcom/google/android/gms/internal/ads/zzgaf;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzfzw;->zza:I

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzgaf;->zzn(Lw3/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    :goto_0
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 24
    .line 25
    return-object p1
.end method
