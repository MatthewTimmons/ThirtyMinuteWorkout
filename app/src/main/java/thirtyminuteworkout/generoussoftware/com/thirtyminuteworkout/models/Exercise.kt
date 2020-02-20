package thirtyminuteworkout.generoussoftware.com.thirtyminuteworkout.models

data class Exercise(
        var name: String,
        var weight: Int? = 0,
//        var numberOfReps: Int = 0,
//        var numberOfSets: Int = 0,
        var machineNumber: Int?,
        var notes: String? = "") {
}