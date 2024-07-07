package com.BadriatunNabila.database;

import androidx.room.Database;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;

import com.BadriatunNabila.dao.LoginDao;
import com.BadriatunNabila.entity.LoginEntity;

@Database(entities = {LoginEntity.class}, version = 1)
public abstract class LoginDatabase extends RoomDatabase {
    public abstract LoginDao loginDao();

    private static volatile LoginDatabase INSTANCE;

    public static LoginDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (LoginDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    LoginDatabase.class, "login_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}