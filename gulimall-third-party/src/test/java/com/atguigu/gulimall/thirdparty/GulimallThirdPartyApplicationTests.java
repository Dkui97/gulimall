//package com.atguigu.gulimall.thirdparty;
//
//import com.aliyun.oss.OSS;
//
//import com.aliyun.oss.OSSClient;
//import com.aliyun.oss.OSSClientBuilder;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//
//@SpringBootTest
//class GulimallThirdPartyApplicationTests {
//
//    @Autowired
//    OSSClient ossClient;
//
//    @Test
//    void contextLoads() {
//    }
//
//
//    @Test
//    public void testUpload() throws FileNotFoundException {
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-shanghai.aliyuncs.com";
//        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//        String accessKeyId = "";
//        String accessKeySecret = "";
//
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        //上传文件流。
//        InputStream inputStream = new FileInputStream("C:\\Users\\Dkui\\Pictures\\头像.jpg");
//        ossClient.putObject("gulimall-dkui", "333.jpg", inputStream);
//
//        // 关闭OSSClient。
//        ossClient.shutdown();
//        System.out.println("上传成功.");
//    }
//
//    @Test
//    public void testUpload1() throws FileNotFoundException {
//        FileInputStream inputStream = new FileInputStream("C:\\Users\\Dkui\\Pictures\\头像.jpg");
//        // 参数1位bucket  参数2位最终名字
//        ossClient.putObject("gulimall-dkui","321.jpg",inputStream);
//        ossClient.shutdown();
//        System.out.println("上传成功");
//    }
//
//}
