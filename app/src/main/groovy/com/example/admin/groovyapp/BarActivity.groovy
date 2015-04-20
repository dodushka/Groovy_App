package com.example.admin.groovyapp

import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import android.widget.TextView
import com.example.admin.groovyapp.models.Person
import groovy.transform.CompileStatic

@CompileStatic
class BarActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        def text = new TextView(this)
        text.onClickListener = { v -> (v as TextView).setText(text.getText() + "1") }
        text.text = 'Nick'
        text.textSize = ((text.textSize + 12) as Float)
        setContentView(text)
        (1..10).each { text.text = text.text + it.toString() }
        AllObjFeatures.withFeature()


    }


}