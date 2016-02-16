package greendaogenerator;

import java.io.IOException;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class Generator {
	public static void main(String [] args){
		//First param:Database vision, Second param:Android project package 參數1:數據庫版本,參數2:你需要數據庫的Android項目  
        Schema schema = new Schema(1, "com.example.testspinnersqlite.greendao");  
        //Create table "Label" 新建數據庫的表,叫Label  
        addLabel(schema);  
        //Generate DAO Class to the Android project  
        try {
			new DaoGenerator().generateAll(schema, "C:/wms_workspace/greendaogenerator/lib/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        /*這個class是文件生成器麻,上面就是要定義地址放置生成的文件(!!!)要先在你的android項目新建一個叫"src-gen"的文件夾,不叫src-gen也可以，不過需在上面那句改回你定下的名稱...真任性什麼都要自己的一套*/  
    }  
//做表Label的設計  
    private static void addLabel(Schema schema) {  
        //Create entity 定義表的名稱,  
        Entity note = schema.addEntity("Label");  
        //Add table columns 定義表的欄  
        note.addIdProperty(); //每個表應該都有ID吧  
        note.addStringProperty("label").notNull(); //我的表數據只一項數據記錄標籤label,這裡就是你自由發揮的地方了  
        note.addStringProperty("girl_friend_name");
    }  
	
}
