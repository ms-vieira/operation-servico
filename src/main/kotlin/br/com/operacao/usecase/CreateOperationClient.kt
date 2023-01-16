package br.com.operacao.usecase

import br.com.operacao.infra.db.entity.OperationEntity
import br.com.operacao.infra.db.repository.OperationRepository
import br.com.operacao.usecase.model.Operation
import org.springframework.stereotype.Component

@Component
class CreateOperationClient(private val repository: OperationRepository) {

    fun create(operation: Operation) =
        repository.save(
            OperationEntity(
                clientId = operation.clientId,
                action = operation.action,
                datProcess = operation.datProcess
            )
        )
}