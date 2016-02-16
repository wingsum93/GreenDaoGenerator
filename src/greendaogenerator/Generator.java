package greendaogenerator;

import java.io.IOException;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class Generator {
	public static void main(String [] args){
		//First param:Database vision, Second param:Android project package �Ѽ�1:�ƾڮw����,�Ѽ�2:�A�ݭn�ƾڮw��Android����  
        Schema schema = new Schema(1, "com.example.testspinnersqlite.greendao");  
        //Create table "Label" �s�ؼƾڮw����,�sLabel  
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
        /*�o��class�O���ͦ�����,�W���N�O�n�w�q�a�}��m�ͦ������(!!!)�n���b�A��android���طs�ؤ@�ӥs"src-gen"�����,���ssrc-gen�]�i�H�A���L�ݦb�W�����y��^�A�w�U���W��...�u���ʤ��򳣭n�ۤv���@�M*/  
    }  
//����Label���]�p  
    private static void addLabel(Schema schema) {  
        //Create entity �w�q���W��,  
        Entity note = schema.addEntity("Label");  
        //Add table columns �w�q����  
        note.addIdProperty(); //�C�Ӫ����ӳ���ID�a  
        note.addStringProperty("label").notNull(); //�ڪ���ƾڥu�@���ƾڰO������label,�o�̴N�O�A�ۥѵo�����a��F  
        note.addStringProperty("girl_friend_name");
    }  
	
}
