package com.james.simpleCRUD.simpleCRUD.feature.bank

import com.james.simpleCRUD.simpleCRUD.components.bank.model.Bank
import com.james.simpleCRUD.simpleCRUD.feature.bank.interactor.*
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/banks")
class BankController(
    private val getAllBanks: GetAllBanks,
    private val getSingleBank: GetSingleBank,
    private val addSingleBank: AddSingleBank,
    private val updateSingleBank: UpdateSingleBank,
    private val deleteSingleBank: DeleteSingleBank
) {

    @GetMapping("/all-banks")
    @ResponseStatus(HttpStatus.OK)
    fun getAllBanks():Collection<Bank>{
        return getAllBanks.execute()
    }


    @PostMapping("/all-banks")
    @ResponseStatus(HttpStatus.CREATED)
    fun addSingleBank(@RequestBody bank: Bank):List<Bank>{
        return addSingleBank.execute(bank)
    }

    @GetMapping("/all-banks/{accountNumber}")
    @ResponseStatus(HttpStatus.FOUND)
    fun getSingleBank(@PathVariable accountNumber: String): Bank{
        return getSingleBank.execute(accountNumber)
    }

    @PutMapping("/all-banks")
    @ResponseStatus(HttpStatus.CREATED)
    fun updateSingleBank(@RequestBody bank: Bank): Bank {
        return updateSingleBank.execute(bank)
    }

    @DeleteMapping("/all-banks/{accountNumber}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteSingleBank(@PathVariable accountNumber: String): List<Bank>{
        return deleteSingleBank.execute(accountNumber)
    }
}