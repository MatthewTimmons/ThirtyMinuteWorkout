package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.ArrayList

class ThirtyMinuteWorkout(
        val name: String = "Thirty Minute Workout",
        var exerciseList: List<ExerciseSession> = ArrayList()
) {

    init {
        exerciseList = getDefaultExercises()
    }

    fun getDefaultExercises(): List<ExerciseSession> {
        val currentTime = System.currentTimeMillis()/1000
        val allDefaultExercises = ArrayList<ExerciseSession>()
        allDefaultExercises.add(ExerciseSession(null, currentTime, "Chest press", 1))
        allDefaultExercises.add(ExerciseSession(null, currentTime, "Chest press", 3))
        allDefaultExercises.add(ExerciseSession(null, currentTime, "Chest press", 5))
        allDefaultExercises.add(ExerciseSession(null, currentTime, "Chest press", 7))
        allDefaultExercises.add(ExerciseSession(null, currentTime, "Chest press", 9))
        allDefaultExercises.add(ExerciseSession(null, currentTime, "Chest press", 11))
        allDefaultExercises.add(ExerciseSession(null, currentTime, "Chest press", 13))
        allDefaultExercises.add(ExerciseSession(null, currentTime, "Chest press", 15))
        allDefaultExercises.add(ExerciseSession(null, currentTime, "Chest press", 17))
        allDefaultExercises.add(ExerciseSession(null, currentTime, "Chest press", 19))
        return allDefaultExercises
    }
}