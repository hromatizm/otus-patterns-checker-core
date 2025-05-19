package ru.otus.core

class NoArgPrimaryConstructorException(className: String?) :
    RuntimeException("Class $className must have a primary constructor without parameters")