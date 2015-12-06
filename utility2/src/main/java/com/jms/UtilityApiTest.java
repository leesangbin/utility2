package com.jms;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilityApiTest {

	public static void main(String[] args) {

		// Spring Bean file you specified in /src/main/resources folder
		String crunchifyConfFile = "mail-bean.xml";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(crunchifyConfFile);
		UtilityAPI jmsEmailAPI = (UtilityAPI) context.getBean("jmsEmail");
		String from = "sangbinlee999@gmail.com";
		// email subject
		String subject = "★★★test★★★ subject=This email sent by sangbinlee999's test sample";
		// email body
		String body = "★★★test★★★ body=There you go.. You got an email.. Let's understand details on how Spring MVC works -- By sangbinlee999";
		// String toAddr = "lsv400@naver.com";
		String[] toAddrs = new String[] { "lsv400@naver.com" };
		// String[] toAddrs = new String[]{"lsv400@naver.com",lsv400@daum.net
		// "sangbinlee9@gmail.com", "sh4014@hanmail.net", "shamma88@naver.com"};
		String[] toCc = new String[] { "lsv400@naver.com", "sangbinlee9@gmail.com" };
		String[] toBcc = new String[] { "sh4014@hanmail.net", "shamma88@naver.com" };
		jmsEmailAPI.jmsReadyToSendEmail(from, subject, body, toAddrs, toCc, toBcc);
	}

}
