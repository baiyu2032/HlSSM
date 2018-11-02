package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("util")
public class VerifyUtil {

	
	/**
	 * �ֻ�����֤
	 * @param phone
	 * @return
	 */
	public String Phone(String phone){
		String str = null;
	    String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
	    if (phone.length() != 11) {
		    	str ="�ֻ���ӦΪ11λ��";
		        return str;
	
	    } else {
	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(phone);
	        boolean isMatch = m.matches();
	        if (!isMatch) {
	        	str ="��������ȷ���ֻ���";
	        	return str;
	        }
	    }
		return str;
	}

	/**
	 * ��ַ��֤
	 * @param address
	 * @return
	 */
	public String address(String address){
		String str = null;
		String regex ="^([\u4E00-\u9FA5A-Za-z0-9_]+(ʡ|��|��)){2,}$";
		Pattern p = Pattern.compile(regex);
	    Matcher m = p.matcher(address);
	    boolean isMatch = m.matches();
	    if (!isMatch) {
	        str ="��������ȷ�ĵ�ַ";
	        return str;
	    }
		return str;
		
	}

	/**
	 * ������֤
	 * @param name
	 * @return
	 */
	public String name(String name){
		String str = null;
		String regex = "^(��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|֣|��|л|��|��|��|��|��|��|��|��|��|Ф|��|��|Ԭ|��|��|��|��|��|��|Ҷ|��|��|κ|��|��|��|��|Ҧ|¬|��|��|��|̷|½|��|��|��|ʯ|��|��|��|Τ|��|��|��|��|��|��|��|��|��|��|Ѧ|��|��|��|��|��|ʷ|��|��|��|ë|��|��|��|��|Ǯ|��|��|��|��|��|��|��|��|��|ʩ|��|��|��|��|��|��|��|ţ|��|«|��|��|��|³|��|��|��|��|��|��|��|��|��|��|��|��|��|��|÷|Ī|ׯ|��|��|ף|��|Ϳ|��|��|ʱ|��|��|Ĳ|��|·|ղ|��|��|��|��|��|��|ʢ|ͯ|ŷ|��|��|��|��|��|��|��|ϯ|��|��|��|��|λ|��|��|��|��|ֲ|��|��|��|��|��|˾|��|��|��|��|��|��|ŷ��|��|ǿ|��|��|��|Ƚ|��|��|��|��|��|��|��|��|��|��|��|��|��|��|Է|��|�|��|��|��|��|��|ȫ|��|��|��|¦|��|��|��|ľ|��|��|��|��|ۡ|��|̸|��|��|��|۬|��|��|��|��|��|��|��|��|�|��|��|��|��|۳|��|׿|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|ԭ|��|��|��|١|��|��|��|Ӧ|̨|��|��|ɮ|ɣ|��|��|��|��|��|ɳ|��|��|�|ϰ|��|��|��|��|ˮ|��|��|��|ۺ|��|Ƥ|��|Ԫ|ƽ|��|տ|��|��|��|é|��|Σ|��|֧|��|��|��|��|��|��|��|��|��|ť|��|��|��|��|��|�|��|��|��|��|��|��|��|��|��|��|��|��|��|��|ɽ|�|��|ۭ|��|��|��|��|��|��|��|��|��|��|��|��|��|��|ӡ|��|��|��|��|��|��|��|��|��|��|��|��|˫|��|ݷ|��|��|��|��|��|۪|Ӻ|ȴ|�|�|��|ͨ|��|ۣ|��|��|ũ|��|��|��|Ľ|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|»|��|��|Ź|�|��|��|ε|Խ|��|¡|ʦ|��|��|��|��|��|��|��|��|��|ؿ|��|��|��|��|��|��|��|��|Ȩ��|����|��|��|��ٹ|˾��|�Ϲ�|�ĺ�|���|����|����|����|�ʸ�|ξ��|����|�̨|��ұ|����|���|����|����|̫��|����|����|����|��ԯ|���|����|����|����|Ľ��|����|����|˾ͽ|˾��|����|˾��|��|��|�ӳ�|���|��ľ|����|����|���|����|����|����|�ذ�|�й�|�׸�|����|��|��|��|�θ�|����|����|����|����|�麣|����|΢��|˧|��|��|��|�C|��|����|����|����|����|��|٦|��|��|�Ϲ�|ī|��|��|��|��|��|��|��)\\s*[\\u4e00-\\u9fa5]{1,3}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean isMatch = m.matches();
		if (!isMatch) {
			str ="��������ȷ������";
			return str;
		}
		return str;

	}

	/**
	 * �ʱ���֤
	 * @param postcode
	 * @return
	 */
	public String postcode(String postcode){
		String str = null;
		String regex = "^[0-9]{6}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(postcode);
		boolean isMatch = m.matches();
		if (!isMatch) {
			str ="��������ȷ���ʱ�";
			return str;
		}
		return str;

	}
	/**
	 * ������֤
	 */
	public String money(String money){
		String str = null;
		String regex = "^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$";
	    Pattern p = Pattern.compile(regex);
	    Matcher m = p.matcher(money);
	    boolean isMatch = m.matches();
	    if (!isMatch) {
	        str ="��������ȷ�Ľ��";
	        return str;
	    }
		return str;
		
	}


}
