package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

import java.util.ArrayList

class ThirtyMinuteWorkout : Workout() {

    init {
        name = "Thirty Minute Workout"
        exerciseList = getDefaultExercises()
    }

    fun getDefaultExercises(): ArrayList<Exercise> {
        val allDefaultExercises = ArrayList<Exercise>()
        allDefaultExercises.add(Exercise("Chest press", 1))
        allDefaultExercises.add(Exercise("Chest press", 3))
        allDefaultExercises.add(Exercise("Chest press", 5))
        allDefaultExercises.add(Exercise("Chest press", 7))
        allDefaultExercises.add(Exercise("Chest press", 9))
        allDefaultExercises.add(Exercise("Chest press", 11))
        allDefaultExercises.add(Exercise("Chest press", 13))
        allDefaultExercises.add(Exercise("Chest press", 15))
        allDefaultExercises.add(Exercise("Chest press", 17))
        allDefaultExercises.add(Exercise("Chest press", 19))
        return allDefaultExercises
    }
}