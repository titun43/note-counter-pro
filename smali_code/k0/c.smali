.class public final Lk0/c;
.super Ly3/c;
.source "SourceFile"


# instance fields
.field public g:Ljava/io/Serializable;

.field public h:Ljava/util/Iterator;

.field public synthetic i:Ljava/lang/Object;

.field public j:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lk0/c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lk0/c;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lk0/c;->j:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1, p0}, La/a;->c(Ljava/util/List;Lk0/w;Ly3/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
