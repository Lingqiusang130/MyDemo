/**
 * 
 */
package org.lingqiusang.jdom;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/**
 * @author lingqiusang
 * 
 */
public class ReadXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXBuilder builder = new SAXBuilder();// 建立SAX解析
		Document read_doc = null;
		try {
			read_doc = builder
					.build("E:/AppCode/Workspaces/MyEclipse Professional 2014/MyDemo/xml"
							+ File.separator + "address.xml");// 找到Document
		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Element stu = read_doc.getRootElement();// 读取到根元素
		List list = stu.getChildren("linkman");// 得到全部的linkman子元素
		for (int i = 0; i < list.size(); i++) {
			Element e = (Element) list.get(i);// 取出一个linkman子元素
			String name = e.getChildText("name");// 取得name元素内容
			String id = e.getChild("name").getAttributeValue("id");// 取得name元素的id属性
			String email = e.getChildText("email");// 取得email元素内容

			System.out.println("--------联系人---------");
			System.out.println("姓名：" + name + ",编号：" + id);
			System.out.println("EMAIL:" + email);
			System.out.println("-----------------------");
			System.out.println();
		}
	}

}
