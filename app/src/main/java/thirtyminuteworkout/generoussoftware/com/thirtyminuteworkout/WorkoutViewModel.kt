package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout

import android.arch.lifecycle.ViewModel
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.Exercise
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.ThirtyMinuteWorkout

class WorkoutViewModel: ViewModel() {

    // TODO Replace temporary mock call with retrieval from Room database
    var thirtyMinuteWorkout = ThirtyMinuteWorkout()

    init {

        // TODO Replace temporary mock data with actual data
        // Set each exercise to a random number of weight between 20 and 45
        val exercises = thirtyMinuteWorkout.exerciseList
        exercises.forEach {
            it.numberOfReps = (6 + (Math.random() * 5).toInt());
            it.weight = (20 + (((Math.random() * 5))) * 5).toInt();
        }

        thirtyMinuteWorkout.exerciseList = exercises
    }
}