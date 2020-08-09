package com.hoony.dagger2simpleexample3.chaper5

import dagger.Module
import dagger.Provides

@Module
open class Bag {
    @Provides
    @Choose(Choose.Name.LOVE)
    open fun sayLoveDagger2(): Info = Info("Love Dagger2")

    @Provides
    @Choose(Choose.Name.HELLO)
    open fun sayHelloDagger2(): Info = Info("Hello Dagger2")
}