package kelembagaan.pdpp.kemenag.gov.kelembagaan.data.server.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import kelembagaan.pdpp.kemenag.gov.kelembagaan.data.model.StatistikLembaga;

/**
 * Created by Amiral on 7/17/17.
 */

public class GetResponseStatistikLembaga {
    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("pesan")
    @Expose
    private String pesan;
    @SerializedName("tanggal")
    @Expose
    private Tanggal tanggal;
    @SerializedName("data")
    @Expose
    private List<StatistikLembaga> data = null;

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public Tanggal getTanggal() {
        return tanggal;
    }

    public void setTanggal(Tanggal tanggal) {
        this.tanggal = tanggal;
    }

    public List<StatistikLembaga> getData() {
        return data;
    }

    public void setData(List<StatistikLembaga> data) {
        this.data = data;
    }
}
