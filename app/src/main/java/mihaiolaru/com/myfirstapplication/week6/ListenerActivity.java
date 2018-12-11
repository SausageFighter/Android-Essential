package mihaiolaru.com.myfirstapplication.week6;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import mihaiolaru.com.myfirstapplication.R;

public class ListenerActivity extends AppCompatActivity implements MyListener {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);

        initView();
        initFragment();
    }

    public void initView() {
        mTextView = findViewById(R.id.textView7);
    }

    private void initFragment () {
        SumFragment sumFragment = new SumFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTrasaction = fragmentManager.beginTransaction();
        fragmentTrasaction.replace(R.id.containerListener, sumFragment);
        fragmentTrasaction.commit();


    }

    @Override
    public void addTwoNumbers(int a, int b) {
        mTextView.setText("Sum is: " + (a + b));
    }
}
