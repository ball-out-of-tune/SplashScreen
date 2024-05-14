package com.example.splashscreen.presentation

import android.graphics.pdf.PdfDocument.Page
import androidx.annotation.DrawableRes
import com.example.splashscreen.R

data class page(
    val title: String,
    val description: String,
    @DrawableRes val img: Int
)

val pages = listOf(
    page(
        "查看NBA赛程",
        "你想看的比赛这里都有",
        R.drawable.schedule,
    ),

    page(
        "浏览赛后新闻",
        "精彩赛后咨询不容错过",
        R.drawable.newsaftergame,
    ),

    page(
        "观看教学视频",
        "掌握精湛球技",
        R.drawable.training,
    ),
)
