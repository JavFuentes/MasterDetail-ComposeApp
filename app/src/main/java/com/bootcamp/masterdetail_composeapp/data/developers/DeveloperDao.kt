package com.bootcamp.masterdetail_composeapp.data.notes

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.bootcamp.masterdetail_composeapp.data.developers.DeveloperEntity
import com.bootcamp.masterdetail_composeapp.utils.Constants

@Dao
interface DveloperDao {
    @Query("SELECT * FROM ${Constants.developer_table_name}")
    fun getAll(): List<DeveloperEntity>

    @Insert
    fun insert(developerEntity: DeveloperEntity)

    @Delete
    fun delete(developerEntity: DeveloperEntity)
}