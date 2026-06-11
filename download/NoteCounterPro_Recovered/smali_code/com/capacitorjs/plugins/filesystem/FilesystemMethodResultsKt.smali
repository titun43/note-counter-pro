.class public final Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final OUTPUT_CREATED_TIME:Ljava/lang/String; = "ctime"

.field private static final OUTPUT_DATA:Ljava/lang/String; = "data"

.field private static final OUTPUT_FILES:Ljava/lang/String; = "files"

.field private static final OUTPUT_MODIFIED_TIME:Ljava/lang/String; = "mtime"

.field private static final OUTPUT_NAME:Ljava/lang/String; = "name"

.field private static final OUTPUT_SIZE:Ljava/lang/String; = "size"

.field private static final OUTPUT_TYPE:Ljava/lang/String; = "type"

.field private static final OUTPUT_URI:Ljava/lang/String; = "uri"


# direct methods
.method public static final createReadDirResultObject(Ljava/util/List;)Lcom/getcapacitor/JSObject;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lr3/y;",
            ">;)",
            "Lcom/getcapacitor/JSObject;"
        }
    .end annotation

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->OUTPUT_FILES:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {p0}, Lu3/i;->T(Ljava/lang/Iterable;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lr3/y;

    .line 37
    .line 38
    invoke-static {v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->toResultObject(Lr3/y;)Lcom/getcapacitor/JSObject;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance p0, Lcom/getcapacitor/JSArray;

    .line 47
    .line 48
    invoke-direct {p0, v2}, Lcom/getcapacitor/JSArray;-><init>(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, p0}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/getcapacitor/JSObject;

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public static final createReadResultObject(Ljava/lang/String;)Lcom/getcapacitor/JSObject;
    .locals 2

    .line 1
    const-string v0, "readData"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->OUTPUT_DATA:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final createUriResultObject(Landroid/net/Uri;)Lcom/getcapacitor/JSObject;
    .locals 2

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->OUTPUT_URI:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {v0, v1, p0}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public static final createWriteResultObject(Landroid/net/Uri;Lr3/b0;)Lcom/getcapacitor/JSObject;
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mode"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lr3/b0;->h:Lr3/b0;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-static {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->createUriResultObject(Landroid/net/Uri;)Lcom/getcapacitor/JSObject;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final toResultObject(Lr3/f0;)Lcom/getcapacitor/JSObject;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Lr3/f0;->C()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->createUriResultObject(Landroid/net/Uri;)Lcom/getcapacitor/JSObject;

    move-result-object p0

    return-object p0
.end method

.method public static final toResultObject(Lr3/y;)Lcom/getcapacitor/JSObject;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/getcapacitor/JSObject;

    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 2
    sget-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->OUTPUT_NAME:Ljava/lang/String;

    .line 3
    iget-object v2, p0, Lr3/y;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1, v2}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 5
    sget-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->OUTPUT_TYPE:Ljava/lang/String;

    .line 6
    iget-object v2, p0, Lr3/y;->e:La/a;

    .line 7
    instance-of v2, v2, Lr3/v;

    if-eqz v2, :cond_0

    const-string v2, "directory"

    goto :goto_0

    :cond_0
    const-string v2, "file"

    :goto_0
    invoke-virtual {v0, v1, v2}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 8
    sget-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->OUTPUT_SIZE:Ljava/lang/String;

    .line 9
    iget-wide v2, p0, Lr3/y;->d:J

    .line 10
    invoke-virtual {v0, v1, v2, v3}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;J)Lcom/getcapacitor/JSObject;

    .line 11
    sget-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->OUTPUT_MODIFIED_TIME:Ljava/lang/String;

    .line 12
    iget-wide v2, p0, Lr3/y;->g:J

    .line 13
    invoke-virtual {v0, v1, v2, v3}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;J)Lcom/getcapacitor/JSObject;

    .line 14
    sget-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->OUTPUT_CREATED_TIME:Ljava/lang/String;

    .line 15
    iget-object v2, p0, Lr3/y;->f:Ljava/lang/Long;

    .line 16
    invoke-virtual {v0, v1, v2}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/getcapacitor/JSObject;

    .line 17
    sget-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->OUTPUT_URI:Ljava/lang/String;

    .line 18
    iget-object p0, p0, Lr3/y;->c:Landroid/net/Uri;

    .line 19
    invoke-virtual {v0, v1, p0}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/getcapacitor/JSObject;

    return-object v0
.end method
