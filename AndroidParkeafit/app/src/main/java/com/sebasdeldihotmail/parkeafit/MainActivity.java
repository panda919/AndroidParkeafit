package com.sebasdeldihotmail.parkeafit;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.internal.widget.ListViewCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {


    //variable del toolbar o app_bar
    private android.support.v7.widget.Toolbar toolbar;

    //variable del list view
    ListView l;

    //arreglo que va a contener los datos de el listView
    String [] parqueaderos = {"Las vegas","Los guayabos","Regional norte", "Regional sur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //se le da el valor de el app_bar o toolbar que creamos a la variable toolbar que creamos en esta clase
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);


        //se aclara que no se va a usar el toolbar de android si no el mio (app_bar)
        setSupportActionBar(toolbar);


        //se le da el valor a a la variable del listView la "apariencia" del xmls del listView
        l = (ListView) findViewById(R.id.lista);        //Se crea el array adapter que va a tomar los datos del array de Strings parqueaderos y los va a mostrar en el listView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,parqueaderos);
        //se le pasa el adapter con el arreglo a la listView l
        l.setAdapter(adapter);
        //ahora se le da ek onClick listener a la variable l (variable del listView)
        l.setOnItemClickListener(this);






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        //si se cliquea pico en el menu popout de la appbar y placa despliega la actividad de el pico y placa
        if (id == R.id.picoplaca) {

            Intent intent = new Intent(this, PicoPlaca.class);
            startActivity(intent);

        }
        //si se cliquea contacto en el menu popout de la appbar despliega la actividad contacto
        else if (id == R.id.contactomenu)
        {
            Intent intent = new Intent(this, Contacto.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }







    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        //Si se escoge la posicion de el arreglo 0 abre la clase LasVegas
        if (position == 0)
        {
            Intent intent = new Intent(this, LasVegas.class);
            startActivity(intent);
        }

        //Si se escoge la posicion de el arreglo 1 abre la clase LosGuayabos
        else if (position == 1)

        {
            Intent intent = new Intent(this, LosGuayabos.class);
            startActivity(intent);
        }

        //Si se escoge la posicion de el arreglo 2 abre la clase RegionalNorte
        else if (position == 2)

        {
            Intent intent = new Intent(this, RegionalNorte.class);
            startActivity(intent);
        }


        //Si se escoge la posicion de el arreglo 3 abre la clase RegionalSur
        else if (position == 3)

        {
            Intent intent = new Intent(this, RegionalSur.class);
            startActivity(intent);
        }

    }



}
