package csuft.group.movie;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App {

	public static void main(String[] args) {
		//jsoup库 获取html文档
		//1）文档的路径： url
		String url="https://movie.douban.com/top250?start=50&filter=";
		// 2）使用Jsoup建立连接，获得文档内容
		try {
			Document doc= Jsoup.connect(url).get();
			//网络正常
			System.out.println(doc.title());
			//解析文档 获得文档信息
			//具体的选择器
			Elements es= doc.select(".info");
			for (Element e : es) {
				//自己分析页面，选取需要的数据节点，【人工智能】
//				System.out.println(e);
//				System.out.println(e.text());
				//把e li看成一个新的独立的文档（树）
				System.out.println("----------------"); 
				System.out.println(e.selectFirst(".bd").text()); 
//				System.out.println(e.selectFirst(".p_bot").text()); 
//				System.out.println(e.selectFirst(".position").text()); 
			}
		} catch (IOException e) {
			//异常处理
			e.printStackTrace();
		}
		
	}

}
