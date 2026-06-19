.class public Lcom/getcapacitor/ProcessedRoute;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ignoreAssetPath:Z

.field private isAsset:Z

.field private path:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/ProcessedRoute;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public isAsset()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/ProcessedRoute;->isAsset:Z

    .line 2
    .line 3
    return v0
.end method

.method public isIgnoreAssetPath()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/ProcessedRoute;->ignoreAssetPath:Z

    .line 2
    .line 3
    return v0
.end method

.method public setAsset(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/ProcessedRoute;->isAsset:Z

    .line 2
    .line 3
    return-void
.end method

.method public setIgnoreAssetPath(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/ProcessedRoute;->ignoreAssetPath:Z

    .line 2
    .line 3
    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/ProcessedRoute;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
