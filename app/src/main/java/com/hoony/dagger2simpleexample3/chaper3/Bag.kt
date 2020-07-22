package com.hoony.dagger2simpleexample3.chaper3

import dagger.Module
import dagger.Provides

@Module
class Bag {
    @Provides @Named("Love")
    fun sayLoveDagger2(): Info = Info("Love Dagger2")

    @Provides @Named("Hello")
    fun sayHelloDagger2(): Info = Info("Hello Dagger2")
}