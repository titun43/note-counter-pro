.class public Lcom/getcapacitor/App;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/getcapacitor/App$AppStatusChangeListener;,
        Lcom/getcapacitor/App$AppRestoredListener;
    }
.end annotation


# instance fields
.field private appRestoredListener:Lcom/getcapacitor/App$AppRestoredListener;

.field private isActive:Z

.field private statusChangeListener:Lcom/getcapacitor/App$AppStatusChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/getcapacitor/App;->isActive:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public fireRestoredResult(Lcom/getcapacitor/PluginResult;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/App;->appRestoredListener:Lcom/getcapacitor/App$AppRestoredListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/getcapacitor/App$AppRestoredListener;->onAppRestored(Lcom/getcapacitor/PluginResult;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public fireStatusChange(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/App;->isActive:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/getcapacitor/App;->statusChangeListener:Lcom/getcapacitor/App$AppStatusChangeListener;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {v0, p1}, Lcom/getcapacitor/App$AppStatusChangeListener;->onAppStatusChanged(Ljava/lang/Boolean;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public isActive()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/App;->isActive:Z

    .line 2
    .line 3
    return v0
.end method

.method public setAppRestoredListener(Lcom/getcapacitor/App$AppRestoredListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/App;->appRestoredListener:Lcom/getcapacitor/App$AppRestoredListener;

    .line 2
    .line 3
    return-void
.end method

.method public setStatusChangeListener(Lcom/getcapacitor/App$AppStatusChangeListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/App;->statusChangeListener:Lcom/getcapacitor/App$AppStatusChangeListener;

    .line 2
    .line 3
    return-void
.end method
