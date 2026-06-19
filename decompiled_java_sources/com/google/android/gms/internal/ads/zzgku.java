package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Base64;
import java.util.Optional;

/* loaded from: classes.dex */
final class zzgku {
    private Optional zza;
    private Optional zzb;

    public final boolean zza(zzbcf zzbcfVar) {
        Base64.Decoder decoder;
        byte[] decode;
        Base64.Decoder decoder2;
        byte[] decode2;
        byte[] zzy = zzbcfVar.zza().zzb().zzb().zzy();
        byte[] zzy2 = zzbcfVar.zza().zzd().zzy();
        try {
            try {
                if (this.zza == null && this.zzb == null) {
                    try {
                        zzhut.zza();
                        decoder = Base64.getDecoder();
                        decode = decoder.decode("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=");
                        this.zza = Optional.of((zzhbs) zzhbu.zza(new String(decode)).zzg(zzhlf.zzc(), zzhbs.class));
                        decoder2 = Base64.getDecoder();
                        decode2 = decoder2.decode("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=");
                        this.zzb = Optional.of((zzhbs) zzhbu.zza(new String(decode2)).zzg(zzhlf.zzc(), zzhbs.class));
                    } catch (Exception e4) {
                        throw new GeneralSecurityException("Failed to verify program", e4);
                    }
                }
                this.zza.isPresent();
                ((zzhbs) this.zza.get()).zza(zzy, zzy2);
                return true;
            } catch (GeneralSecurityException unused) {
                this.zzb.isPresent();
                ((zzhbs) this.zzb.get()).zza(zzy, zzy2);
                return true;
            }
        } catch (GeneralSecurityException unused2) {
            return false;
        }
    }
}
