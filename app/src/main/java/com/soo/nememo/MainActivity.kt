package com.soo.nememo

import android.os.Build
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w: Window = window
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }
    }

    //뒤로가기 연속 클릭 대기 시간
    var mBackWait:Long = 0


    override fun onBackPressed() {


        // 뒤로가기 버튼 클릭
        if(System.currentTimeMillis() - mBackWait >=2000 ) {
            mBackWait = System.currentTimeMillis()
            Toast.makeText(this, "'뒤로' 버튼을 한번 더 누르시면 앱이 종료됩니다.", Toast.LENGTH_SHORT).show()
        } else {
            finish() //액티비티 종료
        }

//        if(webViewYn){

//            val mWebView : WebView = findViewById(R.id.web_view)
//
//            if(mWebView.canGoBack()){
//                mWebView.goBack()
//            }
//            else{
//                // 뒤로가기 버튼 클릭
//                if(System.currentTimeMillis() - mBackWait >=2000 ) {
//                    mBackWait = System.currentTimeMillis()
//                    Toast.makeText(this, "'뒤로' 버튼을 한번 더 누르시면 앱이 종료됩니다.", Toast.LENGTH_SHORT).show()
//                } else {
//                    finish() //액티비티 종료
//                }
//            }
//        }



    }

}