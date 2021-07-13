package com.james.simpleCRUD.simpleCRUD.feature.bank.interactor

import com.james.simpleCRUD.simpleCRUD.components.bank.BankDataSourceGateway
import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DeleteSingleBankImpl(
    val bankDataSourceGateway: BankDataSourceGateway
): DeleteSingleBank {
    override fun execute(accountNumber: String): List<Bank> {
        return bankDataSourceGateway.deleteSingleBank(accountNumber)
    }

}