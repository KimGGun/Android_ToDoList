package todolist.app.todolist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_sch2.*

class add_sch2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_sch2)

        to_add3_btn.setOnClickListener {
            val nextIntent = Intent(this, add_sch3::class.java)
            startActivity(nextIntent)
        }
    }
}
