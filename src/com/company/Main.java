package com.company;

public class Main {

    public static void main(String[] args) {
	    String data = "rok,dosazene_vzdelani_kod,dosazene_vzdelani,pocet_zamestnancu_cssz\n" +
                "2006,SO,Střední odborné vzdělání,615\n" +
                "2006,USO,Úplné střední odborné vzdělání,6212\n" +
                "2006,VS,Vysokoškolské vzdělání,1520\n" +
                "2006,ZAK,Základní vzdělání,174\n" +
                "2007,SO,Střední odborné vzdělání,614\n" +
                "2007,USO,Úplné střední odborné vzdělání,5976\n" +
                "2007,VOV,Vyšší odborné vzdělání,214\n" +
                "2007,VS,Vysokoškolské vzdělání,1502\n" +
                "2007,ZAK,Základní vzdělání,173\n" +
                "2008,SO,Střední odborné vzdělání,567\n" +
                "2008,USO,Úplné střední odborné vzdělání,5793\n" +
                "2008,VOV,Vyšší odborné vzdělání,197\n" +
                "2008,VS,Vysokoškolské vzdělání,1499\n" +
                "2008,ZAK,Základní vzdělání,163\n" +
                "2009,SO,Střední odborné vzdělání,559\n" +
                "2009,USO,Úplné střední odborné vzdělání,6265\n" +
                "2009,VOV,Vyšší odborné vzdělání,206\n" +
                "2009,VS,Vysokoškolské vzdělání,1731\n" +
                "2009,ZAK,Základní vzdělání,145\n" +
                "2010,SO,Střední odborné vzdělání,525\n" +
                "2010,USO,Úplné střední odborné vzdělání,6069\n" +
                "2010,VOV,Vyšší odborné vzdělání,207\n" +
                "2010,VS,Vysokoškolské vzdělání,1904\n" +
                "2010,ZAK,Základní vzdělání,144\n" +
                "2011,SO,Střední odborné vzdělání,490\n" +
                "2011,USO,Úplné střední odborné vzdělání,5953\n" +
                "2011,VOV,Vyšší odborné vzdělání,206\n" +
                "2011,VS,Vysokoškolské vzdělání,1992\n" +
                "2011,ZAK,Základní vzdělání,131\n" +
                "2012,SO,Střední odborné vzdělání,466\n" +
                "2012,USO,Úplné střední odborné vzdělání,5891\n" +
                "2012,VOV,Vyšší odborné vzdělání,194\n" +
                "2012,VS,Vysokoškolské vzdělání,2153\n" +
                "2012,ZAK,Základní vzdělání,123\n" +
                "2013,SO,Střední odborné vzdělání,454\n" +
                "2013,USO,Úplné střední odborné vzdělání,5816\n" +
                "2013,VOV,Vyšší odborné vzdělání,211\n" +
                "2013,VS,Vysokoškolské vzdělání,2268\n" +
                "2013,ZAK,Základní vzdělání,118\n" +
                "2014,SO,Střední odborné vzdělání,440\n" +
                "2014,USO,Úplné střední odborné vzdělání,5784\n" +
                "2014,VOV,Vyšší odborné vzdělání,228\n" +
                "2014,VS,Vysokoškolské vzdělání,2378\n" +
                "2014,ZAK,Základní vzdělání,118\n" +
                "2015,SO,Střední odborné vzdělání,419\n" +
                "2015,USO,Úplné střední odborné vzdělání,5544\n" +
                "2015,VOV,Vyšší odborné vzdělání,226\n" +
                "2015,VS,Vysokoškolské vzdělání,2399\n" +
                "2015,ZAK,Základní vzdělání,102\n" +
                "2016,SO,Střední odborné vzdělání,389\n" +
                "2016,USO,Úplné střední odborné vzdělání,5409\n" +
                "2016,VOV,Vyšší odborné vzdělání,231\n" +
                "2016,VS,Vysokoškolské vzdělání,2407\n" +
                "2016,ZAK,Základní vzdělání,89\n" +
                "2017,SO,Střední odborné vzdělání,354\n" +
                "2017,USO,Úplné střední odborné vzdělání,5436\n" +
                "2017,VOV,Vyšší odborné vzdělání,238\n" +
                "2017,VS,Vysokoškolské vzdělání,2458\n" +
                "2017,ZAK,Základní vzdělání,80\n" +
                "2018,SO,Střední odborné vzdělání,340\n" +
                "2018,USO,Úplné střední odborné vzdělání,5489\n" +
                "2018,VOV,Vyšší odborné vzdělání,249\n" +
                "2018,VS,Vysokoškolské vzdělání,2572\n" +
                "2018,ZAK,Základní vzdělání,71\n" +
                "2019,SO,Střední odborné vzdělání,332\n" +
                "2019,USO,Úplné střední odborné vzdělání,5397\n" +
                "2019,VOV,Vyšší odborné vzdělání,259\n" +
                "2019,VS,Vysokoškolské vzdělání,2578\n" +
                "2019,ZAK,Základní vzdělání,68\n" +
                "2020,SO,Střední odborné vzdělání,309\n" +
                "2020,USO,Úplné střední odborné vzdělání,5393\n" +
                "2020,VOV,Vyšší odborné vzdělání,269\n" +
                "2020,VS,Vysokoškolské vzdělání,2614\n" +
                "2020,ZAK,Základní vzdělání,59\n";

	    EmployeesEducation ee2006 = new EmployeesEducation(2006);
        EmployeesEducation ee2007 = new EmployeesEducation(2007);
        EmployeesEducation ee2008 = new EmployeesEducation(2008);
        EmployeesEducation ee2009 = new EmployeesEducation(2009);
        EmployeesEducation ee2010 = new EmployeesEducation(2010);
        EmployeesEducation ee2011 = new EmployeesEducation(2011);
        EmployeesEducation ee2012 = new EmployeesEducation(2012);
        EmployeesEducation ee2013 = new EmployeesEducation(2013);
        EmployeesEducation ee2014 = new EmployeesEducation(2014);
        EmployeesEducation ee2015 = new EmployeesEducation(2015);
        EmployeesEducation ee2016 = new EmployeesEducation(2016);
        EmployeesEducation ee2017 = new EmployeesEducation(2017);
        EmployeesEducation ee2018 = new EmployeesEducation(2018);
        EmployeesEducation ee2019 = new EmployeesEducation(2019);
        EmployeesEducation ee2020 = new EmployeesEducation(2020);

        String[] lines = data.split("\n");
        //System.out.println(lines[1]);

        for (int i = 1; i < lines.length; i++) {
            String[] words = lines[i].split(",");
            //System.out.println(words[3]);
            if (words[0].compareTo("2006")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2006.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2006.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2006.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2006.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2006.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2006.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2007")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2007.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2007.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2007.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2007.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2007.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2007.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2008")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2008.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2008.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2008.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2008.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2008.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2008.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2009")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2009.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2009.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2009.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2009.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2009.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2009.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2010")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2010.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2010.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2010.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2010.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2010.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2010.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2011")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2011.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2011.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2011.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2011.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2011.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2011.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2012")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2012.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2012.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2012.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2012.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2012.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2012.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2013")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2013.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2013.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2013.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2013.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2013.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2013.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2014")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2014.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2014.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2014.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2014.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2014.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2014.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2015")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2015.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2015.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2015.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2015.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2015.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2015.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2016")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2016.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2016.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2016.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2016.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2016.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2016.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2017")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2017.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2017.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2017.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2017.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2017.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2017.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2018")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2018.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2018.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2018.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2018.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2018.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2018.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2019")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2019.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2019.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2019.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2019.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2019.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2019.setVovCount(Integer.parseInt(words[3]));
                }
            }
            if (words[0].compareTo("2020")==0){
                if (words[1].compareTo("VOS")==0){
                    ee2020.setVosCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VS")==0){
                    ee2020.setVsCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("USO")==0){
                    ee2020.setUsoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("ZAK")==0){
                    ee2020.setZakCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("SO")==0){
                    ee2020.setSoCount(Integer.parseInt(words[3]));
                }
                if (words[1].compareTo("VOV")==0){
                    ee2020.setVovCount(Integer.parseInt(words[3]));
                }
            }
        }
        System.out.println(ee2006.toString());
        System.out.println(ee2006.toRatioString());
        System.out.println(ee2006.getRatio("VOS"));
    }
}
