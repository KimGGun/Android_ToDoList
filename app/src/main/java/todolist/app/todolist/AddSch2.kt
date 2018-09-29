package todolist.app.todolist

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_sch2.*

class AddSch2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_sch2)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        val year : Int = intent.getIntExtra("year", 1)
        val month : Int = intent.getIntExtra("Y", 1)
        val day : Int = intent.getIntExtra("day", 1)

        val hour = get_time.hour
        val minute = get_time.minute


        to_add3_btn.setOnClickListener {
            val nextIntent = Intent(this, AddSch3::class.java)

            nextIntent.putExtra("year", year)
            nextIntent.putExtra("month", month)
            nextIntent.putExtra("day", day)
            nextIntent.putExtra("hour", hour)
            nextIntent.putExtra("minute", minute)

            startActivity(nextIntent)
        }
    }
}
