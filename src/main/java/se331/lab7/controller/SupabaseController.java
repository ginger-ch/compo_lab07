package se331.lab7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import se331.lab7.util.SupabaseStorageService;

@RestController
@RequiredArgsConstructor
public class SupabaseController {
    final SupabaseStorageService supabaseStorageService;

    @PostMapping("/uploadFile")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            String fileUrl = supabaseStorageService.uploadFile(file);
            return ResponseEntity.ok(fileUrl);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error uploading file: " + e.getMessage());
        }
    }

    @GetMapping("/presignedUrl")
    public ResponseEntity<?> getPresignedUrl(@RequestParam("fileName") String fileName) {
        try {
            String presignedUrl = supabaseStorageService.getPresignedUrl(fileName);
            return ResponseEntity.ok(presignedUrl);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error generating presigned url: " + e.getMessage());
        }
    }
}