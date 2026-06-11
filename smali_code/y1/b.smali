.class public Ly1/b;
.super Ly1/a;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public volatile b:I

.field public final c:Ljava/lang/String;

.field public final d:Landroid/os/Handler;

.field public volatile e:Lcom/google/android/gms/common/api/internal/c0;

.field public final f:Landroid/content/Context;

.field public final g:Landroidx/emoji2/text/p;

.field public volatile h:Lcom/google/android/gms/internal/play_billing/zzan;

.field public volatile i:Ly1/p;

.field public j:Z

.field public k:I

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public final u:Ly0/c;

.field public final v:Z

.field public w:Ljava/util/concurrent/ExecutorService;

.field public volatile x:Lcom/google/android/gms/internal/play_billing/zzev;

.field public final y:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ly0/c;Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ly1/b;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Ly1/b;->b:I

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Ly1/b;->d:Landroid/os/Handler;

    iput v0, p0, Ly1/b;->k:I

    new-instance v0, Ljava/util/Random;

    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, p0, Ly1/b;->y:Ljava/lang/Long;

    .line 4
    invoke-static {}, Ly1/b;->i()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ly1/b;->c:Ljava/lang/String;

    .line 5
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Ly1/b;->f:Landroid/content/Context;

    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzku;->zzc()Lcom/google/android/gms/internal/play_billing/zzks;

    move-result-object p2

    .line 7
    invoke-static {}, Ly1/b;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/play_billing/zzks;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzks;

    iget-object v2, p0, Ly1/b;->f:Landroid/content/Context;

    .line 8
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/play_billing/zzks;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 9
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/play_billing/zzks;->zzm(J)Lcom/google/android/gms/internal/play_billing/zzks;

    iget-object v0, p0, Ly1/b;->f:Landroid/content/Context;

    .line 10
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 11
    new-instance v1, Landroidx/emoji2/text/p;

    invoke-direct {v1, v0, p2}, Landroidx/emoji2/text/p;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/zzku;)V

    iput-object v1, p0, Ly1/b;->g:Landroidx/emoji2/text/p;

    const-string p2, "BillingClient"

    const-string v0, "Billing client should have a valid listener but the provided is null."

    .line 12
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lcom/google/android/gms/common/api/internal/c0;

    iget-object v0, p0, Ly1/b;->f:Landroid/content/Context;

    const/4 v1, 0x0

    iget-object v2, p0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 13
    invoke-direct {p2, v0, v1, v2}, Lcom/google/android/gms/common/api/internal/c0;-><init>(Landroid/content/Context;Ly1/i;Landroidx/emoji2/text/p;)V

    iput-object p2, p0, Ly1/b;->e:Lcom/google/android/gms/common/api/internal/c0;

    iput-object p1, p0, Ly1/b;->u:Ly0/c;

    iget-object p1, p0, Ly1/b;->f:Landroid/content/Context;

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ly0/c;Landroid/content/Context;Ly1/i;)V
    .locals 5

    .line 15
    invoke-static {}, Ly1/b;->i()Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ly1/b;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Ly1/b;->b:I

    new-instance v2, Landroid/os/Handler;

    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Ly1/b;->d:Landroid/os/Handler;

    iput v1, p0, Ly1/b;->k:I

    new-instance v2, Ljava/util/Random;

    .line 19
    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iput-object v4, p0, Ly1/b;->y:Ljava/lang/Long;

    iput-object v0, p0, Ly1/b;->c:Ljava/lang/String;

    .line 20
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Ly1/b;->f:Landroid/content/Context;

    .line 21
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzku;->zzc()Lcom/google/android/gms/internal/play_billing/zzks;

    move-result-object p2

    .line 22
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/play_billing/zzks;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzks;

    iget-object v0, p0, Ly1/b;->f:Landroid/content/Context;

    .line 23
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/play_billing/zzks;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 24
    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/zzks;->zzm(J)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 25
    iget-object v0, p0, Ly1/b;->f:Landroid/content/Context;

    .line 26
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 27
    new-instance v2, Landroidx/emoji2/text/p;

    invoke-direct {v2, v0, p2}, Landroidx/emoji2/text/p;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/zzku;)V

    iput-object v2, p0, Ly1/b;->g:Landroidx/emoji2/text/p;

    if-nez p3, :cond_0

    .line 28
    const-string p2, "BillingClient"

    const-string v0, "Billing client should have a valid listener but the provided is null."

    .line 29
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance p2, Lcom/google/android/gms/common/api/internal/c0;

    iget-object v0, p0, Ly1/b;->f:Landroid/content/Context;

    iget-object v2, p0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 30
    invoke-direct {p2, v0, p3, v2}, Lcom/google/android/gms/common/api/internal/c0;-><init>(Landroid/content/Context;Ly1/i;Landroidx/emoji2/text/p;)V

    iput-object p2, p0, Ly1/b;->e:Lcom/google/android/gms/common/api/internal/c0;

    iput-object p1, p0, Ly1/b;->u:Ly0/c;

    iput-boolean v1, p0, Ly1/b;->v:Z

    iget-object p1, p0, Ly1/b;->f:Landroid/content/Context;

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    return-void
.end method

.method public static f(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p5, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    long-to-double p1, p1

    .line 6
    new-instance p5, Lc0/a;

    .line 7
    .line 8
    const/16 v0, 0x18

    .line 9
    .line 10
    invoke-direct {p5, v0, p0, p3}, Lc0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const-wide v0, 0x3fee666666666666L    # 0.95

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    mul-double/2addr p1, v0

    .line 19
    double-to-long p1, p1

    .line 20
    invoke-virtual {p4, p5, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    const-string p1, "BillingClient"

    .line 26
    .line 27
    const-string p2, "Async task throws exception!"

    .line 28
    .line 29
    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static i()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "com.android.billingclient.ktx.BuildConfig"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "VERSION_NAME"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :catch_0
    const-string v0, "7.1.1"

    .line 22
    .line 23
    return-object v0
.end method


# virtual methods
.method public a(La2/c;Landroidx/emoji2/text/r;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ly1/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Ly1/b0;->i:Ly1/e;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {p0, v2, v1, v0}, Ly1/b;->t(IILy1/e;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p2, Landroidx/emoji2/text/r;->h:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v0, p2}, La2/c;->b(Ly1/e;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v2, Ly1/k;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {v2, p0, p2, p1, v0}, Ly1/k;-><init>(Ly1/b;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Lc0/n;

    .line 27
    .line 28
    const/4 v7, 0x7

    .line 29
    const/4 v8, 0x0

    .line 30
    move-object v4, p0

    .line 31
    move-object v5, p1

    .line 32
    move-object v6, p2

    .line 33
    invoke-direct/range {v3 .. v8}, Lc0/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 34
    .line 35
    .line 36
    move-object p1, v4

    .line 37
    move-object p2, v5

    .line 38
    move-object v0, v6

    .line 39
    invoke-virtual {p0}, Ly1/b;->r()Landroid/os/Handler;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {p0}, Ly1/b;->j()Ljava/util/concurrent/ExecutorService;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    move-object v5, v3

    .line 48
    const-wide/16 v3, 0x7530

    .line 49
    .line 50
    invoke-static/range {v2 .. v7}, Ly1/b;->f(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Ly1/b;->g()Ly1/e;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const/16 v3, 0x19

    .line 61
    .line 62
    invoke-virtual {p0, v3, v1, v2}, Ly1/b;->t(IILy1/e;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v0, Landroidx/emoji2/text/r;->h:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p2, v2, v0}, La2/c;->b(Ly1/e;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    return-void
.end method

.method public b(Lg/k;Ld1/a;)Ly1/e;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    const-string v8, "BUY_INTENT"

    .line 6
    .line 7
    const-string v0, "proxyPackageVersion"

    .line 8
    .line 9
    iget-object v2, v1, Ly1/b;->e:Lcom/google/android/gms/common/api/internal/c0;

    .line 10
    .line 11
    const/4 v9, 0x2

    .line 12
    if-eqz v2, :cond_40

    .line 13
    .line 14
    iget-object v2, v1, Ly1/b;->e:Lcom/google/android/gms/common/api/internal/c0;

    .line 15
    .line 16
    iget-object v2, v2, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ly1/i;

    .line 19
    .line 20
    if-eqz v2, :cond_40

    .line 21
    .line 22
    invoke-virtual {v1}, Ly1/b;->d()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    sget-object v0, Ly1/b0;->i:Ly1/e;

    .line 29
    .line 30
    invoke-virtual {v1, v9, v9, v0}, Ly1/b;->t(IILy1/e;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ly1/b;->v(Ly1/e;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v3, v5, Ld1/a;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    iget-object v3, v5, Ld1/a;->c:Ljava/io/Serializable;

    .line 50
    .line 51
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    invoke-static {v2, v10}, Lcom/google/android/gms/internal/play_billing/zzcx;->zza(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    if-nez v4, :cond_3f

    .line 59
    .line 60
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/play_billing/zzcx;->zza(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Ly1/d;

    .line 65
    .line 66
    iget-object v6, v4, Ly1/d;->a:Ly1/h;

    .line 67
    .line 68
    iget-object v11, v6, Ly1/h;->c:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v6, v6, Ly1/h;->d:Ljava/lang/String;

    .line 71
    .line 72
    const-string v12, "subs"

    .line 73
    .line 74
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    const/16 v13, 0x9

    .line 79
    .line 80
    const-string v14, "BillingClient"

    .line 81
    .line 82
    if-eqz v12, :cond_2

    .line 83
    .line 84
    iget-boolean v12, v1, Ly1/b;->j:Z

    .line 85
    .line 86
    if-eqz v12, :cond_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const-string v0, "Current client doesn\'t support subscriptions."

    .line 90
    .line 91
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    sget-object v0, Ly1/b0;->k:Ly1/e;

    .line 95
    .line 96
    invoke-virtual {v1, v13, v9, v0}, Ly1/b;->t(IILy1/e;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v0}, Ly1/b;->v(Ly1/e;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_2
    :goto_0
    iget-object v12, v5, Ld1/a;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v12, Ly0/c;

    .line 106
    .line 107
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v12, v5, Ld1/a;->c:Ljava/io/Serializable;

    .line 111
    .line 112
    check-cast v12, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 113
    .line 114
    invoke-interface {v12}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    new-instance v15, Ly1/x;

    .line 119
    .line 120
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-interface {v12, v15}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    if-nez v12, :cond_3

    .line 128
    .line 129
    iget-boolean v12, v5, Ld1/a;->a:Z

    .line 130
    .line 131
    if-nez v12, :cond_3

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    iget-boolean v12, v1, Ly1/b;->l:Z

    .line 135
    .line 136
    if-eqz v12, :cond_3e

    .line 137
    .line 138
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    const/4 v15, 0x1

    .line 143
    if-le v12, v15, :cond_5

    .line 144
    .line 145
    iget-boolean v12, v1, Ly1/b;->p:Z

    .line 146
    .line 147
    if-eqz v12, :cond_4

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_4
    const-string v0, "Current client doesn\'t support multi-item purchases."

    .line 151
    .line 152
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    sget-object v0, Ly1/b0;->l:Ly1/e;

    .line 156
    .line 157
    const/16 v2, 0x13

    .line 158
    .line 159
    invoke-virtual {v1, v2, v9, v0}, Ly1/b;->t(IILy1/e;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v0}, Ly1/b;->v(Ly1/e;)V

    .line 163
    .line 164
    .line 165
    return-object v0

    .line 166
    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    if-nez v12, :cond_7

    .line 171
    .line 172
    iget-boolean v12, v1, Ly1/b;->q:Z

    .line 173
    .line 174
    if-eqz v12, :cond_6

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_6
    const-string v0, "Current client doesn\'t support purchases with ProductDetails."

    .line 178
    .line 179
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    sget-object v0, Ly1/b0;->n:Ly1/e;

    .line 183
    .line 184
    const/16 v2, 0x14

    .line 185
    .line 186
    invoke-virtual {v1, v2, v9, v0}, Ly1/b;->t(IILy1/e;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v0}, Ly1/b;->v(Ly1/e;)V

    .line 190
    .line 191
    .line 192
    return-object v0

    .line 193
    :cond_7
    :goto_3
    iget-object v12, v5, Ld1/a;->c:Ljava/io/Serializable;

    .line 194
    .line 195
    check-cast v12, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 196
    .line 197
    invoke-virtual {v12}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    if-eqz v12, :cond_8

    .line 202
    .line 203
    sget-object v12, Ly1/b0;->h:Ly1/e;

    .line 204
    .line 205
    move-object/from16 v20, v6

    .line 206
    .line 207
    move-object/from16 v23, v8

    .line 208
    .line 209
    move-object/from16 v18, v10

    .line 210
    .line 211
    :goto_4
    move-object/from16 v21, v11

    .line 212
    .line 213
    goto/16 :goto_9

    .line 214
    .line 215
    :cond_8
    iget-object v12, v5, Ld1/a;->c:Ljava/io/Serializable;

    .line 216
    .line 217
    check-cast v12, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 218
    .line 219
    const/4 v13, 0x0

    .line 220
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    check-cast v12, Ly1/d;

    .line 225
    .line 226
    const/16 v16, 0x1

    .line 227
    .line 228
    move/from16 v13, v16

    .line 229
    .line 230
    :goto_5
    iget-object v15, v5, Ld1/a;->c:Ljava/io/Serializable;

    .line 231
    .line 232
    check-cast v15, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 233
    .line 234
    invoke-virtual {v15}, Ljava/util/AbstractCollection;->size()I

    .line 235
    .line 236
    .line 237
    move-result v15

    .line 238
    move-object/from16 v18, v10

    .line 239
    .line 240
    const-string v10, "play_pass_subs"

    .line 241
    .line 242
    if-ge v13, v15, :cond_b

    .line 243
    .line 244
    iget-object v15, v5, Ld1/a;->c:Ljava/io/Serializable;

    .line 245
    .line 246
    check-cast v15, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 247
    .line 248
    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v15

    .line 252
    check-cast v15, Ly1/d;

    .line 253
    .line 254
    iget-object v9, v15, Ly1/d;->a:Ly1/h;

    .line 255
    .line 256
    iget-object v9, v9, Ly1/h;->d:Ljava/lang/String;

    .line 257
    .line 258
    move-object/from16 v20, v6

    .line 259
    .line 260
    iget-object v6, v12, Ly1/d;->a:Ly1/h;

    .line 261
    .line 262
    iget-object v6, v6, Ly1/h;->d:Ljava/lang/String;

    .line 263
    .line 264
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    if-nez v6, :cond_a

    .line 269
    .line 270
    iget-object v6, v15, Ly1/d;->a:Ly1/h;

    .line 271
    .line 272
    iget-object v6, v6, Ly1/h;->d:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-eqz v6, :cond_9

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_9
    const-string v6, "All products should have same ProductType."

    .line 282
    .line 283
    const/4 v9, 0x5

    .line 284
    invoke-static {v9, v6}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    move-object/from16 v23, v8

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_a
    :goto_6
    add-int/lit8 v13, v13, 0x1

    .line 292
    .line 293
    move-object/from16 v10, v18

    .line 294
    .line 295
    move-object/from16 v6, v20

    .line 296
    .line 297
    const/4 v9, 0x2

    .line 298
    goto :goto_5

    .line 299
    :cond_b
    move-object/from16 v20, v6

    .line 300
    .line 301
    iget-object v6, v12, Ly1/d;->a:Ly1/h;

    .line 302
    .line 303
    iget-object v9, v6, Ly1/h;->b:Lorg/json/JSONObject;

    .line 304
    .line 305
    const-string v12, "packageName"

    .line 306
    .line 307
    invoke-virtual {v9, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    new-instance v13, Ljava/util/HashSet;

    .line 312
    .line 313
    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 314
    .line 315
    .line 316
    new-instance v15, Ljava/util/HashSet;

    .line 317
    .line 318
    invoke-direct {v15}, Ljava/util/HashSet;-><init>()V

    .line 319
    .line 320
    .line 321
    move-object/from16 v21, v11

    .line 322
    .line 323
    iget-object v11, v5, Ld1/a;->c:Ljava/io/Serializable;

    .line 324
    .line 325
    check-cast v11, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 326
    .line 327
    move-object/from16 v22, v15

    .line 328
    .line 329
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 330
    .line 331
    .line 332
    move-result v15

    .line 333
    move-object/from16 v23, v8

    .line 334
    .line 335
    const/4 v8, 0x0

    .line 336
    :goto_7
    const-string v7, "."

    .line 337
    .line 338
    if-ge v8, v15, :cond_f

    .line 339
    .line 340
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v17

    .line 344
    move/from16 v24, v8

    .line 345
    .line 346
    move-object/from16 v8, v17

    .line 347
    .line 348
    check-cast v8, Ly1/d;

    .line 349
    .line 350
    iget-object v8, v8, Ly1/d;->a:Ly1/h;

    .line 351
    .line 352
    move-object/from16 v17, v11

    .line 353
    .line 354
    iget-object v11, v8, Ly1/h;->d:Ljava/lang/String;

    .line 355
    .line 356
    move/from16 v25, v15

    .line 357
    .line 358
    const-string v15, "subs"

    .line 359
    .line 360
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    iget-object v11, v8, Ly1/h;->c:Ljava/lang/String;

    .line 364
    .line 365
    iget-object v15, v8, Ly1/h;->c:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {v13, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v11

    .line 371
    if-eqz v11, :cond_c

    .line 372
    .line 373
    new-instance v6, Ljava/lang/StringBuilder;

    .line 374
    .line 375
    const-string v8, "ProductId can not be duplicated. Invalid product id: "

    .line 376
    .line 377
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    const/4 v9, 0x5

    .line 391
    invoke-static {v9, v6}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 392
    .line 393
    .line 394
    move-result-object v12

    .line 395
    goto/16 :goto_9

    .line 396
    .line 397
    :cond_c
    invoke-virtual {v13, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    iget-object v7, v6, Ly1/h;->d:Ljava/lang/String;

    .line 401
    .line 402
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v7

    .line 406
    if-nez v7, :cond_e

    .line 407
    .line 408
    iget-object v7, v8, Ly1/h;->d:Ljava/lang/String;

    .line 409
    .line 410
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v7

    .line 414
    if-nez v7, :cond_e

    .line 415
    .line 416
    iget-object v7, v8, Ly1/h;->b:Lorg/json/JSONObject;

    .line 417
    .line 418
    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v7

    .line 422
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    if-eqz v7, :cond_d

    .line 427
    .line 428
    goto :goto_8

    .line 429
    :cond_d
    const-string v6, "All products must have the same package name."

    .line 430
    .line 431
    const/4 v9, 0x5

    .line 432
    invoke-static {v9, v6}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 433
    .line 434
    .line 435
    move-result-object v12

    .line 436
    goto :goto_9

    .line 437
    :cond_e
    :goto_8
    add-int/lit8 v8, v24, 0x1

    .line 438
    .line 439
    move-object/from16 v11, v17

    .line 440
    .line 441
    move/from16 v15, v25

    .line 442
    .line 443
    goto :goto_7

    .line 444
    :cond_f
    invoke-virtual/range {v22 .. v22}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 445
    .line 446
    .line 447
    move-result-object v8

    .line 448
    :cond_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 449
    .line 450
    .line 451
    move-result v9

    .line 452
    if-eqz v9, :cond_11

    .line 453
    .line 454
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v9

    .line 458
    check-cast v9, Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {v13, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    if-eqz v10, :cond_10

    .line 465
    .line 466
    new-instance v6, Ljava/lang/StringBuilder;

    .line 467
    .line 468
    const-string v8, "OldProductId must not be one of the products to be purchased. Invalid old product id: "

    .line 469
    .line 470
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    const/4 v9, 0x5

    .line 484
    invoke-static {v9, v6}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 485
    .line 486
    .line 487
    move-result-object v12

    .line 488
    goto :goto_9

    .line 489
    :cond_11
    const/4 v9, 0x5

    .line 490
    invoke-virtual {v6}, Ly1/h;->a()Ly1/g;

    .line 491
    .line 492
    .line 493
    move-result-object v6

    .line 494
    if-eqz v6, :cond_12

    .line 495
    .line 496
    iget-object v6, v6, Ly1/g;->e:Ly0/c;

    .line 497
    .line 498
    if-eqz v6, :cond_12

    .line 499
    .line 500
    const-string v6, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay."

    .line 501
    .line 502
    invoke-static {v9, v6}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 503
    .line 504
    .line 505
    move-result-object v12

    .line 506
    goto :goto_9

    .line 507
    :cond_12
    sget-object v12, Ly1/b0;->h:Ly1/e;

    .line 508
    .line 509
    :goto_9
    sget-object v6, Ly1/b0;->h:Ly1/e;

    .line 510
    .line 511
    if-eq v12, v6, :cond_13

    .line 512
    .line 513
    const/16 v0, 0x78

    .line 514
    .line 515
    const/4 v2, 0x2

    .line 516
    invoke-virtual {v1, v0, v2, v12}, Ly1/b;->t(IILy1/e;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v1, v12}, Ly1/b;->v(Ly1/e;)V

    .line 520
    .line 521
    .line 522
    return-object v12

    .line 523
    :cond_13
    iget-boolean v6, v1, Ly1/b;->l:Z

    .line 524
    .line 525
    if-eqz v6, :cond_36

    .line 526
    .line 527
    iget-boolean v6, v1, Ly1/b;->m:Z

    .line 528
    .line 529
    iget-object v7, v1, Ly1/b;->u:Ly0/c;

    .line 530
    .line 531
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    iget-object v7, v1, Ly1/b;->u:Ly0/c;

    .line 535
    .line 536
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    iget-boolean v7, v1, Ly1/b;->v:Z

    .line 540
    .line 541
    iget-object v8, v1, Ly1/b;->c:Ljava/lang/String;

    .line 542
    .line 543
    iget-object v9, v1, Ly1/b;->y:Ljava/lang/Long;

    .line 544
    .line 545
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 546
    .line 547
    .line 548
    move-result-wide v9

    .line 549
    iget-object v11, v1, Ly1/b;->f:Landroid/content/Context;

    .line 550
    .line 551
    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v11

    .line 555
    move v12, v6

    .line 556
    new-instance v6, Landroid/os/Bundle;

    .line 557
    .line 558
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 559
    .line 560
    .line 561
    invoke-static {v6, v8, v9, v10}, Lcom/google/android/gms/internal/play_billing/zze;->zzc(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 562
    .line 563
    .line 564
    iget-object v8, v5, Ld1/a;->b:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v8, Ly0/c;

    .line 567
    .line 568
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-static/range {v18 .. v18}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 572
    .line 573
    .line 574
    move-result v8

    .line 575
    if-nez v8, :cond_14

    .line 576
    .line 577
    const-string v8, "accountId"

    .line 578
    .line 579
    move-object/from16 v9, v18

    .line 580
    .line 581
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    goto :goto_a

    .line 585
    :cond_14
    move-object/from16 v9, v18

    .line 586
    .line 587
    :goto_a
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 588
    .line 589
    .line 590
    move-result v8

    .line 591
    if-nez v8, :cond_15

    .line 592
    .line 593
    const-string v8, "obfuscatedProfileId"

    .line 594
    .line 595
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    :cond_15
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 599
    .line 600
    .line 601
    move-result v8

    .line 602
    if-nez v8, :cond_16

    .line 603
    .line 604
    new-instance v8, Ljava/util/ArrayList;

    .line 605
    .line 606
    filled-new-array {v9}, [Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v10

    .line 610
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 611
    .line 612
    .line 613
    move-result-object v10

    .line 614
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 615
    .line 616
    .line 617
    const-string v10, "skusToReplace"

    .line 618
    .line 619
    invoke-virtual {v6, v10, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 620
    .line 621
    .line 622
    :cond_16
    iget-object v8, v5, Ld1/a;->b:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v8, Ly0/c;

    .line 625
    .line 626
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 630
    .line 631
    .line 632
    move-result v8

    .line 633
    if-nez v8, :cond_17

    .line 634
    .line 635
    iget-object v8, v5, Ld1/a;->b:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v8, Ly0/c;

    .line 638
    .line 639
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    const-string v8, "oldSkuPurchaseToken"

    .line 643
    .line 644
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    :cond_17
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 648
    .line 649
    .line 650
    move-result v8

    .line 651
    if-nez v8, :cond_18

    .line 652
    .line 653
    const-string v8, "oldSkuPurchaseId"

    .line 654
    .line 655
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    :cond_18
    iget-object v8, v5, Ld1/a;->b:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v8, Ly0/c;

    .line 661
    .line 662
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 666
    .line 667
    .line 668
    move-result v8

    .line 669
    if-nez v8, :cond_19

    .line 670
    .line 671
    iget-object v8, v5, Ld1/a;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v8, Ly0/c;

    .line 674
    .line 675
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    const-string v8, "originalExternalTransactionId"

    .line 679
    .line 680
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    :cond_19
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 684
    .line 685
    .line 686
    move-result v8

    .line 687
    if-nez v8, :cond_1a

    .line 688
    .line 689
    const-string v8, "paymentsPurchaseParams"

    .line 690
    .line 691
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    :cond_1a
    if-eqz v12, :cond_1b

    .line 695
    .line 696
    const-string v8, "enablePendingPurchases"

    .line 697
    .line 698
    const/4 v9, 0x1

    .line 699
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 700
    .line 701
    .line 702
    goto :goto_b

    .line 703
    :cond_1b
    const/4 v9, 0x1

    .line 704
    :goto_b
    if-eqz v7, :cond_1c

    .line 705
    .line 706
    const-string v7, "enableAlternativeBilling"

    .line 707
    .line 708
    invoke-virtual {v6, v7, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 709
    .line 710
    .line 711
    :cond_1c
    iget-object v7, v5, Ld1/a;->c:Ljava/io/Serializable;

    .line 712
    .line 713
    check-cast v7, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 714
    .line 715
    invoke-interface {v7}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 716
    .line 717
    .line 718
    move-result-object v7

    .line 719
    new-instance v8, Lcom/google/android/gms/internal/play_billing/zza;

    .line 720
    .line 721
    invoke-direct {v8}, Lcom/google/android/gms/internal/play_billing/zza;-><init>()V

    .line 722
    .line 723
    .line 724
    invoke-interface {v7, v8}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 725
    .line 726
    .line 727
    move-result v7

    .line 728
    if-eqz v7, :cond_1d

    .line 729
    .line 730
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzfn;->zza()Lcom/google/android/gms/internal/play_billing/zzfm;

    .line 731
    .line 732
    .line 733
    move-result-object v7

    .line 734
    iget-object v8, v5, Ld1/a;->c:Ljava/io/Serializable;

    .line 735
    .line 736
    check-cast v8, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 737
    .line 738
    invoke-interface {v8}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 739
    .line 740
    .line 741
    move-result-object v8

    .line 742
    new-instance v9, Lcom/google/android/gms/internal/play_billing/zzb;

    .line 743
    .line 744
    invoke-direct {v9}, Lcom/google/android/gms/internal/play_billing/zzb;-><init>()V

    .line 745
    .line 746
    .line 747
    invoke-interface {v8, v9}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 748
    .line 749
    .line 750
    move-result-object v8

    .line 751
    new-instance v9, Lcom/google/android/gms/internal/play_billing/zzc;

    .line 752
    .line 753
    invoke-direct {v9, v11}, Lcom/google/android/gms/internal/play_billing/zzc;-><init>(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    invoke-interface {v8, v9}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 757
    .line 758
    .line 759
    move-result-object v8

    .line 760
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzo()Ljava/util/stream/Collector;

    .line 761
    .line 762
    .line 763
    move-result-object v9

    .line 764
    invoke-interface {v8, v9}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v8

    .line 768
    check-cast v8, Ljava/lang/Iterable;

    .line 769
    .line 770
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/play_billing/zzfm;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/play_billing/zzfm;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v7}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 774
    .line 775
    .line 776
    move-result-object v7

    .line 777
    check-cast v7, Lcom/google/android/gms/internal/play_billing/zzfn;

    .line 778
    .line 779
    invoke-virtual {v7}, Lcom/google/android/gms/internal/play_billing/zzfv;->zzh()[B

    .line 780
    .line 781
    .line 782
    move-result-object v7

    .line 783
    const-string v8, "subscriptionProductReplacementParamsList"

    .line 784
    .line 785
    invoke-virtual {v6, v8, v7}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 786
    .line 787
    .line 788
    :cond_1d
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 789
    .line 790
    .line 791
    move-result v7

    .line 792
    const-string v8, "SKU_OFFER_ID_TOKEN_LIST"

    .line 793
    .line 794
    const-string v9, "additionalSkuTypes"

    .line 795
    .line 796
    const-string v10, "additionalSkus"

    .line 797
    .line 798
    const-string v11, "skuDetailsTokens"

    .line 799
    .line 800
    if-nez v7, :cond_22

    .line 801
    .line 802
    new-instance v7, Ljava/util/ArrayList;

    .line 803
    .line 804
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 805
    .line 806
    .line 807
    new-instance v13, Ljava/util/ArrayList;

    .line 808
    .line 809
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 810
    .line 811
    .line 812
    new-instance v13, Ljava/util/ArrayList;

    .line 813
    .line 814
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 815
    .line 816
    .line 817
    new-instance v13, Ljava/util/ArrayList;

    .line 818
    .line 819
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 820
    .line 821
    .line 822
    new-instance v13, Ljava/util/ArrayList;

    .line 823
    .line 824
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 828
    .line 829
    .line 830
    move-result-object v13

    .line 831
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 832
    .line 833
    .line 834
    move-result v15

    .line 835
    if-nez v15, :cond_21

    .line 836
    .line 837
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 838
    .line 839
    .line 840
    move-result v13

    .line 841
    if-nez v13, :cond_1e

    .line 842
    .line 843
    invoke-virtual {v6, v11, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 844
    .line 845
    .line 846
    :cond_1e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 847
    .line 848
    .line 849
    move-result v7

    .line 850
    const/4 v11, 0x1

    .line 851
    if-le v7, v11, :cond_1f

    .line 852
    .line 853
    new-instance v7, Ljava/util/ArrayList;

    .line 854
    .line 855
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 856
    .line 857
    .line 858
    move-result v13

    .line 859
    add-int/lit8 v13, v13, -0x1

    .line 860
    .line 861
    invoke-direct {v7, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 862
    .line 863
    .line 864
    new-instance v13, Ljava/util/ArrayList;

    .line 865
    .line 866
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 867
    .line 868
    .line 869
    move-result v15

    .line 870
    add-int/lit8 v15, v15, -0x1

    .line 871
    .line 872
    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 876
    .line 877
    .line 878
    move-result v15

    .line 879
    if-lt v11, v15, :cond_20

    .line 880
    .line 881
    invoke-virtual {v6, v10, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v6, v9, v13}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 885
    .line 886
    .line 887
    :cond_1f
    move-object/from16 v19, v0

    .line 888
    .line 889
    move-object/from16 v24, v4

    .line 890
    .line 891
    move-object/from16 v22, v14

    .line 892
    .line 893
    goto/16 :goto_f

    .line 894
    .line 895
    :cond_20
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    new-instance v0, Ljava/lang/ClassCastException;

    .line 903
    .line 904
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 905
    .line 906
    .line 907
    throw v0

    .line 908
    :cond_21
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    new-instance v0, Ljava/lang/ClassCastException;

    .line 916
    .line 917
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 918
    .line 919
    .line 920
    throw v0

    .line 921
    :cond_22
    new-instance v2, Ljava/util/ArrayList;

    .line 922
    .line 923
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 924
    .line 925
    .line 926
    move-result v7

    .line 927
    add-int/lit8 v7, v7, -0x1

    .line 928
    .line 929
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 930
    .line 931
    .line 932
    new-instance v7, Ljava/util/ArrayList;

    .line 933
    .line 934
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 935
    .line 936
    .line 937
    move-result v13

    .line 938
    add-int/lit8 v13, v13, -0x1

    .line 939
    .line 940
    invoke-direct {v7, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 941
    .line 942
    .line 943
    new-instance v13, Ljava/util/ArrayList;

    .line 944
    .line 945
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 946
    .line 947
    .line 948
    new-instance v15, Ljava/util/ArrayList;

    .line 949
    .line 950
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 951
    .line 952
    .line 953
    new-instance v12, Ljava/util/ArrayList;

    .line 954
    .line 955
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 956
    .line 957
    .line 958
    new-instance v5, Ljava/util/ArrayList;

    .line 959
    .line 960
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 961
    .line 962
    .line 963
    move-object/from16 v19, v0

    .line 964
    .line 965
    move-object/from16 v22, v14

    .line 966
    .line 967
    const/4 v0, 0x0

    .line 968
    :goto_c
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 969
    .line 970
    .line 971
    move-result v14

    .line 972
    if-ge v0, v14, :cond_29

    .line 973
    .line 974
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v14

    .line 978
    check-cast v14, Ly1/d;

    .line 979
    .line 980
    move-object/from16 v24, v4

    .line 981
    .line 982
    iget-object v4, v14, Ly1/d;->a:Ly1/h;

    .line 983
    .line 984
    iget-object v1, v4, Ly1/h;->g:Ljava/lang/String;

    .line 985
    .line 986
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 987
    .line 988
    .line 989
    move-result v1

    .line 990
    if-nez v1, :cond_23

    .line 991
    .line 992
    iget-object v1, v4, Ly1/h;->g:Ljava/lang/String;

    .line 993
    .line 994
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 995
    .line 996
    .line 997
    :cond_23
    iget-object v1, v14, Ly1/d;->b:Ljava/lang/String;

    .line 998
    .line 999
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1000
    .line 1001
    .line 1002
    iget-object v1, v4, Ly1/h;->h:Ljava/lang/String;

    .line 1003
    .line 1004
    iget-object v14, v4, Ly1/h;->j:Ljava/util/ArrayList;

    .line 1005
    .line 1006
    if-eqz v14, :cond_25

    .line 1007
    .line 1008
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1009
    .line 1010
    .line 1011
    move-result v14

    .line 1012
    if-nez v14, :cond_25

    .line 1013
    .line 1014
    iget-object v4, v4, Ly1/h;->j:Ljava/util/ArrayList;

    .line 1015
    .line 1016
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1017
    .line 1018
    .line 1019
    move-result v14

    .line 1020
    move-object/from16 v25, v1

    .line 1021
    .line 1022
    const/4 v1, 0x0

    .line 1023
    :goto_d
    if-ge v1, v14, :cond_26

    .line 1024
    .line 1025
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v26

    .line 1029
    add-int/lit8 v1, v1, 0x1

    .line 1030
    .line 1031
    move/from16 v27, v1

    .line 1032
    .line 1033
    move-object/from16 v1, v26

    .line 1034
    .line 1035
    check-cast v1, Ly1/g;

    .line 1036
    .line 1037
    move-object/from16 v26, v4

    .line 1038
    .line 1039
    iget-object v4, v1, Ly1/g;->d:Ljava/lang/String;

    .line 1040
    .line 1041
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v4

    .line 1045
    if-nez v4, :cond_24

    .line 1046
    .line 1047
    iget-object v1, v1, Ly1/g;->d:Ljava/lang/String;

    .line 1048
    .line 1049
    goto :goto_e

    .line 1050
    :cond_24
    move-object/from16 v4, v26

    .line 1051
    .line 1052
    move/from16 v1, v27

    .line 1053
    .line 1054
    goto :goto_d

    .line 1055
    :cond_25
    move-object/from16 v25, v1

    .line 1056
    .line 1057
    :cond_26
    move-object/from16 v1, v25

    .line 1058
    .line 1059
    :goto_e
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v4

    .line 1063
    if-nez v4, :cond_27

    .line 1064
    .line 1065
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1066
    .line 1067
    .line 1068
    :cond_27
    if-lez v0, :cond_28

    .line 1069
    .line 1070
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
    check-cast v1, Ly1/d;

    .line 1075
    .line 1076
    iget-object v1, v1, Ly1/d;->a:Ly1/h;

    .line 1077
    .line 1078
    iget-object v1, v1, Ly1/h;->c:Ljava/lang/String;

    .line 1079
    .line 1080
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1081
    .line 1082
    .line 1083
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v1

    .line 1087
    check-cast v1, Ly1/d;

    .line 1088
    .line 1089
    iget-object v1, v1, Ly1/d;->a:Ly1/h;

    .line 1090
    .line 1091
    iget-object v1, v1, Ly1/h;->d:Ljava/lang/String;

    .line 1092
    .line 1093
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1094
    .line 1095
    .line 1096
    :cond_28
    add-int/lit8 v0, v0, 0x1

    .line 1097
    .line 1098
    move-object/from16 v1, p0

    .line 1099
    .line 1100
    move-object/from16 v4, v24

    .line 1101
    .line 1102
    goto/16 :goto_c

    .line 1103
    .line 1104
    :cond_29
    move-object/from16 v24, v4

    .line 1105
    .line 1106
    invoke-virtual {v6, v8, v15}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1107
    .line 1108
    .line 1109
    const-string v0, "AUTO_PAY_BALANCE_THRESHOLD_LIST"

    .line 1110
    .line 1111
    invoke-virtual {v6, v0, v5}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1115
    .line 1116
    .line 1117
    move-result v0

    .line 1118
    if-nez v0, :cond_2a

    .line 1119
    .line 1120
    invoke-virtual {v6, v11, v13}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1121
    .line 1122
    .line 1123
    :cond_2a
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1124
    .line 1125
    .line 1126
    move-result v0

    .line 1127
    if-nez v0, :cond_2b

    .line 1128
    .line 1129
    const-string v0, "SKU_SERIALIZED_DOCID_LIST"

    .line 1130
    .line 1131
    invoke-virtual {v6, v0, v12}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1132
    .line 1133
    .line 1134
    :cond_2b
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1135
    .line 1136
    .line 1137
    move-result v0

    .line 1138
    if-nez v0, :cond_2c

    .line 1139
    .line 1140
    invoke-virtual {v6, v10, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v6, v9, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1144
    .line 1145
    .line 1146
    :cond_2c
    :goto_f
    invoke-virtual {v6, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v0

    .line 1150
    move-object/from16 v1, p0

    .line 1151
    .line 1152
    if-eqz v0, :cond_2d

    .line 1153
    .line 1154
    iget-boolean v0, v1, Ly1/b;->n:Z

    .line 1155
    .line 1156
    if-eqz v0, :cond_2e

    .line 1157
    .line 1158
    :cond_2d
    move-object/from16 v4, v24

    .line 1159
    .line 1160
    goto :goto_10

    .line 1161
    :cond_2e
    sget-object v0, Ly1/b0;->m:Ly1/e;

    .line 1162
    .line 1163
    const/16 v2, 0x15

    .line 1164
    .line 1165
    const/4 v3, 0x2

    .line 1166
    invoke-virtual {v1, v2, v3, v0}, Ly1/b;->t(IILy1/e;)V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v1, v0}, Ly1/b;->v(Ly1/e;)V

    .line 1170
    .line 1171
    .line 1172
    return-object v0

    .line 1173
    :goto_10
    iget-object v0, v4, Ly1/d;->a:Ly1/h;

    .line 1174
    .line 1175
    iget-object v0, v0, Ly1/h;->b:Lorg/json/JSONObject;

    .line 1176
    .line 1177
    const-string v2, "packageName"

    .line 1178
    .line 1179
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v0

    .line 1187
    if-nez v0, :cond_2f

    .line 1188
    .line 1189
    iget-object v0, v4, Ly1/d;->a:Ly1/h;

    .line 1190
    .line 1191
    iget-object v0, v0, Ly1/h;->b:Lorg/json/JSONObject;

    .line 1192
    .line 1193
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v0

    .line 1197
    const-string v2, "skuPackageName"

    .line 1198
    .line 1199
    invoke-virtual {v6, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    const/4 v9, 0x1

    .line 1203
    :goto_11
    const/4 v7, 0x0

    .line 1204
    goto :goto_12

    .line 1205
    :cond_2f
    const/4 v9, 0x0

    .line 1206
    goto :goto_11

    .line 1207
    :goto_12
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v0

    .line 1211
    if-nez v0, :cond_30

    .line 1212
    .line 1213
    const-string v0, "accountName"

    .line 1214
    .line 1215
    invoke-virtual {v6, v0, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1216
    .line 1217
    .line 1218
    :cond_30
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    if-nez v0, :cond_31

    .line 1223
    .line 1224
    const-string v0, "Activity\'s intent is null."

    .line 1225
    .line 1226
    move-object/from16 v8, v22

    .line 1227
    .line 1228
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 1229
    .line 1230
    .line 1231
    goto :goto_13

    .line 1232
    :cond_31
    move-object/from16 v8, v22

    .line 1233
    .line 1234
    const-string v2, "PROXY_PACKAGE"

    .line 1235
    .line 1236
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v4

    .line 1240
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1241
    .line 1242
    .line 1243
    move-result v4

    .line 1244
    if-nez v4, :cond_32

    .line 1245
    .line 1246
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v0

    .line 1250
    const-string v2, "proxyPackage"

    .line 1251
    .line 1252
    invoke-virtual {v6, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1253
    .line 1254
    .line 1255
    :try_start_0
    iget-object v2, v1, Ly1/b;->f:Landroid/content/Context;

    .line 1256
    .line 1257
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v2

    .line 1261
    const/4 v4, 0x0

    .line 1262
    invoke-virtual {v2, v0, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1267
    .line 1268
    move-object/from16 v2, v19

    .line 1269
    .line 1270
    :try_start_1
    invoke-virtual {v6, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1271
    .line 1272
    .line 1273
    goto :goto_13

    .line 1274
    :catch_0
    move-object/from16 v2, v19

    .line 1275
    .line 1276
    :catch_1
    const-string v0, "package not found"

    .line 1277
    .line 1278
    invoke-virtual {v6, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1279
    .line 1280
    .line 1281
    :cond_32
    :goto_13
    iget-boolean v0, v1, Ly1/b;->q:Z

    .line 1282
    .line 1283
    if-eqz v0, :cond_33

    .line 1284
    .line 1285
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1286
    .line 1287
    .line 1288
    move-result v0

    .line 1289
    if-nez v0, :cond_33

    .line 1290
    .line 1291
    const/16 v13, 0x11

    .line 1292
    .line 1293
    :goto_14
    move v2, v13

    .line 1294
    goto :goto_15

    .line 1295
    :cond_33
    iget-boolean v0, v1, Ly1/b;->o:Z

    .line 1296
    .line 1297
    if-eqz v0, :cond_34

    .line 1298
    .line 1299
    if-eqz v9, :cond_34

    .line 1300
    .line 1301
    const/16 v13, 0xf

    .line 1302
    .line 1303
    goto :goto_14

    .line 1304
    :cond_34
    iget-boolean v0, v1, Ly1/b;->m:Z

    .line 1305
    .line 1306
    if-eqz v0, :cond_35

    .line 1307
    .line 1308
    const/16 v2, 0x9

    .line 1309
    .line 1310
    goto :goto_15

    .line 1311
    :cond_35
    const/4 v13, 0x6

    .line 1312
    goto :goto_14

    .line 1313
    :goto_15
    new-instance v0, Ly1/l;

    .line 1314
    .line 1315
    move-object/from16 v5, p2

    .line 1316
    .line 1317
    move-object/from16 v4, v20

    .line 1318
    .line 1319
    move-object/from16 v3, v21

    .line 1320
    .line 1321
    invoke-direct/range {v0 .. v6}, Ly1/l;-><init>(Ly1/b;ILjava/lang/String;Ljava/lang/String;Ld1/a;Landroid/os/Bundle;)V

    .line 1322
    .line 1323
    .line 1324
    iget-object v13, v1, Ly1/b;->d:Landroid/os/Handler;

    .line 1325
    .line 1326
    invoke-virtual {v1}, Ly1/b;->j()Ljava/util/concurrent/ExecutorService;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v14

    .line 1330
    const-wide/16 v10, 0x1388

    .line 1331
    .line 1332
    const/4 v12, 0x0

    .line 1333
    move-object v9, v0

    .line 1334
    invoke-static/range {v9 .. v14}, Ly1/b;->f(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    goto :goto_16

    .line 1339
    :cond_36
    move-object v8, v14

    .line 1340
    move-object/from16 v7, v18

    .line 1341
    .line 1342
    move-object/from16 v4, v20

    .line 1343
    .line 1344
    move-object/from16 v3, v21

    .line 1345
    .line 1346
    new-instance v9, Ly1/k;

    .line 1347
    .line 1348
    const/4 v0, 0x2

    .line 1349
    invoke-direct {v9, v1, v3, v4, v0}, Ly1/k;-><init>(Ly1/b;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1350
    .line 1351
    .line 1352
    iget-object v13, v1, Ly1/b;->d:Landroid/os/Handler;

    .line 1353
    .line 1354
    invoke-virtual {v1}, Ly1/b;->j()Ljava/util/concurrent/ExecutorService;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v14

    .line 1358
    const-wide/16 v10, 0x1388

    .line 1359
    .line 1360
    const/4 v12, 0x0

    .line 1361
    invoke-static/range {v9 .. v14}, Ly1/b;->f(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v0

    .line 1365
    :goto_16
    if-nez v0, :cond_37

    .line 1366
    .line 1367
    :try_start_2
    sget-object v0, Ly1/b0;->c:Ly1/e;

    .line 1368
    .line 1369
    const/16 v2, 0x19

    .line 1370
    .line 1371
    const/4 v3, 0x2

    .line 1372
    invoke-virtual {v1, v2, v3, v0}, Ly1/b;->t(IILy1/e;)V

    .line 1373
    .line 1374
    .line 1375
    invoke-virtual {v1, v0}, Ly1/b;->v(Ly1/e;)V

    .line 1376
    .line 1377
    .line 1378
    return-object v0

    .line 1379
    :catch_2
    move-exception v0

    .line 1380
    goto/16 :goto_1e

    .line 1381
    .line 1382
    :catch_3
    move-exception v0

    .line 1383
    goto/16 :goto_1f

    .line 1384
    .line 1385
    :catch_4
    move-exception v0

    .line 1386
    goto/16 :goto_1f

    .line 1387
    .line 1388
    :cond_37
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1389
    .line 1390
    const-wide/16 v3, 0x1388

    .line 1391
    .line 1392
    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    move-object v2, v0

    .line 1397
    check-cast v2, Landroid/os/Bundle;

    .line 1398
    .line 1399
    invoke-static {v2, v8}, Lcom/google/android/gms/internal/play_billing/zze;->zzb(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 1400
    .line 1401
    .line 1402
    move-result v0

    .line 1403
    invoke-static {v2, v8}, Lcom/google/android/gms/internal/play_billing/zze;->zzh(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v3

    .line 1407
    if-eqz v0, :cond_3d

    .line 1408
    .line 1409
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1410
    .line 1411
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1412
    .line 1413
    .line 1414
    const-string v5, "Unable to buy item, Error response code: "

    .line 1415
    .line 1416
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1417
    .line 1418
    .line 1419
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v4

    .line 1426
    invoke-static {v8, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 1427
    .line 1428
    .line 1429
    invoke-static {v0, v3}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v3
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 1433
    if-nez v2, :cond_38

    .line 1434
    .line 1435
    :goto_17
    const/4 v9, 0x1

    .line 1436
    :goto_18
    const/4 v11, 0x1

    .line 1437
    goto :goto_1a

    .line 1438
    :cond_38
    :try_start_3
    const-string v0, "LOG_REASON"

    .line 1439
    .line 1440
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v0

    .line 1444
    if-nez v0, :cond_39

    .line 1445
    .line 1446
    goto :goto_17

    .line 1447
    :cond_39
    instance-of v4, v0, Ljava/lang/Integer;

    .line 1448
    .line 1449
    if-eqz v4, :cond_3a

    .line 1450
    .line 1451
    check-cast v0, Ljava/lang/Integer;

    .line 1452
    .line 1453
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1454
    .line 1455
    .line 1456
    move-result v0

    .line 1457
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzkg;->zza(I)I

    .line 1458
    .line 1459
    .line 1460
    move-result v9

    .line 1461
    goto :goto_18

    .line 1462
    :catchall_0
    move-exception v0

    .line 1463
    goto :goto_19

    .line 1464
    :cond_3a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v0

    .line 1472
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1473
    .line 1474
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1475
    .line 1476
    .line 1477
    const-string v5, "Unexpected type for bundle log reason: "

    .line 1478
    .line 1479
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1480
    .line 1481
    .line 1482
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v0

    .line 1489
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1490
    .line 1491
    .line 1492
    goto :goto_17

    .line 1493
    :goto_19
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    const-string v4, "Failed to get log reason from bundle: "

    .line 1498
    .line 1499
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v0

    .line 1503
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v0

    .line 1507
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 1508
    .line 1509
    .line 1510
    goto :goto_17

    .line 1511
    :goto_1a
    if-ne v9, v11, :cond_3b

    .line 1512
    .line 1513
    const/16 v9, 0x17

    .line 1514
    .line 1515
    :cond_3b
    if-nez v2, :cond_3c

    .line 1516
    .line 1517
    :goto_1b
    move-object v10, v7

    .line 1518
    :goto_1c
    const/4 v2, 0x2

    .line 1519
    goto :goto_1d

    .line 1520
    :cond_3c
    :try_start_5
    const-string v0, "ADDITIONAL_LOG_DETAILS"

    .line 1521
    .line 1522
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1526
    goto :goto_1c

    .line 1527
    :catchall_1
    move-exception v0

    .line 1528
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v0

    .line 1532
    const-string v2, "Failed to get additional log details from bundle: "

    .line 1533
    .line 1534
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 1543
    .line 1544
    .line 1545
    goto :goto_1b

    .line 1546
    :goto_1d
    invoke-virtual {v1, v9, v2, v3, v10}, Ly1/b;->u(IILy1/e;Ljava/lang/String;)V

    .line 1547
    .line 1548
    .line 1549
    invoke-virtual {v1, v3}, Ly1/b;->v(Ly1/e;)V

    .line 1550
    .line 1551
    .line 1552
    return-object v3

    .line 1553
    :cond_3d
    new-instance v0, Landroid/content/Intent;

    .line 1554
    .line 1555
    const-class v3, Lcom/android/billingclient/api/ProxyBillingActivity;

    .line 1556
    .line 1557
    move-object/from16 v7, p1

    .line 1558
    .line 1559
    invoke-direct {v0, v7, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1560
    .line 1561
    .line 1562
    move-object/from16 v3, v23

    .line 1563
    .line 1564
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v2

    .line 1568
    check-cast v2, Landroid/app/PendingIntent;

    .line 1569
    .line 1570
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1571
    .line 1572
    .line 1573
    invoke-virtual {v7, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_6
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 1574
    .line 1575
    .line 1576
    sget-object v0, Ly1/b0;->h:Ly1/e;

    .line 1577
    .line 1578
    return-object v0

    .line 1579
    :goto_1e
    const-string v2, "Exception while launching billing flow. Try to reconnect"

    .line 1580
    .line 1581
    invoke-static {v8, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1582
    .line 1583
    .line 1584
    sget-object v2, Ly1/b0;->i:Ly1/e;

    .line 1585
    .line 1586
    invoke-static {v0}, Ly1/z;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v0

    .line 1590
    const/4 v3, 0x5

    .line 1591
    const/4 v4, 0x2

    .line 1592
    invoke-virtual {v1, v3, v4, v2, v0}, Ly1/b;->u(IILy1/e;Ljava/lang/String;)V

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v1, v2}, Ly1/b;->v(Ly1/e;)V

    .line 1596
    .line 1597
    .line 1598
    return-object v2

    .line 1599
    :goto_1f
    const-string v2, "Time out while launching billing flow. Try to reconnect"

    .line 1600
    .line 1601
    invoke-static {v8, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1602
    .line 1603
    .line 1604
    sget-object v2, Ly1/b0;->j:Ly1/e;

    .line 1605
    .line 1606
    invoke-static {v0}, Ly1/z;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v0

    .line 1610
    const/4 v3, 0x4

    .line 1611
    const/4 v4, 0x2

    .line 1612
    invoke-virtual {v1, v3, v4, v2, v0}, Ly1/b;->u(IILy1/e;Ljava/lang/String;)V

    .line 1613
    .line 1614
    .line 1615
    invoke-virtual {v1, v2}, Ly1/b;->v(Ly1/e;)V

    .line 1616
    .line 1617
    .line 1618
    return-object v2

    .line 1619
    :cond_3e
    move v4, v9

    .line 1620
    move-object v8, v14

    .line 1621
    const-string v0, "Current client doesn\'t support extra params for buy intent."

    .line 1622
    .line 1623
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 1624
    .line 1625
    .line 1626
    sget-object v0, Ly1/b0;->f:Ly1/e;

    .line 1627
    .line 1628
    const/16 v2, 0x12

    .line 1629
    .line 1630
    invoke-virtual {v1, v2, v4, v0}, Ly1/b;->t(IILy1/e;)V

    .line 1631
    .line 1632
    .line 1633
    invoke-virtual {v1, v0}, Ly1/b;->v(Ly1/e;)V

    .line 1634
    .line 1635
    .line 1636
    return-object v0

    .line 1637
    :cond_3f
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1638
    .line 1639
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1640
    .line 1641
    .line 1642
    throw v0

    .line 1643
    :cond_40
    move v4, v9

    .line 1644
    sget-object v0, Ly1/b0;->p:Ly1/e;

    .line 1645
    .line 1646
    const/16 v2, 0xc

    .line 1647
    .line 1648
    invoke-virtual {v1, v2, v4, v0}, Ly1/b;->t(IILy1/e;)V

    .line 1649
    .line 1650
    .line 1651
    return-object v0
.end method

.method public c(Lu1/f;Lcom/getcapacitor/plugin/c;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ly1/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Ly1/b0;->i:Ly1/e;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-virtual {p0, v0, v1, p1}, Ly1/b;->t(IILy1/e;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p1, v0}, Lcom/getcapacitor/plugin/c;->f(Ly1/e;Ljava/util/ArrayList;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-boolean v0, p0, Ly1/b;->q:Z

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string p1, "BillingClient"

    .line 28
    .line 29
    const-string v0, "Querying product details is not supported."

    .line 30
    .line 31
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Ly1/b0;->n:Ly1/e;

    .line 35
    .line 36
    const/16 v0, 0x14

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1, p1}, Ly1/b;->t(IILy1/e;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p1, v0}, Lcom/getcapacitor/plugin/c;->f(Ly1/e;Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    new-instance v2, Ly1/k;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-direct {v2, p0, p1, p2, v0}, Ly1/k;-><init>(Ly1/b;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    new-instance v5, Lc0/a;

    .line 57
    .line 58
    const/16 p1, 0x19

    .line 59
    .line 60
    invoke-direct {v5, p1, p0, p2}, Lc0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ly1/b;->r()Landroid/os/Handler;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {p0}, Ly1/b;->j()Ljava/util/concurrent/ExecutorService;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    const-wide/16 v3, 0x7530

    .line 72
    .line 73
    invoke-static/range {v2 .. v7}, Ly1/b;->f(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Ly1/b;->g()Ly1/e;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/16 v0, 0x19

    .line 84
    .line 85
    invoke-virtual {p0, v0, v1, p1}, Ly1/b;->t(IILy1/e;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, p1, v0}, Lcom/getcapacitor/plugin/c;->f(Ly1/e;Ljava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    return-void
.end method

.method public final d()Z
    .locals 4

    .line 1
    iget-object v0, p0, Ly1/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Ly1/b;->b:I

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Ly1/b;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Ly1/b;->i:Ly1/p;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return v3

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
.end method

.method public e(Ly1/c;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ly1/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ly1/b;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ly1/b;->s()Ly1/e;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    monitor-exit v0

    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    iget v1, p0, Ly1/b;->b:I

    .line 21
    .line 22
    const/4 v2, 0x6

    .line 23
    const/4 v3, 0x1

    .line 24
    if-ne v1, v3, :cond_1

    .line 25
    .line 26
    const-string v1, "BillingClient"

    .line 27
    .line 28
    const-string v3, "Client is already in the process of connecting to billing service."

    .line 29
    .line 30
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object v1, Ly1/b0;->d:Ly1/e;

    .line 34
    .line 35
    const/16 v3, 0x25

    .line 36
    .line 37
    invoke-virtual {p0, v3, v2, v1}, Ly1/b;->t(IILy1/e;)V

    .line 38
    .line 39
    .line 40
    monitor-exit v0

    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_1
    iget v1, p0, Ly1/b;->b:I

    .line 44
    .line 45
    const/4 v4, 0x3

    .line 46
    if-ne v1, v4, :cond_2

    .line 47
    .line 48
    const-string v1, "BillingClient"

    .line 49
    .line 50
    const-string v3, "Client was already closed and can\'t be reused. Please create another instance."

    .line 51
    .line 52
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Ly1/b0;->i:Ly1/e;

    .line 56
    .line 57
    const/16 v3, 0x26

    .line 58
    .line 59
    invoke-virtual {p0, v3, v2, v1}, Ly1/b;->t(IILy1/e;)V

    .line 60
    .line 61
    .line 62
    monitor-exit v0

    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_2
    invoke-virtual {p0, v3}, Ly1/b;->m(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ly1/b;->n()V

    .line 69
    .line 70
    .line 71
    const-string v1, "BillingClient"

    .line 72
    .line 73
    const-string v4, "Starting in-app billing setup."

    .line 74
    .line 75
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Ly1/p;

    .line 79
    .line 80
    invoke-direct {v1, p0, p1}, Ly1/p;-><init>(Ly1/b;Ly1/c;)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Ly1/b;->i:Ly1/p;

    .line 84
    .line 85
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    new-instance v0, Landroid/content/Intent;

    .line 87
    .line 88
    const-string v1, "com.android.vending.billing.InAppBillingService.BIND"

    .line 89
    .line 90
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v1, "com.android.vending"

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Ly1/b;->f:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const/4 v4, 0x0

    .line 105
    invoke-virtual {v1, v0, v4}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const/16 v5, 0x29

    .line 110
    .line 111
    if-eqz v1, :cond_8

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-nez v6, :cond_8

    .line 118
    .line 119
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 124
    .line 125
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 126
    .line 127
    const/16 v5, 0x28

    .line 128
    .line 129
    if-eqz v1, :cond_7

    .line 130
    .line 131
    iget-object v6, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 134
    .line 135
    const-string v7, "com.android.vending"

    .line 136
    .line 137
    invoke-static {v6, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_6

    .line 142
    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    new-instance v5, Landroid/content/ComponentName;

    .line 146
    .line 147
    invoke-direct {v5, v6, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Landroid/content/Intent;

    .line 151
    .line 152
    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Ly1/b;->c:Ljava/lang/String;

    .line 159
    .line 160
    const-string v5, "playBillingLibraryVersion"

    .line 161
    .line 162
    invoke-virtual {v1, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Ly1/b;->a:Ljava/lang/Object;

    .line 166
    .line 167
    monitor-enter v0

    .line 168
    :try_start_1
    iget v5, p0, Ly1/b;->b:I

    .line 169
    .line 170
    const/4 v6, 0x2

    .line 171
    if-ne v5, v6, :cond_3

    .line 172
    .line 173
    invoke-virtual {p0}, Ly1/b;->s()Ly1/e;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    monitor-exit v0

    .line 178
    goto :goto_2

    .line 179
    :catchall_1
    move-exception p1

    .line 180
    goto :goto_0

    .line 181
    :cond_3
    iget v5, p0, Ly1/b;->b:I

    .line 182
    .line 183
    if-eq v5, v3, :cond_4

    .line 184
    .line 185
    const-string v1, "BillingClient"

    .line 186
    .line 187
    const-string v3, "Client state no longer CONNECTING, returning service disconnected."

    .line 188
    .line 189
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    sget-object v1, Ly1/b0;->i:Ly1/e;

    .line 193
    .line 194
    const/16 v3, 0x75

    .line 195
    .line 196
    invoke-virtual {p0, v3, v2, v1}, Ly1/b;->t(IILy1/e;)V

    .line 197
    .line 198
    .line 199
    monitor-exit v0

    .line 200
    goto :goto_2

    .line 201
    :cond_4
    iget-object v5, p0, Ly1/b;->i:Ly1/p;

    .line 202
    .line 203
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 204
    iget-object v0, p0, Ly1/b;->f:Landroid/content/Context;

    .line 205
    .line 206
    invoke-virtual {v0, v1, v5, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_5

    .line 211
    .line 212
    const-string v0, "BillingClient"

    .line 213
    .line 214
    const-string v1, "Service was bonded successfully."

    .line 215
    .line 216
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const/4 v1, 0x0

    .line 220
    goto :goto_2

    .line 221
    :cond_5
    const-string v0, "BillingClient"

    .line 222
    .line 223
    const-string v1, "Connection to Billing service is blocked."

    .line 224
    .line 225
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    const/16 v5, 0x27

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 232
    throw p1

    .line 233
    :cond_6
    const-string v0, "BillingClient"

    .line 234
    .line 235
    const-string v1, "The device doesn\'t have valid Play Store."

    .line 236
    .line 237
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_7
    const-string v0, "BillingClient"

    .line 242
    .line 243
    const-string v1, "The device doesn\'t have valid Play Store."

    .line 244
    .line 245
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :cond_8
    :goto_1
    invoke-virtual {p0, v4}, Ly1/b;->m(I)V

    .line 249
    .line 250
    .line 251
    const-string v0, "BillingClient"

    .line 252
    .line 253
    const-string v1, "Billing service unavailable on device."

    .line 254
    .line 255
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    sget-object v1, Ly1/b0;->b:Ly1/e;

    .line 259
    .line 260
    invoke-virtual {p0, v5, v2, v1}, Ly1/b;->t(IILy1/e;)V

    .line 261
    .line 262
    .line 263
    :goto_2
    if-eqz v1, :cond_9

    .line 264
    .line 265
    invoke-interface {p1, v1}, Ly1/c;->onBillingSetupFinished(Ly1/e;)V

    .line 266
    .line 267
    .line 268
    :cond_9
    return-void

    .line 269
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 270
    throw p1
.end method

.method public final g()Ly1/e;
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    filled-new-array {v1, v0}, [I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v2, p0, Ly1/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :goto_0
    const/4 v3, 0x2

    .line 11
    if-ge v1, v3, :cond_1

    .line 12
    .line 13
    :try_start_0
    aget v3, v0, v1

    .line 14
    .line 15
    iget v4, p0, Ly1/b;->b:I

    .line 16
    .line 17
    if-ne v4, v3, :cond_0

    .line 18
    .line 19
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    sget-object v0, Ly1/b0;->i:Ly1/e;

    .line 21
    .line 22
    return-object v0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    sget-object v0, Ly1/b0;->g:Ly1/e;

    .line 30
    .line 31
    return-object v0

    .line 32
    :goto_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw v0
.end method

.method public final h()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Ly1/b;->f:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final declared-synchronized j()Ljava/util/concurrent/ExecutorService;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ly1/b;->w:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget v0, Lcom/google/android/gms/internal/play_billing/zze;->zza:I

    .line 7
    .line 8
    new-instance v1, Ly1/m;

    .line 9
    .line 10
    invoke-direct {v1}, Ly1/m;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ly1/b;->w:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, Ly1/b;->w:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-object v0

    .line 26
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method

.method public final k(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    .locals 4

    .line 1
    const-string v0, "Unable to log."

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 4
    .line 5
    iget v2, p0, Ly1/b;->k:I

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    .line 10
    :try_start_1
    iget-object v3, v1, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 13
    .line 14
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzhk;->zzn()Lcom/google/android/gms/internal/play_billing/zzhg;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzks;

    .line 19
    .line 20
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/play_billing/zzks;->zza(I)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 28
    .line 29
    iput-object v2, v1, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Landroidx/emoji2/text/p;->H(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    :try_start_2
    const-string v1, "BillingLogger"

    .line 37
    .line 38
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_1
    move-exception p1

    .line 43
    const-string v1, "BillingClient"

    .line 44
    .line 45
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/play_billing/zzkd;)V
    .locals 4

    .line 1
    const-string v0, "Unable to log."

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 4
    .line 5
    iget v2, p0, Ly1/b;->k:I

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    .line 10
    :try_start_1
    iget-object v3, v1, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 13
    .line 14
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzhk;->zzn()Lcom/google/android/gms/internal/play_billing/zzhg;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzks;

    .line 19
    .line 20
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/play_billing/zzks;->zza(I)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 28
    .line 29
    iput-object v2, v1, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Landroidx/emoji2/text/p;->I(Lcom/google/android/gms/internal/play_billing/zzkd;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    :try_start_2
    const-string v1, "BillingLogger"

    .line 37
    .line 38
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_1
    move-exception p1

    .line 43
    const-string v1, "BillingClient"

    .line 44
    .line 45
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final m(I)V
    .locals 6

    .line 1
    const-string v0, "Setting clientState from "

    .line 2
    .line 3
    iget-object v1, p0, Ly1/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget v2, p0, Ly1/b;->b:I

    .line 7
    .line 8
    const/4 v3, 0x3

    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    monitor-exit v1

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const-string v2, "BillingClient"

    .line 16
    .line 17
    iget v3, p0, Ly1/b;->b:I

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x1

    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    if-eq v3, v5, :cond_2

    .line 24
    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    const-string v3, "CLOSED"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string v3, "CONNECTED"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const-string v3, "CONNECTING"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    const-string v3, "DISCONNECTED"

    .line 37
    .line 38
    :goto_0
    if-eqz p1, :cond_6

    .line 39
    .line 40
    if-eq p1, v5, :cond_5

    .line 41
    .line 42
    if-eq p1, v4, :cond_4

    .line 43
    .line 44
    const-string v4, "CLOSED"

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    const-string v4, "CONNECTED"

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_5
    const-string v4, "CONNECTING"

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_6
    const-string v4, "DISCONNECTED"

    .line 54
    .line 55
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " to "

    .line 64
    .line 65
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput p1, p0, Ly1/b;->b:I

    .line 79
    .line 80
    monitor-exit v1

    .line 81
    return-void

    .line 82
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    throw p1
.end method

.method public final n()V
    .locals 5

    .line 1
    iget-object v0, p0, Ly1/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ly1/b;->i:Ly1/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_1
    iget-object v2, p0, Ly1/b;->f:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, Ly1/b;->i:Ly1/p;

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    .line 15
    .line 16
    :try_start_2
    iput-object v1, p0, Ly1/b;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 17
    .line 18
    iput-object v1, p0, Ly1/b;->i:Ly1/p;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :catchall_1
    move-exception v2

    .line 24
    :try_start_3
    const-string v3, "BillingClient"

    .line 25
    .line 26
    const-string v4, "There was an exception while unbinding service!"

    .line 27
    .line 28
    invoke-static {v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 29
    .line 30
    .line 31
    :try_start_4
    iput-object v1, p0, Ly1/b;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 32
    .line 33
    iput-object v1, p0, Ly1/b;->i:Ly1/p;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_2
    move-exception v2

    .line 37
    iput-object v1, p0, Ly1/b;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 38
    .line 39
    iput-object v1, p0, Ly1/b;->i:Ly1/p;

    .line 40
    .line 41
    throw v2

    .line 42
    :cond_0
    :goto_0
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 45
    throw v1
.end method

.method public final o(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Li3/a;
    .locals 1

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    invoke-static {v0, p3, p4}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x7

    .line 7
    invoke-static {p4}, Ly1/z;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    invoke-virtual {p0, p2, p3, p1, p4}, Ly1/b;->u(IILy1/e;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p2, Li3/a;

    .line 15
    .line 16
    iget p3, p1, Ly1/e;->a:I

    .line 17
    .line 18
    iget-object p1, p1, Ly1/e;->b:Ljava/lang/String;

    .line 19
    .line 20
    new-instance p4, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p2, p3, p1, p4}, Li3/a;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 26
    .line 27
    .line 28
    return-object p2
.end method

.method public final p(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Landroidx/emoji2/text/p;
    .locals 2

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    invoke-static {p4}, Ly1/z;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0, p2, v0, p1, v1}, Ly1/b;->u(IILy1/e;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p2, "BillingClient"

    .line 11
    .line 12
    invoke-static {p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    new-instance p2, Landroidx/emoji2/text/p;

    .line 16
    .line 17
    const/16 p3, 0x19

    .line 18
    .line 19
    const/4 p4, 0x0

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p2, p1, v0, p3, p4}, Landroidx/emoji2/text/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 22
    .line 23
    .line 24
    return-object p2
.end method

.method public final q(La2/c;Ljava/lang/String;Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    invoke-static {v0, p5, p6}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    const/4 p5, 0x4

    .line 7
    invoke-static {p6}, Ly1/z;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p6

    .line 11
    invoke-virtual {p0, p4, p5, p3, p6}, Ly1/b;->u(IILy1/e;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p3, p2}, La2/c;->b(Ly1/e;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final r()Landroid/os/Handler;
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ly1/b;->d:Landroid/os/Handler;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final s()Ly1/e;
    .locals 3

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    const-string v1, "Service connection is valid. No need to re-initialize."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzkd;->zzc()Lcom/google/android/gms/internal/play_billing/zzkb;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzkb;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzkb;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlx;->zzc()Lcom/google/android/gms/internal/play_billing/zzlv;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzlv;->zza(Z)Lcom/google/android/gms/internal/play_billing/zzlv;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzkb;->zzm(Lcom/google/android/gms/internal/play_billing/zzlv;)Lcom/google/android/gms/internal/play_billing/zzkb;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzkd;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ly1/b;->l(Lcom/google/android/gms/internal/play_billing/zzkd;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Ly1/b0;->h:Ly1/e;

    .line 37
    .line 38
    return-object v0
.end method

.method public final t(IILy1/e;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1, p2, p3}, Ly1/z;->b(IILy1/e;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ly1/b;->k(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    const-string p2, "BillingClient"

    .line 11
    .line 12
    const-string p3, "Unable to log."

    .line 13
    .line 14
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final u(IILy1/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Ly1/z;->c(IILy1/e;Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ly1/b;->k(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    const-string p2, "BillingClient"

    .line 11
    .line 12
    const-string p3, "Unable to log."

    .line 13
    .line 14
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final v(Ly1/e;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lc0/a;

    .line 9
    .line 10
    const/16 v1, 0x1a

    .line 11
    .line 12
    invoke-direct {v0, v1, p0, p1}, Lc0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ly1/b;->d:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method
