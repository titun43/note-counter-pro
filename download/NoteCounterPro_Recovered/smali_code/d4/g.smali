.class public final Ld4/g;
.super Ld4/d;
.source "SourceFile"


# instance fields
.field public b:Z

.field public c:[Ljava/io/File;

.field public d:I

.field public final synthetic e:Ld4/h;


# direct methods
.method public constructor <init>(Ld4/h;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld4/g;->e:Ld4/h;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ld4/i;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 5

    .line 1
    iget-boolean v0, p0, Ld4/g;->b:Z

    .line 2
    .line 3
    iget-object v1, p0, Ld4/i;->a:Ljava/io/File;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Ld4/g;->b:Z

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    iget-object v0, p0, Ld4/g;->c:[Ljava/io/File;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget v3, p0, Ld4/g;->d:I

    .line 17
    .line 18
    array-length v4, v0

    .line 19
    if-ge v3, v4, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-object v2

    .line 23
    :cond_2
    :goto_0
    if-nez v0, :cond_5

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Ld4/g;->c:[Ljava/io/File;

    .line 30
    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Ld4/g;->e:Ld4/h;

    .line 34
    .line 35
    iget-object v0, v0, Ld4/h;->j:Ld4/j;

    .line 36
    .line 37
    iget-object v0, v0, Ld4/j;->c:Lf4/p;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    new-instance v3, Ld4/a;

    .line 42
    .line 43
    const-string v4, "Cannot list files in a directory"

    .line 44
    .line 45
    invoke-direct {v3, v1, v2, v4}, Ld4/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1, v3}, Lf4/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_3
    iget-object v0, p0, Ld4/g;->c:[Ljava/io/File;

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    array-length v0, v0

    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    :cond_4
    return-object v2

    .line 59
    :cond_5
    iget-object v0, p0, Ld4/g;->c:[Ljava/io/File;

    .line 60
    .line 61
    invoke-static {v0}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget v1, p0, Ld4/g;->d:I

    .line 65
    .line 66
    add-int/lit8 v2, v1, 0x1

    .line 67
    .line 68
    iput v2, p0, Ld4/g;->d:I

    .line 69
    .line 70
    aget-object v0, v0, v1

    .line 71
    .line 72
    return-object v0
.end method
