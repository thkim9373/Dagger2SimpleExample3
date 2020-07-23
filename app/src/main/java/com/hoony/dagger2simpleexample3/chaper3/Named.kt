package com.hoony.dagger2simpleexample3.chaper3

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Named(val value: Name = Name.LOVE) {
    enum class Name {
        LOVE, HELLO
    }
}