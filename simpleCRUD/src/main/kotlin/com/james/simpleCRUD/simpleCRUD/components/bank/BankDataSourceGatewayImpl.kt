package com.james.simpleCRUD.simpleCRUD.components.bank

import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Repository
import org.springframework.web.client.HttpClientErrorException

@Repository
class BankDataSourceGatewayImpl: BankDataSourceGateway {

    val allBanks = mutableListOf(
        Bank(
            accountNumber = "uuid-1",
            trust = "5.2",
            transactionFee = "2"
        ),
        Bank(
            accountNumber = "uuid-2",
            trust = "3.9",
            transactionFee = "2"
        ))

    override fun getBanks(): List<Bank> {
        return this.allBanks
    }

    override fun getSingleBank(accountNumber: String): Bank {
        val index = allBanks.indexOfFirst { it.accountNumber == accountNumber }
        return allBanks[index]
    }

    override fun addSingleBank(bank: Bank): List<Bank> {

        try{
        if(allBanks.any{ it.accountNumber == bank.accountNumber }){
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exist")
        }
        allBanks.add(bank)
        return allBanks}
        catch(e: IllegalArgumentException){
            throw IllegalArgumentException(e.message)
        }
    }

    override fun updateSingleBank(bank: Bank): Bank {
        val  currentBank = allBanks.firstOrNull{ it.accountNumber == bank.accountNumber}
            ?: throw NoSuchElementException("could not find a bank with accountNumber ${bank.accountNumber}")
        println(currentBank)
        allBanks.remove(currentBank)
        allBanks.add(bank)

        return bank
    }

    override fun deleteSingleBank(accountNumber: String): List<Bank> {
        val  toBeDeletedBank = allBanks.firstOrNull{ it.accountNumber == accountNumber}
            ?: throw NoSuchElementException("could not find a bank with accountNumber ${accountNumber}")
        allBanks.remove(toBeDeletedBank)

        return allBanks
    }


}

