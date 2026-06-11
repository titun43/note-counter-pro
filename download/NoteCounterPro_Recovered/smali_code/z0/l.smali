.class public abstract Lz0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Lz0/i;

.field public volatile c:Le1/f;


# direct methods
.method public constructor <init>(Lz0/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lz0/l;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p1, p0, Lz0/l;->b:Lz0/i;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Le1/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lz0/l;->b:Lz0/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz0/i;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz0/l;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lz0/l;->c:Le1/f;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lz0/l;->b()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lz0/l;->b:Lz0/i;

    .line 25
    .line 26
    invoke-virtual {v1}, Lz0/i;->a()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lz0/i;->b()V

    .line 30
    .line 31
    .line 32
    iget-object v1, v1, Lz0/i;->c:Ld1/c;

    .line 33
    .line 34
    invoke-interface {v1}, Ld1/c;->c()Le1/b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Le1/f;

    .line 39
    .line 40
    iget-object v1, v1, Le1/b;->h:Landroid/database/sqlite/SQLiteClosable;

    .line 41
    .line 42
    check-cast v1, Landroid/database/sqlite/SQLiteDatabase;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-direct {v2, v0}, Le1/f;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Lz0/l;->c:Le1/f;

    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lz0/l;->c:Le1/f;

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_1
    invoke-virtual {p0}, Lz0/l;->b()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v1, p0, Lz0/l;->b:Lz0/i;

    .line 61
    .line 62
    invoke-virtual {v1}, Lz0/i;->a()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lz0/i;->b()V

    .line 66
    .line 67
    .line 68
    iget-object v1, v1, Lz0/i;->c:Ld1/c;

    .line 69
    .line 70
    invoke-interface {v1}, Ld1/c;->c()Le1/b;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    new-instance v2, Le1/f;

    .line 75
    .line 76
    iget-object v1, v1, Le1/b;->h:Landroid/database/sqlite/SQLiteClosable;

    .line 77
    .line 78
    check-cast v1, Landroid/database/sqlite/SQLiteDatabase;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {v2, v0}, Le1/f;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    .line 85
    .line 86
    .line 87
    return-object v2
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public final c(Le1/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/l;->c:Le1/f;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lz0/l;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
