.class public final Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

.field private static final cannotDeleteChildren:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

.field private static final filePermissionsDenied:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

.field private static final missingParentDirectories:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->INSTANCE:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;

    .line 7
    .line 8
    new-instance v1, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 9
    .line 10
    const/4 v2, 0x7

    .line 11
    invoke-direct {v0, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->formatErrorCode(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "Unable to do file operation, user denied permission request."

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->filePermissionsDenied:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 21
    .line 22
    new-instance v1, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 23
    .line 24
    const/16 v2, 0xb

    .line 25
    .line 26
    invoke-direct {v0, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->formatErrorCode(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "Missing parent directory \u2013 possibly recursive=false was passed or parent directory creation failed."

    .line 31
    .line 32
    invoke-direct {v1, v2, v3}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->missingParentDirectories:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 36
    .line 37
    new-instance v1, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 38
    .line 39
    const/16 v2, 0xc

    .line 40
    .line 41
    invoke-direct {v0, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->formatErrorCode(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v2, "Cannot delete directory with children; received recursive=false but directory has contents."

    .line 46
    .line 47
    invoke-direct {v1, v0, v2}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sput-object v1, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->cannotDeleteChildren:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 51
    .line 52
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final formatErrorCode(I)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "<this>"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x4

    .line 15
    if-gt v1, v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr v1, v2

    .line 37
    const/4 v2, 0x1

    .line 38
    if-gt v2, v1, :cond_1

    .line 39
    .line 40
    :goto_0
    const/16 v3, 0x30

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    if-eq v2, v1, :cond_1

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    move-object p1, v0

    .line 54
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, "OS-PLUG-FILE-"

    .line 59
    .line 60
    invoke-static {v0, p1}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
.end method


# virtual methods
.method public final directoryCreationAlreadyExists(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    .locals 4

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-direct {p0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->formatErrorCode(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {p1}, Ln4/i;->X(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const-string v2, "at \'"

    .line 21
    .line 22
    const-string v3, "\' "

    .line 23
    .line 24
    invoke-static {v2, p1, v3}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p1, ""

    .line 30
    .line 31
    :goto_0
    const-string v2, "Directory "

    .line 32
    .line 33
    const-string v3, "already exists, cannot be overwritten."

    .line 34
    .line 35
    invoke-static {v2, p1, v3}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {v0, v1, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public final doesNotExist(Ljava/lang/String;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    .locals 4

    .line 1
    const-string v0, "methodName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->formatErrorCode(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p2}, Ln4/i;->X(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    const-string v2, "at \'"

    .line 26
    .line 27
    const-string v3, "\' "

    .line 28
    .line 29
    invoke-static {v2, p2, v3}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p2, ""

    .line 35
    .line 36
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v3, "\'"

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, "\' failed because file "

    .line 47
    .line 48
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, "does not exist."

    .line 55
    .line 56
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {v0, v1, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method

.method public final getCannotDeleteChildren()Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    .locals 1

    .line 1
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->cannotDeleteChildren:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFilePermissionsDenied()Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    .locals 1

    .line 1
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->filePermissionsDenied:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMissingParentDirectories()Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    .locals 1

    .line 1
    sget-object v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->missingParentDirectories:Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final invalidInputMethod(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    .locals 4

    .line 1
    const-string v0, "methodName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    invoke-direct {p0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->formatErrorCode(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "The \'"

    .line 14
    .line 15
    const-string v3, "\' input parameters aren\'t valid."

    .line 16
    .line 17
    invoke-static {v2, p1, v3}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v0, v1, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final invalidPath(Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    .locals 4

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    invoke-direct {p0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->formatErrorCode(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {p1}, Ln4/i;->X(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    const-string v2, "\'"

    .line 20
    .line 21
    const-string v3, "\' "

    .line 22
    .line 23
    invoke-static {v2, p1, v3}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p1, ""

    .line 29
    .line 30
    :goto_0
    const-string v2, "Invalid "

    .line 31
    .line 32
    const-string v3, "path."

    .line 33
    .line 34
    invoke-static {v2, p1, v3}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v0, v1, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public final notAllowed(Ljava/lang/String;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    .locals 4

    .line 1
    const-string v0, "methodName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "notAllowedFor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 12
    .line 13
    const/16 v1, 0x9

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->formatErrorCode(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, "\'"

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, "\' not supported for "

    .line 30
    .line 31
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, "."

    .line 38
    .line 39
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {v0, v1, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public final operationFailed(Ljava/lang/String;Ljava/lang/String;)Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;
    .locals 4

    .line 1
    const-string v0, "methodName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "errorMessage"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;

    .line 12
    .line 13
    const/16 v1, 0xd

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors;->formatErrorCode(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p2}, Ln4/i;->X(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    const-string v2, ": "

    .line 26
    .line 27
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p2, "an unknown error."

    .line 33
    .line 34
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v3, "\'"

    .line 37
    .line 38
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, "\' failed with"

    .line 45
    .line 46
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {v0, v1, p1}, Lcom/capacitorjs/plugins/filesystem/FilesystemErrors$ErrorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method
