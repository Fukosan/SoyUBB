package com.example.jonathan.preubb;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class LoginActivity extends AppCompatActivity {


    private EditText User;
    private EditText Pass;
    private Button BtnIngresar;
    private TextView RecuPassLink;

    Usuario admin = new Usuario("admin", "123456", "Administrador", "admin@admin.cl", 987654321);
    Usuario JonathanInzunza = new Usuario("19108411k","111111", "Jonathan Inzunza", "joninzun@alumnos.ubiobio.cl", 953861626);
    List<Usuario> listaUsuarios = new List<Usuario>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Usuario> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] ts) {
            return null;
        }

        @Override
        public boolean add(Usuario usuario) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Usuario> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, @NonNull Collection<? extends Usuario> collection) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Usuario get(int i) {
            return null;
        }

        @Override
        public Usuario set(int i, Usuario usuario) {
            return null;
        }

        @Override
        public void add(int i, Usuario usuario) {

        }

        @Override
        public Usuario remove(int i) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Usuario> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Usuario> listIterator(int i) {
            return null;
        }

        @NonNull
        @Override
        public List<Usuario> subList(int i, int i1) {
            return null;
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);  //Evitar giro de pantalla
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();       //Ocultar ActionBar


        User = (EditText) findViewById(R.id.Rut_Usuario) ;
        Pass = (EditText) findViewById(R.id.Password_Usuario);
        RecuPassLink = (TextView) findViewById(R.id.Link_Reponer_Contraseña);
        BtnIngresar = (Button) findViewById(R.id.Boton_Ingresar);



        listaUsuarios.add(admin);
        listaUsuarios.add(JonathanInzunza);


        //Usar Link Para Recuperar Contraseña

            RecuPassLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(v.getContext(), Ensayo.class);
                    startActivityForResult(intent2, 0);
                }
            });


        //Usar Boton para iniciar Activity



        BtnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
