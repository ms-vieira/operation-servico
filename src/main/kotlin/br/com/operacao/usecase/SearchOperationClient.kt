package br.com.operacao.usecase

import br.com.operacao.infra.db.repository.OperationRepository
import br.com.operacao.web.response.OperationsResponse
import org.springframework.stereotype.Component

@Component
class SearchOperationClient(private val repository: OperationRepository) {

    fun search(clientId: String) = OperationsResponse().entityToResponse(repository.findByClientId(clientId))
}