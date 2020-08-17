package com.hoony.dagger2simpleexample3.chapter4

import javax.inject.Inject
import javax.inject.Scope

@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class MagicScope

var staticCounter: Int = 0

@MagicScope
class UniqueMagic @Inject constructor() {
    val counter = staticCounter++
}

class NormalMagic @Inject constructor() {
    val counter = staticCounter++
}