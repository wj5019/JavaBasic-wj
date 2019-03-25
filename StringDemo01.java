package string;

public class Demo10 {

	public static void main(String[] args) {
		/*
		 * StringBuilder
		 * ¿É±ä×Ö·û´®£¬Æä·½·¨¿ÉÒÔÐÞ¸ÄStringBuilderÖÐ
		 * ×Ö·ûÊý×éµÄÄÚÈÝ¡£ÒòÎªÃ»ÓÐÆµ·±¸´ÖÆÐÂ×Ö·ûÊý×é
		 * Ïà¶ÔÓÚString APIÆä²Ù×÷ÐÔÄÜºÃ
		 */
		//´´½¨StringBuilder¶ÔÏóÊ±ºò£¬»á×Ô¶¯
		//ÔÚÄÚ²¿´´½¨Ò»¸ö16¸öÔªËØµÄcharÊý×é
		StringBuilder buf=new StringBuilder();
		//×î¼ÑÊý¾ÝÊ±ºò£¬Êý¾Ý»á×Ô¶¯Ìî³äµ½charÊý×éÖÐ
		buf.append("·¶´«Ææ");
		buf.append("½ñÌìÔç³¿");
		//µ±³¬¹ý16¸öÔªËØÊ±ºò»Ø×Ô¶¯À©ÈÝ
		
		//StringBuilder API ·½·¨»á·µ»Ø
		//StringBuilder ¶ÔÏó×ÔÉí£¬ÕâÑù·½±ã
		//Á¬ÐøÊ¹ÓÃ . µ÷ÓÃÆä·½·¨£¬¿ÉÒÔ´ó´ó¼ò»¯
		//³ÌÐòµÄÊéÐ´
		buf.append("¸ÉÁËÒ»¼þ¾ªÌì¶¯µØµÄ")
		   .append("´óÊÂ£¡")
		   .insert(3, "ÀÏÊ¦")
		   .delete(1, 1+2);
		System.out.println(buf);
	}

}
