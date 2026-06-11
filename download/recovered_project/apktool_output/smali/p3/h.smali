.class public final Lp3/h;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/q;


# instance fields
.field public synthetic g:Ljava/lang/Throwable;

.field public final synthetic h:Lk1/j;

.field public final synthetic i:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lk1/j;Landroid/net/Uri;Lw3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/h;->h:Lk1/j;

    .line 2
    .line 3
    iput-object p2, p0, Lp3/h;->i:Landroid/net/Uri;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lr4/c;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, Lw3/c;

    .line 6
    .line 7
    new-instance p1, Lp3/h;

    .line 8
    .line 9
    iget-object v0, p0, Lp3/h;->h:Lk1/j;

    .line 10
    .line 11
    iget-object v1, p0, Lp3/h;->i:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-direct {p1, v0, v1, p3}, Lp3/h;-><init>(Lk1/j;Landroid/net/Uri;Lw3/c;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p1, Lp3/h;->g:Ljava/lang/Throwable;

    .line 17
    .line 18
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lp3/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1
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
    iget-object p1, p0, Lp3/h;->g:Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object v0, p0, Lp3/h;->h:Lk1/j;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lp3/h;->i:Landroid/net/Uri;

    .line 14
    .line 15
    invoke-static {p1, v0}, Lk1/j;->z(Ljava/lang/Throwable;Landroid/net/Uri;)Ljava/lang/Throwable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    throw p1
.end method
