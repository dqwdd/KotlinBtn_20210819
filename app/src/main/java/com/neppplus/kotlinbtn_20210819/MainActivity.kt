package com.neppplus.kotlinbtn_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var logBtn01 : Button
    lateinit var logBtn02 : Button
    lateinit var toastBtn01 : Button
    lateinit var toastBtn02 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn01 = findViewById(R.id.logBtn01)
        logBtn02 = findViewById(R.id.logBtn02)
        toastBtn01 = findViewById(R.id.toastBtn01)
        toastBtn02 = findViewById(R.id.toastBtn02)

        logBtn01.setOnClickListener {
            // Ctrl + / : 주석 다는 단축키키
            Log.d("메인화면", "첫번째 로그 버튼 눌림")
            Log.e("e", "e는 빨간 글씨로 뜸 로그캣에서")
            Log.i("i","i로그 걍 d랑 같은데 구별하라고 더 만든거임 종류")
            Log.wtf("d","d=Debug, e=error, i=인코딩인듯, wtf=what the fuck도 있대")
        }

        logBtn02.setOnClickListener {
            Log.d("메인 화면","두번째 로그 버튼")
        }

        toastBtn01.setOnClickListener {
            Toast.makeText(this, "연습용 토스트 띄우기", Toast.LENGTH_SHORT).show()
        }

        toastBtn02.setOnClickListener {
            Toast.makeText(this, "연습용 토스트 띄우기02", Toast.LENGTH_SHORT).show()
        }

    }
}