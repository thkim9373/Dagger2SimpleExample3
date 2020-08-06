package com.hoony.dagger2simpleexample3.chaper4

import dagger.Component

@MagicScope
@Component
interface MagicBox {
    fun poke(storage: Storage)
}