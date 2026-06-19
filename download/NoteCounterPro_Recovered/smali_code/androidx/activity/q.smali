.class public final synthetic Landroidx/activity/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/activity/q;->g:I

    iput-object p1, p0, Landroidx/activity/q;->h:Ljava/lang/Object;

    iput p2, p0, Landroidx/activity/q;->i:I

    iput-object p4, p0, Landroidx/activity/q;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/activity/q;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/q;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly0/a;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/activity/q;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, Ly0/a;->b:Ly0/d;

    .line 13
    .line 14
    iget v2, p0, Landroidx/activity/q;->i:I

    .line 15
    .line 16
    invoke-interface {v0, v2, v1}, Ly0/d;->h(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Landroidx/activity/q;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroidx/activity/r;

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/activity/q;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Landroid/content/IntentSender$SendIntentException;

    .line 27
    .line 28
    new-instance v2, Landroid/content/Intent;

    .line 29
    .line 30
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 40
    .line 41
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget v2, p0, Landroidx/activity/q;->i:I

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-virtual {v0, v2, v3, v1}, Ld/h;->a(IILandroid/content/Intent;)Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    iget-object v0, p0, Landroidx/activity/q;->h:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Landroidx/activity/r;

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/activity/q;->j:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Lk1/j;

    .line 59
    .line 60
    iget-object v1, v1, Lk1/j;->h:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v2, v0, Ld/h;->a:Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    iget v3, p0, Landroidx/activity/q;->i:I

    .line 65
    .line 66
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/lang/String;

    .line 75
    .line 76
    if-nez v2, :cond_0

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_0
    iget-object v3, v0, Ld/h;->e:Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Ld/e;

    .line 86
    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    iget-object v4, v3, Ld/e;->a:Ld/b;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    const/4 v4, 0x0

    .line 93
    :goto_0
    if-nez v4, :cond_2

    .line 94
    .line 95
    iget-object v3, v0, Ld/h;->g:Landroid/os/Bundle;

    .line 96
    .line 97
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, Ld/h;->f:Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    iget-object v3, v3, Ld/e;->a:Ld/b;

    .line 107
    .line 108
    const-string v4, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>"

    .line 109
    .line 110
    invoke-static {v3, v4}, Lg4/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, Ld/h;->d:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_3

    .line 120
    .line 121
    invoke-interface {v3, v1}, Ld/b;->c(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    :goto_1
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
