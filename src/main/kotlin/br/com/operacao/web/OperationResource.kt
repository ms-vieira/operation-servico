package br.com.operacao.web

import br.com.operacao.usecase.CreateOperationClient
import br.com.operacao.usecase.SearchOperationClient
import br.com.operacao.usecase.model.Operation
import br.com.operacao.web.request.OperationRequest
import br.com.operacao.web.response.OperationsResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/operation")
class OperationResource(
    val createOperationClient: CreateOperationClient,
    val searchOperationClient: SearchOperationClient
) {

    @PostMapping
    fun create(@RequestBody request: OperationRequest): ResponseEntity<Void> {
        createOperationClient.create(Operation(request.action, request.clientId, request.datProcess))
        return ResponseEntity(HttpStatus.CREATED)
    }

    @GetMapping("/{clientId}")
    fun searchClient(@PathVariable clientId: String): ResponseEntity<List<OperationsResponse>> {
        return ResponseEntity<List<OperationsResponse>>(searchOperationClient.search(clientId), HttpStatus.OK)
    }

}