package com.example.termi.jacksonvilletourapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<ListItem> {
    /**
     * Create a new {@link ListAdapter} object.
     *  @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param listItems   is the list of  to be displayed.
     */
    public ListAdapter(Context context, ArrayList<ListItem> listItems) {
        super(context, 0,listItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        ListItem currentPosition = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView titleTextView = listItemView.findViewById(R.id.listTitle);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        titleTextView.setText(currentPosition.getListTitle());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView locationTextView = listItemView.findViewById(R.id.location);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        locationTextView.setText(currentPosition.getListLocation());


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
