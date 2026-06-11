.class public final Le1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/sqlite/SQLiteDatabase$CursorFactory;


# instance fields
.field public final synthetic a:Ld1/d;


# direct methods
.method public constructor <init>(Ld1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le1/a;->a:Ld1/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final newCursor(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 1

    .line 1
    new-instance p1, Le1/b;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p4, v0}, Le1/b;-><init>(Landroid/database/sqlite/SQLiteClosable;I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Le1/a;->a:Ld1/d;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ld1/d;->b(Le1/b;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Landroid/database/sqlite/SQLiteCursor;

    .line 13
    .line 14
    invoke-direct {p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method
