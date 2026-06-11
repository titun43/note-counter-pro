package k0;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface i {
    Object getDefaultValue();

    Object readFrom(InputStream inputStream, w3.c cVar);

    Object writeTo(Object obj, OutputStream outputStream, w3.c cVar);
}
