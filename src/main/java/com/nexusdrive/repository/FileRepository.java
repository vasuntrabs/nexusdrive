package com.nexusdrive.repository;

import com.nexusdrive.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
    List<FileEntity> findByParentIdAndOwnerIdAndIsDeletedFalse(Long parentId, Long ownerId);
    List<FileEntity> findByOwnerIdAndIsDeletedFalse(Long ownerId);
}