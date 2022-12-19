package br.com.operacao.web.response

import br.com.operacao.infra.db.entity.OperationEntity
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class OperationsResponse(
    val action: String? = null,
    val clientId: String? = null,
    val datProcess: String? = null
) {

    fun entityToResponse(entity: List<OperationEntity>): List<OperationsResponse> =
        entity.map { each ->
            OperationsResponse(
                action = each.action,
                clientId = each.clientId,
                datProcess = each.datProcess
            )
        }
}
