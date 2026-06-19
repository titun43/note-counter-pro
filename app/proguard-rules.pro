# Note Counter Pro - ProGuard Rules (Recovered)
-keepattributes *Annotation*
-keepattributes SourceFile,LineNumberTable
-keep public class * extends java.lang.Exception
-keep class com.getcapacitor.** { *; }
-keep class com.lokhnathtechnical.notecounterpro.plugins.** { *; }
-keepclassmembers class com.lokhnathtechnical.notecounterpro.plugins.** {
    @com.getcapacitor.annotation.CapacitorPlugin <fields>;
    @com.getcapacitor.annotation.PluginMethod <methods>;
}
