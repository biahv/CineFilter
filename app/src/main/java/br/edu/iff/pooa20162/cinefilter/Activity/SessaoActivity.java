package br.edu.iff.pooa20162.cinefilter.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import br.edu.iff.pooa20162.cinefilter.R;
import br.edu.iff.pooa20162.cinefilter.Model.Sessao;
import br.edu.iff.pooa20162.cinefilter.Model.Filme;
import br.edu.iff.pooa20162.cinefilter.Model.Cinema;
import br.edu.iff.pooa20162.cinefilter.Adapter.FilmeAdapter;
import br.edu.iff.pooa20162.cinefilter.Adapter.CinemaAdapter;

public class SessaoActivity extends AppCompatActivity {

    EditText horario, sala, dataE, tipoE, preco;
    Spinner spFilme, spCinema;
    Button btsalvar, btalterar;
    Long id;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessao);
        Intent intent = getIntent();
        id = (Long) intent.getSerializableExtra("id");

        String horarios = (String) intent.getSerializableExtra("horario");
        String salas = (String) intent.getSerializableExtra("sala");
        String dataEs = (String) intent.getSerializableExtra("dataE");
        String tipoEs = (String) intent.getSerializableExtra("tipoE");
        String precos = (String) intent.getSerializableExtra("preco");

        final ArrayList<Filme> filmes = (ArrayList) Filme.listAll(Filme.class);

        ArrayAdapter<Filme> adapter = new ArrayAdapter<Filme>(this, android.R.layout.simple_spinner_item, filmes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spFilme = (Spinner) findViewById(R.id.spFilmeSessao);
        spFilme.setAdapter(adapter);


        final ArrayList<Cinema> cinemas = (ArrayList) Cinema.listAll(Cinema.class);

        ArrayAdapter<Cinema> adapter2 = new ArrayAdapter<Cinema>(this, android.R.layout.simple_spinner_item, cinemas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spCinema = (Spinner) findViewById(R.id.spCinemaSessao);
        spCinema.setAdapter(adapter);

        EditText horario = (EditText) findViewById(R.id.horaSEdt);
        horario.setText(horarios);

        EditText sala = (EditText) findViewById(R.id.salaSEdt);
        sala.setText(salas);

        EditText dataE = (EditText) findViewById(R.id.dataExiSEdt);
        dataE.setText(dataEs);

        EditText tipoE = (EditText) findViewById(R.id.tipoExSEdt);
        tipoE.setText(tipoEs);

        EditText preco = (EditText) findViewById(R.id.precoSEdt);
        preco.setText(precos);


        btsalvar = (Button) findViewById(R.id.salvarSBtn);
        btalterar = (Button) findViewById(R.id.alterarSBtn);


        btsalvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                salvar();
            }
        });
        btalterar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                alterar();
            }
        });

        if (id != 0) {
            btsalvar.setEnabled(false);
            btsalvar.setClickable(false);
            btsalvar.setVisibility(View.INVISIBLE);
        } else {
            btalterar.setEnabled(false);
            btalterar.setClickable(false);
            btalterar.setVisibility(View.INVISIBLE);

        }
    }

        public void salvar() {

            Filme filmes  = ((Filme) spFilme.getSelectedItem());
            Cinema cinemas  = ((Cinema) spCinema.getSelectedItem());
            horario = (EditText) findViewById(R.id.horaSEdt);
            sala = (EditText) findViewById(R.id.salaSEdt);
            dataE = (EditText) findViewById(R.id.dataExiSEdt);
            tipoE = (EditText) findViewById(R.id.tipoExSEdt);
            preco = (EditText) findViewById(R.id.precoSEdt);



            Sessao sessoes = new Sessao(filmes, cinemas, horario.getText().toString(), sala.getText().toString(),
                    dataE.getText().toString(), tipoE.getText().toString(), preco.getText().toString());

            sessoes.save();

            Toast.makeText(this, "Sessão Cadastrada", Toast.LENGTH_LONG).show();
            this.finish();

        }

        public void alterar() {

            Filme filmes  = ((Filme) spFilme.getSelectedItem());
            Cinema cinemas  = ((Cinema) spCinema.getSelectedItem());
            horario = (EditText) findViewById(R.id.horaSEdt);
            sala = (EditText) findViewById(R.id.salaSEdt);
            dataE = (EditText) findViewById(R.id.dataExiSEdt);
            tipoE = (EditText) findViewById(R.id.tipoExSEdt);
            preco = (EditText) findViewById(R.id.precoSEdt);

            Sessao sessoes = Sessao.findById(Sessao.class, id);

            sessoes.setFilme(filmes);
            sessoes.setCinema(cinemas);
            sessoes.setHorario(horario.getText().toString());
            sessoes.setSala(sala.getText().toString());
            sessoes.setDataE(dataE.getText().toString());
            sessoes.setTipoE(tipoE.getText().toString());
            sessoes.setPreco(preco.getText().toString());



            sessoes.save();

            Toast.makeText(this, "Sessão Alterada", Toast.LENGTH_LONG).show();
            this.finish();
        }



    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Sessao Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
