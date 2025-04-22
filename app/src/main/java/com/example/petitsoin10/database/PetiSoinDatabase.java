package database;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.petitsoin10.converter.Converters;
import com.example.petitsoin10.dao.AnimalDao;
import com.example.petitsoin10.dao.VaccineDao;
import com.example.petitsoin10.data.entity.Animal;
import com.example.petitsoin10.data.entity.Vaccine;
import android.content.Context;


@Database(entities = { Animal.class, Vaccine.class }, version = 1)
@TypeConverters({ Converters.class })
public abstract class PetiSoinDatabase
        extends RoomDatabase
{

    private static volatile PetiSoinDatabase INSTANCE;

    public abstract AnimalDao animalDao();

    public abstract VaccineDao vaccineDao();

    public static PetiSoinDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (PetiSoinDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), PetiSoinDatabase.class, "PetiSoinDatabase").build();
                }
            }
        }

        return INSTANCE;
    }



}