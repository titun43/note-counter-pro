.class public Lorg/apache/cordova/AllowListPlugin;
.super Lorg/apache/cordova/p;
.source "SourceFile"


# static fields
.field public static final PLUGIN_NAME:Ljava/lang/String; = "CordovaAllowListPlugin"


# instance fields
.field public c:Lorg/apache/cordova/b;

.field public d:Lorg/apache/cordova/b;

.field public e:Lorg/apache/cordova/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 9
    new-instance v0, Lorg/apache/cordova/b;

    invoke-direct {v0}, Lorg/apache/cordova/b;-><init>()V

    new-instance v1, Lorg/apache/cordova/b;

    invoke-direct {v1}, Lorg/apache/cordova/b;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lorg/apache/cordova/AllowListPlugin;-><init>(Lorg/apache/cordova/b;Lorg/apache/cordova/b;Lorg/apache/cordova/b;)V

    .line 10
    new-instance v0, Lorg/apache/cordova/c;

    invoke-direct {v0, p0}, Lorg/apache/cordova/c;-><init>(Lorg/apache/cordova/AllowListPlugin;)V

    invoke-virtual {v0, p1}, Lorg/apache/cordova/g;->c(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/b;Lorg/apache/cordova/b;Lorg/apache/cordova/b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p3, :cond_0

    .line 3
    new-instance p3, Lorg/apache/cordova/b;

    invoke-direct {p3}, Lorg/apache/cordova/b;-><init>()V

    .line 4
    const-string v0, "file:///*"

    invoke-virtual {p3, v0}, Lorg/apache/cordova/b;->a(Ljava/lang/String;)V

    .line 5
    const-string v0, "data:*"

    invoke-virtual {p3, v0}, Lorg/apache/cordova/b;->a(Ljava/lang/String;)V

    .line 6
    :cond_0
    iput-object p1, p0, Lorg/apache/cordova/AllowListPlugin;->c:Lorg/apache/cordova/b;

    .line 7
    iput-object p2, p0, Lorg/apache/cordova/AllowListPlugin;->d:Lorg/apache/cordova/b;

    .line 8
    iput-object p3, p0, Lorg/apache/cordova/AllowListPlugin;->e:Lorg/apache/cordova/b;

    return-void
.end method

.method public constructor <init>(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    .line 11
    new-instance v0, Lorg/apache/cordova/b;

    invoke-direct {v0}, Lorg/apache/cordova/b;-><init>()V

    new-instance v1, Lorg/apache/cordova/b;

    invoke-direct {v1}, Lorg/apache/cordova/b;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lorg/apache/cordova/AllowListPlugin;-><init>(Lorg/apache/cordova/b;Lorg/apache/cordova/b;Lorg/apache/cordova/b;)V

    .line 12
    new-instance v0, Lorg/apache/cordova/c;

    invoke-direct {v0, p0}, Lorg/apache/cordova/c;-><init>(Lorg/apache/cordova/AllowListPlugin;)V

    invoke-virtual {v0, p1}, Lorg/apache/cordova/g;->d(Lorg/xmlpull/v1/XmlPullParser;)V

    return-void
.end method


# virtual methods
.method public getAllowedIntents()Lorg/apache/cordova/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/AllowListPlugin;->d:Lorg/apache/cordova/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAllowedNavigations()Lorg/apache/cordova/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/AllowListPlugin;->c:Lorg/apache/cordova/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAllowedRequests()Lorg/apache/cordova/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/AllowListPlugin;->e:Lorg/apache/cordova/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public pluginInitialize()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/AllowListPlugin;->c:Lorg/apache/cordova/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/apache/cordova/b;

    .line 6
    .line 7
    invoke-direct {v0}, Lorg/apache/cordova/b;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/apache/cordova/AllowListPlugin;->c:Lorg/apache/cordova/b;

    .line 11
    .line 12
    new-instance v0, Lorg/apache/cordova/b;

    .line 13
    .line 14
    invoke-direct {v0}, Lorg/apache/cordova/b;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lorg/apache/cordova/AllowListPlugin;->d:Lorg/apache/cordova/b;

    .line 18
    .line 19
    new-instance v0, Lorg/apache/cordova/b;

    .line 20
    .line 21
    invoke-direct {v0}, Lorg/apache/cordova/b;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lorg/apache/cordova/AllowListPlugin;->e:Lorg/apache/cordova/b;

    .line 25
    .line 26
    new-instance v0, Lorg/apache/cordova/c;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lorg/apache/cordova/c;-><init>(Lorg/apache/cordova/AllowListPlugin;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lorg/apache/cordova/p;->webView:Lorg/apache/cordova/u;

    .line 32
    .line 33
    invoke-interface {v1}, Lorg/apache/cordova/u;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Lorg/apache/cordova/g;->c(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public setAllowedIntents(Lorg/apache/cordova/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/cordova/AllowListPlugin;->d:Lorg/apache/cordova/b;

    .line 2
    .line 3
    return-void
.end method

.method public setAllowedNavigations(Lorg/apache/cordova/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/cordova/AllowListPlugin;->c:Lorg/apache/cordova/b;

    .line 2
    .line 3
    return-void
.end method

.method public setAllowedRequests(Lorg/apache/cordova/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/cordova/AllowListPlugin;->e:Lorg/apache/cordova/b;

    .line 2
    .line 3
    return-void
.end method

.method public shouldAllowNavigation(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/AllowListPlugin;->c:Lorg/apache/cordova/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/apache/cordova/b;->b(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method public shouldAllowRequest(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/apache/cordova/AllowListPlugin;->shouldAllowNavigation(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lorg/apache/cordova/AllowListPlugin;->e:Lorg/apache/cordova/b;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lorg/apache/cordova/b;->b(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return-object p1

    .line 24
    :cond_1
    :goto_0
    return-object v0
.end method

.method public shouldOpenExternalUrl(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/AllowListPlugin;->d:Lorg/apache/cordova/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/apache/cordova/b;->b(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method
