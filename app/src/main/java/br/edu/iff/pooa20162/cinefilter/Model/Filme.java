package br.edu.iff.pooa20162.cinefilter.Model;

import com.orm.SugarRecord;

/**
 * Created by bia on 26/03/17.
 */

public class Filme extends SugarRecord {

    private String nomeF;
    private String diretorF;
    private String anoF;
    private String dataLF;
    private String classificacaoF;
    private String generoF;

    public Filme(String nomeF, String diretorF, String anoF, String dataLF, String classificacaoF, String generoF){
        this.nomeF = nomeF;
        this.diretorF = diretorF;
        this.anoF = anoF;
        this.dataLF = dataLF;
        this.classificacaoF = classificacaoF;
        this.generoF = generoF;
    }

    public Filme(){

    }

    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public String getDiretorF() {
        return diretorF;
    }

    public void setDiretorF(String diretorF) {
        this.diretorF = diretorF;
    }

    public String getAnoF() {
        return anoF;
    }

    public void setAnoF(String anoF) {
        this.anoF = anoF;
    }

    public String getDataLF() {
        return dataLF;
    }

    public void setDataLF(String dataLF) {
        this.dataLF = dataLF;
    }

    public String getClassificacaoF() {
        return classificacaoF;
    }

    public void setClassificacaoF(String classificacaoF) {
        this.classificacaoF = classificacaoF;
    }

    public String getGeneroF() {
        return generoF;
    }

    public void setGeneroF(String generoF) {
        this.generoF = generoF;
    }
}
