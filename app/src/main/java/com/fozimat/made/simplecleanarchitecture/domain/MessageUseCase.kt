package com.fozimat.made.simplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}