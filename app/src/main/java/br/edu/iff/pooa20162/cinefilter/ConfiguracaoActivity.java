package br.edu.iff.pooa20162.cinefilter;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ConfiguracaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao);

        Button edtPerfilBtn = (Button) findViewById(R.id.edtPerfilBtn);
        edtPerfilBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfiguracaoActivity.this,AlterarActivity.class);
                startActivity(intent);
            }
        });

        Button exlPerfilBtn = (Button) findViewById(R.id.exlPerfilBtn);
        exlPerfilBtn .setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ConfiguracaoActivity.this);

                builder.setTitle("Excluir Perfil");
                builder.setMessage("Deseja realmente excluir seu perfil?");
                builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(ConfiguracaoActivity.this, "sim=" + arg1, Toast.LENGTH_SHORT).show();
                    }

                });

                builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(ConfiguracaoActivity.this, "nao=" + arg1, Toast.LENGTH_SHORT).show();
                    }
                });

                builder.create();
                builder.show();

            }
        });
    }
}
