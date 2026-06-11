.class public final Lcom/google/android/gms/ads/internal/client/zzs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static {v0}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    move v6, v2

    .line 10
    move v7, v6

    .line 11
    move v8, v7

    .line 12
    move v9, v8

    .line 13
    move v10, v9

    .line 14
    move v12, v10

    .line 15
    move v13, v12

    .line 16
    move v14, v13

    .line 17
    move v15, v14

    .line 18
    move/from16 v16, v15

    .line 19
    .line 20
    move/from16 v17, v16

    .line 21
    .line 22
    move/from16 v18, v17

    .line 23
    .line 24
    move/from16 v19, v18

    .line 25
    .line 26
    move-object v5, v3

    .line 27
    move-object v11, v5

    .line 28
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-ge v2, v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    int-to-char v3, v2

    .line 39
    packed-switch v3, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v2}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_0
    invoke-static {v0, v2}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 47
    .line 48
    .line 49
    move-result v19

    .line 50
    goto :goto_0

    .line 51
    :pswitch_1
    invoke-static {v0, v2}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 52
    .line 53
    .line 54
    move-result v18

    .line 55
    goto :goto_0

    .line 56
    :pswitch_2
    invoke-static {v0, v2}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 57
    .line 58
    .line 59
    move-result v17

    .line 60
    goto :goto_0

    .line 61
    :pswitch_3
    invoke-static {v0, v2}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 62
    .line 63
    .line 64
    move-result v16

    .line 65
    goto :goto_0

    .line 66
    :pswitch_4
    invoke-static {v0, v2}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 67
    .line 68
    .line 69
    move-result v15

    .line 70
    goto :goto_0

    .line 71
    :pswitch_5
    invoke-static {v0, v2}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 72
    .line 73
    .line 74
    move-result v14

    .line 75
    goto :goto_0

    .line 76
    :pswitch_6
    invoke-static {v0, v2}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    goto :goto_0

    .line 81
    :pswitch_7
    invoke-static {v0, v2}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    goto :goto_0

    .line 86
    :pswitch_8
    sget-object v3, Lcom/google/android/gms/ads/internal/client/zzr;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 87
    .line 88
    invoke-static {v0, v2, v3}, Ly4/b;->r(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    move-object v11, v2

    .line 93
    check-cast v11, [Lcom/google/android/gms/ads/internal/client/zzr;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :pswitch_9
    invoke-static {v0, v2}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    goto :goto_0

    .line 101
    :pswitch_a
    invoke-static {v0, v2}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    goto :goto_0

    .line 106
    :pswitch_b
    invoke-static {v0, v2}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    goto :goto_0

    .line 111
    :pswitch_c
    invoke-static {v0, v2}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    goto :goto_0

    .line 116
    :pswitch_d
    invoke-static {v0, v2}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    goto :goto_0

    .line 121
    :pswitch_e
    invoke-static {v0, v2}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    goto :goto_0

    .line 126
    :cond_0
    invoke-static {v0, v1}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 127
    .line 128
    .line 129
    new-instance v4, Lcom/google/android/gms/ads/internal/client/zzr;

    .line 130
    .line 131
    invoke-direct/range {v4 .. v19}, Lcom/google/android/gms/ads/internal/client/zzr;-><init>(Ljava/lang/String;IIZII[Lcom/google/android/gms/ads/internal/client/zzr;ZZZZZZZZ)V

    .line 132
    .line 133
    .line 134
    return-object v4

    .line 135
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/ads/internal/client/zzr;

    .line 2
    .line 3
    return-object p1
.end method
