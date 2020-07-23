package com.hoony.dagger2simpleexample3.chaper3

import dagger.Module
import dagger.Provides

@Module
class Bag {
    @Provides
    @Named(Named.Name.LOVE)
    fun sayLoveDagger2(): Info = Info("Love Dagger2")

    @Provides
    @Named(Named.Name.HELLO)
    fun sayHelloDagger2(): Info = Info("Hello Dagger2")
}