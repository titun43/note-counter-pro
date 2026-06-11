.class public final Lcom/google/android/gms/internal/ads/zzank;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzamf;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzb:Z

.field private final zzc:I

.field private final zzd:I

.field private final zze:Ljava/lang/String;

.field private final zzf:F

.field private final zzg:I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 9

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
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzank;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const v1, 0x3f59999a    # 0.85f

    .line 16
    .line 17
    .line 18
    const-string v2, "sans-serif"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-ne v0, v4, :cond_4

    .line 23
    .line 24
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, [B

    .line 29
    .line 30
    array-length v0, v0

    .line 31
    const/16 v5, 0x30

    .line 32
    .line 33
    if-eq v0, v5, :cond_0

    .line 34
    .line 35
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, [B

    .line 40
    .line 41
    array-length v0, v0

    .line 42
    const/16 v5, 0x35

    .line 43
    .line 44
    if-ne v0, v5, :cond_4

    .line 45
    .line 46
    :cond_0
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, [B

    .line 51
    .line 52
    const/16 v0, 0x18

    .line 53
    .line 54
    aget-byte v5, p1, v0

    .line 55
    .line 56
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzank;->zzc:I

    .line 57
    .line 58
    const/16 v5, 0x1a

    .line 59
    .line 60
    aget-byte v5, p1, v5

    .line 61
    .line 62
    and-int/lit16 v5, v5, 0xff

    .line 63
    .line 64
    const/16 v6, 0x1b

    .line 65
    .line 66
    aget-byte v6, p1, v6

    .line 67
    .line 68
    and-int/lit16 v6, v6, 0xff

    .line 69
    .line 70
    const/16 v7, 0x1c

    .line 71
    .line 72
    aget-byte v7, p1, v7

    .line 73
    .line 74
    and-int/lit16 v7, v7, 0xff

    .line 75
    .line 76
    const/16 v8, 0x1d

    .line 77
    .line 78
    aget-byte v8, p1, v8

    .line 79
    .line 80
    and-int/lit16 v8, v8, 0xff

    .line 81
    .line 82
    shl-int/lit8 v0, v5, 0x18

    .line 83
    .line 84
    shl-int/lit8 v5, v6, 0x10

    .line 85
    .line 86
    or-int/2addr v0, v5

    .line 87
    shl-int/lit8 v5, v7, 0x8

    .line 88
    .line 89
    or-int/2addr v0, v5

    .line 90
    or-int/2addr v0, v8

    .line 91
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzank;->zzd:I

    .line 92
    .line 93
    array-length v0, p1

    .line 94
    add-int/lit8 v0, v0, -0x2b

    .line 95
    .line 96
    const/16 v5, 0x2b

    .line 97
    .line 98
    invoke-static {p1, v5, v0}, Lcom/google/android/gms/internal/ads/zzfj;->zzj([BII)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v5, "Serif"

    .line 103
    .line 104
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eq v4, v0, :cond_1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    const-string v2, "serif"

    .line 112
    .line 113
    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzank;->zze:Ljava/lang/String;

    .line 114
    .line 115
    const/16 v0, 0x19

    .line 116
    .line 117
    aget-byte v0, p1, v0

    .line 118
    .line 119
    mul-int/lit8 v0, v0, 0x14

    .line 120
    .line 121
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzank;->zzg:I

    .line 122
    .line 123
    aget-byte v2, p1, v3

    .line 124
    .line 125
    and-int/lit8 v2, v2, 0x20

    .line 126
    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    move v3, v4

    .line 130
    :cond_2
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzank;->zzb:Z

    .line 131
    .line 132
    if-eqz v3, :cond_3

    .line 133
    .line 134
    const/16 v1, 0xa

    .line 135
    .line 136
    aget-byte v1, p1, v1

    .line 137
    .line 138
    and-int/lit16 v1, v1, 0xff

    .line 139
    .line 140
    shl-int/lit8 v1, v1, 0x8

    .line 141
    .line 142
    const/16 v2, 0xb

    .line 143
    .line 144
    aget-byte p1, p1, v2

    .line 145
    .line 146
    and-int/lit16 p1, p1, 0xff

    .line 147
    .line 148
    int-to-float v0, v0

    .line 149
    or-int/2addr p1, v1

    .line 150
    int-to-float p1, p1

    .line 151
    div-float/2addr p1, v0

    .line 152
    const v0, 0x3f733333    # 0.95f

    .line 153
    .line 154
    .line 155
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    const/4 v0, 0x0

    .line 160
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzank;->zzf:F

    .line 165
    .line 166
    return-void

    .line 167
    :cond_3
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzank;->zzf:F

    .line 168
    .line 169
    return-void

    .line 170
    :cond_4
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzank;->zzc:I

    .line 171
    .line 172
    const/4 p1, -0x1

    .line 173
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzank;->zzd:I

    .line 174
    .line 175
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzank;->zze:Ljava/lang/String;

    .line 176
    .line 177
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzank;->zzb:Z

    .line 178
    .line 179
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzank;->zzf:F

    .line 180
    .line 181
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzank;->zzg:I

    .line 182
    .line 183
    return-void
.end method

.method private static zzb(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 4

    .line 1
    if-eq p1, p2, :cond_4

    .line 2
    .line 3
    or-int/lit8 p2, p5, 0x21

    .line 4
    .line 5
    and-int/lit8 p5, p1, 0x1

    .line 6
    .line 7
    and-int/lit8 v0, p1, 0x2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz p5, :cond_2

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    invoke-direct {v0, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 26
    .line 27
    invoke-direct {v0, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 31
    .line 32
    .line 33
    :cond_1
    move v2, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    if-eqz v0, :cond_1

    .line 36
    .line 37
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    invoke-direct {v0, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 44
    .line 45
    .line 46
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 47
    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    if-nez p5, :cond_4

    .line 51
    .line 52
    if-nez v2, :cond_4

    .line 53
    .line 54
    new-instance p1, Landroid/text/style/StyleSpan;

    .line 55
    .line 56
    invoke-direct {p1, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    new-instance p1, Landroid/text/style/UnderlineSpan;

    .line 64
    .line 65
    invoke-direct {p1}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 69
    .line 70
    .line 71
    :cond_4
    return-void
.end method

.method private static zzc(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 1

    .line 1
    if-eq p1, p2, :cond_0

    .line 2
    .line 3
    and-int/lit16 p2, p1, 0xff

    .line 4
    .line 5
    shl-int/lit8 p2, p2, 0x18

    .line 6
    .line 7
    ushr-int/lit8 p1, p1, 0x8

    .line 8
    .line 9
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 10
    .line 11
    or-int/2addr p1, p2

    .line 12
    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 13
    .line 14
    .line 15
    or-int/lit8 p1, p5, 0x21

    .line 16
    .line 17
    invoke-virtual {p0, v0, p3, p4, p1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza([BIILcom/google/android/gms/internal/ads/zzame;Lcom/google/android/gms/internal/ads/zzdr;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    add-int v3, v1, p3

    .line 8
    .line 9
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzank;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 10
    .line 11
    move-object/from16 v5, p1

    .line 12
    .line 13
    invoke-virtual {v4, v5, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzb([BI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v3, 0x1

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x2

    .line 26
    if-lt v1, v6, :cond_0

    .line 27
    .line 28
    move v1, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v1, v5

    .line 31
    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgrc;->zza(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    const-string v1, ""

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzR()Ljava/nio/charset/Charset;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    sub-int/2addr v9, v7

    .line 56
    if-eqz v8, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 60
    .line 61
    :goto_1
    sub-int/2addr v1, v9

    .line 62
    invoke-virtual {v4, v1, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_3

    .line 71
    .line 72
    new-instance v8, Lcom/google/android/gms/internal/ads/zzalx;

    .line 73
    .line 74
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    move-wide v12, v10

    .line 84
    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/ads/zzalx;-><init>(Ljava/util/List;JJ)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v2, v8}, Lcom/google/android/gms/internal/ads/zzdr;->zza(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    new-instance v9, Landroid/text/SpannableStringBuilder;

    .line 92
    .line 93
    invoke-direct {v9, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzank;->zzc:I

    .line 97
    .line 98
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 99
    .line 100
    .line 101
    move-result v13

    .line 102
    const/high16 v14, 0xff0000

    .line 103
    .line 104
    const/4 v11, 0x0

    .line 105
    const/4 v12, 0x0

    .line 106
    invoke-static/range {v9 .. v14}, Lcom/google/android/gms/internal/ads/zzank;->zzb(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 107
    .line 108
    .line 109
    move v1, v10

    .line 110
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzank;->zzd:I

    .line 111
    .line 112
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    const/4 v11, -0x1

    .line 117
    invoke-static/range {v9 .. v14}, Lcom/google/android/gms/internal/ads/zzank;->zzc(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 118
    .line 119
    .line 120
    move v7, v10

    .line 121
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzank;->zze:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    const-string v11, "sans-serif"

    .line 128
    .line 129
    if-eq v8, v11, :cond_4

    .line 130
    .line 131
    new-instance v11, Landroid/text/style/TypefaceSpan;

    .line 132
    .line 133
    invoke-direct {v11, v8}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const v8, 0xff0021

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9, v11, v5, v10, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 140
    .line 141
    .line 142
    :cond_4
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzank;->zzf:F

    .line 143
    .line 144
    :goto_3
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    const/16 v11, 0x8

    .line 149
    .line 150
    if-lt v10, v11, :cond_d

    .line 151
    .line 152
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 153
    .line 154
    .line 155
    move-result v15

    .line 156
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 157
    .line 158
    .line 159
    move-result v16

    .line 160
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    const v11, 0x7374796c

    .line 165
    .line 166
    .line 167
    if-ne v10, v11, :cond_a

    .line 168
    .line 169
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    if-lt v10, v6, :cond_5

    .line 174
    .line 175
    move v10, v3

    .line 176
    goto :goto_4

    .line 177
    :cond_5
    move v10, v5

    .line 178
    :goto_4
    invoke-static {v10}, Lcom/google/android/gms/internal/ads/zzgrc;->zza(Z)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    move v11, v5

    .line 186
    :goto_5
    if-ge v11, v10, :cond_9

    .line 187
    .line 188
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    const/16 v13, 0xc

    .line 193
    .line 194
    if-lt v12, v13, :cond_6

    .line 195
    .line 196
    move v12, v3

    .line 197
    goto :goto_6

    .line 198
    :cond_6
    move v12, v5

    .line 199
    :goto_6
    invoke-static {v12}, Lcom/google/android/gms/internal/ads/zzgrc;->zza(Z)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 207
    .line 208
    .line 209
    move-result v13

    .line 210
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 211
    .line 212
    .line 213
    move v14, v10

    .line 214
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 222
    .line 223
    .line 224
    move-result v17

    .line 225
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    const-string v5, "Tx3gParser"

    .line 230
    .line 231
    const-string v6, ")."

    .line 232
    .line 233
    if-le v13, v3, :cond_7

    .line 234
    .line 235
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v18

    .line 243
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 244
    .line 245
    .line 246
    move-result v18

    .line 247
    move/from16 p4, v1

    .line 248
    .line 249
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    move/from16 v19, v7

    .line 254
    .line 255
    add-int/lit8 v7, v18, 0x2c

    .line 256
    .line 257
    move-object/from16 v18, v9

    .line 258
    .line 259
    const/4 v9, 0x2

    .line 260
    invoke-static {v1, v7, v9}, Landroidx/emoji2/text/u;->e(Ljava/lang/String;II)I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    new-instance v7, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 267
    .line 268
    .line 269
    const-string v1, "Truncating styl end ("

    .line 270
    .line 271
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string v1, ") to cueText.length() ("

    .line 278
    .line 279
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v5, v1}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v18 .. v18}, Landroid/text/SpannableStringBuilder;->length()I

    .line 296
    .line 297
    .line 298
    move-result v13

    .line 299
    goto :goto_7

    .line 300
    :cond_7
    move/from16 p4, v1

    .line 301
    .line 302
    move/from16 v19, v7

    .line 303
    .line 304
    move-object/from16 v18, v9

    .line 305
    .line 306
    :goto_7
    if-lt v12, v13, :cond_8

    .line 307
    .line 308
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    add-int/lit8 v1, v1, 0x24

    .line 321
    .line 322
    const/4 v9, 0x2

    .line 323
    invoke-static {v3, v1, v9}, Landroidx/emoji2/text/u;->e(Ljava/lang/String;II)I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    new-instance v3, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 330
    .line 331
    .line 332
    const-string v1, "Ignoring styl with start ("

    .line 333
    .line 334
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v1, ") >= end ("

    .line 341
    .line 342
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-static {v5, v1}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    move/from16 v3, p4

    .line 359
    .line 360
    move v5, v11

    .line 361
    move v1, v14

    .line 362
    move-object/from16 v9, v18

    .line 363
    .line 364
    move/from16 v11, v19

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_8
    move v1, v14

    .line 368
    const/4 v14, 0x0

    .line 369
    move v5, v11

    .line 370
    move-object/from16 v9, v18

    .line 371
    .line 372
    move/from16 v11, p4

    .line 373
    .line 374
    invoke-static/range {v9 .. v14}, Lcom/google/android/gms/internal/ads/zzank;->zzb(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 375
    .line 376
    .line 377
    move v3, v11

    .line 378
    move/from16 v10, v17

    .line 379
    .line 380
    move/from16 v11, v19

    .line 381
    .line 382
    invoke-static/range {v9 .. v14}, Lcom/google/android/gms/internal/ads/zzank;->zzc(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 383
    .line 384
    .line 385
    :goto_8
    add-int/lit8 v5, v5, 0x1

    .line 386
    .line 387
    move v10, v1

    .line 388
    move v1, v3

    .line 389
    move v7, v11

    .line 390
    const/4 v3, 0x1

    .line 391
    const/4 v6, 0x2

    .line 392
    move v11, v5

    .line 393
    const/4 v5, 0x0

    .line 394
    goto/16 :goto_5

    .line 395
    .line 396
    :cond_9
    move v3, v1

    .line 397
    move v11, v7

    .line 398
    move v5, v6

    .line 399
    goto :goto_a

    .line 400
    :cond_a
    move v3, v1

    .line 401
    move v11, v7

    .line 402
    const v1, 0x74626f78

    .line 403
    .line 404
    .line 405
    if-ne v10, v1, :cond_c

    .line 406
    .line 407
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzank;->zzb:Z

    .line 408
    .line 409
    if-eqz v1, :cond_c

    .line 410
    .line 411
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 412
    .line 413
    .line 414
    move-result v1

    .line 415
    const/4 v5, 0x2

    .line 416
    if-lt v1, v5, :cond_b

    .line 417
    .line 418
    const/4 v1, 0x1

    .line 419
    goto :goto_9

    .line 420
    :cond_b
    const/4 v1, 0x0

    .line 421
    :goto_9
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgrc;->zza(Z)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    int-to-float v1, v1

    .line 429
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzank;->zzg:I

    .line 430
    .line 431
    sget-object v7, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 432
    .line 433
    int-to-float v6, v6

    .line 434
    div-float/2addr v1, v6

    .line 435
    const v6, 0x3f733333    # 0.95f

    .line 436
    .line 437
    .line 438
    invoke-static {v1, v6}, Ljava/lang/Math;->min(FF)F

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    const/4 v6, 0x0

    .line 443
    invoke-static {v6, v1}, Ljava/lang/Math;->max(FF)F

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    move v8, v1

    .line 448
    goto :goto_a

    .line 449
    :cond_c
    const/4 v5, 0x2

    .line 450
    :goto_a
    add-int v15, v15, v16

    .line 451
    .line 452
    invoke-virtual {v4, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 453
    .line 454
    .line 455
    move v1, v3

    .line 456
    move v6, v5

    .line 457
    move v7, v11

    .line 458
    const/4 v3, 0x1

    .line 459
    const/4 v5, 0x0

    .line 460
    goto/16 :goto_3

    .line 461
    .line 462
    :cond_d
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcw;

    .line 463
    .line 464
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcw;-><init>()V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/zzcw;->zza(Ljava/lang/CharSequence;)Lcom/google/android/gms/internal/ads/zzcw;

    .line 468
    .line 469
    .line 470
    const/4 v3, 0x0

    .line 471
    invoke-virtual {v1, v8, v3}, Lcom/google/android/gms/internal/ads/zzcw;->zzf(FI)Lcom/google/android/gms/internal/ads/zzcw;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzcw;->zzg(I)Lcom/google/android/gms/internal/ads/zzcw;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcw;->zzr()Lcom/google/android/gms/internal/ads/zzcx;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    new-instance v3, Lcom/google/android/gms/internal/ads/zzalx;

    .line 482
    .line 483
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 484
    .line 485
    .line 486
    move-result-object v4

    .line 487
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    move-wide v7, v5

    .line 493
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/zzalx;-><init>(Ljava/util/List;JJ)V

    .line 494
    .line 495
    .line 496
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzdr;->zza(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    return-void
.end method
