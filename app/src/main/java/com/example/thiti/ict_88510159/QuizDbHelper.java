package com.example.thiti.ict_88510159;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.thiti.ict_88510159.QuizContract.*;

import java.util.ArrayList;


public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "DATABASE.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionsTable.COLUMN_DIFFICULTY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        //บทที่1
        //1-1
        Question q1 = new Question("โทรทัศน์ขาวดำเข้ารหัสภาพและเสียงแบบ Analog ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q1);
        Question q2 = new Question("Cable TV มีแค่ 6 ช่องรายการ ได้แก่ 3, 5, 7, 9, NBT, thaiPBS  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_lesson1);
        addQuestion(q2);
        Question q3 = new Question("Digital TV สามารถต่อจุดรับชมได้แค่ 1 เครื่อง ต่อ 1 กล่องสัญญาณ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q3);
        Question q4 = new Question("IP7V คือการดูอินเตอร์เน็ตผ่านทีวี  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q4);
        Question q5 = new Question("GPS ระบุตำแหน่งพิกัดโดยใช้สัญญาณเครือข่ายอินเตอร์เน็ต ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_lesson1);
        addQuestion(q5);
        Question q6 = new Question("บัตรเครดิต คือ ตัวอย่างหนึ่งของ Smart Card  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q6);
        Question q7 = new Question("Smart Home คือ การใช้เทคโนโลยีมาควบคุมการเปิด-ปิด อุปกรณ์ภายในบ้าน ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q7);
        Question q8 = new Question("RFID tag ใช้สำหรับตรวจจับว่าวัตถุนี้คืออะไร โดยไม่ต้องเห็นหรือสัมผัสวัตถุ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q8);

        //1-2

        Question q9 = new Question("reg.buu.ac.th คือ ระบบสารสนเทศสำหรับให้บริการการศึกษาของม.บูรพา",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q9);
        Question q10 = new Question("บริการอีเมลของมหาวิทยาลัยใช้งานได้ที่ vwwv.mail.buu.ac.th ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_lesson1);
        addQuestion(q10);
        Question q11 = new Question("ระบบ E-learning มีไว้สำหรับบริหารจัดการเรียนการสอน ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q11);
        Question q12 = new Question("QR Code คือ ระบบบาร์โค้ด 3 มิติ ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_lesson1);
        addQuestion(q12);
        Question q13 = new Question("เกมออนไลน์คือเกมส์ที่เล่นผ่านอินเตอร์เน็ต ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q13);
        Question q14 = new Question("Vocaloid คือ โปรแกรมจำลองภาพเสมือน 3 มิติ ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_lesson1);
        addQuestion(q14);
        Question q15 = new Question("Augmented Reality คือสือทีอยู่ในรูปแบบ Interactive Media ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q15);

        //1-3

        Question q16 = new Question("แว่นตาอัจฉริยะ ใส่เพื่อรักษาอาการสายตาสั้นหรือสายตาเอียง ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_lesson1);
        addQuestion(q16);
        Question q17 = new Question("Smart Wristband สามารถตรวจสอบข้อมูลการออกกำลังกาย และ ข้อมูลสุขภาพ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q17);
        Question q18 = new Question("Smart Watch สามารถใส่เพื่อติดตามสุขภาพของผู้สวมใส่ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q18);
        Question q19 = new Question("E-commerce คือการค้าขายในโลกอินเตอร์เน็ต เช่น การจองตั๋วโรงหนัง ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q19);
        Question q20 = new Question("Ease of Access Control ใน Windows เป็นกลุ่มโปรแกรมที่ช่วยให้การใช้งานคอมพิวเตอร์ทำได้ง่ายขึ้น ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_lesson1);
        addQuestion(q20);

        //บทที่2
        //2-1
        Question q21 = new Question("เทคโนโลยีสารสนเทศ คือ การประยุกต์ความรู้ด้านคอมพิวเตอร์เพื่อจัดการสารสนเทศที่ต้องการ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q21);
        Question q22 = new Question("องค์ประกอบของเทคโนโลยีสารสนเทศ คือ เทคโนโลยีคอมพิวเตอร์ การสื่อสาร และ โทรคมนาคม ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q22);
        Question q23 = new Question("กล้องวงจรปิดเป็นตัวอย่างเทคโนโลยีสารสนเทศขนาดเล็ก ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q23);
        Question q24 = new Question("การนำระบบคอมพิวเตอร์มาช่วยในการ‘ผิกอบรม หรือ ด้านการเรียนการสอนเรียกว่า Computer Aided Design ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q24);
        Question q25 = new Question("การใช้คอมพิวเตอร์ช่วยในการออกแบบ เรียกว่า Computer Assisted Design : CAD  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q25);
        Question q26 = new Question("`ระบบทะเบียน http://reg.buu.ac.th สามารถใช้ดูตารางสอนของอาจารย์ได้   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q26);

        //2-2

        Question q27 = new Question("ระบบการเรียนการสอนออนไลน์ของม.บูรพา เข้าใช้งานที่ http://assess.buu.ac.th   ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q27);
        Question q28 = new Question("ระบบการวางแผนทรัพยากรองค์กร (ERP) มีไว้สำหรับจัดการความสัมพันธ์ระหว่างองค์กรและลูกค้า  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q28);
        Question q29 = new Question("ระบบบริหารลูกค้าสัมพันธ์ (CRM) จะนำข้อมูลลูกค้ามาวิเคราะห์เพื่อศึกษาพฤติกรรมการซื้อสินค้า  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q29);
        Question q30 = new Question("VoIP คือ การสื่อสารทางเสียงผ่านโครงข่ายอินเตอร์เน็ต  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q30);
        Question q31 = new Question("จริยธรรมในการใช้เทคโนโลยี ประกอบด้วย ความเป็นส่วนตัว ความถูกต้อง ความซื่อสัตย์ และ การเข้าถึงข้อมูล  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q31);
        Question q32 = new Question("Thailand 4.0 คือ การเปลี่ยนรูปแบบเศรษฐกิจแบบเดิมไปสู่เศรษฐกิจที่ขับเคลื่อนด้วยนวัตกรรม  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson2);
        addQuestion(q32);

        //บทที่3

        Question q33 = new Question("Gadget คือ แอพพลิเคชั่นในมือถือ เพื่อช่วยส่งเสริมการทำงานให้ครบถ้วนมากยิ่งขึ้น   ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson3);
        addQuestion(q33);
        Question q34 = new Question("Application gadgets คือ รพ ขนาดเด็กที่ทำหน้าที่เป็นผู้ช่วยในการดำเนินกิจกรรมต่างๆ  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson3);
        addQuestion(q34);
        Question q35 = new Question("Find My iPhone คือ ตัวอย่างของแอปพลิเคชันแกดเจ็ต ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson3);
        addQuestion(q35);
        Question q36 = new Question("การนำ IT มาประยุกดํใช้ในชีวิตประจำวันของมนุษย์สิ่งที่สำคัญคือ การออกแบบส่วนติดต่อวับคำสั่งต่างๆจากผู้ใช้ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson3);
        addQuestion(q36);
        Question q37 = new Question("ระยะเวลาในการเรียนรู้เพื่อใช้งานระบบสามารถถูกใช้เป็นตัววัดความสามารถในการใช้งานของระบบได้  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson3);
        addQuestion(q37);
        Question q38 = new Question("บางครั้ง gadgets ถูกเรียกว่า gizmos  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson3);
        addQuestion(q38);
        Question q39 = new Question("Finis Neptune (อุปกรณ์พิงเพลงใต้นํ้า) คือ ตัวอย่าง gadgets สำหรับผู้พิการ   ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson3);
        addQuestion(q39);
        Question q40 = new Question("เครื่องปรับอากาศอัจฉริยะ ตู้เย็นอัจฉริยะ และ SmartTV คือตัวอย่าง Gadgets ที่เกี่ยวกับอุปกรณ์ภายในบ้าน  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson3);
        addQuestion(q40);
        Question q41 = new Question("การเลือกใช้แกจเจ็ตควรพิจารณา 3 ด้าน ได้แก่ ราคา การใช้งาน และ ความเหมาะสม ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson3);
        addQuestion(q41);
        Question q42 = new Question("อาการโรคติดมือถือ คือ ตื่นมาต้องรีบหามือถือเพื่อเช็คการแจ้งเตือนต่างๆ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson3);
        addQuestion(q42);

        //บทที่4
        //4-1

        Question q43 = new Question("การทำงานของเครื่องคอมพิวเตอร์ประกอบด้วย 2 ส่วน คือ Hardware และ Software  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q43);
        Question q44 = new Question("Hardware คือ ชุดคำสั่งที่ถูกเขียนขึ้นเพื่อให้คอมพิวเตอร์ทำงาน  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q44);
        Question q45 = new Question("โปรแกรม BIOS คือ โปรแกรมแรกที่เริ่มทำงานเมื่อเปิดเครื่องคอมพิวเตอร์   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q45);
        Question q46 = new Question("โปรแกรม BIOS ทำหน้าที่ตรวจสอบและควบคุมอุปกรณ์ต่างๆบน main board ถ้าอุปกรณ์ใดทำงานผิดพลาดมัน จะแกไขให้   ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q46);
        Question q47 = new Question("ซอฟต์แวร์แบ่งออกเป็น 2 ประเภท คือ ระบบปฏิบตการ และ โปรแกรมอรรถประโยชน์   ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q47);
        Question q48 = new Question("MS Office คือ ตัวอย่างหนึ่งของซอฟต์แวร์ระบบ   ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q48);
        Question q49 = new Question("ซอฟต์แวร์ประยุกต์ต้องทำงานภายใต้สภาพแวดล้อมของซอฟต์แวร์ระบบ   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q49);
        Question q50 = new Question("ระบบปฏิบัติการทำหน้าที่เป็นตัวกลางระหว่างผู้ใช้งานและเครื่องคอมพิวเตอร์   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q50);
        Question q51 = new Question("ระบบปฏิบัติการช่วยจัดการทรัพยากรที่โปรแกรมต้องใช้ และ คอยเฝืาตรวจจับความผิดพลาดที่อาจเกิดขึ้น   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q51);
        Question q52 = new Question("ตัวอย่างระบบปฏิบตการ เช่น Window, Ubuntu, Android, iOS   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q52);
        Question q53 = new Question("ระบบปฏิบัติการ MS-DOS ณ ขณะเวลาใดๆสามารถทำได้แค่ 1 งานเท่านั้น   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q53);
        Question q54 = new Question("ความสามารถของระบบปฏิบตการแบบกระจาย (Distributed Operating System) คือ ผู้ใช้สามารถใช้หลายๆเครื่องพร้อมกัน   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q54);
        Question q55 = new Question("ระบบปฏิบัติการ Window และ Linux เป็นแบบ open source  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q55);
        Question q56 = new Question("โปรแกรมอรรถประโยชน์ เป็นโปรแกรมเสริมที่จำเป็นต้องมีในเครื่องคอมพิวเตอร์",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q56);
        Question q57 = new Question("Disk Defragmenter คือ โปรแกรมกำจัดไฟล์ที่ไม่ต้องการออกจากเครื่องคอมพิวเตอร์ (์",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q57);

        //4-2

        Question q58 = new Question("ลิขสิทธ หมายถึง ข้ออนุญาตให้ใช้งานซอฟต์แวร์ต่างๆ โดยชอบธรรมตามกฎหมาย ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q58);
        Question q59 = new Question("ใบอนุญาตซอฟต์แวร์ ออกโดยผู้มีอำนาจตามกฎหมายและเป็นการตกลงกันระหว่างผู้ออกใบอนุญาตกับผู้ได้รับใบอนุญาติ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q59);
        Question q60 = new Question("Shareware เป็นซอฟต์แวร์ที่ผู้ผลิตแจกจ่ายให้นำไปใช้งานได้ฟรีจนกว่าจะพอใจ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q60);
        Question q61 = new Question("คำที่บ่งบอกว่าซอฟต์แวร์นั้นเป็น Free software เช่น free trial ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q61);
        Question q62 = new Question("Freeware เป็นซอฟต์แวร์ที่มีลิขสิทธแต่สามารถนำไปใช้งานได้ฟรีทุกจุดประสงค์ รวมทั้งเชิงการค้าด้วย ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q62);
        Question q63= new Question("Open source คือ ซอฟต์แวร์ที่นำไปใช้งานได้ฟรี แต่หากต้องการ source code ไปแกไขต้องจ่ายเงิน ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q63);
        Question q64 = new Question("ตลาด Open Source ถือกำเนิดขึ้นเพื่อหลีกเลี่ยงค่าลิขสิทธ์  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q64);
        Question q65 = new Question("การใช้ Open Source ช่วยลดปัญหาการละเมิดลิขสิทธซอฟต์แวร์ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q65);
        Question q66 = new Question("การใช้ Open Source ต้องหมั่นอัพเดทอยู่เสมอ ไม่เช่นนั้นอาจถูก hack เพื่อใช้เป็นเครื่องโจมดีเครื่องอื่น ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q66);

        Question q67 = new Question("โปรแกรม Web Browser ที่ต้องเสียค่าลิขสิทธ เช่น Internet Explorer (IE) ส่วนที่ใช้งานได้ฟรีคือ Google Chrome ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson4);
        addQuestion(q67);


        //บทที่5
        //5-1
        Question q68 = new Question("สัญญาณที่ใช้ในอุปกรณ์อิเลคทรอนิกส์มี 2 ชนิด คือ Analog และ Digital  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q68);
        Question q69 = new Question("สัญญาณ Digital คือ สัญญาณที่เรียงกันแบบต่อเนื่อง เช่น สัญญาณที่ออกมาจากไมโครโฟน  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q69);
        Question q70 = new Question("3รูปแบบไฟล์เสียงในระบบ Digital มี 2 รูปแบบ คือ บีบอัด กับ ไมบีบอัด  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q70);
        Question q71 = new Question("การผสมสีแบบลบ เป็นหลักการที่มาจากการผสมกันของแสง  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q71);
        Question q72 = new Question("คลื่นแสงพื้นฐาน ประกอบด้วย แสงสีเขียว แสงสีเหลือง และแสงสีแดง  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q72);
        Question q73 = new Question("เมื่อผสมแสง RGB ด้วยความเข้ม 100: 100: 100 จะได้สีขาว  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q73);
        Question q74 = new Question("7ื่อหรืออุปกรณ์ที่มีการฉายแสงออกมา เช่น จอโปรเจคเตอร์ ทีวี และไฟล์ภาพในระบบคอมพิวเตอร์ ใช้ระบบการ ผสมสีแบบบวก  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q74);
        Question q75 = new Question("8ีพื้นฐานในระบบสีแบบลบ ประกอบด้วย สีเหลือง สีนั้าเงิน และ สีแดง  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q75);
        Question q76 = new Question("เมื่อผสมสี CMY ด้วยความเข้ม 100 : 100 : 100 จะได้สีดำ  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q76);
        Question q77 = new Question("รูปแบบไฟล์ภาพที่เก็บในคอมพิวเตอร์แบ่งออกเป็น 2 ชนิดคือ bitmap กับ vector  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q77);
        Question q78 = new Question("ฃ้อดีของไฟล์ภาพแบบ vector คือ ภาพจะถูกขยายให้[หญ่แค่ไหนก็ได้โดยภาพจะไม่แตก  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q78);

        //5-2

        Question q79 = new Question("Video คือ ไฟล์ภาพ bitmap หลายๆภาพเรียงต่อกันทำให้เกิดภาพลวงตาเห็นเป็นภาพเคลื่อนไหว  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q79);
        Question q80 = new Question("การบันทึกวิดีโอทั่วไปจะบันทึกเป็นไฟล์บีบอัดแบบสูญเสียคุณภาพ  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q80);
        Question q81 = new Question("ไฟล์วิดีโอที่อยู่บนเว็บไซต์ เช่น Youtube และ Facebookใช้การบีบอัดแบบสูญเสีย  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q81);
        Question q82 = new Question("Progressive Scan คือ ไฟล์วิดีโอทีเก็บข้อมูล 1 เฟรมเป็นรูปภาพ bitmap ทังภาพ ในขณะที Interlaced video ใน 1 เฟรมจะเก็บแยกเป็น 2 fields   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q82);
        Question q83 = new Question("Interactive multimedia หมายถึงสื่อผสมแบบมีปฏิสัมพันธ์ เช่น วิดีโอเกมส์  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q83);
        Question q84 = new Question("ตัวอย่าง ฮอโลแกรม เช่น Pepper ‘ร Ghost และ การแสดงคอนเสริต์จอง Hatsune Miku ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson5);
        addQuestion(q84);

        //บทที่6
        Question q85 = new Question("Bandwidth คือ ความเร็วในการส่งข้อมูลผ่านอินเทอร์เน็ต มีหน่วยเป็นบิตต่อวินาที ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q85);
        Question q86 = new Question("Internet Service Provide คือ บริษัทผู้ให้บริการอินเทอร์เน็ตเชิงพาณิชย์ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q86);
        Question q87 = new Question("LAN สามารถขยายขนาดไปได้ไกลถึง too km โดยต้องเชื่อมต่อเข้ากับระบบเครือข่ายของ องค์การโทรศัพท์ ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q87);
        Question q88 = new Question("LAN ทำให้คอมพิวเตอร์สามารถส่งข้อมูลถึงกันไดโดยไม่ต้องเชื่อมการติดต่อกับ องค์การโทรศัพท์ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q88);
        Question q89 = new Question("WAN เป็นเครือข่ายระยะไกล ความเร็วในการรับล่งข้อมูลเริ่มตั้งแต่ 64 Kbps ถึงระดับ Mbps",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q89);
        Question q90 = new Question("FTP คือ บริการที่ช่วยให้ผู้ใช้เข้าถึงคอมพิวเตอร์อีกเครื่องที่อยู่ไกลๆ เสมือนว่าผู้ใช้นั่งสั่งงานอยู่ ที่เครื่องนั้น ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q90);
        Question q91 = new Question("Switch ทำหน้าที่ในการเลือกเส้นทางที่เหมาะสมสุดในการส่งข้อมูล  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q91);
        Question q92 = new Question("Model ทำหน้าที่แปลงกลับไปมาระหว่างสัญญาณดิจิทัลและแอนะล็อก ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q92);
        Question q93 = new Question("Analog Modem และ ADSL Modem ใช้สายโทรศัพท์เป็นสายนำสัญญาณ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q93);
        Question q94 = new Question("Cable Model ใช้สายใยแก้วนำแสงและสายแกนร่วมเป็นสายนำสัญญาณ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q94);
        Question q95 = new Question("การสื่อสารแบบไร้สายใช้คลื่นวิทยุในการรับล่งข้อมูล และใช้อากาศเป็นตัวกลางในการ กระจายสัญญาณ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q95);
        Question q96 = new Question("ADSL Model มีความเร็วกว่า Cable Modem สามหรือสี่เท่า",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q96);
        Question q97 = new Question("ตัวอย่างบริษัทผู้ให้บริการการเชื่อมต่อด้วย ADSL Modem คือ True Internet ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q97);
        Question q98 = new Question("Wireless Router ทำหน้าที่ในการจัดหาเส้นทางสัญญาณ wireless ที่ใกล้ที่สุด  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q98);
        Question q99 = new Question("UniNet คือ หน่วยงานผู้ให้บริการเชื่อมต่ออินเทอร์เน็ตให้กับสมาชิกที่อยู่ในหน่วยงานราชการ หรือสถาบันการศึกษา   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson6);
        addQuestion(q99);

        //บทที่7
        Question q100 = new Question("Tim Berners-Lee คือบิดาของเว็บ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson7);
        addQuestion(q100);
        Question q101 = new Question("Web 2.0 ตัวเว็บสามารถจัดการข้อมูลจำนวนมากไดในรูปแบบของ Metadata ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson7);
        addQuestion(q101);
        Question q102 = new Question("เมื่อมีการใช้ Tag เนื้อหาที่เกี่ยวข้องกับเว็บจะถูกดึงเข้ามา ทำให้ไม่ต้องเพิ่มเติมเนื้อหาในเว็บ มากเกินไป ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson7);
        addQuestion(q102);
        Question q103 = new Question("หัวใจของ web 4.0 คือ ความสามารถปรับตัวให้เข้ากับพฤติกรรมของผู้ใช้  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson7);
        addQuestion(q103);
        Question q104 = new Question("Virtual Marketing คือ การจำลองตลาดให้ผู้คนมาขายสินค้าออนไลน์  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson7);
        addQuestion(q104);
        Question q105 = new Question("Online storage เป็นพื้นที่จัดเก็บไฟล์ฟรีแบบออนไลน์ สามาระใช้ไฟล์จากคอมพิวเตอร์เครื่อง ใดก็ได้ที่มีอินเทอร์เน็ต  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson7);
        addQuestion(q105);
        Question q106 = new Question("OneDrive สามารถสร้าง อ่านและแชร์ไฟล์เอกสารจาก Office บนเว็บไซต์ได้   ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson7);
        addQuestion(q106);
        Question q107 = new Question("Google สามารถใช้เป็นเครื่องคิดเลขโดนการพิมพ์สมการคณิตศาสตร์ลงในช่องสืบค้น  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson7);
        addQuestion(q107);
        Question q108 = new Question("Google สามารถใช้ในการแปลงหน่วยวัดทำไดโดยใช้ operator “convert”เช่น convert km to mile ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson7);
        addQuestion(q108);
        Question q109 = new Question("Google สามารถใช้คำนวณอัตราแลกเปลี่ยนเงินตราได้ ถ้าไม่รู้ชื่อสกุลเงินสามารถใช้ชื่อ ประเทศแทนได้ เช่น 1 British money in thai money  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson7);
        addQuestion(q109);

        //บทที่8

        Question q110 = new Question("Internet forums, blog, Wiki คือ ตัวอย่าง รพ เครือข่ายสังคมออนไลน์ประเภทการ ติดต่อลื่อสาร  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q110);
        Question q111 = new Question("ตัวอย่าง internet forum ที่มีผู้ใช้งานมากที่สุดของไทยคือเว็บไซต์ Pantip  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q111);
        Question q112 = new Question("Blog คือการบันทึกบทความของตนเองลงบนเว็บไซต์เนื้อหาครอบคลุมทุกเรื่องทั้งส่วนตัว และ บทความเฉพาะด้า ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q112);
        Question q113 = new Question("วิกิเป็นเครื่องมือที่เปิดกว้างให้ทุกคนสามารถบันทึกความรู้ แก้ไข ปรับปรุงเรื่องราวต่างๆที่ มีผู้เขียนไว้  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q113);
        Question q114 = new Question("Chat room คือ การส่งข้อความในโปรแกรมห้องสนทนา มีข้อเสียคือ ถ้าในห้องสนทนามี คนจำนวนมาก จะทำให้ช้า ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q114);
        Question q115 = new Question("Messenger คือ โปรแกรมล่งข้อความด่วนแบบทันที เข่น Skype, Google Hangout, Line และ twitter ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q115);
        Question q116 = new Question("Yahoo เป็นเครื่องมือค้นหาที่มีลักษณะเด่นคือ จะทำการรวบรวมข้อมูลจากแหล่งต่างๆ แล้วมานำเสนอในแบบที่เข้าใจง่าย ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q116);
        Question q117 = new Question("Linkedln เป็นแหล่งแลกเปลี่ยนความคิดเห็น ประสบการณ์การทำงานของคนในสาย อาชีพเดียวกัน และสายงานอาชีพต่างๆอย่างหลากหลาย  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q117);
        Question q118 = new Question("Social Bookmarking ถูกออกแบบมาเพื่อช่วยให้ผู้ใช้สามารถจัดเก็บสิ่งที่สนใจต่างๆของ ตนเอง ผู้ใช้ทำการรีวิว ให้ข้อเสนอแนะ และแบ่งปันให้ผู้ใซ้คนอื่น  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q118);
        Question q119 = new Question("Delicious เป็นเว็บไซต์สำหรับเก็บ bookmark ไว้บนอินเตอร์เน็ต เพื่อสามารถเรียกใช้ จากที่ไหนก็ได้  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q119);
        Question q120 = new Question("Foursquare คือ บริการแนะนำสถานที่ต่างๆ เข่น สถานที่ท่องเที่ยว ร้านอาหาร  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q120);
        Question q121 = new Question("Vine คือ แอพพลิเคชันเกี่ยวกับการถ่ายวิดีโอแล้วอัพโหลดเพื่อแบ่งปันให้กับผู้อื่น  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q121);
        Question q122 = new Question("Slideshare คือ บริการฝากไฟล์ประเภทสำนักงานและวิดีโอ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson8);
        addQuestion(q122);

        //บทที่9
        Question q123 = new Question("พาณิชย์อิเล็กทรอนิกส์ หมายถึง การทำธุรกรรมทุกรูปแบบที่ทำผ่านลื่ออิเล็กทรอนิกส์ เช่น โทรศัพท์ โทรสาร โทรทัศน์ เครือข่ายอินเทอร์เน็ต  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson9);
        addQuestion(q123);
        Question q124 = new Question("บัตรเดบิต คือ ัตรที่ให้วงเงินพิเศษกับผู้ถือบัตรใช้ในการซื้อสินค้า  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson9);
        addQuestion(q124);
        Question q125 = new Question("การใช้งาน บัตรชาจต์ (Charge Card) ซื้อสินค้าต้องมีเงินคงเหลือในบัญชีและเมื่อซื้อสินค้าก็จะตัดวงเงินจากบัญชีโดยทันที  ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson9);
        addQuestion(q125);
        Question q126 = new Question("การชำระเงินผ่าน PayPal ทั้งผู้ซื้อและผู้จำหน่ายจำเป็นต้องมีบัญชีของ PayPal ทั้งคู่แต่ผู้ซื้อไม่ต้องเปิดเผยข้อมูลบัตรเครดิตให้แก่ผู้จำหน่ายทราบ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson9);
        addQuestion(q126);
        Question q127 = new Question("Digital Certificate คือ การจดทะเบียนใบรับรองดิจิตอลเพื่อยืนยันตัวตนของผู้เป็นเจ้าของเว็บไซต์สร้างความน่าเชื่อถือ และ ความไว้วางใจว่าเว็บไซต์นี้ปลอดภัย  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson9);
        addQuestion(q127);

        //บทที่10
        Question q128 = new Question("Sniffing คือ การปลอมเป็นบริษัทที่น่าเชื่อถือแล้วส่งข้อมูลมาหลอกเหยื่อให้กรอกข้อมูล สำคัญ ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson10);
        addQuestion(q128);
        Question q129 = new Question("Phishing คือ การคักอ่านข้อมูลที่ล่งผ่านเครือข่าย จะได้นำข้อมูลนั้นกลับมาโจมดีระบบ ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson10);
        addQuestion(q129);
        Question q130 = new Question("Spyware คือ รพ ที่แอบผิงตัวอยู่ในเครื่องแล้วพยายามทำพฤติกรรมที่ไม่พึงประสงค์เช่น ลงโฆษณาที่สร้างความรำคาญ  ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson10);
        addQuestion(q130);
        Question q131 = new Question("Malware เป็น รพ ที่คล้ายกับ spyware คือ สร้างความรำคาญไม่ได้สร้างความเสียหายใด กับระบบคอมพิวเตอร์ ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson10);
        addQuestion(q131);
        Question q132 = new Question("ไวรัส เป็นโปรแกรมที่ออกแบบมาเพื่อทำลายระบบคอมพิวเตอร์ แต่มันไม่สามารถ แพร่กระจายไปได้ด้วยตนเอง ต้องมีโปรแกรมอื่น หรือ มนุษย์เป็นผู้กระทำ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson10);
        addQuestion(q132);
        Question q133 = new Question("Worm ไม่ต้องอาศัยมนุษย์ในการแพร่กระจายตัว สามารถแพร่กระจายได้เองโดยอัตโนมัติ จากโปรแกรมที่รับล่งไฟล์กัน ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson10);
        addQuestion(q133);
        Question q134 = new Question("ม้าโทรจันเป็นโปรแกรมที่ถูกออกแบบมาให้แฝงตัวเข้าไปในระบบและทำการโจมดีสร้าง ความเสียหายให้กับระบบ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson10);
        addQuestion(q134);
        Question q135 = new Question("Spam email คือ พวกอีเมลขยะ ล่งถึงผู้รับโดยไม่สนใจว่าเขาต้องการหรือไม่จนรบกวน ผู้รับอีเมล ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson10);
        addQuestion(q135);
        Question q136 = new Question("Denial of Service คือ การทำให้คอมพิวเตอร์ในระบบเครือข่ายล่มโดยตั้งใจ ",
                "ถูก",
                "ผิด",
                1,
                Question.DIFFICULTY_Lesson10);
        addQuestion(q136);
        Question q137 = new Question("หลัก 20 : 20 : 20 คือ พัก 20 นาที หลังจากทำงานไป 20 นาทีโดยมองไปไกล 20 ฟุต ",
                "ถูก",
                "ผิด",
                2,
                Question.DIFFICULTY_Lesson10);
        addQuestion(q137);









    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionsTable.COLUMN_DIFFICULTY, question.getDifficulty());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }

    public ArrayList<Question> getQuestions(String difficulty) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] selectionArgs = new String[]{difficulty};
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME +
                " WHERE " + QuestionsTable.COLUMN_DIFFICULTY + " = ?", selectionArgs);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}