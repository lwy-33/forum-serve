package com.example.forumserve.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin
public class FileController {
    @PostMapping("/uploadFile")
    public Map<String,Object> uploadFile(MultipartFile file) throws IOException{
        String oldFileName=file.getOriginalFilename();
        String newFileName= UUID.randomUUID().toString()+oldFileName;
        String fileSavePath="D:/userImage/icon/"+newFileName;
        File f=new File(fileSavePath);
        file.transferTo(f);
        String gameIcon="http://localhost:8090/userImage/icon/"+newFileName;
        Map<String,Object> map=new HashMap<>();
        map.put("code",200);
        map.put("msg","文件上传成功");
        map.put("dataobject",gameIcon);
        return map;
    }
}
