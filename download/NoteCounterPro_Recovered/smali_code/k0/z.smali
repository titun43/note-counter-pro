.class public final Lk0/z;
.super Ly3/c;
.source "SourceFile"


# instance fields
.field public g:Lk0/d0;

.field public h:Ljava/io/FileInputStream;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lk0/d0;

.field public k:I


# direct methods
.method public constructor <init>(Lk0/d0;Ly3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/z;->j:Lk0/d0;

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
    iput-object p1, p0, Lk0/z;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lk0/z;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lk0/z;->k:I

    .line 9
    .line 10
    iget-object p1, p0, Lk0/z;->j:Lk0/d0;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lk0/d0;->f(Ly3/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
