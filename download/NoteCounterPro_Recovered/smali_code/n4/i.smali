.class public abstract Ln4/i;
.super Ln4/h;
.source "SourceFile"


# direct methods
.method public static S(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p0, p1, v0, v0}, Ln4/i;->U(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-ltz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    return v0
.end method

.method public static final T(Ljava/lang/CharSequence;)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    add-int/lit8 p0, p0, -0x1

    .line 11
    .line 12
    return p0
.end method

.method public static final U(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "string"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-nez p3, :cond_1

    .line 12
    .line 13
    instance-of v0, p0, Ljava/lang/String;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v5, 0x0

    .line 30
    move-object v0, p0

    .line 31
    move-object v1, p1

    .line 32
    move v2, p2

    .line 33
    move v4, p3

    .line 34
    invoke-static/range {v0 .. v5}, Ln4/i;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
.end method

.method public static final V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I
    .locals 9

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p5, :cond_2

    .line 4
    .line 5
    new-instance p5, Lk4/c;

    .line 6
    .line 7
    if-gez p2, :cond_0

    .line 8
    .line 9
    move p2, v1

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-le p3, v2, :cond_1

    .line 15
    .line 16
    move p3, v2

    .line 17
    :cond_1
    const/4 v2, 0x1

    .line 18
    invoke-direct {p5, p2, p3, v2}, Lk4/a;-><init>(III)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-static {p0}, Ln4/i;->T(Ljava/lang/CharSequence;)I

    .line 23
    .line 24
    .line 25
    move-result p5

    .line 26
    if-le p2, p5, :cond_3

    .line 27
    .line 28
    move p2, p5

    .line 29
    :cond_3
    if-gez p3, :cond_4

    .line 30
    .line 31
    move p3, v1

    .line 32
    :cond_4
    new-instance p5, Lk4/a;

    .line 33
    .line 34
    invoke-direct {p5, p2, p3, v0}, Lk4/a;-><init>(III)V

    .line 35
    .line 36
    .line 37
    :goto_0
    instance-of p2, p0, Ljava/lang/String;

    .line 38
    .line 39
    iget p3, p5, Lk4/a;->i:I

    .line 40
    .line 41
    iget v2, p5, Lk4/a;->h:I

    .line 42
    .line 43
    iget p5, p5, Lk4/a;->g:I

    .line 44
    .line 45
    if-eqz p2, :cond_9

    .line 46
    .line 47
    instance-of p2, p1, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz p2, :cond_9

    .line 50
    .line 51
    if-lez p3, :cond_5

    .line 52
    .line 53
    if-le p5, v2, :cond_6

    .line 54
    .line 55
    :cond_5
    if-gez p3, :cond_10

    .line 56
    .line 57
    if-gt v2, p5, :cond_10

    .line 58
    .line 59
    :cond_6
    move v7, p5

    .line 60
    :goto_1
    move-object v3, p1

    .line 61
    check-cast v3, Ljava/lang/String;

    .line 62
    .line 63
    move-object v6, p0

    .line 64
    check-cast v6, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    const/4 v5, 0x0

    .line 71
    if-nez p4, :cond_7

    .line 72
    .line 73
    invoke-virtual {v3, v5, v6, v7, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    move v4, p4

    .line 78
    goto :goto_2

    .line 79
    :cond_7
    move v4, p4

    .line 80
    invoke-virtual/range {v3 .. v8}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    :goto_2
    if-eqz p2, :cond_8

    .line 85
    .line 86
    return v7

    .line 87
    :cond_8
    if-eq v7, v2, :cond_10

    .line 88
    .line 89
    add-int/2addr v7, p3

    .line 90
    move p4, v4

    .line 91
    goto :goto_1

    .line 92
    :cond_9
    move v4, p4

    .line 93
    if-lez p3, :cond_a

    .line 94
    .line 95
    if-le p5, v2, :cond_b

    .line 96
    .line 97
    :cond_a
    if-gez p3, :cond_10

    .line 98
    .line 99
    if-gt v2, p5, :cond_10

    .line 100
    .line 101
    :cond_b
    :goto_3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    const-string p4, "other"

    .line 106
    .line 107
    invoke-static {p0, p4}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    if-ltz p5, :cond_f

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 113
    .line 114
    .line 115
    move-result p4

    .line 116
    sub-int/2addr p4, p2

    .line 117
    if-ltz p4, :cond_f

    .line 118
    .line 119
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 120
    .line 121
    .line 122
    move-result p4

    .line 123
    sub-int/2addr p4, p2

    .line 124
    if-le p5, p4, :cond_c

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_c
    move p4, v1

    .line 128
    :goto_4
    if-ge p4, p2, :cond_e

    .line 129
    .line 130
    invoke-interface {p1, p4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    add-int v5, p5, p4

    .line 135
    .line 136
    invoke-interface {p0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    invoke-static {v3, v5, v4}, Lb3/g;->q(CCZ)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_d

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_d
    add-int/lit8 p4, p4, 0x1

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_e
    return p5

    .line 151
    :cond_f
    :goto_5
    if-eq p5, v2, :cond_10

    .line 152
    .line 153
    add-int/2addr p5, p3

    .line 154
    goto :goto_3

    .line 155
    :cond_10
    return v0
.end method

.method public static W(Ljava/lang/String;CII)I
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(II)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static X(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v1, v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {v2}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    invoke-static {v2}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    return v0

    .line 32
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method public static Y(Ljava/lang/CharSequence;)I
    .locals 5

    .line 1
    invoke-static {p0}, Ln4/i;->T(Ljava/lang/CharSequence;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "<this>"

    .line 6
    .line 7
    invoke-static {p0, v1}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    instance-of v1, p0, Ljava/lang/String;

    .line 11
    .line 12
    const/16 v2, 0x2e

    .line 13
    .line 14
    if-nez v1, :cond_6

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    new-array v3, v1, [C

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    aput-char v2, v3, v4

    .line 21
    .line 22
    instance-of v2, p0, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    array-length v2, v3

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    if-ne v2, v1, :cond_0

    .line 30
    .line 31
    aget-char v1, v3, v4

    .line 32
    .line 33
    check-cast p0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->lastIndexOf(II)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    const-string v0, "Array has more than one element."

    .line 43
    .line 44
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 49
    .line 50
    const-string v0, "Array is empty."

    .line 51
    .line 52
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    invoke-static {p0}, Ln4/i;->T(Ljava/lang/CharSequence;)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-le v0, v1, :cond_3

    .line 61
    .line 62
    move v0, v1

    .line 63
    :cond_3
    :goto_0
    const/4 v1, -0x1

    .line 64
    if-ge v1, v0, :cond_5

    .line 65
    .line 66
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    aget-char v2, v3, v4

    .line 71
    .line 72
    invoke-static {v2, v1, v4}, Lb3/g;->q(CCZ)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    return v0

    .line 79
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_5
    return v1

    .line 83
    :cond_6
    check-cast p0, Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->lastIndexOf(II)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0
.end method

.method public static Z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "delimiter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p0, p1, v0, v0}, Ln4/i;->U(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    add-int/2addr p1, v0

    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "substring(...)"

    .line 29
    .line 30
    invoke-static {p0, p1}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public static a0(Ljava/lang/String;)Ljava/lang/Long;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/16 v4, 0x30

    .line 16
    .line 17
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    if-ge v3, v4, :cond_4

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    if-ne v1, v4, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    const/16 v7, 0x2b

    .line 29
    .line 30
    if-eq v3, v7, :cond_3

    .line 31
    .line 32
    const/16 v2, 0x2d

    .line 33
    .line 34
    if-eq v3, v2, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const-wide/high16 v5, -0x8000000000000000L

    .line 38
    .line 39
    move v2, v4

    .line 40
    goto :goto_0

    .line 41
    :cond_3
    move/from16 v17, v4

    .line 42
    .line 43
    move v4, v2

    .line 44
    move/from16 v2, v17

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    move v4, v2

    .line 48
    :goto_0
    const-wide v7, -0x38e38e38e38e38eL    # -2.772000429909333E291

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    const-wide/16 v9, 0x0

    .line 54
    .line 55
    move-wide v11, v7

    .line 56
    :goto_1
    if-ge v2, v1, :cond_9

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/16 v13, 0xa

    .line 63
    .line 64
    invoke-static {v3, v13}, Ljava/lang/Character;->digit(II)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-gez v3, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    cmp-long v14, v9, v11

    .line 72
    .line 73
    if-gez v14, :cond_6

    .line 74
    .line 75
    cmp-long v11, v11, v7

    .line 76
    .line 77
    if-nez v11, :cond_7

    .line 78
    .line 79
    int-to-long v11, v13

    .line 80
    div-long v11, v5, v11

    .line 81
    .line 82
    cmp-long v14, v9, v11

    .line 83
    .line 84
    if-gez v14, :cond_6

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_6
    int-to-long v13, v13

    .line 88
    mul-long/2addr v9, v13

    .line 89
    int-to-long v13, v3

    .line 90
    add-long v15, v5, v13

    .line 91
    .line 92
    cmp-long v3, v9, v15

    .line 93
    .line 94
    if-gez v3, :cond_8

    .line 95
    .line 96
    :cond_7
    :goto_2
    const/4 v0, 0x0

    .line 97
    return-object v0

    .line 98
    :cond_8
    sub-long/2addr v9, v13

    .line 99
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_9
    if-eqz v4, :cond_a

    .line 103
    .line 104
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0

    .line 109
    :cond_a
    neg-long v0, v9

    .line 110
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    return-object v0
.end method
