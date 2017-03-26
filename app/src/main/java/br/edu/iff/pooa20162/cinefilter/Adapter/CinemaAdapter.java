package br.edu.iff.pooa20162.cinefilter.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.cinefilter.Model.Cinema;
import br.edu.iff.pooa20162.cinefilter.R;
import br.edu.iff.pooa20162.cinefilter.R.layout;

import static br.edu.iff.pooa20162.cinefilter.R.layout.linhacinema;


/**
 * Created by bia on 25/03/17.
 */


public class CinemaAdapter extends ArrayAdapter<Cinema>{

    private Context context = null;
    private ArrayList<Cinema> cinemas = null;


    public CinemaAdapter(Context context, ArrayList<Cinema> cinemas) {
        super(context,R.layout.linhacinema, cinemas);
        this.context = context;
        this.cinemas = cinemas;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(linhacinema, parent, false);

        TextView nome = (TextView) rowView.findViewById(R.id.tvllvNomeC);
        TextView rua = (TextView) rowView.findViewById(R.id.tvllvRuaC);
        TextView numero = (TextView) rowView.findViewById(R.id.tvllvNumeroC);
        TextView bairro = (TextView) rowView.findViewById(R.id.tvllvBairroC);
        TextView cep = (TextView) rowView.findViewById(R.id.tvllvCepC);
        TextView cidade = (TextView) rowView.findViewById(R.id.tvllvCidadeC);
        TextView estado = (TextView) rowView.findViewById(R.id.tvllvEstadoC);
        TextView telefone = (TextView) rowView.findViewById(R.id.tvllvTelefoneC);

        nome.setText(cinemas.get(position).getNomeC());
        rua.setText(cinemas.get(position).getRuaC());
        numero.setText(cinemas.get(position).getNumeroC());
        bairro.setText(cinemas.get(position).getBairroC());
        cep.setText(cinemas.get(position).getCepC());
        cidade.setText(cinemas.get(position).getCidadeC());
        estado.setText(cinemas.get(position).getEstadoC());
        telefone.setText(cinemas.get(position).getTelefoneC());
        return rowView;
    }


}
