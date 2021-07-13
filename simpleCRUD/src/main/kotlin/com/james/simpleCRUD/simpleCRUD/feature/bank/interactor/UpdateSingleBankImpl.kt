package com.james.simpleCRUD.simpleCRUD.feature.bank.interactor

import com.james.simpleCRUD.simpleCRUD.components.bank.BankDataSourceGateway
import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UpdateSingleBankImpl (
    private val bankDataSourceGateway: BankDataSourceGateway
): UpdateSingleBank {
    override fun execute(bank: Bank): Bank {
        return bankDataSourceGateway.updateSingleBank(bank)
    }

}