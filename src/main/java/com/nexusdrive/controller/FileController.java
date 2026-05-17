package com.nexusdrive.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/files")
public class FileController {

    private List<String> files = new ArrayList<>();

    @PostMapping("/upload")
    public String upload(@RequestParam String fileName) {
        files.add(fileName);
        return "Uploaded: " + fileName;
    }

    @GetMapping("/all")
    public List<String> getAll() {
        return files;
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam String fileName) {
        files.remove(fileName);
        return "Deleted: " + fileName;
    }
}