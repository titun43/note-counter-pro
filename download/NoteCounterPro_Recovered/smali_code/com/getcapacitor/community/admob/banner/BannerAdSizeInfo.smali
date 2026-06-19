.class public final Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;
.super Lcom/getcapacitor/JSObject;
.source "SourceFile"


# instance fields
.field private final height:I

.field private final width:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/JSObject;-><init>()V

    iput p1, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->width:I

    iput p2, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->height:I

    .line 2
    const-string v0, "width"

    invoke-super {p0, v0, p1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;I)Lcom/getcapacitor/JSObject;

    .line 3
    const-string p1, "height"

    invoke-super {p0, p1, p2}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;I)Lcom/getcapacitor/JSObject;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/AdView;)V
    .locals 1

    const-string v0, "mAdView"

    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/ads/BaseAdView;->getAdSize()Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdSize;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/BaseAdView;->getAdSize()Lcom/google/android/gms/ads/AdSize;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdSize;->getHeight()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;-><init>(II)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;IIILjava/lang/Object;)Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->width:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->height:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->copy(II)Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->width:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->height:I

    return v0
.end method

.method public final copy(II)Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;
    .locals 1

    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;

    invoke-direct {v0, p1, p2}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;-><init>(II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;

    iget v1, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->width:I

    iget v3, p1, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->width:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->height:I

    iget p1, p1, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->height:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->height:I

    .line 2
    .line 3
    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->width:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->width:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public put(Ljava/lang/String;I)Lcom/getcapacitor/JSObject;
    .locals 0

    const-string p2, "key"

    invoke-static {p1, p2}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Do not put elements directly here use the constructor"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic put(Ljava/lang/String;I)Lorg/json/JSONObject;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->put(Ljava/lang/String;I)Lcom/getcapacitor/JSObject;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->width:I

    iget v1, p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;->height:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "BannerAdSizeInfo(width="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
