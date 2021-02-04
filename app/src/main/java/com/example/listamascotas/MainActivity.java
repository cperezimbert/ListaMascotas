package com.example.listamascotas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    /*
    Declarar instancias globales
    */
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inicializar com.example.listamascotas.Pet
        List items = new ArrayList();

        items.add(new Pet(R.drawable.max, "Max", 5));
        items.add(new Pet(R.drawable.mel, "Mel", 4));
        items.add(new Pet(R.drawable.chloe, "Chloe", 3));
        items.add(new Pet(R.drawable.duke, "Duke", 5));
        items.add(new Pet(R.drawable.gidget, "Gidget", 4));

// Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new PetAdapter(items);
        recycler.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.mContacto:
                break;
            case R.id.mAcercade:
                break;
            case R.id.mFavoritos:
                Intent intent = new Intent(MainActivity.this, Favoritos.class);
                startActivity(intent);
                //break;
        }
        return super.onOptionsItemSelected(item);
    }
}