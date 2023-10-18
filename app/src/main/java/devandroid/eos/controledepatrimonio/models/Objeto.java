package devandroid.eos.controledepatrimonio.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Objeto")
public class Objeto {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "numPatrim")
    private int numPatrim;

    @ColumnInfo(name = "tipoId")
    private int tipoId;

    @ColumnInfo(name = "dataRegistro")
    private String dataRegistro;

    @ColumnInfo(name = "nomeFuncionario")
    private String nomeFuncionario;

    public Objeto() {
    }

    public int getTipoId() {
        return tipoId;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public int getNumPatrim() {
        return numPatrim;
    }

    public void setNumPatrim(int numPatrim) {
        this.numPatrim = numPatrim;
    }
}

@Entity(tableName = "Tipo")
class Tipo {
    public Object setDescricao;
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "tipoId")
    private int tipoId;

    @ColumnInfo(name = "tipo")
    private String tipo;

    @ColumnInfo(name = "descricao")
    private String descricao;

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public String getTipo() {
        return tipo;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(String tipo) { this.tipo = tipo;}
}
