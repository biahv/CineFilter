package br.edu.iff.pooa20162.cinefilter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.cinefilter.Adapter.SessaoAdapter;
import br.edu.iff.pooa20162.cinefilter.Model.Sessao;
import br.edu.iff.pooa20162.cinefilter.R;

public class LVSessaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvsessao);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LVSessaoActivity.this, SessaoActivity.class);
                intent.putExtra("id", Long.valueOf(0));
                intent.putExtra("filme", "");
                intent.putExtra("cinema", "");
                intent.putExtra("horario", "");
                intent.putExtra("sala","");
                intent.putExtra("dataE","");
                intent.putExtra("tipoE","");
                intent.putExtra("preco","");

                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lvsessao, menu);
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

    /*protected void onResume() {
        super.onResume();
        final ArrayList<Sessao> sessoes  = (ArrayList) Sessao.listAll(Sessao.class);

        ListView lista = (ListView) findViewById(R.id.lvSessao);
        ArrayAdapter adapter = new SessaoAdapter(this,sessoes);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(LVSessaoActivity.this,SessaoActivity.class);

                intent.putExtra("id",sessoes.get(i).getId());
                intent.putExtra("horario",sessoes.get(i).getHorario());
                intent.putExtra("sala",sessoes.get(i).getSala());
                intent.putExtra("dataE",sessoes.get(i).getDataE());
                intent.putExtra("tipoE",sessoes.get(i).getTipoE());
                intent.putExtra("preco",sessoes.get(i).getPreco());


                startActivity(intent);

            }
        });


    }*/


}
