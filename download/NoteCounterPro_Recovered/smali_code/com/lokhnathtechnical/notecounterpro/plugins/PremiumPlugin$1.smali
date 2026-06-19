.class Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->setupBillingClient()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;


# direct methods
.method public constructor <init>(Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin$1;->this$0:Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onBillingServiceDisconnected()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin$1;->this$0:Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->f(Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;Z)V

    .line 5
    .line 6
    .line 7
    const-string v0, "PremiumPlugin"

    .line 8
    .line 9
    const-string v1, "Billing service disconnected"

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onBillingSetupFinished(Ly1/e;)V
    .locals 3

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
    iget-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin$1;->this$0:Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p1, v0}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->f(Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;Z)V

    .line 11
    .line 12
    .line 13
    const-string p1, "Billing client ready"

    .line 14
    .line 15
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin$1;->this$0:Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->g(Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "Billing setup failed: "

    .line 27
    .line 28
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p1, Ly1/e;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    return-void
.end method
