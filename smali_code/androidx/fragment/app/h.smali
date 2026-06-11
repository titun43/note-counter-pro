.class public final Landroidx/fragment/app/h;
.super Ly4/b;
.source "SourceFile"


# instance fields
.field public final i:Z

.field public j:Z

.field public k:Landroidx/emoji2/text/p;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/g1;Z)V
    .locals 1

    .line 1
    const-string v0, "operation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Ly4/b;-><init>(Landroidx/fragment/app/g1;)V

    .line 7
    .line 8
    .line 9
    iput-boolean p2, p0, Landroidx/fragment/app/h;->i:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final S(Landroid/content/Context;)Landroidx/emoji2/text/p;
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/fragment/app/h;->j:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/fragment/app/h;->k:Landroidx/emoji2/text/p;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    throw p1
.end method
