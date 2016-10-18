package com.example.administrator.hospital;

import android.content.Context;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.example.administrator.hospital.bean.Answer;
import com.example.administrator.hospital.bean.B1;
import com.example.administrator.hospital.bean.B2;
import com.example.administrator.hospital.bean.Title;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            String path = Environment.getExternalStorageDirectory() + "/aa/";//将文件放到aa目录下
            File file = new File(path, "myAnswerData.txt");

            if (file.exists()) {
                Log.e("TAG", "文件存在");
                BufferedReader br = null;
                StringBuffer sb = new StringBuffer();
                try {
                    br = new BufferedReader(new FileReader(file));
                    String readline = "";

                    while ((readline = br.readLine()) != null) {
                        System.out.println("readline:" + readline);
                        sb.append(readline);
                    }
                    br.close();
                    Log.e("TAG", "读取成功：" + sb.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                String content = "";
                if (TextUtils.isEmpty(content = sb.toString())) {
                    return;
                }

                content = content.substring(content.lastIndexOf("["));

                Log.e("TAG", "获取内容：" + content);

                List<Title> titles = new Gson().fromJson(content, new TypeToken<LinkedList<Title>>() {
                }.getType());

                List<Title> list = new ArrayList<>();
                List<Answer> answers = null;

//                List<B1> b1s = new ArrayList<>();
//                List<B2> b2s = new ArrayList<>();
//                List<B2> b3s = new ArrayList<>();
//                b2s.add(new B2(1,0));
//                b2s.add(new B2(2,1));
//                b2s.add(new B2(3,2));
//                b2s.add(new B2(4,2));
//                b2s.add(new B2(5,2));
//
//                b2s.add(new B2(6,1));
//                b2s.add(new B2(7,2));
//                b2s.add(new B2(8,2));
//                b2s.add(new B2(9,2));
//
//                b2s.add(new B2(10,1));
//                b2s.add(new B2(11,2));
//                b2s.add(new B2(12,2));
//                b2s.add(new B2(13,2));
//
//                b2s.add(new B2(14,0));
//                b2s.add(new B2(15,1));
//                b2s.add(new B2(16,2));
//                b2s.add(new B2(17,2));
//                b2s.add(new B2(18,2));
//
//                b2s.add(new B2(19,1));
//                b2s.add(new B2(20,2));
//                b2s.add(new B2(21,2));
//                b2s.add(new B2(22,2));
//
//                for(B2 b2:b2s){
//                    if(b2.getLevel()==0||b2.getLevel()==1){
//                        if(b3s.size()>0){
//                            b3s.get(list.size()-1).setB1s();
//                        }
//                         b3s.add(b2);
//
//                    }else {
//
//                    }
//                }





                Log.e("TAG", "大小" + titles.size());
                for(int i=0,count = titles.size();i<count;i++){
                    Title title = titles.get(i);
                    if(title.getLevel() == 0 || title.getLevel() == 1){

                        if(i>0){
                            list.get(list.size()-1).setAnswerList(answers);
                            answers=null;
                        }
                        list.add(title);
                    }else {//遇到答案
                        if(answers==null)
                            answers = new ArrayList<>();
                        answers.add(title);
                        if(i==count-1)
                            list.get(list.size()-1).setAnswerList(answers);
                    }

                }

                //验证
                Log.e("TAG", "大小" + list.size());
                for (Title title : list) {
                    Log.e("TAG", "id:"+title.getID()+"   标题：" + title.getTitleInfo() + "   Level：" + title.getLevel());
                    String a = "";
                    if (null!=title.getAnswerList()&&title.getAnswerList().size() > 0) {
                        for (Answer answer : title.getAnswerList()) {
                            a += "id:"+answer.getID()+"   答案标题："+answer.getTitleInfo() + "      Level：" + answer.getLevel() + "\t\t";
                        }
                        Log.e("TAG", "答案：" + a);
                    }
                }


            } else {
                Log.e("TAG", "文件不存在" + path);
                Toast.makeText(mContext, "文件不存在", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(mContext, "sd卡不存在", Toast.LENGTH_SHORT).show();
        }


    }
}
