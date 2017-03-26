package br.edu.iff.pooa20162.cinefilter.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

import br.edu.iff.pooa20162.cinefilter.R;
import br.edu.iff.pooa20162.cinefilter.Model.Filme;

/**
 * Created by bia on 26/03/17.
 */

public class FilmeAdapter extends ArrayAdapter<Filme> {

    private Context context = null;
    private ArrayList<Filme> filmes = null;

    public FilmeAdapter(Context context, ArrayList<Filme> filmes) {
        super(context, R.layout.linhafilme,filmes);
        this.context = context;
        this.filmes = filmes;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linhafilme, parent, false);
        final Filme item = getItem(position);

        TextView nome = (TextView) rowView.findViewById(R.id.tvllvNomeF);
        TextView diretor = (TextView) rowView.findViewById(R.id.tvllvDiretorF);
        TextView ano = (TextView) rowView.findViewById(R.id.tvllvAnoF);
        TextView dataL = (TextView) rowView.findViewById(R.id.tvllvDataLF);
        TextView classificacao = (TextView) rowView.findViewById(R.id.tvllvClassificacaoF);
        TextView genero = (TextView) rowView.findViewById(R.id.tvllvGeneroF);

        nome.setText(filmes.get(position).getNomeF());
        diretor.setText(filmes.get(position).getDiretorF());
        ano.setText(filmes.get(position).getAnoF());
        dataL.setText(filmes.get(position).getDataLF());
        classificacao.setText(filmes.get(position).getClassificacaoF());
        genero.setText(filmes.get(position).getGeneroF());
        return rowView;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }
}
