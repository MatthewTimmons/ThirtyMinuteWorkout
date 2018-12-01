package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.Exercise
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.ExerciseSession
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.ThirtyMinuteWorkout
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.WorkoutSession

class AppViewModel(application: Application): AndroidViewModel(application) {
    var appRepository = AppRepository(application)
    var allExerciseSessions = appRepository.allExerciseSessions
    var currentExerciseSessionList = ThirtyMinuteWorkout().exerciseList

    fun insert(exerciseSession: ExerciseSession) {
        appRepository.insert(exerciseSession)
    }

    fun insert(workoutSession: WorkoutSession) {
        appRepository.insert(workoutSession)
    }

    fun fetchAllExerciseSessions(): LiveData<List<ExerciseSession>> {
        return allExerciseSessions
    }

    fun saveCurrentWorkout() {
        appRepository.insert(currentExerciseSessionList)
    }
}