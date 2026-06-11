.class public abstract Ld4/l;
.super Lb3/g;


# direct methods
.method public static B(Ljava/io/File;Ljava/io/File;)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "The source file doesn\'t exist."

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    sget-object v3, Ld4/n;->g:Ld4/n;

    .line 9
    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    :try_start_0
    sget-object v4, Ld4/k;->g:Ld4/k;

    .line 14
    .line 15
    new-instance v5, Ld4/m;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    invoke-direct {v5, v3, v6}, Ld4/m;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    new-instance v6, Ld4/j;

    .line 22
    .line 23
    invoke-direct {v6, p0, v4, v5}, Ld4/j;-><init>(Ljava/io/File;Ld4/k;Ld4/m;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Ld4/h;

    .line 27
    .line 28
    invoke-direct {v4, v6}, Ld4/h;-><init>(Ld4/j;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {v4}, Ld4/h;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_5

    .line 36
    .line 37
    invoke-virtual {v4}, Ld4/h;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Ljava/io/File;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_4

    .line 48
    .line 49
    invoke-static {v5, p0}, Ld4/l;->F(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    new-instance v7, Ljava/io/File;

    .line 54
    .line 55
    invoke-direct {v7, p1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_0

    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_0

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    new-instance p0, Ld4/a;

    .line 78
    .line 79
    const-string p1, "The destination file already exists."

    .line 80
    .line 81
    invoke-direct {p0, v5, v7, p1}, Ld4/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v7, p0}, Ld4/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    throw v2

    .line 88
    :cond_1
    :goto_1
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_2

    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-static {v5, v7, v0}, Ld4/l;->C(Ljava/io/File;Ljava/io/File;Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/io/File;->length()J

    .line 102
    .line 103
    .line 104
    move-result-wide v6

    .line 105
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 106
    .line 107
    .line 108
    move-result-wide v8

    .line 109
    cmp-long v6, v6, v8

    .line 110
    .line 111
    if-nez v6, :cond_3

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 115
    .line 116
    const-string p1, "Source file wasn\'t copied completely, length of destination file differs."

    .line 117
    .line 118
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v5, p0}, Ld4/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    throw v2

    .line 125
    :cond_4
    new-instance p0, Ld4/a;

    .line 126
    .line 127
    invoke-direct {p0, v5, v2, v1}, Ld4/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v5, p0}, Ld4/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    throw v2
    :try_end_0
    .catch Ld4/p; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    :cond_5
    const/4 p0, 0x1

    .line 135
    return p0

    .line 136
    :catch_0
    return v0

    .line 137
    :cond_6
    new-instance p1, Ld4/a;

    .line 138
    .line 139
    invoke-direct {p1, p0, v2, v1}, Ld4/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, p0, p1}, Ld4/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    throw v2
.end method

.method public static C(Ljava/io/File;Ljava/io/File;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p2, Ld4/a;

    .line 23
    .line 24
    const-string v0, "Tried to overwrite the destination, but failed to delete it."

    .line 25
    .line 26
    invoke-direct {p2, p0, p1, v0}, Ld4/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p2

    .line 30
    :cond_1
    new-instance p2, Ld4/a;

    .line 31
    .line 32
    const-string v0, "The destination file already exists."

    .line 33
    .line 34
    invoke-direct {p2, p0, p1, v0}, Ld4/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p2

    .line 38
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_3

    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    new-instance p2, Ld4/c;

    .line 52
    .line 53
    const-string v0, "Failed to create target directory."

    .line 54
    .line 55
    invoke-direct {p2, p0, p1, v0}, Ld4/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p2

    .line 59
    :cond_4
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    if-eqz p2, :cond_5

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 66
    .line 67
    .line 68
    :cond_5
    new-instance p2, Ljava/io/FileInputStream;

    .line 69
    .line 70
    invoke-direct {p2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 71
    .line 72
    .line 73
    :try_start_0
    new-instance p0, Ljava/io/FileOutputStream;

    .line 74
    .line 75
    invoke-direct {p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    :try_start_1
    invoke-static {p2, p0}, Lz2/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    .line 80
    .line 81
    :try_start_2
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/io/FileInputStream;->close()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    goto :goto_1

    .line 90
    :catchall_1
    move-exception p1

    .line 91
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 92
    :catchall_2
    move-exception v0

    .line 93
    :try_start_4
    invoke-static {p0, p1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 97
    :goto_1
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 98
    :catchall_3
    move-exception p1

    .line 99
    invoke-static {p2, p0}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_6
    new-instance p1, Ld4/a;

    .line 104
    .line 105
    const/4 p2, 0x0

    .line 106
    const-string v0, "The source file doesn\'t exist."

    .line 107
    .line 108
    invoke-direct {p1, p0, p2, v0}, Ld4/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1
.end method

.method public static D(Ljava/io/File;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "getName(...)"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Ln4/i;->Y(Ljava/lang/CharSequence;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, -0x1

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    const-string p0, ""

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v0, "substring(...)"

    .line 36
    .line 37
    invoke-static {p0, v0}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method public static final E(Ld4/b;)Ld4/b;
    .locals 6

    .line 1
    new-instance v0, Ld4/b;

    .line 2
    .line 3
    iget-object v1, p0, Ld4/b;->a:Ljava/io/File;

    .line 4
    .line 5
    iget-object p0, p0, Ld4/b;->b:Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_3

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/io/File;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-string v5, "."

    .line 37
    .line 38
    invoke-static {v4, v5}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v5, ".."

    .line 46
    .line 47
    invoke-static {v4, v5}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_1

    .line 58
    .line 59
    invoke-static {v2}, Lu3/g;->Y(Ljava/util/List;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Ljava/io/File;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {v4, v5}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_1

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    add-int/lit8 v3, v3, -0x1

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Ljava/lang/Comparable;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    invoke-direct {v0, v1, v2}, Ld4/b;-><init>(Ljava/io/File;Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method public static final F(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-static {p0}, Lb3/g;->y(Ljava/io/File;)Ld4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ld4/l;->E(Ld4/b;)Ld4/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, Ld4/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p1}, Lb3/g;->y(Ljava/io/File;)Ld4/b;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2}, Ld4/l;->E(Ld4/b;)Ld4/b;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, v2, Ld4/b;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, v0, Ld4/b;->a:Ljava/io/File;

    .line 22
    .line 23
    iget-object v2, v2, Ld4/b;->a:Ljava/io/File;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v2, 0x0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const/4 v6, 0x0

    .line 47
    :goto_0
    if-ge v6, v5, :cond_1

    .line 48
    .line 49
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-static {v7, v8}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_1

    .line 62
    .line 63
    add-int/lit8 v6, v6, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v7, v0, -0x1

    .line 72
    .line 73
    if-gt v6, v7, :cond_4

    .line 74
    .line 75
    :goto_1
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    check-cast v8, Ljava/io/File;

    .line 80
    .line 81
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    const-string v9, ".."

    .line 86
    .line 87
    invoke-static {v8, v9}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eqz v8, :cond_2

    .line 92
    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_2
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    if-eq v7, v6, :cond_3

    .line 99
    .line 100
    sget-char v8, Ljava/io/File;->separatorChar:C

    .line 101
    .line 102
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    :cond_3
    if-eq v7, v6, :cond_4

    .line 106
    .line 107
    add-int/lit8 v7, v7, -0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    if-ge v6, v4, :cond_b

    .line 111
    .line 112
    if-ge v6, v0, :cond_5

    .line 113
    .line 114
    sget-char v0, Ljava/io/File;->separatorChar:C

    .line 115
    .line 116
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    :cond_5
    if-ltz v6, :cond_a

    .line 120
    .line 121
    if-nez v6, :cond_6

    .line 122
    .line 123
    invoke-static {v1}, Lu3/g;->a0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    goto :goto_3

    .line 128
    :cond_6
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    sub-int/2addr v0, v6

    .line 133
    if-gtz v0, :cond_7

    .line 134
    .line 135
    sget-object v0, Lu3/o;->g:Lu3/o;

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    const/4 v2, 0x1

    .line 139
    if-ne v0, v2, :cond_8

    .line 140
    .line 141
    invoke-static {v1}, Lu3/g;->Y(Ljava/util/List;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Ly4/b;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    goto :goto_3

    .line 150
    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    :goto_2
    if-ge v6, v0, :cond_9

    .line 160
    .line 161
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    add-int/lit8 v6, v6, 0x1

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_9
    move-object v0, v2

    .line 172
    :goto_3
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 173
    .line 174
    const-string v2, "separator"

    .line 175
    .line 176
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v0, v5, v1}, Lu3/g;->W(Ljava/util/List;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_a
    const-string p0, "Requested element count "

    .line 184
    .line 185
    const-string p1, " is less than zero."

    .line 186
    .line 187
    invoke-static {v6, p0, p1}, Landroidx/emoji2/text/u;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 192
    .line 193
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p1

    .line 201
    :cond_b
    :goto_4
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    :goto_5
    if-eqz v2, :cond_c

    .line 206
    .line 207
    return-object v2

    .line 208
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    new-instance v1, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string v2, "this and base files have different roots: "

    .line 213
    .line 214
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string p0, " and "

    .line 221
    .line 222
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const/16 p0, 0x2e

    .line 229
    .line 230
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v0
.end method
