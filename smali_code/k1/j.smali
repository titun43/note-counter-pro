.class public Lk1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessageListenerBoundaryInterface;
.implements Landroidx/emoji2/text/k;
.implements Lcom/google/android/gms/common/internal/e;
.implements Lf0/e;
.implements Lj/y;
.implements Lk/a1;
.implements Lj/l;
.implements Lh2/b;
.implements Lf0/t;
.implements Lorg/apache/cordova/c0;
.implements Lorg/apache/cordova/g0;
.implements Ly0/d;
.implements Ld/b;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 5

    const/16 v0, 0xf

    iput v0, p0, Lk1/j;->g:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    .line 10
    invoke-static {v0}, Lb0/e;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    goto :goto_3

    .line 11
    :cond_0
    :try_start_0
    const-class v1, Landroid/os/Handler;

    const-class v2, Landroid/os/Looper;

    const-class v3, Landroid/os/Handler$Callback;

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 12
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    filled-new-array {v0, v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v0, v1

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_2

    :catch_3
    move-exception v1

    goto :goto_2

    .line 13
    :goto_1
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 14
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_2

    .line 15
    instance-of v1, v0, Ljava/lang/Error;

    if-eqz v1, :cond_1

    .line 16
    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 17
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 18
    :cond_2
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 19
    :goto_2
    const-string v2, "HandlerCompat"

    const-string v3, "Unable to invoke Handler(Looper, Callback, boolean) constructor"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 20
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    .line 21
    :goto_3
    iput-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk1/j;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk1/j;->g:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lk1/j;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 2

    const/16 v0, 0x8

    iput v0, p0, Lk1/j;->g:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 33
    new-instance v0, Lh0/f;

    invoke-direct {v0, p1, p2, p3}, Lh0/f;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    goto :goto_0

    .line 34
    :cond_0
    new-instance v0, Landroidx/emoji2/text/t;

    const/16 v1, 0xc

    invoke-direct {v0, p1, p2, p3, v1}, Landroidx/emoji2/text/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lk1/j;->g:I

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/g;->n(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, Lk1/j;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, Lk1/j;->g:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 24
    new-instance v0, Lf0/b0;

    const/4 v1, 0x5

    .line 25
    invoke-direct {v0, p1, v1}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    .line 26
    iput-object p1, v0, Lf0/b0;->i:Landroid/view/View;

    .line 27
    iput-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Lu1/f;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lk1/j;->g:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Landroidx/emoji2/text/p;

    invoke-direct {v0, p1}, Landroidx/emoji2/text/p;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lk1/j;->g:I

    iput-object p1, p0, Lk1/j;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/engine/SystemWebView;)V
    .locals 2

    const/16 v0, 0x16

    iput v0, p0, Lk1/j;->g:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 5
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    return-void
.end method

.method public static A(Le1/b;)Lg/m0;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 7
    .line 8
    .line 9
    new-instance v3, Lb1/a;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v9, 0x1

    .line 13
    const/4 v4, 0x1

    .line 14
    const-string v5, "work_spec_id"

    .line 15
    .line 16
    const-string v6, "TEXT"

    .line 17
    .line 18
    const/4 v8, 0x1

    .line 19
    invoke-direct/range {v3 .. v9}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 20
    .line 21
    .line 22
    const-string v4, "work_spec_id"

    .line 23
    .line 24
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    new-instance v5, Lb1/a;

    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v11, 0x1

    .line 31
    const/4 v6, 0x2

    .line 32
    const-string v7, "prerequisite_id"

    .line 33
    .line 34
    const-string v8, "TEXT"

    .line 35
    .line 36
    const/4 v10, 0x1

    .line 37
    invoke-direct/range {v5 .. v11}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 38
    .line 39
    .line 40
    const-string v3, "prerequisite_id"

    .line 41
    .line 42
    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    new-instance v5, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v5, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 48
    .line 49
    .line 50
    new-instance v6, Lb1/b;

    .line 51
    .line 52
    filled-new-array {v4}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    const-string v12, "id"

    .line 61
    .line 62
    filled-new-array {v12}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    const-string v7, "WorkSpec"

    .line 71
    .line 72
    const-string v8, "CASCADE"

    .line 73
    .line 74
    const-string v9, "CASCADE"

    .line 75
    .line 76
    invoke-direct/range {v6 .. v11}, Lb1/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    new-instance v13, Lb1/b;

    .line 83
    .line 84
    filled-new-array {v3}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v17

    .line 92
    filled-new-array {v12}, [Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v18

    .line 100
    const-string v14, "WorkSpec"

    .line 101
    .line 102
    const-string v15, "CASCADE"

    .line 103
    .line 104
    const-string v16, "CASCADE"

    .line 105
    .line 106
    invoke-direct/range {v13 .. v18}, Lb1/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    new-instance v6, Ljava/util/HashSet;

    .line 113
    .line 114
    invoke-direct {v6, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 115
    .line 116
    .line 117
    new-instance v7, Lb1/d;

    .line 118
    .line 119
    filled-new-array {v4}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    const-string v9, "index_Dependency_work_spec_id"

    .line 128
    .line 129
    const/4 v10, 0x0

    .line 130
    invoke-direct {v7, v8, v9, v10}, Lb1/d;-><init>(Ljava/util/List;Ljava/lang/String;Z)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    new-instance v7, Lb1/d;

    .line 137
    .line 138
    filled-new-array {v3}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    const-string v8, "index_Dependency_prerequisite_id"

    .line 147
    .line 148
    invoke-direct {v7, v3, v8, v10}, Lb1/d;-><init>(Ljava/util/List;Ljava/lang/String;Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    new-instance v3, Lb1/e;

    .line 155
    .line 156
    const-string v7, "Dependency"

    .line 157
    .line 158
    invoke-direct {v3, v7, v1, v5, v6}, Lb1/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashSet;Ljava/util/HashSet;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v0, v7}, Lb1/e;->a(Le1/b;Ljava/lang/String;)Lb1/e;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v3, v1}, Lb1/e;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    const-string v6, "\n Found:\n"

    .line 170
    .line 171
    if-nez v5, :cond_0

    .line 172
    .line 173
    new-instance v0, Lg/m0;

    .line 174
    .line 175
    new-instance v2, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v4, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n"

    .line 178
    .line 179
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-direct {v0, v1, v10}, Lg/m0;-><init>(Ljava/lang/String;Z)V

    .line 196
    .line 197
    .line 198
    return-object v0

    .line 199
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    .line 200
    .line 201
    const/16 v3, 0x19

    .line 202
    .line 203
    invoke-direct {v1, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 204
    .line 205
    .line 206
    new-instance v13, Lb1/a;

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const/16 v19, 0x1

    .line 211
    .line 212
    const/16 v18, 0x1

    .line 213
    .line 214
    const/4 v14, 0x1

    .line 215
    const-string v15, "id"

    .line 216
    .line 217
    const-string v16, "TEXT"

    .line 218
    .line 219
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    new-instance v14, Lb1/a;

    .line 226
    .line 227
    const/16 v18, 0x0

    .line 228
    .line 229
    const/16 v20, 0x1

    .line 230
    .line 231
    const/4 v15, 0x0

    .line 232
    const-string v16, "state"

    .line 233
    .line 234
    const-string v17, "INTEGER"

    .line 235
    .line 236
    invoke-direct/range {v14 .. v20}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 237
    .line 238
    .line 239
    const-string v3, "state"

    .line 240
    .line 241
    invoke-virtual {v1, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    new-instance v15, Lb1/a;

    .line 245
    .line 246
    const/16 v19, 0x0

    .line 247
    .line 248
    const/16 v21, 0x1

    .line 249
    .line 250
    const/16 v16, 0x0

    .line 251
    .line 252
    const-string v17, "worker_class_name"

    .line 253
    .line 254
    const-string v18, "TEXT"

    .line 255
    .line 256
    invoke-direct/range {v15 .. v21}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 257
    .line 258
    .line 259
    const-string v3, "worker_class_name"

    .line 260
    .line 261
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    new-instance v16, Lb1/a;

    .line 265
    .line 266
    const/16 v20, 0x0

    .line 267
    .line 268
    const/16 v22, 0x1

    .line 269
    .line 270
    const/16 v21, 0x0

    .line 271
    .line 272
    const/16 v17, 0x0

    .line 273
    .line 274
    const-string v18, "input_merger_class_name"

    .line 275
    .line 276
    const-string v19, "TEXT"

    .line 277
    .line 278
    invoke-direct/range {v16 .. v22}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 279
    .line 280
    .line 281
    move-object/from16 v3, v16

    .line 282
    .line 283
    const-string v5, "input_merger_class_name"

    .line 284
    .line 285
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    new-instance v13, Lb1/a;

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const/16 v19, 0x1

    .line 293
    .line 294
    const/16 v18, 0x1

    .line 295
    .line 296
    const/4 v14, 0x0

    .line 297
    const-string v15, "input"

    .line 298
    .line 299
    const-string v16, "BLOB"

    .line 300
    .line 301
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 302
    .line 303
    .line 304
    const-string v3, "input"

    .line 305
    .line 306
    invoke-virtual {v1, v3, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    new-instance v14, Lb1/a;

    .line 310
    .line 311
    const/16 v18, 0x0

    .line 312
    .line 313
    const/16 v20, 0x1

    .line 314
    .line 315
    const/4 v15, 0x0

    .line 316
    const-string v16, "output"

    .line 317
    .line 318
    const-string v17, "BLOB"

    .line 319
    .line 320
    invoke-direct/range {v14 .. v20}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 321
    .line 322
    .line 323
    const-string v3, "output"

    .line 324
    .line 325
    invoke-virtual {v1, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    new-instance v15, Lb1/a;

    .line 329
    .line 330
    const/16 v19, 0x0

    .line 331
    .line 332
    const/16 v21, 0x1

    .line 333
    .line 334
    const/16 v16, 0x0

    .line 335
    .line 336
    const-string v17, "initial_delay"

    .line 337
    .line 338
    const-string v18, "INTEGER"

    .line 339
    .line 340
    invoke-direct/range {v15 .. v21}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 341
    .line 342
    .line 343
    const-string v3, "initial_delay"

    .line 344
    .line 345
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    new-instance v16, Lb1/a;

    .line 349
    .line 350
    const/16 v20, 0x0

    .line 351
    .line 352
    const/16 v17, 0x0

    .line 353
    .line 354
    const-string v18, "interval_duration"

    .line 355
    .line 356
    const-string v19, "INTEGER"

    .line 357
    .line 358
    invoke-direct/range {v16 .. v22}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 359
    .line 360
    .line 361
    move-object/from16 v3, v16

    .line 362
    .line 363
    const-string v5, "interval_duration"

    .line 364
    .line 365
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    new-instance v13, Lb1/a;

    .line 369
    .line 370
    const/16 v17, 0x0

    .line 371
    .line 372
    const/16 v19, 0x1

    .line 373
    .line 374
    const/16 v18, 0x1

    .line 375
    .line 376
    const/4 v14, 0x0

    .line 377
    const-string v15, "flex_duration"

    .line 378
    .line 379
    const-string v16, "INTEGER"

    .line 380
    .line 381
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 382
    .line 383
    .line 384
    const-string v3, "flex_duration"

    .line 385
    .line 386
    invoke-virtual {v1, v3, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    new-instance v14, Lb1/a;

    .line 390
    .line 391
    const/16 v18, 0x0

    .line 392
    .line 393
    const/16 v20, 0x1

    .line 394
    .line 395
    const/4 v15, 0x0

    .line 396
    const-string v16, "run_attempt_count"

    .line 397
    .line 398
    const-string v17, "INTEGER"

    .line 399
    .line 400
    invoke-direct/range {v14 .. v20}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 401
    .line 402
    .line 403
    const-string v3, "run_attempt_count"

    .line 404
    .line 405
    invoke-virtual {v1, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    new-instance v15, Lb1/a;

    .line 409
    .line 410
    const/16 v19, 0x0

    .line 411
    .line 412
    const/16 v16, 0x0

    .line 413
    .line 414
    const-string v17, "backoff_policy"

    .line 415
    .line 416
    const-string v18, "INTEGER"

    .line 417
    .line 418
    invoke-direct/range {v15 .. v21}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 419
    .line 420
    .line 421
    const-string v3, "backoff_policy"

    .line 422
    .line 423
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    new-instance v16, Lb1/a;

    .line 427
    .line 428
    const/16 v20, 0x0

    .line 429
    .line 430
    const/16 v17, 0x0

    .line 431
    .line 432
    const-string v18, "backoff_delay_duration"

    .line 433
    .line 434
    const-string v19, "INTEGER"

    .line 435
    .line 436
    invoke-direct/range {v16 .. v22}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 437
    .line 438
    .line 439
    move-object/from16 v3, v16

    .line 440
    .line 441
    const-string v5, "backoff_delay_duration"

    .line 442
    .line 443
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    new-instance v13, Lb1/a;

    .line 447
    .line 448
    const/16 v17, 0x0

    .line 449
    .line 450
    const/16 v19, 0x1

    .line 451
    .line 452
    const/16 v18, 0x1

    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    const-string v15, "period_start_time"

    .line 456
    .line 457
    const-string v16, "INTEGER"

    .line 458
    .line 459
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 460
    .line 461
    .line 462
    const-string v3, "period_start_time"

    .line 463
    .line 464
    invoke-virtual {v1, v3, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    new-instance v14, Lb1/a;

    .line 468
    .line 469
    const/16 v18, 0x0

    .line 470
    .line 471
    const/16 v20, 0x1

    .line 472
    .line 473
    const/4 v15, 0x0

    .line 474
    const-string v16, "minimum_retention_duration"

    .line 475
    .line 476
    const-string v17, "INTEGER"

    .line 477
    .line 478
    invoke-direct/range {v14 .. v20}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 479
    .line 480
    .line 481
    const-string v5, "minimum_retention_duration"

    .line 482
    .line 483
    invoke-virtual {v1, v5, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    new-instance v15, Lb1/a;

    .line 487
    .line 488
    const/16 v19, 0x0

    .line 489
    .line 490
    const/16 v16, 0x0

    .line 491
    .line 492
    const-string v17, "schedule_requested_at"

    .line 493
    .line 494
    const-string v18, "INTEGER"

    .line 495
    .line 496
    invoke-direct/range {v15 .. v21}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 497
    .line 498
    .line 499
    const-string v5, "schedule_requested_at"

    .line 500
    .line 501
    invoke-virtual {v1, v5, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    new-instance v16, Lb1/a;

    .line 505
    .line 506
    const/16 v20, 0x0

    .line 507
    .line 508
    const/16 v17, 0x0

    .line 509
    .line 510
    const-string v18, "run_in_foreground"

    .line 511
    .line 512
    const-string v19, "INTEGER"

    .line 513
    .line 514
    invoke-direct/range {v16 .. v22}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 515
    .line 516
    .line 517
    move-object/from16 v7, v16

    .line 518
    .line 519
    const-string v8, "run_in_foreground"

    .line 520
    .line 521
    invoke-virtual {v1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    new-instance v13, Lb1/a;

    .line 525
    .line 526
    const/16 v17, 0x0

    .line 527
    .line 528
    const/16 v19, 0x1

    .line 529
    .line 530
    const/16 v18, 0x1

    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const-string v15, "out_of_quota_policy"

    .line 534
    .line 535
    const-string v16, "INTEGER"

    .line 536
    .line 537
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 538
    .line 539
    .line 540
    const-string v7, "out_of_quota_policy"

    .line 541
    .line 542
    invoke-virtual {v1, v7, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    new-instance v14, Lb1/a;

    .line 546
    .line 547
    const/16 v18, 0x0

    .line 548
    .line 549
    const/16 v20, 0x1

    .line 550
    .line 551
    const/16 v19, 0x0

    .line 552
    .line 553
    const/4 v15, 0x0

    .line 554
    const-string v16, "required_network_type"

    .line 555
    .line 556
    const-string v17, "INTEGER"

    .line 557
    .line 558
    invoke-direct/range {v14 .. v20}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 559
    .line 560
    .line 561
    const-string v7, "required_network_type"

    .line 562
    .line 563
    invoke-virtual {v1, v7, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    new-instance v15, Lb1/a;

    .line 567
    .line 568
    const/16 v19, 0x0

    .line 569
    .line 570
    const/16 v16, 0x0

    .line 571
    .line 572
    const-string v17, "requires_charging"

    .line 573
    .line 574
    const-string v18, "INTEGER"

    .line 575
    .line 576
    invoke-direct/range {v15 .. v21}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 577
    .line 578
    .line 579
    const-string v7, "requires_charging"

    .line 580
    .line 581
    invoke-virtual {v1, v7, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    new-instance v16, Lb1/a;

    .line 585
    .line 586
    const/16 v20, 0x0

    .line 587
    .line 588
    const/16 v17, 0x0

    .line 589
    .line 590
    const-string v18, "requires_device_idle"

    .line 591
    .line 592
    const-string v19, "INTEGER"

    .line 593
    .line 594
    invoke-direct/range {v16 .. v22}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 595
    .line 596
    .line 597
    move-object/from16 v7, v16

    .line 598
    .line 599
    const-string v8, "requires_device_idle"

    .line 600
    .line 601
    invoke-virtual {v1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    new-instance v13, Lb1/a;

    .line 605
    .line 606
    const/16 v17, 0x0

    .line 607
    .line 608
    const/16 v19, 0x1

    .line 609
    .line 610
    const/16 v18, 0x1

    .line 611
    .line 612
    const/4 v14, 0x0

    .line 613
    const-string v15, "requires_battery_not_low"

    .line 614
    .line 615
    const-string v16, "INTEGER"

    .line 616
    .line 617
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 618
    .line 619
    .line 620
    const-string v7, "requires_battery_not_low"

    .line 621
    .line 622
    invoke-virtual {v1, v7, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    new-instance v14, Lb1/a;

    .line 626
    .line 627
    const/16 v18, 0x0

    .line 628
    .line 629
    const/16 v20, 0x1

    .line 630
    .line 631
    const/4 v15, 0x0

    .line 632
    const-string v16, "requires_storage_not_low"

    .line 633
    .line 634
    const-string v17, "INTEGER"

    .line 635
    .line 636
    invoke-direct/range {v14 .. v20}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 637
    .line 638
    .line 639
    const-string v7, "requires_storage_not_low"

    .line 640
    .line 641
    invoke-virtual {v1, v7, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    new-instance v15, Lb1/a;

    .line 645
    .line 646
    const/16 v19, 0x0

    .line 647
    .line 648
    const/16 v16, 0x0

    .line 649
    .line 650
    const-string v17, "trigger_content_update_delay"

    .line 651
    .line 652
    const-string v18, "INTEGER"

    .line 653
    .line 654
    invoke-direct/range {v15 .. v21}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 655
    .line 656
    .line 657
    const-string v7, "trigger_content_update_delay"

    .line 658
    .line 659
    invoke-virtual {v1, v7, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    new-instance v16, Lb1/a;

    .line 663
    .line 664
    const/16 v20, 0x0

    .line 665
    .line 666
    const/16 v17, 0x0

    .line 667
    .line 668
    const-string v18, "trigger_max_content_delay"

    .line 669
    .line 670
    const-string v19, "INTEGER"

    .line 671
    .line 672
    invoke-direct/range {v16 .. v22}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 673
    .line 674
    .line 675
    move-object/from16 v7, v16

    .line 676
    .line 677
    const-string v8, "trigger_max_content_delay"

    .line 678
    .line 679
    invoke-virtual {v1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    new-instance v13, Lb1/a;

    .line 683
    .line 684
    const/16 v17, 0x0

    .line 685
    .line 686
    const/16 v19, 0x1

    .line 687
    .line 688
    const/16 v18, 0x0

    .line 689
    .line 690
    const/4 v14, 0x0

    .line 691
    const-string v15, "content_uri_triggers"

    .line 692
    .line 693
    const-string v16, "BLOB"

    .line 694
    .line 695
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 696
    .line 697
    .line 698
    const-string v7, "content_uri_triggers"

    .line 699
    .line 700
    invoke-virtual {v1, v7, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    new-instance v7, Ljava/util/HashSet;

    .line 704
    .line 705
    invoke-direct {v7, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 706
    .line 707
    .line 708
    new-instance v8, Ljava/util/HashSet;

    .line 709
    .line 710
    invoke-direct {v8, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 711
    .line 712
    .line 713
    new-instance v9, Lb1/d;

    .line 714
    .line 715
    filled-new-array {v5}, [Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v5

    .line 719
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    const-string v11, "index_WorkSpec_schedule_requested_at"

    .line 724
    .line 725
    invoke-direct {v9, v5, v11, v10}, Lb1/d;-><init>(Ljava/util/List;Ljava/lang/String;Z)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v8, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    new-instance v5, Lb1/d;

    .line 732
    .line 733
    filled-new-array {v3}, [Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    const-string v9, "index_WorkSpec_period_start_time"

    .line 742
    .line 743
    invoke-direct {v5, v3, v9, v10}, Lb1/d;-><init>(Ljava/util/List;Ljava/lang/String;Z)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v8, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    new-instance v3, Lb1/e;

    .line 750
    .line 751
    const-string v5, "WorkSpec"

    .line 752
    .line 753
    invoke-direct {v3, v5, v1, v7, v8}, Lb1/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashSet;Ljava/util/HashSet;)V

    .line 754
    .line 755
    .line 756
    invoke-static {v0, v5}, Lb1/e;->a(Le1/b;Ljava/lang/String;)Lb1/e;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    invoke-virtual {v3, v1}, Lb1/e;->equals(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    move-result v5

    .line 764
    if-nez v5, :cond_1

    .line 765
    .line 766
    new-instance v0, Lg/m0;

    .line 767
    .line 768
    new-instance v2, Ljava/lang/StringBuilder;

    .line 769
    .line 770
    const-string v4, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n"

    .line 771
    .line 772
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    invoke-direct {v0, v1, v10}, Lg/m0;-><init>(Ljava/lang/String;Z)V

    .line 789
    .line 790
    .line 791
    return-object v0

    .line 792
    :cond_1
    new-instance v1, Ljava/util/HashMap;

    .line 793
    .line 794
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 795
    .line 796
    .line 797
    new-instance v13, Lb1/a;

    .line 798
    .line 799
    const/16 v17, 0x0

    .line 800
    .line 801
    const/16 v19, 0x1

    .line 802
    .line 803
    const/4 v14, 0x1

    .line 804
    const-string v15, "tag"

    .line 805
    .line 806
    const-string v16, "TEXT"

    .line 807
    .line 808
    const/16 v18, 0x1

    .line 809
    .line 810
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 811
    .line 812
    .line 813
    const-string v3, "tag"

    .line 814
    .line 815
    invoke-virtual {v1, v3, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    new-instance v14, Lb1/a;

    .line 819
    .line 820
    const/16 v18, 0x0

    .line 821
    .line 822
    const/16 v20, 0x1

    .line 823
    .line 824
    const/4 v15, 0x2

    .line 825
    const-string v16, "work_spec_id"

    .line 826
    .line 827
    const-string v17, "TEXT"

    .line 828
    .line 829
    invoke-direct/range {v14 .. v20}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1, v4, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    new-instance v3, Ljava/util/HashSet;

    .line 836
    .line 837
    const/4 v5, 0x1

    .line 838
    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 839
    .line 840
    .line 841
    new-instance v13, Lb1/b;

    .line 842
    .line 843
    filled-new-array {v4}, [Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v7

    .line 847
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 848
    .line 849
    .line 850
    move-result-object v17

    .line 851
    filled-new-array {v12}, [Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v7

    .line 855
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 856
    .line 857
    .line 858
    move-result-object v18

    .line 859
    const-string v14, "WorkSpec"

    .line 860
    .line 861
    const-string v15, "CASCADE"

    .line 862
    .line 863
    const-string v16, "CASCADE"

    .line 864
    .line 865
    invoke-direct/range {v13 .. v18}, Lb1/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v3, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 869
    .line 870
    .line 871
    new-instance v7, Ljava/util/HashSet;

    .line 872
    .line 873
    invoke-direct {v7, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 874
    .line 875
    .line 876
    new-instance v8, Lb1/d;

    .line 877
    .line 878
    filled-new-array {v4}, [Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v9

    .line 882
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 883
    .line 884
    .line 885
    move-result-object v9

    .line 886
    const-string v11, "index_WorkTag_work_spec_id"

    .line 887
    .line 888
    invoke-direct {v8, v9, v11, v10}, Lb1/d;-><init>(Ljava/util/List;Ljava/lang/String;Z)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    new-instance v8, Lb1/e;

    .line 895
    .line 896
    const-string v9, "WorkTag"

    .line 897
    .line 898
    invoke-direct {v8, v9, v1, v3, v7}, Lb1/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashSet;Ljava/util/HashSet;)V

    .line 899
    .line 900
    .line 901
    invoke-static {v0, v9}, Lb1/e;->a(Le1/b;Ljava/lang/String;)Lb1/e;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    invoke-virtual {v8, v1}, Lb1/e;->equals(Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    move-result v3

    .line 909
    if-nez v3, :cond_2

    .line 910
    .line 911
    new-instance v0, Lg/m0;

    .line 912
    .line 913
    new-instance v2, Ljava/lang/StringBuilder;

    .line 914
    .line 915
    const-string v3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n"

    .line 916
    .line 917
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    .line 925
    .line 926
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 927
    .line 928
    .line 929
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    invoke-direct {v0, v1, v10}, Lg/m0;-><init>(Ljava/lang/String;Z)V

    .line 934
    .line 935
    .line 936
    return-object v0

    .line 937
    :cond_2
    new-instance v1, Ljava/util/HashMap;

    .line 938
    .line 939
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 940
    .line 941
    .line 942
    new-instance v13, Lb1/a;

    .line 943
    .line 944
    const/16 v17, 0x0

    .line 945
    .line 946
    const/16 v19, 0x1

    .line 947
    .line 948
    const/4 v14, 0x1

    .line 949
    const-string v15, "work_spec_id"

    .line 950
    .line 951
    const-string v16, "TEXT"

    .line 952
    .line 953
    const/16 v18, 0x1

    .line 954
    .line 955
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v1, v4, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    new-instance v14, Lb1/a;

    .line 962
    .line 963
    const/16 v18, 0x0

    .line 964
    .line 965
    const/16 v20, 0x1

    .line 966
    .line 967
    const/4 v15, 0x0

    .line 968
    const-string v16, "system_id"

    .line 969
    .line 970
    const-string v17, "INTEGER"

    .line 971
    .line 972
    invoke-direct/range {v14 .. v20}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 973
    .line 974
    .line 975
    const-string v3, "system_id"

    .line 976
    .line 977
    invoke-virtual {v1, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    new-instance v3, Ljava/util/HashSet;

    .line 981
    .line 982
    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 983
    .line 984
    .line 985
    new-instance v13, Lb1/b;

    .line 986
    .line 987
    filled-new-array {v4}, [Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v7

    .line 991
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 992
    .line 993
    .line 994
    move-result-object v17

    .line 995
    filled-new-array {v12}, [Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v7

    .line 999
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v18

    .line 1003
    const-string v14, "WorkSpec"

    .line 1004
    .line 1005
    const-string v15, "CASCADE"

    .line 1006
    .line 1007
    const-string v16, "CASCADE"

    .line 1008
    .line 1009
    invoke-direct/range {v13 .. v18}, Lb1/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v3, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    new-instance v7, Ljava/util/HashSet;

    .line 1016
    .line 1017
    invoke-direct {v7, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 1018
    .line 1019
    .line 1020
    new-instance v8, Lb1/e;

    .line 1021
    .line 1022
    const-string v9, "SystemIdInfo"

    .line 1023
    .line 1024
    invoke-direct {v8, v9, v1, v3, v7}, Lb1/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashSet;Ljava/util/HashSet;)V

    .line 1025
    .line 1026
    .line 1027
    invoke-static {v0, v9}, Lb1/e;->a(Le1/b;Ljava/lang/String;)Lb1/e;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v1

    .line 1031
    invoke-virtual {v8, v1}, Lb1/e;->equals(Ljava/lang/Object;)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v3

    .line 1035
    if-nez v3, :cond_3

    .line 1036
    .line 1037
    new-instance v0, Lg/m0;

    .line 1038
    .line 1039
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1040
    .line 1041
    const-string v3, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n"

    .line 1042
    .line 1043
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    invoke-direct {v0, v1, v10}, Lg/m0;-><init>(Ljava/lang/String;Z)V

    .line 1060
    .line 1061
    .line 1062
    return-object v0

    .line 1063
    :cond_3
    new-instance v1, Ljava/util/HashMap;

    .line 1064
    .line 1065
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 1066
    .line 1067
    .line 1068
    new-instance v13, Lb1/a;

    .line 1069
    .line 1070
    const/16 v17, 0x0

    .line 1071
    .line 1072
    const/16 v19, 0x1

    .line 1073
    .line 1074
    const/4 v14, 0x1

    .line 1075
    const-string v15, "name"

    .line 1076
    .line 1077
    const-string v16, "TEXT"

    .line 1078
    .line 1079
    const/16 v18, 0x1

    .line 1080
    .line 1081
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 1082
    .line 1083
    .line 1084
    const-string v3, "name"

    .line 1085
    .line 1086
    invoke-virtual {v1, v3, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    new-instance v14, Lb1/a;

    .line 1090
    .line 1091
    const/16 v18, 0x0

    .line 1092
    .line 1093
    const/16 v20, 0x1

    .line 1094
    .line 1095
    const/4 v15, 0x2

    .line 1096
    const-string v16, "work_spec_id"

    .line 1097
    .line 1098
    const-string v17, "TEXT"

    .line 1099
    .line 1100
    invoke-direct/range {v14 .. v20}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v1, v4, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    new-instance v3, Ljava/util/HashSet;

    .line 1107
    .line 1108
    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 1109
    .line 1110
    .line 1111
    new-instance v13, Lb1/b;

    .line 1112
    .line 1113
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v7

    .line 1117
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v17

    .line 1121
    filled-new-array {v12}, [Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v7

    .line 1125
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v18

    .line 1129
    const-string v14, "WorkSpec"

    .line 1130
    .line 1131
    const-string v15, "CASCADE"

    .line 1132
    .line 1133
    const-string v16, "CASCADE"

    .line 1134
    .line 1135
    invoke-direct/range {v13 .. v18}, Lb1/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v3, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1139
    .line 1140
    .line 1141
    new-instance v7, Ljava/util/HashSet;

    .line 1142
    .line 1143
    invoke-direct {v7, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 1144
    .line 1145
    .line 1146
    new-instance v8, Lb1/d;

    .line 1147
    .line 1148
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v9

    .line 1152
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v9

    .line 1156
    const-string v11, "index_WorkName_work_spec_id"

    .line 1157
    .line 1158
    invoke-direct {v8, v9, v11, v10}, Lb1/d;-><init>(Ljava/util/List;Ljava/lang/String;Z)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1162
    .line 1163
    .line 1164
    new-instance v8, Lb1/e;

    .line 1165
    .line 1166
    const-string v9, "WorkName"

    .line 1167
    .line 1168
    invoke-direct {v8, v9, v1, v3, v7}, Lb1/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashSet;Ljava/util/HashSet;)V

    .line 1169
    .line 1170
    .line 1171
    invoke-static {v0, v9}, Lb1/e;->a(Le1/b;Ljava/lang/String;)Lb1/e;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v1

    .line 1175
    invoke-virtual {v8, v1}, Lb1/e;->equals(Ljava/lang/Object;)Z

    .line 1176
    .line 1177
    .line 1178
    move-result v3

    .line 1179
    if-nez v3, :cond_4

    .line 1180
    .line 1181
    new-instance v0, Lg/m0;

    .line 1182
    .line 1183
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1184
    .line 1185
    const-string v3, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n"

    .line 1186
    .line 1187
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v1

    .line 1203
    invoke-direct {v0, v1, v10}, Lg/m0;-><init>(Ljava/lang/String;Z)V

    .line 1204
    .line 1205
    .line 1206
    return-object v0

    .line 1207
    :cond_4
    new-instance v1, Ljava/util/HashMap;

    .line 1208
    .line 1209
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 1210
    .line 1211
    .line 1212
    new-instance v13, Lb1/a;

    .line 1213
    .line 1214
    const/16 v17, 0x0

    .line 1215
    .line 1216
    const/16 v19, 0x1

    .line 1217
    .line 1218
    const/4 v14, 0x1

    .line 1219
    const-string v15, "work_spec_id"

    .line 1220
    .line 1221
    const-string v16, "TEXT"

    .line 1222
    .line 1223
    const/16 v18, 0x1

    .line 1224
    .line 1225
    invoke-direct/range {v13 .. v19}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v1, v4, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    new-instance v14, Lb1/a;

    .line 1232
    .line 1233
    const/16 v18, 0x0

    .line 1234
    .line 1235
    const/16 v20, 0x1

    .line 1236
    .line 1237
    const/4 v15, 0x0

    .line 1238
    const-string v16, "progress"

    .line 1239
    .line 1240
    const-string v17, "BLOB"

    .line 1241
    .line 1242
    invoke-direct/range {v14 .. v20}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 1243
    .line 1244
    .line 1245
    const-string v3, "progress"

    .line 1246
    .line 1247
    invoke-virtual {v1, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    new-instance v3, Ljava/util/HashSet;

    .line 1251
    .line 1252
    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 1253
    .line 1254
    .line 1255
    new-instance v13, Lb1/b;

    .line 1256
    .line 1257
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v4

    .line 1261
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v17

    .line 1265
    filled-new-array {v12}, [Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v4

    .line 1269
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v18

    .line 1273
    const-string v14, "WorkSpec"

    .line 1274
    .line 1275
    const-string v15, "CASCADE"

    .line 1276
    .line 1277
    const-string v16, "CASCADE"

    .line 1278
    .line 1279
    invoke-direct/range {v13 .. v18}, Lb1/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v3, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1283
    .line 1284
    .line 1285
    new-instance v4, Ljava/util/HashSet;

    .line 1286
    .line 1287
    invoke-direct {v4, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 1288
    .line 1289
    .line 1290
    new-instance v7, Lb1/e;

    .line 1291
    .line 1292
    const-string v8, "WorkProgress"

    .line 1293
    .line 1294
    invoke-direct {v7, v8, v1, v3, v4}, Lb1/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashSet;Ljava/util/HashSet;)V

    .line 1295
    .line 1296
    .line 1297
    invoke-static {v0, v8}, Lb1/e;->a(Le1/b;Ljava/lang/String;)Lb1/e;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v1

    .line 1301
    invoke-virtual {v7, v1}, Lb1/e;->equals(Ljava/lang/Object;)Z

    .line 1302
    .line 1303
    .line 1304
    move-result v3

    .line 1305
    if-nez v3, :cond_5

    .line 1306
    .line 1307
    new-instance v0, Lg/m0;

    .line 1308
    .line 1309
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1310
    .line 1311
    const-string v3, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n"

    .line 1312
    .line 1313
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v1

    .line 1329
    invoke-direct {v0, v1, v10}, Lg/m0;-><init>(Ljava/lang/String;Z)V

    .line 1330
    .line 1331
    .line 1332
    return-object v0

    .line 1333
    :cond_5
    new-instance v1, Ljava/util/HashMap;

    .line 1334
    .line 1335
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 1336
    .line 1337
    .line 1338
    new-instance v11, Lb1/a;

    .line 1339
    .line 1340
    const/4 v15, 0x0

    .line 1341
    const/16 v17, 0x1

    .line 1342
    .line 1343
    const/4 v12, 0x1

    .line 1344
    const-string v13, "key"

    .line 1345
    .line 1346
    const-string v14, "TEXT"

    .line 1347
    .line 1348
    const/16 v16, 0x1

    .line 1349
    .line 1350
    invoke-direct/range {v11 .. v17}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 1351
    .line 1352
    .line 1353
    const-string v2, "key"

    .line 1354
    .line 1355
    invoke-virtual {v1, v2, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    new-instance v12, Lb1/a;

    .line 1359
    .line 1360
    const/16 v16, 0x0

    .line 1361
    .line 1362
    const/16 v18, 0x1

    .line 1363
    .line 1364
    const/4 v13, 0x0

    .line 1365
    const-string v14, "long_value"

    .line 1366
    .line 1367
    const-string v15, "INTEGER"

    .line 1368
    .line 1369
    const/16 v17, 0x0

    .line 1370
    .line 1371
    invoke-direct/range {v12 .. v18}, Lb1/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 1372
    .line 1373
    .line 1374
    const-string v2, "long_value"

    .line 1375
    .line 1376
    invoke-virtual {v1, v2, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1377
    .line 1378
    .line 1379
    new-instance v2, Ljava/util/HashSet;

    .line 1380
    .line 1381
    invoke-direct {v2, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 1382
    .line 1383
    .line 1384
    new-instance v3, Ljava/util/HashSet;

    .line 1385
    .line 1386
    invoke-direct {v3, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 1387
    .line 1388
    .line 1389
    new-instance v4, Lb1/e;

    .line 1390
    .line 1391
    const-string v7, "Preference"

    .line 1392
    .line 1393
    invoke-direct {v4, v7, v1, v2, v3}, Lb1/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashSet;Ljava/util/HashSet;)V

    .line 1394
    .line 1395
    .line 1396
    invoke-static {v0, v7}, Lb1/e;->a(Le1/b;Ljava/lang/String;)Lb1/e;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    invoke-virtual {v4, v0}, Lb1/e;->equals(Ljava/lang/Object;)Z

    .line 1401
    .line 1402
    .line 1403
    move-result v1

    .line 1404
    if-nez v1, :cond_6

    .line 1405
    .line 1406
    new-instance v1, Lg/m0;

    .line 1407
    .line 1408
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1409
    .line 1410
    const-string v3, "Preference(androidx.work.impl.model.Preference).\n Expected:\n"

    .line 1411
    .line 1412
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v0

    .line 1428
    invoke-direct {v1, v0, v10}, Lg/m0;-><init>(Ljava/lang/String;Z)V

    .line 1429
    .line 1430
    .line 1431
    return-object v1

    .line 1432
    :cond_6
    new-instance v0, Lg/m0;

    .line 1433
    .line 1434
    const/4 v1, 0x0

    .line 1435
    invoke-direct {v0, v1, v5}, Lg/m0;-><init>(Ljava/lang/String;Z)V

    .line 1436
    .line 1437
    .line 1438
    return-object v0
.end method

.method public static final q(Lk1/j;Landroid/database/Cursor;Landroid/net/Uri;)J
    .locals 2

    .line 1
    const-string v0, "_size"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "getString(...)"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Ln4/i;->a0(Ljava/lang/String;)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p1, v1

    .line 25
    :goto_0
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    return-wide p0

    .line 32
    :cond_1
    iget-object p0, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Landroid/content/ContentResolver;

    .line 35
    .line 36
    const-string p1, "r"

    .line 37
    .line 38
    invoke-virtual {p0, p2, p1}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    :try_start_0
    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 45
    .line 46
    .line 47
    move-result-wide p1

    .line 48
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    :catchall_1
    move-exception p2

    .line 59
    invoke-static {p0, p1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw p2

    .line 63
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 66
    .line 67
    .line 68
    move-result-wide p0

    .line 69
    return-wide p0

    .line 70
    :cond_3
    const-wide/16 p0, 0x0

    .line 71
    .line 72
    return-wide p0
.end method

.method public static final r(Lk1/j;Ljava/lang/Object;Landroid/net/Uri;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p2}, Lk1/j;->z(Ljava/lang/Throwable;Landroid/net/Uri;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    return-object p1
.end method

.method public static t(Le1/b;)V
    .locals 1

    .line 1
    const-string v0, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'c103703e120ae8cc73c9248622f3cd1e\')"

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Le1/b;->h(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static v(Landroid/database/Cursor;Ljava/util/List;)Ljava/lang/Integer;
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-ltz v0, :cond_1

    .line 27
    .line 28
    move-object v1, v2

    .line 29
    :cond_1
    if-eqz v1, :cond_0

    .line 30
    .line 31
    :cond_2
    return-object v1
.end method

.method public static w(Landroid/database/Cursor;)J
    .locals 2

    .line 1
    const-string v0, "datetaken"

    .line 2
    .line 3
    const-string v1, "date_added"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lu3/h;->S([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, Lk1/j;->v(Landroid/database/Cursor;Ljava/util/List;)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "getString(...)"

    .line 28
    .line 29
    invoke-static {p0, v0}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Ln4/i;->a0(Ljava/lang/String;)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    return-wide v0

    .line 43
    :cond_0
    const-wide/16 v0, 0x0

    .line 44
    .line 45
    return-wide v0
.end method

.method public static z(Ljava/lang/Throwable;Landroid/net/Uri;)Ljava/lang/Throwable;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/io/FileNotFoundException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lr3/o;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "toString(...)"

    .line 12
    .line 13
    invoke-static {p1, v1}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p1, p0}, Lr3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    instance-of p1, p0, Ljava/lang/UnsupportedOperationException;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    new-instance p1, Lr3/s;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    return-object p0
.end method


# virtual methods
.method public B(Landroid/net/Uri;Lr3/a0;Ly3/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lp3/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/f;

    .line 7
    .line 8
    iget v1, v0, Lp3/f;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lp3/f;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/f;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/f;-><init>(Lk1/j;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/f;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/f;->i:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object p3, Lo4/e0;->a:Lv4/e;

    .line 52
    .line 53
    sget-object p3, Lv4/d;->i:Lv4/d;

    .line 54
    .line 55
    new-instance v4, Lp3/b;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x1

    .line 59
    move-object v5, p0

    .line 60
    move-object v6, p1

    .line 61
    move-object v7, p2

    .line 62
    invoke-direct/range {v4 .. v9}, Lp3/b;-><init>(Lk1/j;Landroid/net/Uri;Ljava/lang/Object;Lw3/c;I)V

    .line 63
    .line 64
    .line 65
    iput v3, v0, Lp3/f;->i:I

    .line 66
    .line 67
    invoke-static {v4, p3, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    if-ne p3, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p3, Lt3/e;

    .line 75
    .line 76
    iget-object p1, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 77
    .line 78
    return-object p1
.end method

.method public a()Landroid/content/ClipData;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/g;->f(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public b(Lj/n;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Lj/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lj/f0;

    .line 7
    .line 8
    iget-object v0, v0, Lj/f0;->z:Lj/n;

    .line 9
    .line 10
    invoke-virtual {v0}, Lj/n;->k()Lj/n;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lj/n;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lk/l;

    .line 21
    .line 22
    iget-object v0, v0, Lk/l;->k:Lj/y;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Lj/y;->b(Lj/n;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/android/billingclient/api/ProxyBillingActivityV2;

    .line 4
    .line 5
    check-cast p1, Ld/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, Ld/a;->h:Landroid/content/Intent;

    .line 11
    .line 12
    const-string v2, "ProxyBillingActivityV2"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzf(Landroid/content/Intent;Ljava/lang/String;)Ly1/e;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget v3, v3, Ly1/e;->a:I

    .line 19
    .line 20
    iget-object v4, v0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->i:Landroid/os/ResultReceiver;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_0
    invoke-virtual {v4, v3, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget p1, p1, Ld/a;->g:I

    .line 36
    .line 37
    const/4 v1, -0x1

    .line 38
    if-ne p1, v1, :cond_2

    .line 39
    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v4, "Alternative billing only dialog finished with resultCode "

    .line 45
    .line 46
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, " and billing\'s responseCode: "

    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public d(Landroid/view/View;Lf0/q1;)Lf0/q1;
    .locals 4

    .line 1
    iget-object p1, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 4
    .line 5
    iget-object v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 6
    .line 7
    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_5

    .line 12
    .line 13
    iput-object p2, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 14
    .line 15
    invoke-virtual {p2}, Lf0/q1;->d()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    move v0, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v1

    .line 26
    :goto_0
    iput-boolean v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->s:Z

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v2, v1

    .line 38
    :goto_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p2, Lf0/q1;->a:Lf0/m1;

    .line 42
    .line 43
    invoke-virtual {v0}, Lf0/m1;->m()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    :goto_2
    if-ge v1, v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v3, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ls/d;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    :goto_3
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 81
    .line 82
    .line 83
    :cond_5
    return-object p2
.end method

.method public e()V
    .locals 2

    .line 1
    const-string v0, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 2
    .line 3
    const-string v1, "ProfileInstaller"

    .line 4
    .line 5
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(Lj/n;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->g:Landroidx/appcompat/widget/ActionMenuView;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/appcompat/widget/ActionMenuView;->z:Lk/l;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lk/l;->j()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->M:Lf0/m;

    .line 19
    .line 20
    iget-object v1, v1, Lf0/m;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lf0/o;

    .line 37
    .line 38
    check-cast v2, Landroidx/fragment/app/m0;

    .line 39
    .line 40
    iget-object v2, v2, Landroidx/fragment/app/m0;->a:Landroidx/fragment/app/u0;

    .line 41
    .line 42
    invoke-virtual {v2}, Landroidx/fragment/app/u0;->t()Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :goto_1
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->U:Lu1/f;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lu1/f;->f(Lj/n;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public g(Lj/n;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls3/a;

    .line 4
    .line 5
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/content/Context;

    .line 10
    .line 11
    sget v1, Lm2/j;->j:I

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    new-instance v2, Lm2/j;

    .line 22
    .line 23
    const-string v3, "com.google.android.datatransport.events"

    .line 24
    .line 25
    invoke-direct {v2, v0, v3, v1}, Lm2/j;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    return-object v2
.end method

.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "WEB_MESSAGE_LISTENER"

    .line 2
    .line 3
    const-string v1, "WEB_MESSAGE_ARRAY_BUFFER"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public h(ILjava/lang/Object;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p2, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public i(Lz2/b;)V
    .locals 8

    .line 1
    new-instance v7, Landroidx/emoji2/text/a;

    .line 2
    .line 3
    const-string v0, "EmojiCompatInitializer"

    .line 4
    .line 5
    invoke-direct {v7, v0}, Landroidx/emoji2/text/a;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 13
    .line 14
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    const-wide/16 v3, 0xf

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 26
    .line 27
    .line 28
    new-instance v1, La2/f;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1, v0, v2}, La2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public j(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public k(Lj/n;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk/l;

    .line 4
    .line 5
    iget-object v1, v0, Lk/l;->i:Lj/n;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move-object v1, p1

    .line 12
    check-cast v1, Lj/f0;

    .line 13
    .line 14
    iget-object v1, v1, Lj/f0;->A:Lj/p;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lk/l;->k:Lj/y;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1}, Lj/y;->k(Lj/n;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1
    return v2
.end method

.method public l()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/g;->e(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public m()Landroid/view/ContentInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    return-object v0
.end method

.method public n(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public o()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/g;->C(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public onPostMessage(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;Landroid/net/Uri;ZLjava/lang/reflect/InvocationHandler;)V
    .locals 7

    .line 1
    const-class v0, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    .line 2
    .line 3
    invoke-static {v0, p2}, Ly4/b;->f(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    .line 8
    .line 9
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;->getPorts()[Ljava/lang/reflect/InvocationHandler;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    array-length v1, v0

    .line 14
    new-array v1, v1, [Lk1/j;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    array-length v3, v0

    .line 18
    if-ge v2, v3, :cond_0

    .line 19
    .line 20
    new-instance v3, Lk1/j;

    .line 21
    .line 22
    aget-object v4, v0, v2

    .line 23
    .line 24
    const/16 v5, 0xe

    .line 25
    .line 26
    invoke-direct {v3, v5}, Lk1/j;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const-class v5, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    .line 30
    .line 31
    invoke-static {v5, v4}, Ly4/b;->f(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    .line 36
    .line 37
    iput-object v4, v3, Lk1/j;->h:Ljava/lang/Object;

    .line 38
    .line 39
    aput-object v3, v1, v2

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-object v0, Lk1/m;->a:Lk1/b;

    .line 45
    .line 46
    invoke-virtual {v0}, Lk1/c;->b()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    const-class v0, Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;

    .line 53
    .line 54
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;->getMessagePayload()Ljava/lang/reflect/InvocationHandler;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {v0, p2}, Ly4/b;->f(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    check-cast p2, Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;

    .line 63
    .line 64
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;->getType()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    if-eq v0, v1, :cond_1

    .line 72
    .line 73
    const/4 p2, 0x0

    .line 74
    move-object v3, p2

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    new-instance v0, Lj1/c;

    .line 77
    .line 78
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;->getAsArrayBuffer()[B

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-direct {v0, p2}, Lj1/c;-><init>([B)V

    .line 83
    .line 84
    .line 85
    :goto_1
    move-object v3, v0

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    new-instance v0, Lj1/c;

    .line 88
    .line 89
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;->getAsString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-direct {v0, p2}, Lj1/c;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    new-instance v0, Lj1/c;

    .line 98
    .line 99
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;->getData()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-direct {v0, p2}, Lj1/c;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :goto_2
    if-eqz v3, :cond_4

    .line 108
    .line 109
    const-class p2, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    .line 110
    .line 111
    invoke-static {p2, p5}, Ly4/b;->f(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    check-cast p2, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    .line 116
    .line 117
    new-instance p5, Lk1/f;

    .line 118
    .line 119
    invoke-direct {p5, p2}, Lk1/f;-><init>(Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p2, p5}, Lorg/chromium/support_lib_boundary/IsomorphicObjectBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    move-object v6, p2

    .line 127
    check-cast v6, Lk1/g;

    .line 128
    .line 129
    iget-object p2, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 130
    .line 131
    move-object v1, p2

    .line 132
    check-cast v1, Lj1/e;

    .line 133
    .line 134
    move-object v2, p1

    .line 135
    move-object v4, p3

    .line 136
    move v5, p4

    .line 137
    invoke-interface/range {v1 .. v6}, Lj1/e;->onPostMessage(Landroid/webkit/WebView;Lj1/c;Landroid/net/Uri;ZLj1/a;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    return-void
.end method

.method public p(IF)V
    .locals 0

    .line 1
    return-void
.end method

.method public s(Landroid/net/Uri;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lp3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/a;

    .line 7
    .line 8
    iget v1, v0, Lp3/a;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lp3/a;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/a;-><init>(Lk1/j;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/a;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/a;->i:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object p3, Lo4/e0;->a:Lv4/e;

    .line 52
    .line 53
    sget-object p3, Lv4/d;->i:Lv4/d;

    .line 54
    .line 55
    new-instance v4, Lp3/b;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x0

    .line 59
    move-object v5, p0

    .line 60
    move-object v6, p1

    .line 61
    move-object v7, p2

    .line 62
    invoke-direct/range {v4 .. v9}, Lp3/b;-><init>(Lk1/j;Landroid/net/Uri;Ljava/lang/Object;Lw3/c;I)V

    .line 63
    .line 64
    .line 65
    iput v3, v0, Lp3/a;->i:I

    .line 66
    .line 67
    invoke-static {v4, p3, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    if-ne p3, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p3, Lt3/e;

    .line 75
    .line 76
    iget-object p1, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 77
    .line 78
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lk1/j;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "ContentInfoCompat{"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Landroid/view/ContentInfo;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "}"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public u(Landroid/net/Uri;Ly3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lp3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lp3/c;

    .line 7
    .line 8
    iget v1, v0, Lp3/c;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lp3/c;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lp3/c;-><init>(Lk1/j;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lp3/c;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/c;->i:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object p2, Lo4/e0;->a:Lv4/e;

    .line 52
    .line 53
    sget-object p2, Lv4/d;->i:Lv4/d;

    .line 54
    .line 55
    new-instance v2, Lp3/d;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    invoke-direct {v2, p0, p1, v4, v5}, Lp3/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 60
    .line 61
    .line 62
    iput v3, v0, Lp3/c;->i:I

    .line 63
    .line 64
    invoke-static {v2, p2, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-ne p2, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    check-cast p2, Lt3/e;

    .line 72
    .line 73
    iget-object p1, p2, Lt3/e;->g:Ljava/lang/Object;

    .line 74
    .line 75
    return-object p1
.end method

.method public x(Landroid/net/Uri;Ly3/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lp3/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lp3/e;

    .line 7
    .line 8
    iget v1, v0, Lp3/e;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lp3/e;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lp3/e;-><init>(Lk1/j;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lp3/e;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/e;->i:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object p2, Lo4/e0;->a:Lv4/e;

    .line 52
    .line 53
    sget-object p2, Lv4/d;->i:Lv4/d;

    .line 54
    .line 55
    new-instance v2, Lp3/d;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v2, p0, p1, v4, v3}, Lp3/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Lp3/e;->i:I

    .line 62
    .line 63
    invoke-static {v2, p2, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-ne p2, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p2, Lt3/e;

    .line 71
    .line 72
    iget-object p1, p2, Lt3/e;->g:Ljava/lang/Object;

    .line 73
    .line 74
    return-object p1
.end method

.method public y(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lk1/j;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/webkit/JsResult;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/webkit/JsResult;->confirm()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/JsResult;->cancel()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
