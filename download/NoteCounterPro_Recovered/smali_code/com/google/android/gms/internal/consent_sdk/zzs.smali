.class public final synthetic Lcom/google/android/gms/internal/consent_sdk/zzs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Li3/e;

.field public final synthetic zzb:Lcom/google/android/gms/internal/consent_sdk/zzg;


# direct methods
.method public synthetic constructor <init>(Li3/e;Lcom/google/android/gms/internal/consent_sdk/zzg;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/consent_sdk/zzs;->zza:Li3/e;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/consent_sdk/zzs;->zzb:Lcom/google/android/gms/internal/consent_sdk/zzg;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzs;->zza:Li3/e;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/consent_sdk/zzs;->zzb:Lcom/google/android/gms/internal/consent_sdk/zzg;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/consent_sdk/zzg;->zza()Li3/j;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Li3/e;->onConsentInfoUpdateFailure(Li3/j;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
