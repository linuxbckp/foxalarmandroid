package foxe6.foxalarm;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    int realHour;
    int realMinute;
    int setTime=0;
    int[] d0 = new int[24];
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;

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
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[2]=1;
                }
                else d0[2]=0;
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[3]=1;
                }
                else d0[3]=0;
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[4]=1;
                }
                else d0[4]=0;
            }
        });
        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[5]=1;
                }
                else d0[5]=0;
            }
        });
        c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[6]=1;
                }
                else d0[6]=0;
            }
        });
        c7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[7]=1;
                }
                else d0[7]=0;
            }
        });
        c8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[8]=1;
                }
                else d0[8]=0;
            }
        });
        c9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[9]=1;
                }
                else d0[9]=0;
            }
        });
        c10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[10]=1;
                }
                else d0[10]=0;
            }
        });
        c11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[11]=1;
                }
                else d0[11]=0;
            }
        });
        c12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[12]=1;
                }
                else d0[12]=0;
            }
        });
        c13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[13]=1;
                }
                else d0[13]=0;
            }
        });
        c14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[14]=1;
                }
                else d0[14]=0;
            }
        });
        c15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[15]=1;
                }
                else d0[15]=0;
            }
        });
        c16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[16]=1;
                }
                else d0[16]=0;
            }
        });
        c17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[17]=1;
                }
                else d0[17]=0;
            }
        });
        c18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[18]=1;
                }
                else d0[18]=0;
            }
        });
        c19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[19]=1;
                }
                else d0[19]=0;
            }
        });
        c20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[20]=1;
                }
                else d0[20]=0;
            }
        });
        c21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[21]=1;
                }
                else d0[21]=0;
            }
        });
        c22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[22]=1;
                }
                else d0[22]=0;
            }
        });
        c23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    d0[23]=1;
                }
                else d0[23]=0;
            }
        });
        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(context,"请稍等",Toast.LENGTH_LONG);
                t.show();
                for(int i = 0;i<24;i++){
                    if(d0[i]==1){
                        setAlarm(i);
                    }
                }

                Toast t2 = Toast.makeText(context,"设置完成",Toast.LENGTH_LONG);
                t2.show();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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
