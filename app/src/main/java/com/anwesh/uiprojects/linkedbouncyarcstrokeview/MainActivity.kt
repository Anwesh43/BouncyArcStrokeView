package com.anwesh.uiprojects.linkedbouncyarcstrokeview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.bouncyarcstrokeview.BouncyArcStrokeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BouncyArcStrokeView.create(this)
    }
}
