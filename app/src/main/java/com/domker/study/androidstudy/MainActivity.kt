package com.domker.study.androidstudy

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.domker.study.androidstudy.ImageActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButton()
    }

    private fun initButton() {
        open(R.id.permission, PermissionActivity::class.java)
        open(R.id.image, ImageActivity::class.java)
        open(R.id.videoView, VideoActivity::class.java)
    }

    private fun open(buttonId: Int, clz: Class<*>) {
        findViewById<View>(buttonId).setOnClickListener { startActivity(Intent(this@MainActivity, clz)) }
    }
}