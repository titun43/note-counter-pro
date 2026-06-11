.class public final Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->context:Landroid/content/Context;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;Ljava/lang/String;Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;Landroid/os/Handler;Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;)Lt3/h;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->downloadFile$lambda$0(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;Ljava/lang/String;Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;Landroid/os/Handler;Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;)Lt3/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->downloadFile$lambda$0$1(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic c(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->downloadFile$lambda$0$0(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method private final doDownloadInBackground(Ljava/lang/String;Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;)Lcom/getcapacitor/JSObject;
    .locals 21

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    new-instance v2, Lcom/getcapacitor/JSObject;

    .line 6
    .line 7
    invoke-direct {v2}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "headers"

    .line 11
    .line 12
    invoke-virtual {v0, v3, v2}, Lcom/getcapacitor/PluginCall;->getObject(Ljava/lang/String;Lcom/getcapacitor/JSObject;)Lcom/getcapacitor/JSObject;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Lcom/getcapacitor/JSObject;

    .line 17
    .line 18
    invoke-direct {v3}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v4, "params"

    .line 22
    .line 23
    invoke-virtual {v0, v4, v3}, Lcom/getcapacitor/PluginCall;->getObject(Ljava/lang/String;Lcom/getcapacitor/JSObject;)Lcom/getcapacitor/JSObject;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "connectTimeout"

    .line 28
    .line 29
    invoke-virtual {v0, v4}, Lcom/getcapacitor/PluginCall;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const-string v5, "readTimeout"

    .line 34
    .line 35
    invoke-virtual {v0, v5}, Lcom/getcapacitor/PluginCall;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const-string v6, "disableRedirects"

    .line 40
    .line 41
    invoke-virtual {v0, v6}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const/4 v7, 0x0

    .line 46
    if-eqz v6, :cond_0

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v6, v7

    .line 54
    :goto_0
    const-string v8, "shouldEncodeUrlParams"

    .line 55
    .line 56
    invoke-virtual {v0, v8}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    if-eqz v8, :cond_1

    .line 61
    .line 62
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    const/4 v8, 0x1

    .line 68
    :goto_1
    const-string v9, "progress"

    .line 69
    .line 70
    invoke-virtual {v0, v9}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    if-eqz v9, :cond_2

    .line 75
    .line 76
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move v9, v7

    .line 82
    :goto_2
    const-string v10, "method"

    .line 83
    .line 84
    invoke-virtual {v0, v10}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    if-eqz v10, :cond_3

    .line 89
    .line 90
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 91
    .line 92
    invoke-virtual {v10, v11}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    const-string v11, "toUpperCase(...)"

    .line 97
    .line 98
    invoke-static {v10, v11}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    const-string v10, "GET"

    .line 103
    .line 104
    :goto_3
    const-string v11, "path"

    .line 105
    .line 106
    invoke-virtual {v0, v11}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    invoke-static {v12}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    const-string v13, "directory"

    .line 114
    .line 115
    sget-object v14, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v13, v14}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    new-instance v13, Ljava/net/URL;

    .line 122
    .line 123
    move-object/from16 v14, p1

    .line 124
    .line 125
    invoke-direct {v13, v14}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    move-object/from16 v14, p0

    .line 129
    .line 130
    invoke-direct {v14, v12, v0}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->getFileObject(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-instance v12, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 135
    .line 136
    invoke-direct {v12}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v13}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setUrl(Ljava/net/URL;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    invoke-virtual {v12, v10}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setMethod(Ljava/lang/String;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    invoke-virtual {v10, v2}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setHeaders(Lcom/getcapacitor/JSObject;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v2, v3, v8}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setUrlParams(Lcom/getcapacitor/JSObject;Z)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v2, v4}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setConnectTimeout(Ljava/lang/Integer;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v2, v5}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setReadTimeout(Ljava/lang/Integer;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v2, v3}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setDisableRedirects(Ljava/lang/Boolean;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v2}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->openConnection()Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v2}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->build()Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    move-object/from16 v3, p3

    .line 180
    .line 181
    invoke-virtual {v2, v3}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->setSSLSocketFactory(Lcom/getcapacitor/Bridge;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->getInputStream()Ljava/io/InputStream;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    new-instance v4, Ljava/io/FileOutputStream;

    .line 189
    .line 190
    invoke-direct {v4, v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 191
    .line 192
    .line 193
    const-string v5, "content-length"

    .line 194
    .line 195
    invoke-virtual {v2, v5}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    if-eqz v2, :cond_4

    .line 200
    .line 201
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 205
    goto :goto_4

    .line 206
    :catch_0
    :cond_4
    move v2, v7

    .line 207
    :goto_4
    const/16 v5, 0x400

    .line 208
    .line 209
    new-array v5, v5, [B

    .line 210
    .line 211
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 212
    .line 213
    .line 214
    move-result-wide v12

    .line 215
    move v6, v7

    .line 216
    :cond_5
    :goto_5
    invoke-virtual {v3, v5}, Ljava/io/InputStream;->read([B)I

    .line 217
    .line 218
    .line 219
    move-result v8

    .line 220
    if-lez v8, :cond_6

    .line 221
    .line 222
    invoke-virtual {v4, v5, v7, v8}, Ljava/io/FileOutputStream;->write([BII)V

    .line 223
    .line 224
    .line 225
    add-int/2addr v6, v8

    .line 226
    if-eqz v9, :cond_5

    .line 227
    .line 228
    if-eqz v1, :cond_5

    .line 229
    .line 230
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 231
    .line 232
    .line 233
    move-result-wide v15

    .line 234
    sub-long v17, v15, v12

    .line 235
    .line 236
    const-wide/16 v19, 0x64

    .line 237
    .line 238
    cmp-long v8, v17, v19

    .line 239
    .line 240
    if-lez v8, :cond_5

    .line 241
    .line 242
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    invoke-interface {v1, v8, v10}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;->emit(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 251
    .line 252
    .line 253
    move-wide v12, v15

    .line 254
    goto :goto_5

    .line 255
    :cond_6
    if-eqz v9, :cond_7

    .line 256
    .line 257
    if-eqz v1, :cond_7

    .line 258
    .line 259
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-interface {v1, v5, v2}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;->emit(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 268
    .line 269
    .line 270
    :cond_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 274
    .line 275
    .line 276
    new-instance v1, Lcom/getcapacitor/JSObject;

    .line 277
    .line 278
    invoke-direct {v1}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-static {v0}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v1, v11, v0}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 289
    .line 290
    .line 291
    return-object v1
.end method

.method private static final downloadFile$lambda$0(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;Ljava/lang/String;Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;Landroid/os/Handler;Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;)Lt3/h;
    .locals 0

    .line 1
    :try_start_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->doDownloadInBackground(Ljava/lang/String;Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;)Lcom/getcapacitor/JSObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance p1, La2/b;

    .line 6
    .line 7
    const/4 p2, 0x3

    .line 8
    invoke-direct {p1, p2, p6, p0}, La2/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p5, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    new-instance p1, La2/b;

    .line 17
    .line 18
    const/4 p2, 0x4

    .line 19
    invoke-direct {p1, p2, p6, p0}, La2/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p5, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object p0, Lt3/h;->a:Lt3/h;

    .line 26
    .line 27
    return-object p0
.end method

.method private static final downloadFile$lambda$0$0(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;->onSuccess(Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final downloadFile$lambda$0$1(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;->onError(Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getDirectory(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->context:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    sparse-switch v1, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :sswitch_0
    const-string v0, "EXTERNAL_STORAGE"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :sswitch_1
    const-string v1, "LIBRARY"

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :sswitch_2
    const-string v1, "CACHE"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :sswitch_3
    const-string v1, "DATA"

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :sswitch_4
    const-string v0, "DOCUMENTS"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    sget-object p1, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {p1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :sswitch_5
    const-string v1, "EXTERNAL"

    .line 79
    .line 80
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_4

    .line 85
    .line 86
    :cond_3
    :goto_0
    return-object v2

    .line 87
    :cond_4
    invoke-virtual {v0, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    nop

    .line 93
    :sswitch_data_0
    .sparse-switch
        -0x3de0ac35 -> :sswitch_5
        -0x21aa9d68 -> :sswitch_4
        0x1fe7aa -> :sswitch_3
        0x3ceb762 -> :sswitch_2
        0x34b3b09b -> :sswitch_1
        0x3c6bcde7 -> :sswitch_0
    .end sparse-switch
.end method

.method private final getFileObject(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "file"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/io/File;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    invoke-static {p2}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p2}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->getDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-nez p2, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    :cond_2
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/io/File;->mkdir()Z

    .line 53
    .line 54
    .line 55
    :cond_3
    new-instance v0, Ljava/io/File;

    .line 56
    .line 57
    invoke-direct {v0, p2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method


# virtual methods
.method public final downloadFile(Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;)V
    .locals 10

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "bridge"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "callback"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "url"

    .line 17
    .line 18
    const-string v1, ""

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    new-instance v8, Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {v8, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lcom/capacitorjs/plugins/filesystem/a;

    .line 34
    .line 35
    move-object v3, p0

    .line 36
    move-object v5, p1

    .line 37
    move-object v6, p2

    .line 38
    move-object v7, p3

    .line 39
    move-object v9, p4

    .line 40
    invoke-direct/range {v2 .. v9}, Lcom/capacitorjs/plugins/filesystem/a;-><init>(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;Ljava/lang/String;Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;Landroid/os/Handler;Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lv3/a;

    .line 44
    .line 45
    invoke-direct {p1, v2}, Lv3/a;-><init>(Lcom/capacitorjs/plugins/filesystem/a;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final isPublicDirectory(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "DOCUMENTS"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "EXTERNAL_STORAGE"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    return p1
.end method
