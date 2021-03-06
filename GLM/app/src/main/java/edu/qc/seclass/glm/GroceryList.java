package edu.qc.seclass.glm;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.support.annotation.NonNull;

import java.util.List;

import edu.qc.seclass.glm.Model.GList;

@Dao
public interface GroceryList {

    @Query("DELETE FROM GList WHERE name=:name")
    void deleteFromGListByName(String name);

    @Query ("SELECT * FROM GList")
    List<GList> getAllGLists();

    @Query ("SELECT * FROM GList WHERE name=:name")
    GList getGListWithName(final String name);

    @Insert
    void insert(GList list);

    @Delete
    void delete(GList... gists);
}
