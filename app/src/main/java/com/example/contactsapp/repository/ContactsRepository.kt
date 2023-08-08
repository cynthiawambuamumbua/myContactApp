package com.example.contactsapp.repository

import com.example.contactsapp.ContactsApp
import com.example.contactsapp.dataBase.ContactsDB
import com.example.contactsapp.models.ContactsData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    var database=ContactsDB.getDataBase(ContactsApp.appContext)

    suspend fun  saveContact(contactsData: ContactsData){
        withContext(Dispatchers.IO){
            database.contactDao().insertContact(contactsData)
        }
    }
}