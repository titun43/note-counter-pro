.class public final Lcom/capacitorjs/plugins/filesystem/FilesystemErrorsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final toFilesystemError(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "methodName"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p0, Lr3/t;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object p1, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 16
    .line 17
    check-cast p0, Lr3/t;

    .line 18
    .line 19
    iget-object p0, p0, Lr3/t;->g:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidPath(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    instance-of v0, p0, Lr3/o;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 31
    .line 32
    check-cast p0, Lr3/o;

    .line 33
    .line 34
    iget-object p0, p0, Lr3/o;->g:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->doesNotExist(Ljava/lang/String;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    instance-of v0, p0, Lr3/p;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    sget-object p0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 46
    .line 47
    const-string v0, "content:// URIs"

    .line 48
    .line 49
    invoke-virtual {p0, p1, v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->notAllowed(Ljava/lang/String;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_2
    instance-of v0, p0, Lr3/q;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    sget-object p0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 59
    .line 60
    const-string v0, "directories"

    .line 61
    .line 62
    invoke-virtual {p0, p1, v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->notAllowed(Ljava/lang/String;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_3
    instance-of v0, p0, Lr3/r;

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    sget-object p0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 72
    .line 73
    const-string v0, "files, only directories are supported"

    .line 74
    .line 75
    invoke-virtual {p0, p1, v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->notAllowed(Ljava/lang/String;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_4
    instance-of v0, p0, Lr3/l;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    sget-object p1, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 85
    .line 86
    check-cast p0, Lr3/l;

    .line 87
    .line 88
    iget-object p0, p0, Lr3/l;->g:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p1, p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->directoryCreationAlreadyExists(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_5
    instance-of v0, p0, Lr3/m;

    .line 96
    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    sget-object p0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->getMissingParentDirectories()Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_6
    instance-of v0, p0, Lr3/n;

    .line 107
    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    sget-object p0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->getCannotDeleteChildren()Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_7
    instance-of v0, p0, Lr3/h;

    .line 118
    .line 119
    if-nez v0, :cond_d

    .line 120
    .line 121
    instance-of v0, p0, Lr3/g;

    .line 122
    .line 123
    if-nez v0, :cond_d

    .line 124
    .line 125
    instance-of v0, p0, Lr3/j;

    .line 126
    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_8
    instance-of v0, p0, Lr3/f;

    .line 131
    .line 132
    if-eqz v0, :cond_9

    .line 133
    .line 134
    sget-object p1, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 135
    .line 136
    check-cast p0, Lr3/f;

    .line 137
    .line 138
    iget-object p0, p0, Lr3/f;->g:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {p1, p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->directoryCreationAlreadyExists(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :cond_9
    instance-of v0, p0, Lr3/i;

    .line 146
    .line 147
    if-eqz v0, :cond_a

    .line 148
    .line 149
    sget-object p0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->getMissingParentDirectories()Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    return-object p0

    .line 156
    :cond_a
    instance-of v0, p0, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    if-eqz v0, :cond_b

    .line 159
    .line 160
    sget-object p0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 161
    .line 162
    invoke-virtual {p0, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :cond_b
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    if-nez p0, :cond_c

    .line 174
    .line 175
    const-string p0, ""

    .line 176
    .line 177
    :cond_c
    invoke-virtual {v0, p1, p0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->operationFailed(Ljava/lang/String;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :cond_d
    :goto_0
    sget-object p0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 183
    .line 184
    const-string v0, "the provided source and destinations"

    .line 185
    .line 186
    invoke-virtual {p0, p1, v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->notAllowed(Ljava/lang/String;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0
.end method
