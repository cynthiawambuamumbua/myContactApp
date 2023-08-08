package com.example.contactsapp.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.contactsapp.models.ContactsData

@Database(entities = [ContactsData::class], version = 1)
abstract class ContactsDB:RoomDatabase() {
    abstract fun contactDao():ContactDao

    companion object{
        private var database:ContactsDB?=null

        fun getDataBase(context: Context):ContactsDB{
            if (database==null){
                database= Room
                    .databaseBuilder(context,ContactsDB::class.java,"ContactsDB")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return database as ContactsDB
        }
    }
}
