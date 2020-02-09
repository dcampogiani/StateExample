package com.danielecampogiani.state.utils

@Suppress("ClassName")
object exhaustive {

    @JvmStatic
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun <T> rangeTo(whenBlock: T): T = whenBlock
}