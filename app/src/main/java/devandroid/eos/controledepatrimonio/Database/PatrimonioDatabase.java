package devandroid.eos.controledepatrimonio.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import devandroid.eos.controledepatrimonio.models.Objeto;
import devandroid.eos.controledepatrimonio.models.Tipo;

@Database(entities = {Objeto.class, Tipo.class}, version = 1)
public abstract class PatrimonioDatabase extends RoomDatabase {
    public abstract ObjetoDAO objetoDao();
    public abstract TipoDAO tipoDao();

    private static PatrimonioDatabase instance;

    public static synchronized PatrimonioDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            PatrimonioDatabase.class, "Patrimonio")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
