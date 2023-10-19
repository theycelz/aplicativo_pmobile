package devandroid.eos.controledepatrimonio.Database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Delete;
import androidx.lifecycle.LiveData;

import java.util.List;

import devandroid.eos.controledepatrimonio.models.Tipo; // Importação correta
@Dao
public interface TipoDAO {
    @Insert
    void insert(Tipo tipo);

    @Update
    void update(Tipo tipo);

    @Delete
    void delete(Tipo tipo);

    @Query("SELECT * FROM Tipo")
    LiveData<List<Tipo>> getAllTipos();
}
