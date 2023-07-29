package com.example.transferfile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * パラメータで受け取った文字列をテキストテンプレートに埋め込んで返却する
 */
@RestController
public class EditTextController {

    @Value("${template}")
    public String templateDir;

    @GetMapping("/find/{fileName:.+}")
    public String find(@PathVariable String fileName) {
        String str = "NG";
        if (true) {
            
        }
        return str;
    }
}
