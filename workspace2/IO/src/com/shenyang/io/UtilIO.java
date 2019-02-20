package com.shenyang.io;

import java.io.File;

public class UtilIO {
	/**
	 * �ж��ļ���״̬���Ƿ���ڣ����ļ������ļ���
	 * @param src
	 */
	public static void fileStatus(File src){
		if(null == src||!src.exists()){
			System.out.println("�ļ�������");
		}else if(src.isDirectory()){
			System.out.println("�ļ���");
		}else if(src.isFile()){
			System.out.println("�ļ�");
		}
	}
	 /**
	  * ��ӡ�ļ��е�Ŀ¼�����ＶĿ¼
	  * @param src
	  */
	public static void printSubCatalog(File src){
		if(null==src||!src.exists()){
			return;
		}
		for(File f:src.listFiles()){
			if(f.isDirectory()){
				printSubCatalog(f);
				System.out.println(f);
			}else{
				System.out.println(f);
			}
		}
	}

}
