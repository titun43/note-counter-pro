.class final Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->deleteFile(Lcom/getcapacitor/PluginCall;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ly3/g;",
        "Lf4/p;"
    }
.end annotation

.annotation runtime Ly3/e;
    c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$deleteFile$1"
    f = "FilesystemPlugin.kt"
    l = {
        0x94
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $call:Lcom/getcapacitor/PluginCall;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;


# direct methods
.method public constructor <init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/getcapacitor/PluginCall;Lw3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;",
            "Lcom/getcapacitor/PluginCall;",
            "Lw3/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lw3/c;",
            ")",
            "Lw3/c;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr3/f0;

    check-cast p2, Lw3/c;

    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->invoke(Lr3/f0;Lw3/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lr3/f0;Lw3/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr3/f0;",
            "Lw3/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    move-result-object p1

    check-cast p1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;

    sget-object p2, Lt3/h;->a:Lt3/h;

    invoke-virtual {p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr3/f0;

    .line 4
    .line 5
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 6
    .line 7
    iget v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v4, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Lt3/e;

    .line 20
    .line 21
    iget-object p1, p1, Lt3/e;->g:Ljava/lang/Object;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->access$getController(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo3/k;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v2, Lr3/b;

    .line 42
    .line 43
    invoke-direct {v2, v3}, Lr3/b;-><init>(Z)V

    .line 44
    .line 45
    .line 46
    iput-object v5, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    iput v4, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->label:I

    .line 49
    .line 50
    invoke-virtual {p1, v0, v2, p0}, Lo3/k;->c(Lb3/g;Lr3/b;Ly3/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v1, :cond_2

    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 58
    .line 59
    instance-of v1, p1, Lt3/d;

    .line 60
    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    move-object v1, p1

    .line 64
    check-cast v1, Lt3/h;

    .line 65
    .line 66
    const/4 v1, 0x3

    .line 67
    invoke-static {v0, v5, v3, v1, v5}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendSuccess$default(Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/JSObject;ZILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$deleteFile$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 71
    .line 72
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const-string v2, "getMethodName(...)"

    .line 83
    .line 84
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrorsKt;->toFilesystemError(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {v0, p1}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 95
    .line 96
    return-object p1
.end method
