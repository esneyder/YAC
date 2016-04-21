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
import android.widget.Toast;

import com.gleamsoft.developer.yac.R;
import com.gleamsoft.developer.yac.model.Areas;
import com.gleamsoft.developer.yac.ui.activity.ThemesActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreasFragment extends Fragment {
private ListView mAreas;
private List<String> mLIstaAreas;
AdaptadorArea adaptadorArea;

public AreasFragment() {
    // Required empty public constructor
}


@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         final Bundle savedInstanceState) {
    View viewFragmento = inflater.inflate(R.layout.fragment_areas, container, false);
    mAreas = (ListView) viewFragmento.findViewById(R.id.list_areas);
    mLIstaAreas = new ArrayList<>();
    adaptadorArea = new AdaptadorArea();
    mLIstaAreas.add("Sistemas");
    mLIstaAreas.add("Contabilidad");
    mLIstaAreas.add("Economía");
    mLIstaAreas.add("Derecho");
    mLIstaAreas.add("Educación");
    mLIstaAreas.add("Matemáticas");
    mLIstaAreas.add("Química");
    mLIstaAreas.add("Lenguas Extranjeras");
    mLIstaAreas.add("Musica");
    mAreas.setAdapter(adaptadorArea);
    adaptadorArea.notifyDataSetChanged();

    mAreas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
          String list=mLIstaAreas.get(i);
         Intent intent=new Intent(getActivity(),ThemesActivity.class);
            intent.putExtra("area",list);
            startActivity(intent);


        }
    });
    return viewFragmento;
}

private class AdaptadorArea extends BaseAdapter {

    @Override
    public int getCount() {
        return mLIstaAreas.size();
    }

    @Override
    public Object getItem(int position) {
        return mLIstaAreas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View filaView = getActivity().getLayoutInflater().inflate(R.layout.item_areas, null);
        String list=mLIstaAreas.get(position);
        TextView txtNombreMiSitio = (TextView) filaView.findViewById(R.id.text_area);

        txtNombreMiSitio.setText(list);
        return filaView;
    }

}


}
