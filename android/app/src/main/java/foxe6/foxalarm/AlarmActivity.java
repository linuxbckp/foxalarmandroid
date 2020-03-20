package foxe6.foxalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class AlarmActivity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        Intent intent = getIntent();
        int text = intent.getIntExtra("setHour",0);
        Log.d(TAG,"get " + text);
        String sText = text + ":00";
        if(text < 10){
            sText = "0" + text + ":00";
        }
        TextView tv = (TextView)findViewById(R.id.time);
        tv.setText(sText);
        Button bt = (Button)findViewById(R.id.cancel);
        bt.setClickable(false);
        if(text == 0)  mediaPlayer = mediaPlayer.create(this, R.raw.m0);
        if(text == 1)  mediaPlayer = mediaPlayer.create(this, R.raw.m1);
        if(text == 2)  mediaPlayer = mediaPlayer.create(this, R.raw.m2);
        if(text == 3)  mediaPlayer = mediaPlayer.create(this, R.raw.m3);
        if(text == 4)  mediaPlayer = mediaPlayer.create(this, R.raw.m4);
        if(text == 5)  mediaPlayer = mediaPlayer.create(this, R.raw.m5);
        if(text == 6)  mediaPlayer = mediaPlayer.create(this, R.raw.m6);
        if(text == 7)  mediaPlayer = mediaPlayer.create(this, R.raw.m7);
        if(text == 8)  mediaPlayer = mediaPlayer.create(this, R.raw.m8);
        if(text == 9)  mediaPlayer = mediaPlayer.create(this, R.raw.m9);
        if(text == 10)  mediaPlayer = mediaPlayer.create(this, R.raw.m10);
        if(text == 11)  mediaPlayer = mediaPlayer.create(this, R.raw.m11);
        if(text == 12)  mediaPlayer = mediaPlayer.create(this, R.raw.m12);
        if(text == 13)  mediaPlayer = mediaPlayer.create(this, R.raw.m13);
        if(text == 14)  mediaPlayer = mediaPlayer.create(this, R.raw.m14);
        if(text == 15)  mediaPlayer = mediaPlayer.create(this, R.raw.m15);
        if(text == 16)  mediaPlayer = mediaPlayer.create(this, R.raw.m16);
        if(text == 17)  mediaPlayer = mediaPlayer.create(this, R.raw.m17);
        if(text == 18)  mediaPlayer = mediaPlayer.create(this, R.raw.m18);
        if(text == 19)  mediaPlayer = mediaPlayer.create(this, R.raw.m19);
        if(text == 20)  mediaPlayer = mediaPlayer.create(this, R.raw.m20);
        if(text == 21)  mediaPlayer = mediaPlayer.create(this, R.raw.m21);
        if(text == 22)  mediaPlayer = mediaPlayer.create(this, R.raw.m22);
        if(text == 23)  mediaPlayer = mediaPlayer.create(this, R.raw.m23);
        mediaPlayer.start();
        try {
            wait(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bt.setClickable(true);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
