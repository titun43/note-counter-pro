.class public final synthetic Ly1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lcom/getcapacitor/plugin/c;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/plugin/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/q;->a:Lcom/getcapacitor/plugin/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ly1/e;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ly1/q;->a:Lcom/getcapacitor/plugin/c;

    .line 9
    .line 10
    invoke-virtual {v1, p1, v0}, Lcom/getcapacitor/plugin/c;->f(Ly1/e;Ljava/util/ArrayList;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
