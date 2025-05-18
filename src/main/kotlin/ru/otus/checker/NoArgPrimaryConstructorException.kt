package ru.otus.checker

class NoArgPrimaryConstructorException(className: String?) :
    RuntimeException("Class $className must have a primary constructor without parameters")