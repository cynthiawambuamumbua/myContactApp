package com.example.contactsapp.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contactsapp.models.ContactsData
import com.example.contactsapp.repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel:ViewModel() {
    var contactsRepository = ContactsRepository()

    fun saveContact(contact: ContactsData): ContactsRepository {
        viewModelScope.launch {
            contactsRepository = saveContact(contact)
        }
        return TODO("Provide the return value")
    }
}