package android.lifeistech.com.checkwork66;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by matsumotokomei on 2018/06/13.
 */

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        findViewById(R.id.traShunpe).setTransitionName("traShunpe");
    }
}
