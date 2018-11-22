package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.R

class SelectWorkoutActivity: AppCompatActivity() {
    lateinit var manualWorkoutButton: Button
    lateinit var timedWorkoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_workout)

        // Set views
        manualWorkoutButton = findViewById(R.id.manual_workout_button)
        timedWorkoutButton = findViewById(R.id.timed_workout_button)

        // TODO Add manual workout later.
        manualWorkoutButton.setOnClickListener {
            Toast.makeText(this@SelectWorkoutActivity, "This feature will be added later.", Toast.LENGTH_SHORT).show()
        }

        //TODO Add timed workout later.
        timedWorkoutButton.setOnClickListener {
            Toast.makeText(this@SelectWorkoutActivity, "This feature will be added later.", Toast.LENGTH_SHORT).show()
        }
    }
}