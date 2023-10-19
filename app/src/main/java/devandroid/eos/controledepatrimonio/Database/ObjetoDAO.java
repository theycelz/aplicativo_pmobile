package devandroid.eos.controledepatrimonio.Database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import devandroid.eos.controledepatrimonio.models.Objeto;
@Dao
public interface ObjetoDAO {
    @Insert
    void insert(Objeto objeto);
    @Update
    void update(Objeto objeto);
    @Delete
    void delete(Objeto objeto);
    @Query("SELECT * FROM Objeto")
    LiveData<List<Objeto>> getAllObjetos();
}
