package com.lokhnathtechnical.notecounterpro;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;
import com.lokhnathtechnical.notecounterpro.plugins.ContactPickerPlugin;
import com.lokhnathtechnical.notecounterpro.plugins.PremiumPlugin;

/* loaded from: classes.dex */
public class MainActivity extends BridgeActivity {
    @Override // com.getcapacitor.BridgeActivity, androidx.fragment.app.e0, androidx.activity.s, u.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        registerPlugin(PremiumPlugin.class);
        registerPlugin(ContactPickerPlugin.class);
        super.onCreate(bundle);
    }
}
