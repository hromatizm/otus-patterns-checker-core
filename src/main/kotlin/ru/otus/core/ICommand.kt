package ru.otus.core

interface ICommand<T> {

    fun execute(args: Map<String, Any> = emptyMap()): T
}