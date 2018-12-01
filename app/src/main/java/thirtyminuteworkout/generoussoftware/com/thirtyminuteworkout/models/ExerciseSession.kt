package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class ExerciseSession(
        @PrimaryKey(autoGenerate = true)
        var id: Int?,
        var dateTimeInEpoch: Long, // Should be equal to the parent workoutSession
        val name: String,
        var weight: Int = 0,
        var notes: String = ""
        // var reps: Int,     || Maybe add reps for custom workouts?



) {}