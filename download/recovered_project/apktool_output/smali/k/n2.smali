.class public final Lk/n2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Landroid/graphics/PorterDuff$Mode;

.field public static g:Lk/n2;

.field public static final h:Lk/m2;


# instance fields
.field public a:Ljava/util/WeakHashMap;

.field public final b:Ljava/util/WeakHashMap;

.field public c:Landroid/util/TypedValue;

.field public d:Z

.field public e:Lf2/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Lk/n2;->f:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    new-instance v0, Lk/m2;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, v1}, Lo/k;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lk/n2;->h:Lk/m2;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lk/n2;->b:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    return-void
.end method

.method public static declared-synchronized b()Lk/n2;
    .locals 2

    .line 1
    const-class v0, Lk/n2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lk/n2;->g:Lk/n2;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lk/n2;

    .line 9
    .line 10
    invoke-direct {v1}, Lk/n2;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lk/n2;->g:Lk/n2;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, Lk/n2;->g:Lk/n2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method

.method public static declared-synchronized e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 4

    .line 1
    const-class v0, Lk/n2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lk/n2;->h:Lk/m2;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 v2, 0x1f

    .line 10
    .line 11
    add-int v3, v2, p0

    .line 12
    .line 13
    mul-int/2addr v3, v2

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v3

    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lo/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/graphics/PorterDuffColorFilter;

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    .line 32
    .line 33
    invoke-direct {v2, p0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v3

    .line 41
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v1, p0, v2}, Lo/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Landroid/graphics/PorterDuffColorFilter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    :goto_0
    monitor-exit v0

    .line 55
    return-object v2

    .line 56
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 9

    .line 1
    iget-object v0, p0, Lk/n2;->c:Landroid/util/TypedValue;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lk/n2;->c:Landroid/util/TypedValue;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lk/n2;->c:Landroid/util/TypedValue;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, p2, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 20
    .line 21
    .line 22
    iget v1, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 23
    .line 24
    int-to-long v1, v1

    .line 25
    const/16 v3, 0x20

    .line 26
    .line 27
    shl-long/2addr v1, v3

    .line 28
    iget v3, v0, Landroid/util/TypedValue;->data:I

    .line 29
    .line 30
    int-to-long v3, v3

    .line 31
    or-long/2addr v1, v3

    .line 32
    monitor-enter p0

    .line 33
    :try_start_0
    iget-object v3, p0, Lk/n2;->b:Ljava/util/WeakHashMap;

    .line 34
    .line 35
    invoke-virtual {v3, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lo/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    monitor-exit p0

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :try_start_1
    iget-object v5, v3, Lo/i;->h:[J

    .line 47
    .line 48
    iget v6, v3, Lo/i;->j:I

    .line 49
    .line 50
    invoke-static {v5, v6, v1, v2}, Lp/a;->b([JIJ)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-ltz v5, :cond_2

    .line 55
    .line 56
    iget-object v6, v3, Lo/i;->i:[Ljava/lang/Object;

    .line 57
    .line 58
    aget-object v5, v6, v5

    .line 59
    .line 60
    sget-object v6, Lo/j;->a:Ljava/lang/Object;

    .line 61
    .line 62
    if-ne v5, v6, :cond_3

    .line 63
    .line 64
    :cond_2
    move-object v5, v4

    .line 65
    :cond_3
    check-cast v5, Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    if-eqz v5, :cond_5

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 74
    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v5, v3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 82
    .line 83
    .line 84
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    monitor-exit p0

    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_4
    :try_start_2
    iget-object v5, v3, Lo/i;->h:[J

    .line 91
    .line 92
    iget v6, v3, Lo/i;->j:I

    .line 93
    .line 94
    invoke-static {v5, v6, v1, v2}, Lp/a;->b([JIJ)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-ltz v5, :cond_5

    .line 99
    .line 100
    iget-object v6, v3, Lo/i;->i:[Ljava/lang/Object;

    .line 101
    .line 102
    aget-object v7, v6, v5

    .line 103
    .line 104
    sget-object v8, Lo/j;->a:Ljava/lang/Object;

    .line 105
    .line 106
    if-eq v7, v8, :cond_5

    .line 107
    .line 108
    aput-object v8, v6, v5

    .line 109
    .line 110
    const/4 v5, 0x1

    .line 111
    iput-boolean v5, v3, Lo/i;->g:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    .line 113
    :cond_5
    monitor-exit p0

    .line 114
    :goto_0
    if-eqz v4, :cond_6

    .line 115
    .line 116
    return-object v4

    .line 117
    :cond_6
    iget-object v3, p0, Lk/n2;->e:Lf2/h;

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    if-nez v3, :cond_7

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_7
    const v3, 0x7f070011

    .line 124
    .line 125
    .line 126
    if-ne p2, v3, :cond_8

    .line 127
    .line 128
    new-instance v4, Landroid/graphics/drawable/LayerDrawable;

    .line 129
    .line 130
    const p2, 0x7f070010

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, p1, p2}, Lk/n2;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    const v3, 0x7f070012

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p1, v3}, Lk/n2;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    filled-new-array {p2, v3}, [Landroid/graphics/drawable/Drawable;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-direct {v4, p2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_8
    const v3, 0x7f070034

    .line 153
    .line 154
    .line 155
    if-ne p2, v3, :cond_9

    .line 156
    .line 157
    const p2, 0x7f06003b

    .line 158
    .line 159
    .line 160
    invoke-static {p0, p1, p2}, Lf2/h;->e(Lk/n2;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    goto :goto_1

    .line 165
    :cond_9
    const v3, 0x7f070033

    .line 166
    .line 167
    .line 168
    if-ne p2, v3, :cond_a

    .line 169
    .line 170
    const p2, 0x7f06003c

    .line 171
    .line 172
    .line 173
    invoke-static {p0, p1, p2}, Lf2/h;->e(Lk/n2;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    goto :goto_1

    .line 178
    :cond_a
    const v3, 0x7f070035

    .line 179
    .line 180
    .line 181
    if-ne p2, v3, :cond_b

    .line 182
    .line 183
    const p2, 0x7f06003d

    .line 184
    .line 185
    .line 186
    invoke-static {p0, p1, p2}, Lf2/h;->e(Lk/n2;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    :cond_b
    :goto_1
    if-eqz v4, :cond_10

    .line 191
    .line 192
    iget p2, v0, Landroid/util/TypedValue;->changingConfigurations:I

    .line 193
    .line 194
    invoke-virtual {v4, p2}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 195
    .line 196
    .line 197
    monitor-enter p0

    .line 198
    :try_start_3
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    if-eqz p2, :cond_f

    .line 203
    .line 204
    iget-object v0, p0, Lk/n2;->b:Ljava/util/WeakHashMap;

    .line 205
    .line 206
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Lo/i;

    .line 211
    .line 212
    if-nez v0, :cond_e

    .line 213
    .line 214
    new-instance v0, Lo/i;

    .line 215
    .line 216
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 217
    .line 218
    .line 219
    const/4 v3, 0x4

    .line 220
    :goto_2
    const/16 v5, 0x20

    .line 221
    .line 222
    const/16 v6, 0x50

    .line 223
    .line 224
    if-ge v3, v5, :cond_d

    .line 225
    .line 226
    const/4 v5, 0x1

    .line 227
    shl-int/2addr v5, v3

    .line 228
    add-int/lit8 v5, v5, -0xc

    .line 229
    .line 230
    if-gt v6, v5, :cond_c

    .line 231
    .line 232
    move v6, v5

    .line 233
    goto :goto_3

    .line 234
    :cond_c
    add-int/lit8 v3, v3, 0x1

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_d
    :goto_3
    div-int/lit8 v6, v6, 0x8

    .line 238
    .line 239
    new-array v3, v6, [J

    .line 240
    .line 241
    iput-object v3, v0, Lo/i;->h:[J

    .line 242
    .line 243
    new-array v3, v6, [Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v3, v0, Lo/i;->i:[Ljava/lang/Object;

    .line 246
    .line 247
    iget-object v3, p0, Lk/n2;->b:Ljava/util/WeakHashMap;

    .line 248
    .line 249
    invoke-virtual {v3, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :catchall_1
    move-exception p1

    .line 254
    goto :goto_6

    .line 255
    :cond_e
    :goto_4
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 256
    .line 257
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v1, v2, p1}, Lo/i;->a(JLjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 261
    .line 262
    .line 263
    monitor-exit p0

    .line 264
    goto :goto_5

    .line 265
    :cond_f
    monitor-exit p0

    .line 266
    :goto_5
    return-object v4

    .line 267
    :goto_6
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 268
    throw p1

    .line 269
    :cond_10
    return-object v4

    .line 270
    :goto_7
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 271
    throw p1
.end method

.method public final declared-synchronized c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lk/n2;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    .line 8
    return-object p1

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
.end method

.method public final declared-synchronized d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lk/n2;->d:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lk/n2;->d:Z

    .line 9
    .line 10
    const v0, 0x7f07004f

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Lk/n2;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    instance-of v1, v0, Lh1/a;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const-string v1, "android.graphics.drawable.VectorDrawable"

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_5

    .line 38
    .line 39
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lk/n2;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    invoke-static {p1, p2}, Lv/a;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2, p3, v0}, Lk/n2;->g(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_3
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-static {v0}, Lk/n1;->a(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    :cond_4
    monitor-exit p0

    .line 64
    return-object v0

    .line 65
    :cond_5
    const/4 p1, 0x0

    .line 66
    :try_start_1
    iput-boolean p1, p0, Lk/n2;->d:Z

    .line 67
    .line 68
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string p2, "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."

    .line 71
    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p1
.end method

.method public final declared-synchronized f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lk/n2;->a:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lo/m;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v2, v0, Lo/m;->g:[I

    .line 16
    .line 17
    iget v3, v0, Lo/m;->i:I

    .line 18
    .line 19
    invoke-static {v2, v3, p2}, Lp/a;->a([III)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ltz v2, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Lo/m;->h:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object v0, v0, v2

    .line 28
    .line 29
    sget-object v2, Lo/j;->b:Ljava/lang/Object;

    .line 30
    .line 31
    if-ne v0, v2, :cond_1

    .line 32
    .line 33
    :cond_0
    move-object v0, v1

    .line 34
    :cond_1
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object v0, v1

    .line 38
    :goto_0
    if-nez v0, :cond_7

    .line 39
    .line 40
    iget-object v0, p0, Lk/n2;->e:Lf2/h;

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    invoke-virtual {v0, p1, p2}, Lf2/h;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_1
    if-eqz v1, :cond_6

    .line 50
    .line 51
    iget-object v0, p0, Lk/n2;->a:Ljava/util/WeakHashMap;

    .line 52
    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    new-instance v0, Ljava/util/WeakHashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lk/n2;->a:Ljava/util/WeakHashMap;

    .line 61
    .line 62
    :cond_4
    iget-object v0, p0, Lk/n2;->a:Ljava/util/WeakHashMap;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lo/m;

    .line 69
    .line 70
    if-nez v0, :cond_5

    .line 71
    .line 72
    new-instance v0, Lo/m;

    .line 73
    .line 74
    invoke-direct {v0}, Lo/m;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Lk/n2;->a:Ljava/util/WeakHashMap;

    .line 78
    .line 79
    invoke-virtual {v2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_5
    invoke-virtual {v0, p2, v1}, Lo/m;->a(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    :cond_6
    move-object v0, v1

    .line 86
    goto :goto_2

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    goto :goto_3

    .line 89
    :cond_7
    :goto_2
    monitor-exit p0

    .line 90
    return-object v0

    .line 91
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    throw p1
.end method

.method public final g(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 7

    .line 1
    invoke-virtual {p0, p1, p2}, Lk/n2;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 13
    .line 14
    .line 15
    iget-object p3, p0, Lk/n2;->e:Lf2/h;

    .line 16
    .line 17
    if-nez p3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const p3, 0x7f070042

    .line 21
    .line 22
    .line 23
    if-ne p2, p3, :cond_1

    .line 24
    .line 25
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 26
    .line 27
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-object p1

    .line 33
    :cond_3
    iget-object v0, p0, Lk/n2;->e:Lf2/h;

    .line 34
    .line 35
    if-eqz v0, :cond_6

    .line 36
    .line 37
    const v0, 0x7f07003d

    .line 38
    .line 39
    .line 40
    const v2, 0x102000d

    .line 41
    .line 42
    .line 43
    const v3, 0x102000f

    .line 44
    .line 45
    .line 46
    const/high16 v4, 0x1020000

    .line 47
    .line 48
    const v5, 0x7f030059

    .line 49
    .line 50
    .line 51
    const v6, 0x7f03005b

    .line 52
    .line 53
    .line 54
    if-ne p2, v0, :cond_4

    .line 55
    .line 56
    move-object p2, p4

    .line 57
    check-cast p2, Landroid/graphics/drawable/LayerDrawable;

    .line 58
    .line 59
    invoke-virtual {p2, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-static {p1, v6}, Lk/s2;->c(Landroid/content/Context;I)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    sget-object v1, Lk/v;->b:Landroid/graphics/PorterDuff$Mode;

    .line 68
    .line 69
    invoke-static {p3, v0, v1}, Lf2/h;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v3}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-static {p1, v6}, Lk/s2;->c(Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-static {p3, v0, v1}, Lf2/h;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-static {p1, v5}, Lk/s2;->c(Landroid/content/Context;I)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-static {p2, p1, v1}, Lf2/h;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 92
    .line 93
    .line 94
    return-object p4

    .line 95
    :cond_4
    const v0, 0x7f070034

    .line 96
    .line 97
    .line 98
    if-eq p2, v0, :cond_5

    .line 99
    .line 100
    const v0, 0x7f070033

    .line 101
    .line 102
    .line 103
    if-eq p2, v0, :cond_5

    .line 104
    .line 105
    const v0, 0x7f070035

    .line 106
    .line 107
    .line 108
    if-ne p2, v0, :cond_6

    .line 109
    .line 110
    :cond_5
    move-object p2, p4

    .line 111
    check-cast p2, Landroid/graphics/drawable/LayerDrawable;

    .line 112
    .line 113
    invoke-virtual {p2, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    invoke-static {p1, v6}, Lk/s2;->b(Landroid/content/Context;I)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    sget-object v1, Lk/v;->b:Landroid/graphics/PorterDuff$Mode;

    .line 122
    .line 123
    invoke-static {p3, v0, v1}, Lf2/h;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2, v3}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-static {p1, v5}, Lk/s2;->c(Landroid/content/Context;I)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-static {p3, v0, v1}, Lf2/h;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-static {p1, v5}, Lk/s2;->c(Landroid/content/Context;I)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-static {p2, p1, v1}, Lf2/h;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 146
    .line 147
    .line 148
    return-object p4

    .line 149
    :cond_6
    iget-object v0, p0, Lk/n2;->e:Lf2/h;

    .line 150
    .line 151
    const/4 v2, 0x0

    .line 152
    if-eqz v0, :cond_d

    .line 153
    .line 154
    sget-object v3, Lk/v;->b:Landroid/graphics/PorterDuff$Mode;

    .line 155
    .line 156
    iget-object v4, v0, Lf2/h;->a:Ljava/io/Serializable;

    .line 157
    .line 158
    check-cast v4, [I

    .line 159
    .line 160
    invoke-static {v4, p2}, Lf2/h;->b([II)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    const/4 v5, 0x1

    .line 165
    const/4 v6, -0x1

    .line 166
    if-eqz v4, :cond_7

    .line 167
    .line 168
    const p2, 0x7f03005b

    .line 169
    .line 170
    .line 171
    :goto_1
    move v4, v5

    .line 172
    :goto_2
    move v0, v6

    .line 173
    goto :goto_4

    .line 174
    :cond_7
    iget-object v4, v0, Lf2/h;->c:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v4, [I

    .line 177
    .line 178
    invoke-static {v4, p2}, Lf2/h;->b([II)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_8

    .line 183
    .line 184
    const p2, 0x7f030059

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_8
    iget-object v0, v0, Lf2/h;->d:Ljava/io/Serializable;

    .line 189
    .line 190
    check-cast v0, [I

    .line 191
    .line 192
    invoke-static {v0, p2}, Lf2/h;->b([II)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    const v4, 0x1010031

    .line 197
    .line 198
    .line 199
    if-eqz v0, :cond_9

    .line 200
    .line 201
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 202
    .line 203
    :goto_3
    move p2, v4

    .line 204
    goto :goto_1

    .line 205
    :cond_9
    const v0, 0x7f070026

    .line 206
    .line 207
    .line 208
    if-ne p2, v0, :cond_a

    .line 209
    .line 210
    const p2, 0x42233333    # 40.8f

    .line 211
    .line 212
    .line 213
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    const v0, 0x1010030

    .line 218
    .line 219
    .line 220
    move v4, v0

    .line 221
    move v0, p2

    .line 222
    move p2, v4

    .line 223
    move v4, v5

    .line 224
    goto :goto_4

    .line 225
    :cond_a
    const v0, 0x7f070014

    .line 226
    .line 227
    .line 228
    if-ne p2, v0, :cond_b

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_b
    move p2, v2

    .line 232
    move v4, p2

    .line 233
    goto :goto_2

    .line 234
    :goto_4
    if-eqz v4, :cond_d

    .line 235
    .line 236
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-static {p1, p2}, Lk/s2;->c(Landroid/content/Context;I)I

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    const-class p2, Lk/v;

    .line 245
    .line 246
    monitor-enter p2

    .line 247
    :try_start_0
    invoke-static {p1, v3}, Lk/n2;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 248
    .line 249
    .line 250
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 251
    monitor-exit p2

    .line 252
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 253
    .line 254
    .line 255
    if-eq v0, v6, :cond_c

    .line 256
    .line 257
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 258
    .line 259
    .line 260
    :cond_c
    move v2, v5

    .line 261
    goto :goto_5

    .line 262
    :catchall_0
    move-exception p1

    .line 263
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 264
    throw p1

    .line 265
    :cond_d
    :goto_5
    if-nez v2, :cond_e

    .line 266
    .line 267
    if-eqz p3, :cond_e

    .line 268
    .line 269
    return-object v1

    .line 270
    :cond_e
    return-object p4
.end method
