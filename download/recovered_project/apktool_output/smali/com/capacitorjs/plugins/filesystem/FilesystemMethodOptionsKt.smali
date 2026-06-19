.class public final Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INPUT_APPEND:Ljava/lang/String; = "append"

.field private static final INPUT_CHUNK_SIZE:Ljava/lang/String; = "chunkSize"

.field private static final INPUT_DATA:Ljava/lang/String; = "data"

.field private static final INPUT_DIRECTORY:Ljava/lang/String; = "directory"

.field private static final INPUT_ENCODING:Ljava/lang/String; = "encoding"

.field private static final INPUT_FROM:Ljava/lang/String; = "from"

.field private static final INPUT_FROM_DIRECTORY:Ljava/lang/String; = "directory"

.field private static final INPUT_LENGTH:Ljava/lang/String; = "length"

.field private static final INPUT_OFFSET:Ljava/lang/String; = "offset"

.field private static final INPUT_PATH:Ljava/lang/String; = "path"

.field private static final INPUT_RECURSIVE:Ljava/lang/String; = "recursive"

.field private static final INPUT_TO:Ljava/lang/String; = "to"

.field private static final INPUT_TO_DIRECTORY:Ljava/lang/String; = "toDirectory"


# direct methods
.method public static final getDoubleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/DoubleUri;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "from"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v1, Lr3/x;->i:Lt2/i;

    .line 16
    .line 17
    const-string v2, "directory"

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lt2/i;->p(Ljava/lang/String;)Lr3/x;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "to"

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    :goto_0
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :cond_1
    const-string v3, "toDirectory"

    .line 41
    .line 42
    invoke-virtual {p0, v3}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    invoke-static {p0}, Lt2/i;->p(Ljava/lang/String;)Lr3/x;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    :cond_2
    move-object p0, v1

    .line 55
    :cond_3
    new-instance v3, Lcom/capacitorjs/plugins/filesystem/DoubleUri;

    .line 56
    .line 57
    new-instance v4, Lr3/g0;

    .line 58
    .line 59
    invoke-direct {v4, v1, v0}, Lr3/g0;-><init>(Lr3/x;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Lr3/g0;

    .line 63
    .line 64
    invoke-direct {v0, p0, v2}, Lr3/g0;-><init>(Lr3/x;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v3, v4, v0}, Lcom/capacitorjs/plugins/filesystem/DoubleUri;-><init>(Lr3/g0;Lr3/g0;)V

    .line 68
    .line 69
    .line 70
    return-object v3
.end method

.method private static final getOffsetAndLength(Lcom/getcapacitor/PluginCall;)Lt3/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            ")",
            "Lt3/c;"
        }
    .end annotation

    .line 1
    const-string v0, "offset"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/getcapacitor/PluginCall;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ltz v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v2, "length"

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Lcom/getcapacitor/PluginCall;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-lez v2, :cond_2

    .line 43
    .line 44
    move-object v1, p0

    .line 45
    :cond_2
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    const p0, 0x7fffffff

    .line 53
    .line 54
    .line 55
    :goto_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v1, Lt3/c;

    .line 60
    .line 61
    invoke-direct {v1, v0, p0}, Lt3/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-object v1
.end method

.method public static final getReadFileInChunksOptions(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getSingleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lr3/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    sget-object v2, Lr3/e;->a:Lr3/d;

    .line 15
    .line 16
    const-string v2, "encoding"

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Lz2/b;->h(Ljava/lang/String;)Lr3/e;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "chunkSize"

    .line 27
    .line 28
    invoke-virtual {p0, v3}, Lcom/getcapacitor/PluginCall;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-lez v4, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v3, v1

    .line 42
    :goto_0
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-static {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getOffsetAndLength(Lcom/getcapacitor/PluginCall;)Lt3/c;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance v3, Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;

    .line 53
    .line 54
    new-instance v4, Lr3/z;

    .line 55
    .line 56
    iget-object v5, p0, Lt3/c;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    iget-object p0, p0, Lt3/c;->h:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-direct {v4, v2, v1, v5, p0}, Lr3/z;-><init>(Lr3/e;III)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v3, v0, v4}, Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;-><init>(Lr3/g0;Lr3/z;)V

    .line 76
    .line 77
    .line 78
    return-object v3

    .line 79
    :cond_2
    :goto_1
    return-object v1
.end method

.method public static final getReadFileOptions(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getSingleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lr3/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v1, Lr3/e;->a:Lr3/d;

    .line 15
    .line 16
    const-string v1, "encoding"

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Lz2/b;->h(Ljava/lang/String;)Lr3/e;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getOffsetAndLength(Lcom/getcapacitor/PluginCall;)Lt3/c;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance v2, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;

    .line 31
    .line 32
    new-instance v3, Lr3/a0;

    .line 33
    .line 34
    iget-object v4, p0, Lt3/c;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    iget-object p0, p0, Lt3/c;->h:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-direct {v3, v1, v4, p0}, Lr3/a0;-><init>(Lr3/e;II)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, v0, v3}, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;-><init>(Lr3/g0;Lr3/a0;)V

    .line 54
    .line 55
    .line 56
    return-object v2
.end method

.method public static final getSingleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lr3/g0;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string v1, "directory"

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {v0, p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->unresolvedUri(Ljava/lang/String;Ljava/lang/String;)Lr3/g0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final getSingleUriWithRecursiveOptions(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/SingleUriWithRecursiveOptions;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getSingleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lr3/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v1, "recursive"

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    :goto_0
    new-instance v1, Lcom/capacitorjs/plugins/filesystem/SingleUriWithRecursiveOptions;

    .line 29
    .line 30
    invoke-direct {v1, v0, p0}, Lcom/capacitorjs/plugins/filesystem/SingleUriWithRecursiveOptions;-><init>(Lr3/g0;Z)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method public static final getWriteFileOptions(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/WriteFileOptions;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getSingleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lr3/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v1, "data"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string v2, "recursive"

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v2, v3

    .line 38
    :goto_1
    const-string v4, "append"

    .line 39
    .line 40
    invoke-virtual {p0, v4}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    :cond_3
    if-eqz v3, :cond_4

    .line 51
    .line 52
    sget-object v3, Lr3/b0;->h:Lr3/b0;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    sget-object v3, Lr3/b0;->g:Lr3/b0;

    .line 56
    .line 57
    :goto_2
    sget-object v4, Lr3/e;->a:Lr3/d;

    .line 58
    .line 59
    const-string v4, "encoding"

    .line 60
    .line 61
    invoke-virtual {p0, v4}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, Lz2/b;->h(Ljava/lang/String;)Lr3/e;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance v4, Lcom/capacitorjs/plugins/filesystem/WriteFileOptions;

    .line 70
    .line 71
    new-instance v5, Lr3/c0;

    .line 72
    .line 73
    invoke-direct {v5, v1, p0, v3, v2}, Lr3/c0;-><init>(Ljava/lang/String;Lr3/e;Lr3/b0;Z)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v4, v0, v5}, Lcom/capacitorjs/plugins/filesystem/WriteFileOptions;-><init>(Lr3/g0;Lr3/c0;)V

    .line 77
    .line 78
    .line 79
    return-object v4
.end method

.method private static final unresolvedUri(Ljava/lang/String;Ljava/lang/String;)Lr3/g0;
    .locals 2

    .line 1
    new-instance v0, Lr3/g0;

    .line 2
    .line 3
    sget-object v1, Lr3/x;->i:Lt2/i;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lt2/i;->p(Ljava/lang/String;)Lr3/x;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p1, p0}, Lr3/g0;-><init>(Lr3/x;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
