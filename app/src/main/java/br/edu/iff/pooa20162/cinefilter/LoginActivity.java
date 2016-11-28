package br.edu.iff.pooa20162.cinefilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText emailEdt = (EditText) findViewById(R.id.emailEdt);
        final EditText senhaEdt = (EditText) findViewById(R.id.senhaEdt);

        Button entarBtn = (Button) findViewById(R.id.entrarBtn);
        entarBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this,PrincipalActivity.class);
                intent.putExtra("email",emailEdt.getText().toString());
                intent.putExtra("senha",senhaEdt.getText().toString());
                startActivity(intent);
            }
        });
    }
}
