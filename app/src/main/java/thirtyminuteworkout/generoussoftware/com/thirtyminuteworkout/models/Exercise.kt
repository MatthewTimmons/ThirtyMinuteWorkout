package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

data class Exercise(
        var name: String,
        var weight: Int = 0,
//        var numberOfReps: Int = 0,
//        var numberOfSets: Int = 0,
        var machineNumber: Int = 0,
        var notes: String = "") {
}