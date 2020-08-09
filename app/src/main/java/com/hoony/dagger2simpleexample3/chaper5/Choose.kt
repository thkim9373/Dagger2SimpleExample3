package com.hoony.dagger2simpleexample3.chaper5

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Choose(val value: Name = Name.LOVE) {
    enum class Name {
        LOVE, HELLO
    }
}