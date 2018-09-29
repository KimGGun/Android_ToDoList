package todolist.app.todolist

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_sch3.*

class AddSch3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_sch3)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        val year : Int = intent.getIntExtra("year", 2018)
        val month : Int = intent.getIntExtra("Y", 1)
        val day : Int = intent.getIntExtra("day", 1)
        val hour : Int = intent.getIntExtra("hour", 0)
        val minute : Int = intent.getIntExtra("minute", 0)

        btn_complete_add.setOnClickListener {
            val nextIntent = Intent(this, Main::class.java)
            val title = edit_title.text
            val info  = edit_info.text

            nextIntent.putExtra("day", day)
            nextIntent.putExtra("year", year)
            nextIntent.putExtra("month", month)
            nextIntent.putExtra("hour", hour)
            nextIntent.putExtra("minute", minute)
            nextIntent.putExtra("title", title)
            nextIntent.putExtra("info", info)

            startActivity(nextIntent)
        }
    }
}
