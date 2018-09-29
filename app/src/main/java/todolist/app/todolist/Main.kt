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
        not_sch_week.setText("등록된 일정이 없습니다.")
        not_sch_today.setText("등록된 일정이 없습니다.")


        not_sch_today.setText(year)
        not_sch_week.setText(day)
        /*if(ActivityCount == 0){
            not_sch_today.setText("등록된 일정이 없습니다.")
            not_sch_week.setText("등록된 일정이 없습니다.")
        } else if(cur_year == year && cur_month == month){
            if(cur_day == day){
                not_sch_today.append("sex")
                ActivityCount + 1
            }

            if((cur_day / 7) == cur_week){
                not_sch_week.append("sex")
                ActivityCount + 1
            }
        }*/



        add_sch_btn.setOnClickListener {
            val nextIntent = Intent(this, AddSch::class.java)
            startActivity(nextIntent)
        }
    }

}
