package kr.co.octsun.os_aos_kotlin.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kr.co.octsun.os_aos_kotlin.R

class ActivitySplash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        goToMainScreen()
    }

    private fun goToMainScreen(){
        Handler().postDelayed({
            val intent = Intent(this, ActivityMain::class.java)
            startActivity(intent)
            finish()
        },2000)
    }

}