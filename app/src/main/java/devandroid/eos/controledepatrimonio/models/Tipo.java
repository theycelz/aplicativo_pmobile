package devandroid.eos.controledepatrimonio.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Tipo")
    public
    class Tipo {

        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "tipoId")
        private int tipoId;

        @ColumnInfo(name = "tipo")
        private String tipo;

        @ColumnInfo(name = "descricao")
        public String descricao;

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

