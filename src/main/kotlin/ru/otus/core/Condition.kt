package ru.otus.core

import kotlin.reflect.full.primaryConstructor

abstract class Condition : ICommand<Boolean> {

    abstract val code: String
    abstract val expectedValue: Any?

    var next: Condition? = null

    abstract override fun execute(args: Map<String, Any>): Boolean

    fun getInstance(expectedValue: Any): Condition {
        val constructor = this::class.primaryConstructor
            ?: throw NoArgPrimaryConstructorException(className = this::class.simpleName)
        return constructor.call(expectedValue)
    }

}
