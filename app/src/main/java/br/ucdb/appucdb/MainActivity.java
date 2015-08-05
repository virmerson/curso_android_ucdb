package br.ucdb.appucdb;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Carrega o Layout
        setContentView(R.layout.activity_main);

        //Acessa o botao
        final Button btn =  (Button) findViewById(R.id.btn_ok);
        //Acessa o campo de texto
       final EditText edNome = (EditText) findViewById(R.id.ed_nome);

        //Trata o click no botao
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String texto = edNome.getText().toString();
                Toast.makeText(MainActivity.this,"Clique CURTO:" + texto, Toast.LENGTH_SHORT).show();
            }
        });

        //Trata clique longo no botão
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                String texto = edNome.getText().toString();
                Toast.makeText(MainActivity.this,"Clique LONGO:"+ texto, Toast.LENGTH_SHORT).show();

                return true;
            }
        });
    }

}

