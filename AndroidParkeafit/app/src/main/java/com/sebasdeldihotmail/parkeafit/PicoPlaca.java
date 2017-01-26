package com.sebasdeldihotmail.parkeafit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by CARITO on 2/10/15.
 */
public class PicoPlaca extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //se "liga" la apariencia (xmls) a el codigo de java
        setContentView(R.layout.picoplaca);


        //se le da el valor de el app_bar o toolbar que creamos a la variable toolbar que creamos en esta clase
        Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);


        //se aclara que no se va a usar el toolbar de android si no el mio (app_bar)
        setSupportActionBar(toolbar);

        //Vamos a crear el boton back de el toolbar para regresar a la actividad principal
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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


        //Si se preciona el boton hacia atras, te lleva a la actividad principal
        if (id == android.R.id.home)

        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);










    }
}
