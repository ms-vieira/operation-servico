package br.com.operacao.web.request

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class OperationRequest(val action: String, val clientId: String, val datProcess: String)
