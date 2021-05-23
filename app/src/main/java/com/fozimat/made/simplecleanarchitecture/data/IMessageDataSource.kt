package com.fozimat.made.simplecleanarchitecture.data

import com.fozimat.made.simplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}