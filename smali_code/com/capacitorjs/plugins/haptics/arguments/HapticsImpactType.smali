.class public final enum Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;",
        ">;",
        "Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

.field public static final enum HEAVY:Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

.field public static final enum LIGHT:Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

.field public static final enum MEDIUM:Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;


# instance fields
.field private final amplitudes:[I

.field private final oldSDKPattern:[J

.field private final timings:[J

.field private final type:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;
    .locals 3

    .line 1
    sget-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->LIGHT:Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 2
    .line 3
    sget-object v1, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->MEDIUM:Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 4
    .line 5
    sget-object v2, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->HEAVY:Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 2
    .line 3
    const/4 v7, 0x2

    .line 4
    new-array v4, v7, [J

    .line 5
    .line 6
    fill-array-data v4, :array_0

    .line 7
    .line 8
    .line 9
    const/16 v1, 0x6e

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    filled-new-array {v8, v1}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    new-array v6, v7, [J

    .line 17
    .line 18
    fill-array-data v6, :array_1

    .line 19
    .line 20
    .line 21
    const-string v1, "LIGHT"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const-string v3, "LIGHT"

    .line 25
    .line 26
    invoke-direct/range {v0 .. v6}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;-><init>(Ljava/lang/String;ILjava/lang/String;[J[I[J)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->LIGHT:Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 30
    .line 31
    new-instance v9, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 32
    .line 33
    new-array v13, v7, [J

    .line 34
    .line 35
    fill-array-data v13, :array_2

    .line 36
    .line 37
    .line 38
    const/16 v0, 0xb4

    .line 39
    .line 40
    filled-new-array {v8, v0}, [I

    .line 41
    .line 42
    .line 43
    move-result-object v14

    .line 44
    new-array v15, v7, [J

    .line 45
    .line 46
    fill-array-data v15, :array_3

    .line 47
    .line 48
    .line 49
    const-string v10, "MEDIUM"

    .line 50
    .line 51
    const/4 v11, 0x1

    .line 52
    const-string v12, "MEDIUM"

    .line 53
    .line 54
    invoke-direct/range {v9 .. v15}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;-><init>(Ljava/lang/String;ILjava/lang/String;[J[I[J)V

    .line 55
    .line 56
    .line 57
    sput-object v9, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->MEDIUM:Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 58
    .line 59
    new-instance v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 60
    .line 61
    new-array v4, v7, [J

    .line 62
    .line 63
    fill-array-data v4, :array_4

    .line 64
    .line 65
    .line 66
    const/16 v1, 0xff

    .line 67
    .line 68
    filled-new-array {v8, v1}, [I

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    new-array v6, v7, [J

    .line 73
    .line 74
    fill-array-data v6, :array_5

    .line 75
    .line 76
    .line 77
    const-string v1, "HEAVY"

    .line 78
    .line 79
    const/4 v2, 0x2

    .line 80
    const-string v3, "HEAVY"

    .line 81
    .line 82
    invoke-direct/range {v0 .. v6}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;-><init>(Ljava/lang/String;ILjava/lang/String;[J[I[J)V

    .line 83
    .line 84
    .line 85
    sput-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->HEAVY:Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 86
    .line 87
    invoke-static {}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->$values()[Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sput-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->$VALUES:[Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 92
    .line 93
    return-void

    .line 94
    nop

    .line 95
    :array_0
    .array-data 8
        0x0
        0x32
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
    :array_1
    .array-data 8
        0x0
        0x14
    .end array-data

    :array_2
    .array-data 8
        0x0
        0x2b
    .end array-data

    :array_3
    .array-data 8
        0x0
        0x2b
    .end array-data

    :array_4
    .array-data 8
        0x0
        0x3c
    .end array-data

    :array_5
    .array-data 8
        0x0
        0x3d
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
    iput-object p3, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->type:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->timings:[J

    .line 7
    .line 8
    iput-object p5, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->amplitudes:[I

    .line 9
    .line 10
    iput-object p6, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->oldSDKPattern:[J

    .line 11
    .line 12
    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;
    .locals 5

    .line 1
    invoke-static {}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->values()[Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

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
    iget-object v4, v3, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->type:Ljava/lang/String;

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
    sget-object p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->HEAVY:Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 24
    .line 25
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;
    .locals 1

    .line 1
    const-class v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;
    .locals 1

    .line 1
    sget-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->$VALUES:[Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getAmplitudes()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->amplitudes:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public getOldSDKPattern()[J
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->oldSDKPattern:[J

    .line 2
    .line 3
    return-object v0
.end method

.method public getTimings()[J
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->timings:[J

    .line 2
    .line 3
    return-object v0
.end method
