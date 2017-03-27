package br.edu.iff.pooa20162.cinefilter.Model;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/**
 * Created by bia on 25/03/17.
 */

public class Cinema extends SugarRecord implements Parcelable {
    private Long id;
    private String nomeC;
    private String ruaC;
    private String numeroC;
    private String bairroC;
    private String cepC;
    private String cidadeC;
    private String estadoC;
    private String telefoneC;

    public Cinema(String nomeC, String ruaC, String numeroC, String bairroC, String cepC, String cidadeC, String estadoC, String telefoneC){
        this.nomeC = nomeC;
        this.ruaC = ruaC;
        this.numeroC = numeroC;
        this.bairroC = bairroC;
        this.cepC = cepC;
        this.cidadeC = cidadeC;
        this.estadoC = estadoC;
        this.telefoneC = telefoneC;
    }

    List<Sessao> getSessao() {
        return Sessao.find(Sessao.class, "cinema = ?", new String(getId().toString()));
    }

    public Cinema(){

    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public String getRuaC() {
        return ruaC;
    }

    public void setRuaC(String ruaC) {
        this.ruaC = ruaC;
    }

    public String getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }

    public String getBairroC() {
        return bairroC;
    }

    public void setBairroC(String bairroC) {
        this.bairroC = bairroC;
    }

    public String getCepC() {
        return cepC;
    }

    public void setCepC(String cepC) {
        this.cepC = cepC;
    }

    public String getCidadeC() {
        return cidadeC;
    }

    public void setCidadeC(String cidadeC) {
        this.cidadeC = cidadeC;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }

    public String getTelefoneC() {
        return telefoneC;
    }

    public void setTelefoneC(String telefoneC) {
        this.telefoneC = telefoneC;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nomeC);
        dest.writeLong(id);

    }

    public Long getId() {
        return id;
    }

    private Cinema(Parcel from){

        id = from.readLong();
        nomeC = from.readString();
    }

    public static final Parcelable.Creator<Cinema>
            CREATOR = new Parcelable.Creator<Cinema>() {

        public Cinema createFromParcel(Parcel in) {
            return new Cinema(in);
        }

        public Cinema[] newArray(int size) {
            return new Cinema[size];
        }
    };

    @Override
    public String toString()
    {
        return nomeC;
    }

}
