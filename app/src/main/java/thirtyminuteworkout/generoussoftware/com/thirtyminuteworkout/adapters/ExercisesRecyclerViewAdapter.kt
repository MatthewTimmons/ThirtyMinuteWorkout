package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.adapters

import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.R
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.Exercise

class ExercisesRecyclerViewAdapter(var exercises:List<Exercise>, var workoutTypeFlag:Int):
        RecyclerView.Adapter<ExercisesRecyclerViewAdapter.ExerciseViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, parent: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_exercise, viewGroup, false)
        return ExerciseViewHolder(view)
    }

    override fun getItemCount(): Int {
        return exercises.size
    }

    override fun onBindViewHolder(exerciseViewHolder: ExerciseViewHolder, i: Int) {
        //TODO Bind view holder
    }

    inner class ExerciseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var machineNumberTextView: TextView
        var machineNameTextView: TextView
        var lastWeightTextView: TextView
        var lastRepsTextView: TextView
        var currentWeightTextView: TextView
        var currentRepsTextView: TextView
        var columnTitleHighestReps: TextView
        var subtractFivePoundsButton: Button
        var subtractOnePoundButton: Button
        var addFivePoundsButton: Button
        var addOnePoundButton: Button
        var subtractFiveRepsButton: Button
        var subtractOneRepButton: Button
        var addOneRepButton: Button
        var addFiveRepsButton: Button
        var repsLinearLayout: ConstraintLayout
        init{
            machineNumberTextView = itemView.findViewById(R.id.machine_number_text_view)
            machineNameTextView = itemView.findViewById(R.id.machine_name_text_view)
            lastWeightTextView = itemView.findViewById(R.id.last_weight_text_view)
            columnTitleHighestReps = itemView.findViewById(R.id.column_title_highest_reps)
            lastRepsTextView = itemView.findViewById(R.id.last_number_of_reps_text_view)
            currentWeightTextView = itemView.findViewById(R.id.current_weight_text_view)
            currentRepsTextView = itemView.findViewById(R.id.current_reps_text_view)
            subtractFivePoundsButton = itemView.findViewById(R.id.subtract_five_pounds)
            subtractOnePoundButton = itemView.findViewById(R.id.subtract_one_pound)
            addFivePoundsButton = itemView.findViewById(R.id.add_five_pounds)
            addOnePoundButton = itemView.findViewById(R.id.add_one_pound)
            subtractFiveRepsButton = itemView.findViewById(R.id.subtract_five_reps)
            subtractOneRepButton = itemView.findViewById(R.id.subtract_one_rep)
            addOneRepButton = itemView.findViewById(R.id.add_one_rep)
            addFiveRepsButton = itemView.findViewById(R.id.add_five_reps)
            repsLinearLayout = itemView.findViewById(R.id.current_reps_constraint_layout)
        }
    }
}