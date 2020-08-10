package com.hoony.dagger2simpleexample3.chaper5

import javax.inject.Inject
import javax.inject.Scope
import javax.inject.Singleton

@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class MagicScope

var staticCounter: Int = 0

@Singleton
class SingletonOne @Inject constructor() {
    val count = staticCounter++
}

@MagicScope
class UniqueMagic @Inject constructor() {
    val count = staticCounter++
}

class NormalMagic @Inject constructor() {
    val count = staticCounter++
}