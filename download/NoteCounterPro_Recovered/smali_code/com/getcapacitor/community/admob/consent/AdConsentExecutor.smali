.class public Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;
.super Lcom/getcapacitor/community/admob/models/Executor;
.source "SourceFile"


# instance fields
.field private consentInformation:Li3/h;


# direct methods
.method public constructor <init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le0/d;",
            "Le0/d;",
            "Lx2/a;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v5, "AdConsentExecutor"

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v4, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/getcapacitor/community/admob/models/Executor;-><init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->lambda$requestConsentInfo$0(Lcom/getcapacitor/PluginCall;)V

    return-void
.end method

.method public static synthetic b(Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;Lcom/getcapacitor/PluginCall;Li3/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->lambda$showConsentForm$4(Lcom/getcapacitor/PluginCall;Li3/j;)V

    return-void
.end method

.method public static synthetic c(Lcom/getcapacitor/PluginCall;Li3/j;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->lambda$showPrivacyOptionsForm$2(Lcom/getcapacitor/PluginCall;Li3/j;)V

    return-void
.end method

.method public static synthetic d(Landroid/app/Activity;Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->lambda$showPrivacyOptionsForm$3(Landroid/app/Activity;Lcom/getcapacitor/PluginCall;)V

    return-void
.end method

.method public static synthetic e(Lcom/getcapacitor/PluginCall;Li3/j;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->lambda$requestConsentInfo$1(Lcom/getcapacitor/PluginCall;Li3/j;)V

    return-void
.end method

.method private ensureConsentInfo()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->contextSupplier:Le0/d;

    .line 6
    .line 7
    invoke-interface {v0}, Le0/d;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/google/android/gms/internal/consent_sdk/zza;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/consent_sdk/zza;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/consent_sdk/zza;->zzb()Lcom/google/android/gms/internal/consent_sdk/zzj;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public static synthetic f(Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;Landroid/app/Activity;Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->lambda$showConsentForm$5(Landroid/app/Activity;Lcom/getcapacitor/PluginCall;)V

    return-void
.end method

.method private getConsentStatusString(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    const-string p1, "UNKNOWN"

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    const-string p1, "OBTAINED"

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_1
    const-string p1, "REQUIRED"

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_2
    const-string p1, "NOT_REQUIRED"

    .line 20
    .line 21
    return-object p1
.end method

.method private synthetic lambda$requestConsentInfo$0(Lcom/getcapacitor/PluginCall;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 7
    .line 8
    invoke-interface {v1}, Li3/h;->getConsentStatus()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {p0, v1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->getConsentStatusString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "status"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 22
    .line 23
    invoke-interface {v1}, Li3/h;->isConsentFormAvailable()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const-string v2, "isConsentFormAvailable"

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 33
    .line 34
    invoke-interface {v1}, Li3/h;->canRequestAds()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const-string v2, "canRequestAds"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 44
    .line 45
    invoke-interface {v1}, Li3/h;->getPrivacyOptionsRequirementStatus()Li3/g;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "privacyOptionsRequirementStatus"

    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private static lambda$requestConsentInfo$1(Lcom/getcapacitor/PluginCall;Li3/j;)V
    .locals 0

    .line 1
    iget-object p1, p1, Li3/j;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private lambda$showConsentForm$4(Lcom/getcapacitor/PluginCall;Li3/j;)V
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string v0, "Error when show consent form"

    .line 4
    .line 5
    iget-object p2, p2, Li3/j;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1, v0, p2}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p2, Lcom/getcapacitor/JSObject;

    .line 12
    .line 13
    invoke-direct {p2}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 17
    .line 18
    invoke-interface {v0}, Li3/h;->getConsentStatus()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-direct {p0, v0}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->getConsentStatusString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "status"

    .line 27
    .line 28
    invoke-virtual {p2, v1, v0}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 32
    .line 33
    invoke-interface {v0}, Li3/h;->canRequestAds()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const-string v1, "canRequestAds"

    .line 38
    .line 39
    invoke-virtual {p2, v1, v0}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 43
    .line 44
    invoke-interface {v0}, Li3/h;->getPrivacyOptionsRequirementStatus()Li3/g;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "privacyOptionsRequirementStatus"

    .line 53
    .line 54
    invoke-virtual {p2, v1, v0}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private lambda$showConsentForm$5(Landroid/app/Activity;Lcom/getcapacitor/PluginCall;)V
    .locals 2

    .line 1
    new-instance v0, La2/a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, La2/a;-><init>(Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;Lcom/getcapacitor/PluginCall;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/consent_sdk/zza;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/consent_sdk/zza;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p2}, Lcom/google/android/gms/internal/consent_sdk/zza;->zzb()Lcom/google/android/gms/internal/consent_sdk/zzj;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/internal/consent_sdk/zzj;->canRequestAds()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {v0, p1}, La2/a;->a(Li3/j;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/consent_sdk/zza;->zzd()Lcom/google/android/gms/internal/consent_sdk/zzcr;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/google/android/gms/internal/consent_sdk/zzcr;->zzc()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/google/android/gms/internal/consent_sdk/zza;->zzc()Lcom/google/android/gms/internal/consent_sdk/zzbq;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {}, Lcom/google/android/gms/internal/consent_sdk/zzcz;->zza()V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lcom/google/android/gms/internal/consent_sdk/zzbo;

    .line 40
    .line 41
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/consent_sdk/zzbo;-><init>(Landroid/app/Activity;Li3/c;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, Lcom/google/android/gms/internal/consent_sdk/zzbp;

    .line 45
    .line 46
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/consent_sdk/zzbp;-><init>(Li3/c;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-virtual {p2, v1, p1, v0}, Lcom/google/android/gms/internal/consent_sdk/zzbq;->zzb(Li3/l;Li3/k;Z)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private static lambda$showPrivacyOptionsForm$2(Lcom/getcapacitor/PluginCall;Li3/j;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "Error when show privacy form"

    .line 4
    .line 5
    iget-object p1, p1, Li3/j;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static lambda$showPrivacyOptionsForm$3(Landroid/app/Activity;Lcom/getcapacitor/PluginCall;)V
    .locals 1

    .line 1
    new-instance v0, La2/e;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La2/e;-><init>(Lcom/getcapacitor/PluginCall;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/google/android/gms/internal/consent_sdk/zza;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/consent_sdk/zza;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/consent_sdk/zza;->zzc()Lcom/google/android/gms/internal/consent_sdk/zzbq;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/internal/consent_sdk/zzbq;->zze(Landroid/app/Activity;Li3/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public requestConsentInfo(Lcom/getcapacitor/PluginCall;Lx2/a;)V
    .locals 7
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lx2/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string p2, "tagForUnderAgeOfConsent"

    .line 2
    .line 3
    const-string v0, "debugGeography"

    .line 4
    .line 5
    const-string v1, "testDeviceIdentifiers"

    .line 6
    .line 7
    :try_start_0
    invoke-direct {p0}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->ensureConsentInfo()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lg/m0;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v3, Li3/a;

    .line 16
    .line 17
    iget-object v4, p0, Lcom/getcapacitor/community/admob/models/Executor;->contextSupplier:Le0/d;

    .line 18
    .line 19
    invoke-interface {v4}, Le0/d;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Landroid/content/Context;

    .line 24
    .line 25
    invoke-direct {v3, v4}, Li3/a;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getData()Lcom/getcapacitor/JSObject;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lcom/getcapacitor/PluginCall;->getArray(Ljava/lang/String;)Lcom/getcapacitor/JSArray;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v4, 0x0

    .line 43
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-ge v4, v5, :cond_0

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    iget-object v6, v3, Li3/a;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v6, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catch_0
    move-exception p2

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getData()Lcom/getcapacitor/JSObject;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iput v0, v3, Li3/a;->a:I

    .line 84
    .line 85
    :cond_1
    invoke-virtual {v3}, Li3/a;->b()Li3/b;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, v2, Lg/m0;->h:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->getData()Lcom/getcapacitor/JSObject;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    iput-boolean p2, v2, Lg/m0;->g:Z

    .line 110
    .line 111
    :cond_2
    new-instance p2, Li3/i;

    .line 112
    .line 113
    invoke-direct {p2, v2}, Li3/i;-><init>(Lg/m0;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 117
    .line 118
    invoke-interface {v0}, Le0/d;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-nez v0, :cond_3

    .line 123
    .line 124
    const-string p2, "Trying to request consent info but the Activity is null"

    .line 125
    .line 126
    invoke-virtual {p1, p2}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    iget-object v0, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 131
    .line 132
    iget-object v1, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 133
    .line 134
    invoke-interface {v1}, Le0/d;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Landroid/app/Activity;

    .line 139
    .line 140
    new-instance v2, La2/c;

    .line 141
    .line 142
    const/4 v3, 0x0

    .line 143
    invoke-direct {v2, v3, p0, p1}, La2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    new-instance v3, La2/d;

    .line 147
    .line 148
    invoke-direct {v3, p1}, La2/d;-><init>(Lcom/getcapacitor/PluginCall;)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v0, v1, p2, v2, v3}, Li3/h;->requestConsentInfoUpdate(Landroid/app/Activity;Li3/i;Li3/f;Li3/e;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {p1, v0, p2}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public resetConsentInfo(Lcom/getcapacitor/PluginCall;Lx2/a;)V
    .locals 0
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lx2/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->ensureConsentInfo()V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->consentInformation:Li3/h;

    .line 5
    .line 6
    invoke-interface {p2}, Li3/h;->reset()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public showConsentForm(Lcom/getcapacitor/PluginCall;Lx2/a;)V
    .locals 2
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lx2/a;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p2, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 2
    .line 3
    invoke-interface {p2}, Le0/d;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Landroid/app/Activity;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const-string p2, "Trying to show the consent form but the Activity is null"

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-direct {p0}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->ensureConsentInfo()V

    .line 20
    .line 21
    .line 22
    new-instance v0, La2/f;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, p1, v1}, La2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, v0, p2}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public showPrivacyOptionsForm(Lcom/getcapacitor/PluginCall;Lx2/a;)V
    .locals 2
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lx2/a;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p2, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 2
    .line 3
    invoke-interface {p2}, Le0/d;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Landroid/app/Activity;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const-string p2, "Trying to show the privacy options form but the Activity is null"

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-direct {p0}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->ensureConsentInfo()V

    .line 20
    .line 21
    .line 22
    new-instance v0, La2/b;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1, p2, p1}, La2/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, v0, p2}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
