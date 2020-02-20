package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey

open class Workout(
    var name: String,
    var exerciseList: ArrayList<Exercise> = ArrayList()) {}