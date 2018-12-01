package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.ExerciseSession
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.ThirtyMinuteWorkout
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.WorkoutSession

class AppViewModel(application: Application): AndroidViewModel(application) {
    var appRepository = AppRepository(application)


    // TODO Replace temporary mock call with retrieval from Room database
    var thirtyMinuteWorkout = ThirtyMinuteWorkout()

    init {

        // TODO Replace temporary mock data with actual data
        // Set each exercise to a random number of weight between 20 and 45
        val exercises = thirtyMinuteWorkout.exerciseList
        exercises.forEach {
//            it.numberOfReps = (6 + (Math.random() * 5).toInt());
            it.weight = (20 + (((Math.random() * 5))) * 5).toInt();
        }

        thirtyMinuteWorkout.exerciseList = exercises
    }

    fun insert(exerciseSession: ExerciseSession) {
        appRepository.insert(exerciseSession)
    }

    fun insert(workoutSession: WorkoutSession) {
        appRepository.insert(workoutSession)
    }
}