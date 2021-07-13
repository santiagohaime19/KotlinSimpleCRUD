package com.james.simpleCRUD.simpleCRUD.feature.bank.interactor

import com.james.simpleCRUD.simpleCRUD.components.bank.BankDataSourceGateway
import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AddSingleBankImpl(
    private val bankDataSourceGateway: BankDataSourceGateway
): AddSingleBank {
    override fun execute(bank: Bank): List<Bank> {
        return bankDataSourceGateway.addSingleBank(bank)
    }

}