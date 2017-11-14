package guess100.iris.com.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int SecNum = new Random().nextInt(100)+1;
    View.OnClickListener findViews= new View.OnClickListener() {
        public void onClick(View view) {
            EditText UsrG = (EditText) findViewById(R.id.number);
            TextView Tit = (TextView) findViewById(R.id.info);
            TextView Sec = (TextView) findViewById(R.id.secret);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Send = (Button) findViewById(R.id.send);
        Send.setOnClickListener(findViews);
    }

//    public void findViews(View view){
//        EditText UsrG = (EditText)findViewById(R.id.number);
//        TextView Tit = (TextView)findViewById(R.id.info);
//        TextView Sec = (TextView)findViewById(R.id.secret);

    }

}
