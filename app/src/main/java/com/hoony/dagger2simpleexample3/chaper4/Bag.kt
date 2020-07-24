package com.hoony.dagger2simpleexample3.chaper4

import dagger.Module
import dagger.Provides

@Module
class Bag {
    @Provides
    @Choose(Choose.Name.LOVE)
    fun sayLoveDagger2(): Info = Info("Love Dagger2")

    @Provides
    @Choose(Choose.Name.HELLO)
    fun sayHelloDagger2(): Info = Info("Hello Dagger2")
}