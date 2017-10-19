package br.usjt.ftce.arqdesis.clientecco17;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText texte;
    public static final String chave = "br.usjt.ftce.arqdesis.clientecco17.chave";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texte = (EditText)findViewById(R.id.buscar_clientes);

    }
    public void buscarCliente(View view){
        Intent intent = new Intent(this, ListarClientesActivity.class);
        String texto = texte.getText().toString();
        intent.putExtra(chave,texto);
        startActivity(intent);

    }
}
