package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.adapters

import android.support.annotation.NonNull
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_perform_workout.view.*
import kotlinx.android.synthetic.main.item_exercise.view.*
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.R
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.Exercise

class ExercisesRecyclerViewAdapter(var exercises:List<Exercise>, var workoutTypeFlag:String):
        RecyclerView.Adapter<ExercisesRecyclerViewAdapter.ExerciseViewHolder>() {

    companion object {
        val THIRTY_MINUTE_WORKOUT_FLAG = "THIRTY_MINUTE_WORKOUT_FLAG"
        val CUSTOM_WORKOUT_FLAG  = "CUSTOM_WORKOUT_FLAG"
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, parent: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_exercise, viewGroup, false)
        return ExerciseViewHolder(view)
    }

    override fun getItemCount(): Int {
        return exercises.size
    }

    override fun onBindViewHolder(exerciseViewHolder: ExerciseViewHolder, i: Int) {
        //TODO Bind view holder

        val currentExercise = exercises.get(i);

        // Set universal views
        exerciseViewHolder.machineNumberTextView.text = currentExercise.machineNumber.toString()
        exerciseViewHolder.machineNameTextView.text = currentExercise.name

        //TODO Set weight views
        exerciseViewHolder.lastWeightTextView.text = currentExercise.weight.toString()
        exerciseViewHolder.currentWeightTextView.text = currentExercise.weight.toString()

        // TODO Set workout-specific views
        if (workoutTypeFlag == CUSTOM_WORKOUT_FLAG) {

//            setNumberOfRepsViews(exerciseViewHolder, currentExercise);
        } else if (workoutTypeFlag == THIRTY_MINUTE_WORKOUT_FLAG) {
            exerciseViewHolder.lastRepsTextView.visibility = View.GONE
//            setRepsToInvisible(exerciseViewHolder, currentExercise);
        }
    }



    class ExerciseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var machineNumberTextView = itemView.machine_number_text_view
        var machineNameTextView = itemView.machine_name_text_view
        var lastWeightTextView = itemView.last_weight_text_view
        var lastRepsTextView = itemView.last_number_of_reps_text_view
        var currentWeightTextView = itemView.current_weight_text_view
        var currentRepsTextView = itemView.current_reps_text_view
        var columnTitleHighestReps = itemView.column_title_highest_reps
        var subtractFivePoundsButton = itemView.subtract_five_pounds
        var subtractOnePoundButton = itemView.subtract_one_pound
        var addFivePoundsButton = itemView.add_five_pounds
        var addOnePoundButton = itemView.add_one_pound
        var subtractFiveRepsButton = itemView.subtract_five_reps
        var subtractOneRepButton = itemView.subtract_one_rep
        var addOneRepButton = itemView.add_one_rep
        var addFiveRepsButton = itemView.add_five_reps
        var repsLinearLayout = itemView.current_reps_constraint_layout
    }
}