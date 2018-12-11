package mihaiolaru.com.myfirstapplication.week6;

import android.content.Intent;
import android.support.v4.app.FragmentContainer;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

import mihaiolaru.com.myfirstapplication.R;

public class DynamicActivity extends AppCompatActivity {

    public static final String NUMBER = "number";
    private EditText mEditTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);

//        initFragment();
        initView();
    }


    private void initFragment (BlankFragment blankFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTrasaction = fragmentManager.beginTransaction();
        fragmentTrasaction.replace(R.id.container, blankFragment);
        fragmentTrasaction.commit();
    }

    private void initView() {
        mEditTextNumber = findViewById(R.id.edittextnumber);
    }

    public void btnCheckOnClick(View view) {
        if (mEditTextNumber != null) {
            String numberString = mEditTextNumber.getText().toString();
            if (numberString != null && !numberString.isEmpty()) {
                int number = Integer.parseInt(numberString);
                Bundle bundle =  new Bundle();
                bundle.putInt(NUMBER, number);

                BlankFragment blankFragment = new BlankFragment();
                blankFragment.setArguments(bundle);
                initFragment(blankFragment);
            }
        }

    }
}
