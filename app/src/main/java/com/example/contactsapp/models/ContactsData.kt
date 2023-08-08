package com.example.contactsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contact")
data class ContactsData(
    var name:String,
    var phoneNumber:String,
    var email:String,
    var image:String,
   @PrimaryKey(autoGenerate = true) val contactsId: Int,
)