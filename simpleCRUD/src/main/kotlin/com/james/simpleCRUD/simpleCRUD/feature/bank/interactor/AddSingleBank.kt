package com.james.simpleCRUD.simpleCRUD.feature.bank.interactor

import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank

interface AddSingleBank {
    fun execute(bank: Bank): List<Bank>
}