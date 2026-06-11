.class public final synthetic Lcom/capacitorjs/plugins/filesystem/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/a;


# instance fields
.field public final synthetic g:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lcom/getcapacitor/PluginCall;

.field public final synthetic j:Lcom/getcapacitor/Bridge;

.field public final synthetic k:Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;

.field public final synthetic l:Landroid/os/Handler;

.field public final synthetic m:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;Ljava/lang/String;Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;Landroid/os/Handler;Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/a;->g:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;

    iput-object p2, p0, Lcom/capacitorjs/plugins/filesystem/a;->h:Ljava/lang/String;

    iput-object p3, p0, Lcom/capacitorjs/plugins/filesystem/a;->i:Lcom/getcapacitor/PluginCall;

    iput-object p4, p0, Lcom/capacitorjs/plugins/filesystem/a;->j:Lcom/getcapacitor/Bridge;

    iput-object p5, p0, Lcom/capacitorjs/plugins/filesystem/a;->k:Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;

    iput-object p6, p0, Lcom/capacitorjs/plugins/filesystem/a;->l:Landroid/os/Handler;

    iput-object p7, p0, Lcom/capacitorjs/plugins/filesystem/a;->m:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v5, p0, Lcom/capacitorjs/plugins/filesystem/a;->l:Landroid/os/Handler;

    iget-object v6, p0, Lcom/capacitorjs/plugins/filesystem/a;->m:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;

    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/a;->g:Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;

    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/a;->h:Ljava/lang/String;

    iget-object v2, p0, Lcom/capacitorjs/plugins/filesystem/a;->i:Lcom/getcapacitor/PluginCall;

    iget-object v3, p0, Lcom/capacitorjs/plugins/filesystem/a;->j:Lcom/getcapacitor/Bridge;

    iget-object v4, p0, Lcom/capacitorjs/plugins/filesystem/a;->k:Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;

    invoke-static/range {v0 .. v6}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->a(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;Ljava/lang/String;Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/plugin/util/HttpRequestHandler$ProgressEmitter;Landroid/os/Handler;Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;)Lt3/h;

    move-result-object v0

    return-object v0
.end method
