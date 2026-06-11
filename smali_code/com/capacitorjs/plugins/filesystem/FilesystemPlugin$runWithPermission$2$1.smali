.class final Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$runWithPermission$2$1"
    f = "FilesystemPlugin.kt"
    l = {
        0x188
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $onPermissionGranted:Lf4/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf4/q;"
        }
    .end annotation
.end field

.field final synthetic $resolvedSourceUri:Lr3/f0;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lf4/q;Lr3/f0;Lw3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/q;",
            "Lr3/f0;",
            "Lw3/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->$onPermissionGranted:Lf4/q;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->$resolvedSourceUri:Lr3/f0;

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
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->$onPermissionGranted:Lf4/q;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->$resolvedSourceUri:Lr3/f0;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;-><init>(Lf4/q;Lr3/f0;Lw3/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr3/f0;

    check-cast p2, Lw3/c;

    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->invoke(Lr3/f0;Lw3/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    move-result-object p1

    check-cast p1, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;

    sget-object p2, Lt3/h;->a:Lt3/h;

    invoke-virtual {p1, p2}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr3/f0;

    .line 4
    .line 5
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 6
    .line 7
    iget v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->$onPermissionGranted:Lf4/q;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->$resolvedSourceUri:Lr3/f0;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    iput-object v4, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    iput v3, p0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin$runWithPermission$2$1;->label:I

    .line 37
    .line 38
    invoke-interface {p1, v2, v0, p0}, Lf4/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v1, :cond_2

    .line 43
    .line 44
    return-object v1

    .line 45
    :cond_2
    :goto_0
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 46
    .line 47
    return-object p1
.end method
