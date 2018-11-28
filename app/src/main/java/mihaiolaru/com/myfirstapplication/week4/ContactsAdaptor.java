package mihaiolaru.com.myfirstapplication.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import mihaiolaru.com.myfirstapplication.R;

public class ContactsAdaptor extends RecyclerView.Adapter<ContactsViewHolder> {

    private List<Contact> mContacts;

    public ContactsAdaptor(List<Contact> mContacts) {
        this.mContacts = mContacts;
    }

    @NonNull

    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_item, viewGroup, false);

        return new ContactsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
        Contact currentContact = mContacts.get(i);
        contactsViewHolder.mTextViewFirstName.setText(currentContact.getFirstName());
        contactsViewHolder.mTextViewLastName.setText(currentContact.getLastName());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
