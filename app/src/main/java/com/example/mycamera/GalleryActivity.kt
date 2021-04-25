package com.example.mycamera

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.io.File

class GalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        val photos : ArrayList<File> = intent.getSerializableExtra("list") as ArrayList<File>
        if(photos.size == 4){
            val takenImage4 = BitmapFactory.decodeFile(photos[3].absolutePath)
            findViewById<ImageView>(R.id.photo_4).setImageBitmap(takenImage4)

            val takenImage3 = BitmapFactory.decodeFile(photos[2].absolutePath)
            findViewById<ImageView>(R.id.photo_3).setImageBitmap(takenImage3)

            val takenImage2 = BitmapFactory.decodeFile(photos[1].absolutePath)
            findViewById<ImageView>(R.id.photo_2).setImageBitmap(takenImage2)

            val takenImage1 = BitmapFactory.decodeFile(photos[0].absolutePath)
            findViewById<ImageView>(R.id.photo_1).setImageBitmap(takenImage1)
        }
        if(photos.size == 3){
            val takenImage3 = BitmapFactory.decodeFile(photos[2].absolutePath)
            findViewById<ImageView>(R.id.photo_3).setImageBitmap(takenImage3)

            val takenImage2 = BitmapFactory.decodeFile(photos[1].absolutePath)
            findViewById<ImageView>(R.id.photo_2).setImageBitmap(takenImage2)

            val takenImage1 = BitmapFactory.decodeFile(photos[0].absolutePath)
            findViewById<ImageView>(R.id.photo_1).setImageBitmap(takenImage1)
        }
        if(photos.size == 2){
            val takenImage2 = BitmapFactory.decodeFile(photos[1].absolutePath)
            findViewById<ImageView>(R.id.photo_2).setImageBitmap(takenImage2)

            val takenImage1 = BitmapFactory.decodeFile(photos[0].absolutePath)
            findViewById<ImageView>(R.id.photo_1).setImageBitmap(takenImage1)
        }
        if(photos.size == 1){
            val takenImage1 = BitmapFactory.decodeFile(photos[0].absolutePath)
            findViewById<ImageView>(R.id.photo_1).setImageBitmap(takenImage1)
        }

    }
}