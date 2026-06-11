.class public final synthetic Lm4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm4/g;->g:I

    iput-object p1, p0, Lm4/g;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lw4/c;Lw4/b;)V
    .locals 0

    .line 2
    const/4 p2, 0x2

    iput p2, p0, Lm4/g;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/g;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lm4/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm4/g;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw4/c;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {v0, p1}, Lw4/c;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    iget-object v0, p0, Lm4/g;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lu3/c;

    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    const-string p1, "(this Collection)"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    return-object p1

    .line 33
    :pswitch_1
    iget-object v0, p0, Lm4/g;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Landroidx/activity/w;

    .line 36
    .line 37
    const-string v1, "it"

    .line 38
    .line 39
    invoke-static {p1, v1}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/activity/w;->invoke()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
