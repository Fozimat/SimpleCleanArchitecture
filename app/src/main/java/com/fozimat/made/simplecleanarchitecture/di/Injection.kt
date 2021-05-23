package com.fozimat.made.simplecleanarchitecture.di

import com.fozimat.made.simplecleanarchitecture.data.IMessageDataSource
import com.fozimat.made.simplecleanarchitecture.data.MessageDataSource
import com.fozimat.made.simplecleanarchitecture.data.MessageRepository
import com.fozimat.made.simplecleanarchitecture.domain.IMessageRepository
import com.fozimat.made.simplecleanarchitecture.domain.MessageInteractor
import com.fozimat.made.simplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}