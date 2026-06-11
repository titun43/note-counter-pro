.class public final synthetic Lcom/getcapacitor/plugin/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lcom/getcapacitor/plugin/SystemBars;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/getcapacitor/plugin/e;->g:Lcom/getcapacitor/plugin/SystemBars;

    iput-object p2, p0, Lcom/getcapacitor/plugin/e;->h:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/getcapacitor/plugin/e;->i:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/plugin/e;->h:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/getcapacitor/plugin/e;->i:Z

    iget-object v2, p0, Lcom/getcapacitor/plugin/e;->g:Lcom/getcapacitor/plugin/SystemBars;

    invoke-static {v2, v0, v1}, Lcom/getcapacitor/plugin/SystemBars;->c(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Z)V

    return-void
.end method
