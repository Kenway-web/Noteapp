package com.kenway.notesapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "notes_table")
class Note(@ColumnInfo(name = "text")var text : String) {
    @PrimaryKey(autoGenerate = true) var id = 0
}