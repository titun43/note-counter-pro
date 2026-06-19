package org.apache.cordova;

import android.webkit.ClientCertRequest;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
public class CordovaClientCertRequest implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClientCertRequest f2859a;

    public CordovaClientCertRequest(ClientCertRequest clientCertRequest) {
        this.f2859a = clientCertRequest;
    }

    public void cancel() {
        this.f2859a.cancel();
    }

    public String getHost() {
        return this.f2859a.getHost();
    }

    public String[] getKeyTypes() {
        return this.f2859a.getKeyTypes();
    }

    public int getPort() {
        return this.f2859a.getPort();
    }

    public Principal[] getPrincipals() {
        return this.f2859a.getPrincipals();
    }

    public void ignore() {
        this.f2859a.ignore();
    }

    public void proceed(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        this.f2859a.proceed(privateKey, x509CertificateArr);
    }
}
