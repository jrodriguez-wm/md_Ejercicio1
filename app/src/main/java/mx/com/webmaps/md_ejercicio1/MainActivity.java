package mx.com.webmaps.md_ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Agregar backbuttom
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    //Para agregar un menu se agregan los siguientes dos métodos

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Se relaciona el objeto menu con su vista
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return  true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();

        if(id == R.id.item1_id){
            Toast.makeText(getBaseContext(),"item 1",Toast.LENGTH_SHORT).show();
        }
        else if(id== R.id.item2_id){
            Toast.makeText(getBaseContext(),"item 2",Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.item3_id){
            Toast.makeText(getBaseContext(),"item 3",Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.search_id){
            Toast.makeText(getBaseContext(),"search",Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.map_id){
            Toast.makeText(getBaseContext(),"map",Toast.LENGTH_SHORT).show();
        }
        else if(id == android.R.id.home){
            Toast.makeText(getBaseContext(),"finish",Toast.LENGTH_SHORT).show();
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
