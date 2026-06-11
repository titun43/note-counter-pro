.class public final Lg/b0;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg/b0;->a:I

    iput-object p1, p0, Lg/b0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget p1, p0, Lg/b0;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lg/b0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/webkit/WebSettings;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lg/b0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lr1/c;

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lr1/c;->g(Landroid/content/Intent;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_1
    iget-object p1, p0, Lg/b0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lorg/apache/cordova/CoreAndroid;

    .line 27
    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "android.intent.action.PHONE_STATE"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const-string v0, "state"

    .line 43
    .line 44
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    sget-object v0, Landroid/telephony/TelephonyManager;->EXTRA_STATE_RINGING:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const-string v1, "telephone"

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    iget-object p1, p1, Lorg/apache/cordova/p;->webView:Lorg/apache/cordova/u;

    .line 65
    .line 66
    invoke-interface {p1}, Lorg/apache/cordova/u;->getPluginManager()Lorg/apache/cordova/k0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string p2, "ringing"

    .line 71
    .line 72
    invoke-virtual {p1, v1, p2}, Lorg/apache/cordova/k0;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    sget-object v0, Landroid/telephony/TelephonyManager;->EXTRA_STATE_OFFHOOK:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    iget-object p1, p1, Lorg/apache/cordova/p;->webView:Lorg/apache/cordova/u;

    .line 85
    .line 86
    invoke-interface {p1}, Lorg/apache/cordova/u;->getPluginManager()Lorg/apache/cordova/k0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const-string p2, "offhook"

    .line 91
    .line 92
    invoke-virtual {p1, v1, p2}, Lorg/apache/cordova/k0;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    sget-object v0, Landroid/telephony/TelephonyManager;->EXTRA_STATE_IDLE:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_3

    .line 103
    .line 104
    iget-object p1, p1, Lorg/apache/cordova/p;->webView:Lorg/apache/cordova/u;

    .line 105
    .line 106
    invoke-interface {p1}, Lorg/apache/cordova/u;->getPluginManager()Lorg/apache/cordova/k0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-string p2, "idle"

    .line 111
    .line 112
    invoke-virtual {p1, v1, p2}, Lorg/apache/cordova/k0;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_3
    :goto_0
    return-void

    .line 116
    :pswitch_2
    iget-object p1, p0, Lg/b0;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, Lg/c0;

    .line 119
    .line 120
    invoke-virtual {p1}, Lg/c0;->g()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
