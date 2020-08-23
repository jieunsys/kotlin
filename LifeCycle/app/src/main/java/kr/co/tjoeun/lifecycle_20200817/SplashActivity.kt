package kr.co.tjoeun.lifecycle_20200817

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        2.5 초 (== 2500ms)는 로딩화면을 보여주고 나서 메인으로 이동하고싶다.

        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({
//            일정 시간이 지난 후에 실행시키고자 하는 코드 작성
            //        Splash 화면 => 메인화면으로 (자동으로) 이동해야함.

            val myIntent = Intent(mContext, MainActivity::class.java)
            startActivity(myIntent)

//        메인화면으로 이동한 후에는 종료
            finish()

        }, 2500)



    }

}