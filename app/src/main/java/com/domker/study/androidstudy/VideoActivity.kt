package com.domker.study.androidstudy

import android.graphics.PixelFormat
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*

import java.text.SimpleDateFormat
import java.util.*
import android.os.Environment
import android.widget.VideoView



class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        val videoView = findViewById<View>(R.id.videoView) as VideoView

        //加载指定的视频文件
        val path = getVideoPath(R.raw.big_buck_bunny)
        videoView.setVideoPath(path)

        //创建MediaController对象
        val mediaController = MediaController(this)

        //VideoView与MediaController建立关联
        videoView.setMediaController(mediaController)

        //让VideoView获取焦点
        videoView.requestFocus()
    }

    private fun getVideoPath(resId: Int): String {
        return "android.resource://" + this.packageName + "/" + resId
    }
}

