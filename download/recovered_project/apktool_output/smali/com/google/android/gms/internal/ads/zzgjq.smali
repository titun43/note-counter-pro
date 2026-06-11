.class final Lcom/google/android/gms/internal/ads/zzgjq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgjf;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfxa;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgky;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzgmu;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzgoe;

.field private final zze:Ljava/util/concurrent/ExecutorService;

.field private final zzf:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfxa;Lcom/google/android/gms/internal/ads/zzgky;Lcom/google/android/gms/internal/ads/zzgmu;Lcom/google/android/gms/internal/ads/zzgoe;Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    const-string v1, "2.825731049.-1"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzf:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zza:Lcom/google/android/gms/internal/ads/zzfxa;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzb:Lcom/google/android/gms/internal/ads/zzgky;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzc:Lcom/google/android/gms/internal/ads/zzgmu;

    .line 18
    .line 19
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 20
    .line 21
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zze:Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzf:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method

.method public final zzb()Lj3/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzb:Lcom/google/android/gms/internal/ads/zzgky;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgkx;->zzb()Lj3/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzg;->zzw(Lj3/a;)Lcom/google/android/gms/internal/ads/zzgzg;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lcom/google/android/gms/internal/ads/zzgjp;->zza:Lcom/google/android/gms/internal/ads/zzgjp;

    .line 12
    .line 13
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhaf;->zza()Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, Ljava/lang/Throwable;

    .line 18
    .line 19
    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzg(Lj3/a;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgqt;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/google/android/gms/internal/ads/zzgzg;

    .line 24
    .line 25
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgjh;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzgjh;-><init>(Lcom/google/android/gms/internal/ads/zzgjq;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhaf;->zza()Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzk(Lj3/a;Lcom/google/android/gms/internal/ads/zzgqt;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/google/android/gms/internal/ads/zzgzg;

    .line 39
    .line 40
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgji;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzgji;-><init>(Lcom/google/android/gms/internal/ads/zzgjq;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhaf;->zza()Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzj(Lj3/a;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lcom/google/android/gms/internal/ads/zzgzg;

    .line 54
    .line 55
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgjj;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzgjj;-><init>(Lcom/google/android/gms/internal/ads/zzgjq;)V

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhaf;->zza()Ljava/util/concurrent/Executor;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzk(Lj3/a;Lcom/google/android/gms/internal/ads/zzgqt;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lcom/google/android/gms/internal/ads/zzgzg;

    .line 69
    .line 70
    sget-object v1, Lcom/google/android/gms/internal/ads/zzgjk;->zza:Lcom/google/android/gms/internal/ads/zzgjk;

    .line 71
    .line 72
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhaf;->zza()Ljava/util/concurrent/Executor;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzk(Lj3/a;Lcom/google/android/gms/internal/ads/zzgqt;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lcom/google/android/gms/internal/ads/zzgzg;

    .line 81
    .line 82
    return-object v0
.end method

.method public final zzc(Landroid/content/Context;)Lj3/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgjl;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzgjl;-><init>(Lcom/google/android/gms/internal/ads/zzgjq;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zze:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzd(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final zzd(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Lj3/a;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgjm;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzgjm;-><init>(Lcom/google/android/gms/internal/ads/zzgjq;Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v1, Lcom/google/android/gms/internal/ads/zzgjq;->zze:Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzd(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final zze(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Lj3/a;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgjn;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzgjn;-><init>(Lcom/google/android/gms/internal/ads/zzgjq;Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v1, Lcom/google/android/gms/internal/ads/zzgjq;->zze:Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzd(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final zzf(Landroid/view/InputEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zza:Lcom/google/android/gms/internal/ads/zzfxa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfxa;->zzb()Lcom/google/android/gms/internal/ads/zzfvk;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 10
    .line 11
    const/16 v0, 0x3a9c

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzgoe;->zzb(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v1, p1, Landroid/view/MotionEvent;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    :try_start_0
    check-cast p1, Landroid/view/MotionEvent;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfvk;->zzd(Ljava/lang/String;Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzfwz; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p1

    .line 30
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 31
    .line 32
    const/16 v1, 0x3a9d

    .line 33
    .line 34
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzgoe;->zzd(ILjava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final zzg()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final synthetic zzh(Lcom/google/android/gms/internal/ads/zzgdu;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzc:Lcom/google/android/gms/internal/ads/zzgmu;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzgmu;->zzb(Lcom/google/android/gms/internal/ads/zzgdu;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 14
    .line 15
    const/16 v0, 0x3a9b

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzgoe;->zzb(I)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lcom/google/android/gms/internal/ads/zzgjg;

    .line 21
    .line 22
    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/ads/zzgjg;-><init>(I)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public final synthetic zzi(Ljava/lang/Boolean;)Lj3/a;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzb:Lcom/google/android/gms/internal/ads/zzgky;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzgky;->zze()Lj3/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final synthetic zzj(Lcom/google/android/gms/internal/ads/zzfwq;)Z
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfwq;->zzb()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v2, 0x22

    .line 10
    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->setReadOnly()Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 17
    .line 18
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgjo;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzgjo;-><init>(Lcom/google/android/gms/internal/ads/zzgjq;Lcom/google/android/gms/internal/ads/zzfwq;)V

    .line 21
    .line 22
    .line 23
    const/16 p1, 0x3a9a

    .line 24
    .line 25
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzgoe;->zzf(ILjava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzgjg;

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzgjg;-><init>(I)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

.method public final synthetic zzk(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zza:Lcom/google/android/gms/internal/ads/zzfxa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfxa;->zzb()Lcom/google/android/gms/internal/ads/zzfvk;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 12
    .line 13
    const/16 v0, 0x3a9c

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzgoe;->zzb(I)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    invoke-interface {v0, p1, v2}, Lcom/google/android/gms/internal/ads/zzfvk;->zza(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 28
    .line 29
    const/16 v0, 0x3a9e

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzgoe;->zzb(I)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public final synthetic zzl(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zza:Lcom/google/android/gms/internal/ads/zzfxa;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzfxa;->zzb()Lcom/google/android/gms/internal/ads/zzfvk;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string v0, ""

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 12
    .line 13
    const/16 p2, 0x3a9c

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzgoe;->zzb(I)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    invoke-interface {p2, p1, v1, p3, p4}, Lcom/google/android/gms/internal/ads/zzfvk;->zzb(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 28
    .line 29
    const/16 p2, 0x3a9f

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzgoe;->zzb(I)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public final synthetic zzm(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zza:Lcom/google/android/gms/internal/ads/zzfxa;

    .line 2
    .line 3
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzfxa;->zzb()Lcom/google/android/gms/internal/ads/zzfvk;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string p4, ""

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 12
    .line 13
    const/16 p2, 0x3a9c

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzgoe;->zzb(I)V

    .line 16
    .line 17
    .line 18
    return-object p4

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    move-object v1, p1

    .line 22
    move-object v3, p2

    .line 23
    move-object v4, p3

    .line 24
    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzfvk;->zzc(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzd:Lcom/google/android/gms/internal/ads/zzgoe;

    .line 32
    .line 33
    const/16 p2, 0x3aa0

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzgoe;->zzb(I)V

    .line 36
    .line 37
    .line 38
    return-object p4
.end method

.method public final synthetic zzn(Lcom/google/android/gms/internal/ads/zzfwq;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zza:Lcom/google/android/gms/internal/ads/zzfxa;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfxa;->zza(Lcom/google/android/gms/internal/ads/zzfwq;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjq;->zzf:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfwq;->zza()Lcom/google/android/gms/internal/ads/zzbcp;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbcp;->zza()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v1, "2.825731049."

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzgjg;

    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzgjg;-><init>(I)V

    .line 37
    .line 38
    .line 39
    throw p1
.end method
