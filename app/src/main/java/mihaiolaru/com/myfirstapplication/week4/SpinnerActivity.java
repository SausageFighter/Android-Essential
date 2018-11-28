package mihaiolaru.com.myfirstapplication.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import mihaiolaru.com.myfirstapplication.R;

public class SpinnerActivity extends AppCompatActivity {

    private List<String> mFruits;
    private Spinner mSpinnerFruits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Toast.makeText(this, "Hello from a Toast", Toast.LENGTH_SHORT).show();

        // get data source
        mFruits = getFruits();

        // get the spinner from the xml file
        mSpinnerFruits = findViewById(R.id.spinner_fruits);

        // set the adapter on the Spinner
        mSpinnerFruits.setAdapter(getAdapter());

    }

    private List<String> getFruits() {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Strawberries");
        fruits.add("Pineapple");
        fruits.add("Lemon");
        fruits.add("Apple");

        return fruits;
    }

    private ArrayAdapter<String> getAdapter() {
        return new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, mFruits);
    }

}
