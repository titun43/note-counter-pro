.class final Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->readFileInChunks(Lcom/getcapacitor/PluginCall;)V
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
    c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$readFileInChunks$1"
    f = "FilesystemPlugin.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $call:Lcom/getcapacitor/PluginCall;

.field final synthetic $input:Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;


# direct methods
.method public constructor <init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;Lcom/getcapacitor/PluginCall;Lw3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;",
            "Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;",
            "Lcom/getcapacitor/PluginCall;",
            "Lw3/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->$input:Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ly3/g;-><init>(ILw3/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 4
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
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->$input:Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr3/f0;

    check-cast p2, Lw3/c;

    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->invoke(Lr3/f0;Lw3/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    move-result-object p1

    check-cast p1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;

    sget-object p2, Lt3/h;->a:Lt3/h;

    invoke-virtual {p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr3/f0;

    .line 4
    .line 5
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 6
    .line 7
    iget v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->access$getController(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo3/k;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->$input:Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/capacitorjs/plugins/filesystem/ReadFileInChunksOptions;->getOptions()Lr3/z;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const-string v2, "uri"

    .line 30
    .line 31
    invoke-static {v0, v2}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v2, "options"

    .line 35
    .line 36
    invoke-static {v1, v2}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lo3/i;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v2, v1, p1, v0, v3}, Lo3/i;-><init>(Lr3/z;Lo3/k;Lb3/g;Lw3/c;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lu1/f;

    .line 46
    .line 47
    invoke-direct {p1, v2}, Lu1/f;-><init>(Lf4/p;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$1;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 53
    .line 54
    invoke-direct {v0, v1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$1;-><init>(Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Landroidx/emoji2/text/p;

    .line 58
    .line 59
    const/16 v2, 0x12

    .line 60
    .line 61
    invoke-direct {v1, v2, p1, v0}, Landroidx/emoji2/text/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;

    .line 65
    .line 66
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 67
    .line 68
    invoke-direct {p1, v0, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;-><init>(Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Lr4/h;

    .line 72
    .line 73
    invoke-direct {v0, v1, p1}, Lr4/h;-><init>(Landroidx/emoji2/text/p;Lf4/q;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$3;

    .line 77
    .line 78
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 79
    .line 80
    invoke-direct {p1, v1, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$3;-><init>(Lcom/getcapacitor/PluginCall;Lw3/c;)V

    .line 81
    .line 82
    .line 83
    new-instance v1, Landroidx/emoji2/text/p;

    .line 84
    .line 85
    invoke-direct {v1, v0, p1}, Landroidx/emoji2/text/p;-><init>(Lr4/b;Lf4/q;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 89
    .line 90
    invoke-static {p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->access$getCoroutineScope(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo4/t;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-instance v0, Lr4/e;

    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-direct {v0, v1, v3, v2}, Lr4/e;-><init>(Ljava/lang/Object;Lw3/c;I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1, v0}, Lo4/w;->i(Lo4/t;Lf4/p;)Lo4/z;

    .line 101
    .line 102
    .line 103
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 109
    .line 110
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method
