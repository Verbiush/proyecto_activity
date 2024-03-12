package com.example.proyecto.model

import android.widget.ImageView

class Contact(val contactName:String, val contactTime: String ,
    val previewChatContact: String, val imageContact: String = ""  ) {


    fun contactInformation (): String{
        return " $contactName $contactTime $previewChatContact $imageContact"
    }

}
