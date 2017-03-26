package br.edu.iff.pooa20162.cinefilter.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.cinefilter.R;
import br.edu.iff.pooa20162.cinefilter.Model.Sessao;


/**
 * Created by bia on 26/03/17.
 */

public class SessaoAdapter extends ArrayAdapter<Sessao>{
    private Context context = null;
    private ArrayList<Sessao> sessoes = null;


    public SessaoAdapter(Context context, ArrayList<Sessao> sessoes) {
        super(context, R.layout.linhasessao, sessoes);
        this.context = context;
        this.sessoes = sessoes;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linhasessao, parent, false);

        TextView filme = (TextView) rowView.findViewById(R.id.tvllvFilmeS);
        TextView cinema = (TextView) rowView.findViewById(R.id.tvllvCinemaS);
        TextView horario = (TextView) rowView.findViewById(R.id.tvllvHorarioS);
        TextView sala = (TextView) rowView.findViewById(R.id.tvllvSalaS);
        TextView dataE = (TextView) rowView.findViewById(R.id.tvllvDataES);
        TextView tipoE = (TextView) rowView.findViewById(R.id.tvllvTipoES);
        TextView preco = (TextView) rowView.findViewById(R.id.tvllvPrecoS);

        filme.setText(sessoes.get(position).getFilme().getNomeF());
        cinema.setText(sessoes.get(position).getCinema().getNomeC());
        horario.setText(sessoes.get(position).getHorario());
        sala.setText(sessoes.get(position).getSala());
        dataE.setText(sessoes.get(position).getDataE());
        tipoE.setText(sessoes.get(position).getTipoE());
        preco.setText(sessoes.get(position).getPreco());

        return rowView;
    }
}
