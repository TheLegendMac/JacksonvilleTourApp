package com.example.termi.jacksonvilletourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {


    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jax_list, container, false);


        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(getString(R.string.fun_event_one), getString(R.string.fun_location_one),R.drawable.musical));
        listItems.add(new ListItem(getString(R.string.fun_event_two), getString(R.string.fun_location_two),R.drawable.festival));
        listItems.add(new ListItem(getString(R.string.fun_event_three), getString(R.string.fun_location_three),R.drawable.fest));
        listItems.add(new ListItem(getString(R.string.fun_event_four), getString(R.string.fun_location_four),R.drawable.singalong));

        ListAdapter adapter = new ListAdapter(getActivity(), listItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootView;
    }
}
