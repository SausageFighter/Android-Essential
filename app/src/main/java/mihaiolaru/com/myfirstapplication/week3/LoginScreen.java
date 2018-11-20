package mihaiolaru.com.myfirstapplication.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.net.Authenticator;

import mihaiolaru.com.myfirstapplication.R;
import mihaiolaru.com.myfirstapplication.week3.models.Authentication;

public class LoginScreen extends AppCompatActivity {

    private EditText mEditTextEmail;
    private EditText mEditTextPhone;
    private CheckBox mCheckBoxAccept;
    private TextView mTextViewResult;

    private Authentication mAuthentication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        mAuthentication = new Authentication();
    }

    private void initView() {
        mEditTextEmail = (EditText) findViewById(R.id.edittext_email);
        mEditTextPhone = (EditText) findViewById(R.id.edittext_phone);
        mCheckBoxAccept = (CheckBox) findViewById(R.id.checkbox_accept);
        mTextViewResult = (TextView) findViewById(R.id.textview_result);
    }

    private boolean isEmailValid() {
        String email = mEditTextEmail.getText().toString();

        return false ;
    }

    public void btnSubmitOnClick(View view) {
//        if (isEmailValid() && isPhoneValid() && isAccept()) {
//
//        }
    }
}
