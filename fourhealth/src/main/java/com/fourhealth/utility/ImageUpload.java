package com.fourhealth.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fourhealth.dto.NoticePromotionTrainerDto;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class ImageUpload {

    public String imageUpload(MultipartFile img) throws FileNotFoundException {

        String fileName = null;
        String rename = null;

        if (!img.isEmpty()) {
            int rdv = (int) (Math.random() * 1000);
            fileName = img.getOriginalFilename();
            rename = rdv + "_" + fileName;
            // String path =
            // "C:\\Users\\ECS\\Documents\\GitHub\\fourhealth\\fourhealth\\src\\main\\resources\\static\\image\\";

            String realPath = ResourceUtils.getFile("src/main/resources/static/image/" + rename).getAbsolutePath();
            // 배포패스

            try {
                new File(realPath).mkdir();
                img.transferTo(new File(realPath));

            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(rename);

        return rename;
    }

}