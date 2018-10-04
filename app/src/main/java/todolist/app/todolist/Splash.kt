package todolist.app.todolist

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
import kotlinx.android.synthetic.main.activity_splash.*
import android.widget.Toast
import org.junit.experimental.results.ResultMatchers.isSuccessful
import com.google.android.gms.tasks.Task
import android.support.annotation.NonNull
import com.google.android.gms.tasks.OnCompleteListener




class Splash : AppCompatActivity() {

    val mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance()
    val configSettings = FirebaseRemoteConfigSettings.Builder()
            .setDeveloperModeEnabled(BuildConfig.DEBUG)
            .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT



        val mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance()
        val configSettings = FirebaseRemoteConfigSettings.Builder()
                .setDeveloperModeEnabled(BuildConfig.DEBUG)
                .build()
        mFirebaseRemoteConfig.setConfigSettings(configSettings)
        mFirebaseRemoteConfig.setDefaults(R.xml.dafault_config)

        mFirebaseRemoteConfig.fetch()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this@Splash, "Fetch Succeeded",
                                Toast.LENGTH_SHORT).show()

                        // After config data is successfully fetched, it must be activated before newly fetched
                        // values are returned.
                        mFirebaseRemoteConfig.activateFetched()
                    } else {
                        Toast.makeText(this@Splash, "Fetch Failed",
                                Toast.LENGTH_SHORT).show()
                    }
                    displayWelcomeMessage()
                }

        todo_list_btn.setOnClickListener {
            val nextIntent = Intent(this, Main::class.java)
            startActivity(nextIntent)
        }

        todo_add_btn.setOnClickListener {
            val nextIntent = Intent(this, AddSch::class.java)
            startActivity(nextIntent)
        }
    }

    private fun displayWelcomeMessage() {
        val welcomeMessage = mFirebaseRemoteConfig.getString(WELCOME_MESSAGE_KEY)
        if (mFirebaseRemoteConfig.getBoolean(WELCOME_MESSAGE_CAPS_KEY)) {
            firebase_coment.setAllCaps(true)
        } else {
            firebase_coment.setAllCaps(false)
        }
        firebase_coment.setText(welcomeMessage)
    }


}
