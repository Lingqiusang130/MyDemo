/**
 * 
 */
package org.lingqiusang.jdom;

import java.io.File;
import java.io.FileOutputStream;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

/**
 * @author lingqiusang
 * 
 */
public class WriteXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Element addresslist = new Element("addresslist");// 定义根节点
		Element linkman = new Element("linkman");// 定义linkman节点
		Element name = new Element("name");// 定义name节点
		Element email = new Element("email");// 定义email节点
		Attribute id = new Attribute("id", "lq");// 定义属性
		Document doc = new Document(addresslist);// 声明一个Document对象
		name.setText("林秋");// 设置name元素的内容
		email.setText("linqiuwork@gmail.com");// 设置email元素的内容
		name.setAttribute(id);// 设置name元素的属性
		linkman.addContent(name);// name为linkman子节点
		linkman.addContent(email);// email为linkman子节点
		addresslist.addContent(linkman);// 将linkman加入根节点中
		XMLOutputter out = new XMLOutputter();// 用来输出xml文件
		out.setFormat(out.getFormat().setEncoding("UTF-8"));// 设置输出的编码
		try {// 输出XML文件
			out.output(doc, new FileOutputStream(
					"E:/AppCode/Workspaces/MyEclipse Professional 2014/MyDemo/xml"
							+ File.separator + "address.xml"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
