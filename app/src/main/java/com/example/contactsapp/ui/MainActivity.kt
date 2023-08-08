package com.example.contactsapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapp.databinding.ActivityMainBinding
import com.example.contactsapp.models.ContactsData

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
        binding.flbtnAdd.setOnClickListener {
            val intent=Intent(this, AddContact::class.java)
            startActivity(intent)
        }

    }
    fun displayContacts(){
        val name1= ContactsData("cynthia","0713504579","cynthiawambua64@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQv36bQi4sBqhUsZAXpyPoxylHrIlnvPqIqQ&usqp=CAU",1)
        val name2= ContactsData("jeff","0721264170","jeffwambua54@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSKH6jiyvll2_mf962tW-pjpsFZs4mib7ZlFQ&usqp=CAU",2)
        val name3= ContactsData("judy","0745678923","judymuthini56@gmail.com"," https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDvYYiAt_WjzQ5lueNSWMwHNjp7UV5mjBXOg&usqp=CAU",3)
        val name4= ContactsData("ken","017895678","ken78@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4EO4mBYy5wcJYmUekTrDMFCN9MlR6sP3mJA&usqp=CAU",4)
        val name5= ContactsData("oplipo","0714567890","oplipo@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3-sz8N_5WCbp2jABTPlwZqz5XnZ7QtoBbnw&usqp=CAU",5)
        val name6= ContactsData("njemp","0145672389","njemp89@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-17FoYwtUFCOW0aLWHrkIRxJ83Up7UF9XAg&usqp=CAU",6)
        val name= listOf(name1,name2,name3,name4,name5,name6)
        val contactData= ContactsRvAdapter(name)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactData

    }
}