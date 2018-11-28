package mihaiolaru.com.myfirstapplication.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mihaiolaru.com.myfirstapplication.R;

public class RecycleViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewContacts;
    private List<Contact> mContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        // get recycler view from xml layout
        mRecyclerViewContacts = findViewById(R.id.recyclerview_content);

        // define and set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewContacts.setLayoutManager(layoutManager);

        //get data source
        mContacts = getContacts();

        //get the adapter instance
        ContactsAdaptor contactsAdaptor = new ContactsAdaptor(mContacts);

        //set the adaptor to the recycle view
        mRecyclerViewContacts.setAdapter(contactsAdaptor);
    }

    private List<Contact> getContacts () {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ion", "Ionescu"));
        contacts.add(new Contact("Saman", "Maricel"));
        contacts.add(new Contact("Tiberiu", "Fergus"));
        contacts.add(new Contact("Geanina", "Maria"));
        contacts.add(new Contact("Lautaru", "Boschetaru"));
        contacts.add(new Contact("Auguzu", "Mircea"));

        return contacts;
    }

}
