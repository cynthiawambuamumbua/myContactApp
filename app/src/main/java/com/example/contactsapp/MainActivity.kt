package com.example.contactsapp

import android.os.Bundle
import android.provider.ContactsContract.Contacts
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        val name1=ContactData("cynthia","0713504579","cynthiawambua64@gmail.com"," ")
        val name2=ContactData("jeff","0721264170","jeffwambua54@gmail.com"," ")
        val name3=ContactData("judy","0745678923","judymuthini56@gmail.com"," ")
        val name4=ContactData("ken","017895678","ken78@gmail.com"," ")
        val name5=ContactData("oplipo","0714567890","oplipo@gmail.com"," ")
        val name6=ContactData("njemp","0145672389","njemp89@gmail.com"," ")
        val name= listOf(name1,name2,name3,name4,name5,name6)
        val contactData= ContactsRvAdapter(name)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactData

    }
}