package com.hoony.dagger2simpleexample3

import com.hoony.dagger2simpleexample3.chaper4.Bag
import com.hoony.dagger2simpleexample3.chaper4.MagicBox
import dagger.Component

@Component(modules = [Bag::class])
interface TestMagicBox : MagicBox {
    fun poke(app: TestMainActivity)
}