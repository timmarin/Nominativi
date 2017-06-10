package it.digipro.nominativi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tbxNome;
    EditText tbxTelefono;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbxNome = (EditText) findViewById(R.id.tbxNome);
        tbxTelefono = (EditText) findViewById(R.id.tbxTelefono);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_nominativi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.action_add:

                String nominativos = tbxNome.getText().toString();
                String telefono = tbxTelefono.getText().toString();

                UtenteSQL

                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
