package br.edu.iff.pooa20162.cinefilter.Model;

import com.orm.SugarRecord;

/**
 * Created by bia on 26/03/17.
 */

public class Sessao extends SugarRecord {

    private Filme filme;
    private Cinema cinema;
    private String horario;
    private String sala;
    private String dataE;
    private String tipoE;
    private String preco;

    public Sessao(Filme filme, Cinema cinema, String horario, String sala, String dataE, String tipoE, String preco) {
        this.filme = filme;
        this.cinema = cinema;
        this.horario = horario;
        this.sala = sala;
        this.dataE = dataE;
        this.tipoE = tipoE;
        this.preco = preco;

    }

    public Sessao(){

    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDataE() {
        return dataE;
    }

    public void setDataE(String dataE) {
        this.dataE = dataE;
    }

    public String getTipoE() {
        return tipoE;
    }

    public void setTipoE(String tipoE) {
        this.tipoE = tipoE;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
