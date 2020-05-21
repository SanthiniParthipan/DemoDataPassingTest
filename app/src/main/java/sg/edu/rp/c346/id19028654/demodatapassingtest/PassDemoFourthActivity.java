package sg.edu.rp.c346.id19028654.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PassDemoFourthActivity extends AppCompatActivity {

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_demo_fourth);

        tvResult=findViewById(R.id.textViewr4);
        Intent intendDReceived=getIntent();
        double doub=intendDReceived.getDoubleExtra("value", 0.0);
        tvResult.setText("Double value received is" + doub);

    }
}
