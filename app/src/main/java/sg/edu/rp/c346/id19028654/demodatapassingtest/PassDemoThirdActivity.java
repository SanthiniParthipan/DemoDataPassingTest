package sg.edu.rp.c346.id19028654.demodatapassingtest;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.TextView;

public class PassDemoThirdActivity extends AppCompatActivity {

    TextView tvAnswer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_demo_third);
        tvAnswer3=findViewById(R.id.textView3);
        Intent intentCReceived =getIntent();
        int val=intentCReceived.getIntExtra("value",'0');
        tvAnswer3.setText("Character value received is : "+val);
    }
}
