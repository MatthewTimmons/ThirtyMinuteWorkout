package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.ArrayList

class ThirtyMinuteWorkout(
        val name: String = "Thirty Minute Workout",
        var exerciseList: ArrayList<Exercise> = ArrayList()
) {

    init {
        exerciseList = getDefaultExercises()
    }

    fun getDefaultExercises(): ArrayList<Exercise> {
        val allDefaultExercises = ArrayList<Exercise>()
        allDefaultExercises.add(Exercise(name = "Chest press", machineNumber = 1))
        allDefaultExercises.add(Exercise(name = "Chest press", machineNumber = 3))
        allDefaultExercises.add(Exercise(name = "Chest press", machineNumber = 5))
        allDefaultExercises.add(Exercise(name = "Chest press", machineNumber = 7))
        allDefaultExercises.add(Exercise(name = "Chest press", machineNumber = 9))
        allDefaultExercises.add(Exercise(name = "Chest press", machineNumber = 11))
        allDefaultExercises.add(Exercise(name = "Chest press", machineNumber = 13))
        allDefaultExercises.add(Exercise(name = "Chest press", machineNumber = 15))
        allDefaultExercises.add(Exercise(name = "Chest press", machineNumber = 17))
        allDefaultExercises.add(Exercise(name = "Chest press", machineNumber = 19))
        return allDefaultExercises
    }
}