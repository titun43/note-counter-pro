.class public Lt2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/c;
.implements Lcom/google/android/gms/common/api/internal/s;
.implements Ld1/b;
.implements Lf0/x;
.implements Lh2/b;
.implements Lg/b;
.implements Lj/y;
.implements Ly0/d;


# static fields
.field public static h:Lt2/i;

.field public static i:Lt2/i;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lt2/i;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final B(Landroid/content/pm/PackageInfo;)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_b

    .line 5
    .line 6
    :cond_0
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "com.android.vending"

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 18
    .line 19
    const-string v3, "com.google.android.gms"

    .line 20
    .line 21
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v1, v2

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    :goto_1
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 31
    .line 32
    if-nez v1, :cond_4

    .line 33
    .line 34
    :cond_3
    move v1, v0

    .line 35
    goto :goto_2

    .line 36
    :cond_4
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 37
    .line 38
    and-int/lit16 v1, v1, 0x81

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_2
    if-eqz v1, :cond_5

    .line 44
    .line 45
    :try_start_0
    sget-object v3, Lt2/o;->c:Lcom/google/android/gms/internal/common/zzah;

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_5
    sget-object v3, Lt2/o;->b:Lcom/google/android/gms/internal/common/zzah;

    .line 49
    .line 50
    :goto_3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 v5, 0x1c

    .line 53
    .line 54
    if-ge v4, v5, :cond_8

    .line 55
    .line 56
    iget-object v4, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    if-eqz v4, :cond_6

    .line 60
    .line 61
    array-length v6, v4

    .line 62
    if-ne v6, v2, :cond_6

    .line 63
    .line 64
    aget-object v4, v4, v0

    .line 65
    .line 66
    invoke-virtual {v4}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    :cond_6
    if-eqz v5, :cond_7

    .line 71
    .line 72
    invoke-static {v5}, Lcom/google/android/gms/internal/common/zzah;->zzk(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzah;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    goto :goto_7

    .line 77
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/common/zzah;->zzj()Lcom/google/android/gms/internal/common/zzah;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    goto :goto_7

    .line 82
    :cond_8
    if-lt v4, v5, :cond_9

    .line 83
    .line 84
    move v4, v2

    .line 85
    goto :goto_4

    .line 86
    :cond_9
    move v4, v0

    .line 87
    :goto_4
    invoke-static {v4}, Lcom/google/android/gms/internal/common/zzr;->zza(Z)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, Lo1/a;->a(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-eqz v4, :cond_c

    .line 95
    .line 96
    invoke-static {v4}, Lo1/a;->f(Landroid/content/pm/SigningInfo;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_c

    .line 101
    .line 102
    invoke-static {v4}, Lo1/a;->g(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-nez v5, :cond_a

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_a
    sget v5, Lcom/google/android/gms/internal/common/zzah;->zzd:I

    .line 110
    .line 111
    new-instance v5, Lcom/google/android/gms/internal/common/zzad;

    .line 112
    .line 113
    invoke-direct {v5}, Lcom/google/android/gms/internal/common/zzad;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-static {v4}, Lo1/a;->g(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    array-length v6, v4

    .line 121
    move v7, v0

    .line 122
    :goto_5
    if-ge v7, v6, :cond_b

    .line 123
    .line 124
    aget-object v8, v4, v7

    .line 125
    .line 126
    invoke-virtual {v8}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/common/zzad;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzad;

    .line 131
    .line 132
    .line 133
    add-int/lit8 v7, v7, 0x1

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_b
    invoke-virtual {v5}, Lcom/google/android/gms/internal/common/zzad;->zzd()Lcom/google/android/gms/internal/common/zzah;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    goto :goto_7

    .line 141
    :cond_c
    :goto_6
    invoke-static {}, Lcom/google/android/gms/internal/common/zzah;->zzj()Lcom/google/android/gms/internal/common/zzah;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    :goto_7
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-nez v5, :cond_f

    .line 150
    .line 151
    invoke-virtual {v4}, Lcom/google/android/gms/internal/common/zzah;->zzh()Lcom/google/android/gms/internal/common/zzah;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    move v6, v0

    .line 160
    :goto_8
    if-ge v6, v5, :cond_11

    .line 161
    .line 162
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    check-cast v7, [B

    .line 167
    .line 168
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/common/zzah;->zzr(I)Lcom/google/android/gms/internal/common/zzal;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    :cond_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    add-int/lit8 v10, v6, 0x1

    .line 177
    .line 178
    if-eqz v9, :cond_e

    .line 179
    .line 180
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    check-cast v9, [B

    .line 185
    .line 186
    invoke-static {v7, v9}, Ljava/util/Arrays;->equals([B[B)Z

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    if-eqz v9, :cond_d

    .line 191
    .line 192
    goto :goto_a

    .line 193
    :cond_e
    move v6, v10

    .line 194
    goto :goto_8

    .line 195
    :cond_f
    const-string v3, "Unable to obtain package certificate history."

    .line 196
    .line 197
    new-instance v4, Ljava/lang/IllegalArgumentException;

    .line 198
    .line 199
    invoke-direct {v4, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    :catch_0
    const-string v3, "GoogleSignatureVerifier"

    .line 204
    .line 205
    const-string v4, "package info is not set correctly"

    .line 206
    .line 207
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    if-eqz v1, :cond_10

    .line 211
    .line 212
    sget-object v1, Lt2/o;->a:[Lt2/m;

    .line 213
    .line 214
    invoke-static {p0, v1}, Lt2/i;->C(Landroid/content/pm/PackageInfo;[Lt2/m;)Lt2/m;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    goto :goto_9

    .line 219
    :cond_10
    sget-object v1, Lt2/o;->a:[Lt2/m;

    .line 220
    .line 221
    aget-object v1, v1, v0

    .line 222
    .line 223
    filled-new-array {v1}, [Lt2/m;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-static {p0, v1}, Lt2/i;->C(Landroid/content/pm/PackageInfo;[Lt2/m;)Lt2/m;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    :goto_9
    if-eqz p0, :cond_11

    .line 232
    .line 233
    :goto_a
    return v2

    .line 234
    :cond_11
    :goto_b
    return v0
.end method

.method public static varargs C(Landroid/content/pm/PackageInfo;[Lt2/m;)Lt2/m;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    array-length v0, v0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    const-string p0, "GoogleSignatureVerifier"

    .line 12
    .line 13
    const-string p1, "Package has more than one signature."

    .line 14
    .line 15
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    new-instance v0, Lt2/n;

    .line 20
    .line 21
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aget-object p0, p0, v2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, Lt2/n;-><init>([B)V

    .line 31
    .line 32
    .line 33
    :goto_0
    array-length p0, p1

    .line 34
    if-ge v2, p0, :cond_3

    .line 35
    .line 36
    aget-object p0, p1, v2

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lt2/m;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    aget-object p0, p1, v2

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    :goto_1
    return-object v1
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "alias"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v0, "toString(...)"

    .line 39
    .line 40
    invoke-static {p0, v0}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "toLowerCase(...)"

    .line 50
    .line 51
    invoke-static {p0, v0}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object p0
.end method

.method public static p(Ljava/lang/String;)Lr3/x;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    invoke-static {p0}, Ln4/i;->X(Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    sget-object v1, Lr3/x;->q:Lz3/b;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v2, Lg4/a;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {v2, v1, v3}, Lg4/a;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lg4/a;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_5

    .line 27
    .line 28
    invoke-virtual {v2}, Lg4/a;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v3, v1

    .line 33
    check-cast v3, Lr3/x;

    .line 34
    .line 35
    sget-object v4, Lr3/x;->i:Lt2/i;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Lt2/i;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-static {v5}, Lt2/i;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_4

    .line 57
    .line 58
    iget-object v3, v3, Lr3/x;->h:Ljava/util/List;

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_1

    .line 78
    .line 79
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Ljava/lang/String;

    .line 84
    .line 85
    sget-object v5, Lr3/x;->i:Lt2/i;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, Lt2/i;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v4}, Lt2/i;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_3

    .line 103
    .line 104
    :cond_4
    move-object v0, v1

    .line 105
    :cond_5
    check-cast v0, Lr3/x;

    .line 106
    .line 107
    :cond_6
    :goto_1
    return-object v0
.end method

.method public static t(Ln0/b;Landroid/text/Editable;IIZ)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_19

    .line 3
    .line 4
    if-ltz p2, :cond_19

    .line 5
    .line 6
    if-gez p3, :cond_0

    .line 7
    .line 8
    goto/16 :goto_9

    .line 9
    .line 10
    :cond_0
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    if-eq v1, v3, :cond_19

    .line 20
    .line 21
    if-eq v2, v3, :cond_19

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_9

    .line 26
    .line 27
    :cond_1
    const/4 v4, 0x1

    .line 28
    if-eqz p4, :cond_16

    .line 29
    .line 30
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    if-ltz v1, :cond_3

    .line 39
    .line 40
    if-ge p4, v1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-gez p2, :cond_4

    .line 44
    .line 45
    :cond_3
    :goto_0
    move v1, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    :goto_1
    move p4, v0

    .line 48
    :goto_2
    if-nez p2, :cond_5

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    if-gez v1, :cond_7

    .line 54
    .line 55
    if-eqz p4, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    move v1, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_7
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz p4, :cond_9

    .line 65
    .line 66
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    if-nez p4, :cond_8

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_8
    add-int/lit8 p2, p2, -0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_9
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_a

    .line 81
    .line 82
    add-int/lit8 p2, p2, -0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_a
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_b

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_b
    move p4, v4

    .line 93
    goto :goto_2

    .line 94
    :goto_3
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-ltz v2, :cond_d

    .line 103
    .line 104
    if-ge p3, v2, :cond_c

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_c
    if-gez p2, :cond_e

    .line 108
    .line 109
    :cond_d
    :goto_4
    move p3, v3

    .line 110
    goto :goto_7

    .line 111
    :cond_e
    :goto_5
    move p4, v0

    .line 112
    :goto_6
    if-nez p2, :cond_f

    .line 113
    .line 114
    move p3, v2

    .line 115
    goto :goto_7

    .line 116
    :cond_f
    if-lt v2, p3, :cond_10

    .line 117
    .line 118
    if-eqz p4, :cond_15

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_10
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz p4, :cond_12

    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 128
    .line 129
    .line 130
    move-result p4

    .line 131
    if-nez p4, :cond_11

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_11
    add-int/lit8 p2, p2, -0x1

    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_12
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_13

    .line 144
    .line 145
    add-int/lit8 p2, p2, -0x1

    .line 146
    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_13
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 151
    .line 152
    .line 153
    move-result p4

    .line 154
    if-eqz p4, :cond_14

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    move p4, v4

    .line 160
    goto :goto_6

    .line 161
    :cond_15
    :goto_7
    if-eq v1, v3, :cond_19

    .line 162
    .line 163
    if-ne p3, v3, :cond_17

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_16
    sub-int/2addr v1, p2

    .line 167
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    add-int/2addr v2, p3

    .line 172
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    :cond_17
    const-class p2, Landroidx/emoji2/text/b0;

    .line 181
    .line 182
    invoke-interface {p1, v1, p3, p2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    check-cast p2, [Landroidx/emoji2/text/b0;

    .line 187
    .line 188
    if-eqz p2, :cond_19

    .line 189
    .line 190
    array-length p4, p2

    .line 191
    if-lez p4, :cond_19

    .line 192
    .line 193
    array-length p4, p2

    .line 194
    move v2, v0

    .line 195
    :goto_8
    if-ge v2, p4, :cond_18

    .line 196
    .line 197
    aget-object v3, p2, v2

    .line 198
    .line 199
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    .line 212
    .line 213
    .line 214
    move-result p3

    .line 215
    add-int/lit8 v2, v2, 0x1

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_18
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 223
    .line 224
    .line 225
    move-result p4

    .line 226
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    .line 227
    .line 228
    .line 229
    move-result p3

    .line 230
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    .line 231
    .line 232
    .line 233
    invoke-interface {p1, p2, p3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    .line 237
    .line 238
    .line 239
    return v4

    .line 240
    :cond_19
    :goto_9
    return v0
.end method


# virtual methods
.method public A(Landroid/content/Context;Ljava/lang/String;Lb3/c;)Lb3/d;
    .locals 3

    .line 1
    iget v0, p0, Lt2/i;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb3/d;

    .line 7
    .line 8
    invoke-direct {v0}, Lb3/d;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p3, p1, p2}, Lb3/c;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, v0, Lb3/d;->a:I

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-interface {p3, p1, p2, v1}, Lb3/c;->a(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, v0, Lb3/d;->b:I

    .line 23
    .line 24
    iget p2, v0, Lb3/d;->a:I

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    move v1, p2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    if-lt p2, p1, :cond_1

    .line 34
    .line 35
    const/4 v1, -0x1

    .line 36
    :cond_1
    :goto_0
    iput v1, v0, Lb3/d;->c:I

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    new-instance v0, Lb3/d;

    .line 40
    .line 41
    invoke-direct {v0}, Lb3/d;-><init>()V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-interface {p3, p1, p2, v1}, Lb3/c;->a(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iput v2, v0, Lb3/d;->b:I

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    iput v1, v0, Lb3/d;->c:I

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-interface {p3, p1, p2}, Lb3/c;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iput p1, v0, Lb3/d;->a:I

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    const/4 p1, -0x1

    .line 65
    iput p1, v0, Lb3/d;->c:I

    .line 66
    .line 67
    :cond_3
    :goto_1
    return-object v0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Z)I
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lb3/e;->d(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public b(Lj/n;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lb3/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public d(ZIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public e()V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Ld1/a;)Ld1/c;
    .locals 4

    .line 1
    new-instance v0, Le1/e;

    .line 2
    .line 3
    iget-object v1, p1, Ld1/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, p1, Ld1/a;->c:Ljava/io/Serializable;

    .line 8
    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p1, Ld1/a;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Landroidx/emoji2/text/p;

    .line 14
    .line 15
    iget-boolean p1, p1, Ld1/a;->a:Z

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v3, p1}, Le1/e;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/emoji2/text/p;Z)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public get()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lt2/i;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lt2/i;

    .line 7
    .line 8
    const/16 v1, 0x18

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lt2/i;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object v7, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 19
    .line 20
    const-string v8, "Null flags"

    .line 21
    .line 22
    if-eqz v7, :cond_4

    .line 23
    .line 24
    new-instance v2, Ll2/c;

    .line 25
    .line 26
    const-wide/16 v3, 0x7530

    .line 27
    .line 28
    const-wide/32 v5, 0x5265c00

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v2 .. v7}, Ll2/c;-><init>(JJLjava/util/Set;)V

    .line 32
    .line 33
    .line 34
    sget-object v3, Lc2/c;->g:Lc2/c;

    .line 35
    .line 36
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    if-eqz v7, :cond_3

    .line 40
    .line 41
    new-instance v2, Ll2/c;

    .line 42
    .line 43
    const-wide/16 v3, 0x3e8

    .line 44
    .line 45
    const-wide/32 v5, 0x5265c00

    .line 46
    .line 47
    .line 48
    invoke-direct/range {v2 .. v7}, Ll2/c;-><init>(JJLjava/util/Set;)V

    .line 49
    .line 50
    .line 51
    sget-object v3, Lc2/c;->i:Lc2/c;

    .line 52
    .line 53
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    sget-object v2, Ll2/d;->h:Ll2/d;

    .line 59
    .line 60
    filled-new-array {v2}, [Ll2/d;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-instance v3, Ljava/util/HashSet;

    .line 65
    .line 66
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v14

    .line 77
    if-eqz v14, :cond_1

    .line 78
    .line 79
    new-instance v9, Ll2/c;

    .line 80
    .line 81
    const-wide/32 v10, 0x5265c00

    .line 82
    .line 83
    .line 84
    const-wide/32 v12, 0x5265c00

    .line 85
    .line 86
    .line 87
    invoke-direct/range {v9 .. v14}, Ll2/c;-><init>(JJLjava/util/Set;)V

    .line 88
    .line 89
    .line 90
    sget-object v2, Lc2/c;->h:Lc2/c;

    .line 91
    .line 92
    invoke-virtual {v1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-static {}, Lc2/c;->values()[Lc2/c;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    array-length v3, v3

    .line 108
    if-lt v2, v3, :cond_0

    .line 109
    .line 110
    new-instance v2, Ljava/util/HashMap;

    .line 111
    .line 112
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v2, Ll2/b;

    .line 116
    .line 117
    invoke-direct {v2, v0, v1}, Ll2/b;-><init>(Lt2/i;Ljava/util/HashMap;)V

    .line 118
    .line 119
    .line 120
    return-object v2

    .line 121
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    const-string v1, "Not all priorities have been configured"

    .line 124
    .line 125
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 130
    .line 131
    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v0

    .line 135
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 136
    .line 137
    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    .line 142
    .line 143
    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 148
    .line 149
    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :pswitch_0
    new-instance v0, Lf2/q;

    .line 154
    .line 155
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    const/4 v2, 0x0

    .line 160
    invoke-direct {v0, v1, v2}, Lf2/q;-><init>(Ljava/lang/Object;I)V

    .line 161
    .line 162
    .line 163
    return-object v0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public h(ILjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lp3/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/i;

    .line 7
    .line 8
    iget v1, v0, Lp3/i;->i:I

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
    iput v1, v0, Lp3/i;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/i;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/i;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/i;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/i;->i:I

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
    new-instance v2, Lp3/j;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    invoke-direct {v2, p1, p2, v4, v5}, Lp3/j;-><init>(Ljava/lang/String;Ljava/lang/String;Lw3/c;I)V

    .line 60
    .line 61
    .line 62
    iput v3, v0, Lp3/i;->i:I

    .line 63
    .line 64
    invoke-static {v2, p3, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    if-ne p3, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    check-cast p3, Lt3/e;

    .line 72
    .line 73
    iget-object p1, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 74
    .line 75
    return-object p1
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lp3/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/q;

    .line 7
    .line 8
    iget v1, v0, Lp3/q;->i:I

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
    iput v1, v0, Lp3/q;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/q;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/q;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/q;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/q;->i:I

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
    new-instance v2, Lp3/j;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v2, p1, p2, v4, v3}, Lp3/j;-><init>(Ljava/lang/String;Ljava/lang/String;Lw3/c;I)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Lp3/q;->i:I

    .line 62
    .line 63
    invoke-static {v2, p3, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    if-ne p3, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p3, Lt3/e;

    .line 71
    .line 72
    iget-object p1, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 73
    .line 74
    return-object p1
.end method

.method public k(Lj/n;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public l(Ljava/lang/String;Lr3/a;Ly3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lp3/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/k;

    .line 7
    .line 8
    iget v1, v0, Lp3/k;->i:I

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
    iput v1, v0, Lp3/k;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/k;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/k;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/k;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/k;->i:I

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
    new-instance v2, Lp3/l;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    invoke-direct {v2, p1, p2, v4, v5}, Lp3/l;-><init>(Ljava/lang/String;Lr3/a;Lw3/c;I)V

    .line 60
    .line 61
    .line 62
    iput v3, v0, Lp3/k;->i:I

    .line 63
    .line 64
    invoke-static {v2, p3, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    if-ne p3, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    check-cast p3, Lt3/e;

    .line 72
    .line 73
    iget-object p1, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 74
    .line 75
    return-object p1
.end method

.method public m(Ljava/lang/String;Lr3/a;Ly3/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lp3/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/r;

    .line 7
    .line 8
    iget v1, v0, Lp3/r;->i:I

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
    iput v1, v0, Lp3/r;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/r;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/r;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/r;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/r;->i:I

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
    new-instance v2, Lp3/l;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v2, p1, p2, v4, v3}, Lp3/l;-><init>(Ljava/lang/String;Lr3/a;Lw3/c;I)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Lp3/r;->i:I

    .line 62
    .line 63
    invoke-static {v2, p3, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    if-ne p3, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p3, Lt3/e;

    .line 71
    .line 72
    iget-object p1, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 73
    .line 74
    return-object p1
.end method

.method public n(Ljava/lang/String;Lr3/b;Ly3/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lp3/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/m;

    .line 7
    .line 8
    iget v1, v0, Lp3/m;->i:I

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
    iput v1, v0, Lp3/m;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/m;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/m;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/m;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/m;->i:I

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
    new-instance v2, Lk0/q;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v2, p1, p2, v4}, Lk0/q;-><init>(Ljava/lang/String;Lr3/b;Lw3/c;)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Lp3/m;->i:I

    .line 62
    .line 63
    invoke-static {v2, p3, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    if-ne p3, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p3, Lt3/e;

    .line 71
    .line 72
    iget-object p1, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 73
    .line 74
    return-object p1
.end method

.method public o(Ljava/lang/String;Ly3/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lp3/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lp3/s;

    .line 7
    .line 8
    iget v1, v0, Lp3/s;->i:I

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
    iput v1, v0, Lp3/s;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/s;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lp3/s;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lp3/s;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/s;->i:I

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
    new-instance v2, Lp3/t;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v2, p1, v4}, Lp3/t;-><init>(Ljava/lang/String;Lw3/c;)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Lp3/s;->i:I

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

.method public onScrollProgress(IIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Ljava/lang/String;Ly3/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lp3/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lp3/u;

    .line 7
    .line 8
    iget v1, v0, Lp3/u;->i:I

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
    iput v1, v0, Lp3/u;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lp3/u;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lp3/u;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/u;->i:I

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
    new-instance v2, Lp3/o;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v2, p1, v4, v3}, Lp3/o;-><init>(Ljava/lang/String;Lw3/c;I)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Lp3/u;->i:I

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

.method public r(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 8
    .line 9
    return-object p1
.end method

.method public s()J
    .locals 2

    .line 1
    iget v0, p0, Lt2/i;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0

    .line 11
    :pswitch_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Ld0/b;

    .line 2
    .line 3
    return p1
.end method

.method public v(Ljava/lang/String;Ly3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lp3/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lp3/n;

    .line 7
    .line 8
    iget v1, v0, Lp3/n;->i:I

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
    iput v1, v0, Lp3/n;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/n;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lp3/n;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lp3/n;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/n;->i:I

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
    new-instance v2, Lp3/o;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    invoke-direct {v2, p1, v4, v5}, Lp3/o;-><init>(Ljava/lang/String;Lw3/c;I)V

    .line 60
    .line 61
    .line 62
    iput v3, v0, Lp3/n;->i:I

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

.method public w(Ljava/lang/String;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lp3/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/p;

    .line 7
    .line 8
    iget v1, v0, Lp3/p;->i:I

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
    iput v1, v0, Lp3/p;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/p;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/p;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/p;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/p;->i:I

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
    new-instance v4, Lk0/e;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x1

    .line 59
    move-object v7, p0

    .line 60
    move-object v5, p1

    .line 61
    move-object v6, p2

    .line 62
    invoke-direct/range {v4 .. v9}, Lk0/e;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 63
    .line 64
    .line 65
    iput v3, v0, Lp3/p;->i:I

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

.method public x(Ljava/lang/String;Lr3/a0;Ly3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lp3/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/v;

    .line 7
    .line 8
    iget v1, v0, Lp3/v;->i:I

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
    iput v1, v0, Lp3/v;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/v;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/v;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/v;->i:I

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
    new-instance v2, Lp3/d;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x2

    .line 59
    invoke-direct {v2, p1, p2, v4, v5}, Lp3/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 60
    .line 61
    .line 62
    iput v3, v0, Lp3/v;->i:I

    .line 63
    .line 64
    invoke-static {v2, p3, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    if-ne p3, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    check-cast p3, Lt3/e;

    .line 72
    .line 73
    iget-object p1, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 74
    .line 75
    return-object p1
.end method

.method public y(Ljava/lang/String;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lp3/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/x;

    .line 7
    .line 8
    iget v1, v0, Lp3/x;->i:I

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
    iput v1, v0, Lp3/x;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/x;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/x;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/x;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/x;->i:I

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
    new-instance v4, Lk0/e;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x2

    .line 59
    move-object v7, p0

    .line 60
    move-object v5, p1

    .line 61
    move-object v6, p2

    .line 62
    invoke-direct/range {v4 .. v9}, Lk0/e;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 63
    .line 64
    .line 65
    iput v3, v0, Lp3/x;->i:I

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

.method public z(Ljava/lang/String;Lr3/c0;Ly3/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lp3/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp3/y;

    .line 7
    .line 8
    iget v1, v0, Lp3/y;->i:I

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
    iput v1, v0, Lp3/y;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp3/y;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp3/y;-><init>(Lt2/i;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp3/y;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lp3/y;->i:I

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
    new-instance v4, Lk0/e;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x3

    .line 59
    move-object v6, p0

    .line 60
    move-object v5, p1

    .line 61
    move-object v7, p2

    .line 62
    invoke-direct/range {v4 .. v9}, Lk0/e;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 63
    .line 64
    .line 65
    iput v3, v0, Lp3/y;->i:I

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
