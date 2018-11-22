package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.R
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.adapters.ExercisesRecyclerViewAdapter
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.adapters.ExercisesRecyclerViewAdapter.Companion.THIRTY_MINUTE_WORKOUT_FLAG
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.Exercise
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.ThirtyMinuteWorkout

class PerformWorkoutActivity: AppCompatActivity() {
    lateinit var columnPreviousWeight: TextView
    lateinit var columnPreviousReps:TextView
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perform_workout)

        // TODO Replace temporary mock call with retrieval from viewmodel
        // Create instance of 30 minute workout
        val thirtyMinuteWorkout = ThirtyMinuteWorkout()

        // TODO Replace temporary mock data with actual data
        // Set each exercise to a random number of weight between 20 and 45
        val exercises = thirtyMinuteWorkout.exerciseList
        val results = ArrayList<Exercise>()
        exercises.forEach {
            it.numberOfReps = (6 + (Math.random() * 5).toInt());
            it.weight = (20 + (((Math.random() * 5))) * 5).toInt();
            results.add(it);
        }

        // Set views
        columnPreviousWeight = findViewById(R.id.column_title_highest_weight);
        columnPreviousReps = findViewById(R.id.column_title_highest_reps);
        recyclerView = findViewById(R.id.exercies_recycler_view);

        // Set view properties
        thirtyMinuteWorkout.exerciseList = exercises
        columnPreviousReps.visibility = View.GONE

        val adapter = ExercisesRecyclerViewAdapter(results, THIRTY_MINUTE_WORKOUT_FLAG);
        recyclerView.adapter = adapter
    }
}