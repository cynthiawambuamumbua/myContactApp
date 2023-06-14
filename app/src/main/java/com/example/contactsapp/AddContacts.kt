package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contactsapp.databinding.ActivityAddContacts

class AddContacts : AppCompatActivity() {
    lateinit var binding: ActivityAddContacts
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContacts.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvnames.setOnClickListener{

        }

    }

    private fun saveContact() {
        // Retrieve input data from UI fields
        val name = binding.tvnames.text.toString()
        val phoneNumber = binding.tvPhoneNo.text.toString()
        val emailAddress = binding.tvmails.text.toString()
        val avatar= binding.ivImages.toString()

        // Perform validation on the input data
        if (name.isNotEmpty() && phoneNumber.isNotEmpty() && emailAddress.isNotEmpty()) {
            // Create a new ContactData object with the input data
            val newContact = ContactData(name, phoneNumber, emailAddress, avatar)

            // TODO: Save the new contact to the database or any desired storage

            // Finish the activity and return to the MainActivity
            finish()
        } else {
            // Display an error message indicating incomplete input
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
        }
    }

    private fun ContactData(allNames: String, phoneNumber: String, emailAddress: String, avatar: String) {

    }


}








