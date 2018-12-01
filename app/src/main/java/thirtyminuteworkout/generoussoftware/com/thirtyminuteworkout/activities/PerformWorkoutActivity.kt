package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.activities

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.R
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.AppViewModel
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.adapters.ExercisesRecyclerViewAdapter
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.Exercise
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.ThirtyMinuteWorkout

class PerformWorkoutActivity : AppCompatActivity() {
    lateinit var columnPreviousWeight: TextView
    lateinit var columnPreviousReps: TextView
    lateinit var recyclerView: RecyclerView
    lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perform_workout)

        // Create instance of 30 minute workout
        var viewModel = ViewModelProviders.of(this).get(AppViewModel::class.java)

        // Set views
        columnPreviousWeight = findViewById(R.id.column_title_highest_weight);
        columnPreviousReps = findViewById(R.id.column_title_highest_reps);
        recyclerView = findViewById(R.id.exercies_recycler_view);
        saveButton = findViewById(R.id.save_button)

        // Set view properties
        columnPreviousReps.visibility = View.GONE

        saveButton.setOnClickListener {
            finish()
            viewModel.saveCurrentWorkout()
        }

        // Set adapter exercises
        viewModel.fetchAllExerciseSessions().observe(this, Observer {
            if (it!= null && !it.isEmpty()) {
                val currentTime = System.currentTimeMillis()/1000
                val currentListOfExerciseSessions = it
                currentListOfExerciseSessions.forEach {
                    it.dateTimeInEpoch = currentTime
                    it.id = null
                }
                viewModel.currentExerciseSessionList = currentListOfExerciseSessions
            }
            val adapter = ExercisesRecyclerViewAdapter(viewModel.currentExerciseSessionList)
            recyclerView.adapter = adapter
        })
    }
}