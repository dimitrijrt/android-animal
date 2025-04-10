package dao;

import java.util.List;

import androidx.lifecycle.LiveData;

import com.example.petitsoin10.data.entity.Vaccine;

public interface VaccineDao
{

    LiveData<List<Vaccine>> getAllVaccinesByAnimalId(long animalId);

    void addVaccine(Vaccine vaccine);

    void deleteVaccine(Vaccine vaccine);


}
