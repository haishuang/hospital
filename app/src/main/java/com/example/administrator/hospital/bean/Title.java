package com.example.administrator.hospital.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/10/18.
 */

public class Title extends Answer{

    /**
     * ID : 1
     * TITLE : 一、您对医院工作环境的评价
     * PARENTID : 0
     * MASTERID : 1
     * NUMBER : 1.0
     * ISANSWER : false
     * TITLE_END :
     * ISINPUT : false
     * INPUTTYPE :
     * CODE : 一
     * JUMP_CODE :
     * REMOVE_CODE :
     * SCORE : 0.0
     * RecordCount : 0
     * IsCreate : false
     * IsUpdate : false
     * IsDelete : false
     * Level : 0
     * InvestigatorId : 0
     * Score : 0.0
     * TitleInfo : 一、您对医院工作环境的评价
     * IsCheck : false
     */

//    private int ID;
//    private String TITLE;
//    private int PARENTID;
//    private int MASTERID;
//    private double NUMBER;
//    private boolean ISANSWER;
//    private String TITLE_END;
//    private boolean ISINPUT;
//    private String INPUTTYPE;
//    private String CODE;
//    private String JUMP_CODE;
//    private String REMOVE_CODE;
//    private double SCORE;
//    private int RecordCount;
//    private boolean IsCreate;
//    private boolean IsUpdate;
//    private boolean IsDelete;
//    private int Level;
//    private int InvestigatorId;
//    private double Score;
//    private String TitleInfo;
//    private boolean IsCheck;
    private List<Answer> answerList;

//    public int getID() {
//        return ID;
//    }
//
//    public void setID(int ID) {
//        this.ID = ID;
//    }
//
//    public String getTITLE() {
//        return TITLE;
//    }
//
//    public void setTITLE(String TITLE) {
//        this.TITLE = TITLE;
//    }
//
//    public int getPARENTID() {
//        return PARENTID;
//    }
//
//    public void setPARENTID(int PARENTID) {
//        this.PARENTID = PARENTID;
//    }
//
//    public int getMASTERID() {
//        return MASTERID;
//    }
//
//    public void setMASTERID(int MASTERID) {
//        this.MASTERID = MASTERID;
//    }
//
//    public double getNUMBER() {
//        return NUMBER;
//    }
//
//    public void setNUMBER(double NUMBER) {
//        this.NUMBER = NUMBER;
//    }
//
//    public boolean ISANSWER() {
//        return ISANSWER;
//    }
//
//    public void setISANSWER(boolean ISANSWER) {
//        this.ISANSWER = ISANSWER;
//    }
//
//    public String getTITLE_END() {
//        return TITLE_END;
//    }
//
//    public void setTITLE_END(String TITLE_END) {
//        this.TITLE_END = TITLE_END;
//    }
//
//    public boolean ISINPUT() {
//        return ISINPUT;
//    }
//
//    public void setISINPUT(boolean ISINPUT) {
//        this.ISINPUT = ISINPUT;
//    }
//
//    public String getINPUTTYPE() {
//        return INPUTTYPE;
//    }
//
//    public void setINPUTTYPE(String INPUTTYPE) {
//        this.INPUTTYPE = INPUTTYPE;
//    }
//
//    public String getCODE() {
//        return CODE;
//    }
//
//    public void setCODE(String CODE) {
//        this.CODE = CODE;
//    }
//
//    public String getJUMP_CODE() {
//        return JUMP_CODE;
//    }
//
//    public void setJUMP_CODE(String JUMP_CODE) {
//        this.JUMP_CODE = JUMP_CODE;
//    }
//
//    public String getREMOVE_CODE() {
//        return REMOVE_CODE;
//    }
//
//    public void setREMOVE_CODE(String REMOVE_CODE) {
//        this.REMOVE_CODE = REMOVE_CODE;
//    }
//
//    public double getSCORE() {
//        return SCORE;
//    }
//
//    public void setSCORE(double SCORE) {
//        this.SCORE = SCORE;
//    }
//
//    public int getRecordCount() {
//        return RecordCount;
//    }
//
//    public void setRecordCount(int recordCount) {
//        RecordCount = recordCount;
//    }
//
//    public boolean isCreate() {
//        return IsCreate;
//    }
//
//    public void setCreate(boolean create) {
//        IsCreate = create;
//    }
//
//    public boolean isUpdate() {
//        return IsUpdate;
//    }
//
//    public void setUpdate(boolean update) {
//        IsUpdate = update;
//    }
//
//    public boolean isDelete() {
//        return IsDelete;
//    }
//
//    public void setDelete(boolean delete) {
//        IsDelete = delete;
//    }
//
//    public int getLevel() {
//        return Level;
//    }
//
//    public void setLevel(int level) {
//        Level = level;
//    }
//
//    public int getInvestigatorId() {
//        return InvestigatorId;
//    }
//
//    public void setInvestigatorId(int investigatorId) {
//        InvestigatorId = investigatorId;
//    }
//
//    public double getScore() {
//        return Score;
//    }
//
//    public void setScore(double score) {
//        Score = score;
//    }
//
//    public String getTitleInfo() {
//        return TitleInfo;
//    }
//
//    public void setTitleInfo(String titleInfo) {
//        TitleInfo = titleInfo;
//    }
//
//    public boolean isCheck() {
//        return IsCheck;
//    }
//
//    public void setCheck(boolean check) {
//        IsCheck = check;
//    }
//
    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }
}
