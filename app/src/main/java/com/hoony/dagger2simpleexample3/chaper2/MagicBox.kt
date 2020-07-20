package com.hoony.dagger2simpleexample3.chaper2

import dagger.Component

@Component(modules = [Bag::class])
interface MagicBox {
    fun poke(app: Chapter2Activity)
}