package sg.edu.rp.c346.id19028654.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PassDemoSecondActivity extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_demo_second);

        tvAnswer=findViewById(R.id.textView);
        Intent intentReceived =getIntent();
        int value =intentReceived.getIntExtra("value",0);
        tvAnswer.setText("Integer value received is: "+value);

    }
}
