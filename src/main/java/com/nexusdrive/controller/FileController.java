package com.nexusdrive.controller;

import com.nexusdrive.entity.FileEntity;
import com.nexusdrive.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/files")
@CrossOrigin("*")
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @PostMapping("/upload")
    public String upload(@RequestParam String fileName) {

        FileEntity file = new FileEntity();
        file.setFileName(fileName);

        fileRepository.save(file);

        return "Uploaded Successfully";
    }

    @GetMapping("/all")
    public List<String> getAllFiles() {

        return fileRepository.findAll()
                .stream()
                .map(FileEntity::getFileName)
                .toList();
    }
}