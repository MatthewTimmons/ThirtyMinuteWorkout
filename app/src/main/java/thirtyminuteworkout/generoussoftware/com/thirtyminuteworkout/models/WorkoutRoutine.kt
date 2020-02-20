package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

import android.arch.persistence.room.Entity

@Entity
open class WorkoutRoutine(
        var name: String,
        var exerciseList: ArrayList<Exercise> = ArrayList())