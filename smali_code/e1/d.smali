.class public final Le1/d;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# instance fields
.field public final g:[Le1/b;

.field public final h:Landroidx/emoji2/text/p;

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;[Le1/b;Landroidx/emoji2/text/p;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v5, Le1/c;

    .line 5
    .line 6
    invoke-direct {v5, p4, p3}, Le1/c;-><init>(Landroidx/emoji2/text/p;[Le1/b;)V

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/16 v4, 0xc

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    move-object v1, p1

    .line 14
    move-object v2, p2

    .line 15
    invoke-direct/range {v0 .. v5}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    .line 16
    .line 17
    .line 18
    iput-object p4, v0, Le1/d;->h:Landroidx/emoji2/text/p;

    .line 19
    .line 20
    iput-object p3, v0, Le1/d;->g:[Le1/b;

    .line 21
    .line 22
    return-void
.end method

.method public static a([Le1/b;Landroid/database/sqlite/SQLiteDatabase;)Le1/b;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p0, v0

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-object v1, v1, Le1/b;->h:Landroid/database/sqlite/SQLiteClosable;

    .line 7
    .line 8
    check-cast v1, Landroid/database/sqlite/SQLiteDatabase;

    .line 9
    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Le1/b;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p1, v2}, Le1/b;-><init>(Landroid/database/sqlite/SQLiteClosable;I)V

    .line 17
    .line 18
    .line 19
    aput-object v1, p0, v0

    .line 20
    .line 21
    :goto_0
    aget-object p0, p0, v0

    .line 22
    .line 23
    return-object p0
.end method


# virtual methods
.method public final declared-synchronized b()Le1/b;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Le1/d;->i:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v1, p0, Le1/d;->i:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Le1/d;->close()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Le1/d;->b()Le1/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_1
    iget-object v1, p0, Le1/d;->g:[Le1/b;

    .line 25
    .line 26
    invoke-static {v1, v0}, Le1/d;->a([Le1/b;Landroid/database/sqlite/SQLiteDatabase;)Le1/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    monitor-exit p0

    .line 31
    return-object v0

    .line 32
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw v0
.end method

.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Le1/d;->g:[Le1/b;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    aput-object v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
.end method

.method public final onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le1/d;->g:[Le1/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, Le1/d;->a([Le1/b;Landroid/database/sqlite/SQLiteDatabase;)Le1/b;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Le1/d;->h:Landroidx/emoji2/text/p;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 5

    .line 1
    iget-object v0, p0, Le1/d;->g:[Le1/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, Le1/d;->a([Le1/b;Landroid/database/sqlite/SQLiteDatabase;)Le1/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Le1/d;->h:Landroidx/emoji2/text/p;

    .line 8
    .line 9
    iget-object v1, v0, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lk1/j;

    .line 12
    .line 13
    const-string v2, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Le1/b;->j(Ljava/lang/String;)Landroid/database/Cursor;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 27
    .line 28
    .line 29
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_3

    .line 36
    :cond_0
    move v3, v4

    .line 37
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lk1/j;->t(Le1/b;)V

    .line 41
    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    invoke-static {p1}, Lk1/j;->A(Le1/b;)Lg/m0;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-boolean v3, v2, Lg/m0;->g:Z

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v1, "Pre-packaged database has an invalid schema: "

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v2, Lg/m0;->h:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_2
    :goto_1
    invoke-virtual {v0, p1}, Landroidx/emoji2/text/p;->F(Le1/b;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, v1, Lk1/j;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 84
    .line 85
    sget v0, Landroidx/work/impl/WorkDatabase_Impl;->s:I

    .line 86
    .line 87
    iget-object v0, p1, Lz0/i;->g:Ljava/util/List;

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    :goto_2
    if-ge v4, v0, :cond_3

    .line 96
    .line 97
    iget-object v1, p1, Lz0/i;->g:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ll1/f;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    add-int/lit8 v4, v4, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    return-void

    .line 112
    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 113
    .line 114
    .line 115
    throw p1
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le1/d;->i:Z

    .line 3
    .line 4
    iget-object v0, p0, Le1/d;->g:[Le1/b;

    .line 5
    .line 6
    invoke-static {v0, p1}, Le1/d;->a([Le1/b;Landroid/database/sqlite/SQLiteDatabase;)Le1/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Le1/d;->h:Landroidx/emoji2/text/p;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, p3}, Landroidx/emoji2/text/p;->D(Le1/b;II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Le1/d;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    iget-object v0, p0, Le1/d;->h:Landroidx/emoji2/text/p;

    .line 6
    .line 7
    iget-object v1, p0, Le1/d;->g:[Le1/b;

    .line 8
    .line 9
    invoke-static {v1, p1}, Le1/d;->a([Le1/b;Landroid/database/sqlite/SQLiteDatabase;)Le1/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v1, v0, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 14
    .line 15
    const-string v1, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'"

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Le1/b;->j(Ljava/lang/String;)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 30
    .line 31
    .line 32
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    move v2, v3

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_0
    move v2, v4

    .line 41
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    new-instance v2, Landroidx/emoji2/text/r;

    .line 48
    .line 49
    const-string v5, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 50
    .line 51
    invoke-direct {v2, v5, v3}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v2}, Le1/b;->i(Ld1/d;)Landroid/database/Cursor;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    goto :goto_1

    .line 69
    :catchall_1
    move-exception p1

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    move-object v5, v1

    .line 72
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 73
    .line 74
    .line 75
    const-string v2, "c103703e120ae8cc73c9248622f3cd1e"

    .line 76
    .line 77
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_4

    .line 82
    .line 83
    const-string v2, "49f946663a8deb7054212b8adda248c6"

    .line 84
    .line 85
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_2

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string v0, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number."

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :cond_3
    invoke-static {p1}, Lk1/j;->A(Le1/b;)Lg/m0;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-boolean v5, v2, Lg/m0;->g:Z

    .line 109
    .line 110
    if-eqz v5, :cond_7

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Landroidx/emoji2/text/p;->F(Le1/b;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_3
    iget-object v2, v0, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, Lk1/j;

    .line 118
    .line 119
    iget-object v5, v2, Lk1/j;->h:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 122
    .line 123
    sget v6, Landroidx/work/impl/WorkDatabase_Impl;->s:I

    .line 124
    .line 125
    iput-object p1, v5, Lz0/i;->a:Le1/b;

    .line 126
    .line 127
    const-string v5, "PRAGMA foreign_keys = ON"

    .line 128
    .line 129
    invoke-virtual {p1, v5}, Le1/b;->h(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v5, v2, Lk1/j;->h:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 135
    .line 136
    iget-object v5, v5, Lz0/i;->d:Lz0/e;

    .line 137
    .line 138
    monitor-enter v5

    .line 139
    :try_start_2
    iget-boolean v6, v5, Lz0/e;->e:Z

    .line 140
    .line 141
    if-eqz v6, :cond_5

    .line 142
    .line 143
    const-string v3, "ROOM"

    .line 144
    .line 145
    const-string v6, "Invalidation tracker is initialized twice :/."

    .line 146
    .line 147
    invoke-static {v3, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    monitor-exit v5

    .line 151
    goto :goto_4

    .line 152
    :catchall_2
    move-exception p1

    .line 153
    goto :goto_6

    .line 154
    :cond_5
    const-string v6, "PRAGMA temp_store = MEMORY;"

    .line 155
    .line 156
    invoke-virtual {p1, v6}, Le1/b;->h(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const-string v6, "PRAGMA recursive_triggers=\'ON\';"

    .line 160
    .line 161
    invoke-virtual {p1, v6}, Le1/b;->h(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const-string v6, "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    .line 165
    .line 166
    invoke-virtual {p1, v6}, Le1/b;->h(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5, p1}, Lz0/e;->c(Le1/b;)V

    .line 170
    .line 171
    .line 172
    const-string v6, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "

    .line 173
    .line 174
    new-instance v7, Le1/f;

    .line 175
    .line 176
    iget-object v8, p1, Le1/b;->h:Landroid/database/sqlite/SQLiteClosable;

    .line 177
    .line 178
    check-cast v8, Landroid/database/sqlite/SQLiteDatabase;

    .line 179
    .line 180
    invoke-virtual {v8, v6}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-direct {v7, v6}, Le1/f;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    .line 185
    .line 186
    .line 187
    iput-object v7, v5, Lz0/e;->f:Le1/f;

    .line 188
    .line 189
    iput-boolean v3, v5, Lz0/e;->e:Z

    .line 190
    .line 191
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 192
    :goto_4
    iget-object v3, v2, Lk1/j;->h:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 195
    .line 196
    iget-object v3, v3, Lz0/i;->g:Ljava/util/List;

    .line 197
    .line 198
    if-eqz v3, :cond_6

    .line 199
    .line 200
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    :goto_5
    if-ge v4, v3, :cond_6

    .line 205
    .line 206
    iget-object v5, v2, Lk1/j;->h:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 209
    .line 210
    iget-object v5, v5, Lz0/i;->g:Ljava/util/List;

    .line 211
    .line 212
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    check-cast v5, Ll1/f;

    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1}, Le1/b;->a()V

    .line 222
    .line 223
    .line 224
    :try_start_3
    sget v5, Landroidx/work/impl/WorkDatabase;->k:I

    .line 225
    .line 226
    new-instance v5, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v6, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < "

    .line 229
    .line 230
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 234
    .line 235
    .line 236
    move-result-wide v6

    .line 237
    sget-wide v8, Landroidx/work/impl/WorkDatabase;->j:J

    .line 238
    .line 239
    sub-long/2addr v6, v8

    .line 240
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v6, " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"

    .line 244
    .line 245
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    invoke-virtual {p1, v5}, Le1/b;->h(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1}, Le1/b;->k()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1}, Le1/b;->g()V

    .line 259
    .line 260
    .line 261
    add-int/lit8 v4, v4, 0x1

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :catchall_3
    move-exception v0

    .line 265
    invoke-virtual {p1}, Le1/b;->g()V

    .line 266
    .line 267
    .line 268
    throw v0

    .line 269
    :cond_6
    iput-object v1, v0, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 270
    .line 271
    return-void

    .line 272
    :goto_6
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 273
    throw p1

    .line 274
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 275
    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    const-string v1, "Pre-packaged database has an invalid schema: "

    .line 279
    .line 280
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    iget-object v1, v2, Lg/m0;->h:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v1, Ljava/lang/String;

    .line 286
    .line 287
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw p1

    .line 298
    :goto_7
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 299
    .line 300
    .line 301
    throw p1

    .line 302
    :cond_8
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le1/d;->i:Z

    .line 3
    .line 4
    iget-object v0, p0, Le1/d;->g:[Le1/b;

    .line 5
    .line 6
    invoke-static {v0, p1}, Le1/d;->a([Le1/b;Landroid/database/sqlite/SQLiteDatabase;)Le1/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Le1/d;->h:Landroidx/emoji2/text/p;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, p3}, Landroidx/emoji2/text/p;->D(Le1/b;II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
