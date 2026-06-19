.class public final Lf0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/ViewParent;

.field public b:Landroid/view/ViewParent;

.field public final c:Landroidx/core/widget/NestedScrollView;

.field public d:Z

.field public e:[I


# direct methods
.method public constructor <init>(Landroidx/core/widget/NestedScrollView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf0/p;->c:Landroidx/core/widget/NestedScrollView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(FF)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lf0/p;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lf0/p;->c(I)Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Lf0/p;->c:Landroidx/core/widget/NestedScrollView;

    .line 13
    .line 14
    :try_start_0
    invoke-interface {v0, v2, p1, p2}, Landroid/view/ViewParent;->onNestedPreFling(Landroid/view/View;FF)Z

    .line 15
    .line 16
    .line 17
    move-result p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    return p1

    .line 19
    :catch_0
    move-exception p1

    .line 20
    new-instance p2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "ViewParent "

    .line 23
    .line 24
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, " does not implement interface method onNestedPreFling"

    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const-string v0, "ViewParentCompat"

    .line 40
    .line 41
    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    :cond_0
    return v1
.end method

.method public final b(IIII[II[I)Z
    .locals 14

    .line 1
    move-object/from16 v1, p5

    .line 2
    .line 3
    move/from16 v8, p6

    .line 4
    .line 5
    iget-boolean v0, p0, Lf0/p;->d:Z

    .line 6
    .line 7
    const/4 v10, 0x0

    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    invoke-virtual {p0, v8}, Lf0/p;->c(I)Landroid/view/ViewParent;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_4

    .line 17
    .line 18
    :cond_0
    const/4 v11, 0x1

    .line 19
    if-nez p1, :cond_2

    .line 20
    .line 21
    if-nez p2, :cond_2

    .line 22
    .line 23
    if-nez p3, :cond_2

    .line 24
    .line 25
    if-eqz p4, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    if-eqz v1, :cond_a

    .line 29
    .line 30
    aput v10, v1, v10

    .line 31
    .line 32
    aput v10, v1, v11

    .line 33
    .line 34
    return v10

    .line 35
    :cond_2
    :goto_0
    iget-object v3, p0, Lf0/p;->c:Landroidx/core/widget/NestedScrollView;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    invoke-virtual {v3, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 40
    .line 41
    .line 42
    aget v0, v1, v10

    .line 43
    .line 44
    aget v4, v1, v11

    .line 45
    .line 46
    move v12, v0

    .line 47
    move v13, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    move v12, v10

    .line 50
    move v13, v12

    .line 51
    :goto_1
    if-nez p7, :cond_5

    .line 52
    .line 53
    iget-object v0, p0, Lf0/p;->e:[I

    .line 54
    .line 55
    if-nez v0, :cond_4

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    new-array v0, v0, [I

    .line 59
    .line 60
    iput-object v0, p0, Lf0/p;->e:[I

    .line 61
    .line 62
    :cond_4
    iget-object v0, p0, Lf0/p;->e:[I

    .line 63
    .line 64
    aput v10, v0, v10

    .line 65
    .line 66
    aput v10, v0, v11

    .line 67
    .line 68
    move-object v9, v0

    .line 69
    goto :goto_2

    .line 70
    :cond_5
    move-object/from16 v9, p7

    .line 71
    .line 72
    :goto_2
    instance-of v0, v2, Lf0/r;

    .line 73
    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    check-cast v2, Lf0/r;

    .line 77
    .line 78
    move v4, p1

    .line 79
    move/from16 v5, p2

    .line 80
    .line 81
    move/from16 v6, p3

    .line 82
    .line 83
    move/from16 v7, p4

    .line 84
    .line 85
    invoke-interface/range {v2 .. v9}, Lf0/r;->a(Landroid/view/View;IIIII[I)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_6
    aget v0, v9, v10

    .line 90
    .line 91
    add-int v0, v0, p3

    .line 92
    .line 93
    aput v0, v9, v10

    .line 94
    .line 95
    aget v0, v9, v11

    .line 96
    .line 97
    add-int v0, v0, p4

    .line 98
    .line 99
    aput v0, v9, v11

    .line 100
    .line 101
    instance-of v0, v2, Lf0/q;

    .line 102
    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    check-cast v2, Lf0/q;

    .line 106
    .line 107
    move v4, p1

    .line 108
    move/from16 v5, p2

    .line 109
    .line 110
    move/from16 v6, p3

    .line 111
    .line 112
    move/from16 v7, p4

    .line 113
    .line 114
    move/from16 v8, p6

    .line 115
    .line 116
    invoke-interface/range {v2 .. v8}, Lf0/q;->b(Landroid/view/View;IIIII)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_7
    if-nez p6, :cond_8

    .line 121
    .line 122
    move v4, p1

    .line 123
    move/from16 v5, p2

    .line 124
    .line 125
    move/from16 v6, p3

    .line 126
    .line 127
    move/from16 v7, p4

    .line 128
    .line 129
    :try_start_0
    invoke-interface/range {v2 .. v7}, Landroid/view/ViewParent;->onNestedScroll(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :catch_0
    move-exception v0

    .line 134
    move-object p1, v0

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v4, "ViewParent "

    .line 138
    .line 139
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v2, " does not implement interface method onNestedScroll"

    .line 146
    .line 147
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const-string v2, "ViewParentCompat"

    .line 155
    .line 156
    invoke-static {v2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 157
    .line 158
    .line 159
    :cond_8
    :goto_3
    if-eqz v1, :cond_9

    .line 160
    .line 161
    invoke-virtual {v3, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 162
    .line 163
    .line 164
    aget p1, v1, v10

    .line 165
    .line 166
    sub-int/2addr p1, v12

    .line 167
    aput p1, v1, v10

    .line 168
    .line 169
    aget p1, v1, v11

    .line 170
    .line 171
    sub-int/2addr p1, v13

    .line 172
    aput p1, v1, v11

    .line 173
    .line 174
    :cond_9
    return v11

    .line 175
    :cond_a
    :goto_4
    return v10
.end method

.method public final c(I)Landroid/view/ViewParent;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object p1, p0, Lf0/p;->b:Landroid/view/ViewParent;

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_1
    iget-object p1, p0, Lf0/p;->a:Landroid/view/ViewParent;

    .line 12
    .line 13
    return-object p1
.end method
