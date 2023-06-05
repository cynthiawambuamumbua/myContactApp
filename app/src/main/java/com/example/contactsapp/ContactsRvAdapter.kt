package com.example.contactsapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapp.databinding.ContactNameListBinding

class ContactsRvAdapter(var contactsData:List<ContactData>):RecyclerView.Adapter<ContactsRvAdapter.ContactsViewHolder>() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ):ContactsViewHolder {
        val binding = ContactNameListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ContactsViewHolder(binding)
            }

    override fun onBindViewHolder(holder: ContactsRvAdapter.ContactsViewHolder, position: Int) {
        val currentContacts=contactsData.get(position)
        val binding=holder.binding
        binding.tvname.text=currentContacts.name
        binding.tvemail.text=currentContacts.email
        binding.tvimage.tag=currentContacts.image
        binding.tvphonenumber.text=currentContacts.phonenumber

    }

    override fun getItemCount(): Int {
     return contactsData.size
    }
    class ContactsViewHolder(var binding: ContactNameListBinding):RecyclerView.ViewHolder(binding.root)
}
