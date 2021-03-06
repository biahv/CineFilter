package br.edu.iff.pooa20162.cinefilter.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

import br.edu.iff.pooa20162.cinefilter.R;
import br.edu.iff.pooa20162.cinefilter.Model.Cinema;
import br.edu.iff.pooa20162.cinefilter.Adapter.CinemaAdapter;

public class LVCinemaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvcinema);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LVCinemaActivity.this, CinemaActivity.class);
                intent.putExtra("id", Long.valueOf(0));
                intent.putExtra("nome", "");
                intent.putExtra("rua", "");
                intent.putExtra("numero", "");
                intent.putExtra("bairro", "");
                intent.putExtra("cep", "");
                intent.putExtra("cidade", "");
                intent.putExtra("estado", "");
                intent.putExtra("telefone", "");

                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lvcinema, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected void onResume() {
        super.onResume();
        final ArrayList<Cinema> cinemas  = (ArrayList) Cinema.listAll(Cinema.class);

        ListView lista = (ListView) findViewById(R.id.lvCinema);
        ArrayAdapter adapter = new CinemaAdapter(this,cinemas);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(LVCinemaActivity.this,CinemaActivity.class);

                intent.putExtra("id",cinemas.get(i).getId());
                intent.putExtra("nome",cinemas.get(i).getNomeC());
                intent.putExtra("rua",cinemas.get(i).getRuaC());
                intent.putExtra("numero",cinemas.get(i).getNumeroC());
                intent.putExtra("bairro",cinemas.get(i).getBairroC());
                intent.putExtra("cep",cinemas.get(i).getCidadeC());
                intent.putExtra("cidade",cinemas.get(i).getCidadeC());
                intent.putExtra("estado",cinemas.get(i).getEstadoC());
                intent.putExtra("telefone",cinemas.get(i).getTelefoneC());

                startActivity(intent);

            }
        });

    }

}
