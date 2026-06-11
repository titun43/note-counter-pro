.class public final Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final options:Lr3/a0;

.field private final uri:Lr3/g0;


# direct methods
.method public constructor <init>(Lr3/g0;Lr3/a0;)V
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->uri:Lr3/g0;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->options:Lr3/a0;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic copy$default(Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;Lr3/g0;Lr3/a0;ILjava/lang/Object;)Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->uri:Lr3/g0;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->options:Lr3/a0;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->copy(Lr3/g0;Lr3/a0;)Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final component1()Lr3/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->uri:Lr3/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Lr3/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->options:Lr3/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Lr3/g0;Lr3/a0;)Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;-><init>(Lr3/g0;Lr3/a0;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;

    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->uri:Lr3/g0;

    iget-object v3, p1, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->uri:Lr3/g0;

    invoke-static {v1, v3}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->options:Lr3/a0;

    iget-object p1, p1, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->options:Lr3/a0;

    invoke-static {v1, p1}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getOptions()Lr3/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->options:Lr3/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUri()Lr3/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->uri:Lr3/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->uri:Lr3/g0;

    invoke-virtual {v0}, Lr3/g0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->options:Lr3/a0;

    invoke-virtual {v1}, Lr3/a0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->uri:Lr3/g0;

    iget-object v1, p0, Lcom/capacitorjs/plugins/filesystem/ReadFileOptions;->options:Lr3/a0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ReadFileOptions(uri="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
