.class final Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->runWithPermission(Lr3/g0;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/q;)V
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
    c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$runWithPermission$2"
    f = "FilesystemPlugin.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $call:Lcom/getcapacitor/PluginCall;

.field final synthetic $onPermissionGranted:Lf4/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf4/q;"
        }
    .end annotation
.end field

.field final synthetic $toUri:Lr3/g0;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;


# direct methods
.method public constructor <init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/q;Lw3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;",
            "Lr3/g0;",
            "Lcom/getcapacitor/PluginCall;",
            "Lf4/q;",
            "Lw3/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->$toUri:Lr3/g0;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->$call:Lcom/getcapacitor/PluginCall;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->$onPermissionGranted:Lf4/q;

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
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->$toUri:Lr3/g0;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->$call:Lcom/getcapacitor/PluginCall;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->$onPermissionGranted:Lf4/q;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;-><init>(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/q;Lw3/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr3/f0;

    check-cast p2, Lw3/c;

    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->invoke(Lr3/f0;Lw3/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    move-result-object p1

    check-cast p1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;

    sget-object p2, Lt3/h;->a:Lt3/h;

    invoke-virtual {p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr3/f0;

    .line 4
    .line 5
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 6
    .line 7
    iget v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->this$0:Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->$toUri:Lr3/g0;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->$call:Lcom/getcapacitor/PluginCall;

    .line 19
    .line 20
    new-instance v3, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;

    .line 21
    .line 22
    iget-object v4, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->$onPermissionGranted:Lf4/q;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v3, v4, v0, v5}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;-><init>(Lf4/q;Lr3/f0;Lw3/c;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v1, v2, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->access$runWithPermission(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;Lr3/g0;Lcom/getcapacitor/PluginCall;Lf4/p;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method
