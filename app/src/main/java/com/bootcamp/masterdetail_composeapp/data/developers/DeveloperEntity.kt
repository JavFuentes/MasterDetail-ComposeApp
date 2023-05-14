package com.bootcamp.masterdetail_composeapp.data.developers

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bootcamp.masterdetail_composeapp.utils.Constants

@Entity(tableName = Constants.developer_table_name)
data class DeveloperEntity(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "avatarId") val avatarId: String?
)