package com.gtera.gteratask

suspend fun <T> safe(call: suspend () -> T): Result<T> {
    return try {
        Success(call())
    } catch (e: Throwable) {
        val newThrowable=Throwable(e.message+" "+call.javaClass.name)
        ErrorResult(newThrowable)
    }

}