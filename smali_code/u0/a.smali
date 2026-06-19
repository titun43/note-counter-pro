.class public final Lu0/a;
.super Lu0/b;
.source "SourceFile"


# instance fields
.field public final a:Lw0/b;


# direct methods
.method public constructor <init>(Lw0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/a;->a:Lw0/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Landroid/net/Uri;Landroid/view/InputEvent;)Lj3/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            ")",
            "Lj3/a;"
        }
    .end annotation

    .line 1
    const-string v0, "attributionSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lo4/e0;->a:Lv4/e;

    .line 7
    .line 8
    invoke-static {v0}, Lo4/w;->a(Lw3/h;)Lt4/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lp3/w;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, p1, p2, v2}, Lp3/w;-><init>(Lu0/a;Landroid/net/Uri;Landroid/view/InputEvent;Lw3/c;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lo4/w;->b(Lt4/d;Lf4/p;)Lo4/z;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Ly4/b;->b(Lo4/z;)Lq/l;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public c(Lw0/a;)Lj3/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw0/a;",
            ")",
            "Lj3/a;"
        }
    .end annotation

    .line 1
    const-string v0, "deletionRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    throw p1
.end method

.method public d()Lj3/a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj3/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Lo4/e0;->a:Lv4/e;

    .line 2
    .line 3
    invoke-static {v0}, Lo4/w;->a(Lw3/h;)Lt4/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lr4/e;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-direct {v1, p0, v2, v3}, Lr4/e;-><init>(Ljava/lang/Object;Lw3/c;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lo4/w;->b(Lt4/d;Lf4/p;)Lo4/z;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Ly4/b;->b(Lo4/z;)Lq/l;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public e(Landroid/net/Uri;)Lj3/a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lj3/a;"
        }
    .end annotation

    .line 1
    const-string v0, "trigger"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lo4/e0;->a:Lv4/e;

    .line 7
    .line 8
    invoke-static {v0}, Lo4/w;->a(Lw3/h;)Lt4/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lk0/b;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x3

    .line 16
    invoke-direct {v1, p0, p1, v2, v3}, Lk0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lo4/w;->b(Lt4/d;Lf4/p;)Lo4/z;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Ly4/b;->b(Lo4/z;)Lq/l;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public f(Lw0/c;)Lj3/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw0/c;",
            ")",
            "Lj3/a;"
        }
    .end annotation

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    throw p1
.end method

.method public g(Lw0/d;)Lj3/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw0/d;",
            ")",
            "Lj3/a;"
        }
    .end annotation

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    throw p1
.end method
