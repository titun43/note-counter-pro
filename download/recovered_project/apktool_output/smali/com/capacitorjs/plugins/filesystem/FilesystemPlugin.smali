.class public final Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;
.super Lcom/getcapacitor/Plugin;
.source "SourceFile"


# annotations
.annotation runtime Lcom/getcapacitor/annotation/CapacitorPlugin;
    name = "Filesystem"
    permissions = {
        .subannotation Lcom/getcapacitor/annotation/Permission;
            alias = "publicStorage"
            strings = {
                "android.permission.READ_EXTERNAL_STORAGE",
                "android.permission.WRITE_EXTERNAL_STORAGE"
            }
        .end subannotation,
        .subannotation Lcom/getcapacitor/annotation/Permission;
            alias = "publicStorageAboveAPI29"
            strings = {
                "android.permission.READ_EXTERNAL_STORAGE"
            }
        .end subannotation
    }
.end annotation


# instance fields
.field private final controller$delegate:Lt3/b;

.field private final coroutineScope$delegate:Lt3/b;

.field private legacyImplementation:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/Plugin;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/activity/w;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Landroidx/activity/w;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lt3/f;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lt3/f;-><init>(Lf4/a;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->coroutineScope$delegate:Lt3/b;

    .line 16
    .line 17
    new-instance v0, Landroidx/activity/a0;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, v1}, Landroidx/activity/a0;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lt3/f;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lt3/f;-><init>(Lf4/a;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->controller$delegate:Lt3/b;

    .line 29
    .line 30
    return-void
.end method

.method public static final synthetic access$getController(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo3/k;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->getController()Lo3/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getCoroutineScope(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo4/t;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->getCoroutineScope()Lo4/t;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getLegacyImplementation$p(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->legacyImplementation:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$isStoragePermissionGranted(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Z)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->isStoragePermissionGranted(Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$requestAllPermissions(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/getcapacitor/PluginCall;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->requestAllPermissions(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$runWithPermission(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo3/k;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->controller_delegate$lambda$0(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo3/k;

    move-result-object p0

    return-object p0
.end method

.method private static final controller_delegate$lambda$0(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo3/k;
    .locals 2

    .line 1
    new-instance v0, Lo3/k;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "getApplicationContext(...)"

    .line 12
    .line 13
    invoke-static {p0, v1}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Lo3/k;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method private static final coroutineScope_delegate$lambda$0()Lo4/t;
    .locals 1

    .line 1
    sget-object v0, Lo4/e0;->a:Lv4/e;

    .line 2
    .line 3
    sget-object v0, Lt4/o;->a:Lp4/c;

    .line 4
    .line 5
    invoke-static {v0}, Lo4/w;->a(Lw3/h;)Lt4/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static synthetic d()Lo4/t;
    .locals 1

    .line 1
    invoke-static {}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->coroutineScope_delegate$lambda$0()Lo4/t;

    move-result-object v0

    return-object v0
.end method

.method private static final downloadFile$lambda$0(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "url"

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, v1, p0}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 13
    .line 14
    .line 15
    const-string p0, "bytes"

    .line 16
    .line 17
    invoke-virtual {v0, p0, p2}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/getcapacitor/JSObject;

    .line 18
    .line 19
    .line 20
    const-string p0, "contentLength"

    .line 21
    .line 22
    invoke-virtual {v0, p0, p3}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/getcapacitor/JSObject;

    .line 23
    .line 24
    .line 25
    const-string p0, "progress"

    .line 26
    .line 27
    invoke-virtual {p1, p0, v0}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic e(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->downloadFile$lambda$0(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method private final getController()Lo3/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->controller$delegate:Lt3/b;

    .line 2
    .line 3
    check-cast v0, Lt3/f;

    .line 4
    .line 5
    invoke-virtual {v0}, Lt3/f;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lo3/k;

    .line 10
    .line 11
    return-object v0
.end method

.method private final getCoroutineScope()Lo4/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->coroutineScope$delegate:Lt3/b;

    .line 2
    .line 3
    check-cast v0, Lt3/f;

    .line 4
    .line 5
    invoke-virtual {v0}, Lt3/f;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lo4/t;

    .line 10
    .line 11
    return-object v0
.end method

.method private final isStoragePermissionGranted(Z)Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    const/16 v1, 0x1e

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-lt v0, v1, :cond_3

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    const-string p1, "publicStorageAboveAPI29"

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/getcapacitor/Plugin;->getPermissionState(Ljava/lang/String;)Lcom/getcapacitor/PermissionState;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, Lcom/getcapacitor/PermissionState;->GRANTED:Lcom/getcapacitor/PermissionState;

    .line 23
    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return v3

    .line 28
    :cond_2
    :goto_0
    return v2

    .line 29
    :cond_3
    const-string p1, "publicStorage"

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/getcapacitor/Plugin;->getPermissionState(Ljava/lang/String;)Lcom/getcapacitor/PermissionState;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object v0, Lcom/getcapacitor/PermissionState;->GRANTED:Lcom/getcapacitor/PermissionState;

    .line 36
    .line 37
    if-ne p1, v0, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    return v3
.end method

.method private final permissionCallback(Lcom/getcapacitor/PluginCall;)V
    .locals 2
    .annotation runtime Lcom/getcapacitor/annotation/PermissionCallback;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->isStoragePermissionGranted(Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getLogTag()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "User denied storage permission"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/getcapacitor/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->getFilePermissionsDenied()Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_d

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    sparse-switch v1, :sswitch_data_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :sswitch_0
    const-string v1, "deleteFile"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_1
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->deleteFile(Lcom/getcapacitor/PluginCall;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :sswitch_1
    const-string v1, "downloadFile"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    goto/16 :goto_0

    .line 65
    .line 66
    :cond_2
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->downloadFile(Lcom/getcapacitor/PluginCall;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :sswitch_2
    const-string v1, "readdir"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_3

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :cond_3
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->readdir(Lcom/getcapacitor/PluginCall;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :sswitch_3
    const-string v1, "readFileInChunks"

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :cond_4
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->readFileInChunks(Lcom/getcapacitor/PluginCall;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :sswitch_4
    const-string v1, "rmdir"

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    goto/16 :goto_0

    .line 107
    .line 108
    :cond_5
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->rmdir(Lcom/getcapacitor/PluginCall;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :sswitch_5
    const-string v1, "mkdir"

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_6

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_6
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->mkdir(Lcom/getcapacitor/PluginCall;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :sswitch_6
    const-string v1, "stat"

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_7

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_7
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->stat(Lcom/getcapacitor/PluginCall;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :sswitch_7
    const-string v1, "copy"

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_8

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_8
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->copy(Lcom/getcapacitor/PluginCall;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :sswitch_8
    const-string v1, "readFile"

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_9

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_9
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->readFile(Lcom/getcapacitor/PluginCall;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :sswitch_9
    const-string v1, "rename"

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_a

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_a
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->rename(Lcom/getcapacitor/PluginCall;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :sswitch_a
    const-string v1, "getUri"

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_b

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_b
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->getUri(Lcom/getcapacitor/PluginCall;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :sswitch_b
    const-string v1, "writeFile"

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_c

    .line 197
    .line 198
    goto :goto_0

    .line 199
    :sswitch_c
    const-string v1, "appendFile"

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-nez v0, :cond_c

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_c
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->writeFile(Lcom/getcapacitor/PluginCall;)V

    .line 209
    .line 210
    .line 211
    :cond_d
    :goto_0
    return-void

    .line 212
    nop

    .line 213
    :sswitch_data_0
    .sparse-switch
        -0x7f8ae44a -> :sswitch_c
        -0x53d94605 -> :sswitch_b
        -0x4a7789ca -> :sswitch_a
        -0x37b4c8c2 -> :sswitch_9
        -0x33bbf7ce -> :sswitch_8
        0x2eaf75 -> :sswitch_7
        0x360654 -> :sswitch_6
        0x6322a2f -> :sswitch_5
        0x6798872 -> :sswitch_4
        0x33820f7d -> :sswitch_3
        0x4065bb37 -> :sswitch_2
        0x4214ae24 -> :sswitch_1
        0x692721c7 -> :sswitch_0
    .end sparse-switch
.end method

.method private final runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr3/g0;",
            "Lcom/getcapacitor/PluginCall;",
            "Lf4/p;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->getCoroutineScope()Lo4/t;

    move-result-object v0

    new-instance v1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;Lw3/c;)V

    invoke-static {v0, v1}, Lo4/w;->i(Lo4/t;Lf4/p;)Lo4/z;

    return-void
.end method

.method private final runWithPermission(Lr3/g0;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/q;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr3/g0;",
            "Lr3/g0;",
            "Lcom/getcapacitor/PluginCall;",
            "Lf4/q;",
            ")V"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/q;Lw3/c;)V

    invoke-direct {p0, p1, v3, v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    return-void
.end method


# virtual methods
.method public final appendFile(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getData()Lcom/getcapacitor/JSObject;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "append"

    .line 11
    .line 12
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->writeFile(Lcom/getcapacitor/PluginCall;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception v0

    .line 22
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getLogTag()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "Tried to set `append` in `PluginCall`, but got exception"

    .line 27
    .line 28
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 29
    .line 30
    .line 31
    sget-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "getMethodName(...)"

    .line 38
    .line 39
    invoke-static {v2, v3}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    const-string v0, ""

    .line 49
    .line 50
    :cond_0
    invoke-virtual {v1, v2, v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->operationFailed(Ljava/lang/String;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public checkPermissions(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->isStoragePermissionGranted(Z)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lcom/getcapacitor/JSObject;

    .line 14
    .line 15
    invoke-direct {v1}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "publicStorage"

    .line 19
    .line 20
    const-string v3, "granted"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {p1, v1, v0, v2, v3}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendSuccess$default(Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/JSObject;ZILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-super {p0, p1}, Lcom/getcapacitor/Plugin;->checkPermissions(Lcom/getcapacitor/PluginCall;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final copy(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getDoubleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/DoubleUri;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/filesystem/DoubleUri;->getFromUri()Lr3/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/filesystem/DoubleUri;->getToUri()Lr3/g0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v2, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v2, p0, p1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v1, v0, p1, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/q;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final deleteFile(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getSingleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lr3/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, p0, p1, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0, p1, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final downloadFile(Lcom/getcapacitor/PluginCall;)V
    .locals 5
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v0, "directory"

    .line 7
    .line 8
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->legacyImplementation:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->isPublicDirectory(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->isStoragePermissionGranted(Z)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    const-string v0, "permissionCallback"

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Lcom/getcapacitor/Plugin;->requestAllPermissions(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v1, La2/c;

    .line 41
    .line 42
    invoke-direct {v1, p1, p0}, La2/c;-><init>(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->legacyImplementation:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    iget-object v3, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 50
    .line 51
    const-string v4, "bridge"

    .line 52
    .line 53
    invoke-static {v3, v4}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$downloadFile$1;

    .line 57
    .line 58
    invoke-direct {v4, p0, v0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$downloadFile$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p1, v3, v1, v4}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->downloadFile(Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void

    .line 65
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v3, "Error downloading file: "

    .line 72
    .line 73
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final getUri(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getSingleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lr3/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-direct {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->getCoroutineScope()Lo4/t;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$getUri$1;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v2, p0, v0, p1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$getUri$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lr3/g0;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Lo4/w;->i(Lo4/t;Lf4/p;)Lo4/z;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public handleOnDestroy()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/getcapacitor/Plugin;->handleOnDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->getCoroutineScope()Lo4/t;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Lo4/t;->k()Lw3/h;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lo4/s;->h:Lo4/s;

    .line 13
    .line 14
    invoke-interface {v1, v2}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lo4/r0;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-interface {v1, v0}, Lo4/r0;->b(Ljava/util/concurrent/CancellationException;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v3, "Scope cannot be cancelled because it does not have a job: "

    .line 32
    .line 33
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method

.method public load()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/getcapacitor/Plugin;->load()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "getContext(...)"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->legacyImplementation:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;

    .line 19
    .line 20
    return-void
.end method

.method public final mkdir(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getSingleUriWithRecursiveOptions(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/SingleUriWithRecursiveOptions;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/filesystem/SingleUriWithRecursiveOptions;->getUri()Lr3/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$mkdir$1;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v2, p0, v0, p1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$mkdir$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/capacitorjs/plugins/filesystem/SingleUriWithRecursiveOptions;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v1, p1, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final readFile(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getReadFileOptions(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->getUri()Lr3/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFile$1;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v2, p0, v0, p1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFile$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v1, p1, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final readFileInChunks(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
        returnType = "callback"
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getReadFileInChunksOptions(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;->getUri()Lr3/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v2, p0, v0, p1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v1, p1, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final readdir(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getSingleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lr3/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readdir$1;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, p0, p1, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readdir$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0, p1, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final rename(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getDoubleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/DoubleUri;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/filesystem/DoubleUri;->getFromUri()Lr3/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/filesystem/DoubleUri;->getToUri()Lr3/g0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v2, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$rename$1;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v2, p0, p1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$rename$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v1, v0, p1, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/q;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public requestPermissions(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->isStoragePermissionGranted(Z)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lcom/getcapacitor/JSObject;

    .line 14
    .line 15
    invoke-direct {v1}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "publicStorage"

    .line 19
    .line 20
    const-string v3, "granted"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {p1, v1, v0, v2, v3}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendSuccess$default(Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/JSObject;ZILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-super {p0, p1}, Lcom/getcapacitor/Plugin;->requestPermissions(Lcom/getcapacitor/PluginCall;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final rmdir(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getSingleUriWithRecursiveOptions(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/SingleUriWithRecursiveOptions;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/filesystem/SingleUriWithRecursiveOptions;->getUri()Lr3/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$rmdir$1;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v2, p0, v0, p1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$rmdir$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/capacitorjs/plugins/filesystem/SingleUriWithRecursiveOptions;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v1, p1, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final stat(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getSingleIONFILEUri(Lcom/getcapacitor/PluginCall;)Lr3/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$stat$1;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, p0, p1, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$stat$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0, p1, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final writeFile(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodOptionsKt;->getWriteFileOptions(Lcom/getcapacitor/PluginCall;)Lcom/capacitorjs/plugins/filesystem/WriteFileOptions;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getMethodName(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/filesystem/WriteFileOptions;->getUri()Lr3/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$writeFile$1;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v2, p0, v0, p1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$writeFile$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/capacitorjs/plugins/filesystem/WriteFileOptions;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v1, p1, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
