package com.example.alert1

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAlert.setOnClickListener {
            val alert = AlertDialog.Builder(this)
            alert.setTitle("이거 타이틀이다")
            alert.setMessage("요기가 메시지다")
            alert.setPositiveButton("확인", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"오호라 확인 눌렀네", Toast.LENGTH_SHORT).show()
            })
            alert.setNegativeButton("취소", null)
            alert.show()
        }
    }
}