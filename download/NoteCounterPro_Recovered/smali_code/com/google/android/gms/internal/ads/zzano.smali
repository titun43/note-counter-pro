.class final Lcom/google/android/gms/internal/ads/zzano;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Ljava/util/regex/Pattern;

.field private static final zzb:Ljava/util/regex/Pattern;


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzd:Ljava/lang/StringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\\[voice=\"([^\"]*)\"\\]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzano;->zza:Ljava/util/regex/Pattern;

    const-string v0, "^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzano;->zzb:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzer;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzer;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzano;->zzc:Lcom/google/android/gms/internal/ads/zzer;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzano;->zzd:Ljava/lang/StringBuilder;

    .line 17
    .line 18
    return-void
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzer;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    move v1, v0

    .line 3
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-lez v2, :cond_4

    .line 8
    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    aget-byte v1, v2, v1

    .line 20
    .line 21
    int-to-char v1, v1

    .line 22
    const/16 v2, 0x9

    .line 23
    .line 24
    if-eq v1, v2, :cond_3

    .line 25
    .line 26
    const/16 v2, 0xa

    .line 27
    .line 28
    if-eq v1, v2, :cond_3

    .line 29
    .line 30
    const/16 v2, 0xc

    .line 31
    .line 32
    if-eq v1, v2, :cond_3

    .line 33
    .line 34
    const/16 v2, 0xd

    .line 35
    .line 36
    if-eq v1, v2, :cond_3

    .line 37
    .line 38
    const/16 v2, 0x20

    .line 39
    .line 40
    if-eq v1, v2, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    add-int/lit8 v4, v1, 0x2

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    if-gt v4, v2, :cond_2

    .line 58
    .line 59
    add-int/lit8 v4, v1, 0x1

    .line 60
    .line 61
    aget-byte v6, v3, v1

    .line 62
    .line 63
    const/16 v7, 0x2f

    .line 64
    .line 65
    if-ne v6, v7, :cond_2

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x2

    .line 68
    .line 69
    aget-byte v4, v3, v4

    .line 70
    .line 71
    const/16 v6, 0x2a

    .line 72
    .line 73
    if-ne v4, v6, :cond_2

    .line 74
    .line 75
    :goto_2
    add-int/lit8 v4, v1, 0x1

    .line 76
    .line 77
    if-ge v4, v2, :cond_1

    .line 78
    .line 79
    aget-byte v5, v3, v1

    .line 80
    .line 81
    int-to-char v5, v5

    .line 82
    if-ne v5, v6, :cond_0

    .line 83
    .line 84
    aget-byte v5, v3, v4

    .line 85
    .line 86
    int-to-char v5, v5

    .line 87
    if-ne v5, v7, :cond_0

    .line 88
    .line 89
    add-int/lit8 v2, v1, 0x2

    .line 90
    .line 91
    move v1, v2

    .line 92
    goto :goto_2

    .line 93
    :cond_0
    move v1, v4

    .line 94
    goto :goto_2

    .line 95
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    sub-int/2addr v2, v1

    .line 100
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    move v1, v5

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzano;->zzb(Lcom/google/android/gms/internal/ads/zzer;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzano;->zzd(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    int-to-char p0, p0

    .line 28
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method private static zzd(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    :goto_0
    move v3, v0

    .line 14
    :goto_1
    if-ge v1, v2, :cond_5

    .line 15
    .line 16
    if-nez v3, :cond_5

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    aget-byte v3, v3, v1

    .line 23
    .line 24
    int-to-char v3, v3

    .line 25
    const/16 v4, 0x41

    .line 26
    .line 27
    if-lt v3, v4, :cond_0

    .line 28
    .line 29
    const/16 v4, 0x5a

    .line 30
    .line 31
    if-le v3, v4, :cond_4

    .line 32
    .line 33
    :cond_0
    const/16 v4, 0x61

    .line 34
    .line 35
    if-lt v3, v4, :cond_1

    .line 36
    .line 37
    const/16 v4, 0x7a

    .line 38
    .line 39
    if-le v3, v4, :cond_4

    .line 40
    .line 41
    :cond_1
    const/16 v4, 0x30

    .line 42
    .line 43
    if-lt v3, v4, :cond_2

    .line 44
    .line 45
    const/16 v4, 0x39

    .line 46
    .line 47
    if-le v3, v4, :cond_4

    .line 48
    .line 49
    :cond_2
    const/16 v4, 0x23

    .line 50
    .line 51
    if-eq v3, v4, :cond_4

    .line 52
    .line 53
    const/16 v4, 0x2d

    .line 54
    .line 55
    if-eq v3, v4, :cond_4

    .line 56
    .line 57
    const/16 v4, 0x2e

    .line 58
    .line 59
    if-eq v3, v4, :cond_4

    .line 60
    .line 61
    const/16 v4, 0x5f

    .line 62
    .line 63
    if-ne v3, v4, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    const/4 v3, 0x1

    .line 67
    goto :goto_1

    .line 68
    :cond_4
    :goto_2
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    sub-int/2addr v1, v0

    .line 79
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzer;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzano;->zzd:Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    :cond_0
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    move-object/from16 v5, p1

    .line 16
    .line 17
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzN(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzano;->zzc:Lcom/google/android/gms/internal/ads/zzer;

    .line 28
    .line 29
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v4, v6, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzb([BI)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzano;->zzb(Lcom/google/android/gms/internal/ads/zzer;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const-string v6, "{"

    .line 56
    .line 57
    const/4 v7, 0x5

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x1

    .line 60
    if-ge v5, v7, :cond_1

    .line 61
    .line 62
    :goto_1
    move-object v5, v8

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_1
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 66
    .line 67
    invoke-virtual {v4, v7, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const-string v7, "::cue"

    .line 72
    .line 73
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzc(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    if-nez v7, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-eqz v10, :cond_4

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 98
    .line 99
    .line 100
    const-string v5, ""

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_4
    const-string v5, "("

    .line 104
    .line 105
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_7

    .line 110
    .line 111
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    move v10, v2

    .line 120
    :goto_2
    if-ge v5, v7, :cond_6

    .line 121
    .line 122
    if-nez v10, :cond_6

    .line 123
    .line 124
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    add-int/lit8 v11, v5, 0x1

    .line 129
    .line 130
    aget-byte v5, v10, v5

    .line 131
    .line 132
    int-to-char v5, v5

    .line 133
    const/16 v10, 0x29

    .line 134
    .line 135
    if-ne v5, v10, :cond_5

    .line 136
    .line 137
    move v10, v9

    .line 138
    goto :goto_3

    .line 139
    :cond_5
    move v10, v2

    .line 140
    :goto_3
    move v5, v11

    .line 141
    goto :goto_2

    .line 142
    :cond_6
    add-int/lit8 v5, v5, -0x1

    .line 143
    .line 144
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    sub-int/2addr v5, v7

    .line 149
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 150
    .line 151
    invoke-virtual {v4, v5, v7}, Lcom/google/android/gms/internal/ads/zzer;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    goto :goto_4

    .line 160
    :cond_7
    move-object v5, v8

    .line 161
    :goto_4
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzc(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    const-string v10, ")"

    .line 166
    .line 167
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-nez v7, :cond_8

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_8
    :goto_5
    if-eqz v5, :cond_2b

    .line 175
    .line 176
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzc(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    if-nez v6, :cond_9

    .line 185
    .line 186
    goto/16 :goto_12

    .line 187
    .line 188
    :cond_9
    new-instance v6, Lcom/google/android/gms/internal/ads/zzanp;

    .line 189
    .line 190
    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzanp;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-eqz v7, :cond_b

    .line 198
    .line 199
    :cond_a
    :goto_6
    move v5, v2

    .line 200
    move-object v7, v8

    .line 201
    goto :goto_8

    .line 202
    :cond_b
    const/16 v7, 0x5b

    .line 203
    .line 204
    invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(I)I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    const/4 v10, -0x1

    .line 209
    if-eq v7, v10, :cond_d

    .line 210
    .line 211
    sget-object v11, Lcom/google/android/gms/internal/ads/zzano;->zza:Ljava/util/regex/Pattern;

    .line 212
    .line 213
    invoke-virtual {v5, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    invoke-virtual {v11, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    if-eqz v12, :cond_c

    .line 226
    .line 227
    invoke-virtual {v11, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v11

    .line 231
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/ads/zzanp;->zzd(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :cond_c
    invoke-virtual {v5, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    :cond_d
    sget-object v7, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 242
    .line 243
    const-string v7, "\\."

    .line 244
    .line 245
    invoke-virtual {v5, v7, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    aget-object v7, v5, v2

    .line 250
    .line 251
    const/16 v11, 0x23

    .line 252
    .line 253
    invoke-virtual {v7, v11}, Ljava/lang/String;->indexOf(I)I

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    if-eq v11, v10, :cond_e

    .line 258
    .line 259
    invoke-virtual {v7, v2, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/ads/zzanp;->zzb(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    add-int/lit8 v11, v11, 0x1

    .line 267
    .line 268
    invoke-virtual {v7, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzanp;->zza(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_e
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzanp;->zzb(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :goto_7
    array-length v7, v5

    .line 280
    if-le v7, v9, :cond_a

    .line 281
    .line 282
    invoke-static {v5, v9, v7}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    check-cast v5, [Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzanp;->zzc([Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    goto :goto_6

    .line 292
    :goto_8
    const-string v10, "}"

    .line 293
    .line 294
    if-nez v5, :cond_29

    .line 295
    .line 296
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzc(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    if-eqz v7, :cond_f

    .line 305
    .line 306
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v11

    .line 310
    if-eqz v11, :cond_10

    .line 311
    .line 312
    :cond_f
    move v11, v9

    .line 313
    goto :goto_9

    .line 314
    :cond_10
    move v11, v2

    .line 315
    :goto_9
    if-nez v11, :cond_28

    .line 316
    .line 317
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 318
    .line 319
    .line 320
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzano;->zzb(Lcom/google/android/gms/internal/ads/zzer;)V

    .line 321
    .line 322
    .line 323
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzd(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 328
    .line 329
    .line 330
    move-result v12

    .line 331
    if-eqz v12, :cond_11

    .line 332
    .line 333
    goto/16 :goto_11

    .line 334
    .line 335
    :cond_11
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzc(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v12

    .line 339
    const-string v13, ":"

    .line 340
    .line 341
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v12

    .line 345
    if-nez v12, :cond_12

    .line 346
    .line 347
    goto/16 :goto_11

    .line 348
    .line 349
    :cond_12
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzano;->zzb(Lcom/google/android/gms/internal/ads/zzer;)V

    .line 350
    .line 351
    .line 352
    new-instance v12, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 355
    .line 356
    .line 357
    move v13, v2

    .line 358
    :goto_a
    const-string v14, ";"

    .line 359
    .line 360
    if-nez v13, :cond_16

    .line 361
    .line 362
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 363
    .line 364
    .line 365
    move-result v15

    .line 366
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzc(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    if-nez v2, :cond_13

    .line 371
    .line 372
    move-object v2, v8

    .line 373
    goto :goto_d

    .line 374
    :cond_13
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v16

    .line 378
    if-nez v16, :cond_15

    .line 379
    .line 380
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v14

    .line 384
    if-eqz v14, :cond_14

    .line 385
    .line 386
    goto :goto_c

    .line 387
    :cond_14
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    :goto_b
    const/4 v2, 0x0

    .line 391
    goto :goto_a

    .line 392
    :cond_15
    :goto_c
    invoke-virtual {v4, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 393
    .line 394
    .line 395
    move v13, v9

    .line 396
    goto :goto_b

    .line 397
    :cond_16
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    :goto_d
    if-eqz v2, :cond_28

    .line 402
    .line 403
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 404
    .line 405
    .line 406
    move-result v12

    .line 407
    if-eqz v12, :cond_17

    .line 408
    .line 409
    goto/16 :goto_11

    .line 410
    .line 411
    :cond_17
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 412
    .line 413
    .line 414
    move-result v12

    .line 415
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzc(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v13

    .line 419
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v14

    .line 423
    if-eqz v14, :cond_18

    .line 424
    .line 425
    goto :goto_e

    .line 426
    :cond_18
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v10

    .line 430
    if-eqz v10, :cond_28

    .line 431
    .line 432
    invoke-virtual {v4, v12}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 433
    .line 434
    .line 435
    :goto_e
    const-string v10, "color"

    .line 436
    .line 437
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v10

    .line 441
    if-eqz v10, :cond_19

    .line 442
    .line 443
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzdp;->zzb(Ljava/lang/String;)I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzanp;->zzn(I)Lcom/google/android/gms/internal/ads/zzanp;

    .line 448
    .line 449
    .line 450
    goto/16 :goto_11

    .line 451
    .line 452
    :cond_19
    const-string v10, "background-color"

    .line 453
    .line 454
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    if-eqz v10, :cond_1a

    .line 459
    .line 460
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzdp;->zzb(Ljava/lang/String;)I

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzanp;->zzq(I)Lcom/google/android/gms/internal/ads/zzanp;

    .line 465
    .line 466
    .line 467
    goto/16 :goto_11

    .line 468
    .line 469
    :cond_1a
    const-string v10, "ruby-position"

    .line 470
    .line 471
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v10

    .line 475
    const/4 v12, 0x2

    .line 476
    if-eqz v10, :cond_1c

    .line 477
    .line 478
    const-string v5, "over"

    .line 479
    .line 480
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v5

    .line 484
    if-eqz v5, :cond_1b

    .line 485
    .line 486
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzanp;->zzw(I)Lcom/google/android/gms/internal/ads/zzanp;

    .line 487
    .line 488
    .line 489
    goto/16 :goto_11

    .line 490
    .line 491
    :cond_1b
    const-string v5, "under"

    .line 492
    .line 493
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    if-eqz v2, :cond_28

    .line 498
    .line 499
    invoke-virtual {v6, v12}, Lcom/google/android/gms/internal/ads/zzanp;->zzw(I)Lcom/google/android/gms/internal/ads/zzanp;

    .line 500
    .line 501
    .line 502
    goto/16 :goto_11

    .line 503
    .line 504
    :cond_1c
    const-string v10, "text-combine-upright"

    .line 505
    .line 506
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v10

    .line 510
    if-eqz v10, :cond_1f

    .line 511
    .line 512
    const-string v5, "all"

    .line 513
    .line 514
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    if-nez v5, :cond_1d

    .line 519
    .line 520
    const-string v5, "digits"

    .line 521
    .line 522
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    if-eqz v2, :cond_1e

    .line 527
    .line 528
    :cond_1d
    move v2, v9

    .line 529
    goto :goto_f

    .line 530
    :cond_1e
    const/4 v2, 0x0

    .line 531
    :goto_f
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzanp;->zzy(Z)Lcom/google/android/gms/internal/ads/zzanp;

    .line 532
    .line 533
    .line 534
    goto/16 :goto_11

    .line 535
    .line 536
    :cond_1f
    const-string v10, "text-decoration"

    .line 537
    .line 538
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v10

    .line 542
    if-eqz v10, :cond_20

    .line 543
    .line 544
    const-string v5, "underline"

    .line 545
    .line 546
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    if-eqz v2, :cond_28

    .line 551
    .line 552
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzanp;->zzh(Z)Lcom/google/android/gms/internal/ads/zzanp;

    .line 553
    .line 554
    .line 555
    goto/16 :goto_11

    .line 556
    .line 557
    :cond_20
    const-string v10, "font-family"

    .line 558
    .line 559
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v10

    .line 563
    if-eqz v10, :cond_21

    .line 564
    .line 565
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzanp;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzanp;

    .line 566
    .line 567
    .line 568
    goto/16 :goto_11

    .line 569
    .line 570
    :cond_21
    const-string v10, "font-weight"

    .line 571
    .line 572
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v10

    .line 576
    if-eqz v10, :cond_22

    .line 577
    .line 578
    const-string v5, "bold"

    .line 579
    .line 580
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    if-eqz v2, :cond_28

    .line 585
    .line 586
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzanp;->zzi(Z)Lcom/google/android/gms/internal/ads/zzanp;

    .line 587
    .line 588
    .line 589
    goto/16 :goto_11

    .line 590
    .line 591
    :cond_22
    const-string v10, "font-style"

    .line 592
    .line 593
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v10

    .line 597
    if-eqz v10, :cond_23

    .line 598
    .line 599
    const-string v5, "italic"

    .line 600
    .line 601
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    if-eqz v2, :cond_28

    .line 606
    .line 607
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzanp;->zzj(Z)Lcom/google/android/gms/internal/ads/zzanp;

    .line 608
    .line 609
    .line 610
    goto/16 :goto_11

    .line 611
    .line 612
    :cond_23
    const-string v10, "font-size"

    .line 613
    .line 614
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v5

    .line 618
    if-eqz v5, :cond_28

    .line 619
    .line 620
    sget-object v5, Lcom/google/android/gms/internal/ads/zzano;->zzb:Ljava/util/regex/Pattern;

    .line 621
    .line 622
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgql;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v10

    .line 626
    invoke-virtual {v5, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 627
    .line 628
    .line 629
    move-result-object v5

    .line 630
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 631
    .line 632
    .line 633
    move-result v10

    .line 634
    if-nez v10, :cond_24

    .line 635
    .line 636
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 637
    .line 638
    .line 639
    move-result v5

    .line 640
    new-instance v10, Ljava/lang/StringBuilder;

    .line 641
    .line 642
    add-int/lit8 v5, v5, 0x16

    .line 643
    .line 644
    invoke-direct {v10, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 645
    .line 646
    .line 647
    const-string v5, "Invalid font-size: \'"

    .line 648
    .line 649
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    const-string v2, "\'."

    .line 656
    .line 657
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    const-string v5, "WebvttCssParser"

    .line 665
    .line 666
    invoke-static {v5, v2}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    goto :goto_11

    .line 670
    :cond_24
    invoke-virtual {v5, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 678
    .line 679
    .line 680
    move-result v10

    .line 681
    const/16 v13, 0x25

    .line 682
    .line 683
    if-eq v10, v13, :cond_26

    .line 684
    .line 685
    const/16 v13, 0xca8

    .line 686
    .line 687
    if-eq v10, v13, :cond_25

    .line 688
    .line 689
    const/16 v12, 0xe08

    .line 690
    .line 691
    if-ne v10, v12, :cond_27

    .line 692
    .line 693
    const-string v10, "px"

    .line 694
    .line 695
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v2

    .line 699
    if-eqz v2, :cond_27

    .line 700
    .line 701
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzanp;->zzt(I)Lcom/google/android/gms/internal/ads/zzanp;

    .line 702
    .line 703
    .line 704
    goto :goto_10

    .line 705
    :cond_25
    const-string v10, "em"

    .line 706
    .line 707
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    if-eqz v2, :cond_27

    .line 712
    .line 713
    invoke-virtual {v6, v12}, Lcom/google/android/gms/internal/ads/zzanp;->zzt(I)Lcom/google/android/gms/internal/ads/zzanp;

    .line 714
    .line 715
    .line 716
    goto :goto_10

    .line 717
    :cond_26
    const-string v10, "%"

    .line 718
    .line 719
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v2

    .line 723
    if-eqz v2, :cond_27

    .line 724
    .line 725
    const/4 v2, 0x3

    .line 726
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzanp;->zzt(I)Lcom/google/android/gms/internal/ads/zzanp;

    .line 727
    .line 728
    .line 729
    :goto_10
    invoke-virtual {v5, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 737
    .line 738
    .line 739
    move-result v2

    .line 740
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzanp;->zzs(F)Lcom/google/android/gms/internal/ads/zzanp;

    .line 741
    .line 742
    .line 743
    goto :goto_11

    .line 744
    :cond_27
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 745
    .line 746
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 747
    .line 748
    .line 749
    throw v1

    .line 750
    :cond_28
    :goto_11
    move v5, v11

    .line 751
    const/4 v2, 0x0

    .line 752
    goto/16 :goto_8

    .line 753
    .line 754
    :cond_29
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v2

    .line 758
    if-eqz v2, :cond_2a

    .line 759
    .line 760
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    :cond_2a
    const/4 v2, 0x0

    .line 764
    goto/16 :goto_0

    .line 765
    .line 766
    :cond_2b
    :goto_12
    return-object v3
.end method
