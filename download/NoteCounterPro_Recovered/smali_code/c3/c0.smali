.class public final Lc3/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc3/c0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget v0, p0, Lc3/c0;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, -0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Landroid/view/View;

    .line 10
    .line 11
    check-cast p2, Landroid/view/View;

    .line 12
    .line 13
    sget-object v0, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-static {p1}, Lf0/k0;->e(Landroid/view/View;)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p2}, Lf0/k0;->e(Landroid/view/View;)F

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    cmpl-float v0, p1, p2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    move v1, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    cmpg-float p1, p1, p2

    .line 30
    .line 31
    if-gez p1, :cond_1

    .line 32
    .line 33
    move v1, v2

    .line 34
    :cond_1
    :goto_0
    return v1

    .line 35
    :pswitch_0
    check-cast p1, Lc3/b;

    .line 36
    .line 37
    check-cast p2, Lc3/b;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p2}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget v0, p1, Lc3/b;->g:I

    .line 46
    .line 47
    iget v4, p2, Lc3/b;->g:I

    .line 48
    .line 49
    if-eq v0, v4, :cond_2

    .line 50
    .line 51
    if-lt v0, v4, :cond_4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    iget p1, p1, Lc3/b;->h:I

    .line 55
    .line 56
    iget p2, p2, Lc3/b;->h:I

    .line 57
    .line 58
    if-ne p1, p2, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    if-ge p1, p2, :cond_5

    .line 62
    .line 63
    :cond_4
    move v1, v3

    .line 64
    goto :goto_2

    .line 65
    :cond_5
    :goto_1
    move v1, v2

    .line 66
    :goto_2
    return v1

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
