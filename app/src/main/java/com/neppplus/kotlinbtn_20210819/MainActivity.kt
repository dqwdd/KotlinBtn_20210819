package com.neppplus.kotlinbtn_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var logBtn01 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn01 = findViewById(R.id.logBtn01)

        logBtn01.setOnClickListener {
            // Ctrl + / : 주석 다는 단축키키
            Log.d("메인화면", "첫번째 로그 버튼 눌림")
            Log.e("e", "e는 빨간 글씨로 뜸 로그캣에서")
            Log.i("i","i로그 걍 d랑 같은데 구별하라고 더 만든거임 종류")
            Log.wtf("d","d=Debug, e=error, i=인코딩인듯, wtf=what the fuck도 있대")
        }

    }
}