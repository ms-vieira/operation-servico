package br.com.operacao.infra.db.entity

import javax.persistence.*


@Entity
@Table(name = "operations")
class OperationEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var action: String?,
    var clientId: String?,
    var datProcess: String?
)