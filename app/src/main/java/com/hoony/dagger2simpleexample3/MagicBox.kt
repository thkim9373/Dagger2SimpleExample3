package com.hoony.dagger2simpleexample3

import dagger.Component

@Component(modules = [Bag::class])
interface MagicBox {
    fun poke(app: MainActivity)
}