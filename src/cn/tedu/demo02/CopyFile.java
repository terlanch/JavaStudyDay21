package cn.tedu.demo02;
/*
 * ����ͼƬ
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\kbzm.png");
		FileOutputStream fos = new FileOutputStream("D:\\kbzm1.png");
		byte[] bys = new byte[1024 * 8];
		int len;//ʵ�ʳ���
		while((len = fis.read(bys)) != -1){
			//��ȡ�ɹ���д���ļ�
			fos.write(bys, 0, len);
		}
		//����
		fos.close();
		fis.close();
	}
}
