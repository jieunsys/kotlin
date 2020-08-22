package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mOneRoomList = ArrayList<OneRoom>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mOneRoomList.add( OneRoom("101호", 5000000, 30000 ))
        mOneRoomList.add( OneRoom("102호", 3000000, 40000 ))

        listView1.adapter = OneRoomAdapter(this, R.layout.one_room_list_item, mOneRoomList)

        listView1.setOnItemClickListener { adapterView, view, pos, l ->
            val clickedOneRoom = mOneRoomList[pos]
            Toast.makeText(this, clickedOneRoom.title, Toast.LENGTH_SHORT).show()
        }
    }
}


