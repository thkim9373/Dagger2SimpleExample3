package com.hoony.dagger2simpleexample3.chapter4

import dagger.Component

@MagicScope
@Component
interface MagicBox {
    fun poke(storage: Storage)
}