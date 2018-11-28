package mihaiolaru.com.myfirstapplication.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import mihaiolaru.com.myfirstapplication.R;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

    public TextView mTextViewFirstName;
    public TextView mTextViewLastName;

    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);

        mTextViewFirstName = itemView.findViewById(R.id.textview_firstname);
        mTextViewLastName = itemView.findViewById(R.id.textview_lasnamename);
    }
}
