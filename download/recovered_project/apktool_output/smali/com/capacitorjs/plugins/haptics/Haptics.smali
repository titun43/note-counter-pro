.class public Lcom/capacitorjs/plugins/haptics/Haptics;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private selectionStarted:Z

.field private final vibrator:Landroid/os/Vibrator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/capacitorjs/plugins/haptics/Haptics;->selectionStarted:Z

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    const-string v0, "vibrator_manager"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Ly/e;->d(Ljava/lang/Object;)Landroid/os/VibratorManager;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Ly/e;->c(Landroid/os/VibratorManager;)Landroid/os/Vibrator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/capacitorjs/plugins/haptics/Haptics;->vibrator:Landroid/os/Vibrator;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-direct {p0, p1}, Lcom/capacitorjs/plugins/haptics/Haptics;->getDeprecatedVibrator(Landroid/content/Context;)Landroid/os/Vibrator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/capacitorjs/plugins/haptics/Haptics;->vibrator:Landroid/os/Vibrator;

    .line 35
    .line 36
    return-void
.end method

.method private getDeprecatedVibrator(Landroid/content/Context;)Landroid/os/Vibrator;
    .locals 1

    .line 1
    const-string v0, "vibrator"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/os/Vibrator;

    .line 8
    .line 9
    return-object p1
.end method

.method private vibratePre26(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/Haptics;->vibrator:Landroid/os/Vibrator;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V

    return-void
.end method

.method private vibratePre26([J)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/Haptics;->vibrator:Landroid/os/Vibrator;

    const/4 v1, -0x1

    invoke-virtual {v0, p1, v1}, Landroid/os/Vibrator;->vibrate([JI)V

    return-void
.end method


# virtual methods
.method public performHaptics(Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/Haptics;->vibrator:Landroid/os/Vibrator;

    .line 8
    .line 9
    invoke-interface {p1}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;->getTimings()[J

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p1}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;->getAmplitudes()[I

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {v1, p1}, Lg0/b;->f([J[I)Landroid/os/VibrationEffect;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {v0, p1}, Lg0/b;->r(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-interface {p1}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;->getOldSDKPattern()[J

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Lcom/capacitorjs/plugins/haptics/Haptics;->vibratePre26([J)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public selectionChanged()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/capacitorjs/plugins/haptics/Haptics;->selectionStarted:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/capacitorjs/plugins/haptics/arguments/HapticsSelectionType;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsSelectionType;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/capacitorjs/plugins/haptics/Haptics;->performHaptics(Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public selectionEnd()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/capacitorjs/plugins/haptics/Haptics;->selectionStarted:Z

    .line 3
    .line 4
    return-void
.end method

.method public selectionStart()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/capacitorjs/plugins/haptics/Haptics;->selectionStarted:Z

    .line 3
    .line 4
    return-void
.end method

.method public vibrate(I)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/Haptics;->vibrator:Landroid/os/Vibrator;

    .line 8
    .line 9
    int-to-long v1, p1

    .line 10
    invoke-static {v1, v2}, Lg0/b;->e(J)Landroid/os/VibrationEffect;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {v0, p1}, Lg0/b;->r(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-direct {p0, p1}, Lcom/capacitorjs/plugins/haptics/Haptics;->vibratePre26(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
