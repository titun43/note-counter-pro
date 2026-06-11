.class public final enum Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;",
        ">;",
        "Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

.field public static final enum ERROR:Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

.field public static final enum SUCCESS:Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

.field public static final enum WARNING:Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;


# instance fields
.field private final amplitudes:[I

.field private final oldSDKPattern:[J

.field private final timings:[J

.field private final type:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;
    .locals 3

    .line 1
    sget-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->SUCCESS:Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 2
    .line 3
    sget-object v1, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->WARNING:Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 4
    .line 5
    sget-object v2, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->ERROR:Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 2
    .line 3
    const/4 v7, 0x4

    .line 4
    new-array v4, v7, [J

    .line 5
    .line 6
    fill-array-data v4, :array_0

    .line 7
    .line 8
    .line 9
    const/16 v1, 0xb4

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/16 v9, 0xfa

    .line 13
    .line 14
    filled-new-array {v8, v9, v8, v1}, [I

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    new-array v6, v7, [J

    .line 19
    .line 20
    fill-array-data v6, :array_1

    .line 21
    .line 22
    .line 23
    const-string v1, "SUCCESS"

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const-string v3, "SUCCESS"

    .line 27
    .line 28
    invoke-direct/range {v0 .. v6}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;-><init>(Ljava/lang/String;ILjava/lang/String;[J[I[J)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->SUCCESS:Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 32
    .line 33
    new-instance v10, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 34
    .line 35
    const/4 v0, 0x6

    .line 36
    new-array v14, v0, [J

    .line 37
    .line 38
    fill-array-data v14, :array_2

    .line 39
    .line 40
    .line 41
    new-array v15, v0, [I

    .line 42
    .line 43
    fill-array-data v15, :array_3

    .line 44
    .line 45
    .line 46
    new-array v0, v0, [J

    .line 47
    .line 48
    fill-array-data v0, :array_4

    .line 49
    .line 50
    .line 51
    const-string v11, "WARNING"

    .line 52
    .line 53
    const/4 v12, 0x1

    .line 54
    const-string v13, "WARNING"

    .line 55
    .line 56
    move-object/from16 v16, v0

    .line 57
    .line 58
    invoke-direct/range {v10 .. v16}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;-><init>(Ljava/lang/String;ILjava/lang/String;[J[I[J)V

    .line 59
    .line 60
    .line 61
    sput-object v10, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->WARNING:Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 62
    .line 63
    new-instance v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 64
    .line 65
    new-array v4, v7, [J

    .line 66
    .line 67
    fill-array-data v4, :array_5

    .line 68
    .line 69
    .line 70
    const/16 v1, 0x78

    .line 71
    .line 72
    filled-new-array {v8, v1, v8, v9}, [I

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    new-array v6, v7, [J

    .line 77
    .line 78
    fill-array-data v6, :array_6

    .line 79
    .line 80
    .line 81
    const-string v1, "ERROR"

    .line 82
    .line 83
    const/4 v2, 0x2

    .line 84
    const-string v3, "ERROR"

    .line 85
    .line 86
    invoke-direct/range {v0 .. v6}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;-><init>(Ljava/lang/String;ILjava/lang/String;[J[I[J)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->ERROR:Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 90
    .line 91
    invoke-static {}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->$values()[Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->$VALUES:[Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 96
    .line 97
    return-void

    .line 98
    nop

    .line 99
    :array_0
    .array-data 8
        0x0
        0x23
        0x41
        0x15
    .end array-data

    :array_1
    .array-data 8
        0x0
        0x23
        0x41
        0x15
    .end array-data

    :array_2
    .array-data 8
        0x0
        0x1e
        0x28
        0x1e
        0x32
        0x3c
    .end array-data

    :array_3
    .array-data 4
        0xff
        0xff
        0xff
        0xff
        0xff
        0xff
    .end array-data

    :array_4
    .array-data 8
        0x0
        0x1e
        0x28
        0x1e
        0x32
        0x3c
    .end array-data

    :array_5
    .array-data 8
        0x0
        0x1b
        0x2d
        0x32
    .end array-data

    :array_6
    .array-data 8
        0x0
        0x1b
        0x2d
        0x32
    .end array-data
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;[J[I[J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[J[I[J)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->type:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->timings:[J

    .line 7
    .line 8
    iput-object p5, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->amplitudes:[I

    .line 9
    .line 10
    iput-object p6, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->oldSDKPattern:[J

    .line 11
    .line 12
    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;
    .locals 5

    .line 1
    invoke-static {}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->values()[Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget-object v4, v3, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->type:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    return-object v3

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->SUCCESS:Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 24
    .line 25
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;
    .locals 1

    .line 1
    const-class v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;
    .locals 1

    .line 1
    sget-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->$VALUES:[Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getAmplitudes()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->amplitudes:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public getOldSDKPattern()[J
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->oldSDKPattern:[J

    .line 2
    .line 3
    return-object v0
.end method

.method public getTimings()[J
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->timings:[J

    .line 2
    .line 3
    return-object v0
.end method
