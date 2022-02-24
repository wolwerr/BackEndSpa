package com.ms.coment.repositories;

import com.ms.coment.models.ComentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ComentRepository extends JpaRepository<ComentModel, UUID>  {
}

