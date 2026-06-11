.class public final synthetic La2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li3/c;


# instance fields
.field public final synthetic a:Lcom/getcapacitor/PluginCall;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/e;->a:Lcom/getcapacitor/PluginCall;

    return-void
.end method


# virtual methods
.method public final a(Li3/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, La2/e;->a:Lcom/getcapacitor/PluginCall;

    invoke-static {v0, p1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->c(Lcom/getcapacitor/PluginCall;Li3/j;)V

    return-void
.end method
