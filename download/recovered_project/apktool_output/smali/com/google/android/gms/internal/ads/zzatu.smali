.class public final Lcom/google/android/gms/internal/ads/zzatu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zza()[B
    .locals 11

    .line 1
    const v0, 0x5b25ace2

    .line 2
    .line 3
    .line 4
    not-int v1, v0

    .line 5
    const v2, 0x70a0790

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, v2

    .line 9
    const v2, 0x330b0e

    .line 10
    .line 11
    .line 12
    or-int/2addr v1, v2

    .line 13
    const v2, 0x27280493

    .line 14
    .line 15
    .line 16
    and-int/2addr v0, v2

    .line 17
    const v2, 0x30f56b4f

    .line 18
    .line 19
    .line 20
    or-int/2addr v0, v2

    .line 21
    add-int/2addr v1, v0

    .line 22
    const v0, 0x380f3d09

    .line 23
    .line 24
    .line 25
    sub-int/2addr v1, v0

    .line 26
    const v0, 0x3db012b3

    .line 27
    .line 28
    .line 29
    const v2, 0x3dd15094

    .line 30
    .line 31
    .line 32
    rem-int/2addr v2, v0

    .line 33
    const v0, 0x3fcfaed9

    .line 34
    .line 35
    .line 36
    not-int v3, v0

    .line 37
    const v4, 0x335e857

    .line 38
    .line 39
    .line 40
    and-int/2addr v3, v4

    .line 41
    const v4, 0x2c3293b0

    .line 42
    .line 43
    .line 44
    or-int/2addr v3, v4

    .line 45
    const v4, 0x63476a4f

    .line 46
    .line 47
    .line 48
    and-int/2addr v0, v4

    .line 49
    const v4, 0x68d20698

    .line 50
    .line 51
    .line 52
    or-int/2addr v0, v4

    .line 53
    add-int/2addr v3, v0

    .line 54
    const v0, 0x50fb761c

    .line 55
    .line 56
    .line 57
    sub-int/2addr v3, v0

    .line 58
    const v0, 0x16cf80f1

    .line 59
    .line 60
    .line 61
    const v4, 0x5cb44a05

    .line 62
    .line 63
    .line 64
    rem-int/2addr v4, v0

    .line 65
    xor-int v0, v3, v4

    .line 66
    .line 67
    xor-int/2addr v1, v2

    .line 68
    const/16 v2, 0x9

    .line 69
    .line 70
    new-array v2, v2, [I

    .line 71
    .line 72
    fill-array-data v2, :array_0

    .line 73
    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    aget v3, v2, v3

    .line 77
    .line 78
    const/4 v4, 0x1

    .line 79
    aget v4, v2, v4

    .line 80
    .line 81
    const/4 v5, 0x2

    .line 82
    aget v5, v2, v5

    .line 83
    .line 84
    const/4 v6, 0x3

    .line 85
    aget v6, v2, v6

    .line 86
    .line 87
    const/4 v7, 0x4

    .line 88
    aget v7, v2, v7

    .line 89
    .line 90
    const/4 v8, 0x5

    .line 91
    aget v8, v2, v8

    .line 92
    .line 93
    const/4 v9, 0x6

    .line 94
    aget v9, v2, v9

    .line 95
    .line 96
    const/4 v10, 0x7

    .line 97
    aget v2, v2, v10

    .line 98
    .line 99
    not-int v10, v3

    .line 100
    and-int/2addr v4, v10

    .line 101
    or-int/2addr v4, v5

    .line 102
    and-int/2addr v3, v6

    .line 103
    or-int/2addr v3, v7

    .line 104
    invoke-static {v4, v3, v8, v9}, Landroidx/emoji2/text/u;->d(IIII)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    const v4, 0x4c04a8af    # 3.477574E7f

    .line 109
    .line 110
    .line 111
    rem-int/2addr v2, v4

    .line 112
    xor-int/2addr v2, v3

    .line 113
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 118
    .line 119
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 120
    .line 121
    .line 122
    int-to-short v1, v1

    .line 123
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    nop

    .line 135
    :array_0
    .array-data 4
        0x14e17e33
        0x4038e8a2
        0x68db0d72
        0x120e080
        0x2dd61648
        0x6e240f69
        0x1748396
        0x76272110
        0x4c04a8af    # 3.477574E7f
    .end array-data
.end method
