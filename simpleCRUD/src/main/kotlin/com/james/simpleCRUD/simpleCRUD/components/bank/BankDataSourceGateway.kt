package com.james.simpleCRUD.simpleCRUD.components.bank

import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank

interface BankDataSourceGateway {
    fun getBanks(): Collection<Bank>

    fun getSingleBank(accountNumber: String): Bank

    fun addSingleBank(bank: Bank): List<Bank>

    fun updateSingleBank(bank: Bank): Bank

    fun deleteSingleBank(accountNumber: String): List<Bank>
}