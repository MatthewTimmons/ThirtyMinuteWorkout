package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var thirtyMinuteWorkoutButton: Button
    lateinit var customWorkoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set views
        thirtyMinuteWorkoutButton = findViewById(R.id.thirty_minute_workout_button)
        customWorkoutButton = findViewById(R.id.custom_workout_button)

        // TODO Set up intent to start next activity
        thirtyMinuteWorkoutButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "This feature will be added later.", Toast.LENGTH_SHORT).show()
        })

        // TODO Set up custom workout options
        customWorkoutButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "This feature will be added later.", Toast.LENGTH_SHORT).show()
        })

    }
}
