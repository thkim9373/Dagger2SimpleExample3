package com.hoony.dagger2simpleexample3.chapter5

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface SingletonBox {
    fun getMagicBox(): MagicBox
}