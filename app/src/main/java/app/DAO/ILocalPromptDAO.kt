package app.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import app.DTO.Prompt

@Dao
interface ILocalPromptDAO {

    //@Query("SELECT * FROM prompts")
    fun getAllPlants() : LiveData<List<Prompt>>


    //I want to change this to store the users data when they save
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(plants: ArrayList<Prompt>)
    abstract fun getPrompts(): Any

}
