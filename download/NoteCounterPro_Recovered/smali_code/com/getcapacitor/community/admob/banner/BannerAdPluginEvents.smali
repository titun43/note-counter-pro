.class public final enum Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lz3/a;

.field private static final synthetic $VALUES:[Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

.field public static final enum AdImpression:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

.field public static final enum Clicked:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

.field public static final enum Closed:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

.field public static final enum FailedToLoad:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

.field public static final enum Loaded:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

.field public static final enum Opened:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

.field public static final enum SizeChanged:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;


# instance fields
.field private final webEventName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;
    .locals 7

    sget-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->SizeChanged:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    sget-object v1, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Closed:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    sget-object v2, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->FailedToLoad:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    sget-object v3, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Opened:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    sget-object v4, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Loaded:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    sget-object v5, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Clicked:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    sget-object v6, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->AdImpression:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    filled-new-array/range {v0 .. v6}, [Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "bannerAdSizeChanged"

    .line 5
    .line 6
    const-string v3, "SizeChanged"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->SizeChanged:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 12
    .line 13
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "bannerAdClosed"

    .line 17
    .line 18
    const-string v3, "Closed"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Closed:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 24
    .line 25
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "bannerAdFailedToLoad"

    .line 29
    .line 30
    const-string v3, "FailedToLoad"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->FailedToLoad:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 36
    .line 37
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "bannerAdOpened"

    .line 41
    .line 42
    const-string v3, "Opened"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Opened:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 48
    .line 49
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "bannerAdLoaded"

    .line 53
    .line 54
    const-string v3, "Loaded"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Loaded:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 60
    .line 61
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "bannerAdClicked"

    .line 65
    .line 66
    const-string v3, "Clicked"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Clicked:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 72
    .line 73
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "bannerAdImpression"

    .line 77
    .line 78
    const-string v3, "AdImpression"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->AdImpression:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 84
    .line 85
    invoke-static {}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->$values()[Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->$VALUES:[Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 90
    .line 91
    invoke-static {v0}, Lz2/b;->g([Ljava/lang/Enum;)Lz3/b;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->$ENTRIES:Lz3/a;

    .line 96
    .line 97
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->webEventName:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lz3/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz3/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->$ENTRIES:Lz3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;
    .locals 1

    const-class v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    return-object p0
.end method

.method public static values()[Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;
    .locals 1

    sget-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->$VALUES:[Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    return-object v0
.end method


# virtual methods
.method public final getWebEventName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->webEventName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
