package cn.tedu.demo02;
/*
 * 拷贝图片
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\kbzm.png");
		FileOutputStream fos = new FileOutputStream("D:\\kbzm1.png");
		byte[] bys = new byte[1024 * 8];
		int len;//实际长度
		while((len = fis.read(bys)) != -1){
			//读取成功后，写入文件
			fos.write(bys, 0, len);
		}
		//关流
		fos.close();
		fis.close();
	}
}
