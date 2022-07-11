package app.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import app.DTO.Prompt
import java.util.ArrayList


interface ILocalPromptDAO {
    fun insertAll(prompts: ArrayList<Prompt>)
    abstract fun getPrompts(): Any

}
