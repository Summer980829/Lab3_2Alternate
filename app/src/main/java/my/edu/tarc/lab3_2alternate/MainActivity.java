package my.edu.tarc.lab3_2alternate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg;
    //private ImageView imageViewFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMsg = findViewById(R.id.textViewMessage);
    }

    public void showMessage(View view){
        textViewMsg.setText(R.string.message);
    }
}
