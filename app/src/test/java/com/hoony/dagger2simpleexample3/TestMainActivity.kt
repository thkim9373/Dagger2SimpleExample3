package com.hoony.dagger2simpleexample3

import com.hoony.dagger2simpleexample3.chaper4.*
import dagger.Component
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import javax.inject.Inject

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TestMainActivity {

    @Inject
    @field:Choose(Choose.Name.LOVE)
    lateinit var infoLove: Info

    @Inject
    @field:Choose(Choose.Name.HELLO)
    lateinit var infoHello: Info

    @Before
    fun setup() {
        DaggerTestMagicBox.builder().bag(TestBag()).build().poke(this)
    }

    @Test
    fun simpleTest() {
        assertEquals("Test Love", infoLove.text)
        assertEquals("Hello Dagger 2", infoHello.text)
    }
}

class TestBag : Bag() {
    override fun sayLoveDagger2(): Info = Info("Test Love")
}

@Component(modules = [Bag::class])
interface TestMagicBox : MagicBox {
    fun poke(app: TestMainActivity)
}