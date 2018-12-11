package mihaiolaru.com.myfirstapplication.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import mihaiolaru.com.myfirstapplication.R;

public class Main2Activity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView = findViewById(R.id.textView6);

        Intent intent = getIntent();
        if (intent != null) {
            String text = intent.getStringExtra(second_activity.MESSAGE);
            int value = intent.getIntExtra(second_activity.COUNT, 0);
            if (text != null && !text.isEmpty()) {
                mTextView.setText(text + " " + value);
            }

        }
    }
}
