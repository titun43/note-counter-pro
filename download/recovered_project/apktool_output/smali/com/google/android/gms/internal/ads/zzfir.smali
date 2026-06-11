.class public final Lcom/google/android/gms/internal/ads/zzfir;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zzA:Lcom/google/android/gms/internal/ads/zzccb;

.field public final zzB:Ljava/lang/String;

.field public final zzC:Lorg/json/JSONObject;

.field public final zzD:Lorg/json/JSONObject;

.field public final zzE:Ljava/lang/String;

.field public final zzF:Ljava/lang/String;

.field public final zzG:Ljava/lang/String;

.field public final zzH:Ljava/lang/String;

.field public final zzI:Ljava/lang/String;

.field public final zzJ:Z

.field public final zzK:Z

.field public final zzL:Z

.field public final zzM:Z

.field public final zzN:Z

.field public final zzO:Z

.field public final zzP:Z

.field public final zzQ:I

.field public final zzR:I

.field public final zzS:Z

.field public final zzT:Z

.field public final zzU:Ljava/lang/String;

.field public final zzV:Lcom/google/android/gms/internal/ads/zzfjn;

.field public final zzW:Z

.field public final zzX:Z

.field public final zzY:I

.field public final zzZ:Ljava/lang/String;

.field public final zza:Ljava/util/List;

.field public final zzaA:Ljava/util/List;

.field public final zzaB:Z

.field public final zzaC:Ljava/util/List;

.field public final zzaD:Z

.field public final zzaE:I

.field public final zzaF:Landroid/os/Bundle;

.field public final zzaG:Z

.field public final zzaH:I

.field public final zzaa:I

.field public final zzab:Ljava/lang/String;

.field public final zzac:Z

.field public final zzad:Lcom/google/android/gms/internal/ads/zzbxy;

.field public final zzae:Lcom/google/android/gms/ads/internal/client/zzt;

.field public final zzaf:Ljava/lang/String;

.field public final zzag:Z

.field public final zzah:Lorg/json/JSONObject;

.field public final zzai:Z

.field public final zzaj:Lorg/json/JSONObject;

.field public final zzak:Z

.field public final zzal:Ljava/lang/String;

.field public final zzam:Z

.field public final zzan:Ljava/lang/String;

.field public final zzao:Ljava/lang/String;

.field public final zzap:Ljava/lang/String;

.field public final zzaq:Z

.field public final zzar:Z

.field public final zzas:I

.field public final zzat:Ljava/lang/String;

.field public final zzau:Ljava/util/List;

.field public final zzav:Z

.field public final zzaw:Ljava/util/Map;

.field public final zzax:Lcom/google/android/gms/ads/internal/util/client/zzv;

.field public final zzay:Lcom/google/android/gms/ads/internal/util/client/zzw;

.field public final zzaz:D

.field public final zzb:I

.field public final zzc:Ljava/util/List;

.field public final zzd:Ljava/util/List;

.field public final zze:I

.field public final zzf:Ljava/util/List;

.field public final zzg:Ljava/util/List;

.field public final zzh:Ljava/util/List;

.field public final zzi:Ljava/util/List;

.field public final zzj:Ljava/lang/String;

.field public final zzk:Ljava/lang/String;

.field public final zzl:Lcom/google/android/gms/internal/ads/zzcas;

.field public final zzm:Ljava/util/List;

.field public final zzn:Ljava/util/List;

.field public final zzo:Ljava/util/List;

.field public final zzp:Ljava/util/List;

.field public final zzq:I

.field public final zzr:Ljava/util/List;

.field public final zzs:Lcom/google/android/gms/internal/ads/zzfiw;

.field public final zzt:Ljava/util/List;

.field public final zzu:Ljava/util/List;

.field public final zzv:Lorg/json/JSONObject;

.field public final zzw:Ljava/lang/String;

.field public final zzx:Ljava/lang/String;

.field public final zzy:Ljava/lang/String;

.field public final zzz:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/util/JsonReader;)V
    .locals 92

    move-object/from16 v0, p0

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    new-instance v3, Lorg/json/JSONObject;

    .line 3
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    new-instance v4, Lorg/json/JSONObject;

    .line 4
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    new-instance v5, Lorg/json/JSONObject;

    .line 5
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    new-instance v6, Lorg/json/JSONObject;

    .line 6
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    new-instance v7, Lorg/json/JSONObject;

    .line 7
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    move-result-object v8

    new-instance v9, Ljava/util/HashMap;

    .line 10
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    move-result-object v10

    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    move-result-object v11

    new-instance v12, Landroid/os/Bundle;

    .line 13
    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 14
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->beginObject()V

    const/4 v13, 0x1

    const/4 v14, -0x1

    const/4 v15, 0x0

    const/16 v16, 0x2

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-string v20, ""

    move-object/from16 v70, v1

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    move-object/from16 v27, v9

    move-object/from16 v28, v10

    move-object/from16 v29, v11

    move-object/from16 v30, v12

    move/from16 v31, v13

    move/from16 v32, v14

    move/from16 v33, v32

    move/from16 v34, v33

    move v14, v15

    move/from16 v35, v14

    move/from16 v36, v35

    move/from16 v37, v36

    move/from16 v38, v37

    move/from16 v39, v38

    move/from16 v40, v39

    move/from16 v41, v40

    move/from16 v42, v41

    move/from16 v43, v42

    move/from16 v44, v43

    move/from16 v45, v44

    move/from16 v46, v45

    move/from16 v47, v46

    move/from16 v48, v47

    move/from16 v49, v48

    move/from16 v50, v49

    move/from16 v51, v50

    move/from16 v52, v51

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v69, v58

    move/from16 v59, v16

    move-wide/from16 v60, v17

    move-object/from16 v12, v19

    move-object/from16 v62, v12

    move-object/from16 v63, v62

    move-object/from16 v64, v63

    move-object/from16 v65, v64

    move-object/from16 v66, v65

    move-object/from16 v67, v66

    move-object/from16 v68, v67

    move-object/from16 v11, v20

    move-object v13, v11

    move-object/from16 v71, v13

    move-object/from16 v72, v71

    move-object/from16 v73, v72

    move-object/from16 v74, v73

    move-object/from16 v75, v74

    move-object/from16 v76, v75

    move-object/from16 v77, v76

    move-object/from16 v78, v77

    move-object/from16 v79, v78

    move-object/from16 v80, v79

    move-object/from16 v81, v80

    move-object/from16 v82, v81

    move-object/from16 v83, v82

    move-object/from16 v84, v83

    move-object/from16 v85, v84

    move-object/from16 v86, v85

    move-object/from16 v87, v86

    move-object/from16 v88, v87

    move-object/from16 v3, v70

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object/from16 v17, v10

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v16, v2

    move-object/from16 v2, v19

    .line 15
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->hasNext()Z

    move-result v89

    if-eqz v89, :cond_a

    .line 16
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v89

    if-nez v89, :cond_0

    move-object/from16 v90, v20

    goto :goto_1

    :cond_0
    move-object/from16 v90, v89

    :goto_1
    invoke-virtual/range {v90 .. v90}, Ljava/lang/String;->hashCode()I

    move-result v89

    sparse-switch v89, :sswitch_data_0

    move-object/from16 v91, v9

    move-object/from16 v89, v10

    goto/16 :goto_4

    :sswitch_0
    move-object/from16 v89, v10

    .line 17
    const-string v10, "flow_control"

    move-object/from16 v91, v9

    move-object/from16 v9, v90

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 18
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v57, v9

    :cond_1
    :goto_2
    move-object/from16 v10, v89

    :goto_3
    move-object/from16 v9, v91

    goto :goto_0

    :sswitch_1
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 19
    const-string v10, "render_serially"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 20
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v56, v9

    goto :goto_2

    :sswitch_2
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 21
    const-string v10, "manual_tracking_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 22
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v70, v9

    goto :goto_2

    :sswitch_3
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 23
    const-string v10, "rule_line_external_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 24
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v79

    goto :goto_2

    :sswitch_4
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 25
    const-string v10, "is_analytics_logging_enabled"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 26
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v44, v9

    goto :goto_2

    :sswitch_5
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 27
    const-string v10, "renderers"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v1

    goto :goto_2

    :sswitch_6
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    const-string v10, "use_third_party_container_height"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 28
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v47, v9

    goto :goto_2

    :sswitch_7
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 29
    const-string v10, "video_reward_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 30
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v6

    goto/16 :goto_2

    :sswitch_8
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 31
    const-string v10, "ad_network_class_name"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 32
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v80

    goto/16 :goto_2

    :sswitch_9
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 33
    const-string v10, "video_start_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 34
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v5

    goto/16 :goto_2

    :sswitch_a
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 35
    const-string v10, "bid_response"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 36
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v76

    goto/16 :goto_2

    :sswitch_b
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 37
    const-string v10, "adapter_only_third_party_impression"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 38
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v58, v9

    goto/16 :goto_2

    :sswitch_c
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 39
    const-string v10, "post_click_lifecycle_monitoring_duration_ms"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 40
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zzoo:Lcom/google/android/gms/internal/ads/zzbgv;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbgv;->zzg()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 41
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v9

    move/from16 v34, v9

    goto/16 :goto_2

    .line 42
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_2

    :sswitch_d
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 43
    const-string v10, "ad_source_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 44
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v82

    goto/16 :goto_2

    :sswitch_e
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 45
    const-string v10, "is_collapsible"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 46
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v53, v9

    goto/16 :goto_2

    :sswitch_f
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 47
    const-string v10, "allow_pub_owned_ad_view"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 48
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v36, v9

    goto/16 :goto_2

    :sswitch_10
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 49
    const-string v10, "preload_sort_value"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 50
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextDouble()D

    move-result-wide v9

    move-wide/from16 v60, v9

    goto/16 :goto_2

    :sswitch_11
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 51
    const-string v10, "cache_hit_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 52
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    goto/16 :goto_2

    :sswitch_12
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 53
    const-string v10, "adapter_response_info_key"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 54
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v87

    goto/16 :goto_2

    :sswitch_13
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 55
    const-string v10, "rewards"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 56
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zze(Landroid/util/JsonReader;)Lorg/json/JSONArray;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzcas;->zza(Lorg/json/JSONArray;)Lcom/google/android/gms/internal/ads/zzcas;

    move-result-object v9

    move-object v12, v9

    goto/16 :goto_2

    :sswitch_14
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 57
    const-string v10, "transaction_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 58
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v13

    goto/16 :goto_2

    :sswitch_15
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 59
    const-string v10, "analytics_event_name_to_parameters_map"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 60
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zzaK:Lcom/google/android/gms/internal/ads/zzbgv;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbgv;->zzg()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_3

    .line 61
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzc(Landroid/util/JsonReader;)Ljava/util/Map;

    move-result-object v9

    move-object/from16 v27, v9

    goto/16 :goto_2

    .line 62
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_2

    :sswitch_16
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 63
    const-string v10, "impression_type"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 64
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzfir;->zzd(I)I

    move-result v9

    move v14, v9

    goto/16 :goto_2

    :sswitch_17
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 65
    const-string v10, "container_sizes"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 66
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfis;->zza(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v19, v9

    goto/16 :goto_2

    :sswitch_18
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 67
    const-string v10, "response_info_extras_override"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 68
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zzhJ:Lcom/google/android/gms/internal/ads/zzbgv;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbgv;->zzg()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 69
    :try_start_0
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzl(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v9
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v9, :cond_1

    move-object/from16 v30, v9

    goto/16 :goto_2

    .line 70
    :catch_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_2

    .line 71
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_2

    :sswitch_19
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 72
    const-string v10, "debug_dialog_string"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 73
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v75

    goto/16 :goto_2

    :sswitch_1a
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 74
    const-string v10, "presentation_error_timeout_ms"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 75
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v9

    move/from16 v69, v9

    goto/16 :goto_2

    :sswitch_1b
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 76
    const-string v10, "consent_form_action_identifier"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 77
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v9

    move/from16 v55, v9

    goto/16 :goto_2

    :sswitch_1c
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 78
    const-string v10, "is_closable_area_disabled"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 79
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v41, v9

    goto/16 :goto_2

    :sswitch_1d
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 80
    const-string v10, "is_secondary_analytics_logging_enabled"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 81
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v31, v9

    goto/16 :goto_2

    :sswitch_1e
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 82
    const-string v10, "ad_load_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 83
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v4

    goto/16 :goto_2

    :sswitch_1f
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 84
    const-string v10, "qdata"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 85
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v73

    goto/16 :goto_2

    :sswitch_20
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 86
    const-string v10, "render_test_label"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 87
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v38, v9

    goto/16 :goto_2

    :sswitch_21
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 88
    const-string v10, "request_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 89
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v85

    goto/16 :goto_2

    :sswitch_22
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 90
    const-string v10, "data"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 91
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v16, v9

    goto/16 :goto_2

    :sswitch_23
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 92
    const-string v10, "id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 93
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v72

    goto/16 :goto_2

    :sswitch_24
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 94
    const-string v10, "ad"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 95
    new-instance v9, Lcom/google/android/gms/internal/ads/zzfiw;

    move-object/from16 v10, p1

    .line 96
    invoke-direct {v9, v10}, Lcom/google/android/gms/internal/ads/zzfiw;-><init>(Landroid/util/JsonReader;)V

    move-object/from16 v62, v9

    goto/16 :goto_2

    :cond_5
    move-object/from16 v10, p1

    goto/16 :goto_4

    :sswitch_25
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 97
    const-string v10, "allow_custom_click_gesture"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 98
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v37, v9

    goto/16 :goto_2

    :sswitch_26
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 99
    const-string v10, "is_offline_ad"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 100
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v49, v9

    goto/16 :goto_2

    :sswitch_27
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 101
    const-string v10, "native_required_asset_viewability"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 102
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v50, v9

    goto/16 :goto_2

    :sswitch_28
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 103
    const-string v10, "watermark"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 104
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v77

    goto/16 :goto_2

    :sswitch_29
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 105
    const-string v10, "force_disable_hardware_acceleration"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 106
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v51, v9

    goto/16 :goto_2

    :sswitch_2a
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 107
    const-string v10, "is_close_button_enabled"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 108
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    goto/16 :goto_2

    :sswitch_2b
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 109
    const-string v10, "content_url"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 110
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v66, v9

    goto/16 :goto_2

    :sswitch_2c
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 111
    const-string v10, "ad_close_time_ms"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 112
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v9

    move/from16 v33, v9

    goto/16 :goto_2

    :sswitch_2d
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 113
    const-string v10, "render_timeout_ms"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 114
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v9

    move/from16 v42, v9

    goto/16 :goto_2

    :sswitch_2e
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 115
    const-string v10, "rtb_native_required_assets"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 116
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v25, v9

    goto/16 :goto_2

    :sswitch_2f
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 117
    const-string v10, "imp_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 118
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_2

    :sswitch_30
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 119
    const-string v10, "safe_browsing"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 120
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzccb;->zza(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzccb;

    move-result-object v9

    move-object/from16 v63, v9

    goto/16 :goto_2

    :sswitch_31
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 121
    const-string v10, "late_load_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 122
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v26, v9

    goto/16 :goto_2

    :sswitch_32
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 123
    const-string v10, "on_device_storage_configs"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 124
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zziP:Lcom/google/android/gms/internal/ads/zzbgv;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbgv;->zzg()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_6

    .line 125
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzdzd;->zza(Landroid/util/JsonReader;)Lcom/google/android/gms/internal/ads/zzguf;

    move-result-object v9

    move-object/from16 v29, v9

    goto/16 :goto_2

    .line 126
    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_2

    :sswitch_33
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 127
    const-string v10, "click_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 128
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_2

    :sswitch_34
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 129
    const-string v10, "ad_source_instance_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 130
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v84

    goto/16 :goto_2

    :sswitch_35
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 131
    const-string v10, "valid_from_timestamp"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 132
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v11

    goto/16 :goto_2

    :sswitch_36
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 133
    const-string v10, "active_view"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 134
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v74

    goto/16 :goto_2

    :sswitch_37
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 135
    const-string v10, "video_complete_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 136
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v7

    goto/16 :goto_2

    :sswitch_38
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 137
    const-string v10, "allocation_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 138
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v71

    goto/16 :goto_2

    :sswitch_39
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 139
    const-string v10, "fill_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 140
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v8

    goto/16 :goto_2

    :sswitch_3a
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 141
    const-string v10, "is_scroll_aware"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 142
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v45, v9

    goto/16 :goto_2

    :sswitch_3b
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 143
    const-string v10, "ad_type"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 144
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzfir;->zzc(Ljava/lang/String;)I

    move-result v9

    move v15, v9

    goto/16 :goto_2

    :sswitch_3c
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 145
    const-string v10, "presentation_error_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 146
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object v10, v9

    goto/16 :goto_3

    :sswitch_3d
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 147
    const-string v10, "allow_pub_rendered_attribution"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 148
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v35, v9

    goto/16 :goto_2

    :sswitch_3e
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 149
    const-string v10, "ad_event_value"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 150
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/ads/internal/client/zzt;->zza(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/client/zzt;

    move-result-object v9

    move-object/from16 v65, v9

    goto/16 :goto_2

    :sswitch_3f
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 151
    const-string v10, "extras"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 152
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v22, v9

    goto/16 :goto_2

    :sswitch_40
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 153
    const-string v10, "test_mode_enabled"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 154
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v39, v9

    goto/16 :goto_2

    :sswitch_41
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 155
    const-string v10, "adapters"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 156
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v18, v9

    goto/16 :goto_2

    :sswitch_42
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 157
    const-string v10, "ad_sizes"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 158
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfis;->zza(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v17, v9

    goto/16 :goto_2

    :sswitch_43
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 159
    const-string v10, "ad_cover"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 160
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v24, v9

    goto/16 :goto_2

    :sswitch_44
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 161
    const-string v10, "showable_impression_type"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 162
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v9

    move/from16 v46, v9

    goto/16 :goto_2

    :sswitch_45
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 163
    const-string v10, "buffer_click_url_as_ready_to_ping"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 164
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v52, v9

    goto/16 :goto_2

    :sswitch_46
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 165
    const-string v10, "enable_omid"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 166
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v43, v9

    goto/16 :goto_2

    :sswitch_47
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 167
    const-string v10, "orientation"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 168
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzfir;->zze(Ljava/lang/String;)I

    move-result v9

    move/from16 v32, v9

    goto/16 :goto_2

    :sswitch_48
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 169
    const-string v10, "is_custom_close_blocked"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 170
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v40, v9

    goto/16 :goto_2

    :sswitch_49
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 171
    const-string v10, "nofill_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 172
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v10, v89

    goto/16 :goto_0

    :sswitch_4a
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 173
    const-string v10, "backend_query_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 174
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v78

    goto/16 :goto_2

    :sswitch_4b
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 175
    const-string v10, "preload_sort_type"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 176
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzfrn;->zza(I)I

    move-result v9

    move/from16 v59, v9

    goto/16 :goto_2

    :sswitch_4c
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 177
    const-string v10, "is_interscroller"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 178
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v48, v9

    goto/16 :goto_2

    :sswitch_4d
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 179
    const-string v10, "ad_source_name"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 180
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v81

    goto/16 :goto_2

    :sswitch_4e
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 181
    const-string v10, "parallel_key"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 182
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v88

    goto/16 :goto_2

    :sswitch_4f
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 183
    const-string v10, "play_prewarm_options"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 184
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzbxy;->zza(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzbxy;

    move-result-object v9

    move-object/from16 v64, v9

    goto/16 :goto_2

    :sswitch_50
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 185
    const-string v10, "network_ping_config"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 186
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zzjR:Lcom/google/android/gms/internal/ads/zzbgv;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbgv;->zzg()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_7

    .line 187
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/ads/internal/util/client/zzv;->zzb(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/util/client/zzv;

    move-result-object v9

    move-object/from16 v67, v9

    goto/16 :goto_2

    .line 188
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_2

    :sswitch_51
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 189
    const-string v10, "presentation_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 190
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzb(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v28, v9

    goto/16 :goto_2

    :sswitch_52
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 191
    const-string v10, "is_consent"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 192
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v9

    move/from16 v54, v9

    goto/16 :goto_2

    :sswitch_53
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 193
    const-string v10, "recursive_server_response_data"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 194
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v86

    goto/16 :goto_2

    :sswitch_54
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 195
    const-string v10, "offline_ad_config"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 196
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zzjT:Lcom/google/android/gms/internal/ads/zzbgv;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbgv;->zzg()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_8

    .line 197
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/ads/internal/util/client/zzw;->zzd(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/util/client/zzw;

    move-result-object v9

    move-object/from16 v68, v9

    goto/16 :goto_2

    .line 198
    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_2

    :sswitch_55
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 199
    const-string v10, "omid_settings"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 200
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v23, v9

    goto/16 :goto_2

    :sswitch_56
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 201
    const-string v10, "debug_signals"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 202
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v21, v9

    goto/16 :goto_2

    :sswitch_57
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    move-object/from16 v9, v90

    .line 203
    const-string v10, "ad_source_instance_name"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 204
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v83

    goto/16 :goto_2

    .line 205
    :cond_9
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_2

    :cond_a
    move-object/from16 v91, v9

    move-object/from16 v89, v10

    .line 206
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endObject()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zza:Ljava/util/List;

    iput v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzb:I

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzc:Ljava/util/List;

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzd:Ljava/util/List;

    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzf:Ljava/util/List;

    iput v14, v0, Lcom/google/android/gms/internal/ads/zzfir;->zze:I

    iput-object v5, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzg:Ljava/util/List;

    iput-object v6, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzh:Ljava/util/List;

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzi:Ljava/util/List;

    iput-object v13, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzj:Ljava/lang/String;

    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzk:Ljava/lang/String;

    iput-object v12, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzl:Lcom/google/android/gms/internal/ads/zzcas;

    iput-object v8, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzm:Ljava/util/List;

    move-object/from16 v1, v91

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzn:Ljava/util/List;

    move-object/from16 v1, v89

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzo:Ljava/util/List;

    move-object/from16 v1, v70

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzp:Ljava/util/List;

    move/from16 v15, v69

    iput v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzq:I

    move-object/from16 v1, v19

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzr:Ljava/util/List;

    move-object/from16 v1, v62

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzs:Lcom/google/android/gms/internal/ads/zzfiw;

    move-object/from16 v1, v18

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzt:Ljava/util/List;

    move-object/from16 v1, v17

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzu:Ljava/util/List;

    move-object/from16 v1, v71

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzw:Ljava/lang/String;

    move-object/from16 v2, v16

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzv:Lorg/json/JSONObject;

    move-object/from16 v1, v72

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzx:Ljava/lang/String;

    move-object/from16 v1, v73

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzy:Ljava/lang/String;

    move-object/from16 v1, v74

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzz:Ljava/lang/String;

    move-object/from16 v1, v63

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzA:Lcom/google/android/gms/internal/ads/zzccb;

    move-object/from16 v1, v75

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzB:Ljava/lang/String;

    move-object/from16 v3, v21

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzC:Lorg/json/JSONObject;

    move-object/from16 v4, v22

    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzD:Lorg/json/JSONObject;

    move/from16 v15, v35

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzJ:Z

    move/from16 v15, v36

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzK:Z

    move/from16 v15, v37

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzL:Z

    move/from16 v15, v38

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzM:Z

    move/from16 v15, v39

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzN:Z

    move/from16 v15, v40

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzO:Z

    move/from16 v15, v41

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzP:Z

    move/from16 v14, v32

    iput v14, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzQ:I

    move/from16 v15, v42

    iput v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzR:I

    move/from16 v15, v43

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzT:Z

    move-object/from16 v1, v76

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzU:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfjn;

    move-object/from16 v5, v23

    invoke-direct {v1, v5}, Lcom/google/android/gms/internal/ads/zzfjn;-><init>(Lorg/json/JSONObject;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzV:Lcom/google/android/gms/internal/ads/zzfjn;

    move/from16 v15, v44

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzW:Z

    move/from16 v15, v45

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzX:Z

    move/from16 v15, v46

    iput v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzY:I

    move-object/from16 v1, v77

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzZ:Ljava/lang/String;

    move/from16 v14, v33

    iput v14, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaa:I

    move-object/from16 v1, v78

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzab:Ljava/lang/String;

    move/from16 v15, v47

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzac:Z

    move-object/from16 v1, v64

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzad:Lcom/google/android/gms/internal/ads/zzbxy;

    move-object/from16 v1, v65

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzae:Lcom/google/android/gms/ads/internal/client/zzt;

    move-object/from16 v1, v79

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaf:Ljava/lang/String;

    move/from16 v15, v48

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzag:Z

    move-object/from16 v6, v24

    iput-object v6, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzah:Lorg/json/JSONObject;

    move-object/from16 v1, v80

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzE:Ljava/lang/String;

    move-object/from16 v1, v81

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzF:Ljava/lang/String;

    move-object/from16 v1, v82

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzG:Ljava/lang/String;

    move-object/from16 v1, v83

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzH:Ljava/lang/String;

    move-object/from16 v1, v84

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzI:Ljava/lang/String;

    move/from16 v15, v49

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzai:Z

    move-object/from16 v7, v25

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaj:Lorg/json/JSONObject;

    move/from16 v15, v50

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzak:Z

    move-object/from16 v1, v66

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzal:Ljava/lang/String;

    move/from16 v15, v51

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzam:Z

    move/from16 v15, v52

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzS:Z

    move-object/from16 v1, v85

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzan:Ljava/lang/String;

    move-object/from16 v1, v86

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzao:Ljava/lang/String;

    move-object/from16 v1, v87

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzap:Ljava/lang/String;

    move/from16 v15, v53

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaq:Z

    move/from16 v15, v54

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzar:Z

    move/from16 v15, v55

    iput v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzas:I

    move-object/from16 v8, v26

    iput-object v8, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzau:Ljava/util/List;

    move-object/from16 v1, v88

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzat:Ljava/lang/String;

    move/from16 v15, v56

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzav:Z

    move-object/from16 v9, v27

    iput-object v9, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaw:Ljava/util/Map;

    move-object/from16 v1, v67

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzax:Lcom/google/android/gms/ads/internal/util/client/zzv;

    move-object/from16 v1, v68

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzay:Lcom/google/android/gms/ads/internal/util/client/zzw;

    move-wide/from16 v1, v60

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaz:D

    move/from16 v1, v59

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaH:I

    move-object/from16 v10, v28

    iput-object v10, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaA:Ljava/util/List;

    move/from16 v15, v57

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaB:Z

    move-object/from16 v11, v29

    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaC:Ljava/util/List;

    move/from16 v15, v58

    iput-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaD:Z

    move/from16 v14, v34

    iput v14, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaE:I

    move-object/from16 v12, v30

    iput-object v12, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaF:Landroid/os/Bundle;

    move/from16 v13, v31

    iput-boolean v13, v0, Lcom/google/android/gms/internal/ads/zzfir;->zzaG:Z

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7f724a93 -> :sswitch_57
        -0x760d5f21 -> :sswitch_56
        -0x752755d7 -> :sswitch_55
        -0x751ba07e -> :sswitch_54
        -0x6f8bb127 -> :sswitch_53
        -0x6ddc55fb -> :sswitch_52
        -0x6db3fd17 -> :sswitch_51
        -0x6d0041e2 -> :sswitch_50
        -0x6c01c604 -> :sswitch_4f
        -0x6a655fd9 -> :sswitch_4e
        -0x69ea0ded -> :sswitch_4d
        -0x631f353f -> :sswitch_4c
        -0x6097a97b -> :sswitch_4b
        -0x60966ac3 -> :sswitch_4a
        -0x5c657e81 -> :sswitch_49
        -0x55d641b4 -> :sswitch_48
        -0x55cd0a30 -> :sswitch_47
        -0x552c574b -> :sswitch_46
        -0x53d154ad -> :sswitch_45
        -0x53abfab8 -> :sswitch_44
        -0x51fb2365 -> :sswitch_43
        -0x511c568a -> :sswitch_42
        -0x4dd838fc -> :sswitch_41
        -0x4daf44ce -> :sswitch_40
        -0x4cd5119d -> :sswitch_3f
        -0x49ea2690 -> :sswitch_3e
        -0x49901bd3 -> :sswitch_3d
        -0x45a06900 -> :sswitch_3c
        -0x44ada62a -> :sswitch_3b
        -0x4456b89f -> :sswitch_3a
        -0x428259e0 -> :sswitch_39
        -0x407d0b26 -> :sswitch_38
        -0x4041c09a -> :sswitch_37
        -0x3ea917c2 -> :sswitch_36
        -0x3a916a9c -> :sswitch_35
        -0x39f06783 -> :sswitch_34
        -0x2e4deec5 -> :sswitch_33
        -0x26ea2ddc -> :sswitch_32
        -0x21fb0dbc -> :sswitch_31
        -0x207016c7 -> :sswitch_30
        -0x1a0cf689 -> :sswitch_2f
        -0x181b2b46 -> :sswitch_2e
        -0x18198873 -> :sswitch_2d
        -0x17b47e0b -> :sswitch_2c
        -0x172cbb57 -> :sswitch_2b
        -0x160a4bb0 -> :sswitch_2a
        -0xcb8faf4 -> :sswitch_29
        -0xcb8979c -> :sswitch_28
        -0xabddb62 -> :sswitch_27
        -0x93741cc -> :sswitch_26
        -0x1bfab86 -> :sswitch_25
        0xc23 -> :sswitch_24
        0xd1b -> :sswitch_23
        0x2eefaa -> :sswitch_22
        0x23640cb -> :sswitch_21
        0x3c44b50 -> :sswitch_20
        0x6674f9b -> :sswitch_1f
        0xdba7381 -> :sswitch_1e
        0x10c32008 -> :sswitch_1d
        0x18f0294b -> :sswitch_1c
        0x2052155c -> :sswitch_1b
        0x20bbc660 -> :sswitch_1a
        0x239cb9fc -> :sswitch_19
        0x261865d5 -> :sswitch_18
        0x2cfeab54 -> :sswitch_17
        0x2f2793b0 -> :sswitch_16
        0x2ffcc875 -> :sswitch_15
        0x3c3c4a1c -> :sswitch_14
        0x419a9724 -> :sswitch_13
        0x440b789c -> :sswitch_12
        0x46b1262d -> :sswitch_11
        0x4db3b386 -> :sswitch_10
        0x4ec7dc6f -> :sswitch_f
        0x54c7ec75 -> :sswitch_e
        0x55aac6a3 -> :sswitch_d
        0x5ccce785 -> :sswitch_c
        0x5d4fd9dd -> :sswitch_b
        0x619b1543 -> :sswitch_a
        0x61b080e5 -> :sswitch_9
        0x6483313f -> :sswitch_8
        0x64a20a30 -> :sswitch_7
        0x6b3eec6e -> :sswitch_6
        0x6da6d810 -> :sswitch_5
        0x6fc8b8d3 -> :sswitch_4
        0x7b455927 -> :sswitch_3
        0x7b8dc4b3 -> :sswitch_2
        0x7bb5b70a -> :sswitch_1
        0x7e31ff4c -> :sswitch_0
    .end sparse-switch
.end method

.method public static zza(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string p0, "UNKNOWN"

    return-object p0

    :pswitch_0
    const-string p0, "REWARDED_INTERSTITIAL"

    return-object p0

    :pswitch_1
    const-string p0, "APP_OPEN_AD"

    return-object p0

    :pswitch_2
    const-string p0, "REWARDED"

    return-object p0

    :pswitch_3
    const-string p0, "NATIVE"

    return-object p0

    :pswitch_4
    const-string p0, "NATIVE_EXPRESS"

    return-object p0

    :pswitch_5
    const-string p0, "INTERSTITIAL"

    return-object p0

    :pswitch_6
    const-string p0, "BANNER"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static zzc(Ljava/lang/String;)I
    .locals 1

    const-string v0, "banner"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "interstitial"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-string v0, "native_express"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const-string v0, "native"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const-string v0, "rewarded"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p0, 0x5

    return p0

    :cond_4
    const-string v0, "app_open_ad"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p0, 0x6

    return p0

    :cond_5
    const-string v0, "rewarded_interstitial"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    const/4 p0, 0x7

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method private static zzd(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :cond_1
    :goto_0
    return p0
.end method

.method private static zze(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "landscape"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x6

    .line 10
    return p0

    .line 11
    :cond_0
    const-string v0, "portrait"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x7

    .line 20
    return p0

    .line 21
    :cond_1
    const/4 p0, -0x1

    .line 22
    return p0
.end method


# virtual methods
.method public final zzb()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfir;->zzai:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfir;->zzay:Lcom/google/android/gms/ads/internal/util/client/zzw;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
