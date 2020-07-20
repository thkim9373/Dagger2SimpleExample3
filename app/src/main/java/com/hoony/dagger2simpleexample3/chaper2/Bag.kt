package com.hoony.dagger2simpleexample3.chaper2

import dagger.Module
import dagger.Provides

@Module
class Bag {
    @Provides
    open fun sayLoveDagger2(): Info =
        Info("Love Dagger2")
}