.class public final enum Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lz3/a;

.field private static final synthetic $VALUES:[Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

.field public static final enum ADAPTIVE_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

.field public static final enum BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

.field public static final enum FULL_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

.field public static final enum LARGE_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

.field public static final enum LEADERBOARD:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

.field public static final enum MEDIUM_RECTANGLE:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

.field public static final enum SMART_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;


# instance fields
.field private final size:Lcom/google/android/gms/ads/AdSize;


# direct methods
.method private static final synthetic $values()[Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;
    .locals 7

    sget-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    sget-object v1, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->FULL_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    sget-object v2, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->LARGE_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    sget-object v3, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->MEDIUM_RECTANGLE:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    sget-object v4, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->LEADERBOARD:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    sget-object v5, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->ADAPTIVE_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    sget-object v6, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->SMART_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    filled-new-array/range {v0 .. v6}, [Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 2
    .line 3
    sget-object v1, Lcom/google/android/gms/ads/AdSize;->BANNER:Lcom/google/android/gms/ads/AdSize;

    .line 4
    .line 5
    const-string v2, "BANNER"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v0, v2, v3, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;-><init>(Ljava/lang/String;ILcom/google/android/gms/ads/AdSize;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 15
    .line 16
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 17
    .line 18
    sget-object v1, Lcom/google/android/gms/ads/AdSize;->FULL_BANNER:Lcom/google/android/gms/ads/AdSize;

    .line 19
    .line 20
    const-string v2, "FULL_BANNER"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-direct {v0, v2, v3, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;-><init>(Ljava/lang/String;ILcom/google/android/gms/ads/AdSize;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->FULL_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 30
    .line 31
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 32
    .line 33
    sget-object v1, Lcom/google/android/gms/ads/AdSize;->LARGE_BANNER:Lcom/google/android/gms/ads/AdSize;

    .line 34
    .line 35
    const-string v2, "LARGE_BANNER"

    .line 36
    .line 37
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x2

    .line 41
    invoke-direct {v0, v2, v3, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;-><init>(Ljava/lang/String;ILcom/google/android/gms/ads/AdSize;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->LARGE_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 45
    .line 46
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 47
    .line 48
    sget-object v1, Lcom/google/android/gms/ads/AdSize;->MEDIUM_RECTANGLE:Lcom/google/android/gms/ads/AdSize;

    .line 49
    .line 50
    const-string v2, "MEDIUM_RECTANGLE"

    .line 51
    .line 52
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x3

    .line 56
    invoke-direct {v0, v2, v3, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;-><init>(Ljava/lang/String;ILcom/google/android/gms/ads/AdSize;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->MEDIUM_RECTANGLE:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 60
    .line 61
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 62
    .line 63
    sget-object v1, Lcom/google/android/gms/ads/AdSize;->LEADERBOARD:Lcom/google/android/gms/ads/AdSize;

    .line 64
    .line 65
    const-string v2, "LEADERBOARD"

    .line 66
    .line 67
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 v3, 0x4

    .line 71
    invoke-direct {v0, v2, v3, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;-><init>(Ljava/lang/String;ILcom/google/android/gms/ads/AdSize;)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->LEADERBOARD:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 75
    .line 76
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 77
    .line 78
    sget-object v1, Lcom/google/android/gms/ads/AdSize;->INVALID:Lcom/google/android/gms/ads/AdSize;

    .line 79
    .line 80
    const-string v2, "INVALID"

    .line 81
    .line 82
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v2, "ADAPTIVE_BANNER"

    .line 86
    .line 87
    const/4 v3, 0x5

    .line 88
    invoke-direct {v0, v2, v3, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;-><init>(Ljava/lang/String;ILcom/google/android/gms/ads/AdSize;)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->ADAPTIVE_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 92
    .line 93
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 94
    .line 95
    sget-object v1, Lcom/google/android/gms/ads/AdSize;->SMART_BANNER:Lcom/google/android/gms/ads/AdSize;

    .line 96
    .line 97
    const-string v2, "SMART_BANNER"

    .line 98
    .line 99
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 v3, 0x6

    .line 103
    invoke-direct {v0, v2, v3, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;-><init>(Ljava/lang/String;ILcom/google/android/gms/ads/AdSize;)V

    .line 104
    .line 105
    .line 106
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->SMART_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 107
    .line 108
    invoke-static {}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->$values()[Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->$VALUES:[Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 113
    .line 114
    invoke-static {v0}, Lz2/b;->g([Ljava/lang/Enum;)Lz3/b;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sput-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->$ENTRIES:Lz3/a;

    .line 119
    .line 120
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/google/android/gms/ads/AdSize;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/ads/AdSize;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->size:Lcom/google/android/gms/ads/AdSize;

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
    sget-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->$ENTRIES:Lz3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;
    .locals 1

    const-class v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    return-object p0
.end method

.method public static values()[Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;
    .locals 1

    sget-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->$VALUES:[Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    return-object v0
.end method


# virtual methods
.method public final getSize()Lcom/google/android/gms/ads/AdSize;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->size:Lcom/google/android/gms/ads/AdSize;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
