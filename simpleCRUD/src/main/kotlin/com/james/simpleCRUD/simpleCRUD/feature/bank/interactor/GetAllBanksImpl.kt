package com.james.simpleCRUD.simpleCRUD.feature.bank.interactor

import com.james.simpleCRUD.simpleCRUD.components.bank.BankDataSourceGateway
import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GetAllBanksImpl (
    private val bankDataSourceGateway: BankDataSourceGateway
)
    : GetAllBanks {
    override fun execute(): Collection<Bank> {
        return bankDataSourceGateway.getBanks()
    }

}