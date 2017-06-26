package kelembagaan.pdpp.kemenag.gov.kelembagaan.ui.bookmark;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import kelembagaan.pdpp.kemenag.gov.kelembagaan.R;
import kelembagaan.pdpp.kemenag.gov.kelembagaan.data.model.Lembaga;

/**
 * Created by Amiral on 6/12/17.
 */

public class MadrasahBookmarkAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private List<Lembaga> mDataSource;

    public MadrasahBookmarkAdapter(Context mContext, List<Lembaga> mDataSource) {
        this.mContext = mContext;
        this.mDataSource = mDataSource;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Lembaga getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = mInflater.inflate(R.layout.item_bookmark_madrasah, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

//        Lembaga madrasah = mDataSource.get(position);
//        holder.nama.setText(madrasah.getNamaLembaga());
//        holder.nomor.setText(""+madrasah.getNsm());
//
//        Kabupaten k = new KabupatenDbHelper(mContext).getKabupaten(madrasah.getKabupatenId());
//        Provinsi p = new ProvinsiDbHelper(mContext).getProvinsi(k.getProvinsiIdProvinsi());
//
//        String lks = k.getNamaKabupaten() + "," + p.getNamaProvinsi();
//        holder.lokasi.setText(lks);
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.text_nama_madrasah_bookmark)
        TextView nama;
        @BindView(R.id.text_nsm_madrasah_bookmark) TextView nomor;

        @BindView(R.id.text_lokasi_madrasah)
        TextView lokasi;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}