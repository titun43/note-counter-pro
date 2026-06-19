.class public final Lf2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public g:Ls3/a;

.field public h:Lu1/f;

.field public i:Ls3/a;

.field public j:Lk1/j;

.field public k:Ls3/a;

.field public l:Ls3/a;


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/l;->k:Ls3/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lm2/d;

    .line 8
    .line 9
    check-cast v0, Lm2/h;

    .line 10
    .line 11
    invoke-virtual {v0}, Lm2/h;->close()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
