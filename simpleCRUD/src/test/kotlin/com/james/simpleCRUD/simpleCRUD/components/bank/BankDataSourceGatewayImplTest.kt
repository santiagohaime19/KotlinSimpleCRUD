package com.james.simpleCRUD.simpleCRUD.components.bank

import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankDataSourceGatewayImplTest(


){
    private val bankDataSource: BankDataSourceGatewayImpl = BankDataSourceGatewayImpl()

    @Test
    fun `should provide a collection of banks`(){
        val banks: List<Bank> = bankDataSource.getBanks()

        assertThat( banks ).isNotEmpty
    }

    @Test
    fun `should provide some mock data`(){
        val banks: List<Bank> = bankDataSource.getBanks()

        assertThat( banks ).allMatch { bank -> bank.accountNumber.isNotBlank() }

    }
}