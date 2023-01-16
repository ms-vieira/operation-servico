package br.com.operacao

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
@EntityScan("br.com.operacao.infra.db.entity")
class OperationServiceApplication

fun main(args: Array<String>) {
    runApplication<OperationServiceApplication>(*args)
}