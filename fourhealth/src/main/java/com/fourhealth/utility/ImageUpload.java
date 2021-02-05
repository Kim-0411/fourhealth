package com.fourhealth.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import com.fourhealth.dto.NoticePromotionTrainerDto;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Component
public class ImageUpload {

    public String imageUpload(HttpServletRequest request, MultipartFile img) throws FileNotFoundException {

        String fileName = null;
        String rename = null;

        if (!img.isEmpty()) {
            int rdv = (int) (Math.random() * 1000);
            fileName = img.getOriginalFilename();
            rename = rdv + "_" + fileName;
            // String path =
            // "C:\\Users\\ECS\\Documents\\GitHub\\fourhealth\\fourhealth\\src\\main\\resources\\static\\image\\";
            // String realPath = ResourceUtils.getFile("src/main/resources/static/image/" +
            // rename).getAbsolutePath();

            // 배포패스
            String path = getSaveLocation(request);

            System.out.println(path);

            File file = new File(path);

            file = new File(path + rename);
            OutputStream out = null;

            try {
                out = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // try {
            // new File(realPath).mkdir();
            // img.transferTo(new File(realPath));

            // } catch (IllegalStateException e) {
            // e.printStackTrace();
            // } catch (IOException e) {
            // e.printStackTrace();
            // }
        }

        System.out.println(rename);

        return rename;
    }

    private String getSaveLocation(HttpServletRequest request) {

        String uploadPath = request.getSession().getServletContext().getRealPath("/");
        String attachPath = "resources/static/image/";

        System.out.println();
        // log.debug("UtilFile getSaveLocation path : " + uploadPath + attachPath);
        return uploadPath + attachPath;
    }

}