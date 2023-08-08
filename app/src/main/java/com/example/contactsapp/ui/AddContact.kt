package com.example.contactsapp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.contactsapp.databinding.ActivityAddContactBinding
import com.example.contactsapp.models.ContactsData
import com.example.contactsapp.viewModels.ContactsViewModel

class AddContact(val phoneNumber: String) : AppCompatActivity() {
    lateinit var binding:ActivityAddContactBinding
    val  contactsViewModel:ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnSave.setOnClickListener {
            validateAddContact()
        }
    }
    fun validateAddContact() {
        val name = binding.etFirstName.text.toString()
        val name2 = binding.etLAstNAme.text.toString()
        val Phonenumber = binding.etPhonenumber.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false
        if (name.isBlank()) {
            binding.tilFirstName.error= "First Name required"
            Toast.makeText(this, "Please enter first name", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (name.isBlank()) {
            binding.tilLastName.error= "Last Name required"
            Toast.makeText(this, "Please enter last name", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (name2.isBlank()) {
            binding.tilEmail.error = "Password required"
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (email.isBlank()) {
            binding.tilPhonenumber.error = "Phone Number required"
            Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (!error) {
            val newContact=ContactsData(name, phoneNumber,email,"",0)
            contactsViewModel.saveContact(newContact)

            Toast.makeText(this, "Contact saved successfully", Toast.LENGTH_SHORT).show();
      }
    }
}
