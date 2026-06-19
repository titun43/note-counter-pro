.class public final Lb1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:I

.field public final h:I

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lb1/c;->g:I

    .line 5
    .line 6
    iput p2, p0, Lb1/c;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lb1/c;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lb1/c;->j:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lb1/c;

    .line 2
    .line 3
    iget v0, p0, Lb1/c;->g:I

    .line 4
    .line 5
    iget v1, p1, Lb1/c;->g:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lb1/c;->h:I

    .line 11
    .line 12
    iget p1, p1, Lb1/c;->h:I

    .line 13
    .line 14
    sub-int/2addr v0, p1

    .line 15
    :cond_0
    return v0
.end method
