package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners(){
        val clickableViews:List<View> =
            listOf(box_text_one, box_text_two,box_text_three,box_text_four,box_text_five,Constraint_layout,
            red_button,yellow_button,green_button)

        for(item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }

    }
    private fun makeColored(view: View){
        when(view.id){
            R.id.box_text_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_text_two -> view.setBackgroundColor(Color.GRAY)

            R.id.box_text_three ->view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_text_four ->view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_text_five ->view.setBackgroundResource(android.R.color.holo_orange_light)

            R.id.red_button -> box_text_three.setBackgroundResource(R.color.my_red)
            R.id.yellow_button->box_text_four.setBackgroundResource(R.color.my_yellow)
            R.id.green_button->box_text_five.setBackgroundResource(R.color.my_green)

            else ->view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
