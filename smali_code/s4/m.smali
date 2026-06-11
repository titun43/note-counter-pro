.class public final Ls4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr4/c;


# instance fields
.field public final g:Lq4/q;


# direct methods
.method public constructor <init>(Lq4/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls4/m;->g:Lq4/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/m;->g:Lq4/q;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lq4/q;->c(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lx3/a;->g:Lx3/a;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 13
    .line 14
    return-object p1
.end method
