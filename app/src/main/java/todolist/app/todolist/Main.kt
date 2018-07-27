package todolist.app.todolist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_sch_btn.setOnClickListener {
            val nextIntent = Intent(this, add_sch::class.java)
            startActivity(nextIntent)
        }
    }
}
