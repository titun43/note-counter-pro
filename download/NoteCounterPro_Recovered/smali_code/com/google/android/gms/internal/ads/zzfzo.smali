.class final Lcom/google/android/gms/internal/ads/zzfzo;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# direct methods
.method public constructor <init>(Lw3/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0, p1}, Ly3/g;-><init>(ILw3/c;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 0

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfzo;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzfzo;-><init>(Lw3/c;)V

    .line 4
    .line 5
    .line 6
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzfzo;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfzo;

    .line 10
    .line 11
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzfzo;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 2
    .line 3
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfyy;->zzd()Lcom/google/android/gms/internal/ads/zzfyy;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "getDefaultInstance(...)"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method
