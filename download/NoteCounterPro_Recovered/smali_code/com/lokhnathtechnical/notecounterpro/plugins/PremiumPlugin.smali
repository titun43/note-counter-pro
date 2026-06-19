.class public Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;
.super Lcom/getcapacitor/Plugin;
.source "SourceFile"

# interfaces
.implements Ly1/i;


# annotations
.annotation runtime Lcom/getcapacitor/annotation/CapacitorPlugin;
    name = "PremiumPlugin"
    permissions = {}
.end annotation


# static fields
.field private static final PREMIUM_PRODUCT_ID:Ljava/lang/String; = "note_counter_pro_premium"

.field private static final TAG:Ljava/lang/String; = "PremiumPlugin"


# instance fields
.field private billingClient:Ly1/a;

.field private isBillingReady:Z

.field private pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

.field private premiumProductDetails:Ly1/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/Plugin;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->isBillingReady:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic c(Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;Ly1/e;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->lambda$queryProductDetails$0(Ly1/e;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic d(Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;Lcom/android/billingclient/api/Purchase;Ly1/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->lambda$handlePurchase$1(Lcom/android/billingclient/api/Purchase;Ly1/e;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Lcom/getcapacitor/PluginCall;Ly1/e;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->lambda$restorePurchases$2(Lcom/getcapacitor/PluginCall;Ly1/e;Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic f(Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->isBillingReady:Z

    return-void
.end method

.method public static bridge synthetic g(Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->queryProductDetails()V

    return-void
.end method

.method private handlePurchase(Lcom/android/billingclient/api/Purchase;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lcom/android/billingclient/api/Purchase;->c:Lorg/json/JSONObject;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/android/billingclient/api/Purchase;->c:Lorg/json/JSONObject;

    .line 4
    .line 5
    const-string v2, "purchaseState"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v4, 0x4

    .line 13
    if-eq v0, v4, :cond_1

    .line 14
    .line 15
    const-string v0, "token"

    .line 16
    .line 17
    const-string v2, "purchaseToken"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    new-instance v1, Landroidx/emoji2/text/r;

    .line 30
    .line 31
    invoke-direct {v1}, Landroidx/emoji2/text/r;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, v1, Landroidx/emoji2/text/r;->h:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->billingClient:Ly1/a;

    .line 37
    .line 38
    new-instance v2, La2/c;

    .line 39
    .line 40
    const/4 v3, 0x2

    .line 41
    invoke-direct {v2, v3, p0, p1}, La2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Ly1/a;->a(La2/c;Landroidx/emoji2/text/r;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    const-string v0, "Purchase token must be set"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_1
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eq p1, v4, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    const-string v0, "Purchase is pending"

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    iput-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 74
    .line 75
    :cond_3
    :goto_0
    return-void
.end method

.method private lambda$handlePurchase$1(Lcom/android/billingclient/api/Purchase;Ly1/e;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget p3, p2, Ly1/e;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    iget-object p2, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    new-instance p2, Lcom/getcapacitor/JSObject;

    .line 11
    .line 12
    invoke-direct {p2}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string p3, "success"

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {p2, p3, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->a()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 p3, 0x0

    .line 26
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    const-string p3, "productId"

    .line 33
    .line 34
    invoke-virtual {p2, p3, p1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    new-instance p3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "Consume failed: "

    .line 52
    .line 53
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p2, Ly1/e;->b:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p1, p2}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 69
    .line 70
    :cond_1
    return-void
.end method

.method private lambda$queryProductDetails$0(Ly1/e;Ljava/util/List;)V
    .locals 2

    .line 1
    iget v0, p1, Ly1/e;->a:I

    .line 2
    .line 3
    const-string v1, "PremiumPlugin"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ly1/h;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 21
    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string p2, "Premium product found: "

    .line 25
    .line 26
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 30
    .line 31
    iget-object p2, p2, Ly1/h;->e:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v0, "Product details query failed: "

    .line 47
    .line 48
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Ly1/e;->b:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private static lambda$restorePurchases$2(Lcom/getcapacitor/PluginCall;Ly1/e;Ljava/util/List;)V
    .locals 2

    .line 1
    iget v0, p1, Ly1/e;->a:I

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lcom/android/billingclient/api/Purchase;

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/android/billingclient/api/Purchase;->a()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "note_counter_pro_premium"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object p2, p2, Lcom/android/billingclient/api/Purchase;->c:Lorg/json/JSONObject;

    .line 34
    .line 35
    const-string v0, "purchaseState"

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    const/4 v0, 0x4

    .line 43
    if-eq p2, v0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v1, 0x0

    .line 47
    :goto_0
    new-instance p1, Lcom/getcapacitor/JSObject;

    .line 48
    .line 49
    invoke-direct {p1}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string p2, "restored"

    .line 53
    .line 54
    invoke-virtual {p1, p2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v0, "Failed to query purchases: "

    .line 64
    .line 65
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p1, Ly1/e;->b:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p0, p1}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private queryProductDetails()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->isBillingReady:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ly1/j;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    new-instance v1, Lk1/j;

    .line 20
    .line 21
    const/16 v2, 0x1a

    .line 22
    .line 23
    invoke-direct {v1, v2}, Lk1/j;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_4

    .line 31
    .line 32
    new-instance v2, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/4 v4, 0x0

    .line 42
    :goto_0
    if-ge v4, v3, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    check-cast v5, Ly1/j;

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const-string v5, "inapp"

    .line 56
    .line 57
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    const/4 v3, 0x1

    .line 66
    if-gt v2, v3, :cond_3

    .line 67
    .line 68
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzco;->zzk(Ljava/util/Collection;)Lcom/google/android/gms/internal/play_billing/zzco;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, v1, Lk1/j;->h:Ljava/lang/Object;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    new-instance v0, Lu1/f;

    .line 77
    .line 78
    invoke-direct {v0, v1}, Lu1/f;-><init>(Lk1/j;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->billingClient:Ly1/a;

    .line 82
    .line 83
    new-instance v2, Lcom/getcapacitor/plugin/c;

    .line 84
    .line 85
    const/4 v3, 0x2

    .line 86
    invoke-direct {v2, p0, v3}, Lcom/getcapacitor/plugin/c;-><init>(Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v0, v2}, Ly1/a;->c(Lu1/f;Lcom/getcapacitor/plugin/c;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    const-string v1, "Product list must be set to a non empty list."

    .line 96
    .line 97
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    const-string v1, "All products should be of the same product type."

    .line 104
    .line 105
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    const-string v1, "Product list cannot be empty."

    .line 112
    .line 113
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0
.end method

.method private setupBillingClient()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/emoji2/text/g;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroidx/emoji2/text/g;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p0, v1, Landroidx/emoji2/text/g;->c:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance v2, Ly0/c;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v2, v1, Landroidx/emoji2/text/g;->a:Ljava/lang/Object;

    .line 18
    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    iget-object v2, v1, Landroidx/emoji2/text/g;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;

    .line 24
    .line 25
    if-eqz v2, :cond_4

    .line 26
    .line 27
    iget-object v2, v1, Landroidx/emoji2/text/g;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Ly0/c;

    .line 30
    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    iget-object v2, v1, Landroidx/emoji2/text/g;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ly0/c;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v2, v1, Landroidx/emoji2/text/g;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iget-object v2, v1, Landroidx/emoji2/text/g;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ly0/c;

    .line 49
    .line 50
    iget-object v3, v1, Landroidx/emoji2/text/g;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->a()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    new-instance v1, Ly1/w;

    .line 61
    .line 62
    invoke-direct {v1, v2, v0, v3}, Ly1/w;-><init>(Ly0/c;Landroid/content/Context;Ly1/i;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    new-instance v1, Ly1/b;

    .line 67
    .line 68
    invoke-direct {v1, v2, v0, v3}, Ly1/b;-><init>(Ly0/c;Landroid/content/Context;Ly1/i;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iget-object v2, v1, Landroidx/emoji2/text/g;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Ly0/c;

    .line 75
    .line 76
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->a()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    new-instance v1, Ly1/w;

    .line 83
    .line 84
    invoke-direct {v1, v2, v0}, Ly1/w;-><init>(Ly0/c;Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    new-instance v1, Ly1/b;

    .line 89
    .line 90
    invoke-direct {v1, v2, v0}, Ly1/b;-><init>(Ly0/c;Landroid/content/Context;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    iput-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->billingClient:Ly1/a;

    .line 94
    .line 95
    new-instance v0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin$1;

    .line 96
    .line 97
    invoke-direct {v0, p0}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin$1;-><init>(Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v0}, Ly1/b;->e(Ly1/c;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 105
    .line 106
    const-string v1, "Pending purchases for one-time products must be supported."

    .line 107
    .line 108
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 113
    .line 114
    const-string v1, "Please provide a valid listener for purchases updates."

    .line 115
    .line 116
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    const-string v1, "Please provide a valid Context."

    .line 123
    .line 124
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0
.end method


# virtual methods
.method public isPremiumAvailable(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-string v2, "available"

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-string v2, "productId"

    .line 23
    .line 24
    iget-object v1, v1, Ly1/h;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 30
    .line 31
    iget-object v1, v1, Ly1/h;->e:Ljava/lang/String;

    .line 32
    .line 33
    const-string v2, "title"

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 39
    .line 40
    iget-object v1, v1, Ly1/h;->f:Ljava/lang/String;

    .line 41
    .line 42
    const-string v2, "description"

    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 48
    .line 49
    invoke-virtual {v1}, Ly1/h;->a()Ly1/g;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    iget-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 56
    .line 57
    invoke-virtual {v1}, Ly1/h;->a()Ly1/g;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v1, v1, Ly1/g;->a:Ljava/lang/String;

    .line 62
    .line 63
    const-string v2, "price"

    .line 64
    .line 65
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 69
    .line 70
    invoke-virtual {v1}, Ly1/h;->a()Ly1/g;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v1, v1, Ly1/g;->b:Ljava/lang/String;

    .line 75
    .line 76
    const-string v2, "currency"

    .line 77
    .line 78
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public load()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/getcapacitor/Plugin;->load()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->setupBillingClient()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onPurchasesUpdated(Ly1/e;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/e;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget v0, p1, Ly1/e;->a:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_2

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Lcom/android/billingclient/api/Purchase;

    .line 22
    .line 23
    invoke-direct {p0, p2}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->handlePurchase(Lcom/android/billingclient/api/Purchase;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p2, 0x1

    .line 28
    const/4 v1, 0x0

    .line 29
    if-ne v0, p2, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    const-string p2, "Purchase cancelled"

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-object p2, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "Purchase failed: "

    .line 50
    .line 51
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, Ly1/e;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p2, p1}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 67
    .line 68
    :cond_2
    return-void
.end method

.method public purchasePremium(Lcom/getcapacitor/PluginCall;)V
    .locals 8
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->isBillingReady:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Billing not ready. Please try again."

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, "Premium product not available"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iput-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    const-string v0, "Activity not available"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    new-instance v2, Landroidx/emoji2/text/p;

    .line 39
    .line 40
    const/16 v3, 0x17

    .line 41
    .line 42
    invoke-direct {v2, v3}, Landroidx/emoji2/text/p;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->premiumProductDetails:Ly1/h;

    .line 46
    .line 47
    iput-object v3, v2, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v3}, Ly1/h;->a()Ly1/g;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    invoke-virtual {v3}, Ly1/h;->a()Ly1/g;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ly1/h;->a()Ly1/g;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget-object v3, v3, Ly1/g;->c:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    iput-object v3, v2, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 71
    .line 72
    :cond_3
    iget-object v3, v2, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Ly1/h;

    .line 75
    .line 76
    const-string v4, "ProductDetails is required for constructing ProductDetailsParams."

    .line 77
    .line 78
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/zzbe;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    iget-object v3, v2, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, Ly1/h;

    .line 84
    .line 85
    iget-object v3, v3, Ly1/h;->i:Ljava/util/ArrayList;

    .line 86
    .line 87
    if-eqz v3, :cond_4

    .line 88
    .line 89
    iget-object v3, v2, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Ljava/lang/String;

    .line 92
    .line 93
    const-string v4, "offerToken is required for constructing ProductDetailsParams for subscriptions."

    .line 94
    .line 95
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/zzbe;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :cond_4
    new-instance v3, Ly1/d;

    .line 99
    .line 100
    invoke-direct {v3, v2}, Ly1/d;-><init>(Landroidx/emoji2/text/p;)V

    .line 101
    .line 102
    .line 103
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    new-instance v3, Ljava/util/ArrayList;

    .line 108
    .line 109
    const/4 v4, 0x1

    .line 110
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 111
    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    aget-object v2, v2, v5

    .line 115
    .line 116
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    new-instance v3, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-nez v2, :cond_b

    .line 136
    .line 137
    new-instance v6, Ly1/y;

    .line 138
    .line 139
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 143
    .line 144
    .line 145
    new-instance v6, Ld1/a;

    .line 146
    .line 147
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    if-nez v2, :cond_5

    .line 151
    .line 152
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Ly1/d;

    .line 157
    .line 158
    iget-object v2, v2, Ly1/d;->a:Ly1/h;

    .line 159
    .line 160
    iget-object v2, v2, Ly1/h;->b:Lorg/json/JSONObject;

    .line 161
    .line 162
    const-string v7, "packageName"

    .line 163
    .line 164
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-nez v2, :cond_5

    .line 173
    .line 174
    move v2, v4

    .line 175
    goto :goto_0

    .line 176
    :cond_5
    move v2, v5

    .line 177
    :goto_0
    iput-boolean v2, v6, Ld1/a;->a:Z

    .line 178
    .line 179
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_7

    .line 184
    .line 185
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-nez v2, :cond_6

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_6
    move v4, v5

    .line 193
    :cond_7
    :goto_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v4, :cond_9

    .line 198
    .line 199
    if-eqz v2, :cond_8

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 203
    .line 204
    const-string v0, "Please provide Old SKU purchase information(token/id) or original external transaction id, not both."

    .line 205
    .line 206
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p1

    .line 210
    :cond_9
    :goto_2
    new-instance v2, Ly0/c;

    .line 211
    .line 212
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 213
    .line 214
    .line 215
    iput-object v2, v6, Ld1/a;->b:Ljava/lang/Object;

    .line 216
    .line 217
    new-instance v2, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 220
    .line 221
    .line 222
    iput-object v2, v6, Ld1/a;->d:Ljava/lang/Object;

    .line 223
    .line 224
    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/zzco;->zzk(Ljava/util/Collection;)Lcom/google/android/gms/internal/play_billing/zzco;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    iput-object v2, v6, Ld1/a;->c:Ljava/io/Serializable;

    .line 229
    .line 230
    iget-object v2, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->billingClient:Ly1/a;

    .line 231
    .line 232
    invoke-virtual {v2, v0, v6}, Ly1/a;->b(Lg/k;Ld1/a;)Ly1/e;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    iget v2, v0, Ly1/e;->a:I

    .line 237
    .line 238
    if-eqz v2, :cond_a

    .line 239
    .line 240
    new-instance v2, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    const-string v3, "Billing flow failed: "

    .line 243
    .line 244
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iget-object v0, v0, Ly1/e;->b:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    iput-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->pendingPurchaseCall:Lcom/getcapacitor/PluginCall;

    .line 260
    .line 261
    :cond_a
    return-void

    .line 262
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 263
    .line 264
    const-string v0, "Details of the products must be provided."

    .line 265
    .line 266
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p1
.end method

.method public restorePurchases(Lcom/getcapacitor/PluginCall;)V
    .locals 9
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->isBillingReady:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Billing not ready"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->billingClient:Ly1/a;

    .line 12
    .line 13
    new-instance v1, La2/d;

    .line 14
    .line 15
    invoke-direct {v1, p1}, La2/d;-><init>(Lcom/getcapacitor/PluginCall;)V

    .line 16
    .line 17
    .line 18
    check-cast v0, Ly1/b;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ly1/b;->d()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/16 v2, 0x9

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    sget-object p1, Ly1/b0;->i:Ly1/e;

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-virtual {v0, v3, v2, p1}, Ly1/b;->t(IILy1/e;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v1, p1, v0}, La2/d;->a(Ly1/e;Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const-string p1, "inapp"

    .line 46
    .line 47
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    const-string p1, "BillingClient"

    .line 54
    .line 55
    const-string v3, "Please provide a valid product type."

    .line 56
    .line 57
    invoke-static {p1, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object p1, Ly1/b0;->e:Ly1/e;

    .line 61
    .line 62
    const/16 v3, 0x32

    .line 63
    .line 64
    invoke-virtual {v0, v3, v2, p1}, Ly1/b;->t(IILy1/e;)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v1, p1, v0}, La2/d;->a(Ly1/e;Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    new-instance v3, Ly1/n;

    .line 76
    .line 77
    invoke-direct {v3, v0, v1}, Ly1/n;-><init>(Ly1/b;La2/d;)V

    .line 78
    .line 79
    .line 80
    new-instance v6, Lc0/a;

    .line 81
    .line 82
    const/16 p1, 0x17

    .line 83
    .line 84
    invoke-direct {v6, p1, v0, v1}, Lc0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ly1/b;->r()Landroid/os/Handler;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v0}, Ly1/b;->j()Ljava/util/concurrent/ExecutorService;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    const-wide/16 v4, 0x7530

    .line 96
    .line 97
    invoke-static/range {v3 .. v8}, Ly1/b;->f(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-nez p1, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0}, Ly1/b;->g()Ly1/e;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const/16 v3, 0x19

    .line 108
    .line 109
    invoke-virtual {v0, v3, v2, p1}, Ly1/b;->t(IILy1/e;)V

    .line 110
    .line 111
    .line 112
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v1, p1, v0}, La2/d;->a(Ly1/e;Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    return-void
.end method
