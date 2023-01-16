package br.com.operacao.infra.db.entity

import jakarta.persistence.*


@Entity
@Table(name = "operation")
class OperationEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L,
    var action: String = "",
    var clientId: String = "",
    var datProcess: String = ""
)