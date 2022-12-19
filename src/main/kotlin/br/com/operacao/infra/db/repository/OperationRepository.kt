package br.com.operacao.infra.db.repository

import br.com.operacao.infra.db.entity.OperationEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface OperationRepository : JpaRepository<OperationEntity, Long> {

    @Query(value = "FROM OperationEntity o where o.clientId = :clientId")
    fun findIdByClientId(clientId: String): List<OperationEntity>
}