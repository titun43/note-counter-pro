.class public final Lq3/a;
.super Ly3/c;
.source "SourceFile"


# instance fields
.field public g:Ljava/io/InputStream;

.field public h:Lr3/z;

.field public i:Lf4/p;

.field public j:Lg4/m;

.field public k:Lg4/m;

.field public l:I

.field public m:I

.field public synthetic n:Ljava/lang/Object;

.field public o:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lq3/a;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lq3/a;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lq3/a;->o:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p1, p1, v0, p1, p0}, Ly4/b;->H(Ljava/io/InputStream;Lr3/z;ILf4/p;Ly3/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
