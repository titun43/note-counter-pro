.class Lcom/capacitorjs/plugins/share/SharePlugin$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capacitorjs/plugins/share/SharePlugin;->load()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capacitorjs/plugins/share/SharePlugin;


# direct methods
.method public constructor <init>(Lcom/capacitorjs/plugins/share/SharePlugin;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/capacitorjs/plugins/share/SharePlugin$1;->this$0:Lcom/capacitorjs/plugins/share/SharePlugin;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v0, 0x21

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/capacitorjs/plugins/share/SharePlugin$1;->this$0:Lcom/capacitorjs/plugins/share/SharePlugin;

    .line 8
    .line 9
    invoke-static {p2}, Landroidx/activity/t;->m(Landroid/content/Intent;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Landroid/content/ComponentName;

    .line 14
    .line 15
    invoke-static {p1, p2}, Lcom/capacitorjs/plugins/share/SharePlugin;->c(Lcom/capacitorjs/plugins/share/SharePlugin;Landroid/content/ComponentName;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object p1, p0, Lcom/capacitorjs/plugins/share/SharePlugin$1;->this$0:Lcom/capacitorjs/plugins/share/SharePlugin;

    .line 20
    .line 21
    invoke-static {p1, p2}, Lcom/capacitorjs/plugins/share/SharePlugin;->d(Lcom/capacitorjs/plugins/share/SharePlugin;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {p1, p2}, Lcom/capacitorjs/plugins/share/SharePlugin;->c(Lcom/capacitorjs/plugins/share/SharePlugin;Landroid/content/ComponentName;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
