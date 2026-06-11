.class public final synthetic Ld/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;


# instance fields
.field public final synthetic g:Ld/h;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ld/b;

.field public final synthetic j:Le/a;


# direct methods
.method public synthetic constructor <init>(Ld/h;Ljava/lang/String;Ld/b;Le/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/d;->g:Ld/h;

    iput-object p2, p0, Ld/d;->h:Ljava/lang/String;

    iput-object p3, p0, Ld/d;->i:Ld/b;

    iput-object p4, p0, Ld/d;->j:Le/a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/t;Landroidx/lifecycle/m;)V
    .locals 5

    .line 1
    iget-object p1, p0, Ld/d;->g:Ld/h;

    .line 2
    .line 3
    iget-object v0, p1, Ld/h;->e:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    sget-object v1, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 6
    .line 7
    iget-object v2, p0, Ld/d;->h:Ljava/lang/String;

    .line 8
    .line 9
    if-ne v1, p2, :cond_1

    .line 10
    .line 11
    iget-object p2, p1, Ld/h;->g:Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object p1, p1, Ld/h;->f:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    new-instance v1, Ld/e;

    .line 16
    .line 17
    iget-object v3, p0, Ld/d;->j:Le/a;

    .line 18
    .line 19
    iget-object v4, p0, Ld/d;->i:Ld/b;

    .line 20
    .line 21
    invoke-direct {v1, v3, v4}, Ld/e;-><init>(Le/a;Ld/b;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-interface {v4, v0}, Ld/b;->c(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {p2, v2}, Ly4/b;->v(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ld/a;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget p2, p1, Ld/a;->g:I

    .line 55
    .line 56
    iget-object p1, p1, Ld/a;->h:Landroid/content/Intent;

    .line 57
    .line 58
    invoke-virtual {v3, p1, p2}, Le/a;->c(Landroid/content/Intent;I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {v4, p1}, Ld/b;->c(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    sget-object v1, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 67
    .line 68
    if-ne v1, p2, :cond_2

    .line 69
    .line 70
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    sget-object v0, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 75
    .line 76
    if-ne v0, p2, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Ld/h;->f(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    return-void
.end method
