package com.hoony.dagger2simpleexample3.chapter6

data class Resource<out T> constructor(
    val state: ResourceState,
    val data: T? = null,
    val message: String? = null
)