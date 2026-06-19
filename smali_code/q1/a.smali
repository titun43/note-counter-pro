.class public final Lq1/a;
.super Lq1/c;
.source "SourceFile"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lr1/d;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq1/a;->e:I

    invoke-direct {p0, p1}, Lq1/c;-><init>(Lr1/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lt1/i;)Z
    .locals 2

    .line 1
    iget v0, p0, Lq1/a;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lt1/i;->j:Landroidx/work/c;

    .line 7
    .line 8
    iget-boolean p1, p1, Landroidx/work/c;->e:Z

    .line 9
    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object p1, p1, Lt1/i;->j:Landroidx/work/c;

    .line 12
    .line 13
    iget p1, p1, Landroidx/work/c;->a:I

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v1, 0x1e

    .line 21
    .line 22
    if-lt v0, v1, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x6

    .line 25
    if-ne p1, v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 31
    :goto_1
    return p1

    .line 32
    :pswitch_1
    iget-object p1, p1, Lt1/i;->j:Landroidx/work/c;

    .line 33
    .line 34
    iget p1, p1, Landroidx/work/c;->a:I

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    if-ne p1, v0, :cond_2

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/4 p1, 0x0

    .line 42
    :goto_2
    return p1

    .line 43
    :pswitch_2
    iget-object p1, p1, Lt1/i;->j:Landroidx/work/c;

    .line 44
    .line 45
    iget-boolean p1, p1, Landroidx/work/c;->d:Z

    .line 46
    .line 47
    return p1

    .line 48
    :pswitch_3
    iget-object p1, p1, Lt1/i;->j:Landroidx/work/c;

    .line 49
    .line 50
    iget-boolean p1, p1, Landroidx/work/c;->b:Z

    .line 51
    .line 52
    return p1

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, Lq1/a;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    :goto_0
    xor-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    return p1

    .line 15
    :pswitch_0
    check-cast p1, Lp1/a;

    .line 16
    .line 17
    iget-boolean v0, p1, Lp1/a;->a:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-boolean p1, p1, Lp1/a;->c:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    :goto_1
    const/4 p1, 0x1

    .line 29
    :goto_2
    return p1

    .line 30
    :pswitch_1
    check-cast p1, Lp1/a;

    .line 31
    .line 32
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v1, 0x1a

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    if-lt v0, v1, :cond_3

    .line 38
    .line 39
    iget-boolean v0, p1, Lp1/a;->a:Z

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    iget-boolean p1, p1, Lp1/a;->b:Z

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_2
    const/4 v2, 0x0

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    iget-boolean p1, p1, Lp1/a;->a:Z

    .line 51
    .line 52
    xor-int/2addr v2, p1

    .line 53
    :cond_4
    :goto_3
    return v2

    .line 54
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    goto :goto_0

    .line 61
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    goto :goto_0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
