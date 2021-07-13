package com.james.simpleCRUD.simpleCRUD.feature.bank.interactor

import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank

interface GetSingleBank {
    fun execute(accountNumber: String): Bank
}