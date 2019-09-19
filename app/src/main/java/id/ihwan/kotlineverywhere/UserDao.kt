package id.ihwan.kotlineverywhere

import androidx.room.*

@Dao
interface UserDao {
    @Insert
    fun insert(user: User)

    @Update
    fun update(user: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * FROM users WHERE name like :name")
    fun findUserByName(name: String): List<User>
}