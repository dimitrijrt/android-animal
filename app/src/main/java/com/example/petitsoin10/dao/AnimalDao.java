package dao;

import java.util.List;

import androidx.lifecycle.LiveData;

import com.example.petitsoin10.data.entity.Animal;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Upsert;

@Dao
public interface AnimalDao
{


    @Query("SELECT * FROM animal WHERE id = :id")
    Animal getAnimalById(long id);


    @Query("SELECT * FROM animal")
    LiveData<List<Animal>> getAllAnimals();

    @Upsert
    void addAnimal(Animal animal);

    @Delete
    void deleteAnimal(Animal animal);

}
