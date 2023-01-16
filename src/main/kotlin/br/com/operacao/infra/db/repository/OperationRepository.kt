package br.com.operacao.infra.db.repository

import br.com.operacao.infra.db.entity.OperationEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OperationRepository : JpaRepository<OperationEntity, Long> {
    fun findByClientId(clientId: String): List<OperationEntity>
}