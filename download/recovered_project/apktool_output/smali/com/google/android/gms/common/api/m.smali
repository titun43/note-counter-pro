.class public abstract Lcom/google/android/gms/common/api/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final zaa:Lcom/google/android/gms/common/api/internal/g;

.field private final zab:Landroid/content/Context;

.field private final zac:Ljava/lang/String;

.field private final zad:Lcom/google/android/gms/common/api/i;

.field private final zae:Lcom/google/android/gms/common/api/e;

.field private final zaf:Lcom/google/android/gms/common/api/internal/a;

.field private final zag:Landroid/os/Looper;

.field private final zah:I

.field private final zai:Lcom/google/android/gms/common/api/p;

.field private final zaj:Lcom/google/android/gms/common/api/internal/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/l;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Null context is not permitted."

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "Api must not be null."

    .line 10
    .line 11
    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 15
    .line 16
    invoke-static {p4, v0}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "The provided context did not have an application context."

    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/android/gms/common/api/m;->zab:Landroid/content/Context;

    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x1e

    .line 33
    .line 34
    if-lt v1, v2, :cond_0

    .line 35
    .line 36
    invoke-static {p1}, Lcom/google/android/gms/common/api/k;->k(Landroid/content/Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/m;->getApiFallbackAttributionTag(Landroid/content/Context;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/common/api/m;->zac:Ljava/lang/String;

    .line 46
    .line 47
    iput-object p2, p0, Lcom/google/android/gms/common/api/m;->zad:Lcom/google/android/gms/common/api/i;

    .line 48
    .line 49
    iput-object p3, p0, Lcom/google/android/gms/common/api/m;->zae:Lcom/google/android/gms/common/api/e;

    .line 50
    .line 51
    iget-object v1, p4, Lcom/google/android/gms/common/api/l;->b:Landroid/os/Looper;

    .line 52
    .line 53
    iput-object v1, p0, Lcom/google/android/gms/common/api/m;->zag:Landroid/os/Looper;

    .line 54
    .line 55
    new-instance v1, Lcom/google/android/gms/common/api/internal/a;

    .line 56
    .line 57
    invoke-direct {v1, p2, p3, p1}, Lcom/google/android/gms/common/api/internal/a;-><init>(Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, Lcom/google/android/gms/common/api/m;->zaf:Lcom/google/android/gms/common/api/internal/a;

    .line 61
    .line 62
    new-instance p1, Lcom/google/android/gms/common/api/internal/d0;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Lcom/google/android/gms/common/api/internal/d0;-><init>(Lcom/google/android/gms/common/api/m;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lcom/google/android/gms/common/api/m;->zai:Lcom/google/android/gms/common/api/p;

    .line 68
    .line 69
    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/g;->f(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/g;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/google/android/gms/common/api/m;->zaa:Lcom/google/android/gms/common/api/internal/g;

    .line 74
    .line 75
    iget-object p2, p1, Lcom/google/android/gms/common/api/internal/g;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    iput p2, p0, Lcom/google/android/gms/common/api/m;->zah:I

    .line 82
    .line 83
    iget-object p2, p4, Lcom/google/android/gms/common/api/l;->a:Lt2/i;

    .line 84
    .line 85
    iput-object p2, p0, Lcom/google/android/gms/common/api/m;->zaj:Lcom/google/android/gms/common/api/internal/s;

    .line 86
    .line 87
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 88
    .line 89
    const/4 p2, 0x7

    .line 90
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 95
    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public final a(ILcom/google/android/gms/common/api/internal/c;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zak()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zaa:Lcom/google/android/gms/common/api/internal/g;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/google/android/gms/common/api/internal/o0;

    .line 10
    .line 11
    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/common/api/internal/o0;-><init>(ILcom/google/android/gms/common/api/internal/c;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/g;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    new-instance p2, Lcom/google/android/gms/common/api/internal/i0;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-direct {p2, v1, p1, p0}, Lcom/google/android/gms/common/api/internal/i0;-><init>(Lcom/google/android/gms/common/api/internal/r0;ILcom/google/android/gms/common/api/m;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    invoke-virtual {p1, v0, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public asGoogleApiClient()Lcom/google/android/gms/common/api/p;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zai:Lcom/google/android/gms/common/api/p;

    return-object v0
.end method

.method public final b(ILcom/google/android/gms/common/api/internal/u;)Lh3/n;
    .locals 4

    .line 1
    new-instance v0, Lh3/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lh3/h;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/common/api/m;->zaj:Lcom/google/android/gms/common/api/internal/s;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/google/android/gms/common/api/m;->zaa:Lcom/google/android/gms/common/api/internal/g;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget v3, p2, Lcom/google/android/gms/common/api/internal/u;->c:I

    .line 14
    .line 15
    invoke-virtual {v2, v0, v3, p0}, Lcom/google/android/gms/common/api/internal/g;->e(Lh3/h;ILcom/google/android/gms/common/api/m;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lcom/google/android/gms/common/api/internal/p0;

    .line 19
    .line 20
    invoke-direct {v3, p1, p2, v0, v1}, Lcom/google/android/gms/common/api/internal/p0;-><init>(ILcom/google/android/gms/common/api/internal/u;Lh3/h;Lcom/google/android/gms/common/api/internal/s;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, v2, Lcom/google/android/gms/common/api/internal/g;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    .line 25
    new-instance p2, Lcom/google/android/gms/common/api/internal/i0;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-direct {p2, v3, p1, p0}, Lcom/google/android/gms/common/api/internal/i0;-><init>(Lcom/google/android/gms/common/api/internal/r0;ILcom/google/android/gms/common/api/m;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v2, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    invoke-virtual {p1, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 42
    .line 43
    .line 44
    iget-object p1, v0, Lh3/h;->a:Lh3/n;

    .line 45
    .line 46
    return-object p1
.end method

.method public createClientSettingsBuilder()Lcom/google/android/gms/common/internal/h;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/internal/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 7
    .line 8
    iget-object v2, v0, Lcom/google/android/gms/common/internal/h;->a:Lo/g;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    new-instance v2, Lo/g;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v2, v3}, Lo/g;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v2, v0, Lcom/google/android/gms/common/internal/h;->a:Lo/g;

    .line 19
    .line 20
    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/common/internal/h;->a:Lo/g;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Lo/g;->addAll(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/google/android/gms/common/api/m;->zab:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, v0, Lcom/google/android/gms/common/internal/h;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/google/android/gms/common/api/m;->zab:Landroid/content/Context;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, v0, Lcom/google/android/gms/common/internal/h;->b:Ljava/lang/String;

    .line 44
    .line 45
    return-object v0
.end method

.method public disconnectService()Lh3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh3/g;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zaa:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/android/gms/common/api/internal/y;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/m;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/internal/y;-><init>(Lcom/google/android/gms/common/api/internal/a;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 16
    .line 17
    const/16 v2, 0xe

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 24
    .line 25
    .line 26
    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/y;->b:Lh3/h;

    .line 27
    .line 28
    iget-object v0, v0, Lh3/h;->a:Lh3/n;

    .line 29
    .line 30
    return-object v0
.end method

.method public doBestEffortWrite(Lcom/google/android/gms/common/api/internal/c;)Lcom/google/android/gms/common/api/internal/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/c;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/m;->a(ILcom/google/android/gms/common/api/internal/c;)V

    return-object p1
.end method

.method public doBestEffortWrite(Lcom/google/android/gms/common/api/internal/u;)Lh3/g;
    .locals 1
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/b;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/u;",
            ")",
            "Lh3/g;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/m;->b(ILcom/google/android/gms/common/api/internal/u;)Lh3/n;

    move-result-object p1

    return-object p1
.end method

.method public doRead(Lcom/google/android/gms/common/api/internal/c;)Lcom/google/android/gms/common/api/internal/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/c;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/m;->a(ILcom/google/android/gms/common/api/internal/c;)V

    return-object p1
.end method

.method public doRead(Lcom/google/android/gms/common/api/internal/u;)Lh3/g;
    .locals 1
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/b;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/u;",
            ")",
            "Lh3/g;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/m;->b(ILcom/google/android/gms/common/api/internal/u;)Lh3/n;

    move-result-object p1

    return-object p1
.end method

.method public doRegisterEventListener(Lcom/google/android/gms/common/api/internal/o;Lcom/google/android/gms/common/api/internal/v;)Lh3/g;
    .locals 0
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/o;",
            "U:",
            "Lcom/google/android/gms/common/api/internal/v;",
            ">(TT;TU;)",
            "Lh3/g;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public doRegisterEventListener(Lcom/google/android/gms/common/api/internal/p;)Lh3/g;
    .locals 0
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/b;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/p;",
            ")",
            "Lh3/g;"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public doUnregisterEventListener(Lcom/google/android/gms/common/api/internal/j;)Lh3/g;
    .locals 1
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/j;",
            ")",
            "Lh3/g;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/m;->doUnregisterEventListener(Lcom/google/android/gms/common/api/internal/j;I)Lh3/g;

    move-result-object p1

    return-object p1
.end method

.method public doUnregisterEventListener(Lcom/google/android/gms/common/api/internal/j;I)Lh3/g;
    .locals 3
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/j;",
            "I)",
            "Lh3/g;"
        }
    .end annotation

    .line 2
    const-string v0, "Listener key cannot be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zaa:Lcom/google/android/gms/common/api/internal/g;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    new-instance v1, Lh3/h;

    invoke-direct {v1}, Lh3/h;-><init>()V

    .line 5
    invoke-virtual {v0, v1, p2, p0}, Lcom/google/android/gms/common/api/internal/g;->e(Lh3/h;ILcom/google/android/gms/common/api/m;)V

    new-instance p2, Lcom/google/android/gms/common/api/internal/q0;

    .line 6
    invoke-direct {p2, p1, v1}, Lcom/google/android/gms/common/api/internal/q0;-><init>(Lcom/google/android/gms/common/api/internal/j;Lh3/h;)V

    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/g;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v2, Lcom/google/android/gms/common/api/internal/i0;

    .line 7
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    invoke-direct {v2, p2, p1, p0}, Lcom/google/android/gms/common/api/internal/i0;-><init>(Lcom/google/android/gms/common/api/internal/r0;ILcom/google/android/gms/common/api/m;)V

    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    const/16 p2, 0xd

    .line 8
    invoke-virtual {p1, p2, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    .line 9
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 10
    iget-object p1, v1, Lh3/h;->a:Lh3/n;

    return-object p1
.end method

.method public doWrite(Lcom/google/android/gms/common/api/internal/c;)Lcom/google/android/gms/common/api/internal/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/c;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/m;->a(ILcom/google/android/gms/common/api/internal/c;)V

    return-object p1
.end method

.method public doWrite(Lcom/google/android/gms/common/api/internal/u;)Lh3/g;
    .locals 1
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/b;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/u;",
            ")",
            "Lh3/g;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/m;->b(ILcom/google/android/gms/common/api/internal/u;)Lh3/n;

    move-result-object p1

    return-object p1
.end method

.method public getApiFallbackAttributionTag(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getApiKey()Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/internal/a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zaf:Lcom/google/android/gms/common/api/internal/a;

    return-object v0
.end method

.method public getApiOptions()Lcom/google/android/gms/common/api/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/e;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zae:Lcom/google/android/gms/common/api/e;

    return-object v0
.end method

.method public getApplicationContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zab:Landroid/content/Context;

    return-object v0
.end method

.method public getContextAttributionTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zac:Ljava/lang/String;

    return-object v0
.end method

.method public getContextFeatureId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zac:Ljava/lang/String;

    return-object v0
.end method

.method public getLooper()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zag:Landroid/os/Looper;

    return-object v0
.end method

.method public registerListener(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(T",
            "L;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/internal/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zag:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lb3/g;->m(Landroid/os/Looper;Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final zaa()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/api/m;->zah:I

    return v0
.end method

.method public final zab(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/a0;)Lcom/google/android/gms/common/api/g;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/m;->createClientSettingsBuilder()Lcom/google/android/gms/common/internal/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/gms/common/internal/i;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/android/gms/common/internal/h;->a:Lo/g;

    .line 8
    .line 9
    iget-object v4, v0, Lcom/google/android/gms/common/internal/h;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, v0, Lcom/google/android/gms/common/internal/h;->c:Ljava/lang/String;

    .line 12
    .line 13
    sget-object v6, Lf3/a;->b:Lf3/a;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/common/internal/i;-><init>(Ljava/util/Set;Lo/f;Ljava/lang/String;Ljava/lang/String;Lf3/a;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/common/api/m;->zad:Lcom/google/android/gms/common/api/i;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/google/android/gms/common/api/i;->a:Lcom/google/android/gms/common/api/a;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v5, p0, Lcom/google/android/gms/common/api/m;->zae:Lcom/google/android/gms/common/api/e;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/google/android/gms/common/api/m;->zab:Landroid/content/Context;

    .line 29
    .line 30
    move-object v7, p2

    .line 31
    move-object v3, p1

    .line 32
    move-object v6, p2

    .line 33
    move-object v4, v1

    .line 34
    move-object v1, v0

    .line 35
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/common/api/a;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/i;Ljava/lang/Object;Lcom/google/android/gms/common/api/n;Lcom/google/android/gms/common/api/o;)Lcom/google/android/gms/common/api/g;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/m;->getContextAttributionTag()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    instance-of v0, p1, Lcom/google/android/gms/common/internal/f;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    move-object v0, p1

    .line 50
    check-cast v0, Lcom/google/android/gms/common/internal/f;

    .line 51
    .line 52
    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/internal/f;->setAttributionTag(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    if-eqz p2, :cond_2

    .line 56
    .line 57
    instance-of p2, p1, Lcom/google/android/gms/common/api/internal/m;

    .line 58
    .line 59
    if-nez p2, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-static {p1}, Landroidx/emoji2/text/u;->p(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    throw p1

    .line 67
    :cond_2
    :goto_0
    return-object p1
.end method

.method public final zac(Landroid/content/Context;Landroid/os/Handler;)Lcom/google/android/gms/common/api/internal/j0;
    .locals 8

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/internal/j0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/m;->createClientSettingsBuilder()Lcom/google/android/gms/common/internal/h;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Lcom/google/android/gms/common/internal/i;

    .line 8
    .line 9
    iget-object v3, v1, Lcom/google/android/gms/common/internal/h;->a:Lo/g;

    .line 10
    .line 11
    iget-object v5, v1, Lcom/google/android/gms/common/internal/h;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/google/android/gms/common/internal/h;->c:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v7, Lf3/a;->b:Lf3/a;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/common/internal/i;-><init>(Ljava/util/Set;Lo/f;Ljava/lang/String;Ljava/lang/String;Lf3/a;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p1, p2, v2}, Lcom/google/android/gms/common/api/internal/j0;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/common/internal/i;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
