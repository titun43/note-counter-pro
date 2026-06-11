.class public Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;
.super Lcom/getcapacitor/Plugin;
.source "SourceFile"


# annotations
.annotation runtime Lcom/getcapacitor/annotation/CapacitorPlugin;
    name = "ContactPicker"
    permissions = {
        .subannotation Lcom/getcapacitor/annotation/Permission;
            alias = "contacts"
            strings = {
                "android.permission.READ_CONTACTS"
            }
        .end subannotation
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ContactPickerPlugin"


# instance fields
.field private contactPickerLauncher:Ld/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/c;"
        }
    .end annotation
.end field

.field private savedCall:Lcom/getcapacitor/PluginCall;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/Plugin;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->savedCall:Lcom/getcapacitor/PluginCall;

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic c(Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;Ld/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->lambda$load$0(Ld/a;)V

    return-void
.end method

.method private getContactData(Landroid/net/Uri;)Lcom/getcapacitor/JSObject;
    .locals 12

    .line 1
    const-string v1, "ContactPickerPlugin"

    .line 2
    .line 3
    const-string v0, "Raw - Name: "

    .line 4
    .line 5
    new-instance v2, Lcom/getcapacitor/JSObject;

    .line 6
    .line 7
    invoke-direct {v2}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x1

    .line 15
    const-string v5, "cancelled"

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2, v5, v4}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const/4 v10, 0x0

    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    move-object v7, p1

    .line 33
    :try_start_0
    invoke-virtual/range {v6 .. v11}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-eqz v3, :cond_6

    .line 38
    .line 39
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_6

    .line 44
    .line 45
    const-string p1, "data1"

    .line 46
    .line 47
    invoke-interface {v3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    const-string v6, ""

    .line 52
    .line 53
    if-ltz p1, :cond_1

    .line 54
    .line 55
    :try_start_1
    invoke-interface {v3, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    move-object p1, v0

    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :catch_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    goto :goto_4

    .line 67
    :cond_1
    move-object p1, v6

    .line 68
    :goto_0
    const-string v7, "display_name"

    .line 69
    .line 70
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-ltz v7, :cond_2

    .line 75
    .line 76
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move-object v7, v6

    .line 82
    :goto_1
    if-eqz p1, :cond_3

    .line 83
    .line 84
    const-string v8, "[\\s\\-\\(\\)]"

    .line 85
    .line 86
    invoke-virtual {p1, v8, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :cond_3
    new-instance v8, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v0, ", Phone: "

    .line 99
    .line 100
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    const-string v0, "mobile"

    .line 114
    .line 115
    if-eqz p1, :cond_4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    move-object p1, v6

    .line 119
    :goto_2
    invoke-virtual {v2, v0, p1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 120
    .line 121
    .line 122
    const-string p1, "name"

    .line 123
    .line 124
    if-eqz v7, :cond_5

    .line 125
    .line 126
    move-object v6, v7

    .line 127
    :cond_5
    invoke-virtual {v2, p1, v6}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 128
    .line 129
    .line 130
    const/4 p1, 0x0

    .line 131
    invoke-virtual {v2, v5, p1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    const-string p1, "Cursor is null or empty"

    .line 136
    .line 137
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v5, v4}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    .line 142
    .line 143
    :goto_3
    if-eqz v3, :cond_7

    .line 144
    .line 145
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 146
    .line 147
    .line 148
    return-object v2

    .line 149
    :goto_4
    :try_start_2
    const-string v0, "Error querying contact data"

    .line 150
    .line 151
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v5, v4}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 155
    .line 156
    .line 157
    const-string v0, "error"

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {v2, v0, p1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    .line 165
    .line 166
    if-eqz v3, :cond_7

    .line 167
    .line 168
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 169
    .line 170
    .line 171
    :cond_7
    return-object v2

    .line 172
    :goto_5
    if-eqz v3, :cond_8

    .line 173
    .line 174
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 175
    .line 176
    .line 177
    :cond_8
    throw p1
.end method

.method private handleActivityResult(Ld/a;)V
    .locals 7

    .line 1
    const-string v0, "Contact data: "

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->savedCall:Lcom/getcapacitor/PluginCall;

    .line 4
    .line 5
    const-string v2, "ContactPickerPlugin"

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string p1, "No saved call, ignoring result"

    .line 10
    .line 11
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget v1, p1, Ld/a;->g:I

    .line 16
    .line 17
    const/4 v3, -0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    const-string v6, "cancelled"

    .line 21
    .line 22
    if-ne v1, v3, :cond_2

    .line 23
    .line 24
    iget-object p1, p1, Ld/a;->h:Landroid/content/Intent;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v3, "Contact selected: "

    .line 35
    .line 36
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    new-instance p1, Lcom/getcapacitor/JSObject;

    .line 52
    .line 53
    invoke-direct {p1}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v6, v5}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->savedCall:Lcom/getcapacitor/PluginCall;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 62
    .line 63
    .line 64
    iput-object v4, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->savedCall:Lcom/getcapacitor/PluginCall;

    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->getContactData(Landroid/net/Uri;)Lcom/getcapacitor/JSObject;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->savedCall:Lcom/getcapacitor/PluginCall;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catch_0
    move-exception p1

    .line 97
    const-string v0, "Failed to read contact data"

    .line 98
    .line 99
    invoke-static {v2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->savedCall:Lcom/getcapacitor/PluginCall;

    .line 103
    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v2, "Failed to read contact: "

    .line 107
    .line 108
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {v0, p1}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    const-string p1, "Contact picker cancelled"

    .line 127
    .line 128
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    new-instance p1, Lcom/getcapacitor/JSObject;

    .line 132
    .line 133
    invoke-direct {p1}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v6, v5}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->savedCall:Lcom/getcapacitor/PluginCall;

    .line 140
    .line 141
    invoke-virtual {v0, p1}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 142
    .line 143
    .line 144
    :goto_0
    iput-object v4, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->savedCall:Lcom/getcapacitor/PluginCall;

    .line 145
    .line 146
    return-void
.end method

.method private lambda$load$0(Ld/a;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ActivityResult received: resultCode="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p1, Ld/a;->g:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "ContactPickerPlugin"

    .line 18
    .line 19
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1}, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->handleActivityResult(Ld/a;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public load()V
    .locals 5

    .line 1
    const-string v0, "ContactPickerPlugin"

    .line 2
    .line 3
    invoke-super {p0}, Lcom/getcapacitor/Plugin;->load()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Landroidx/fragment/app/p0;

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v2, v3}, Landroidx/fragment/app/p0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lcom/getcapacitor/plugin/c;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-direct {v3, p0, v4}, Lcom/getcapacitor/plugin/c;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroidx/activity/s;->registerForActivityResult(Le/a;Ld/b;)Ld/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->contactPickerLauncher:Ld/c;

    .line 27
    .line 28
    const-string v1, "ContactPickerLauncher registered successfully"

    .line 29
    .line 30
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catch_0
    move-exception v1

    .line 35
    const-string v2, "Failed to register ActivityResultLauncher"

    .line 36
    .line 37
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public pickContact(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->contactPickerLauncher:Ld/c;

    .line 2
    .line 3
    const-string v1, "ContactPickerPlugin"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Launcher is null, cannot pick contact"

    .line 8
    .line 9
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    const-string v0, "Contact picker not available"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput-object p1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->savedCall:Lcom/getcapacitor/PluginCall;

    .line 19
    .line 20
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 21
    .line 22
    const-string v2, "android.intent.action.PICK"

    .line 23
    .line 24
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v2, "vnd.android.cursor.dir/phone_v2"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->contactPickerLauncher:Ld/c;

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ld/c;->a(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "Contact picker launched"

    .line 38
    .line 39
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catch_0
    move-exception v0

    .line 44
    const-string v2, "Failed to open contact picker"

    .line 45
    .line 46
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    iput-object v1, p0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;->savedCall:Lcom/getcapacitor/PluginCall;

    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v2, "Failed to open contact picker: "

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method
