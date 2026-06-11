.class public final synthetic Ly1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:La2/c;

.field public final synthetic b:Landroidx/emoji2/text/r;


# direct methods
.method public synthetic constructor <init>(La2/c;Landroidx/emoji2/text/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/r;->a:La2/c;

    .line 5
    .line 6
    iput-object p2, p0, Ly1/r;->b:Landroidx/emoji2/text/r;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ly1/e;

    .line 2
    .line 3
    iget-object v0, p0, Ly1/r;->b:Landroidx/emoji2/text/r;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/emoji2/text/r;->h:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Ly1/r;->a:La2/c;

    .line 8
    .line 9
    invoke-virtual {v1, p1, v0}, La2/c;->b(Ly1/e;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
