package li.xiangyang.android.examples;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.google.zxing.client.android.Intents;

import li.xiangyang.android.simplified_zxing.ScanActivity;

public class MainActivity extends ScanActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Intent in = getIntent();
        in.putExtra(Intents.Scan.MODE, Intents.Scan.QR_CODE_MODE);
        in.putExtra("portrait_mode", true);
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//全屏


        findViewFinderView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restartPreviewAfterDelay(100);
            }
        });

    }
}
