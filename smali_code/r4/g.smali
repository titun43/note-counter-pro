.class public final Lr4/g;
.super Ly3/c;


# instance fields
.field public synthetic g:Ljava/lang/Object;

.field public h:I

.field public final synthetic i:Lr4/h;

.field public j:Ljava/lang/Object;

.field public k:Lr4/c;


# direct methods
.method public constructor <init>(Lr4/h;Ly3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr4/g;->i:Lr4/h;

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
    iput-object p1, p0, Lr4/g;->g:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lr4/g;->h:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lr4/g;->h:I

    .line 9
    .line 10
    iget-object p1, p0, Lr4/g;->i:Lr4/h;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lr4/h;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
