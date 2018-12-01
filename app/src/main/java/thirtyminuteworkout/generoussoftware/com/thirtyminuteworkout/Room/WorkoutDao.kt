package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.Room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.Exercise
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.ExerciseSession
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.Workout
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.WorkoutSession

@Dao
interface WorkoutDao {

    @Insert()
    fun insert(exerciseSession: ExerciseSession)

    @Insert()
    fun insert(workoutSession: WorkoutSession)

    /*@Query("SELECT * from Exercise")
    fun getAllExercisesFor(workout: Workout): List<Exercise>

    @Insert()
    fun insert(exercise: Exercise)

    @Query("DELETE from Exercise")
    fun deleteAllExercises()

    @Query("SELECT * from Workout")
    fun getAllWorkouts(): List<Workout>

    @Insert()
    fun insert(workout: Workout)

    @Query("DELETE from Workout")
    fun deleteAllWorkouts()*/
}