package sg.edu.rp.c346.id19028654.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassInteger;
    Button btnPassCharacter;
    TextView btnPassDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPassInteger=findViewById(R.id.buttonPassInteger);
        btnPassCharacter=findViewById(R.id.buttonpassChar);
        btnPassDouble= findViewById(R.id.textViewr4);
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,PassDemoSecondActivity.class);
                intent.putExtra("value",1 );
                startActivity(intent);
            }
        });
        btnPassCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chair=new Intent(MainActivity.this,PassDemoThirdActivity.class);
                chair.putExtra("value " ,"a");
                startActivity(chair);
            }
        });

    }
}
