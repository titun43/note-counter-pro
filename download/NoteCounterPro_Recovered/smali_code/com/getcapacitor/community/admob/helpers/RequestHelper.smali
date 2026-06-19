.class public final Lcom/getcapacitor/community/admob/helpers/RequestHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static createRequest(Lcom/getcapacitor/community/admob/models/AdOptions;)Lcom/google/android/gms/ads/AdRequest;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->npa:Z

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    new-instance p0, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "npa"

    .line 16
    .line 17
    const-string v2, "1"

    .line 18
    .line 19
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-class v1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 23
    .line 24
    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/ads/AbstractAdRequestBuilder;->addNetworkExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static getRequestErrorReason(I)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p0, v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    if-eq p0, v0, :cond_0

    .line 15
    .line 16
    const-string p0, "Unknown error"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    const-string p0, "App Id Missing"

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    const-string p0, "No fill"

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    const-string p0, "Network Error"

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_3
    const-string p0, "Invalid request"

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_4
    const-string p0, "Internal error"

    .line 32
    .line 33
    return-object p0
.end method
