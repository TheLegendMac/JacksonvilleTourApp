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
public class EatingFragment extends Fragment {


    public EatingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jax_list, container, false);


        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(getString(R.string.eating_title_one), getString(R.string.eating_location_one)));
        listItems.add(new ListItem(getString(R.string.eating_title_two), getString(R.string.eating_location_two)));
        listItems.add(new ListItem(getString(R.string.eating_title_three), getString(R.string.eating_location_three)));
        listItems.add(new ListItem(getString(R.string.eating_title_four), getString(R.string.eating_location_four)));

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
