package dao;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Upsert;
import androidx.room.Query;

import com.example.petitsoin10.data.entity.Vaccine;

public interface VaccineDao
{


    @Query("SELECT * FROM vaccine WHERE animalId = :animalId")
    LiveData<List<Vaccine>> getAllVaccinesByAnimalId(long animalId);

    @Upsert
    void addVaccine(Vaccine vaccine);

    @Delete
    void deleteVaccine(Vaccine vaccine);


}
