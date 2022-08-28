package com.example.portfolioapp

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.core.app.ShareCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fb=findViewById<ImageView>(R.id.facebook)
        fb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://www.facebook.com/akula.vamshikrishna.75"))
            startActivity(intent)
        }
        val ins=findViewById<ImageView>(R.id.instagram)
        ins.setOnClickListener {
            val intentt = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/vamshi_krishna_0519/"))
            startActivity(intentt)
        }
        val linkd = findViewById<ImageView>(R.id.linkedin)
        linkd.setOnClickListener {
            val linkde=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/vamshi-krishna-akula-78087a201/"))
            startActivity(linkde)
        }
        val mail=findViewById<ImageView>(R.id.gmail)
        mail.setOnClickListener {
            val maill=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com/avk6418@gmail.com/"))
            startActivity(maill)
        }
        val git=findViewById<ImageView>(R.id.github)
        git.setOnClickListener {
            val gith=Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/vamshi1905"))
            startActivity(gith)
        }
        val twit=findViewById<ImageView>(R.id.twitter)
        twit.setOnClickListener {
            val twitt=Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Vamshi1905"))
            startActivity(twitt)
        }
        val code=findViewById<ImageView>(R.id.codechef)
        code.setOnClickListener {
            val codec =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codechef.com/users/vamshi190503"))
            startActivity(codec)
        }
        val share=findViewById<ImageView>(R.id.shareapp)
        share.setOnClickListener {
            Toast.makeText(this@MainActivity,"Feature coming soon",Toast.LENGTH_SHORT).show()
        }
    }
}