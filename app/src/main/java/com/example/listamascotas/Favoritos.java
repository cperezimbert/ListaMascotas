package com.example.listamascotas;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Favoritos extends AppCompatActivity {
    /*
   Declarar instancias globales
   */
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoritos);
        // Inicializar com.example.listamascotas.Pet
        List items = new ArrayList();

        items.add(new Pet(R.drawable.duke, "Duke", 5));
        items.add(new Pet(R.drawable.max, "Max", 5));
        items.add(new Pet(R.drawable.mel, "Mel", 4));
        items.add(new Pet(R.drawable.chloe, "Chloe", 3));
        items.add(new Pet(R.drawable.gidget, "Gidget", 4));

// Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.favorito);
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

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
