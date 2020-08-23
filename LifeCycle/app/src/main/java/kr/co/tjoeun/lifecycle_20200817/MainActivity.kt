package kr.co.tjoeun.lifecycle_20200817

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

        Log.d("메인화면", "onCreate 실행됨")
    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "onResume 실행됨 - 화면이 나타남")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면", "onPause 실행됨 - 화면이 사라짐")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인화면", "onDestory 실행됨 - 액티비티가 메모리에서 소멸됨")
    }

    override fun setupEvents() {

        otherActivityBtn.setOnClickListener {
            val myIntent = Intent(mContext, OtherActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun setValues() {

    }


}