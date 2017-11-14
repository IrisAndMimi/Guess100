package guess100.iris.com.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static guess100.iris.com.guess100.R.id.secret;

public class MainActivity extends AppCompatActivity {
    int SecNum = new Random().nextInt(100)+1;
    String SecN = String.valueOf(SecNum);
    TextView Sec = (TextView) findViewById(secret);
    secret.setText(Sec.getString(SecN));

    View.OnClickListener findViews= new View.OnClickListener() {
        public void onClick(View view) {
            EditText UsrG = (EditText) findViewById(R.id.number);
            TextView Tit = (TextView) findViewById(R.id.info);
            TextView Sec = (TextView) findViewById(secret);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Send = (Button) findViewById(R.id.send);
        Send.setOnClickListener(findViews);
    }

    public void guess100(View view){
        int SecNum = new Random().nextInt(100)+1;
        String SecN = String.valueOf(SecNum);
        TextView Sec = (TextView) findViewById(secret);
        secret.setText(Sec.getString(SecN));
        

    }

}
