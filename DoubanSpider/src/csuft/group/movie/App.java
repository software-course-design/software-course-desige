package csuft.group.movie;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App {

	public static void main(String[] args) {
		//jsoup�� ��ȡhtml�ĵ�
		//1���ĵ���·���� url
		String url="https://movie.douban.com/top250?start=50&filter=";
		// 2��ʹ��Jsoup�������ӣ�����ĵ�����
		try {
			Document doc= Jsoup.connect(url).get();
			//��������
			System.out.println(doc.title());
			//�����ĵ� ����ĵ���Ϣ
			//�����ѡ����
			Elements es= doc.select(".info");
			for (Element e : es) {
				//�Լ�����ҳ�棬ѡȡ��Ҫ�����ݽڵ㣬���˹����ܡ�
//				System.out.println(e);
//				System.out.println(e.text());
				//��e li����һ���µĶ������ĵ�������
				System.out.println("----------------"); 
				System.out.println(e.selectFirst(".bd").text()); 
//				System.out.println(e.selectFirst(".p_bot").text()); 
//				System.out.println(e.selectFirst(".position").text()); 
			}
		} catch (IOException e) {
			//�쳣����
			e.printStackTrace();
		}
		
	}

}
