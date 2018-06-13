package android.lifeistech.com.checkwork66;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mentor shunpe = new Mentor(R.drawable.shunpe, "しゅんぺー", 50000);
        Mentor gahaku = new Mentor(R.drawable.ic_launcher, "がはく", 200);
        Mentor junjun = new Mentor(R.drawable.ic_launcher_background, "じゅんじゅん", 30);

        ImageView shunpeImageView = (ImageView)findViewById(R.id.imageView1);
        ImageView gahakuImageView = (ImageView)findViewById(R.id.imageView2);
        ImageView junjunImageView = (ImageView)findViewById(R.id.imageView3);
        shunpeImageView.setOnClickListener(this);
        gahakuImageView.setOnClickListener(this);
        junjunImageView.setOnClickListener(this);

        TextView shunpeNameText = (TextView)findViewById(R.id.nameText1);
        TextView gahakuNameText = (TextView)findViewById(R.id.nameText2);
        TextView junjunNameText = (TextView)findViewById(R.id.nameText3);

        TextView shunpeAttackText = (TextView)findViewById(R.id.attackText1);
        TextView gahakuAttackText = (TextView)findViewById(R.id.attackText2);
        TextView junjunAttackText = (TextView)findViewById(R.id.attackText3);

        shunpeImageView.setImageResource(shunpe.getResId());
        gahakuImageView.setImageResource(shunpe.getResId());
        junjunImageView.setImageResource(shunpe.getResId());

        shunpeNameText.setText(shunpe.getName());
        gahakuNameText.setText(gahaku.getName());
        junjunNameText.setText(junjun.getName());

        shunpeAttackText.setText("アタック力：" + shunpe.getAttack());
        gahakuAttackText.setText("アタック力：" + gahaku.getAttack());
        junjunAttackText.setText("アタック力：" + junjun.getAttack());

//        final Context context = getApplicationContext();

//        shunpeImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "え？", Toast.LENGTH_LONG).show();
//            }
//        });
//        gahakuImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "誰？", Toast.LENGTH_LONG).show();
//            }
//        });
//        junjunImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "あんま話したことない？", Toast.LENGTH_LONG).show();
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView1:
                Toast.makeText(this, "え？", Toast.LENGTH_LONG).show();
//                Bundle bundle = new Bundle();

                gotoSub();

                break;
            case R.id.imageView2:
                Toast.makeText(this, "誰？", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageView3:
                Toast.makeText(this, "あんま話したことない？", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }

    private void gotoSub() {
        ImageView shunpeImageView = (ImageView)findViewById(R.id.imageView1);
        shunpeImageView.setTransitionName("traShunpe");

        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation
                (this, shunpeImageView, shunpeImageView.getTransitionName()).toBundle());

    }
}
