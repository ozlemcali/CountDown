package com.ozlemcali.countdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       object:CountDownTimer(10000,1000){
           override fun onTick(p0: Long) {
               textView.text="Left: ${p0/1000}"
           }

           override fun onFinish() {
             textView.text="Left:0"
           }


       }.start()
    }




}