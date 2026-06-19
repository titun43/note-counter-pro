.class public final Lu1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lw1/a;

.field public final b:Ls1/a;

.field public final c:Ll2/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WMFgUpdater"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/work/n;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Ll1/b;Landroidx/emoji2/text/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lu1/o;->b:Ls1/a;

    .line 5
    .line 6
    iput-object p3, p0, Lu1/o;->a:Lw1/a;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->n()Ll2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lu1/o;->c:Ll2/j;

    .line 13
    .line 14
    return-void
.end method
