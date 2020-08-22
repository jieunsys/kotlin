package com.example.listviewmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list1 = ArrayList<Music>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list1.add(Music("너랑나","아이유"))
        list1.add(Music("저푸른초원위에","나훈아"))

        listView1.adapter = MusicAdapter(this, R.layout.music_item, list1)
        listView1.setOnItemClickListener { adapterView, view, pos, l ->
            val cell = list1[pos]
            Toast.makeText(this, "노래는 " + cell.title + " 이고, 가수는 " + cell.singer, Toast.LENGTH_SHORT).show()
        }

    }
}