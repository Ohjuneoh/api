package sample10_map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp1 {
	
	public static void main(String[] args) throws IOException{

		/*
		 * Properties
		 *  - 프로퍼티 설정정보를 표현하는 객체다.
		 *  - .properties 파일 혹은 .xml 파일로 설정된 설정정보를 읽어오는 객체다.
		 * 	- 자바 애플리케이션의 설정정보를 로딩해서 제공하는 객체다.
		 *  - Properties 객체는 Key와 Value의 타입이 모두 String 타입이다.
		 *  - 주요 API
		 *  	void load(FileInputStream in)
		 *  		 - 지정된 FileInputStream으로 properties 파일 정보를 로딩한다.
		 *  	void load(FileReader in)
		 *  		 - 지정된 FileReader로 properties 파일 정보를 로딩한다.
		 *  	void loadFromXML(FileInputStream in)
		 *  		 - 지정된 FileInputStream으로 xml파일 정보를 로딩한다.
		 *  	void loadFromXML(FileReader in)
		 *  		 - 지정된 FileReader로 xml파일 정보를 로딩한다.
		 *  	String getProperty(String Key)
		 *  		 - 지정된 key값에 해당하는 프로퍼티 정보를 반환한다.
		 *  	String getProperty(String key, String defaultValue)
		 *  		 - 지정된 key값에 해당하는 프로퍼티정보를 반환한다.
		 *  		 - properties 정보가 존재하지 않으면 defaultValue가 반환된다.
		 */
		
		/*
		 * 설정 정보를 외부로 빼는이유
		 * 
		 * 1. 그렇다면 왜 시스템 파일 경로를 밖에다 따로 빼두는 걸까, ex 저장경로 변경 시 빼두지 않으면 컴파일을 계속 새로해야한다.
		 * 2. 버전관리도구 / 형상관리도구 
		 */
		// .properties 파일을 읽어서 설정정보를 로드하는 객체다.
		
		Properties prop = new Properties();		
		
		
		//sample.properties 파일을 읽어서 설정정보를 로딩한다.
		prop.load(new FileInputStream("src/sample10_map/sample.properties"));
		prop.loadFromXML(new FileInputStream("src/sample10_map/sample.xml"));
		System.out.println(prop);
		// =을 기준으로 앞은 key 뒤는 value
		//로딩된 설정정보 조회하기
		String saveDirectory = prop.getProperty("file.upload.directory");
		System.out.println("첨부파일 저장경로 - > " + saveDirectory);
		
		long maxUploadFileSize = Long.parseLong(prop.getProperty("file.upload.maxuploadsize"));
			System.out.println("첨부파일 최대크기 - > " + maxUploadFileSize);
			
		String encoding = prop.getProperty("file.upload.encoding");
			System.out.println("인코딩 방식 - > " + encoding);
		
	}

}
