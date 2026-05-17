package com.nexusdrive.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class FileResponse {
    private Long id;
    private String name;
    private String virtualPath;
    private boolean isDirectory;
    private Long size;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}