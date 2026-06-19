.class public final Lr4/r;
.super Ly3/c;
.source "SourceFile"


# instance fields
.field public g:Lr4/s;

.field public h:Lr4/c;

.field public i:Lr4/u;

.field public j:Lo4/r0;

.field public k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lr4/s;

.field public n:I


# direct methods
.method public constructor <init>(Lr4/s;Lw3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr4/r;->m:Lr4/s;

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
    iput-object p1, p0, Lr4/r;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lr4/r;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lr4/r;->n:I

    .line 9
    .line 10
    iget-object p1, p0, Lr4/r;->m:Lr4/s;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lr4/s;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lx3/a;->g:Lx3/a;

    .line 17
    .line 18
    return-object p1
.end method
