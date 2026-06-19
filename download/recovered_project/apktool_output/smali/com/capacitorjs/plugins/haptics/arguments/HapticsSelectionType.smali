.class public Lcom/capacitorjs/plugins/haptics/arguments/HapticsSelectionType;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;


# static fields
.field private static final amplitudes:[I

.field private static final oldSDKPattern:[J

.field private static final timings:[J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [J

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v1, Lcom/capacitorjs/plugins/haptics/arguments/HapticsSelectionType;->timings:[J

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x64

    .line 11
    .line 12
    filled-new-array {v1, v2}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Lcom/capacitorjs/plugins/haptics/arguments/HapticsSelectionType;->amplitudes:[I

    .line 17
    .line 18
    new-array v0, v0, [J

    .line 19
    .line 20
    fill-array-data v0, :array_1

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsSelectionType;->oldSDKPattern:[J

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :array_0
    .array-data 8
        0x0
        0x64
    .end array-data

    :array_1
    .array-data 8
        0x0
        0x46
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getAmplitudes()[I
    .locals 1

    .line 1
    sget-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsSelectionType;->amplitudes:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public getOldSDKPattern()[J
    .locals 1

    .line 1
    sget-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsSelectionType;->oldSDKPattern:[J

    .line 2
    .line 3
    return-object v0
.end method

.method public getTimings()[J
    .locals 1

    .line 1
    sget-object v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsSelectionType;->timings:[J

    .line 2
    .line 3
    return-object v0
.end method
