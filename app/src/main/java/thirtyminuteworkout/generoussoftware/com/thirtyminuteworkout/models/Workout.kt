package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
open class Workout(
        @PrimaryKey var name: String,
        var exerciseList: ArrayList<Exercise> = ArrayList()) {

}