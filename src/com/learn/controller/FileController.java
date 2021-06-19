package com.learn.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import sun.rmi.server.UnicastServerRef2;

import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.UUID;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/24 11:49<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Controller
public class FileController {
    @RequestMapping(value = "/down")
    public ResponseEntity<byte[]> down(HttpSession session) throws Exception {
        String realPath = session.getServletContext().getRealPath("img");
        String finalPath = realPath + File.separator + "body.jpg";
        FileInputStream is = new FileInputStream(finalPath);
        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-Disposition","attachment;filename=LJL.jpg");
        HttpStatus httpStatus = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<>(bytes, headers, httpStatus);
        is.close();
        return entity;
    }

    @RequestMapping(value = "/up_old",method = RequestMethod.POST)
    public String up_old(String desc, MultipartFile uploadFile,HttpSession session) throws IOException {
        String originalFilename = uploadFile.getOriginalFilename();
        String path = session.getServletContext().getRealPath("photo") + File.separator + originalFilename;
        InputStream is = uploadFile.getInputStream();
        File file = new File(path);
        FileOutputStream os = new FileOutputStream(file);
        int len = 0;
        while ((len = is.read())!=-1){
            os.write(len);
        }
        os.close();
        is.close();
        return "4";
    }
    @RequestMapping(value = "/up",method = RequestMethod.POST)
    public String up(MultipartFile uploadFile,HttpSession session) throws IOException {
        String originalFilename = uploadFile.getOriginalFilename();
        String finalFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
        String path = session.getServletContext().getRealPath("photo") + File.separator + finalFileName;
        File file = new File(path);
        uploadFile.transferTo(file);
        return "4";
    }

}
