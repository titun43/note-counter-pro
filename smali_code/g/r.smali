.class public abstract Lg/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Lg/p;

.field public static final h:I

.field public static i:Lb0/g;

.field public static j:Lb0/g;

.field public static k:Ljava/lang/Boolean;

.field public static l:Z

.field public static final m:Lo/g;

.field public static final n:Ljava/lang/Object;

.field public static final o:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lg/p;

    .line 2
    .line 3
    new-instance v1, Lg/q;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2}, Lg/q;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lg/p;-><init>(Lg/q;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lg/r;->g:Lg/p;

    .line 13
    .line 14
    const/16 v0, -0x64

    .line 15
    .line 16
    sput v0, Lg/r;->h:I

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    sput-object v0, Lg/r;->i:Lb0/g;

    .line 20
    .line 21
    sput-object v0, Lg/r;->j:Lb0/g;

    .line 22
    .line 23
    sput-object v0, Lg/r;->k:Ljava/lang/Boolean;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    sput-boolean v0, Lg/r;->l:Z

    .line 27
    .line 28
    new-instance v1, Lo/g;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lo/g;-><init>(I)V

    .line 31
    .line 32
    .line 33
    sput-object v1, Lg/r;->m:Lo/g;

    .line 34
    .line 35
    new-instance v0, Ljava/lang/Object;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lg/r;->n:Ljava/lang/Object;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/Object;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lg/r;->o:Ljava/lang/Object;

    .line 48
    .line 49
    return-void
.end method

.method public static a()Lb0/g;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_2

    .line 6
    .line 7
    sget-object v0, Lg/r;->m:Lo/g;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, Lo/b;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lo/b;-><init>(Lo/g;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v1}, Lo/b;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Lo/b;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lg/r;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    check-cast v0, Lg/f0;

    .line 38
    .line 39
    iget-object v0, v0, Lg/f0;->q:Landroid/content/Context;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    const-string v1, "locale"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 v0, 0x0

    .line 51
    :goto_0
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-static {v0}, Lg/o;->a(Ljava/lang/Object;)Landroid/os/LocaleList;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, Lb0/g;

    .line 58
    .line 59
    new-instance v2, Lb0/h;

    .line 60
    .line 61
    invoke-direct {v2, v0}, Lb0/h;-><init>(Landroid/os/LocaleList;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, v2}, Lb0/g;-><init>(Lb0/h;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_2
    sget-object v0, Lg/r;->i:Lb0/g;

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_3
    sget-object v0, Lb0/g;->b:Lb0/g;

    .line 74
    .line 75
    return-object v0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 4

    .line 1
    sget-object v0, Lg/r;->k:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    sget v0, Lg/k0;->g:I

    .line 6
    .line 7
    invoke-static {}, Lg/j0;->a()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    or-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Landroid/content/ComponentName;

    .line 18
    .line 19
    const-class v3, Lg/k0;

    .line 20
    .line 21
    invoke-direct {v2, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    const-string v0, "autoStoreLocales"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sput-object p0, Lg/r;->k:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    const-string p0, "AppCompatDelegate"

    .line 46
    .line 47
    const-string v0, "Checking for metadata for AppLocalesMetadataHolderService : Service not found"

    .line 48
    .line 49
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 53
    .line 54
    sput-object p0, Lg/r;->k:Ljava/lang/Boolean;

    .line 55
    .line 56
    :cond_0
    :goto_0
    sget-object p0, Lg/r;->k:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method

.method public static i(Lg/f0;)V
    .locals 3

    .line 1
    sget-object v0, Lg/r;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lg/r;->m:Lo/g;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v2, Lo/b;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Lo/b;-><init>(Lo/g;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    :goto_0
    invoke-virtual {v2}, Lo/b;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {v2}, Lo/b;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lg/r;

    .line 31
    .line 32
    if-eq v1, p0, :cond_1

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    :cond_1
    invoke-virtual {v2}, Lo/b;->remove()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p0
.end method


# virtual methods
.method public abstract b()V
.end method

.method public abstract c()V
.end method

.method public abstract e()V
.end method

.method public abstract h()V
.end method

.method public abstract j(I)Z
.end method

.method public abstract k(I)V
.end method

.method public abstract l(Landroid/view/View;)V
.end method

.method public abstract m(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract n(Ljava/lang/CharSequence;)V
.end method

.method public abstract o(Li/a;)Li/b;
.end method
