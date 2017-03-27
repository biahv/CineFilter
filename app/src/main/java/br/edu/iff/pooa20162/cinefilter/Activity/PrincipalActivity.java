package br.edu.iff.pooa20162.cinefilter.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import br.edu.iff.pooa20162.cinefilter.R;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ImageButton imageCinema = (ImageButton) findViewById(R.id.imageCinema);
        imageCinema.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity.this,LVCinemaActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imageFilme = (ImageButton) findViewById(R.id.imageFilme);
        imageFilme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity.this,LVFilmeActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imageSessao = (ImageButton) findViewById(R.id.imageSessao);
        imageSessao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity.this,LVSessaoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imagePesquisa = (ImageButton) findViewById(R.id.imagePesquisa);
        imagePesquisa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity.this,PesquisaActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imageConfiguracao = (ImageButton) findViewById(R.id.imageConfiguracao);
        imageConfiguracao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity.this,ConfiguracaoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imageSair = (ImageButton) findViewById(R.id.imageSair);
        imageSair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
