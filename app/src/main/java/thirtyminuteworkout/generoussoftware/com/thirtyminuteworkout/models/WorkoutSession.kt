package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class WorkoutSession(
        @PrimaryKey
        var dateTimeInEpoch: Long = System.currentTimeMillis(),
        var name: String,
        var progress: Boolean = false
        // var notes: String      ||    Maybe add notes section?
) {
}