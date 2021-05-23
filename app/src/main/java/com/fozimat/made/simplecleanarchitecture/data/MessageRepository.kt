package com.fozimat.made.simplecleanarchitecture.data

import com.fozimat.made.simplecleanarchitecture.domain.IMessageRepository
import com.fozimat.made.simplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)

}