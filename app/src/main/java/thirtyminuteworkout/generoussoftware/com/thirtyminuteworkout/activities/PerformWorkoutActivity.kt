package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.activities

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.R
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.WorkoutViewModel
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.adapters.ExercisesRecyclerViewAdapter
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.Exercise
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.ThirtyMinuteWorkout

class PerformWorkoutActivity : AppCompatActivity() {
    lateinit var columnPreviousWeight: TextView
    lateinit var columnPreviousReps: TextView
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perform_workout)

        // Create instance of 30 minute workout
        var viewModel = ViewModelProviders.of(this).get(WorkoutViewModel::class.java)
        val thirtyMinuteWorkout = viewModel.thirtyMinuteWorkout


        // Set views
        columnPreviousWeight = findViewById(R.id.column_title_highest_weight);
        columnPreviousReps = findViewById(R.id.column_title_highest_reps);
        recyclerView = findViewById(R.id.exercies_recycler_view);

        // Set view properties
        columnPreviousReps.visibility = View.GONE

        val adapter = ExercisesRecyclerViewAdapter(thirtyMinuteWorkout.exerciseList)
        recyclerView.adapter = adapter
    }
}