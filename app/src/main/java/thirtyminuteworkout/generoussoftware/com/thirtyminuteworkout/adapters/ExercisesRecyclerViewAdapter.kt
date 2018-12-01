package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_perform_workout.view.*
import kotlinx.android.synthetic.main.item_exercise.view.*
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.R
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.Exercise

val buttonValues = arrayOf(-5, -1, 1, 5)

class ExercisesRecyclerViewAdapter(var exercises:List<Exercise>, val customWorkoutFlag:Boolean = false):
        RecyclerView.Adapter<ExercisesRecyclerViewAdapter.ExerciseViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, parent: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_exercise, viewGroup, false)
        return ExerciseViewHolder(view)
    }

    override fun getItemCount(): Int {
        return exercises.size
    }

    override fun onBindViewHolder(exerciseViewHolder: ExerciseViewHolder, i: Int) {

        val currentExercise = exercises.get(i);

        // Set notes view if applicable
        if (!currentExercise.notes.equals("")) {
            exerciseViewHolder.notesTextView.visibility = View.VISIBLE
            exerciseViewHolder.notesTextView.text = currentExercise.notes
        }

        // Set universal views
        exerciseViewHolder.machineNumberTextView.text = currentExercise.machineNumber.toString()
        exerciseViewHolder.machineNameTextView.text = currentExercise.name

        // Set weight views
        exerciseViewHolder.lastWeightTextView.text = currentExercise.weight.toString()
        exerciseViewHolder.currentWeightTextView.text = currentExercise.weight.toString()

        if (customWorkoutFlag) {
            // TODO Set number of reps views

        } else {
            exerciseViewHolder.lastRepsTextView.visibility = View.GONE
            exerciseViewHolder.repsLinearLayout.visibility = View.GONE

        }

        // Set click listeners
        for (i in 0..3) {
            exerciseViewHolder.poundButtons.get(i).setOnClickListener {
                val newWeightValue = currentExercise.weight + buttonValues.get(i)
                currentExercise.weight = if (newWeightValue >= 0) newWeightValue else 0

                // TODO Update UI through attaching the viewmodel instead of manually calling the update.
                exerciseViewHolder.currentWeightTextView.text = currentExercise.weight.toString()
            }

            if (customWorkoutFlag) {
//                exerciseViewHolder.repsbuttons.get(i).setOnClickListener {
//                    val newRepsValue = currentExercise.numberOfReps + buttonValues.get(i)
//                    currentExercise.numberOfReps = if (newRepsValue >= 0) newRepsValue else 0
//
//                    // TODO Update UI through attaching the viewmodel instead of manually calling the update.
//                    exerciseViewHolder.currentRepsTextView.text = currentExercise.numberOfReps.toString()
//                }
            }
        }
    }

    inner class ExerciseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var machineNumberTextView = itemView.machine_number_text_view
        var machineNameTextView = itemView.machine_name_text_view
        var lastWeightTextView = itemView.last_weight_text_view
        var lastRepsTextView = itemView.last_number_of_reps_text_view
        var notesTextView = itemView.notes_text_view
        var currentWeightTextView = itemView.current_weight_text_view
        var currentRepsTextView = itemView.current_reps_text_view
        var subtractFivePoundsButton = itemView.subtract_five_pounds
        var subtractOnePoundButton = itemView.subtract_one_pound
        var addFivePoundsButton = itemView.add_five_pounds
        var addOnePoundButton = itemView.add_one_pound
        var subtractFiveRepsButton = itemView.subtract_five_reps
        var subtractOneRepButton = itemView.subtract_one_rep
        var addOneRepButton = itemView.add_one_rep
        var addFiveRepsButton = itemView.add_five_reps
        var repsLinearLayout = itemView.current_reps_constraint_layout

        val poundButtons = arrayOf(subtractFivePoundsButton, subtractOnePoundButton, addOnePoundButton, addFivePoundsButton)
        val repsbuttons = arrayOf(subtractFiveRepsButton, subtractOneRepButton, addOneRepButton, addFiveRepsButton)
    }
}