.class public Lcom/getcapacitor/util/HostMask$Parser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/getcapacitor/util/HostMask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Parser"
.end annotation


# static fields
.field private static NOTHING:Lcom/getcapacitor/util/HostMask;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/util/HostMask$Nothing;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/util/HostMask$Nothing;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/getcapacitor/util/HostMask$Parser;->NOTHING:Lcom/getcapacitor/util/HostMask;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static parse(Ljava/lang/String;)Lcom/getcapacitor/util/HostMask;
    .locals 0

    if-nez p0, :cond_0

    .line 2
    sget-object p0, Lcom/getcapacitor/util/HostMask$Parser;->NOTHING:Lcom/getcapacitor/util/HostMask;

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/getcapacitor/util/HostMask$Simple;->parse(Ljava/lang/String;)Lcom/getcapacitor/util/HostMask$Simple;

    move-result-object p0

    return-object p0
.end method

.method public static parse([Ljava/lang/String;)Lcom/getcapacitor/util/HostMask;
    .locals 0

    if-nez p0, :cond_0

    .line 1
    sget-object p0, Lcom/getcapacitor/util/HostMask$Parser;->NOTHING:Lcom/getcapacitor/util/HostMask;

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/getcapacitor/util/HostMask$Any;->parse([Ljava/lang/String;)Lcom/getcapacitor/util/HostMask$Any;

    move-result-object p0

    return-object p0
.end method
