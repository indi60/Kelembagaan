package kelembagaan.pdpp.kemenag.gov.kelembagaan.ui.tentang;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import kelembagaan.pdpp.kemenag.gov.kelembagaan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TentangFragment extends Fragment {


    public TentangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tentang, container, false);

        ButterKnife.bind(this,view);
        return view;
    }

}
