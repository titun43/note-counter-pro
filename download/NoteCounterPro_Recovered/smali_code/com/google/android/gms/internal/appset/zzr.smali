.class public final Lcom/google/android/gms/internal/appset/zzr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/a;


# instance fields
.field private final zza:Lq2/a;

.field private final zzb:Lq2/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lt2/f;->b:Lt2/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/android/gms/internal/appset/zzp;

    .line 7
    .line 8
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/appset/zzp;-><init>(Landroid/content/Context;Lt2/f;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lcom/google/android/gms/internal/appset/zzr;->zza:Lq2/a;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/internal/appset/zzl;->zzc(Landroid/content/Context;)Lq2/a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/google/android/gms/internal/appset/zzr;->zzb:Lq2/a;

    .line 18
    .line 19
    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/appset/zzr;Lh3/g;)Lh3/g;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lh3/g;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lh3/n;

    .line 9
    .line 10
    iget-boolean v0, v0, Lh3/n;->d:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p1}, Lh3/g;->a()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v1, v0, Lcom/google/android/gms/common/api/j;

    .line 20
    .line 21
    if-eqz v1, :cond_5

    .line 22
    .line 23
    check-cast v0, Lcom/google/android/gms/common/api/j;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/google/android/gms/common/api/j;->g:Lcom/google/android/gms/common/api/Status;

    .line 26
    .line 27
    iget v0, v0, Lcom/google/android/gms/common/api/Status;->g:I

    .line 28
    .line 29
    const v1, 0xa7f9

    .line 30
    .line 31
    .line 32
    if-eq v0, v1, :cond_4

    .line 33
    .line 34
    const v1, 0xa7fa

    .line 35
    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    const v1, 0xa7fb

    .line 40
    .line 41
    .line 42
    if-eq v0, v1, :cond_4

    .line 43
    .line 44
    const/16 v1, 0x11

    .line 45
    .line 46
    if-ne v0, v1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const p0, 0xa7f8

    .line 50
    .line 51
    .line 52
    if-ne v0, p0, :cond_2

    .line 53
    .line 54
    new-instance p0, Ljava/lang/Exception;

    .line 55
    .line 56
    const-string p1, "Failed to get app set ID due to an internal error. Please try again later."

    .line 57
    .line 58
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, Lh3/n;

    .line 62
    .line 63
    invoke-direct {p1}, Lh3/n;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_2
    const/16 p0, 0xf

    .line 71
    .line 72
    if-eq v0, p0, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    new-instance p0, Ljava/lang/Exception;

    .line 76
    .line 77
    const-string p1, "The operation to get app set ID timed out. Please try again later."

    .line 78
    .line 79
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    new-instance p1, Lh3/n;

    .line 83
    .line 84
    invoke-direct {p1}, Lh3/n;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 88
    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_4
    :goto_0
    iget-object p0, p0, Lcom/google/android/gms/internal/appset/zzr;->zzb:Lq2/a;

    .line 92
    .line 93
    invoke-interface {p0}, Lq2/a;->getAppSetIdInfo()Lh3/g;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_5
    :goto_1
    return-object p1
.end method


# virtual methods
.method public final getAppSetIdInfo()Lh3/g;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh3/g;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/appset/zzr;->zza:Lq2/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lq2/a;->getAppSetIdInfo()Lh3/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/google/android/gms/internal/appset/zzq;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/appset/zzq;-><init>(Lcom/google/android/gms/internal/appset/zzr;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lh3/n;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v2, Lh3/i;->a:Lf2/q;

    .line 18
    .line 19
    new-instance v3, Lh3/n;

    .line 20
    .line 21
    invoke-direct {v3}, Lh3/n;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v4, Lh3/j;

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-direct {v4, v2, v1, v3, v5}, Lh3/j;-><init>(Ljava/util/concurrent/Executor;Lh3/b;Lh3/n;I)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, Lh3/n;->b:Lh3/m;

    .line 31
    .line 32
    invoke-virtual {v1, v4}, Lh3/m;->a(Lh3/l;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lh3/n;->h()V

    .line 36
    .line 37
    .line 38
    return-object v3
.end method
