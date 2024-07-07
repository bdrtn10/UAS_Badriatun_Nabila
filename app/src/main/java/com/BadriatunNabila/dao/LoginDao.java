package com.BadriatunNabila.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.BadriatunNabila.entity.LoginEntity;

import java.util.List;

@Dao
public interface LoginDao {
    @Insert
    void insert(LoginEntity loginEntity);

    @Query("SELECT * FROM login_table")
    List<LoginEntity> getAllLogins();
}
