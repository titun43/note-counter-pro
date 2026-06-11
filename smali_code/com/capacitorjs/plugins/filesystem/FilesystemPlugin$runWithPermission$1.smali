.class final Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V
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
    c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$runWithPermission$1"
    f = "FilesystemPlugin.kt"
    l = {
        0x164,
        0x16d
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $call:Lcom/getcapacitor/PluginCall;

.field final synthetic $onPermissionGranted:Lf4/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf4/p;"
        }
    .end annotation
.end field

.field final synthetic $uri:Lr3/g0;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;


# direct methods
.method public constructor <init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;Lw3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;",
            "Lr3/g0;",
            "Lcom/getcapacitor/PluginCall;",
            "Lf4/p;",
            "Lw3/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$uri:Lr3/g0;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$onPermissionGranted:Lf4/p;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ly3/g;-><init>(ILw3/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 6
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
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$uri:Lr3/g0;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$onPermissionGranted:Lf4/p;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;Lw3/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lo4/t;

    check-cast p2, Lw3/c;

    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->invoke(Lo4/t;Lw3/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lo4/t;Lw3/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo4/t;",
            "Lw3/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    move-result-object p1

    check-cast p1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;

    sget-object p2, Lt3/h;->a:Lt3/h;

    invoke-virtual {p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->L$1:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lr3/f0;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->L$0:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    check-cast p1, Lt3/e;

    .line 35
    .line 36
    iget-object p1, p1, Lt3/e;->g:Ljava/lang/Object;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->access$getController(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo3/k;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$uri:Lr3/g0;

    .line 49
    .line 50
    iput v3, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->label:I

    .line 51
    .line 52
    invoke-virtual {p1, v1, p0}, Lo3/k;->d(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 60
    .line 61
    iget-object v4, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$uri:Lr3/g0;

    .line 62
    .line 63
    iget-object v5, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 64
    .line 65
    iget-object v6, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$onPermissionGranted:Lf4/p;

    .line 66
    .line 67
    instance-of v7, p1, Lt3/d;

    .line 68
    .line 69
    if-nez v7, :cond_7

    .line 70
    .line 71
    move-object v7, p1

    .line 72
    check-cast v7, Lr3/f0;

    .line 73
    .line 74
    invoke-virtual {v7}, Lr3/f0;->B()Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    const/4 v9, 0x0

    .line 79
    if-eqz v8, :cond_5

    .line 80
    .line 81
    iget-object v4, v4, Lr3/g0;->c:Lr3/x;

    .line 82
    .line 83
    if-nez v4, :cond_4

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    move v3, v9

    .line 87
    :goto_1
    invoke-static {v1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->access$isStoragePermissionGranted(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_5

    .line 92
    .line 93
    const-string v0, "permissionCallback"

    .line 94
    .line 95
    invoke-static {v1, v5, v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->access$requestAllPermissions(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/getcapacitor/PluginCall;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->L$0:Ljava/lang/Object;

    .line 100
    .line 101
    const/4 v1, 0x0

    .line 102
    iput-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->L$1:Ljava/lang/Object;

    .line 103
    .line 104
    iput v9, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->I$0:I

    .line 105
    .line 106
    iput v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->label:I

    .line 107
    .line 108
    invoke-interface {v6, v7, p0}, Lf4/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-ne v1, v0, :cond_6

    .line 113
    .line 114
    :goto_2
    return-object v0

    .line 115
    :cond_6
    move-object v0, p1

    .line 116
    :goto_3
    move-object p1, v0

    .line 117
    :cond_7
    :goto_4
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 118
    .line 119
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-eqz p1, :cond_8

    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/getcapacitor/PluginCall;->getMethodName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const-string v2, "getMethodName(...)"

    .line 130
    .line 131
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p1, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrorsKt;->toFilesystemError(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {v0, p1}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendError(Lcom/getcapacitor/PluginCall;Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;)V

    .line 139
    .line 140
    .line 141
    :cond_8
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 142
    .line 143
    return-object p1
.end method
