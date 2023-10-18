package devandroid.eos.controledepatrimonio.models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import devandroid.eos.controledepatrimonio.R;
import devandroid.eos.controledepatrimonio.models.UserAdapter;

public class MainActivity extends AppCompatActivity {
    Button  btnCadastrar;
    //chamar a outra view, por enquanto recycler
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter; //adaptador de uma recycler viewm=, funciona igual list
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserAdapter();
        recyclerView.setAdapter(adapter);
        btnCadastrar= findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"clicado", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, CreateUser.class));
            }
        });
    }
}