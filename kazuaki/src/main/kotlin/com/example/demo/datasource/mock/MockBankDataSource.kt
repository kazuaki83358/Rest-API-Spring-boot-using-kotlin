package com.example.demo.datasource.mock

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("123",3.14,1),
        Bank("1453",4.14,17),
        Bank("1783",6.14,0),
        Bank("12463",0.0,100))
    override fun retrieveBanks(): Collection<Bank> = banks

}