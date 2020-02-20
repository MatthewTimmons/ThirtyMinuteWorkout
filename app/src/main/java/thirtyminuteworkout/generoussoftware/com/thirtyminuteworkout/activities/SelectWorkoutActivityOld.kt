package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.R

class SelectWorkoutActivityOld: AppCompatActivity() {
    lateinit var manualWorkoutButton: Button
    lateinit var timedWorkoutButton: Button
    lateinit var editNotesButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_workout)

        // Set views
        manualWorkoutButton = findViewById(R.id.manual_workout_button)
        timedWorkoutButton = findViewById(R.id.timed_workout_button)
        editNotesButton = findViewById(R.id.settings_button)

        // Set click listeners
        manualWorkoutButton.setOnClickListener {
            val intent = Intent(this@SelectWorkoutActivityOld, PerformWorkoutActivity::class.java)
            startActivity(intent)
        }

        //TODO Add timed workout later.
        timedWorkoutButton.setOnClickListener {
            Toast.makeText(this@SelectWorkoutActivityOld, "This feature will be added later.", Toast.LENGTH_SHORT).show()
        }

        //TODO Add edit notes later.
        editNotesButton.setOnClickListener {
            Toast.makeText(this@SelectWorkoutActivityOld, "This feature will be added later.", Toast.LENGTH_SHORT).show()
        }
    }
}