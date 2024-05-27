package com.example.demo.datasource.mock

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()
    @Test
    fun `should provide a collection of banks`(){

        //when
        val banks = mockDataSource.retrieveBanks()

        //then
        Assertions.assertThat(banks).isNotEmpty()
        Assertions.assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`(){

        //when
        val banks = mockDataSource.retrieveBanks()

        //then
        Assertions.assertThat(banks).allMatch(){it.accountNumber.isNotBlank()}
        Assertions.assertThat(banks).anyMatch(){it.trust != 0.0}
        Assertions.assertThat(banks).anyMatch(){it.transactionFee != 0}
    }
}