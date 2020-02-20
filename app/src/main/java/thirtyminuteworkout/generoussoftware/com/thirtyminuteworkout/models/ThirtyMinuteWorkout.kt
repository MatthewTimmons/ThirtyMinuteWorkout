package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


class ThirtyMinuteWorkout: Workout(
        "Thirty Minute Workout",
        ArrayList()
) {

    init {
        exerciseList = getDefaultExercises()
    }

    private fun getDefaultExercises(): ArrayList<Exercise> {
        val currentTime = System.currentTimeMillis()/1000
        val allDefaultExercises = ArrayList<Exercise>()
        allDefaultExercises.add(Exercise("Chest press",null, 1, null))
        allDefaultExercises.add(Exercise("Chest press",null, 3, null))
        allDefaultExercises.add(Exercise("Chest press",null, 5, null))
        allDefaultExercises.add(Exercise("Chest press",null, 7, null))
        allDefaultExercises.add(Exercise("Chest press",null, 9, null))
        allDefaultExercises.add(Exercise("Chest press",null, 11, null))
        allDefaultExercises.add(Exercise("Chest press",null, 13, null))
        allDefaultExercises.add(Exercise("Chest press",null, 15, null))
        allDefaultExercises.add(Exercise("Chest press",null, 17, null))
        allDefaultExercises.add(Exercise("Chest press",null, 19, null))
        return allDefaultExercises
    }
}