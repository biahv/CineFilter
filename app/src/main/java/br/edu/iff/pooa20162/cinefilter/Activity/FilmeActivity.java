package br.edu.iff.pooa20162.cinefilter.Activity;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import br.edu.iff.pooa20162.cinefilter.R;
import br.edu.iff.pooa20162.cinefilter.Model.Filme;


public class FilmeActivity extends Activity {

    EditText nome, diretor, ano, dataL, classificacao, genero;
    Button btsalvar, btalterar;
    Long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme);
        Intent intent = getIntent();
        id = (Long) intent.getSerializableExtra("id");

        String nomef = (String) intent.getSerializableExtra("nome");
        String diretorf = (String) intent.getSerializableExtra("diretor");
        String anof = (String) intent.getSerializableExtra("ano");
        String dataLf = (String) intent.getSerializableExtra("dataL");
        String classificacaof = (String) intent.getSerializableExtra("classificacao");
        String generof = (String) intent.getSerializableExtra("genero");

        EditText nome = (EditText) findViewById(R.id.nomeFEdt);
        nome.setText(nomef);

        EditText diretor = (EditText) findViewById(R.id.diretorFEdt);
        diretor.setText(diretorf);

        EditText ano = (EditText) findViewById(R.id.anoFEdt);
        ano.setText(anof);

        EditText dataL = (EditText) findViewById(R.id.dataLFEdt);
        dataL.setText(dataLf);

        EditText classificacao = (EditText) findViewById(R.id.classiFEdt);
        classificacao.setText(classificacaof);

        EditText genero = (EditText) findViewById(R.id.generoFEdt);
        genero.setText(generof);


        btsalvar = (Button) findViewById(R.id.salvarFBtn);
        btalterar = (Button) findViewById(R.id.alterarFBtn);


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

        public void salvar(){

            nome = (EditText) findViewById(R.id.nomeFEdt);
            diretor = (EditText) findViewById(R.id.diretorFEdt);
            ano = (EditText) findViewById(R.id.anoFEdt);
            dataL = (EditText) findViewById(R.id.dataLFEdt);
            classificacao = (EditText) findViewById(R.id.classiFEdt);
            genero = (EditText) findViewById(R.id.generoFEdt);

            Filme filmes = new Filme(nome.getText().toString(), diretor.getText().toString(),
                    ano.getText().toString(), dataL.getText().toString(), classificacao.getText().toString(),
                    genero.getText().toString());

            filmes.save();

            Toast.makeText(this, "Filme Cadastrado", Toast.LENGTH_LONG).show();
            //this.finish();

        }

    public void alterar() {

        nome = (EditText) findViewById(R.id.nomeFEdt);
        diretor = (EditText) findViewById(R.id.diretorFEdt);
        ano = (EditText) findViewById(R.id.anoFEdt);
        dataL = (EditText) findViewById(R.id.dataLFEdt);
        classificacao = (EditText) findViewById(R.id.classiFEdt);
        genero = (EditText) findViewById(R.id.generoFEdt);

        Filme filmes = Filme.findById(Filme.class, id);

        filmes.setNomeF(nome.getText().toString());
        filmes.setDiretorF(diretor.getText().toString());
        filmes.setAnoF(ano.getText().toString());
        filmes.setDataLF(dataL.getText().toString());
        filmes.setClassificacaoF(classificacao.getText().toString());
        filmes.setGeneroF(genero.getText().toString());

        filmes.save();

        Toast.makeText(this, "Filme Alterado", Toast.LENGTH_LONG).show();
        this.finish();
    }
}
