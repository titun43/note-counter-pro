.class public final synthetic La2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/community/admob/models/Executor;Lcom/getcapacitor/PluginCall;Lx2/a;I)V
    .locals 0

    .line 1
    iput p4, p0, La2/f;->g:I

    iput-object p1, p0, La2/f;->h:Ljava/lang/Object;

    iput-object p2, p0, La2/f;->j:Ljava/lang/Object;

    iput-object p3, p0, La2/f;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, La2/f;->g:I

    iput-object p1, p0, La2/f;->h:Ljava/lang/Object;

    iput-object p2, p0, La2/f;->i:Ljava/lang/Object;

    iput-object p3, p0, La2/f;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk2/b;Lf2/j;Lf0/g;Lf2/i;)V
    .locals 0

    .line 3
    const/4 p3, 0x5

    iput p3, p0, La2/f;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/f;->h:Ljava/lang/Object;

    iput-object p2, p0, La2/f;->i:Ljava/lang/Object;

    iput-object p4, p0, La2/f;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, La2/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La2/f;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lk2/b;

    .line 9
    .line 10
    iget-object v1, p0, La2/f;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lf2/j;

    .line 13
    .line 14
    iget-object v2, v1, Lf2/j;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p0, La2/f;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lf2/i;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v4, Lk2/b;->f:Ljava/util/logging/Logger;

    .line 24
    .line 25
    const-string v5, "Transport backend \'"

    .line 26
    .line 27
    :try_start_0
    iget-object v6, v0, Lk2/b;->c:Lg2/d;

    .line 28
    .line 29
    invoke-virtual {v6, v2}, Lg2/d;->a(Ljava/lang/String;)Lg2/e;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "\' is not registered"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v4, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception v0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    check-cast v6, Ld2/c;

    .line 64
    .line 65
    invoke-virtual {v6, v3}, Ld2/c;->a(Lf2/i;)Lf2/i;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v3, v0, Lk2/b;->e:Ln2/c;

    .line 70
    .line 71
    new-instance v5, Lk2/a;

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    invoke-direct {v5, v0, v1, v2, v6}, Lk2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    check-cast v3, Lm2/h;

    .line 78
    .line 79
    invoke-virtual {v3, v5}, Lm2/h;->g(Ln2/b;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v2, "Error scheduling event "

    .line 86
    .line 87
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v4, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :goto_1
    return-void

    .line 105
    :pswitch_0
    iget-object v0, p0, La2/f;->h:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lcom/getcapacitor/cordova/MockCordovaWebViewImpl;

    .line 108
    .line 109
    iget-object v1, p0, La2/f;->i:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Ljava/lang/String;

    .line 112
    .line 113
    iget-object v2, p0, La2/f;->j:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Landroid/webkit/ValueCallback;

    .line 116
    .line 117
    invoke-static {v0, v1, v2}, Lcom/getcapacitor/cordova/MockCordovaWebViewImpl;->a(Lcom/getcapacitor/cordova/MockCordovaWebViewImpl;Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_1
    iget-object v0, p0, La2/f;->h:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;

    .line 124
    .line 125
    iget-object v1, p0, La2/f;->j:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Lcom/getcapacitor/PluginCall;

    .line 128
    .line 129
    iget-object v2, p0, La2/f;->i:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v2, Lx2/a;

    .line 132
    .line 133
    invoke-static {v0, v1, v2}, Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;->a(Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_2
    iget-object v0, p0, La2/f;->h:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;

    .line 140
    .line 141
    iget-object v1, p0, La2/f;->j:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Lcom/getcapacitor/PluginCall;

    .line 144
    .line 145
    iget-object v2, p0, La2/f;->i:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Lx2/a;

    .line 148
    .line 149
    invoke-static {v0, v1, v2}, Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;->a(Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :pswitch_3
    iget-object v0, p0, La2/f;->h:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lk1/j;

    .line 156
    .line 157
    iget-object v1, p0, La2/f;->i:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, Lz2/b;

    .line 160
    .line 161
    iget-object v2, p0, La2/f;->j:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 164
    .line 165
    :try_start_1
    iget-object v0, v0, Lk1/j;->h:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Landroid/content/Context;

    .line 168
    .line 169
    invoke-static {v0}, Ly4/b;->k(Landroid/content/Context;)Landroidx/emoji2/text/w;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_1

    .line 174
    .line 175
    iget-object v3, v0, Landroidx/emoji2/text/w;->a:Landroidx/emoji2/text/k;

    .line 176
    .line 177
    check-cast v3, Landroidx/emoji2/text/v;

    .line 178
    .line 179
    iget-object v4, v3, Landroidx/emoji2/text/v;->j:Ljava/lang/Object;

    .line 180
    .line 181
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    :try_start_2
    iput-object v2, v3, Landroidx/emoji2/text/v;->l:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 183
    .line 184
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 185
    :try_start_3
    iget-object v0, v0, Landroidx/emoji2/text/w;->a:Landroidx/emoji2/text/k;

    .line 186
    .line 187
    new-instance v3, Landroidx/emoji2/text/m;

    .line 188
    .line 189
    invoke-direct {v3, v1, v2}, Landroidx/emoji2/text/m;-><init>(Lz2/b;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v0, v3}, Landroidx/emoji2/text/k;->i(Lz2/b;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :catchall_0
    move-exception v0

    .line 197
    goto :goto_2

    .line 198
    :catchall_1
    move-exception v0

    .line 199
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 200
    :try_start_5
    throw v0

    .line 201
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 202
    .line 203
    const-string v3, "EmojiCompat font provider not available on this device."

    .line 204
    .line 205
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 209
    :goto_2
    invoke-virtual {v1, v0}, Lz2/b;->s(Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 213
    .line 214
    .line 215
    :goto_3
    return-void

    .line 216
    :pswitch_4
    iget-object v0, p0, La2/f;->h:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;

    .line 219
    .line 220
    iget-object v1, p0, La2/f;->i:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v1, Landroid/app/Activity;

    .line 223
    .line 224
    iget-object v2, p0, La2/f;->j:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v2, Lcom/getcapacitor/PluginCall;

    .line 227
    .line 228
    invoke-static {v0, v1, v2}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->f(Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;Landroid/app/Activity;Lcom/getcapacitor/PluginCall;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
