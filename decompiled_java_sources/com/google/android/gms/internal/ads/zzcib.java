package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class zzcib extends SSLSocketFactory {
    final SSLSocketFactory zza;
    final /* synthetic */ zzcic zzb;

    public zzcib(zzcic zzcicVar) {
        Objects.requireNonNull(zzcicVar);
        this.zzb = zzcicVar;
        this.zza = (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    private final Socket zza(Socket socket) {
        zzcic zzcicVar = this.zzb;
        if (zzcicVar.zzm() > 0) {
            socket.setReceiveBufferSize(zzcicVar.zzm());
        }
        zzcicVar.zzl(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i5) {
        Socket createSocket = this.zza.createSocket(str, i5);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i5, InetAddress inetAddress, int i6) {
        Socket createSocket = this.zza.createSocket(str, i5, inetAddress, i6);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i5) {
        Socket createSocket = this.zza.createSocket(inetAddress, i5);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i5, InetAddress inetAddress2, int i6) {
        Socket createSocket = this.zza.createSocket(inetAddress, i5, inetAddress2, i6);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i5, boolean z4) {
        Socket createSocket = this.zza.createSocket(socket, str, i5, z4);
        zza(createSocket);
        return createSocket;
    }
}
