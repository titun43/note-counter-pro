package k;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class g0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        f0.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                cVar = new u1.f(clipData, 3);
            } else {
                f0.d dVar = new f0.d();
                dVar.h = clipData;
                dVar.f1342i = 3;
                cVar = dVar;
            }
            f0.r0.g(textView, cVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        f0.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new u1.f(clipData, 3);
        } else {
            f0.d dVar = new f0.d();
            dVar.h = clipData;
            dVar.f1342i = 3;
            cVar = dVar;
        }
        f0.r0.g(view, cVar.build());
        return true;
    }
}
