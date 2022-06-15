package com.example.googlesigninexample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val googleId = intent.getStringExtra("google_id")
        val googleFirstName = intent.getStringExtra("google_first_name")
        val googleLastName = intent.getStringExtra("google_last_name")
        val googleEmail = intent.getStringExtra("google_email")
        val googleProfilePicURL = intent.getStringExtra("google_profile_pic_url")
        val googleAccessToken = intent.getStringExtra("google_id_token")


        val googleIdTextView = findViewById<TextView>(R.id.google_id_textview)
        googleIdTextView.text = googleId

        val googleFirstNameTextView = findViewById<TextView>(R.id.google_first_name_textview)
        googleFirstNameTextView.text = googleFirstName

        val googleLastNameTextView = findViewById<TextView>(R.id.google_last_name_textview)
        googleLastNameTextView.text = googleLastName

        val googleEmailTextView = findViewById<TextView>(R.id.google_email_textview)
        googleEmailTextView.text = googleEmail

        val googleProfilePicTextView = findViewById<TextView>(R.id.google_profile_pic_textview)
        googleProfilePicTextView.text = googleProfilePicURL

        val googleIdTokenTextView = findViewById<TextView>(R.id.google_id_token_textview)
        googleIdTokenTextView.text = googleAccessToken

    }
}
