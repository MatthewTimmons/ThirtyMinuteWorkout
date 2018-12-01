package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout

import android.app.Application
import android.os.AsyncTask
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.Room.AppDatabase
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.Room.WorkoutDao
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.ExerciseSession
import thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models.WorkoutSession

class AppRepository(application: Application) {

    var database = AppDatabase.getInstance(application)
    var workoutDao = database?.workoutDao()!!
    var allExerciseSessions = workoutDao.fetchAllExerciseSessions()

    fun insert(exerciseSession: ExerciseSession) {
        InsertExerciseAsyncTask(workoutDao).execute(exerciseSession)
    }

    fun insert(workoutSession: WorkoutSession) {
        InsertWorkoutAsyncTask(workoutDao).execute(workoutSession)
    }

    fun insert(exerciseSessions: List<ExerciseSession>) {
        InsertExercisesAsyncTask(workoutDao).execute(exerciseSessions)
    }

    companion object {
        private class InsertExerciseAsyncTask(workoutDao: WorkoutDao) : AsyncTask<ExerciseSession, Void, Void>() {
            private var workoutDao: WorkoutDao = workoutDao

            override fun doInBackground(vararg params: ExerciseSession?): Void? {
                workoutDao.insert(params[0]!!)
                return null
            }
        }

        private class InsertExercisesAsyncTask(workoutDao: WorkoutDao) : AsyncTask<List<ExerciseSession>, Void, Void>() {
            private var workoutDao: WorkoutDao = workoutDao

            override fun doInBackground(vararg params: List<ExerciseSession>?): Void? {
                params[0]!!.forEach {
                    workoutDao.insert(it)
                }
                return null
            }
        }

        private class InsertWorkoutAsyncTask(workoutDao: WorkoutDao) : AsyncTask<WorkoutSession, Void, Void>() {
            private var workoutDao: WorkoutDao = workoutDao

            override fun doInBackground(vararg params: WorkoutSession?): Void? {
                workoutDao.insert(params[0]!!)
                return null
            }
        }
    }
}