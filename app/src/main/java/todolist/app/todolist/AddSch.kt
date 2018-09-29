package todolist.app.todolist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_sch.*
import android.content.pm.ActivityInfo



class AddSch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_sch)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT


        to_add2_btn.setOnClickListener {
            val nextIntent = Intent(this, AddSch2::class.java)

            val year = get_date.year
            val month = get_date.month
            val day = get_date.dayOfMonth

            nextIntent.putExtra("day", day)
            nextIntent.putExtra("year", year)
            nextIntent.putExtra("month", month)


            startActivity(nextIntent)
        }
    }
}
