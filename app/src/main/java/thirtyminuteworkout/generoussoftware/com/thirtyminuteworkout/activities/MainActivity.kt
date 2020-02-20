package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.R

class MainActivity : AppCompatActivity() {
    lateinit var thirtyMinuteWorkoutButton: Button
    lateinit var customWorkoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set views
        thirtyMinuteWorkoutButton = findViewById(R.id.thirty_minute_workout_button)
        customWorkoutButton = findViewById(R.id.custom_workout_button)

        thirtyMinuteWorkoutButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectWorkoutActivity::class.java)
            startActivity(intent)
        }

        // TODO Set up custom workout options
        customWorkoutButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "This feature will be added later.", Toast.LENGTH_SHORT).show()
        }
    }
}
