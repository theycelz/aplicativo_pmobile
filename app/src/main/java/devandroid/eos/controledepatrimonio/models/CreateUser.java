package devandroid.eos.controledepatrimonio.models;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.eos.controledepatrimonio.Database.PatrimonioDatabase;
import devandroid.eos.controledepatrimonio.R;

public class CreateUser extends AppCompatActivity {
    EditText identificador;
    EditText observacao;
    EditText num_patrimonio;
    EditText nome_funcionario;
    EditText data;
    Button salvar;
    // Método para obter o ID do tipo com base no tipo selecionado
    private int getIdTipoSelecionado(String tipoSelecionado) {
        switch (tipoSelecionado) {
            case "Mesa":
                return 1;
            case "Cadeira":
                return 2;
            case "Notebook":
                return 3;
            case "Projetor":
                return 4;
            case "Celular":
                return 5;
            default:
                return -1; // Valor padrão ou tratamento de erro
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Configurar o layout criado
        setContentView(R.layout.create_user);

        String[] tiposDePatrimonio = {"Mesa", "Cadeira", "Notebook", "Projetor", "Celular"};

        Spinner spinnerTipo = findViewById(R.id.spinnerTipo);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tiposDePatrimonio);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerTipo.setAdapter(adapter);

        // Adicionar um ouvinte de seleção para o Spinner
        spinnerTipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String tipoSelecionado = tiposDePatrimonio[position];
                // Faça algo com o tipo selecionado, se necessário
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
        //logando editstexts
        identificador = findViewById(R.id.identificador);
        observacao = findViewById(R.id.observacao);
        num_patrimonio = findViewById(R.id.num_patrimonio);
        data = findViewById(R.id.data);
        salvar = findViewById(R.id.btnSalvar);
        //salvar no bd ao clicar em salvar
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedTipo = tiposDePatrimonio[spinnerTipo.getSelectedItemPosition()];
                String identificadorText = identificador.getText().toString();
                String observacaoText = observacao.getText().toString();
                String numPatrimonioText = num_patrimonio.getText().toString();
                String nomeFuncionarioText = nome_funcionario.getText().toString();
                String dataText = data.getText().toString();
                int tipoId = getIdTipoSelecionado(selectedTipo);

                Objeto objeto = new Objeto();
                objeto.setTipoId(tipoId);
                objeto.setDataRegistro(dataText);
                objeto.setNomeFuncionario(nomeFuncionarioText);

                // Crie uma instância de Tipo (se necessário)
                Tipo tipo = new Tipo();
               /* tipo.setTipo();*/
                /*tipo.setDescricao;*/

                // Insira as instâncias no banco de dados
                PatrimonioDatabase database = PatrimonioDatabase.getInstance(CreateUser.this);
                database.objetoDao().insert(objeto);

                // Se você criar uma instância de Tipo (se não existir), também a insira no banco de dados
                if (tipo != null) {
                    database.tipoDao().insert(tipo);
                }
            }
        });
    }
}
