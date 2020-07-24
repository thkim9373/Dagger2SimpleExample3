package com.hoony.dagger2simpleexample3.chaper4

import dagger.Component

@Component(modules = [Bag::class])
interface MagicBox {
    fun poke(app: Chapter4Activity)
}