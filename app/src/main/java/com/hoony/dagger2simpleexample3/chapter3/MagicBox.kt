package com.hoony.dagger2simpleexample3.chapter3

import dagger.Component

@Component(modules = [Bag::class])
interface MagicBox {
    fun poke(app: Chapter3Activity)
}