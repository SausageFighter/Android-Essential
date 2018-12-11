package mihaiolaru.com.myfirstapplication.week5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import mihaiolaru.com.myfirstapplication.MainActivity;
import mihaiolaru.com.myfirstapplication.R;

public class second_activity extends AppCompatActivity {

    private static final String TAG = "RAHAT";
            //PicasoActivity.class.getSimpleName();
    public static final String MESSAGE = "message";
    public static final String COUNT = "count";
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        mEditText = findViewById(R.id.editText);

        Log.e(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    public void btnGoToOnClick(View view) {
        if (mEditText != null) {
            String text = mEditText.getText().toString();
            Intent intent = new Intent( this  , Main2Activity.class);
            intent.putExtra(MESSAGE, text);
            intent.putExtra(COUNT, 8);
            startActivity(intent);
        }
    }

    public void btnCallOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ocw.cs.pub.ro/courses/rl/teme/tema2"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
