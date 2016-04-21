package com.gleamsoft.developer.yac.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.gleamsoft.developer.yac.R;
import com.gleamsoft.developer.yac.ui.activity.ThemesActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThemeFragment extends Fragment {
private ListView mTheme;
private List<String> mLIstaThemes;
AdaptadorTheme adaptadorTheme;

public ThemeFragment() {
    // Required empty public constructor
}


@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
    // Inflate the layout for this fragment

    View viewFragmento = inflater.inflate(R.layout.fragment_theme, container, false);
    mTheme = (ListView) viewFragmento.findViewById(R.id.list_theme);
    mLIstaThemes = new ArrayList<>();
    adaptadorTheme = new AdaptadorTheme();
    mLIstaThemes.add("Bases de datos");
    mLIstaThemes.add("Seguridad Informática");
    mLIstaThemes.add("Microsoft C#");
    mLIstaThemes.add("Web Api.Net");
    mLIstaThemes.add("AngularJs");
    mLIstaThemes.add("HHML5");
    mLIstaThemes.add("CSS3");
    mLIstaThemes.add("JavaScript");
    mLIstaThemes.add("Jquery");
    mTheme.setAdapter(adaptadorTheme);
    adaptadorTheme.notifyDataSetChanged();

    mTheme.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {



        }
    });
    return viewFragmento;
}

private class AdaptadorTheme extends BaseAdapter {

    @Override
    public int getCount() {
        return mLIstaThemes.size();
    }

    @Override
    public Object getItem(int position) {
        return mLIstaThemes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View filaView = getActivity().getLayoutInflater().inflate(R.layout.item_areas, null);
        String list= mLIstaThemes.get(position);
        TextView txtNombreMiSitio = (TextView) filaView.findViewById(R.id.text_area);
        txtNombreMiSitio.setText(list);
        return filaView;
    }

}


}
