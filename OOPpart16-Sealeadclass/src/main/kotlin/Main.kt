import java.lang.Exception

fun main(args: Array<String>) {
    //Sealed Class

    val success = Result.Success("Success")
    val progress = Result.Progress("PROGRESS")
    getData(success)
    getData(progress)
}

fun getData(result: Result) {
    when (result) {
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
    }
}

sealed class Result(val message: String) {
    fun showMessage() {
        println("Result: $message")
    }

    class Success(message: String) : Result(message)
    sealed class Error(message: String) : Result(message) {
        class RecoverableError(exception: Exception, message: String) : Error(message)
        class NonRecoverableError(exception: Exception, message: String) : Error(message)
    }

    class Progress(message: String) : Result(message)
}

