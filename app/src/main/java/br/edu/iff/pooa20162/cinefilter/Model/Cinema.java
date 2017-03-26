package br.edu.iff.pooa20162.cinefilter.Model;

import com.orm.SugarRecord;

/**
 * Created by bia on 25/03/17.
 */

public class Cinema extends SugarRecord {
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
}
