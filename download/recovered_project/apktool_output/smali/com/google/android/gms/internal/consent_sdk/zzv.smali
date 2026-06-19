.class public final synthetic Lcom/google/android/gms/internal/consent_sdk/zzv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/consent_sdk/zzw;

.field public final synthetic zzb:Landroid/app/Activity;

.field public final synthetic zzc:Li3/i;

.field public final synthetic zzd:Li3/f;

.field public final synthetic zze:Li3/e;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/consent_sdk/zzw;Landroid/app/Activity;Li3/i;Li3/f;Li3/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/consent_sdk/zzv;->zza:Lcom/google/android/gms/internal/consent_sdk/zzw;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/consent_sdk/zzv;->zzb:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/consent_sdk/zzv;->zzc:Li3/i;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/consent_sdk/zzv;->zzd:Li3/f;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/consent_sdk/zzv;->zze:Li3/e;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzv;->zza:Lcom/google/android/gms/internal/consent_sdk/zzw;

    iget-object v1, p0, Lcom/google/android/gms/internal/consent_sdk/zzv;->zzb:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/android/gms/internal/consent_sdk/zzv;->zzc:Li3/i;

    iget-object v3, p0, Lcom/google/android/gms/internal/consent_sdk/zzv;->zzd:Li3/f;

    iget-object v4, p0, Lcom/google/android/gms/internal/consent_sdk/zzv;->zze:Li3/e;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/consent_sdk/zzw;->zza(Lcom/google/android/gms/internal/consent_sdk/zzw;Landroid/app/Activity;Li3/i;Li3/f;Li3/e;)V

    return-void
.end method
