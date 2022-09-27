package com.example.f1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class max_verstappen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_max_verstappen)

        val img17 = findViewById<ImageView>(R.id.imageView17)
        val img18 = findViewById<ImageView>(R.id.imageView18)

        Glide.with(this).load("https://s2.glbimg.com/DKEOLNy9M4KhE4yiHNPLjT-Fe7E=/0x0:1024x683/1080x0/smart/filters:quality(70)/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2022/Q/i/Z0Q7WlSAueHwFFkXcURQ/gettyimages-1420757425-1-.jpg").into(img17)
        Glide.with(this).load("https://cloudfront-us-east-1.images.arcpublishing.com/infobae/436CJU2DURDBNKOCOKJKKLIV2Q.jpg").into(img18)
    }
}