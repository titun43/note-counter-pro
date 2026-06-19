.class public final Lk0/u;
.super Ly3/c;
.source "SourceFile"


# instance fields
.field public g:Lk0/d0;

.field public h:Ljava/lang/Object;

.field public i:Ljava/io/Serializable;

.field public j:Ljava/lang/Object;

.field public k:Lk0/w;

.field public l:Ljava/util/Iterator;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lk0/d0;

.field public o:I


# direct methods
.method public constructor <init>(Lk0/d0;Ly3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/u;->n:Lk0/d0;

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
    iput-object p1, p0, Lk0/u;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lk0/u;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lk0/u;->o:I

    .line 9
    .line 10
    iget-object p1, p0, Lk0/u;->n:Lk0/d0;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lk0/d0;->c(Ly3/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
