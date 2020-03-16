package foxe6.foxalarm;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

    int realHour;
    int realMinute;
    int setTime=0;
    int[] d0 = new int[24];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //控件初始化
        CheckBox c0 = (CheckBox)findViewById(R.id.c0);
        CheckBox c1 = (CheckBox)findViewById(R.id.c1);
        CheckBox c2 = (CheckBox)findViewById(R.id.c2);
        CheckBox c3 = (CheckBox)findViewById(R.id.c3);
        CheckBox c4 = (CheckBox)findViewById(R.id.c4);
        CheckBox c5 = (CheckBox)findViewById(R.id.c5);
        CheckBox c6 = (CheckBox)findViewById(R.id.c6);
        CheckBox c7 = (CheckBox)findViewById(R.id.c7);
        CheckBox c8 = (CheckBox)findViewById(R.id.c8);
        CheckBox c9 = (CheckBox)findViewById(R.id.c9);
        CheckBox c10 = (CheckBox)findViewById(R.id.c10);
        CheckBox c11 = (CheckBox)findViewById(R.id.c11);
        CheckBox c12 = (CheckBox)findViewById(R.id.c12);
        CheckBox c13 = (CheckBox)findViewById(R.id.c13);
        CheckBox c14 = (CheckBox)findViewById(R.id.c14);
        CheckBox c15 = (CheckBox)findViewById(R.id.c15);
        CheckBox c16 = (CheckBox)findViewById(R.id.c16);
        CheckBox c17 = (CheckBox)findViewById(R.id.c17);
        CheckBox c18 = (CheckBox)findViewById(R.id.c18);
        CheckBox c19 = (CheckBox)findViewById(R.id.c19);
        CheckBox c20 = (CheckBox)findViewById(R.id.c20);
        CheckBox c21 = (CheckBox)findViewById(R.id.c21);
        CheckBox c22 = (CheckBox)findViewById(R.id.c22);
        CheckBox c23 = (CheckBox)findViewById(R.id.c23);
        Button choose = (Button)findViewById(R.id.choose);
        Button cancel = (Button)findViewById(R.id.cancel);
        //设置复选框的Listener
        c0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[0]=1;
                }
                else d0[0]=0;
            }
        });
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[1]=1;
                }
                else d0[1]=0;
            }
        });

    }

    void setAlarm(int setHour){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        realHour = calendar.get(Calendar.HOUR_OF_DAY);
        realMinute = calendar.get(Calendar.MINUTE);
        setTime=((setHour-realHour)*60-realMinute)*60;
        calendar.add(Calendar.SECOND,setTime);
        AlarmManager mn = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        mn.setExact(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),null);
    }
}
