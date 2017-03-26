package br.edu.iff.pooa20162.cinefilter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

import br.edu.iff.pooa20162.cinefilter.Model.Cinema;

public class CinemaActivity extends Activity  {

    EditText nome, rua, numero, bairro, cep, cidade, estado, telefone;
    Button salvarCBtn,alterarCBtn;
    Long id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema);Intent intent    = getIntent();
        id = (Long)intent.getSerializableExtra("id");

        String nomec     = (String) intent.getSerializableExtra("nome");
        String ruac    = (String) intent.getSerializableExtra("rua");
        String numeroc = (String) intent.getSerializableExtra("numero");
        String bairroc    = (String) intent.getSerializableExtra("bairro");
        String cepc    = (String) intent.getSerializableExtra("cep");
        String cidadec    = (String) intent.getSerializableExtra("cidade");
        String estadoc    = (String) intent.getSerializableExtra("estado");
        String telefonec    = (String) intent.getSerializableExtra("telefone");


        EditText nome = (EditText) findViewById(R.id.nomeCEdt);
        nome.setText(nomec);

        EditText rua = (EditText) findViewById(R.id.ruaCEdt);
        rua.setText(ruac);

        EditText numero = (EditText) findViewById(R.id.numeroCEdt);
        numero.setText(numeroc);

        EditText bairro = (EditText) findViewById(R.id.bairroCEdt);
        bairro.setText(bairroc);

        EditText cep = (EditText) findViewById(R.id.cepCEdt);
        cep.setText(cepc);

        EditText cidade = (EditText) findViewById(R.id.cidadeCEdt);
        cidade.setText(cidadec);

        EditText estado = (EditText) findViewById(R.id.estadoCEdt);
        estado.setText(estadoc);

        EditText telefone = (EditText) findViewById(R.id.telefoneCEdt3);
        telefone.setText(telefonec);




        salvarCBtn = (Button) findViewById(R.id.salvarCBtn);
        alterarCBtn = (Button) findViewById(R.id.alterarCBtn);


        salvarCBtn.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                salvar();
            }
        });
        alterarCBtn.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                alterar();
            }
        });

        if (id !=0) {
            salvarCBtn.setEnabled(false);
            salvarCBtn.setClickable(false);
            salvarCBtn.setVisibility(View.INVISIBLE);
        }else{
            alterarCBtn.setEnabled(false);
            alterarCBtn.setClickable(false);
            alterarCBtn.setVisibility(View.INVISIBLE);

        }


    }

    public void salvar() {

        nome = (EditText) findViewById(R.id.nomeCEdt);
        rua = (EditText) findViewById(R.id.ruaCEdt);
        numero = (EditText) findViewById(R.id.nomeCEdt);
        bairro = (EditText) findViewById(R.id.bairroCEdt);
        cep = (EditText) findViewById(R.id.cepCEdt);
        cidade = (EditText) findViewById(R.id.cidadeCEdt);
        estado = (EditText) findViewById(R.id.estadoCEdt);
        telefone = (EditText) findViewById(R.id.telefoneCEdt3);


        Cinema cinema = new Cinema(nome.getText().toString(),rua.getText().toString(),
                numero.getText().toString(),bairro.getText().toString(),
                cep.getText().toString(),cidade.getText().toString(),estado.getText().toString(),
                telefone.getText().toString());

        cinema.save();

        Toast.makeText(this,"Cinema Cadastrado",Toast.LENGTH_LONG).show();
        this.finish();

    }
    public void alterar() {

        nome = (EditText) findViewById(R.id.nomeCEdt);
        rua = (EditText) findViewById(R.id.ruaCEdt);
        numero = (EditText) findViewById(R.id.nomeCEdt);
        bairro = (EditText) findViewById(R.id.bairroCEdt);
        cep = (EditText) findViewById(R.id.cepCEdt);
        cidade = (EditText) findViewById(R.id.cidadeCEdt);
        estado = (EditText) findViewById(R.id.estadoCEdt);
        telefone = (EditText) findViewById(R.id.telefoneCEdt3);

        Cinema cinema = Cinema.findById(Cinema.class, id);

        cinema.setNomeC(nome.getText().toString());
        cinema.setRuaC(rua.getText().toString());
        cinema.setNumeroC(numero.getText().toString());
        cinema.setBairroC(bairro.getText().toString());
        cinema.setCepC(cep.getText().toString());
        cinema.setCidadeC(cidade.getText().toString());
        cinema.setEstadoC(estado.getText().toString());
        cinema.setTelefoneC(telefone.getText().toString());


        cinema.save();

        Toast.makeText(this,"Cinema Alterado",Toast.LENGTH_LONG).show();
        this.finish();
    }
}
