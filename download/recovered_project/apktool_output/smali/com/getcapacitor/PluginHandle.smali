.class public Lcom/getcapacitor/PluginHandle;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final bridge:Lcom/getcapacitor/Bridge;

.field private instance:Lcom/getcapacitor/Plugin;

.field private legacyPluginAnnotation:Lcom/getcapacitor/NativePlugin;

.field private pluginAnnotation:Lcom/getcapacitor/annotation/CapacitorPlugin;

.field private final pluginClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/getcapacitor/Plugin;",
            ">;"
        }
    .end annotation
.end field

.field private final pluginId:Ljava/lang/String;

.field private final pluginMethods:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/getcapacitor/PluginMethodHandle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/getcapacitor/Bridge;Lcom/getcapacitor/Plugin;)V
    .locals 1

    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/getcapacitor/PluginHandle;-><init>(Ljava/lang/Class;Lcom/getcapacitor/Bridge;)V

    .line 21
    invoke-virtual {p0, p2}, Lcom/getcapacitor/PluginHandle;->loadInstance(Lcom/getcapacitor/Plugin;)Lcom/getcapacitor/Plugin;

    return-void
.end method

.method public constructor <init>(Lcom/getcapacitor/Bridge;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/Bridge;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/getcapacitor/Plugin;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p2, p1}, Lcom/getcapacitor/PluginHandle;-><init>(Ljava/lang/Class;Lcom/getcapacitor/Bridge;)V

    .line 19
    invoke-virtual {p0}, Lcom/getcapacitor/PluginHandle;->load()Lcom/getcapacitor/Plugin;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Class;Lcom/getcapacitor/Bridge;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/getcapacitor/Plugin;",
            ">;",
            "Lcom/getcapacitor/Bridge;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginMethods:Ljava/util/Map;

    .line 3
    iput-object p2, p0, Lcom/getcapacitor/PluginHandle;->bridge:Lcom/getcapacitor/Bridge;

    .line 4
    iput-object p1, p0, Lcom/getcapacitor/PluginHandle;->pluginClass:Ljava/lang/Class;

    .line 5
    const-class p2, Lcom/getcapacitor/annotation/CapacitorPlugin;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p2

    check-cast p2, Lcom/getcapacitor/annotation/CapacitorPlugin;

    .line 6
    const-string v0, ""

    if-nez p2, :cond_2

    .line 7
    const-class p2, Lcom/getcapacitor/NativePlugin;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p2

    check-cast p2, Lcom/getcapacitor/NativePlugin;

    if-eqz p2, :cond_1

    .line 8
    invoke-interface {p2}, Lcom/getcapacitor/NativePlugin;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    invoke-interface {p2}, Lcom/getcapacitor/NativePlugin;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginId:Ljava/lang/String;

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginId:Ljava/lang/String;

    .line 11
    :goto_0
    iput-object p2, p0, Lcom/getcapacitor/PluginHandle;->legacyPluginAnnotation:Lcom/getcapacitor/NativePlugin;

    goto :goto_2

    .line 12
    :cond_1
    new-instance p2, Lcom/getcapacitor/InvalidPluginException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "No @CapacitorPlugin annotation found for plugin "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/getcapacitor/InvalidPluginException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 13
    :cond_2
    invoke-interface {p2}, Lcom/getcapacitor/annotation/CapacitorPlugin;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 14
    invoke-interface {p2}, Lcom/getcapacitor/annotation/CapacitorPlugin;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginId:Ljava/lang/String;

    goto :goto_1

    .line 15
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginId:Ljava/lang/String;

    .line 16
    :goto_1
    iput-object p2, p0, Lcom/getcapacitor/PluginHandle;->pluginAnnotation:Lcom/getcapacitor/annotation/CapacitorPlugin;

    .line 17
    :goto_2
    invoke-direct {p0, p1}, Lcom/getcapacitor/PluginHandle;->indexMethods(Ljava/lang/Class;)V

    return-void
.end method

.method private indexMethods(Ljava/lang/Class;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/getcapacitor/Plugin;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/getcapacitor/PluginHandle;->pluginClass:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    const-class v3, Lcom/getcapacitor/PluginMethod;

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lcom/getcapacitor/PluginMethod;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance v4, Lcom/getcapacitor/PluginMethodHandle;

    .line 25
    .line 26
    invoke-direct {v4, v2, v3}, Lcom/getcapacitor/PluginMethodHandle;-><init>(Ljava/lang/reflect/Method;Lcom/getcapacitor/PluginMethod;)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lcom/getcapacitor/PluginHandle;->pluginMethods:Ljava/util/Map;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getInstance()Lcom/getcapacitor/Plugin;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->instance:Lcom/getcapacitor/Plugin;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLegacyPluginAnnotation()Lcom/getcapacitor/NativePlugin;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->legacyPluginAnnotation:Lcom/getcapacitor/NativePlugin;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMethods()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/getcapacitor/PluginMethodHandle;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginMethods:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getPluginAnnotation()Lcom/getcapacitor/annotation/CapacitorPlugin;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginAnnotation:Lcom/getcapacitor/annotation/CapacitorPlugin;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPluginClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/getcapacitor/Plugin;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginClass:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public invoke(Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->instance:Lcom/getcapacitor/Plugin;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/getcapacitor/PluginHandle;->load()Lcom/getcapacitor/Plugin;

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginMethods:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/getcapacitor/PluginMethodHandle;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/getcapacitor/PluginMethodHandle;->getMethod()Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->instance:Lcom/getcapacitor/Plugin;

    .line 23
    .line 24
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1, v0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance p2, Lcom/getcapacitor/InvalidPluginMethodException;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v1, "No method "

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, " found for plugin "

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/getcapacitor/PluginHandle;->pluginClass:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p2, p1}, Lcom/getcapacitor/InvalidPluginMethodException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p2
.end method

.method public load()Lcom/getcapacitor/Plugin;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->instance:Lcom/getcapacitor/Plugin;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->pluginClass:Ljava/lang/Class;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/getcapacitor/Plugin;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/getcapacitor/PluginHandle;->instance:Lcom/getcapacitor/Plugin;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/getcapacitor/PluginHandle;->loadInstance(Lcom/getcapacitor/Plugin;)Lcom/getcapacitor/Plugin;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object v0

    .line 26
    :catch_0
    new-instance v0, Lcom/getcapacitor/PluginLoadException;

    .line 27
    .line 28
    const-string v1, "Unable to load plugin instance. Ensure plugin is publicly accessible"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Lcom/getcapacitor/PluginLoadException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public loadInstance(Lcom/getcapacitor/Plugin;)Lcom/getcapacitor/Plugin;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/PluginHandle;->instance:Lcom/getcapacitor/Plugin;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/getcapacitor/Plugin;->setPluginHandle(Lcom/getcapacitor/PluginHandle;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/getcapacitor/PluginHandle;->instance:Lcom/getcapacitor/Plugin;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/getcapacitor/PluginHandle;->bridge:Lcom/getcapacitor/Bridge;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/getcapacitor/Plugin;->setBridge(Lcom/getcapacitor/Bridge;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/getcapacitor/PluginHandle;->instance:Lcom/getcapacitor/Plugin;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/getcapacitor/Plugin;->load()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/getcapacitor/PluginHandle;->instance:Lcom/getcapacitor/Plugin;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/getcapacitor/Plugin;->initializeActivityLaunchers()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/getcapacitor/PluginHandle;->instance:Lcom/getcapacitor/Plugin;

    .line 24
    .line 25
    return-object p1
.end method
