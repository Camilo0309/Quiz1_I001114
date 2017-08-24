package com.i001114.quiz1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainDosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dos);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.flt_1); // <-- este codigo sirve para que obtenga el id del boton floating
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VentanaUno(view);
            }
        });

        Button btn1 = (Button) findViewById(R.id.button2);
        registerForContextMenu(btn1);

    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        menu.setHeaderTitle("Mis Opciones");
        inflater.inflate(R.menu.main, menu);
    }

    public void VentanaUno(View v){
        Intent intent = new Intent(this, MainActivity.class); // Intent = intenciones sirve para obtener todas las actividades que uno tiene y recibe dos parametros
        startActivity(intent);

    }

}
