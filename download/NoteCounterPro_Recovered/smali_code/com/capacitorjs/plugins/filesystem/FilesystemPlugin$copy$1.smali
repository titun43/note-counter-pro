.class final Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->copy(Lcom/getcapacitor/PluginCall;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ly3/g;",
        "Lf4/q;"
    }
.end annotation

.annotation runtime Ly3/e;
    c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$copy$1"
    f = "FilesystemPlugin.kt"
    l = {
        0xef
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $call:Lcom/getcapacitor/PluginCall;

.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

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
    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr3/f0;

    check-cast p2, Lr3/f0;

    check-cast p3, Lw3/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->invoke(Lr3/f0;Lr3/f0;Lw3/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lr3/f0;Lr3/f0;Lw3/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr3/f0;",
            "Lr3/f0;",
            "Lw3/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;

    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    iget-object v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->$call:Lcom/getcapacitor/PluginCall;

    invoke-direct {v0, v1, v2, p3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    iput-object p1, v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->L$1:Ljava/lang/Object;

    sget-object p1, Lt3/h;->a:Lt3/h;

    invoke-virtual {v0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr3/f0;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->L$1:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lr3/f0;

    .line 8
    .line 9
    sget-object v2, Lx3/a;->g:Lx3/a;

    .line 10
    .line 11
    iget v3, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->label:I

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    if-ne v3, v4, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Lt3/e;

    .line 23
    .line 24
    iget-object p1, p1, Lt3/e;->g:Ljava/lang/Object;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->access$getController(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo3/k;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object v5, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object v5, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    iput v4, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->label:I

    .line 49
    .line 50
    invoke-virtual {p1, v0, v1, p0}, Lo3/k;->a(Lb3/g;Lb3/g;Ly3/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v2, :cond_2

    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->$call:Lcom/getcapacitor/PluginCall;

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
    check-cast v1, Landroid/net/Uri;

    .line 65
    .line 66
    invoke-static {v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->createUriResultObject(Landroid/net/Uri;)Lcom/getcapacitor/JSObject;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const/4 v2, 0x0

    .line 71
    const/4 v3, 0x2

    .line 72
    invoke-static {v0, v1, v2, v3, v5}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendSuccess$default(Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/JSObject;ZILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$copy$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 76
    .line 77
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v2, "getMethodName(...)"

    .line 88
    .line 89
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrorsKt;->toFilesystemError(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {v0, p1}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 100
    .line 101
    return-object p1
.end method
