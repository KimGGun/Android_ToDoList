package todolist.app.todolist

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        todo_list_btn.setOnClickListener {
            val nextIntent = Intent(this, Main::class.java)
            startActivity(nextIntent)
        }

        todo_add_btn.setOnClickListener {
            val nextIntent = Intent(this, AddSch::class.java)
            startActivity(nextIntent)
        }
    }
}
