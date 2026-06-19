.class public final Lk0/o;
.super Lg4/j;
.source "SourceFile"

# interfaces
.implements Lf4/l;


# instance fields
.field public final synthetic h:Lk0/d0;


# direct methods
.method public constructor <init>(Lk0/d0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/o;->h:Lk0/d0;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lg4/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lk0/o;->h:Lk0/d0;

    .line 7
    .line 8
    iget-object v0, v0, Lk0/d0;->f:Lr4/s;

    .line 9
    .line 10
    new-instance v1, Lk0/g;

    .line 11
    .line 12
    invoke-direct {v1, p1}, Lk0/g;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lr4/s;->c(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object p1, Lk0/d0;->j:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v0, p0, Lk0/o;->h:Lk0/d0;

    .line 21
    .line 22
    monitor-enter p1

    .line 23
    :try_start_0
    sget-object v1, Lk0/d0;->i:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-virtual {v0}, Lk0/d0;->b()Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit p1

    .line 37
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 38
    .line 39
    return-object p1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    monitor-exit p1

    .line 42
    throw v0
.end method
