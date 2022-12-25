package com.example.reminderapplication


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.reminderapplication.R

//this class creates the Reminder Notification Message
class NotificationMessage : AppCompatActivity() {
    var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_message)
        textView = findViewById(R.id.tv_message)
        val bundle = intent.extras //call the data which is passed by another intent
        textView!!.setText(bundle!!.getString("message"))
    }
}