package com.example.proyecto

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.adapter_interface.OnContactClickListener
import com.example.proyecto.model.Contact
import com.squareup.picasso.Picasso


class ContactAdapter(private val contactList: List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    private var onContactClickListener: OnContactClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contact, parent, false)

        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

        val contact = contactList[position]
        holder.chatTime.text = contact.contactTime
        holder.userName.text = contact.contactName
        holder.chatPreview.text = contact.previewChatContact

        if (contact.imageContact.isNotEmpty()) {
            Picasso.with(holder.itemView.context)
                .load(contact.imageContact).into(holder.profileImage)
        } else {
            Picasso.with(holder.itemView.context)
                .load("https://cdn.pixabay.com/photo/2017/11/10/05/48/user-2935527_640.png")
                .into(holder.profileImage)
        }

        holder.itemContactContainer.setOnClickListener {
        }
        holder.itemView.setOnClickListener {
            onContactClickListener?.onContactClick(position, contact)
        }

    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ContactViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val itemContactContainer: View = itemView.findViewById(R.id.itemContactContainer)
        val chatTime: TextView = itemView.findViewById(R.id.chatTime)
        val userName: TextView = itemView.findViewById(R.id.userName)
        val chatPreview: TextView = itemView.findViewById(R.id.chatPreview)
        val profileImage: ImageView = itemView.findViewById(R.id.profileImage)

    }

    fun setOnClickListener(onClickListener: ListContactActivity) {
        this.onContactClickListener = onClickListener
    }
}
