package com.example.jonathan.preubb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Ensayo extends AppCompatActivity {

    private ListView lvPreguntas;
    private PreguntaListAdapter adapter;
    private List<Pregunta> mPreguntaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ensayo);

        lvPreguntas = (ListView)findViewById(R.id.listviewPreguntas);

        mPreguntaList = new ArrayList<>();

        //Agregar Preguntas al ensayo

        mPreguntaList.add(new Pregunta(1, "La señora María compró 3 kg de manzanas y 2 kg de plátanos al mismo precio el kilogramo. Una semana después realizó la misma compra. Si los plátanos habían subido 10 por ciento, ¿en qué  porcentaje habían bajado las manzanas si en ambas ocasiones la señora María pagó lo mismo? ", "En 6,6  por ciento", "En 7,5  por ciento", "En 9,9  por ciento", "En 10  por ciento", 0,1));


        adapter = new PreguntaListAdapter(getApplicationContext(), mPreguntaList);
        lvPreguntas.setAdapter(adapter);
    }
}
