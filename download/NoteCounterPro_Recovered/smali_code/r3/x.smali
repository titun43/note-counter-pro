.class public final enum Lr3/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final i:Lt2/i;

.field public static final enum j:Lr3/x;

.field public static final enum k:Lr3/x;

.field public static final enum l:Lr3/x;

.field public static final enum m:Lr3/x;

.field public static final enum n:Lr3/x;

.field public static final enum o:Lr3/x;

.field public static final synthetic p:[Lr3/x;

.field public static final synthetic q:Lz3/b;


# instance fields
.field public final g:Z

.field public final h:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lr3/x;

    .line 2
    .line 3
    const-string v1, "CACHE"

    .line 4
    .line 5
    const-string v2, "TEMPORARY"

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lu3/h;->S([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "INTERNAL_CACHE"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-direct {v0, v2, v3, v1, v4}, Lr3/x;-><init>(Ljava/lang/String;ILjava/util/List;I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lr3/x;->j:Lr3/x;

    .line 23
    .line 24
    new-instance v1, Lr3/x;

    .line 25
    .line 26
    const-string v2, "FILES"

    .line 27
    .line 28
    const-string v3, "LIBRARY_NO_CLOUD"

    .line 29
    .line 30
    const-string v5, "DATA"

    .line 31
    .line 32
    const-string v6, "LIBRARY"

    .line 33
    .line 34
    filled-new-array {v5, v6, v2, v3}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Lu3/h;->S([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "INTERNAL_FILES"

    .line 43
    .line 44
    invoke-direct {v1, v3, v4, v2, v4}, Lr3/x;-><init>(Ljava/lang/String;ILjava/util/List;I)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lr3/x;->k:Lr3/x;

    .line 48
    .line 49
    new-instance v2, Lr3/x;

    .line 50
    .line 51
    const-string v3, "CACHE_EXTERNAL"

    .line 52
    .line 53
    invoke-static {v3}, Ly4/b;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v5, "EXTERNAL_CACHE"

    .line 58
    .line 59
    const/4 v6, 0x2

    .line 60
    invoke-direct {v2, v5, v6, v3, v4}, Lr3/x;-><init>(Ljava/lang/String;ILjava/util/List;I)V

    .line 61
    .line 62
    .line 63
    sput-object v2, Lr3/x;->l:Lr3/x;

    .line 64
    .line 65
    new-instance v3, Lr3/x;

    .line 66
    .line 67
    const-string v5, "EXTERNAL"

    .line 68
    .line 69
    const-string v7, "FILES_EXTERNAL"

    .line 70
    .line 71
    filled-new-array {v5, v7}, [Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-static {v5}, Lu3/h;->S([Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    const-string v7, "EXTERNAL_FILES"

    .line 80
    .line 81
    const/4 v8, 0x3

    .line 82
    invoke-direct {v3, v7, v8, v5, v4}, Lr3/x;-><init>(Ljava/lang/String;ILjava/util/List;I)V

    .line 83
    .line 84
    .line 85
    sput-object v3, Lr3/x;->m:Lr3/x;

    .line 86
    .line 87
    move v5, v4

    .line 88
    new-instance v4, Lr3/x;

    .line 89
    .line 90
    const-string v7, "sdcard"

    .line 91
    .line 92
    invoke-static {v7}, Ly4/b;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    const-string v8, "EXTERNAL_STORAGE"

    .line 97
    .line 98
    const/4 v9, 0x4

    .line 99
    invoke-direct {v4, v8, v9, v5, v7}, Lr3/x;-><init>(Ljava/lang/String;IZLjava/util/List;)V

    .line 100
    .line 101
    .line 102
    sput-object v4, Lr3/x;->n:Lr3/x;

    .line 103
    .line 104
    new-instance v5, Lr3/x;

    .line 105
    .line 106
    const/4 v7, 0x5

    .line 107
    const/4 v8, 0x0

    .line 108
    const-string v9, "DOCUMENTS"

    .line 109
    .line 110
    invoke-direct {v5, v9, v7, v8, v6}, Lr3/x;-><init>(Ljava/lang/String;ILjava/util/List;I)V

    .line 111
    .line 112
    .line 113
    sput-object v5, Lr3/x;->o:Lr3/x;

    .line 114
    .line 115
    filled-new-array/range {v0 .. v5}, [Lr3/x;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lr3/x;->p:[Lr3/x;

    .line 120
    .line 121
    invoke-static {v0}, Lz2/b;->g([Ljava/lang/Enum;)Lz3/b;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sput-object v0, Lr3/x;->q:Lz3/b;

    .line 126
    .line 127
    new-instance v0, Lt2/i;

    .line 128
    .line 129
    const/16 v1, 0x1b

    .line 130
    .line 131
    invoke-direct {v0, v1}, Lt2/i;-><init>(I)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lr3/x;->i:Lt2/i;

    .line 135
    .line 136
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/util/List;I)V
    .locals 1

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 4
    sget-object p3, Lu3/o;->g:Lu3/o;

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, v0, p3}, Lr3/x;-><init>(Ljava/lang/String;IZLjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZLjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-boolean p3, p0, Lr3/x;->g:Z

    .line 3
    iput-object p4, p0, Lr3/x;->h:Ljava/util/List;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr3/x;
    .locals 1

    .line 1
    const-class v0, Lr3/x;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lr3/x;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lr3/x;
    .locals 1

    .line 1
    sget-object v0, Lr3/x;->p:[Lr3/x;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lr3/x;

    .line 8
    .line 9
    return-object v0
.end method
