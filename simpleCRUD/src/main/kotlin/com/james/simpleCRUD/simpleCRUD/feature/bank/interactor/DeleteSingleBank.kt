package com.james.simpleCRUD.simpleCRUD.feature.bank.interactor

import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank

interface DeleteSingleBank {
    fun execute(accountNumber: String): List<Bank>
}