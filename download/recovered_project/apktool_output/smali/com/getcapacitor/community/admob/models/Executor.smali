.class public abstract Lcom/getcapacitor/community/admob/models/Executor;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final activitySupplier:Le0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le0/d;"
        }
    .end annotation
.end field

.field protected final contextSupplier:Le0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le0/d;"
        }
    .end annotation
.end field

.field protected final logTag:Ljava/lang/String;

.field protected notifyListenersFunction:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le0/d;",
            "Le0/d;",
            "Lx2/a;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/getcapacitor/community/admob/models/Executor;->contextSupplier:Le0/d;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/getcapacitor/community/admob/models/Executor;->notifyListenersFunction:Lx2/a;

    .line 9
    .line 10
    const-string p1, "|"

    .line 11
    .line 12
    invoke-static {p4, p1, p5}, Landroidx/emoji2/text/u;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/getcapacitor/community/admob/models/Executor;->logTag:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->notifyListenersFunction:Lx2/a;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lx2/a;->a(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
