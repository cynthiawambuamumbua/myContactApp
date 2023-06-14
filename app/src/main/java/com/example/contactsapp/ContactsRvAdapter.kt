package com.example.contactsapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapp.databinding.ContactNameListBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactsRvAdapter(var contactsData:List<ContactsData>):RecyclerView.Adapter<ContactsRvAdapter.ContactsViewHolder>() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ):ContactsViewHolder {
        val binding = ContactNameListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ContactsViewHolder(binding)
            }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val currentContacts=contactsData.get(position)
        val binding=holder.binding
        binding.tvname.text=currentContacts.name
        binding.tvemail.text=currentContacts.email
        binding.tvimage.tag=currentContacts.image
        binding.tvphonenumber.text=currentContacts.phonenumber
        Picasso
            .get().load(currentContacts.image)
            .resize(80,80)
            .centerInside()
            .transform(CropCircleTransformation())
            .into(binding.tvimage)

    }

    override fun getItemCount(): Int {
     return contactsData.size
    }
    class ContactsViewHolder(var binding: ContactNameListBinding):RecyclerView.ViewHolder(binding.root)
}
