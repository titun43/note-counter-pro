.class public final synthetic Lorg/apache/cordova/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/apache/cordova/j0;->a:Ljava/lang/String;

    iput-object p1, p0, Lorg/apache/cordova/j0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, Lorg/apache/cordova/p;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lorg/apache/cordova/j0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/cordova/j0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p2, p1, v0}, Lorg/apache/cordova/p;->onMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
