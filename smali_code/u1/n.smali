.class public final Lu1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lv1/j;

.field public final synthetic h:Ljava/util/UUID;

.field public final synthetic i:Landroidx/work/h;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Lu1/o;


# direct methods
.method public constructor <init>(Lu1/o;Lv1/j;Ljava/util/UUID;Landroidx/work/h;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/n;->k:Lu1/o;

    .line 5
    .line 6
    iput-object p2, p0, Lu1/n;->g:Lv1/j;

    .line 7
    .line 8
    iput-object p3, p0, Lu1/n;->h:Ljava/util/UUID;

    .line 9
    .line 10
    iput-object p4, p0, Lu1/n;->i:Landroidx/work/h;

    .line 11
    .line 12
    iput-object p5, p0, Lu1/n;->j:Landroid/content/Context;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lu1/n;->g:Lv1/j;

    .line 2
    .line 3
    iget-object v0, v0, Lv1/h;->g:Ljava/lang/Object;

    .line 4
    .line 5
    instance-of v0, v0, Lv1/a;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lu1/n;->h:Ljava/util/UUID;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lu1/n;->k:Lu1/o;

    .line 16
    .line 17
    iget-object v1, v1, Lu1/o;->c:Ll2/j;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ll2/j;->e(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-static {v1}, Landroidx/emoji2/text/u;->a(I)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lu1/n;->k:Lu1/o;

    .line 32
    .line 33
    iget-object v1, v1, Lu1/o;->b:Ls1/a;

    .line 34
    .line 35
    iget-object v2, p0, Lu1/n;->i:Landroidx/work/h;

    .line 36
    .line 37
    check-cast v1, Ll1/b;

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Ll1/b;->f(Ljava/lang/String;Landroidx/work/h;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lu1/n;->j:Landroid/content/Context;

    .line 43
    .line 44
    iget-object v2, p0, Lu1/n;->i:Landroidx/work/h;

    .line 45
    .line 46
    invoke-static {v1, v0, v2}, Ls1/b;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/h;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Lu1/n;->j:Landroid/content/Context;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 59
    .line 60
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :cond_1
    :goto_0
    iget-object v0, p0, Lu1/n;->g:Lv1/j;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-virtual {v0, v1}, Lv1/j;->h(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_1
    iget-object v1, p0, Lu1/n;->g:Lv1/j;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Lv1/j;->i(Ljava/lang/Throwable;)Z

    .line 76
    .line 77
    .line 78
    return-void
.end method
