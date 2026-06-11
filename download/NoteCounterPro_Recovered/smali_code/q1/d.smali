.class public final Lq1/d;
.super Lq1/c;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "NetworkMeteredCtrlr"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/work/n;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lq1/d;->e:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lt1/i;)Z
    .locals 1

    .line 1
    iget-object p1, p1, Lt1/i;->j:Landroidx/work/c;

    .line 2
    .line 3
    iget p1, p1, Landroidx/work/c;->a:I

    .line 4
    .line 5
    const/4 v0, 0x5

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    check-cast p1, Lp1/a;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1a

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "Metered network constraint is not supported before API 26, only checking for connected state."

    .line 16
    .line 17
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 18
    .line 19
    sget-object v4, Lq1/d;->e:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v4, v1, v3}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    iget-boolean p1, p1, Lp1/a;->a:Z

    .line 25
    .line 26
    xor-int/2addr p1, v2

    .line 27
    return p1

    .line 28
    :cond_0
    iget-boolean v0, p1, Lp1/a;->a:Z

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-boolean p1, p1, Lp1/a;->c:Z

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return v3

    .line 38
    :cond_2
    :goto_0
    return v2
.end method
