package com.company;

public class EmployeesEducation {
    private int year;
    private int vosCount;
    private int vsCount;
    private int usoCount;
    private int zakCount;
    private int soCount;
    private int vovCount;

    public EmployeesEducation(int year, int vosCount, int vsCount, int usoCount, int zakCount, int soCount, int vovCount) {
        this.year = year;
        this.vosCount = vosCount;
        this.vsCount = vsCount;
        this.usoCount = usoCount;
        this.zakCount = zakCount;
        this.soCount = soCount;
        this.vovCount = vovCount;
    }

    public EmployeesEducation(int year) {
        this.year = year;
        this.vosCount = 0;
        this.vsCount = 0;
        this.usoCount = 0;
        this.zakCount = 0;
        this.soCount = 0;
        this.vovCount = 0;
    }

    public double getRatio(String s){
        int count = 0;
        if (s.compareTo("VOS")==0){
            count = this.getVosCount();
        }
        if (s.compareTo("VS")==0){
            count = this.getVsCount();
        }
        if (s.compareTo("USO")==0){
            count = this.getUsoCount();
        }
        if (s.compareTo("ZAK")==0){
            count = this.getZakCount();
        }
        if (s.compareTo("SO")==0){
            count = this.getSoCount();
        }
        if (s.compareTo("VOV")==0){
            count = this.getVovCount();
        }
        return 1.0 * count/getAllCount();
    }

    @Override
    public String toString() {
        return "EmployeesEducation{" +
                "year=" + year +
                ", vosCount=" + vosCount +
                ", vsCount=" + vsCount +
                ", usoCount=" + usoCount +
                ", zakCount=" + zakCount +
                ", soCount=" + soCount +
                ", vovCount=" + vovCount +
                '}';
    }

    public String toRatioString() {
        return "EmployeesEducation{" +
                "year=" + year +
                ", vosRatio=" + getRatio("VOS") +
                ", vsRatio=" + getRatio("VS") +
                ", usoRatio=" + getRatio("USO") +
                ", zakRatio=" + getRatio("ZAK") +
                ", soRatio=" + getRatio("SO") +
                ", vovRatio=" + getRatio("VOV") +
                '}';
    }

    public int getAllCount(){
        return getSoCount() + getUsoCount() + getVosCount() + getVovCount() + getVsCount() + getZakCount();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVosCount() {
        return vosCount;
    }

    public void setVosCount(int vosCount) {
        this.vosCount = vosCount;
    }

    public int getVsCount() {
        return vsCount;
    }

    public void setVsCount(int vsCount) {
        this.vsCount = vsCount;
    }

    public int getUsoCount() {
        return usoCount;
    }

    public void setUsoCount(int usoCount) {
        this.usoCount = usoCount;
    }

    public int getZakCount() {
        return zakCount;
    }

    public void setZakCount(int zakCount) {
        this.zakCount = zakCount;
    }

    public int getSoCount() {
        return soCount;
    }

    public void setSoCount(int soCount) {
        this.soCount = soCount;
    }

    public int getVovCount() {
        return vovCount;
    }

    public void setVovCount(int vovCount) {
        this.vovCount = vovCount;
    }
}
