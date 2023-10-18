package devandroid.eos.controledepatrimonio.Database;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import devandroid.eos.controledepatrimonio.models.Tipo;

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
