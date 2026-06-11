.class public final synthetic Lcom/getcapacitor/plugin/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lcom/getcapacitor/plugin/SystemBars;

.field public final synthetic h:F

.field public final synthetic i:F

.field public final synthetic j:F

.field public final synthetic k:F


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/plugin/SystemBars;FFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/getcapacitor/plugin/d;->g:Lcom/getcapacitor/plugin/SystemBars;

    iput p2, p0, Lcom/getcapacitor/plugin/d;->h:F

    iput p3, p0, Lcom/getcapacitor/plugin/d;->i:F

    iput p4, p0, Lcom/getcapacitor/plugin/d;->j:F

    iput p5, p0, Lcom/getcapacitor/plugin/d;->k:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/getcapacitor/plugin/d;->j:F

    iget v1, p0, Lcom/getcapacitor/plugin/d;->k:F

    iget-object v2, p0, Lcom/getcapacitor/plugin/d;->g:Lcom/getcapacitor/plugin/SystemBars;

    iget v3, p0, Lcom/getcapacitor/plugin/d;->h:F

    iget v4, p0, Lcom/getcapacitor/plugin/d;->i:F

    invoke-static {v2, v3, v4, v0, v1}, Lcom/getcapacitor/plugin/SystemBars;->d(Lcom/getcapacitor/plugin/SystemBars;FFFF)V

    return-void
.end method
