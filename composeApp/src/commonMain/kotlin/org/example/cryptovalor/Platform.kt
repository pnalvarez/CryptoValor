package org.example.cryptovalor

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform