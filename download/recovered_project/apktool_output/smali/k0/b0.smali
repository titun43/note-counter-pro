.class public final Lk0/b0;
.super Ly3/c;
.source "SourceFile"


# instance fields
.field public g:Lk0/d0;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lk0/d0;

.field public l:I


# direct methods
.method public constructor <init>(Lk0/d0;Ly3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/b0;->k:Lk0/d0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ly3/c;-><init>(Lw3/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lk0/b0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lk0/b0;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lk0/b0;->l:I

    .line 9
    .line 10
    iget-object p1, p0, Lk0/b0;->k:Lk0/d0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, Lk0/d0;->h(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
