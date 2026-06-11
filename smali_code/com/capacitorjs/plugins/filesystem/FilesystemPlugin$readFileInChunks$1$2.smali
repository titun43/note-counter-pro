.class final Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$readFileInChunks$1$2"
    f = "FilesystemPlugin.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $call:Lcom/getcapacitor/PluginCall;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lcom/getcapacitor/PluginCall;Lw3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lw3/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;->$call:Lcom/getcapacitor/PluginCall;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Ly3/g;-><init>(ILw3/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr4/c;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lw3/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;->invoke(Lr4/c;Ljava/lang/Throwable;Lw3/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lr4/c;Ljava/lang/Throwable;Lw3/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr4/c;",
            "Ljava/lang/Throwable;",
            "Lw3/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance p1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;

    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;->$call:Lcom/getcapacitor/PluginCall;

    invoke-direct {p1, v0, p3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;-><init>(Lcom/getcapacitor/PluginCall;Lw3/c;)V

    iput-object p2, p1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;->L$0:Ljava/lang/Object;

    sget-object p2, Lt3/h;->a:Lt3/h;

    invoke-virtual {p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Throwable;

    .line 4
    .line 5
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 6
    .line 7
    iget v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$readFileInChunks$1$2;->$call:Lcom/getcapacitor/PluginCall;

    .line 17
    .line 18
    const-string v0, ""

    .line 19
    .line 20
    invoke-static {v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemMethodResultsKt;->createReadResultObject(Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x2

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {p1, v0, v3, v1, v2}, Lcom/capacitorjs/plugins/filesystem/PluginResultExtensionsKt;->sendSuccess$default(Lcom/getcapacitor/PluginCall;Lcom/getcapacitor/JSObject;ZILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method
