package com.shenyang.io;

import java.io.File;

public class UtilIO {
	/**
	 * 判断文件的状态，是否存在，是文件还是文件夹
	 * @param src
	 */
	public static void fileStatus(File src){
		if(null == src||!src.exists()){
			System.out.println("文件不存在");
		}else if(src.isDirectory()){
			System.out.println("文件夹");
		}else if(src.isFile()){
			System.out.println("文件");
		}
	}
	 /**
	  * 打印文件夹的目录及子孙级目录
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
