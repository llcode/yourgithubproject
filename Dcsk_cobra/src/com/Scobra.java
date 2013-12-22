package com;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import org.lobobrowser.html.UserAgentContext;
import org.lobobrowser.html.domimpl.HTMLDocumentImpl;
import org.lobobrowser.html.parser.DocumentBuilderImpl;
import org.lobobrowser.html.parser.InputSourceImpl;
import org.lobobrowser.html.test.SimpleUserAgentContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Scobra {
//		private static final String TEST_URI = "http://localhost:8080/erer/js.html ";
	    private static final String TEST_URI = "http://www.sina.com.cn";
		public static void main(String[] args) throws Exception {

		UserAgentContext uacontext = new SimpleUserAgentContext();

		DocumentBuilderImpl builder = new DocumentBuilderImpl(uacontext);

		URL url = new URL(TEST_URI);

		InputStream in = url.openConnection().getInputStream();

		try {

		Reader reader = new InputStreamReader(in, "gb2312");

		InputSourceImpl inputSource = new InputSourceImpl(reader, TEST_URI);

		Document d = builder.parse(inputSource);

		HTMLDocumentImpl document = (HTMLDocumentImpl) d;
		
//		System.out.println(document.getInnerHTML());

//		Element ele = document.getElementById("gg");

//		System.out.println(ele.getTextContent());



		} finally {

		in.close();

		}

		}

		}
