package n0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f2643a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.i f2644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        t2.i iVar = new t2.i(21);
        this.f2643a = editText;
        this.f2644b = iVar;
        if (l.f262k != null) {
            l a5 = l.a();
            if (a5.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.g gVar = a5.f267e;
            gVar.getClass();
            Bundle bundle = editorInfo.extras;
            m0.b bVar = (m0.b) ((r1.h) gVar.f258c).f3161g;
            int a6 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a6 != 0 ? ((ByteBuffer) bVar.f1377d).getInt(a6 + bVar.f1374a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i5, int i6) {
        Editable editableText = this.f2643a.getEditableText();
        this.f2644b.getClass();
        return t2.i.t(this, editableText, i5, i6, false) || super.deleteSurroundingText(i5, i6);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        Editable editableText = this.f2643a.getEditableText();
        this.f2644b.getClass();
        return t2.i.t(this, editableText, i5, i6, true) || super.deleteSurroundingTextInCodePoints(i5, i6);
    }
}
