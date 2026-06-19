.class public final Landroidx/fragment/app/l0;
.super Landroidx/activity/y;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/fragment/app/u0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/u0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/u0;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Landroidx/activity/y;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final handleOnBackCancelled()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/u0;

    .line 7
    .line 8
    const-string v3, "FragmentManager"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "cancelBackStackTransition for transition "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object v0, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    iput-boolean v1, v0, Landroidx/fragment/app/a;->r:Z

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/fragment/app/a;->d()V

    .line 62
    .line 63
    .line 64
    iget-object v0, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 65
    .line 66
    new-instance v3, Landroidx/fragment/app/e;

    .line 67
    .line 68
    invoke-direct {v3, v2}, Landroidx/fragment/app/e;-><init>(Landroidx/fragment/app/u0;)V

    .line 69
    .line 70
    .line 71
    iget-object v4, v0, Landroidx/fragment/app/a;->p:Ljava/util/ArrayList;

    .line 72
    .line 73
    if-nez v4, :cond_2

    .line 74
    .line 75
    new-instance v4, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v4, v0, Landroidx/fragment/app/a;->p:Ljava/util/ArrayList;

    .line 81
    .line 82
    :cond_2
    iget-object v0, v0, Landroidx/fragment/app/a;->p:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    iget-object v0, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 88
    .line 89
    const/4 v3, 0x1

    .line 90
    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/a;->e(ZZ)I

    .line 91
    .line 92
    .line 93
    iput-boolean v3, v2, Landroidx/fragment/app/u0;->i:Z

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Landroidx/fragment/app/u0;->A(Z)Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Landroidx/fragment/app/u0;->D()V

    .line 99
    .line 100
    .line 101
    iput-boolean v1, v2, Landroidx/fragment/app/u0;->i:Z

    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    iput-object v0, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 105
    .line 106
    :cond_3
    return-void
.end method

.method public final handleOnBackPressed()V
    .locals 15

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/u0;

    .line 7
    .line 8
    const-string v3, "FragmentManager"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v2, Landroidx/fragment/app/u0;->j:Landroidx/fragment/app/l0;

    .line 30
    .line 31
    iget-object v4, v2, Landroidx/fragment/app/u0;->n:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    iput-boolean v5, v2, Landroidx/fragment/app/u0;->i:Z

    .line 35
    .line 36
    invoke-virtual {v2, v5}, Landroidx/fragment/app/u0;->A(Z)Z

    .line 37
    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    iput-boolean v6, v2, Landroidx/fragment/app/u0;->i:Z

    .line 41
    .line 42
    iget-object v7, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 43
    .line 44
    if-eqz v7, :cond_f

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    const/4 v8, 0x0

    .line 51
    if-nez v7, :cond_3

    .line 52
    .line 53
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 54
    .line 55
    iget-object v9, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 56
    .line 57
    invoke-static {v9}, Landroidx/fragment/app/u0;->E(Landroidx/fragment/app/a;)Ljava/util/HashSet;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-direct {v7, v9}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    move v10, v6

    .line 69
    :goto_0
    if-ge v10, v9, :cond_3

    .line 70
    .line 71
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    add-int/lit8 v10, v10, 0x1

    .line 76
    .line 77
    if-nez v11, :cond_2

    .line 78
    .line 79
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    if-nez v12, :cond_1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Landroidx/fragment/app/z;

    .line 95
    .line 96
    throw v8

    .line 97
    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :cond_3
    iget-object v4, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 104
    .line 105
    iget-object v4, v4, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    move v9, v6

    .line 112
    :cond_4
    :goto_1
    if-ge v9, v7, :cond_5

    .line 113
    .line 114
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    add-int/lit8 v9, v9, 0x1

    .line 119
    .line 120
    check-cast v10, Landroidx/fragment/app/c1;

    .line 121
    .line 122
    iget-object v10, v10, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 123
    .line 124
    if-eqz v10, :cond_4

    .line 125
    .line 126
    iput-boolean v6, v10, Landroidx/fragment/app/z;->s:Z

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    new-instance v4, Ljava/util/ArrayList;

    .line 130
    .line 131
    iget-object v7, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 132
    .line 133
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4, v6, v5}, Landroidx/fragment/app/u0;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_b

    .line 153
    .line 154
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    check-cast v5, Landroidx/fragment/app/n;

    .line 159
    .line 160
    iget-object v7, v5, Landroidx/fragment/app/n;->c:Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_6

    .line 167
    .line 168
    const-string v9, "SpecialEffectsController: Completing Back "

    .line 169
    .line 170
    invoke-static {v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    :cond_6
    invoke-virtual {v5, v7}, Landroidx/fragment/app/n;->e(Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    const-string v9, "operations"

    .line 180
    .line 181
    invoke-static {v7, v9}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    new-instance v9, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    if-eqz v11, :cond_7

    .line 198
    .line 199
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    check-cast v11, Landroidx/fragment/app/g1;

    .line 204
    .line 205
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    const/4 v11, 0x0

    .line 209
    invoke-static {v9, v11}, Lu3/m;->U(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_7
    invoke-static {v9}, Lu3/g;->c0(Ljava/util/ArrayList;)Ljava/util/Set;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-static {v9}, Lu3/g;->a0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    const/4 v11, 0x0

    .line 226
    move v12, v11

    .line 227
    :goto_4
    if-ge v12, v10, :cond_8

    .line 228
    .line 229
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    check-cast v13, Landroidx/fragment/app/f1;

    .line 234
    .line 235
    iget-object v14, v5, Landroidx/fragment/app/n;->a:Landroid/view/ViewGroup;

    .line 236
    .line 237
    invoke-virtual {v13, v14}, Landroidx/fragment/app/f1;->a(Landroid/view/ViewGroup;)V

    .line 238
    .line 239
    .line 240
    add-int/lit8 v12, v12, 0x1

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_8
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 244
    .line 245
    .line 246
    move-result v9

    .line 247
    move v10, v11

    .line 248
    :goto_5
    if-ge v10, v9, :cond_9

    .line 249
    .line 250
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    check-cast v12, Landroidx/fragment/app/g1;

    .line 255
    .line 256
    invoke-virtual {v5, v12}, Landroidx/fragment/app/n;->a(Landroidx/fragment/app/g1;)V

    .line 257
    .line 258
    .line 259
    add-int/lit8 v10, v10, 0x1

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_9
    invoke-static {v7}, Lu3/g;->a0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-gtz v7, :cond_a

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_a
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    check-cast v0, Landroidx/fragment/app/g1;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    const/4 v0, 0x0

    .line 283
    throw v0

    .line 284
    :cond_b
    iget-object v4, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 285
    .line 286
    iget-object v4, v4, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    :cond_c
    :goto_6
    if-ge v6, v5, :cond_d

    .line 293
    .line 294
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    add-int/lit8 v6, v6, 0x1

    .line 299
    .line 300
    check-cast v7, Landroidx/fragment/app/c1;

    .line 301
    .line 302
    iget-object v7, v7, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 303
    .line 304
    if-eqz v7, :cond_c

    .line 305
    .line 306
    iget-object v9, v7, Landroidx/fragment/app/z;->L:Landroid/view/ViewGroup;

    .line 307
    .line 308
    if-nez v9, :cond_c

    .line 309
    .line 310
    invoke-virtual {v2, v7}, Landroidx/fragment/app/u0;->g(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    invoke-virtual {v7}, Landroidx/fragment/app/b1;->j()V

    .line 315
    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_d
    iput-object v8, v2, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 319
    .line 320
    invoke-virtual {v2}, Landroidx/fragment/app/u0;->e0()V

    .line 321
    .line 322
    .line 323
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_e

    .line 328
    .line 329
    const-string v0, "Op is being set to null"

    .line 330
    .line 331
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 332
    .line 333
    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    const-string v4, "OnBackPressedCallback enabled="

    .line 337
    .line 338
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1}, Landroidx/activity/y;->isEnabled()Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    const-string v1, " for  FragmentManager "

    .line 349
    .line 350
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 361
    .line 362
    .line 363
    :cond_e
    return-void

    .line 364
    :cond_f
    invoke-virtual {v1}, Landroidx/activity/y;->isEnabled()Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-eqz v1, :cond_11

    .line 369
    .line 370
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_10

    .line 375
    .line 376
    const-string v0, "Calling popBackStackImmediate via onBackPressed callback"

    .line 377
    .line 378
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 379
    .line 380
    .line 381
    :cond_10
    invoke-virtual {v2}, Landroidx/fragment/app/u0;->Q()Z

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :cond_11
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    if-eqz v0, :cond_12

    .line 390
    .line 391
    const-string v0, "Calling onBackPressed via onBackPressed callback"

    .line 392
    .line 393
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 394
    .line 395
    .line 396
    :cond_12
    iget-object v0, v2, Landroidx/fragment/app/u0;->g:Landroidx/activity/f0;

    .line 397
    .line 398
    invoke-virtual {v0}, Landroidx/activity/f0;->c()V

    .line 399
    .line 400
    .line 401
    return-void
.end method

.method public final handleOnBackProgressed(Landroidx/activity/c;)V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/u0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v3, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 30
    .line 31
    if-eqz v1, :cond_6

    .line 32
    .line 33
    new-instance v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    iget-object v4, v3, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 36
    .line 37
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x1

    .line 46
    invoke-virtual {v3, v1, v4, v5}, Landroidx/fragment/app/u0;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_4

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Landroidx/fragment/app/n;

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const-string v6, "backEvent"

    .line 70
    .line 71
    invoke-static {p1, v6}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_2

    .line 79
    .line 80
    new-instance v6, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v7, "SpecialEffectsController: Processing Progress "

    .line 83
    .line 84
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget v7, p1, Landroidx/activity/c;->c:F

    .line 88
    .line 89
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-static {v2, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    :cond_2
    iget-object v6, v5, Landroidx/fragment/app/n;->c:Ljava/util/ArrayList;

    .line 100
    .line 101
    new-instance v7, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    move v9, v4

    .line 111
    :goto_0
    if-ge v9, v8, :cond_3

    .line 112
    .line 113
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    add-int/lit8 v9, v9, 0x1

    .line 118
    .line 119
    check-cast v10, Landroidx/fragment/app/g1;

    .line 120
    .line 121
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    const/4 v10, 0x0

    .line 125
    invoke-static {v7, v10}, Lu3/m;->U(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_3
    invoke-static {v7}, Lu3/g;->c0(Ljava/util/ArrayList;)Ljava/util/Set;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-static {v6}, Lu3/g;->a0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    move v8, v4

    .line 142
    :goto_1
    if-ge v8, v7, :cond_1

    .line 143
    .line 144
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    check-cast v9, Landroidx/fragment/app/f1;

    .line 149
    .line 150
    iget-object v10, v5, Landroidx/fragment/app/n;->a:Landroid/view/ViewGroup;

    .line 151
    .line 152
    invoke-virtual {v9, p1, v10}, Landroidx/fragment/app/f1;->b(Landroidx/activity/c;Landroid/view/ViewGroup;)V

    .line 153
    .line 154
    .line 155
    add-int/lit8 v8, v8, 0x1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_4
    iget-object p1, v3, Landroidx/fragment/app/u0;->n:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_5

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance p1, Ljava/lang/ClassCastException;

    .line 179
    .line 180
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :cond_6
    :goto_2
    return-void
.end method

.method public final handleOnBackStarted(Landroidx/activity/c;)V
    .locals 2

    .line 1
    const/4 p1, 0x3

    .line 2
    invoke-static {p1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    iget-object v0, p0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/u0;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager "

    .line 13
    .line 14
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->x()V

    .line 30
    .line 31
    .line 32
    new-instance p1, Landroidx/fragment/app/t0;

    .line 33
    .line 34
    invoke-direct {p1, v0}, Landroidx/fragment/app/t0;-><init>(Landroidx/fragment/app/u0;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/u0;->y(Landroidx/fragment/app/r0;Z)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
