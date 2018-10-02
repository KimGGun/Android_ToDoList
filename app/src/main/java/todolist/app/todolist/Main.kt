package todolist.app.todolist

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.Year
import java.util.*

class Main : AppCompatActivity() {
    val ActivityCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        val year : Int = intent.getIntExtra("year", 2018)
        val month : Int = intent.getIntExtra("Y", 1)
        val day : Int = intent.getIntExtra("day", 1)
        val hour : Int = intent.getIntExtra("hour", 0)
        val minute : Int = intent.getIntExtra("minute", 0)


        val cur_year = Calendar.YEAR
        val cur_day = Calendar.DAY_OF_MONTH
        val cur_month = Calendar.MONTH
        val cur_week = Calendar.WEEK_OF_MONTH

        if(cur_year == 2018){
            if(cur_day == day){
                not_sch_today.setText("test")

            }
        }



        add_sch_btn.setOnClickListener {
            val nextIntent = Intent(this, AddSch::class.java)
            startActivity(nextIntent)
        }
    }

}
